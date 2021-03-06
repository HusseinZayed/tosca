// Copyright (c) 2016 IBM Corporation.
#ifndef MAPDEF_EXTERN_H_
#define MAPDEF_EXTERN_H_

#include "std/mapdef-extern_sigs.h"

#include <vector>
#include "ts.h"
#include "std/core.h"
#include "std/listdef.h"
#include "std/mapdef_sigs.h"

/**
 * Convert std:vector to a List
 */
template<typename a>
List<a>& VectorToList(tosca::Context& ctx, std::vector<a*>& vector)
{
	List<a>* result = &newNil<a>(ctx);
	for (auto it = vector.begin(); it != vector.end(); it ++)
		result = &newCons<a>(ctx, **it, *result);

	return *result;
}

/**
 * Extend the given map with the given key-value pair.
 * If a entry for the given key already exists in the map, it is shadowed.
 * @param ctx
 * @param map
 * @param key
 * @param value
 * @return
 */
template<typename a, typename b>
tosca::MapTerm<a, b>& MapPut(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key, b& value)
{
    tosca::MapTerm<a, b>& xmap = map.extend(ctx);
    xmap.putValue(ctx, key, value);
    return xmap;
}

/**
 * Add all entries from map2 into map1. Entries in map1 existing in map2 are shadowed.
 * @param ctx
 * @param map1
 * @param map2
 * @return
 */
template<typename a, typename b>
tosca::MapTerm<a, b>& MapAddAll(tosca::Context& ctx, tosca::MapTerm<a, b>& map1, tosca::MapTerm<a, b>& map2)
{
    tosca::MapTerm<a, b>& xmap = map1.extend(ctx);
    xmap.putAll(ctx, map2);
    return xmap;
}

/**
 * Lookup entry for given key.
 * @param ctx
 * @param map
 * @param key
 * @return
 */
template<typename a, typename b>
Option<b>& MapGet(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key)
{
   Option<b>& result = map.getValue(ctx, key);
   key.Release();
   map.Release();
   return result;
}

/**
 * Extend the given map with the given key-value pair, where key is a syntactic variable
 * If a entry for the given key already exists in the map, it is shadowed.
 * @param ctx
 * @param map
 * @param varuse
 * @param value
 * @return
 */
template<typename a, typename b>
tosca::MapTerm<a, b>& MapPutVar(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key, b& value)
{
    auto v = key.variable();
    if (v)
        return MapPut(ctx, map, key, value);
    
    throw std::runtime_error("Invalid MapPutVar key. Excepted a variable use, but instead got :"); //+ key.toString()
}

template<typename a, typename b>
Option<b>& MapGetVar(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key)
{
    auto v = key.GetVariable();
    if (v)
        return MapGet(ctx, map, key);

    throw std::runtime_error("Invalid MapPutVar key. Excepted a variable use, but instead got :"); // + key.toString()
}

/**
 * Gets list of keys, excluding variable keys
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
List<a>& MapKeys(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
	std::vector<a*> vkeys = map.keys(ctx);
    List<a>& keys = VectorToList<a>(ctx, vkeys);
    map.Release();
    return keys;
}

template<typename a, typename b, typename c>
List<c>& MapVarKeys(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
	List<c>& keys = map.varKeys(ctx);
    map.Release();
    return keys;
}

/**
 * Create new empty map
 * @param ctx
 * @param tma
 * @param tmb
 * @return
 */
template<typename a, typename b>
tosca::MapTerm<a, b>& MapNew(tosca::Context& ctx)
{
    return tosca::newMapTerm<a, b>(ctx);
}

/**
 * Gets list of values, excluding variable values
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
List<b>& MapValues(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
	std::vector<b*> vvalues = map.values(ctx);
    List<b>& values = VectorToList<b>(ctx, vvalues);
    map.Release();
    return values;
}

/**
 * Gets list of variable values
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
List<b>& MapVarValues(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
    List<b>& values = map.varValues(ctx);
    map.Release();
    return values;
}

/**
 * Return true if the given map is empty
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
Bool& MapIsEmpty(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
    tosca::MapTerm<a, b>& emap = force(ctx, map);
    Bool& result = emap.isEmpty() ? newTRUE(ctx) : newFALSE(ctx);
    emap.release();
    return result;
}

template<typename a, typename b, typename c>
tosca::MapTerm<a, b>& MapFind(tosca::Context& ctx, c& value)
{
    // TODO:
    return MapNew<a, b>(ctx);
}

// --- Overload.

template <typename a, typename b>
b& MapGetD(tosca::Context& ctx, MapTerm<a,tosca::Term>& map, a& key, b& dvalue)
{
    auto& ovalue = MapGet<a, tosca::Term>(ctx, map, key); // transfer map and key refs
    Optional<_CSOME<tosca::Term>> osome = ovalue.asSOME(ctx);
    if (osome)
    {
    	tosca::Term& result = osome.value().getValue1(ctx, true);
    	result.AddRef();
    	dvalue.Release();
        ovalue.Release();
        return dynamic_cast<b&>(result);
    }
    ovalue.Release();
    return dvalue;
}

template <typename a, typename b>
b& MapGetE(tosca::Context& ctx, MapTerm<a,tosca::Term>& map, a& key)
{
    auto& ovalue = MapGet<a, tosca::Term>(ctx, map, key);
    Optional<_CSOME<tosca::Term>> osome = ovalue.asSOME(ctx);
    if (osome)
    {
        tosca::Term& result = osome.value().getValue1(ctx, true);
        result.AddRef();
        ovalue.Release();
        return dynamic_cast<b&>(result);
    }
    std::string s(key.Symbol().c_str());
    s += " not found.";
    throw new std::runtime_error(s);
}


#endif
