/* START MODULE parser/Crsx.crs.java */
/** Generated File */package org.crsx.compiler.parser;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.std.Text.*;
import static org.crsx.compiler.std.Core.*; import static org.crsx.compiler.std.List.*;

public class Crsx
{
  final public static ConstructionDescriptor _M_Crsx_xdirectiveList = makeData("Crsx_directiveList");
  final public static ConstructionDescriptor _M_Crsx_xdirectives_xS1 = makeData("Crsx_directives_S1");
  final public static ConstructionDescriptor _M_Crsx_xdirectives = makeData("Crsx_directives");
  final public static ConstructionDescriptor _M_Crsx_xdirectiveArguments = makeData("Crsx_directiveArguments");
  final public static ConstructionDescriptor _M_Crsx_xdirective_xA1 = makeData("Crsx_directive_A1");
  final public static ConstructionDescriptor _M_Crsx_xdirective_xA2 = makeData("Crsx_directive_A2");
  final public static ConstructionDescriptor _M_Crsx_xdirective_xA3 = makeData("Crsx_directive_A3");
  final public static ConstructionDescriptor _M_Crsx_xdirective_xA4 = makeData("Crsx_directive_A4");
  final public static ConstructionDescriptor _M_Crsx_xreserved_xA1 = makeData("Crsx_reserved_A1");
  final public static ConstructionDescriptor _M_Crsx_xreserved_xA2 = makeData("Crsx_reserved_A2");
  final public static ConstructionDescriptor _M_Crsx_xqualifier_xA1 = makeData("Crsx_qualifier_A1");
  final public static ConstructionDescriptor _M_Crsx_xqualifier_xA2 = makeData("Crsx_qualifier_A2");
  final public static ConstructionDescriptor _M_Crsx_xconstructor_xA1 = makeData("Crsx_constructor_A1");
  final public static ConstructionDescriptor _M_Crsx_xconstructor_xA2 = makeData("Crsx_constructor_A2");
  final public static ConstructionDescriptor _M_Crsx_xform_xA1 = makeData("Crsx_form_A1");
  final public static ConstructionDescriptor _M_Crsx_xform_xA2 = makeData("Crsx_form_A2");
  final public static ConstructionDescriptor _M_Crsx_xforms_xS1 = makeData("Crsx_forms_S1");
  final public static ConstructionDescriptor _M_Crsx_xforms = makeData("Crsx_forms");
  final public static ConstructionDescriptor _M_Crsx_xsortarguments = makeData("Crsx_sortarguments");
  final public static ConstructionDescriptor _M_Crsx_xsortname_xA1 = makeData("Crsx_sortname_A1");
  final public static ConstructionDescriptor _M_Crsx_xsortname_xA2 = makeData("Crsx_sortname_A2");
  final public static ConstructionDescriptor _M_Crsx_xsortnames_xS1 = makeData("Crsx_sortnames_S1");
  final public static ConstructionDescriptor _M_Crsx_xsortnames = makeData("Crsx_sortnames");
  final public static ConstructionDescriptor _M_Crsx_xsortset = makeData("Crsx_sortset");
  final public static ConstructionDescriptor _M_Crsx_xsortparams = makeData("Crsx_sortparams");
  final public static ConstructionDescriptor _M_Crsx_xsortDeclaration_xA1 = makeData("Crsx_sortDeclaration_A1");
  final public static ConstructionDescriptor _M_Crsx_xsortDeclaration_xA2 = makeData("Crsx_sortDeclaration_A2");
  final public static ConstructionDescriptor _M_Crsx_xexpression = makeData("Crsx_expression");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA1 = makeData("Crsx_property_A1");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA2 = makeData("Crsx_property_A2");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA3 = makeData("Crsx_property_A3");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA4 = makeData("Crsx_property_A4");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA5 = makeData("Crsx_property_A5");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA6 = makeData("Crsx_property_A6");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA7 = makeData("Crsx_property_A7");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA8 = makeData("Crsx_property_A8");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA9 = makeData("Crsx_property_A9");
  final public static ConstructionDescriptor _M_Crsx_xproperty_xA10 = makeData("Crsx_property_A10");
  final public static ConstructionDescriptor _M_Crsx_xpropertyList_xS1 = makeData("Crsx_propertyList_S1");
  final public static ConstructionDescriptor _M_Crsx_xpropertyList = makeData("Crsx_propertyList");
  final public static ConstructionDescriptor _M_Crsx_xproperties = makeData("Crsx_properties");
  final public static ConstructionDescriptor _M_Crsx_xdelayCase = makeData("Crsx_delayCase");
  final public static ConstructionDescriptor _M_Crsx_xdispatchCase = makeData("Crsx_dispatchCase");
  final public static ConstructionDescriptor _M_Crsx_xdispatchCases_xS1 = makeData("Crsx_dispatchCases_S1");
  final public static ConstructionDescriptor _M_Crsx_xdispatchCases = makeData("Crsx_dispatchCases");
  final public static ConstructionDescriptor _M_Crsx_xdispatchTerm = makeData("Crsx_dispatchTerm");
  final public static ConstructionDescriptor _M_Crsx_xdispatch = makeData("Crsx_dispatch");
  final public static ConstructionDescriptor _M_Crsx_xconcrete_xA1 = makeData("Crsx_concrete_A1");
  final public static ConstructionDescriptor _M_Crsx_xconcrete_xA2 = makeData("Crsx_concrete_A2");
  final public static ConstructionDescriptor _M_Crsx_xconcrete_xA3 = makeData("Crsx_concrete_A3");
  final public static ConstructionDescriptor _M_Crsx_xconcrete_xA4 = makeData("Crsx_concrete_A4");
  final public static ConstructionDescriptor _M_Crsx_xvarsort = makeData("Crsx_varsort");
  final public static ConstructionDescriptor _M_Crsx_xbinder = makeData("Crsx_binder");
  final public static ConstructionDescriptor _M_Crsx_xliteral_xA1 = makeData("Crsx_literal_A1");
  final public static ConstructionDescriptor _M_Crsx_xliteral_xA2 = makeData("Crsx_literal_A2");
  final public static ConstructionDescriptor _M_Crsx_xfunctional = makeData("Crsx_functional");
  final public static ConstructionDescriptor _M_Crsx_xlinear = makeData("Crsx_linear");
  final public static ConstructionDescriptor _M_Crsx_xvariable = makeData("Crsx_variable");
  final public static ConstructionDescriptor _M_Crsx_xtermList_xS1 = makeData("Crsx_termList_S1");
  final public static ConstructionDescriptor _M_Crsx_xtermList = makeData("Crsx_termList");
  final public static ConstructionDescriptor _M_Crsx_xlist = makeData("Crsx_list");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerms_xS1 = makeData("Crsx_freeTerms_S1");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerms = makeData("Crsx_freeTerms");
  final public static ConstructionDescriptor _M_Crsx_xfreeArguments = makeData("Crsx_freeArguments");
  final public static ConstructionDescriptor _M_Crsx_xterms_xS1 = makeData("Crsx_terms_S1");
  final public static ConstructionDescriptor _M_Crsx_xterms = makeData("Crsx_terms");
  final public static ConstructionDescriptor _M_Crsx_xarguments = makeData("Crsx_arguments");
  final public static ConstructionDescriptor _M_Crsx_xnextBinder_xA1 = makeData("Crsx_nextBinder_A1");
  final public static ConstructionDescriptor _M_Crsx_xnextBinder_xA2 = makeData("Crsx_nextBinder_A2");
  final public static ConstructionDescriptor _M_Crsx_xboundTerm = makeData("Crsx_boundTerm");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerm_xA1 = makeData("Crsx_freeTerm_A1");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerm_xA2 = makeData("Crsx_freeTerm_A2");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerm_xA3 = makeData("Crsx_freeTerm_A3");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerm_xA4 = makeData("Crsx_freeTerm_A4");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerm_xA5 = makeData("Crsx_freeTerm_A5");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerm_xA6 = makeData("Crsx_freeTerm_A6");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerm_xA7 = makeData("Crsx_freeTerm_A7");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerm_xA8 = makeData("Crsx_freeTerm_A8");
  final public static ConstructionDescriptor _M_Crsx_xfreeTerm_xA9 = makeData("Crsx_freeTerm_A9");
  final public static ConstructionDescriptor _M_Crsx_xterm_xA1 = makeData("Crsx_term_A1");
  final public static ConstructionDescriptor _M_Crsx_xterm_xA2 = makeData("Crsx_term_A2");
  final public static ConstructionDescriptor _M_Crsx_xannotation = makeData("Crsx_annotation");
  final public static ConstructionDescriptor _M_Crsx_xannotations = makeData("Crsx_annotations");
  final public static ConstructionDescriptor _M_Crsx_xcontractum = makeData("Crsx_contractum");
  final public static ConstructionDescriptor _M_Crsx_xpattern = makeData("Crsx_pattern");
  final public static ConstructionDescriptor _M_Crsx_xoption_xA1 = makeData("Crsx_option_A1");
  final public static ConstructionDescriptor _M_Crsx_xoption_xA2 = makeData("Crsx_option_A2");
  final public static ConstructionDescriptor _M_Crsx_xruleDeclaration = makeData("Crsx_ruleDeclaration");
  final public static ConstructionDescriptor _M_Crsx_ximportDeclaration_xA1 = makeData("Crsx_importDeclaration_A1");
  final public static ConstructionDescriptor _M_Crsx_ximportDeclaration_xA2 = makeData("Crsx_importDeclaration_A2");
  final public static ConstructionDescriptor _M_Crsx_ximportDeclaration_xA3 = makeData("Crsx_importDeclaration_A3");
  final public static ConstructionDescriptor _M_Crsx_xmoduleDeclaration = makeData("Crsx_moduleDeclaration");
  final public static ConstructionDescriptor _M_Crsx_xdeclaration_xA1 = makeData("Crsx_declaration_A1");
  final public static ConstructionDescriptor _M_Crsx_xdeclaration_xA2 = makeData("Crsx_declaration_A2");
  final public static ConstructionDescriptor _M_Crsx_xdeclaration_xA3 = makeData("Crsx_declaration_A3");
  final public static ConstructionDescriptor _M_Crsx_xdeclaration_xA4 = makeData("Crsx_declaration_A4");
  final public static ConstructionDescriptor _M_Crsx_xdeclaration_xA5 = makeData("Crsx_declaration_A5");
  final public static ConstructionDescriptor _M_Crsx_xdeclarations_xS1 = makeData("Crsx_declarations_S1");
  final public static ConstructionDescriptor _M_Crsx_xdeclarations = makeData("Crsx_declarations");
  final public static ConstructionDescriptor _M_Crsx_xcrsx = makeData("Crsx_crsx");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdirectiveList = makeFunction("Crsx_Print_directiveList", Crsx.class, "_M_Crsx_xPrint_xdirectiveList");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdirectives_xS1 = makeFunction("Crsx_Print_directives_S1", Crsx.class, "_M_Crsx_xPrint_xdirectives_xS1");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdirectives = makeFunction("Crsx_Print_directives", Crsx.class, "_M_Crsx_xPrint_xdirectives");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdirectiveArguments = makeFunction("Crsx_Print_directiveArguments", Crsx.class, "_M_Crsx_xPrint_xdirectiveArguments");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdirective = makeFunction("Crsx_Print_directive", Crsx.class, "_M_Crsx_xPrint_xdirective");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xreserved = makeFunction("Crsx_Print_reserved", Crsx.class, "_M_Crsx_xPrint_xreserved");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xqualifier = makeFunction("Crsx_Print_qualifier", Crsx.class, "_M_Crsx_xPrint_xqualifier");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xconstructor = makeFunction("Crsx_Print_constructor", Crsx.class, "_M_Crsx_xPrint_xconstructor");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xform = makeFunction("Crsx_Print_form", Crsx.class, "_M_Crsx_xPrint_xform");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xforms_xS1 = makeFunction("Crsx_Print_forms_S1", Crsx.class, "_M_Crsx_xPrint_xforms_xS1");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xforms = makeFunction("Crsx_Print_forms", Crsx.class, "_M_Crsx_xPrint_xforms");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xsortarguments = makeFunction("Crsx_Print_sortarguments", Crsx.class, "_M_Crsx_xPrint_xsortarguments");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xsortname = makeFunction("Crsx_Print_sortname", Crsx.class, "_M_Crsx_xPrint_xsortname");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xsortnames_xS1 = makeFunction("Crsx_Print_sortnames_S1", Crsx.class, "_M_Crsx_xPrint_xsortnames_xS1");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xsortnames = makeFunction("Crsx_Print_sortnames", Crsx.class, "_M_Crsx_xPrint_xsortnames");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xsortset = makeFunction("Crsx_Print_sortset", Crsx.class, "_M_Crsx_xPrint_xsortset");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xsortparams = makeFunction("Crsx_Print_sortparams", Crsx.class, "_M_Crsx_xPrint_xsortparams");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xsortDeclaration = makeFunction("Crsx_Print_sortDeclaration", Crsx.class, "_M_Crsx_xPrint_xsortDeclaration");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xexpression = makeFunction("Crsx_Print_expression", Crsx.class, "_M_Crsx_xPrint_xexpression");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xproperty = makeFunction("Crsx_Print_property", Crsx.class, "_M_Crsx_xPrint_xproperty");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xpropertyList_xS1 = makeFunction("Crsx_Print_propertyList_S1", Crsx.class, "_M_Crsx_xPrint_xpropertyList_xS1");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xpropertyList = makeFunction("Crsx_Print_propertyList", Crsx.class, "_M_Crsx_xPrint_xpropertyList");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xproperties = makeFunction("Crsx_Print_properties", Crsx.class, "_M_Crsx_xPrint_xproperties");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdelayCase = makeFunction("Crsx_Print_delayCase", Crsx.class, "_M_Crsx_xPrint_xdelayCase");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdispatchCase = makeFunction("Crsx_Print_dispatchCase", Crsx.class, "_M_Crsx_xPrint_xdispatchCase");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdispatchCases_xS1 = makeFunction("Crsx_Print_dispatchCases_S1", Crsx.class, "_M_Crsx_xPrint_xdispatchCases_xS1");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdispatchCases = makeFunction("Crsx_Print_dispatchCases", Crsx.class, "_M_Crsx_xPrint_xdispatchCases");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdispatchTerm = makeFunction("Crsx_Print_dispatchTerm", Crsx.class, "_M_Crsx_xPrint_xdispatchTerm");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdispatch = makeFunction("Crsx_Print_dispatch", Crsx.class, "_M_Crsx_xPrint_xdispatch");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xconcrete = makeFunction("Crsx_Print_concrete", Crsx.class, "_M_Crsx_xPrint_xconcrete");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xvarsort = makeFunction("Crsx_Print_varsort", Crsx.class, "_M_Crsx_xPrint_xvarsort");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xbinder = makeFunction("Crsx_Print_binder", Crsx.class, "_M_Crsx_xPrint_xbinder");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xliteral = makeFunction("Crsx_Print_literal", Crsx.class, "_M_Crsx_xPrint_xliteral");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xfunctional = makeFunction("Crsx_Print_functional", Crsx.class, "_M_Crsx_xPrint_xfunctional");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xlinear = makeFunction("Crsx_Print_linear", Crsx.class, "_M_Crsx_xPrint_xlinear");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xvariable = makeFunction("Crsx_Print_variable", Crsx.class, "_M_Crsx_xPrint_xvariable");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xtermList_xS1 = makeFunction("Crsx_Print_termList_S1", Crsx.class, "_M_Crsx_xPrint_xtermList_xS1");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xtermList = makeFunction("Crsx_Print_termList", Crsx.class, "_M_Crsx_xPrint_xtermList");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xlist = makeFunction("Crsx_Print_list", Crsx.class, "_M_Crsx_xPrint_xlist");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xfreeTerms_xS1 = makeFunction("Crsx_Print_freeTerms_S1", Crsx.class, "_M_Crsx_xPrint_xfreeTerms_xS1");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xfreeTerms = makeFunction("Crsx_Print_freeTerms", Crsx.class, "_M_Crsx_xPrint_xfreeTerms");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xfreeArguments = makeFunction("Crsx_Print_freeArguments", Crsx.class, "_M_Crsx_xPrint_xfreeArguments");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xterms_xS1 = makeFunction("Crsx_Print_terms_S1", Crsx.class, "_M_Crsx_xPrint_xterms_xS1");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xterms = makeFunction("Crsx_Print_terms", Crsx.class, "_M_Crsx_xPrint_xterms");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xarguments = makeFunction("Crsx_Print_arguments", Crsx.class, "_M_Crsx_xPrint_xarguments");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xnextBinder = makeFunction("Crsx_Print_nextBinder", Crsx.class, "_M_Crsx_xPrint_xnextBinder");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xboundTerm = makeFunction("Crsx_Print_boundTerm", Crsx.class, "_M_Crsx_xPrint_xboundTerm");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xfreeTerm = makeFunction("Crsx_Print_freeTerm", Crsx.class, "_M_Crsx_xPrint_xfreeTerm");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xterm = makeFunction("Crsx_Print_term", Crsx.class, "_M_Crsx_xPrint_xterm");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xannotation = makeFunction("Crsx_Print_annotation", Crsx.class, "_M_Crsx_xPrint_xannotation");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xannotations = makeFunction("Crsx_Print_annotations", Crsx.class, "_M_Crsx_xPrint_xannotations");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xcontractum = makeFunction("Crsx_Print_contractum", Crsx.class, "_M_Crsx_xPrint_xcontractum");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xpattern = makeFunction("Crsx_Print_pattern", Crsx.class, "_M_Crsx_xPrint_xpattern");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xoption = makeFunction("Crsx_Print_option", Crsx.class, "_M_Crsx_xPrint_xoption");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xruleDeclaration = makeFunction("Crsx_Print_ruleDeclaration", Crsx.class, "_M_Crsx_xPrint_xruleDeclaration");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_ximportDeclaration = makeFunction("Crsx_Print_importDeclaration", Crsx.class, "_M_Crsx_xPrint_ximportDeclaration");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xmoduleDeclaration = makeFunction("Crsx_Print_moduleDeclaration", Crsx.class, "_M_Crsx_xPrint_xmoduleDeclaration");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdeclaration = makeFunction("Crsx_Print_declaration", Crsx.class, "_M_Crsx_xPrint_xdeclaration");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdeclarations_xS1 = makeFunction("Crsx_Print_declarations_S1", Crsx.class, "_M_Crsx_xPrint_xdeclarations_xS1");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xdeclarations = makeFunction("Crsx_Print_declarations", Crsx.class, "_M_Crsx_xPrint_xdeclarations");
  final public static DynamicFunctionDescriptor _M_Crsx_xPrint_xcrsx = makeFunction("Crsx_Print_crsx", Crsx.class, "_M_Crsx_xPrint_xcrsx");final public static boolean _M_Crsx_xPrint_xdirectiveList(Sink sink, int shared, int depth, Term term) {
    if (depth < 2000) {
      label: {
        if (term.descriptor() != _M_Crsx_xdirectiveList)
        {   break label;
        }Term sub = term.sub(0).ref();
        /* #1=sub */Term sub_41 = term.sub(1).ref();
        /* #2=sub */Term sub_26 = term.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_69;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_69 = buf.term();
        } sink.propertyNamed("$LineLocation", term_69);Term term_49;
        {
          BufferSink buf_74 = sink.context().makeBuffer(); buf_74.start(_M_STRING); buf_74.literal(1); buf_74.end();
          term_49 = buf_74.term();
        } sink.propertyNamed("$ColumnLocation", term_49);
        sink.start(_M__sTextCons);Term term_56;
        {
          BufferSink buf_1 = sink.context().makeBuffer(); buf_1.start(_M_STRING); buf_1.literal(1); buf_1.end();
          term_56 = buf_1.term();
        } sink.propertyNamed("$LineLocation", term_56);Term term_45;
        {
          BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(2); buf_28.end();
          term_45 = buf_28.term();
        } sink.propertyNamed("$ColumnLocation", term_45);
        sink.start(_M__sTextChars); sink.copy(sub.ref());
        sink.end();Term term_59;
        {
          BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(1); buf_81.end();
          term_59 = buf_81.term();
        } sink.propertyNamed("$LineLocation", term_59);Term term_75;
        {
          BufferSink buf_65 = sink.context().makeBuffer(); buf_65.start(_M_STRING); buf_65.literal(3); buf_65.end();
          term_75 = buf_65.term();
        } sink.propertyNamed("$ColumnLocation", term_75);
        sink.start(_M__sTextCons);Term term_51;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
          term_51 = buf_0.term();
        } sink.propertyNamed("$LineLocation", term_51);Term term_4;
        {
          BufferSink buf_70 = sink.context().makeBuffer(); buf_70.start(_M_STRING); buf_70.literal(3); buf_70.end();
          term_4 = buf_70.term();
        } sink.propertyNamed("$ColumnLocation", term_4);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_57;
        {
          BufferSink buf_13 = sink.context().makeBuffer(); buf_13.start(_M_STRING); buf_13.literal(1); buf_13.end();
          term_57 = buf_13.term();
        } sink.propertyNamed("$LineLocation", term_57);Term term_70;
        {
          BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_STRING); buf_85.literal(7); buf_85.end();
          term_70 = buf_85.term();
        } sink.propertyNamed("$ColumnLocation", term_70);
        sink.start(_M__sTextCons);Term term_73;
        {
          BufferSink buf_60 = sink.context().makeBuffer(); buf_60.start(_M_STRING); buf_60.literal(1); buf_60.end();
          term_73 = buf_60.term();
        } sink.propertyNamed("$LineLocation", term_73);Term term_58;
        {
          BufferSink buf_59 = sink.context().makeBuffer(); buf_59.start(_M_STRING); buf_59.literal(7); buf_59.end();
          term_58 = buf_59.term();
        } sink.propertyNamed("$ColumnLocation", term_58);
        sink.start(_M__sTextEmbed);Term term_86;
        {
          BufferSink buf_14 = sink.context().makeBuffer(); buf_14.start(_M_STRING); buf_14.literal(1); buf_14.end();
          term_86 = buf_14.term();
        } sink.propertyNamed("$LineLocation", term_86);Term term_91;
        {
          BufferSink buf_15 = sink.context().makeBuffer(); buf_15.start(_M_STRING); buf_15.literal(7); buf_15.end();
          term_91 = buf_15.term();
        } sink.propertyNamed("$ColumnLocation", term_91);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var});
        sink.start(_M_Crsx_xPrint_xdeclarations); sink.use(var);
        sink.end(); sink.copy(sub_41.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_71;
        {
          BufferSink buf_34 = sink.context().makeBuffer(); buf_34.start(_M_STRING); buf_34.literal(1); buf_34.end();
          term_71 = buf_34.term();
        } sink.propertyNamed("$LineLocation", term_71);Term term_35;
        {
          BufferSink buf_56 = sink.context().makeBuffer(); buf_56.start(_M_STRING); buf_56.literal(60); buf_56.end();
          term_35 = buf_56.term();
        } sink.propertyNamed("$ColumnLocation", term_35);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_22;
        {
          BufferSink buf_63 = sink.context().makeBuffer(); buf_63.start(_M_STRING); buf_63.literal(1); buf_63.end();
          term_22 = buf_63.term();
        } sink.propertyNamed("$LineLocation", term_22);Term term_26;
        {
          BufferSink buf_52 = sink.context().makeBuffer(); buf_52.start(_M_STRING); buf_52.literal(8); buf_52.end();
          term_26 = buf_52.term();
        } sink.propertyNamed("$ColumnLocation", term_26);
        sink.start(_M__sTextCons);Term term_46;
        {
          BufferSink buf_91 = sink.context().makeBuffer(); buf_91.start(_M_STRING); buf_91.literal(1); buf_91.end();
          term_46 = buf_91.term();
        } sink.propertyNamed("$LineLocation", term_46);Term term_12;
        {
          BufferSink buf_78 = sink.context().makeBuffer(); buf_78.start(_M_STRING); buf_78.literal(8); buf_78.end();
          term_12 = buf_78.term();
        } sink.propertyNamed("$ColumnLocation", term_12);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_33;
        {
          BufferSink buf_46 = sink.context().makeBuffer(); buf_46.start(_M_STRING); buf_46.literal(1); buf_46.end();
          term_33 = buf_46.term();
        } sink.propertyNamed("$LineLocation", term_33);Term term_28;
        {
          BufferSink buf_23 = sink.context().makeBuffer(); buf_23.start(_M_STRING); buf_23.literal(64); buf_23.end();
          term_28 = buf_23.term();
        } sink.propertyNamed("$ColumnLocation", term_28);
        sink.start(_M__sTextCons);Term term_37;
        {
          BufferSink buf_51 = sink.context().makeBuffer(); buf_51.start(_M_STRING); buf_51.literal(1); buf_51.end();
          term_37 = buf_51.term();
        } sink.propertyNamed("$LineLocation", term_37);Term term_146;
        {
          BufferSink buf_105 = sink.context().makeBuffer();
          buf_105.start(_M_STRING); buf_105.literal(65);
          buf_105.end();
          term_146 = buf_105.term();
        } sink.propertyNamed("$ColumnLocation", term_146);
        sink.start(_M__sTextChars); sink.copy(sub_26.ref());
        sink.end();Term term_7;
        {
          BufferSink buf_137 = sink.context().makeBuffer(); buf_137.start(_M_STRING); buf_137.literal(1); buf_137.end();
          term_7 = buf_137.term();
        } sink.propertyNamed("$LineLocation", term_7);Term term_21;
        {
          BufferSink buf_79 = sink.context().makeBuffer(); buf_79.start(_M_STRING); buf_79.literal(66); buf_79.end();
          term_21 = buf_79.term();
        } sink.propertyNamed("$ColumnLocation", term_21);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdirectiveList, term);
  } final public static boolean _M_Crsx_xPrint_xdirectives_xS1(Sink sink, int shared, int depth, Term term_103) {
    if (depth < 2000) {
      label_50: {
        if (term_103.descriptor() != _M_Crsx_xdirectives_xS1)
        {   break label_50;
        }Term sub_93 = term_103.sub(0).ref();
        /* #1=sub */Term sub_44 = term_103.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_80;
        {
          BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_STRING); buf_45.literal(1); buf_45.end();
          term_80 = buf_45.term();
        } sink.propertyNamed("$LineLocation", term_80);Term term_72;
        {
          BufferSink buf_96 = sink.context().makeBuffer(); buf_96.start(_M_STRING); buf_96.literal(1); buf_96.end();
          term_72 = buf_96.term();
        } sink.propertyNamed("$ColumnLocation", term_72);
        sink.start(_M__sTextCons);Term term_54;
        {
          BufferSink buf_71 = sink.context().makeBuffer(); buf_71.start(_M_STRING); buf_71.literal(1); buf_71.end();
          term_54 = buf_71.term();
        } sink.propertyNamed("$LineLocation", term_54);Term term_53;
        {
          BufferSink buf_37 = sink.context().makeBuffer(); buf_37.start(_M_STRING); buf_37.literal(2); buf_37.end();
          term_53 = buf_37.term();
        } sink.propertyNamed("$ColumnLocation", term_53);
        sink.start(_M__sTextChars); sink.copy(sub_93.ref());
        sink.end();Term term_127;
        {
          BufferSink buf_67 = sink.context().makeBuffer(); buf_67.start(_M_STRING); buf_67.literal(1); buf_67.end();
          term_127 = buf_67.term();
        } sink.propertyNamed("$LineLocation", term_127);Term term_67;
        {
          BufferSink buf_93 = sink.context().makeBuffer(); buf_93.start(_M_STRING); buf_93.literal(3); buf_93.end();
          term_67 = buf_93.term();
        } sink.propertyNamed("$ColumnLocation", term_67);
        sink.start(_M__sTextCons);Term term_249;
        {
          BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_STRING); buf_19.literal(1); buf_19.end();
          term_249 = buf_19.term();
        } sink.propertyNamed("$LineLocation", term_249);Term term_43;
        {
          BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_STRING); buf_64.literal(3); buf_64.end();
          term_43 = buf_64.term();
        } sink.propertyNamed("$ColumnLocation", term_43);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_3;
        {
          BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_STRING); buf_49.literal(1); buf_49.end();
          term_3 = buf_49.term();
        } sink.propertyNamed("$LineLocation", term_3);Term term_137;
        {
          BufferSink buf_167 = sink.context().makeBuffer(); buf_167.start(_M_STRING); buf_167.literal(7); buf_167.end();
          term_137 = buf_167.term();
        } sink.propertyNamed("$ColumnLocation", term_137);
        sink.start(_M__sTextCons);Term term_267;
        {
          BufferSink buf_38 = sink.context().makeBuffer(); buf_38.start(_M_STRING); buf_38.literal(1); buf_38.end();
          term_267 = buf_38.term();
        } sink.propertyNamed("$LineLocation", term_267);Term term_98;
        {
          BufferSink buf_129 = sink.context().makeBuffer(); buf_129.start(_M_STRING); buf_129.literal(7); buf_129.end();
          term_98 = buf_129.term();
        } sink.propertyNamed("$ColumnLocation", term_98);
        sink.start(_M__sTextEmbed);Term term_65;
        {
          BufferSink buf_48 = sink.context().makeBuffer(); buf_48.start(_M_STRING); buf_48.literal(1); buf_48.end();
          term_65 = buf_48.term();
        } sink.propertyNamed("$LineLocation", term_65);Term term_55;
        {
          BufferSink buf_9 = sink.context().makeBuffer(); buf_9.start(_M_STRING); buf_9.literal(7); buf_9.end();
          term_55 = buf_9.term();
        } sink.propertyNamed("$ColumnLocation", term_55);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdirective); sink.copy(sub_44.ref());
        sink.end();
        sink.end();
        sink.end();Term term_85;
        {
          BufferSink buf_95 = sink.context().makeBuffer(); buf_95.start(_M_STRING); buf_95.literal(1); buf_95.end();
          term_85 = buf_95.term();
        } sink.propertyNamed("$LineLocation", term_85);Term term_32;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(8); buf_8.end();
          term_32 = buf_8.term();
        } sink.propertyNamed("$ColumnLocation", term_32);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdirectives_xS1, term_103);
  } final public static boolean _M_Crsx_xPrint_xdirectives(Sink sink, int shared, int depth, Term term_230) {
    if (depth < 2000) {
      label_4: {
        if (term_230.descriptor() != _M_Crsx_xdirectives)
        {   break label_4;
        }Term sub_48 = term_230.sub(0).ref();
        /* #1=sub */Term sub_66 = term_230.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_182;
        {
          BufferSink buf_73 = sink.context().makeBuffer(); buf_73.start(_M_STRING); buf_73.literal(1); buf_73.end();
          term_182 = buf_73.term();
        } sink.propertyNamed("$LineLocation", term_182);Term term_18;
        {
          BufferSink buf_2 = sink.context().makeBuffer(); buf_2.start(_M_STRING); buf_2.literal(1); buf_2.end();
          term_18 = buf_2.term();
        } sink.propertyNamed("$ColumnLocation", term_18);
        sink.start(_M__sTextCons);Term term_27;
        {
          BufferSink buf_32 = sink.context().makeBuffer(); buf_32.start(_M_STRING); buf_32.literal(1); buf_32.end();
          term_27 = buf_32.term();
        } sink.propertyNamed("$LineLocation", term_27);Term term_62;
        {
          BufferSink buf_182 = sink.context().makeBuffer(); buf_182.start(_M_STRING); buf_182.literal(1); buf_182.end();
          term_62 = buf_182.term();
        } sink.propertyNamed("$ColumnLocation", term_62);
        sink.start(_M__sTextEmbed);Term term_74;
        {
          BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(1); buf_7.end();
          term_74 = buf_7.term();
        } sink.propertyNamed("$LineLocation", term_74);Term term_90;
        {
          BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(1); buf_61.end();
          term_90 = buf_61.term();
        } sink.propertyNamed("$ColumnLocation", term_90);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdirective); sink.copy(sub_48.ref());
        sink.end();
        sink.end();
        sink.end();Term term_44;
        {
          BufferSink buf_30 = sink.context().makeBuffer(); buf_30.start(_M_STRING); buf_30.literal(1); buf_30.end();
          term_44 = buf_30.term();
        } sink.propertyNamed("$LineLocation", term_44);Term term_147;
        {
          BufferSink buf_170 = sink.context().makeBuffer(); buf_170.start(_M_STRING); buf_170.literal(2); buf_170.end();
          term_147 = buf_170.term();
        } sink.propertyNamed("$ColumnLocation", term_147);
        sink.start(_M__sTextCons);Term term_60;
        {
          BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_STRING); buf_58.literal(1); buf_58.end();
          term_60 = buf_58.term();
        } sink.propertyNamed("$LineLocation", term_60);Term term_134;
        {
          BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(2); buf_54.end();
          term_134 = buf_54.term();
        } sink.propertyNamed("$ColumnLocation", term_134);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_111;
        {
          BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_STRING); buf_25.literal(1); buf_25.end();
          term_111 = buf_25.term();
        } sink.propertyNamed("$LineLocation", term_111);Term term_116;
        {
          BufferSink buf_76 = sink.context().makeBuffer(); buf_76.start(_M_STRING); buf_76.literal(28); buf_76.end();
          term_116 = buf_76.term();
        } sink.propertyNamed("$ColumnLocation", term_116);
        sink.start(_M__sTextCons);Term term_160;
        {
          BufferSink buf_89 = sink.context().makeBuffer(); buf_89.start(_M_STRING); buf_89.literal(1); buf_89.end();
          term_160 = buf_89.term();
        } sink.propertyNamed("$LineLocation", term_160);Term term_88;
        {
          BufferSink buf_143 = sink.context().makeBuffer();
          buf_143.start(_M_STRING); buf_143.literal(28);
          buf_143.end();
          term_88 = buf_143.term();
        } sink.propertyNamed("$ColumnLocation", term_88);
        sink.start(_M__sTextEmbed);Term term_162;
        {
          BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_STRING); buf_27.literal(1); buf_27.end();
          term_162 = buf_27.term();
        } sink.propertyNamed("$LineLocation", term_162);Term term_61;
        {
          BufferSink buf_6 = sink.context().makeBuffer(); buf_6.start(_M_STRING); buf_6.literal(28); buf_6.end();
          term_61 = buf_6.term();
        } sink.propertyNamed("$ColumnLocation", term_61);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_17 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_17});
        sink.start(_M_Crsx_xPrint_xdirectives_xS1); sink.use(var_17);
        sink.end(); sink.copy(sub_66.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_66;
        {
          BufferSink buf_157 = sink.context().makeBuffer(); buf_157.start(_M_STRING); buf_157.literal(1); buf_157.end();
          term_66 = buf_157.term();
        } sink.propertyNamed("$LineLocation", term_66);Term term_13;
        {
          BufferSink buf_40 = sink.context().makeBuffer(); buf_40.start(_M_STRING); buf_40.literal(82); buf_40.end();
          term_13 = buf_40.term();
        } sink.propertyNamed("$ColumnLocation", term_13);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_34;
        {
          BufferSink buf_184 = sink.context().makeBuffer(); buf_184.start(_M_STRING); buf_184.literal(1); buf_184.end();
          term_34 = buf_184.term();
        } sink.propertyNamed("$LineLocation", term_34);Term term_1;
        {
          BufferSink buf_92 = sink.context().makeBuffer(); buf_92.start(_M_STRING); buf_92.literal(29); buf_92.end();
          term_1 = buf_92.term();
        } sink.propertyNamed("$ColumnLocation", term_1);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdirectives, term_230);
  } final public static boolean _M_Crsx_xPrint_xdirectiveArguments(Sink sink, int shared, int depth, Term term_94) {
    if (depth < 2000) {
      label_35: {
        if (term_94.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_35;
        }Term sub_20 = term_94.sub(0).ref();
        /* #1=sub */Term sub_63 = term_94.sub(1).ref();
        /* #2=sub */Term sub_49 = term_94.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_11;
        {
          BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_STRING); buf_47.literal(1); buf_47.end();
          term_11 = buf_47.term();
        } sink.propertyNamed("$LineLocation", term_11);Term term_190;
        {
          BufferSink buf_24 = sink.context().makeBuffer(); buf_24.start(_M_STRING); buf_24.literal(1); buf_24.end();
          term_190 = buf_24.term();
        } sink.propertyNamed("$ColumnLocation", term_190);
        sink.start(_M__sTextCons);Term term_36;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(1); buf_72.end();
          term_36 = buf_72.term();
        } sink.propertyNamed("$LineLocation", term_36);Term term_20;
        {
          BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_STRING); buf_83.literal(2); buf_83.end();
          term_20 = buf_83.term();
        } sink.propertyNamed("$ColumnLocation", term_20);
        sink.start(_M__sTextChars); sink.copy(sub_20.ref());
        sink.end();Term term_99;
        {
          BufferSink buf_384 = sink.context().makeBuffer(); buf_384.start(_M_STRING); buf_384.literal(1); buf_384.end();
          term_99 = buf_384.term();
        } sink.propertyNamed("$LineLocation", term_99);Term term_83;
        {
          BufferSink buf_264 = sink.context().makeBuffer(); buf_264.start(_M_STRING); buf_264.literal(3); buf_264.end();
          term_83 = buf_264.term();
        } sink.propertyNamed("$ColumnLocation", term_83);
        sink.start(_M__sTextCons);Term term_96;
        {
          BufferSink buf_385 = sink.context().makeBuffer(); buf_385.start(_M_STRING); buf_385.literal(1); buf_385.end();
          term_96 = buf_385.term();
        } sink.propertyNamed("$LineLocation", term_96);Term term_14;
        {
          BufferSink buf_43 = sink.context().makeBuffer(); buf_43.start(_M_STRING); buf_43.literal(3); buf_43.end();
          term_14 = buf_43.term();
        } sink.propertyNamed("$ColumnLocation", term_14);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_84;
        {
          BufferSink buf_75 = sink.context().makeBuffer(); buf_75.start(_M_STRING); buf_75.literal(1); buf_75.end();
          term_84 = buf_75.term();
        } sink.propertyNamed("$LineLocation", term_84);Term term_41;
        {
          BufferSink buf_231 = sink.context().makeBuffer(); buf_231.start(_M_STRING); buf_231.literal(7); buf_231.end();
          term_41 = buf_231.term();
        } sink.propertyNamed("$ColumnLocation", term_41);
        sink.start(_M__sTextCons);Term term_185;
        {
          BufferSink buf_87 = sink.context().makeBuffer(); buf_87.start(_M_STRING); buf_87.literal(1); buf_87.end();
          term_185 = buf_87.term();
        } sink.propertyNamed("$LineLocation", term_185);Term term_47;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_STRING); buf_90.literal(7); buf_90.end();
          term_47 = buf_90.term();
        } sink.propertyNamed("$ColumnLocation", term_47);
        sink.start(_M__sTextEmbed);Term term_131;
        {
          BufferSink buf_35 = sink.context().makeBuffer(); buf_35.start(_M_STRING); buf_35.literal(1); buf_35.end();
          term_131 = buf_35.term();
        } sink.propertyNamed("$LineLocation", term_131);Term term_150;
        {
          BufferSink buf_164 = sink.context().makeBuffer(); buf_164.start(_M_STRING); buf_164.literal(7); buf_164.end();
          term_150 = buf_164.term();
        } sink.propertyNamed("$ColumnLocation", term_150);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_6 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_6});
        sink.start(_M_Crsx_xPrint_xdirectives); sink.use(var_6);
        sink.end(); sink.copy(sub_63.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_STRING); buf_84.literal(1); buf_84.end();
          term_2 = buf_84.term();
        } sink.propertyNamed("$LineLocation", term_2);Term term_139;
        {
          BufferSink buf_190 = sink.context().makeBuffer();
          buf_190.start(_M_STRING); buf_190.literal(58);
          buf_190.end();
          term_139 = buf_190.term();
        } sink.propertyNamed("$ColumnLocation", term_139);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_50;
        {
          BufferSink buf_102 = sink.context().makeBuffer(); buf_102.start(_M_STRING); buf_102.literal(1); buf_102.end();
          term_50 = buf_102.term();
        } sink.propertyNamed("$LineLocation", term_50);Term term_17;
        {
          BufferSink buf_29 = sink.context().makeBuffer(); buf_29.start(_M_STRING); buf_29.literal(8); buf_29.end();
          term_17 = buf_29.term();
        } sink.propertyNamed("$ColumnLocation", term_17);
        sink.start(_M__sTextCons);Term term_154;
        {
          BufferSink buf_180 = sink.context().makeBuffer(); buf_180.start(_M_STRING); buf_180.literal(1); buf_180.end();
          term_154 = buf_180.term();
        } sink.propertyNamed("$LineLocation", term_154);Term term_97;
        {
          BufferSink buf_26 = sink.context().makeBuffer(); buf_26.start(_M_STRING); buf_26.literal(8); buf_26.end();
          term_97 = buf_26.term();
        } sink.propertyNamed("$ColumnLocation", term_97);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_87;
        {
          BufferSink buf_130 = sink.context().makeBuffer(); buf_130.start(_M_STRING); buf_130.literal(1); buf_130.end();
          term_87 = buf_130.term();
        } sink.propertyNamed("$LineLocation", term_87);Term term_159;
        {
          BufferSink buf_4 = sink.context().makeBuffer(); buf_4.start(_M_STRING); buf_4.literal(62); buf_4.end();
          term_159 = buf_4.term();
        } sink.propertyNamed("$ColumnLocation", term_159);
        sink.start(_M__sTextCons);Term term_52;
        {
          BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_STRING); buf_22.literal(1); buf_22.end();
          term_52 = buf_22.term();
        } sink.propertyNamed("$LineLocation", term_52);Term term_288;
        {
          BufferSink buf_173 = sink.context().makeBuffer();
          buf_173.start(_M_STRING); buf_173.literal(63);
          buf_173.end();
          term_288 = buf_173.term();
        } sink.propertyNamed("$ColumnLocation", term_288);
        sink.start(_M__sTextChars); sink.copy(sub_49.ref());
        sink.end();Term term_92;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_STRING); buf_10.literal(1); buf_10.end();
          term_92 = buf_10.term();
        } sink.propertyNamed("$LineLocation", term_92);Term term_10;
        {
          BufferSink buf_99 = sink.context().makeBuffer(); buf_99.start(_M_STRING); buf_99.literal(64); buf_99.end();
          term_10 = buf_99.term();
        } sink.propertyNamed("$ColumnLocation", term_10);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdirectiveArguments, term_94);
  } final public static boolean _M_Crsx_xPrint_xdirective(Sink sink, int shared, int depth, Term term_0) {
    if (depth < 2000) {
      label_60: {
        if (term_0.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_60;
        }Term sub_31 = term_0.sub(0).ref();
        /* #1=sub */Term sub_6 = term_0.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_132;
        {
          BufferSink buf_179 = sink.context().makeBuffer(); buf_179.start(_M_STRING); buf_179.literal(1); buf_179.end();
          term_132 = buf_179.term();
        } sink.propertyNamed("$LineLocation", term_132);Term term_364;
        {
          BufferSink buf_323 = sink.context().makeBuffer(); buf_323.start(_M_STRING); buf_323.literal(1); buf_323.end();
          term_364 = buf_323.term();
        } sink.propertyNamed("$ColumnLocation", term_364);
        sink.start(_M__sTextCons);Term term_9;
        {
          BufferSink buf_232 = sink.context().makeBuffer(); buf_232.start(_M_STRING); buf_232.literal(1); buf_232.end();
          term_9 = buf_232.term();
        } sink.propertyNamed("$LineLocation", term_9);Term term_138;
        {
          BufferSink buf_108 = sink.context().makeBuffer(); buf_108.start(_M_STRING); buf_108.literal(1); buf_108.end();
          term_138 = buf_108.term();
        } sink.propertyNamed("$ColumnLocation", term_138);
        sink.start(_M__sTextEmbed);Term term_77;
        {
          BufferSink buf_44 = sink.context().makeBuffer(); buf_44.start(_M_STRING); buf_44.literal(1); buf_44.end();
          term_77 = buf_44.term();
        } sink.propertyNamed("$LineLocation", term_77);Term term_93;
        {
          BufferSink buf_50 = sink.context().makeBuffer(); buf_50.start(_M_STRING); buf_50.literal(1); buf_50.end();
          term_93 = buf_50.term();
        } sink.propertyNamed("$ColumnLocation", term_93);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_31.ref());
        sink.end();
        sink.end();
        sink.end();Term term_163;
        {
          BufferSink buf_5 = sink.context().makeBuffer(); buf_5.start(_M_STRING); buf_5.literal(1); buf_5.end();
          term_163 = buf_5.term();
        } sink.propertyNamed("$LineLocation", term_163);Term term_153;
        {
          BufferSink buf_270 = sink.context().makeBuffer(); buf_270.start(_M_STRING); buf_270.literal(2); buf_270.end();
          term_153 = buf_270.term();
        } sink.propertyNamed("$ColumnLocation", term_153);
        sink.start(_M__sTextCons);Term term_64;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(1); buf_62.end();
          term_64 = buf_62.term();
        } sink.propertyNamed("$LineLocation", term_64);Term term_15;
        {
          BufferSink buf_159 = sink.context().makeBuffer(); buf_159.start(_M_STRING); buf_159.literal(2); buf_159.end();
          term_15 = buf_159.term();
        } sink.propertyNamed("$ColumnLocation", term_15);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_326;
        {
          BufferSink buf_155 = sink.context().makeBuffer(); buf_155.start(_M_STRING); buf_155.literal(1); buf_155.end();
          term_326 = buf_155.term();
        } sink.propertyNamed("$LineLocation", term_326);Term term_63;
        {
          BufferSink buf_133 = sink.context().makeBuffer();
          buf_133.start(_M_STRING); buf_133.literal(30);
          buf_133.end();
          term_63 = buf_133.term();
        } sink.propertyNamed("$ColumnLocation", term_63);
        sink.start(_M__sTextCons);Term term_174;
        {
          BufferSink buf_165 = sink.context().makeBuffer(); buf_165.start(_M_STRING); buf_165.literal(1); buf_165.end();
          term_174 = buf_165.term();
        } sink.propertyNamed("$LineLocation", term_174);Term term_223;
        {
          BufferSink buf_191 = sink.context().makeBuffer();
          buf_191.start(_M_STRING); buf_191.literal(30);
          buf_191.end();
          term_223 = buf_191.term();
        } sink.propertyNamed("$ColumnLocation", term_223);
        sink.start(_M__sTextEmbed);Term term_19;
        {
          BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(1); buf_53.end();
          term_19 = buf_53.term();
        } sink.propertyNamed("$LineLocation", term_19);Term term_31;
        {
          BufferSink buf_66 = sink.context().makeBuffer(); buf_66.start(_M_STRING); buf_66.literal(30); buf_66.end();
          term_31 = buf_66.term();
        } sink.propertyNamed("$ColumnLocation", term_31);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_27 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_27});
        sink.start(_M_Crsx_xPrint_xdirectiveArguments); sink.use(var_27);
        sink.end(); sink.copy(sub_6.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_165;
        {
          BufferSink buf_163 = sink.context().makeBuffer(); buf_163.start(_M_STRING); buf_163.literal(1); buf_163.end();
          term_165 = buf_163.term();
        } sink.propertyNamed("$LineLocation", term_165);Term term_200;
        {
          BufferSink buf_212 = sink.context().makeBuffer();
          buf_212.start(_M_STRING); buf_212.literal(89);
          buf_212.end();
          term_200 = buf_212.term();
        } sink.propertyNamed("$ColumnLocation", term_200);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_6;
        {
          BufferSink buf_114 = sink.context().makeBuffer(); buf_114.start(_M_STRING); buf_114.literal(1); buf_114.end();
          term_6 = buf_114.term();
        } sink.propertyNamed("$LineLocation", term_6);Term term_114;
        {
          BufferSink buf_172 = sink.context().makeBuffer();
          buf_172.start(_M_STRING); buf_172.literal(31);
          buf_172.end();
          term_114 = buf_172.term();
        } sink.propertyNamed("$ColumnLocation", term_114);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_68: {
        if (term_0.descriptor() != _M_Crsx_xdirective_xA2)
        {   break label_68;
        }Term sub_68 = term_0.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_324;
        {
          BufferSink buf_177 = sink.context().makeBuffer(); buf_177.start(_M_STRING); buf_177.literal(1); buf_177.end();
          term_324 = buf_177.term();
        } sink.propertyNamed("$LineLocation", term_324);Term term_16;
        {
          BufferSink buf_98 = sink.context().makeBuffer(); buf_98.start(_M_STRING); buf_98.literal(1); buf_98.end();
          term_16 = buf_98.term();
        } sink.propertyNamed("$ColumnLocation", term_16);
        sink.start(_M__sTextCons);Term term_536;
        {
          BufferSink buf_211 = sink.context().makeBuffer(); buf_211.start(_M_STRING); buf_211.literal(1); buf_211.end();
          term_536 = buf_211.term();
        } sink.propertyNamed("$LineLocation", term_536);Term term_107;
        {
          BufferSink buf_21 = sink.context().makeBuffer(); buf_21.start(_M_STRING); buf_21.literal(1); buf_21.end();
          term_107 = buf_21.term();
        } sink.propertyNamed("$ColumnLocation", term_107);
        sink.start(_M__sTextEmbed);Term term_202;
        {
          BufferSink buf_103 = sink.context().makeBuffer(); buf_103.start(_M_STRING); buf_103.literal(1); buf_103.end();
          term_202 = buf_103.term();
        } sink.propertyNamed("$LineLocation", term_202);Term term_278;
        {
          BufferSink buf_186 = sink.context().makeBuffer(); buf_186.start(_M_STRING); buf_186.literal(1); buf_186.end();
          term_278 = buf_186.term();
        } sink.propertyNamed("$ColumnLocation", term_278);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdirectiveList); sink.copy(sub_68.ref());
        sink.end();
        sink.end();
        sink.end();Term term_453;
        {
          BufferSink buf_205 = sink.context().makeBuffer(); buf_205.start(_M_STRING); buf_205.literal(1); buf_205.end();
          term_453 = buf_205.term();
        } sink.propertyNamed("$LineLocation", term_453);Term term_38;
        {
          BufferSink buf_337 = sink.context().makeBuffer(); buf_337.start(_M_STRING); buf_337.literal(2); buf_337.end();
          term_38 = buf_337.term();
        } sink.propertyNamed("$ColumnLocation", term_38);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_75: {
        if (term_0.descriptor() != _M_Crsx_xdirective_xA3)
        {   break label_75;
        }Term sub_24 = term_0.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_115;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.start(_M_STRING); buf_17.literal(1); buf_17.end();
          term_115 = buf_17.term();
        } sink.propertyNamed("$LineLocation", term_115);Term term_168;
        {
          BufferSink buf_152 = sink.context().makeBuffer(); buf_152.start(_M_STRING); buf_152.literal(1); buf_152.end();
          term_168 = buf_152.term();
        } sink.propertyNamed("$ColumnLocation", term_168);
        sink.start(_M__sTextCons);Term term_119;
        {
          BufferSink buf_138 = sink.context().makeBuffer(); buf_138.start(_M_STRING); buf_138.literal(1); buf_138.end();
          term_119 = buf_138.term();
        } sink.propertyNamed("$LineLocation", term_119);Term term_125;
        {
          BufferSink buf_88 = sink.context().makeBuffer(); buf_88.start(_M_STRING); buf_88.literal(1); buf_88.end();
          term_125 = buf_88.term();
        } sink.propertyNamed("$ColumnLocation", term_125);
        sink.start(_M__sTextEmbed);Term term_156;
        {
          BufferSink buf_294 = sink.context().makeBuffer(); buf_294.start(_M_STRING); buf_294.literal(1); buf_294.end();
          term_156 = buf_294.term();
        } sink.propertyNamed("$LineLocation", term_156);Term term_8;
        {
          BufferSink buf_192 = sink.context().makeBuffer(); buf_192.start(_M_STRING); buf_192.literal(1); buf_192.end();
          term_8 = buf_192.term();
        } sink.propertyNamed("$ColumnLocation", term_8);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xliteral); sink.copy(sub_24.ref());
        sink.end();
        sink.end();
        sink.end();Term term_510;
        {
          BufferSink buf_151 = sink.context().makeBuffer(); buf_151.start(_M_STRING); buf_151.literal(1); buf_151.end();
          term_510 = buf_151.term();
        } sink.propertyNamed("$LineLocation", term_510);Term term_179;
        {
          BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_STRING); buf_18.literal(2); buf_18.end();
          term_179 = buf_18.term();
        } sink.propertyNamed("$ColumnLocation", term_179);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_1: {
        if (term_0.descriptor() != _M_Crsx_xdirective_xA4)
        {   break label_1;
        }Term sub_45 = term_0.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_362;
        {
          BufferSink buf_274 = sink.context().makeBuffer(); buf_274.start(_M_STRING); buf_274.literal(1); buf_274.end();
          term_362 = buf_274.term();
        } sink.propertyNamed("$LineLocation", term_362);Term term_192;
        {
          BufferSink buf_36 = sink.context().makeBuffer(); buf_36.start(_M_STRING); buf_36.literal(1); buf_36.end();
          term_192 = buf_36.term();
        } sink.propertyNamed("$ColumnLocation", term_192);
        sink.start(_M__sTextCons);Term term_358;
        {
          BufferSink buf_124 = sink.context().makeBuffer(); buf_124.start(_M_STRING); buf_124.literal(1); buf_124.end();
          term_358 = buf_124.term();
        } sink.propertyNamed("$LineLocation", term_358);Term term_167;
        {
          BufferSink buf_252 = sink.context().makeBuffer(); buf_252.start(_M_STRING); buf_252.literal(1); buf_252.end();
          term_167 = buf_252.term();
        } sink.propertyNamed("$ColumnLocation", term_167);
        sink.start(_M__sTextEmbed);Term term_140;
        {
          BufferSink buf_183 = sink.context().makeBuffer(); buf_183.start(_M_STRING); buf_183.literal(1); buf_183.end();
          term_140 = buf_183.term();
        } sink.propertyNamed("$LineLocation", term_140);Term term_155;
        {
          BufferSink buf_68 = sink.context().makeBuffer(); buf_68.start(_M_STRING); buf_68.literal(1); buf_68.end();
          term_155 = buf_68.term();
        } sink.propertyNamed("$ColumnLocation", term_155);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconcrete); sink.copy(sub_45.ref());
        sink.end();
        sink.end();
        sink.end();Term term_276;
        {
          BufferSink buf_20 = sink.context().makeBuffer(); buf_20.start(_M_STRING); buf_20.literal(1); buf_20.end();
          term_276 = buf_20.term();
        } sink.propertyNamed("$LineLocation", term_276);Term term_464;
        {
          BufferSink buf_110 = sink.context().makeBuffer(); buf_110.start(_M_STRING); buf_110.literal(2); buf_110.end();
          term_464 = buf_110.term();
        } sink.propertyNamed("$ColumnLocation", term_464);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdirective, term_0);
  } final public static boolean _M_Crsx_xPrint_xreserved(Sink sink, int shared, int depth, Term term_181) {
    if (depth < 2000) {
      label_32: {
        if (term_181.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_32;
        }Term sub_88 = term_181.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_110;
        {
          BufferSink buf_31 = sink.context().makeBuffer(); buf_31.start(_M_STRING); buf_31.literal(1); buf_31.end();
          term_110 = buf_31.term();
        } sink.propertyNamed("$LineLocation", term_110);Term term_269;
        {
          BufferSink buf_295 = sink.context().makeBuffer(); buf_295.start(_M_STRING); buf_295.literal(1); buf_295.end();
          term_269 = buf_295.term();
        } sink.propertyNamed("$ColumnLocation", term_269);
        sink.start(_M__sTextCons);Term term_136;
        {
          BufferSink buf_118 = sink.context().makeBuffer(); buf_118.start(_M_STRING); buf_118.literal(1); buf_118.end();
          term_136 = buf_118.term();
        } sink.propertyNamed("$LineLocation", term_136);Term term_170;
        {
          BufferSink buf_77 = sink.context().makeBuffer(); buf_77.start(_M_STRING); buf_77.literal(2); buf_77.end();
          term_170 = buf_77.term();
        } sink.propertyNamed("$ColumnLocation", term_170);
        sink.start(_M__sTextChars); sink.copy(sub_88.ref());
        sink.end();Term term_105;
        {
          BufferSink buf_69 = sink.context().makeBuffer(); buf_69.start(_M_STRING); buf_69.literal(1); buf_69.end();
          term_105 = buf_69.term();
        } sink.propertyNamed("$LineLocation", term_105);Term term_246;
        {
          BufferSink buf_195 = sink.context().makeBuffer(); buf_195.start(_M_STRING); buf_195.literal(3); buf_195.end();
          term_246 = buf_195.term();
        } sink.propertyNamed("$ColumnLocation", term_246);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_93: {
        if (term_181.descriptor() != _M_Crsx_xreserved_xA2)
        {   break label_93;
        }Term sub_51 = term_181.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_264;
        {
          BufferSink buf_319 = sink.context().makeBuffer(); buf_319.start(_M_STRING); buf_319.literal(1); buf_319.end();
          term_264 = buf_319.term();
        } sink.propertyNamed("$LineLocation", term_264);Term term_108;
        {
          BufferSink buf_144 = sink.context().makeBuffer(); buf_144.start(_M_STRING); buf_144.literal(1); buf_144.end();
          term_108 = buf_144.term();
        } sink.propertyNamed("$ColumnLocation", term_108);
        sink.start(_M__sTextCons);Term term_135;
        {
          BufferSink buf_196 = sink.context().makeBuffer(); buf_196.start(_M_STRING); buf_196.literal(1); buf_196.end();
          term_135 = buf_196.term();
        } sink.propertyNamed("$LineLocation", term_135);Term term_277;
        {
          BufferSink buf_176 = sink.context().makeBuffer(); buf_176.start(_M_STRING); buf_176.literal(2); buf_176.end();
          term_277 = buf_176.term();
        } sink.propertyNamed("$ColumnLocation", term_277);
        sink.start(_M__sTextChars); sink.copy(sub_51.ref());
        sink.end();Term term_257;
        {
          BufferSink buf_382 = sink.context().makeBuffer(); buf_382.start(_M_STRING); buf_382.literal(1); buf_382.end();
          term_257 = buf_382.term();
        } sink.propertyNamed("$LineLocation", term_257);Term term_112;
        {
          BufferSink buf_82 = sink.context().makeBuffer(); buf_82.start(_M_STRING); buf_82.literal(3); buf_82.end();
          term_112 = buf_82.term();
        } sink.propertyNamed("$ColumnLocation", term_112);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xreserved, term_181);
  } final public static boolean _M_Crsx_xPrint_xqualifier(Sink sink, int shared, int depth, Term term_39) {
    if (depth < 2000) {
      label_56: {
        if (term_39.descriptor() != _M_Crsx_xqualifier_xA1)
        {   break label_56;
        }Term sub_80 = term_39.sub(0).ref();
        /* #1=sub */Term sub_54 = term_39.sub(1).ref();
        /* #2=sub */Term sub_43 = term_39.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_169;
        {
          BufferSink buf_290 = sink.context().makeBuffer(); buf_290.start(_M_STRING); buf_290.literal(1); buf_290.end();
          term_169 = buf_290.term();
        } sink.propertyNamed("$LineLocation", term_169);Term term_210;
        {
          BufferSink buf_122 = sink.context().makeBuffer(); buf_122.start(_M_STRING); buf_122.literal(1); buf_122.end();
          term_210 = buf_122.term();
        } sink.propertyNamed("$ColumnLocation", term_210);
        sink.start(_M__sTextCons);Term term_273;
        {
          BufferSink buf_197 = sink.context().makeBuffer(); buf_197.start(_M_STRING); buf_197.literal(1); buf_197.end();
          term_273 = buf_197.term();
        } sink.propertyNamed("$LineLocation", term_273);Term term_256;
        {
          BufferSink buf_214 = sink.context().makeBuffer(); buf_214.start(_M_STRING); buf_214.literal(2); buf_214.end();
          term_256 = buf_214.term();
        } sink.propertyNamed("$ColumnLocation", term_256);
        sink.start(_M__sTextChars); sink.copy(sub_80.ref());
        sink.end();Term term_217;
        {
          BufferSink buf_116 = sink.context().makeBuffer(); buf_116.start(_M_STRING); buf_116.literal(1); buf_116.end();
          term_217 = buf_116.term();
        } sink.propertyNamed("$LineLocation", term_217);Term term_78;
        {
          BufferSink buf_233 = sink.context().makeBuffer(); buf_233.start(_M_STRING); buf_233.literal(3); buf_233.end();
          term_78 = buf_233.term();
        } sink.propertyNamed("$ColumnLocation", term_78);
        sink.start(_M__sTextCons);Term term_381;
        {
          BufferSink buf_113 = sink.context().makeBuffer(); buf_113.start(_M_STRING); buf_113.literal(1); buf_113.end();
          term_381 = buf_113.term();
        } sink.propertyNamed("$LineLocation", term_381);Term term_24;
        {
          BufferSink buf_189 = sink.context().makeBuffer(); buf_189.start(_M_STRING); buf_189.literal(3); buf_189.end();
          term_24 = buf_189.term();
        } sink.propertyNamed("$ColumnLocation", term_24);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_23;
        {
          BufferSink buf_198 = sink.context().makeBuffer(); buf_198.start(_M_STRING); buf_198.literal(1); buf_198.end();
          term_23 = buf_198.term();
        } sink.propertyNamed("$LineLocation", term_23);Term term_89;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_STRING); buf_80.literal(7); buf_80.end();
          term_89 = buf_80.term();
        } sink.propertyNamed("$ColumnLocation", term_89);
        sink.start(_M__sTextCons);Term term_106;
        {
          BufferSink buf_374 = sink.context().makeBuffer(); buf_374.start(_M_STRING); buf_374.literal(1); buf_374.end();
          term_106 = buf_374.term();
        } sink.propertyNamed("$LineLocation", term_106);Term term_193;
        {
          BufferSink buf_381 = sink.context().makeBuffer(); buf_381.start(_M_STRING); buf_381.literal(8); buf_381.end();
          term_193 = buf_381.term();
        } sink.propertyNamed("$ColumnLocation", term_193);
        sink.start(_M__sTextChars); sink.copy(sub_54.ref());
        sink.end();Term term_81;
        {
          BufferSink buf_86 = sink.context().makeBuffer(); buf_86.start(_M_STRING); buf_86.literal(1); buf_86.end();
          term_81 = buf_86.term();
        } sink.propertyNamed("$LineLocation", term_81);Term term_121;
        {
          BufferSink buf_39 = sink.context().makeBuffer(); buf_39.start(_M_STRING); buf_39.literal(9); buf_39.end();
          term_121 = buf_39.term();
        } sink.propertyNamed("$ColumnLocation", term_121);
        sink.start(_M__sTextCons);Term term_241;
        {
          BufferSink buf_136 = sink.context().makeBuffer(); buf_136.start(_M_STRING); buf_136.literal(1); buf_136.end();
          term_241 = buf_136.term();
        } sink.propertyNamed("$LineLocation", term_241);Term term_224;
        {
          BufferSink buf_292 = sink.context().makeBuffer(); buf_292.start(_M_STRING); buf_292.literal(9); buf_292.end();
          term_224 = buf_292.term();
        } sink.propertyNamed("$ColumnLocation", term_224);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_270;
        {
          BufferSink buf_3 = sink.context().makeBuffer(); buf_3.start(_M_STRING); buf_3.literal(1); buf_3.end();
          term_270 = buf_3.term();
        } sink.propertyNamed("$LineLocation", term_270);Term term_197;
        {
          BufferSink buf_204 = sink.context().makeBuffer();
          buf_204.start(_M_STRING); buf_204.literal(13);
          buf_204.end();
          term_197 = buf_204.term();
        } sink.propertyNamed("$ColumnLocation", term_197);
        sink.start(_M__sTextCons);Term term_141;
        {
          BufferSink buf_115 = sink.context().makeBuffer(); buf_115.start(_M_STRING); buf_115.literal(1); buf_115.end();
          term_141 = buf_115.term();
        } sink.propertyNamed("$LineLocation", term_141);Term term_178;
        {
          BufferSink buf_241 = sink.context().makeBuffer();
          buf_241.start(_M_STRING); buf_241.literal(13);
          buf_241.end();
          term_178 = buf_241.term();
        } sink.propertyNamed("$ColumnLocation", term_178);
        sink.start(_M__sTextEmbed);Term term_145;
        {
          BufferSink buf_208 = sink.context().makeBuffer(); buf_208.start(_M_STRING); buf_208.literal(1); buf_208.end();
          term_145 = buf_208.term();
        } sink.propertyNamed("$LineLocation", term_145);Term term_189;
        {
          BufferSink buf_285 = sink.context().makeBuffer();
          buf_285.start(_M_STRING); buf_285.literal(13);
          buf_285.end();
          term_189 = buf_285.term();
        } sink.propertyNamed("$ColumnLocation", term_189);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xqualifier); sink.copy(sub_43.ref());
        sink.end();
        sink.end();
        sink.end();Term term_176;
        {
          BufferSink buf_142 = sink.context().makeBuffer(); buf_142.start(_M_STRING); buf_142.literal(1); buf_142.end();
          term_176 = buf_142.term();
        } sink.propertyNamed("$LineLocation", term_176);Term term_25;
        {
          BufferSink buf_387 = sink.context().makeBuffer();
          buf_387.start(_M_STRING); buf_387.literal(14);
          buf_387.end();
          term_25 = buf_387.term();
        } sink.propertyNamed("$ColumnLocation", term_25);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_82: {
        if (term_39.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_82;
        }/*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xqualifier, term_39);
  } final public static boolean _M_Crsx_xPrint_xconstructor(Sink sink, int shared, int depth, Term term_303) {
    if (depth < 2000) {
      label_15: {
        if (term_303.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_15;
        }Term sub_108 = term_303.sub(0).ref();
        /* #1=sub */Term sub_89 = term_303.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_117;
        {
          BufferSink buf_169 = sink.context().makeBuffer(); buf_169.start(_M_STRING); buf_169.literal(1); buf_169.end();
          term_117 = buf_169.term();
        } sink.propertyNamed("$LineLocation", term_117);Term term_281;
        {
          BufferSink buf_160 = sink.context().makeBuffer(); buf_160.start(_M_STRING); buf_160.literal(1); buf_160.end();
          term_281 = buf_160.term();
        } sink.propertyNamed("$ColumnLocation", term_281);
        sink.start(_M__sTextCons);Term term_199;
        {
          BufferSink buf_240 = sink.context().makeBuffer(); buf_240.start(_M_STRING); buf_240.literal(1); buf_240.end();
          term_199 = buf_240.term();
        } sink.propertyNamed("$LineLocation", term_199);Term term_124;
        {
          BufferSink buf_359 = sink.context().makeBuffer(); buf_359.start(_M_STRING); buf_359.literal(1); buf_359.end();
          term_124 = buf_359.term();
        } sink.propertyNamed("$ColumnLocation", term_124);
        sink.start(_M__sTextEmbed);Term term_350;
        {
          BufferSink buf_140 = sink.context().makeBuffer(); buf_140.start(_M_STRING); buf_140.literal(1); buf_140.end();
          term_350 = buf_140.term();
        } sink.propertyNamed("$LineLocation", term_350);Term term_347;
        {
          BufferSink buf_55 = sink.context().makeBuffer(); buf_55.start(_M_STRING); buf_55.literal(1); buf_55.end();
          term_347 = buf_55.term();
        } sink.propertyNamed("$ColumnLocation", term_347);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xqualifier); sink.copy(sub_108.ref());
        sink.end();
        sink.end();
        sink.end();Term term_279;
        {
          BufferSink buf_218 = sink.context().makeBuffer(); buf_218.start(_M_STRING); buf_218.literal(1); buf_218.end();
          term_279 = buf_218.term();
        } sink.propertyNamed("$LineLocation", term_279);Term term_79;
        {
          BufferSink buf_342 = sink.context().makeBuffer(); buf_342.start(_M_STRING); buf_342.literal(2); buf_342.end();
          term_79 = buf_342.term();
        } sink.propertyNamed("$ColumnLocation", term_79);
        sink.start(_M__sTextCons);Term term_151;
        {
          BufferSink buf_245 = sink.context().makeBuffer(); buf_245.start(_M_STRING); buf_245.literal(1); buf_245.end();
          term_151 = buf_245.term();
        } sink.propertyNamed("$LineLocation", term_151);Term term_360;
        {
          BufferSink buf_193 = sink.context().makeBuffer(); buf_193.start(_M_STRING); buf_193.literal(2); buf_193.end();
          term_360 = buf_193.term();
        } sink.propertyNamed("$ColumnLocation", term_360);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_344;
        {
          BufferSink buf_16 = sink.context().makeBuffer(); buf_16.start(_M_STRING); buf_16.literal(1); buf_16.end();
          term_344 = buf_16.term();
        } sink.propertyNamed("$LineLocation", term_344);Term term_118;
        {
          BufferSink buf_109 = sink.context().makeBuffer();
          buf_109.start(_M_STRING); buf_109.literal(28);
          buf_109.end();
          term_118 = buf_109.term();
        } sink.propertyNamed("$ColumnLocation", term_118);
        sink.start(_M__sTextCons);Term term_183;
        {
          BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(1); buf_41.end();
          term_183 = buf_41.term();
        } sink.propertyNamed("$LineLocation", term_183);Term term_475;
        {
          BufferSink buf_230 = sink.context().makeBuffer();
          buf_230.start(_M_STRING); buf_230.literal(29);
          buf_230.end();
          term_475 = buf_230.term();
        } sink.propertyNamed("$ColumnLocation", term_475);
        sink.start(_M__sTextChars); sink.copy(sub_89.ref());
        sink.end();Term term_48;
        {
          BufferSink buf_127 = sink.context().makeBuffer(); buf_127.start(_M_STRING); buf_127.literal(1); buf_127.end();
          term_48 = buf_127.term();
        } sink.propertyNamed("$LineLocation", term_48);Term term_128;
        {
          BufferSink buf_246 = sink.context().makeBuffer();
          buf_246.start(_M_STRING); buf_246.literal(30);
          buf_246.end();
          term_128 = buf_246.term();
        } sink.propertyNamed("$ColumnLocation", term_128);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_91: {
        if (term_303.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_91;
        }Term sub_99 = term_303.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_255;
        {
          BufferSink buf_273 = sink.context().makeBuffer(); buf_273.start(_M_STRING); buf_273.literal(1); buf_273.end();
          term_255 = buf_273.term();
        } sink.propertyNamed("$LineLocation", term_255);Term term_250;
        {
          BufferSink buf_149 = sink.context().makeBuffer(); buf_149.start(_M_STRING); buf_149.literal(1); buf_149.end();
          term_250 = buf_149.term();
        } sink.propertyNamed("$ColumnLocation", term_250);
        sink.start(_M__sTextCons);Term term_334;
        {
          BufferSink buf_117 = sink.context().makeBuffer(); buf_117.start(_M_STRING); buf_117.literal(1); buf_117.end();
          term_334 = buf_117.term();
        } sink.propertyNamed("$LineLocation", term_334);Term term_280;
        {
          BufferSink buf_347 = sink.context().makeBuffer(); buf_347.start(_M_STRING); buf_347.literal(1); buf_347.end();
          term_280 = buf_347.term();
        } sink.propertyNamed("$ColumnLocation", term_280);
        sink.start(_M__sTextEmbed);Term term_161;
        {
          BufferSink buf_185 = sink.context().makeBuffer(); buf_185.start(_M_STRING); buf_185.literal(1); buf_185.end();
          term_161 = buf_185.term();
        } sink.propertyNamed("$LineLocation", term_161);Term term_317;
        {
          BufferSink buf_589 = sink.context().makeBuffer(); buf_589.start(_M_STRING); buf_589.literal(1); buf_589.end();
          term_317 = buf_589.term();
        } sink.propertyNamed("$ColumnLocation", term_317);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xreserved); sink.copy(sub_99.ref());
        sink.end();
        sink.end();
        sink.end();Term term_152;
        {
          BufferSink buf_266 = sink.context().makeBuffer(); buf_266.start(_M_STRING); buf_266.literal(1); buf_266.end();
          term_152 = buf_266.term();
        } sink.propertyNamed("$LineLocation", term_152);Term term_335;
        {
          BufferSink buf_345 = sink.context().makeBuffer(); buf_345.start(_M_STRING); buf_345.literal(2); buf_345.end();
          term_335 = buf_345.term();
        } sink.propertyNamed("$ColumnLocation", term_335);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xconstructor, term_303);
  } final public static boolean _M_Crsx_xPrint_xform(Sink sink, int shared, int depth, Term term_238) {
    if (depth < 2000) {
      label_76: {
        if (term_238.descriptor() != _M_Crsx_xform_xA1)
        {   break label_76;
        }Term sub_65 = term_238.sub(0).ref();
        /* #1=sub */Term sub_0 = term_238.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_229;
        {
          BufferSink buf_269 = sink.context().makeBuffer(); buf_269.start(_M_STRING); buf_269.literal(1); buf_269.end();
          term_229 = buf_269.term();
        } sink.propertyNamed("$LineLocation", term_229);Term term_76;
        {
          BufferSink buf_238 = sink.context().makeBuffer(); buf_238.start(_M_STRING); buf_238.literal(1); buf_238.end();
          term_76 = buf_238.term();
        } sink.propertyNamed("$ColumnLocation", term_76);
        sink.start(_M__sTextCons);Term term_104;
        {
          BufferSink buf_227 = sink.context().makeBuffer(); buf_227.start(_M_STRING); buf_227.literal(1); buf_227.end();
          term_104 = buf_227.term();
        } sink.propertyNamed("$LineLocation", term_104);Term term_477;
        {
          BufferSink buf_158 = sink.context().makeBuffer(); buf_158.start(_M_STRING); buf_158.literal(1); buf_158.end();
          term_477 = buf_158.term();
        } sink.propertyNamed("$ColumnLocation", term_477);
        sink.start(_M__sTextEmbed);Term term_129;
        {
          BufferSink buf_139 = sink.context().makeBuffer(); buf_139.start(_M_STRING); buf_139.literal(1); buf_139.end();
          term_129 = buf_139.term();
        } sink.propertyNamed("$LineLocation", term_129);Term term_40;
        {
          BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_STRING); buf_12.literal(1); buf_12.end();
          term_40 = buf_12.term();
        } sink.propertyNamed("$ColumnLocation", term_40);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_65.ref());
        sink.end();
        sink.end();
        sink.end();Term term_357;
        {
          BufferSink buf_286 = sink.context().makeBuffer(); buf_286.start(_M_STRING); buf_286.literal(1); buf_286.end();
          term_357 = buf_286.term();
        } sink.propertyNamed("$LineLocation", term_357);Term term_263;
        {
          BufferSink buf_174 = sink.context().makeBuffer(); buf_174.start(_M_STRING); buf_174.literal(2); buf_174.end();
          term_263 = buf_174.term();
        } sink.propertyNamed("$ColumnLocation", term_263);
        sink.start(_M__sTextCons);Term term_349;
        {
          BufferSink buf_141 = sink.context().makeBuffer(); buf_141.start(_M_STRING); buf_141.literal(1); buf_141.end();
          term_349 = buf_141.term();
        } sink.propertyNamed("$LineLocation", term_349);Term term_258;
        {
          BufferSink buf_221 = sink.context().makeBuffer(); buf_221.start(_M_STRING); buf_221.literal(2); buf_221.end();
          term_258 = buf_221.term();
        } sink.propertyNamed("$ColumnLocation", term_258);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_333;
        {
          BufferSink buf_251 = sink.context().makeBuffer(); buf_251.start(_M_STRING); buf_251.literal(1); buf_251.end();
          term_333 = buf_251.term();
        } sink.propertyNamed("$LineLocation", term_333);Term term_261;
        {
          BufferSink buf_390 = sink.context().makeBuffer();
          buf_390.start(_M_STRING); buf_390.literal(30);
          buf_390.end();
          term_261 = buf_390.term();
        } sink.propertyNamed("$ColumnLocation", term_261);
        sink.start(_M__sTextCons);Term term_29;
        {
          BufferSink buf_162 = sink.context().makeBuffer(); buf_162.start(_M_STRING); buf_162.literal(1); buf_162.end();
          term_29 = buf_162.term();
        } sink.propertyNamed("$LineLocation", term_29);Term term_285;
        {
          BufferSink buf_126 = sink.context().makeBuffer();
          buf_126.start(_M_STRING); buf_126.literal(30);
          buf_126.end();
          term_285 = buf_126.term();
        } sink.propertyNamed("$ColumnLocation", term_285);
        sink.start(_M__sTextEmbed);Term term_5;
        {
          BufferSink buf_94 = sink.context().makeBuffer(); buf_94.start(_M_STRING); buf_94.literal(1); buf_94.end();
          term_5 = buf_94.term();
        } sink.propertyNamed("$LineLocation", term_5);Term term_271;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_STRING); buf_57.literal(30); buf_57.end();
          term_271 = buf_57.term();
        } sink.propertyNamed("$ColumnLocation", term_271);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_13 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_13});
        sink.start(_M_Crsx_xPrint_xarguments); sink.use(var_13);
        sink.end(); sink.copy(sub_0.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_332;
        {
          BufferSink buf_134 = sink.context().makeBuffer(); buf_134.start(_M_STRING); buf_134.literal(1); buf_134.end();
          term_332 = buf_134.term();
        } sink.propertyNamed("$LineLocation", term_332);Term term_472;
        {
          BufferSink buf_148 = sink.context().makeBuffer();
          buf_148.start(_M_STRING); buf_148.literal(80);
          buf_148.end();
          term_472 = buf_148.term();
        } sink.propertyNamed("$ColumnLocation", term_472);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_371;
        {
          BufferSink buf_260 = sink.context().makeBuffer(); buf_260.start(_M_STRING); buf_260.literal(1); buf_260.end();
          term_371 = buf_260.term();
        } sink.propertyNamed("$LineLocation", term_371);Term term_120;
        {
          BufferSink buf_258 = sink.context().makeBuffer();
          buf_258.start(_M_STRING); buf_258.literal(31);
          buf_258.end();
          term_120 = buf_258.term();
        } sink.propertyNamed("$ColumnLocation", term_120);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_23: {
        if (term_238.descriptor() != _M_Crsx_xform_xA2)
        {   break label_23;
        }Term sub_77 = term_238.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_148;
        {
          BufferSink buf_199 = sink.context().makeBuffer(); buf_199.start(_M_STRING); buf_199.literal(1); buf_199.end();
          term_148 = buf_199.term();
        } sink.propertyNamed("$LineLocation", term_148);Term term_318;
        {
          BufferSink buf_132 = sink.context().makeBuffer(); buf_132.start(_M_STRING); buf_132.literal(1); buf_132.end();
          term_318 = buf_132.term();
        } sink.propertyNamed("$ColumnLocation", term_318);
        sink.start(_M__sTextCons);Term term_232;
        {
          BufferSink buf_119 = sink.context().makeBuffer(); buf_119.start(_M_STRING); buf_119.literal(1); buf_119.end();
          term_232 = buf_119.term();
        } sink.propertyNamed("$LineLocation", term_232);Term term_126;
        {
          BufferSink buf_112 = sink.context().makeBuffer(); buf_112.start(_M_STRING); buf_112.literal(1); buf_112.end();
          term_126 = buf_112.term();
        } sink.propertyNamed("$ColumnLocation", term_126);
        sink.start(_M__sTextEmbed);Term term_452;
        {
          BufferSink buf_278 = sink.context().makeBuffer(); buf_278.start(_M_STRING); buf_278.literal(1); buf_278.end();
          term_452 = buf_278.term();
        } sink.propertyNamed("$LineLocation", term_452);Term term_423;
        {
          BufferSink buf_457 = sink.context().makeBuffer(); buf_457.start(_M_STRING); buf_457.literal(1); buf_457.end();
          term_423 = buf_457.term();
        } sink.propertyNamed("$ColumnLocation", term_423);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xvariable); sink.copy(sub_77.ref());
        sink.end();
        sink.end();
        sink.end();Term term_481;
        {
          BufferSink buf_171 = sink.context().makeBuffer(); buf_171.start(_M_STRING); buf_171.literal(1); buf_171.end();
          term_481 = buf_171.term();
        } sink.propertyNamed("$LineLocation", term_481);Term term_354;
        {
          BufferSink buf_370 = sink.context().makeBuffer(); buf_370.start(_M_STRING); buf_370.literal(2); buf_370.end();
          term_354 = buf_370.term();
        } sink.propertyNamed("$ColumnLocation", term_354);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xform, term_238);
  } final public static boolean _M_Crsx_xPrint_xforms_xS1(Sink sink, int shared, int depth, Term term_214) {
    if (depth < 2000) {
      label_37: {
        if (term_214.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_37;
        }Term sub_67 = term_214.sub(0).ref();
        /* #1=sub */Term sub_94 = term_214.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_260;
        {
          BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_STRING); buf_33.literal(1); buf_33.end();
          term_260 = buf_33.term();
        } sink.propertyNamed("$LineLocation", term_260);Term term_336;
        {
          BufferSink buf_362 = sink.context().makeBuffer(); buf_362.start(_M_STRING); buf_362.literal(1); buf_362.end();
          term_336 = buf_362.term();
        } sink.propertyNamed("$ColumnLocation", term_336);
        sink.start(_M__sTextCons);Term term_386;
        {
          BufferSink buf_281 = sink.context().makeBuffer(); buf_281.start(_M_STRING); buf_281.literal(1); buf_281.end();
          term_386 = buf_281.term();
        } sink.propertyNamed("$LineLocation", term_386);Term term_421;
        {
          BufferSink buf_556 = sink.context().makeBuffer(); buf_556.start(_M_STRING); buf_556.literal(1); buf_556.end();
          term_421 = buf_556.term();
        } sink.propertyNamed("$ColumnLocation", term_421);
        sink.start(_M__sTextEmbed);Term term_186;
        {
          BufferSink buf_503 = sink.context().makeBuffer(); buf_503.start(_M_STRING); buf_503.literal(1); buf_503.end();
          term_186 = buf_503.term();
        } sink.propertyNamed("$LineLocation", term_186);Term term_328;
        {
          BufferSink buf_209 = sink.context().makeBuffer(); buf_209.start(_M_STRING); buf_209.literal(1); buf_209.end();
          term_328 = buf_209.term();
        } sink.propertyNamed("$ColumnLocation", term_328);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xform); sink.copy(sub_67.ref());
        sink.end();
        sink.end();
        sink.end();Term term_68;
        {
          BufferSink buf_101 = sink.context().makeBuffer(); buf_101.start(_M_STRING); buf_101.literal(1); buf_101.end();
          term_68 = buf_101.term();
        } sink.propertyNamed("$LineLocation", term_68);Term term_187;
        {
          BufferSink buf_121 = sink.context().makeBuffer(); buf_121.start(_M_STRING); buf_121.literal(2); buf_121.end();
          term_187 = buf_121.term();
        } sink.propertyNamed("$ColumnLocation", term_187);
        sink.start(_M__sTextCons);Term term_201;
        {
          BufferSink buf_11 = sink.context().makeBuffer(); buf_11.start(_M_STRING); buf_11.literal(1); buf_11.end();
          term_201 = buf_11.term();
        } sink.propertyNamed("$LineLocation", term_201);Term term_143;
        {
          BufferSink buf_161 = sink.context().makeBuffer(); buf_161.start(_M_STRING); buf_161.literal(2); buf_161.end();
          term_143 = buf_161.term();
        } sink.propertyNamed("$ColumnLocation", term_143);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_222;
        {
          BufferSink buf_131 = sink.context().makeBuffer(); buf_131.start(_M_STRING); buf_131.literal(1); buf_131.end();
          term_222 = buf_131.term();
        } sink.propertyNamed("$LineLocation", term_222);Term term_377;
        {
          BufferSink buf_306 = sink.context().makeBuffer();
          buf_306.start(_M_STRING); buf_306.literal(23);
          buf_306.end();
          term_377 = buf_306.term();
        } sink.propertyNamed("$ColumnLocation", term_377);
        sink.start(_M__sTextCons);Term term_291;
        {
          BufferSink buf_239 = sink.context().makeBuffer(); buf_239.start(_M_STRING); buf_239.literal(1); buf_239.end();
          term_291 = buf_239.term();
        } sink.propertyNamed("$LineLocation", term_291);Term term_259;
        {
          BufferSink buf_111 = sink.context().makeBuffer();
          buf_111.start(_M_STRING); buf_111.literal(24);
          buf_111.end();
          term_259 = buf_111.term();
        } sink.propertyNamed("$ColumnLocation", term_259);
        sink.start(_M__sTextChars); sink.copy(sub_94.ref());
        sink.end();Term term_419;
        {
          BufferSink buf_417 = sink.context().makeBuffer(); buf_417.start(_M_STRING); buf_417.literal(1); buf_417.end();
          term_419 = buf_417.term();
        } sink.propertyNamed("$LineLocation", term_419);Term term_325;
        {
          BufferSink buf_432 = sink.context().makeBuffer();
          buf_432.start(_M_STRING); buf_432.literal(25);
          buf_432.end();
          term_325 = buf_432.term();
        } sink.propertyNamed("$ColumnLocation", term_325);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xforms_xS1, term_214);
  } final public static boolean _M_Crsx_xPrint_xforms(Sink sink, int shared, int depth, Term term_389) {
    if (depth < 2000) {
      label_40: {
        if (term_389.descriptor() != _M_Crsx_xforms)
        {   break label_40;
        }Term sub_71 = term_389.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_95;
        {
          BufferSink buf_265 = sink.context().makeBuffer(); buf_265.start(_M_STRING); buf_265.literal(1); buf_265.end();
          term_95 = buf_265.term();
        } sink.propertyNamed("$LineLocation", term_95);Term term_265;
        {
          BufferSink buf_271 = sink.context().makeBuffer(); buf_271.start(_M_STRING); buf_271.literal(1); buf_271.end();
          term_265 = buf_271.term();
        } sink.propertyNamed("$ColumnLocation", term_265);
        sink.start(_M__sTextCons);Term term_395;
        {
          BufferSink buf_474 = sink.context().makeBuffer(); buf_474.start(_M_STRING); buf_474.literal(1); buf_474.end();
          term_395 = buf_474.term();
        } sink.propertyNamed("$LineLocation", term_395);Term term_133;
        {
          BufferSink buf_175 = sink.context().makeBuffer(); buf_175.start(_M_STRING); buf_175.literal(1); buf_175.end();
          term_133 = buf_175.term();
        } sink.propertyNamed("$ColumnLocation", term_133);
        sink.start(_M__sTextEmbed);Term term_454;
        {
          BufferSink buf_123 = sink.context().makeBuffer(); buf_123.start(_M_STRING); buf_123.literal(1); buf_123.end();
          term_454 = buf_123.term();
        } sink.propertyNamed("$LineLocation", term_454);Term term_219;
        {
          BufferSink buf_428 = sink.context().makeBuffer(); buf_428.start(_M_STRING); buf_428.literal(1); buf_428.end();
          term_219 = buf_428.term();
        } sink.propertyNamed("$ColumnLocation", term_219);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_95 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_95});
        sink.start(_M_Crsx_xPrint_xforms_xS1); sink.use(var_95);
        sink.end(); sink.copy(sub_71.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_226;
        {
          BufferSink buf_618 = sink.context().makeBuffer(); buf_618.start(_M_STRING); buf_618.literal(1); buf_618.end();
          term_226 = buf_618.term();
        } sink.propertyNamed("$LineLocation", term_226);Term term_253;
        {
          BufferSink buf_207 = sink.context().makeBuffer();
          buf_207.start(_M_STRING); buf_207.literal(50);
          buf_207.end();
          term_253 = buf_207.term();
        } sink.propertyNamed("$ColumnLocation", term_253);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_394;
        {
          BufferSink buf_187 = sink.context().makeBuffer(); buf_187.start(_M_STRING); buf_187.literal(1); buf_187.end();
          term_394 = buf_187.term();
        } sink.propertyNamed("$LineLocation", term_394);Term term_287;
        {
          BufferSink buf_261 = sink.context().makeBuffer(); buf_261.start(_M_STRING); buf_261.literal(2); buf_261.end();
          term_287 = buf_261.term();
        } sink.propertyNamed("$ColumnLocation", term_287);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xforms, term_389);
  } final public static boolean _M_Crsx_xPrint_xsortarguments(Sink sink, int shared, int depth, Term term_171) {
    if (depth < 2000) {
      label_39: {
        if (term_171.descriptor() != _M_Crsx_xsortarguments)
        {   break label_39;
        }Term sub_81 = term_171.sub(0).ref();
        /* #1=sub */Term sub_135 = term_171.sub(1).ref();
        /* #2=sub */Term sub_253 = term_171.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_609;
        {
          BufferSink buf_156 = sink.context().makeBuffer(); buf_156.start(_M_STRING); buf_156.literal(1); buf_156.end();
          term_609 = buf_156.term();
        } sink.propertyNamed("$LineLocation", term_609);Term term_100;
        {
          BufferSink buf_107 = sink.context().makeBuffer(); buf_107.start(_M_STRING); buf_107.literal(1); buf_107.end();
          term_100 = buf_107.term();
        } sink.propertyNamed("$ColumnLocation", term_100);
        sink.start(_M__sTextCons);Term term_225;
        {
          BufferSink buf_361 = sink.context().makeBuffer(); buf_361.start(_M_STRING); buf_361.literal(1); buf_361.end();
          term_225 = buf_361.term();
        } sink.propertyNamed("$LineLocation", term_225);Term term_300;
        {
          BufferSink buf_311 = sink.context().makeBuffer(); buf_311.start(_M_STRING); buf_311.literal(2); buf_311.end();
          term_300 = buf_311.term();
        } sink.propertyNamed("$ColumnLocation", term_300);
        sink.start(_M__sTextChars); sink.copy(sub_81.ref());
        sink.end();Term term_470;
        {
          BufferSink buf_322 = sink.context().makeBuffer(); buf_322.start(_M_STRING); buf_322.literal(1); buf_322.end();
          term_470 = buf_322.term();
        } sink.propertyNamed("$LineLocation", term_470);Term term_301;
        {
          BufferSink buf_318 = sink.context().makeBuffer(); buf_318.start(_M_STRING); buf_318.literal(3); buf_318.end();
          term_301 = buf_318.term();
        } sink.propertyNamed("$ColumnLocation", term_301);
        sink.start(_M__sTextCons);Term term_184;
        {
          BufferSink buf_166 = sink.context().makeBuffer(); buf_166.start(_M_STRING); buf_166.literal(1); buf_166.end();
          term_184 = buf_166.term();
        } sink.propertyNamed("$LineLocation", term_184);Term term_296;
        {
          BufferSink buf_225 = sink.context().makeBuffer(); buf_225.start(_M_STRING); buf_225.literal(3); buf_225.end();
          term_296 = buf_225.term();
        } sink.propertyNamed("$ColumnLocation", term_296);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_409;
        {
          BufferSink buf_439 = sink.context().makeBuffer(); buf_439.start(_M_STRING); buf_439.literal(1); buf_439.end();
          term_409 = buf_439.term();
        } sink.propertyNamed("$LineLocation", term_409);Term term_435;
        {
          BufferSink buf_248 = sink.context().makeBuffer(); buf_248.start(_M_STRING); buf_248.literal(7); buf_248.end();
          term_435 = buf_248.term();
        } sink.propertyNamed("$ColumnLocation", term_435);
        sink.start(_M__sTextCons);Term term_130;
        {
          BufferSink buf_314 = sink.context().makeBuffer(); buf_314.start(_M_STRING); buf_314.literal(1); buf_314.end();
          term_130 = buf_314.term();
        } sink.propertyNamed("$LineLocation", term_130);Term term_584;
        {
          BufferSink buf_524 = sink.context().makeBuffer(); buf_524.start(_M_STRING); buf_524.literal(7); buf_524.end();
          term_584 = buf_524.term();
        } sink.propertyNamed("$ColumnLocation", term_584);
        sink.start(_M__sTextEmbed);Term term_123;
        {
          BufferSink buf_421 = sink.context().makeBuffer(); buf_421.start(_M_STRING); buf_421.literal(1); buf_421.end();
          term_123 = buf_421.term();
        } sink.propertyNamed("$LineLocation", term_123);Term term_266;
        {
          BufferSink buf_301 = sink.context().makeBuffer(); buf_301.start(_M_STRING); buf_301.literal(7); buf_301.end();
          term_266 = buf_301.term();
        } sink.propertyNamed("$ColumnLocation", term_266);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_48 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_48});
        sink.start(_M_Crsx_xPrint_xsortnames); sink.use(var_48);
        sink.end(); sink.copy(sub_135.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_274;
        {
          BufferSink buf_315 = sink.context().makeBuffer(); buf_315.start(_M_STRING); buf_315.literal(1); buf_315.end();
          term_274 = buf_315.term();
        } sink.propertyNamed("$LineLocation", term_274);Term term_348;
        {
          BufferSink buf_336 = sink.context().makeBuffer();
          buf_336.start(_M_STRING); buf_336.literal(57);
          buf_336.end();
          term_348 = buf_336.term();
        } sink.propertyNamed("$ColumnLocation", term_348);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_295;
        {
          BufferSink buf_153 = sink.context().makeBuffer(); buf_153.start(_M_STRING); buf_153.literal(1); buf_153.end();
          term_295 = buf_153.term();
        } sink.propertyNamed("$LineLocation", term_295);Term term_444;
        {
          BufferSink buf_201 = sink.context().makeBuffer(); buf_201.start(_M_STRING); buf_201.literal(8); buf_201.end();
          term_444 = buf_201.term();
        } sink.propertyNamed("$ColumnLocation", term_444);
        sink.start(_M__sTextCons);Term term_166;
        {
          BufferSink buf_393 = sink.context().makeBuffer(); buf_393.start(_M_STRING); buf_393.literal(1); buf_393.end();
          term_166 = buf_393.term();
        } sink.propertyNamed("$LineLocation", term_166);Term term_308;
        {
          BufferSink buf_487 = sink.context().makeBuffer(); buf_487.start(_M_STRING); buf_487.literal(8); buf_487.end();
          term_308 = buf_487.term();
        } sink.propertyNamed("$ColumnLocation", term_308);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_149;
        {
          BufferSink buf_202 = sink.context().makeBuffer(); buf_202.start(_M_STRING); buf_202.literal(1); buf_202.end();
          term_149 = buf_202.term();
        } sink.propertyNamed("$LineLocation", term_149);Term term_346;
        {
          BufferSink buf_619 = sink.context().makeBuffer();
          buf_619.start(_M_STRING); buf_619.literal(61);
          buf_619.end();
          term_346 = buf_619.term();
        } sink.propertyNamed("$ColumnLocation", term_346);
        sink.start(_M__sTextCons);Term term_305;
        {
          BufferSink buf_557 = sink.context().makeBuffer(); buf_557.start(_M_STRING); buf_557.literal(1); buf_557.end();
          term_305 = buf_557.term();
        } sink.propertyNamed("$LineLocation", term_305);Term term_82;
        {
          BufferSink buf_317 = sink.context().makeBuffer();
          buf_317.start(_M_STRING); buf_317.literal(62);
          buf_317.end();
          term_82 = buf_317.term();
        } sink.propertyNamed("$ColumnLocation", term_82);
        sink.start(_M__sTextChars); sink.copy(sub_253.ref());
        sink.end();Term term_340;
        {
          BufferSink buf_405 = sink.context().makeBuffer(); buf_405.start(_M_STRING); buf_405.literal(1); buf_405.end();
          term_340 = buf_405.term();
        } sink.propertyNamed("$LineLocation", term_340);Term term_400;
        {
          BufferSink buf_682 = sink.context().makeBuffer();
          buf_682.start(_M_STRING); buf_682.literal(63);
          buf_682.end();
          term_400 = buf_682.term();
        } sink.propertyNamed("$ColumnLocation", term_400);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xsortarguments, term_171);
  } final public static boolean _M_Crsx_xPrint_xsortname(Sink sink, int shared, int depth, Term term_262) {
    if (depth < 2000) {
      label_141: {
        if (term_262.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_141;
        }Term sub_125 = term_262.sub(0).ref();
        /* #1=sub */Term sub_36 = term_262.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_289;
        {
          BufferSink buf_267 = sink.context().makeBuffer(); buf_267.start(_M_STRING); buf_267.literal(1); buf_267.end();
          term_289 = buf_267.term();
        } sink.propertyNamed("$LineLocation", term_289);Term term_691;
        {
          BufferSink buf_320 = sink.context().makeBuffer(); buf_320.start(_M_STRING); buf_320.literal(1); buf_320.end();
          term_691 = buf_320.term();
        } sink.propertyNamed("$ColumnLocation", term_691);
        sink.start(_M__sTextCons);Term term_390;
        {
          BufferSink buf_479 = sink.context().makeBuffer(); buf_479.start(_M_STRING); buf_479.literal(1); buf_479.end();
          term_390 = buf_479.term();
        } sink.propertyNamed("$LineLocation", term_390);Term term_315;
        {
          BufferSink buf_220 = sink.context().makeBuffer(); buf_220.start(_M_STRING); buf_220.literal(1); buf_220.end();
          term_315 = buf_220.term();
        } sink.propertyNamed("$ColumnLocation", term_315);
        sink.start(_M__sTextEmbed);Term term_368;
        {
          BufferSink buf_97 = sink.context().makeBuffer(); buf_97.start(_M_STRING); buf_97.literal(1); buf_97.end();
          term_368 = buf_97.term();
        } sink.propertyNamed("$LineLocation", term_368);Term term_548;
        {
          BufferSink buf_485 = sink.context().makeBuffer(); buf_485.start(_M_STRING); buf_485.literal(1); buf_485.end();
          term_548 = buf_485.term();
        } sink.propertyNamed("$ColumnLocation", term_548);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_125.ref());
        sink.end();
        sink.end();
        sink.end();Term term_180;
        {
          BufferSink buf_243 = sink.context().makeBuffer(); buf_243.start(_M_STRING); buf_243.literal(1); buf_243.end();
          term_180 = buf_243.term();
        } sink.propertyNamed("$LineLocation", term_180);Term term_373;
        {
          BufferSink buf_247 = sink.context().makeBuffer(); buf_247.start(_M_STRING); buf_247.literal(2); buf_247.end();
          term_373 = buf_247.term();
        } sink.propertyNamed("$ColumnLocation", term_373);
        sink.start(_M__sTextCons);Term term_194;
        {
          BufferSink buf_234 = sink.context().makeBuffer(); buf_234.start(_M_STRING); buf_234.literal(1); buf_234.end();
          term_194 = buf_234.term();
        } sink.propertyNamed("$LineLocation", term_194);Term term_310;
        {
          BufferSink buf_226 = sink.context().makeBuffer(); buf_226.start(_M_STRING); buf_226.literal(2); buf_226.end();
          term_310 = buf_226.term();
        } sink.propertyNamed("$ColumnLocation", term_310);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_206;
        {
          BufferSink buf_360 = sink.context().makeBuffer(); buf_360.start(_M_STRING); buf_360.literal(1); buf_360.end();
          term_206 = buf_360.term();
        } sink.propertyNamed("$LineLocation", term_206);Term term_235;
        {
          BufferSink buf_250 = sink.context().makeBuffer();
          buf_250.start(_M_STRING); buf_250.literal(30);
          buf_250.end();
          term_235 = buf_250.term();
        } sink.propertyNamed("$ColumnLocation", term_235);
        sink.start(_M__sTextCons);Term term_661;
        {
          BufferSink buf_357 = sink.context().makeBuffer(); buf_357.start(_M_STRING); buf_357.literal(1); buf_357.end();
          term_661 = buf_357.term();
        } sink.propertyNamed("$LineLocation", term_661);Term term_254;
        {
          BufferSink buf_188 = sink.context().makeBuffer();
          buf_188.start(_M_STRING); buf_188.literal(30);
          buf_188.end();
          term_254 = buf_188.term();
        } sink.propertyNamed("$ColumnLocation", term_254);
        sink.start(_M__sTextEmbed);Term term_463;
        {
          BufferSink buf_383 = sink.context().makeBuffer(); buf_383.start(_M_STRING); buf_383.literal(1); buf_383.end();
          term_463 = buf_383.term();
        } sink.propertyNamed("$LineLocation", term_463);Term term_42;
        {
          BufferSink buf_750 = sink.context().makeBuffer();
          buf_750.start(_M_STRING); buf_750.literal(30);
          buf_750.end();
          term_42 = buf_750.term();
        } sink.propertyNamed("$ColumnLocation", term_42);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_85 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_85});
        sink.start(_M_Crsx_xPrint_xsortarguments); sink.use(var_85);
        sink.end(); sink.copy(sub_36.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_329;
        {
          BufferSink buf_344 = sink.context().makeBuffer(); buf_344.start(_M_STRING); buf_344.literal(1); buf_344.end();
          term_329 = buf_344.term();
        } sink.propertyNamed("$LineLocation", term_329);Term term_674;
        {
          BufferSink buf_104 = sink.context().makeBuffer();
          buf_104.start(_M_STRING); buf_104.literal(84);
          buf_104.end();
          term_674 = buf_104.term();
        } sink.propertyNamed("$ColumnLocation", term_674);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_667;
        {
          BufferSink buf_100 = sink.context().makeBuffer(); buf_100.start(_M_STRING); buf_100.literal(1); buf_100.end();
          term_667 = buf_100.term();
        } sink.propertyNamed("$LineLocation", term_667);Term term_366;
        {
          BufferSink buf_529 = sink.context().makeBuffer();
          buf_529.start(_M_STRING); buf_529.literal(31);
          buf_529.end();
          term_366 = buf_529.term();
        } sink.propertyNamed("$ColumnLocation", term_366);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_67: {
        if (term_262.descriptor() != _M_Crsx_xsortname_xA2)
        {   break label_67;
        }Term sub_86 = term_262.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_158;
        {
          BufferSink buf_573 = sink.context().makeBuffer(); buf_573.start(_M_STRING); buf_573.literal(1); buf_573.end();
          term_158 = buf_573.term();
        } sink.propertyNamed("$LineLocation", term_158);Term term_361;
        {
          BufferSink buf_120 = sink.context().makeBuffer(); buf_120.start(_M_STRING); buf_120.literal(1); buf_120.end();
          term_361 = buf_120.term();
        } sink.propertyNamed("$ColumnLocation", term_361);
        sink.start(_M__sTextCons);Term term_297;
        {
          BufferSink buf_419 = sink.context().makeBuffer(); buf_419.start(_M_STRING); buf_419.literal(1); buf_419.end();
          term_297 = buf_419.term();
        } sink.propertyNamed("$LineLocation", term_297);Term term_173;
        {
          BufferSink buf_194 = sink.context().makeBuffer(); buf_194.start(_M_STRING); buf_194.literal(1); buf_194.end();
          term_173 = buf_194.term();
        } sink.propertyNamed("$ColumnLocation", term_173);
        sink.start(_M__sTextEmbed);Term term_216;
        {
          BufferSink buf_150 = sink.context().makeBuffer(); buf_150.start(_M_STRING); buf_150.literal(1); buf_150.end();
          term_216 = buf_150.term();
        } sink.propertyNamed("$LineLocation", term_216);Term term_299;
        {
          BufferSink buf_128 = sink.context().makeBuffer(); buf_128.start(_M_STRING); buf_128.literal(1); buf_128.end();
          term_299 = buf_128.term();
        } sink.propertyNamed("$ColumnLocation", term_299);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xvariable); sink.copy(sub_86.ref());
        sink.end();
        sink.end();
        sink.end();Term term_101;
        {
          BufferSink buf_263 = sink.context().makeBuffer(); buf_263.start(_M_STRING); buf_263.literal(1); buf_263.end();
          term_101 = buf_263.term();
        } sink.propertyNamed("$LineLocation", term_101);Term term_330;
        {
          BufferSink buf_125 = sink.context().makeBuffer(); buf_125.start(_M_STRING); buf_125.literal(2); buf_125.end();
          term_330 = buf_125.term();
        } sink.propertyNamed("$ColumnLocation", term_330);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xsortname, term_262);
  } final public static boolean _M_Crsx_xPrint_xsortnames_xS1(Sink sink, int shared, int depth, Term term_587) {
    if (depth < 2000) {
      label_17: {
        if (term_587.descriptor() != _M_Crsx_xsortnames_xS1)
        {   break label_17;
        }Term sub_8 = term_587.sub(0).ref();
        /* #1=sub */Term sub_14 = term_587.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_164;
        {
          BufferSink buf_695 = sink.context().makeBuffer(); buf_695.start(_M_STRING); buf_695.literal(1); buf_695.end();
          term_164 = buf_695.term();
        } sink.propertyNamed("$LineLocation", term_164);Term term_157;
        {
          BufferSink buf_484 = sink.context().makeBuffer(); buf_484.start(_M_STRING); buf_484.literal(1); buf_484.end();
          term_157 = buf_484.term();
        } sink.propertyNamed("$ColumnLocation", term_157);
        sink.start(_M__sTextCons);Term term_496;
        {
          BufferSink buf_343 = sink.context().makeBuffer(); buf_343.start(_M_STRING); buf_343.literal(1); buf_343.end();
          term_496 = buf_343.term();
        } sink.propertyNamed("$LineLocation", term_496);Term term_414;
        {
          BufferSink buf_377 = sink.context().makeBuffer(); buf_377.start(_M_STRING); buf_377.literal(2); buf_377.end();
          term_414 = buf_377.term();
        } sink.propertyNamed("$ColumnLocation", term_414);
        sink.start(_M__sTextChars); sink.copy(sub_8.ref());
        sink.end();Term term_598;
        {
          BufferSink buf_501 = sink.context().makeBuffer(); buf_501.start(_M_STRING); buf_501.literal(1); buf_501.end();
          term_598 = buf_501.term();
        } sink.propertyNamed("$LineLocation", term_598);Term term_298;
        {
          BufferSink buf_203 = sink.context().makeBuffer(); buf_203.start(_M_STRING); buf_203.literal(3); buf_203.end();
          term_298 = buf_203.term();
        } sink.propertyNamed("$ColumnLocation", term_298);
        sink.start(_M__sTextCons);Term term_714;
        {
          BufferSink buf_543 = sink.context().makeBuffer(); buf_543.start(_M_STRING); buf_543.literal(1); buf_543.end();
          term_714 = buf_543.term();
        } sink.propertyNamed("$LineLocation", term_714);Term term_122;
        {
          BufferSink buf_540 = sink.context().makeBuffer(); buf_540.start(_M_STRING); buf_540.literal(3); buf_540.end();
          term_122 = buf_540.term();
        } sink.propertyNamed("$ColumnLocation", term_122);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_109;
        {
          BufferSink buf_145 = sink.context().makeBuffer(); buf_145.start(_M_STRING); buf_145.literal(1); buf_145.end();
          term_109 = buf_145.term();
        } sink.propertyNamed("$LineLocation", term_109);Term term_208;
        {
          BufferSink buf_350 = sink.context().makeBuffer(); buf_350.start(_M_STRING); buf_350.literal(7); buf_350.end();
          term_208 = buf_350.term();
        } sink.propertyNamed("$ColumnLocation", term_208);
        sink.start(_M__sTextCons);Term term_383;
        {
          BufferSink buf_222 = sink.context().makeBuffer(); buf_222.start(_M_STRING); buf_222.literal(1); buf_222.end();
          term_383 = buf_222.term();
        } sink.propertyNamed("$LineLocation", term_383);Term term_211;
        {
          BufferSink buf_289 = sink.context().makeBuffer(); buf_289.start(_M_STRING); buf_289.literal(7); buf_289.end();
          term_211 = buf_289.term();
        } sink.propertyNamed("$ColumnLocation", term_211);
        sink.start(_M__sTextEmbed);Term term_378;
        {
          BufferSink buf_42 = sink.context().makeBuffer(); buf_42.start(_M_STRING); buf_42.literal(1); buf_42.end();
          term_378 = buf_42.term();
        } sink.propertyNamed("$LineLocation", term_378);Term term_391;
        {
          BufferSink buf_280 = sink.context().makeBuffer(); buf_280.start(_M_STRING); buf_280.literal(7); buf_280.end();
          term_391 = buf_280.term();
        } sink.propertyNamed("$ColumnLocation", term_391);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xsortname); sink.copy(sub_14.ref());
        sink.end();
        sink.end();
        sink.end();Term term_327;
        {
          BufferSink buf_590 = sink.context().makeBuffer(); buf_590.start(_M_STRING); buf_590.literal(1); buf_590.end();
          term_327 = buf_590.term();
        } sink.propertyNamed("$LineLocation", term_327);Term term_233;
        {
          BufferSink buf_453 = sink.context().makeBuffer(); buf_453.start(_M_STRING); buf_453.literal(8); buf_453.end();
          term_233 = buf_453.term();
        } sink.propertyNamed("$ColumnLocation", term_233);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xsortnames_xS1, term_587);
  } final public static boolean _M_Crsx_xPrint_xsortnames(Sink sink, int shared, int depth, Term term_30) {
    if (depth < 2000) {
      label_43: {
        if (term_30.descriptor() != _M_Crsx_xsortnames)
        {   break label_43;
        }Term sub_21 = term_30.sub(0).ref();
        /* #1=sub */Term sub_10 = term_30.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_398;
        {
          BufferSink buf_216 = sink.context().makeBuffer(); buf_216.start(_M_STRING); buf_216.literal(1); buf_216.end();
          term_398 = buf_216.term();
        } sink.propertyNamed("$LineLocation", term_398);Term term_363;
        {
          BufferSink buf_427 = sink.context().makeBuffer(); buf_427.start(_M_STRING); buf_427.literal(1); buf_427.end();
          term_363 = buf_427.term();
        } sink.propertyNamed("$ColumnLocation", term_363);
        sink.start(_M__sTextCons);Term term_244;
        {
          BufferSink buf_356 = sink.context().makeBuffer(); buf_356.start(_M_STRING); buf_356.literal(1); buf_356.end();
          term_244 = buf_356.term();
        } sink.propertyNamed("$LineLocation", term_244);Term term_282;
        {
          BufferSink buf_353 = sink.context().makeBuffer(); buf_353.start(_M_STRING); buf_353.literal(1); buf_353.end();
          term_282 = buf_353.term();
        } sink.propertyNamed("$ColumnLocation", term_282);
        sink.start(_M__sTextEmbed);Term term_144;
        {
          BufferSink buf_587 = sink.context().makeBuffer(); buf_587.start(_M_STRING); buf_587.literal(1); buf_587.end();
          term_144 = buf_587.term();
        } sink.propertyNamed("$LineLocation", term_144);Term term_474;
        {
          BufferSink buf_154 = sink.context().makeBuffer(); buf_154.start(_M_STRING); buf_154.literal(1); buf_154.end();
          term_474 = buf_154.term();
        } sink.propertyNamed("$ColumnLocation", term_474);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xsortname); sink.copy(sub_21.ref());
        sink.end();
        sink.end();
        sink.end();Term term_408;
        {
          BufferSink buf_106 = sink.context().makeBuffer(); buf_106.start(_M_STRING); buf_106.literal(1); buf_106.end();
          term_408 = buf_106.term();
        } sink.propertyNamed("$LineLocation", term_408);Term term_239;
        {
          BufferSink buf_396 = sink.context().makeBuffer(); buf_396.start(_M_STRING); buf_396.literal(2); buf_396.end();
          term_239 = buf_396.term();
        } sink.propertyNamed("$ColumnLocation", term_239);
        sink.start(_M__sTextCons);Term term_342;
        {
          BufferSink buf_224 = sink.context().makeBuffer(); buf_224.start(_M_STRING); buf_224.literal(1); buf_224.end();
          term_342 = buf_224.term();
        } sink.propertyNamed("$LineLocation", term_342);Term term_355;
        {
          BufferSink buf_325 = sink.context().makeBuffer(); buf_325.start(_M_STRING); buf_325.literal(2); buf_325.end();
          term_355 = buf_325.term();
        } sink.propertyNamed("$ColumnLocation", term_355);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_489;
        {
          BufferSink buf_508 = sink.context().makeBuffer(); buf_508.start(_M_STRING); buf_508.literal(1); buf_508.end();
          term_489 = buf_508.term();
        } sink.propertyNamed("$LineLocation", term_489);Term term_412;
        {
          BufferSink buf_272 = sink.context().makeBuffer();
          buf_272.start(_M_STRING); buf_272.literal(27);
          buf_272.end();
          term_412 = buf_272.term();
        } sink.propertyNamed("$ColumnLocation", term_412);
        sink.start(_M__sTextCons);Term term_468;
        {
          BufferSink buf_262 = sink.context().makeBuffer(); buf_262.start(_M_STRING); buf_262.literal(1); buf_262.end();
          term_468 = buf_262.term();
        } sink.propertyNamed("$LineLocation", term_468);Term term_465;
        {
          BufferSink buf_219 = sink.context().makeBuffer();
          buf_219.start(_M_STRING); buf_219.literal(27);
          buf_219.end();
          term_465 = buf_219.term();
        } sink.propertyNamed("$ColumnLocation", term_465);
        sink.start(_M__sTextEmbed);Term term_885;
        {
          BufferSink buf_588 = sink.context().makeBuffer(); buf_588.start(_M_STRING); buf_588.literal(1); buf_588.end();
          term_885 = buf_588.term();
        } sink.propertyNamed("$LineLocation", term_885);Term term_367;
        {
          BufferSink buf_363 = sink.context().makeBuffer();
          buf_363.start(_M_STRING); buf_363.literal(27);
          buf_363.end();
          term_367 = buf_363.term();
        } sink.propertyNamed("$ColumnLocation", term_367);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_98 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_98});
        sink.start(_M_Crsx_xPrint_xsortnames_xS1); sink.use(var_98);
        sink.end(); sink.copy(sub_10.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_517;
        {
          BufferSink buf_358 = sink.context().makeBuffer(); buf_358.start(_M_STRING); buf_358.literal(1); buf_358.end();
          term_517 = buf_358.term();
        } sink.propertyNamed("$LineLocation", term_517);Term term_240;
        {
          BufferSink buf_558 = sink.context().makeBuffer();
          buf_558.start(_M_STRING); buf_558.literal(80);
          buf_558.end();
          term_240 = buf_558.term();
        } sink.propertyNamed("$ColumnLocation", term_240);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_369;
        {
          BufferSink buf_339 = sink.context().makeBuffer(); buf_339.start(_M_STRING); buf_339.literal(1); buf_339.end();
          term_369 = buf_339.term();
        } sink.propertyNamed("$LineLocation", term_369);Term term_247;
        {
          BufferSink buf_213 = sink.context().makeBuffer();
          buf_213.start(_M_STRING); buf_213.literal(28);
          buf_213.end();
          term_247 = buf_213.term();
        } sink.propertyNamed("$ColumnLocation", term_247);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xsortnames, term_30);
  } final public static boolean _M_Crsx_xPrint_xsortset(Sink sink, int shared, int depth, Term term_699) {
    if (depth < 2000) {
      label_53: {
        if (term_699.descriptor() != _M_Crsx_xsortset)
        {   break label_53;
        }Term sub_38 = term_699.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_177;
        {
          BufferSink buf_378 = sink.context().makeBuffer(); buf_378.start(_M_STRING); buf_378.literal(1); buf_378.end();
          term_177 = buf_378.term();
        } sink.propertyNamed("$LineLocation", term_177);Term term_306;
        {
          BufferSink buf_367 = sink.context().makeBuffer(); buf_367.start(_M_STRING); buf_367.literal(1); buf_367.end();
          term_306 = buf_367.term();
        } sink.propertyNamed("$ColumnLocation", term_306);
        sink.start(_M__sTextCons);Term term_478;
        {
          BufferSink buf_331 = sink.context().makeBuffer(); buf_331.start(_M_STRING); buf_331.literal(1); buf_331.end();
          term_478 = buf_331.term();
        } sink.propertyNamed("$LineLocation", term_478);Term term_525;
        {
          BufferSink buf_673 = sink.context().makeBuffer(); buf_673.start(_M_STRING); buf_673.literal(1); buf_673.end();
          term_525 = buf_673.term();
        } sink.propertyNamed("$ColumnLocation", term_525);
        sink.start(_M__sTextEmbed);Term term_467;
        {
          BufferSink buf_206 = sink.context().makeBuffer(); buf_206.start(_M_STRING); buf_206.literal(1); buf_206.end();
          term_467 = buf_206.term();
        } sink.propertyNamed("$LineLocation", term_467);Term term_213;
        {
          BufferSink buf_580 = sink.context().makeBuffer(); buf_580.start(_M_STRING); buf_580.literal(1); buf_580.end();
          term_213 = buf_580.term();
        } sink.propertyNamed("$ColumnLocation", term_213);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_73 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_73});
        sink.start(_M_Crsx_xPrint_xproperties); sink.use(var_73);
        sink.end(); sink.copy(sub_38.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_425;
        {
          BufferSink buf_668 = sink.context().makeBuffer(); buf_668.start(_M_STRING); buf_668.literal(1); buf_668.end();
          term_425 = buf_668.term();
        } sink.propertyNamed("$LineLocation", term_425);Term term_469;
        {
          BufferSink buf_665 = sink.context().makeBuffer();
          buf_665.start(_M_STRING); buf_665.literal(52);
          buf_665.end();
          term_469 = buf_665.term();
        } sink.propertyNamed("$ColumnLocation", term_469);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_302;
        {
          BufferSink buf_316 = sink.context().makeBuffer(); buf_316.start(_M_STRING); buf_316.literal(1); buf_316.end();
          term_302 = buf_316.term();
        } sink.propertyNamed("$LineLocation", term_302);Term term_676;
        {
          BufferSink buf_371 = sink.context().makeBuffer(); buf_371.start(_M_STRING); buf_371.literal(2); buf_371.end();
          term_676 = buf_371.term();
        } sink.propertyNamed("$ColumnLocation", term_676);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xsortset, term_699);
  } final public static boolean _M_Crsx_xPrint_xsortparams(Sink sink, int shared, int depth, Term term_521) {
    if (depth < 2000) {
      label_80: {
        if (term_521.descriptor() != _M_Crsx_xsortparams)
        {   break label_80;
        }Term sub_173 = term_521.sub(0).ref();
        /* #1=sub */Term sub_33 = term_521.sub(1).ref();
        /* #2=sub */Term sub_90 = term_521.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_339;
        {
          BufferSink buf_147 = sink.context().makeBuffer(); buf_147.start(_M_STRING); buf_147.literal(1); buf_147.end();
          term_339 = buf_147.term();
        } sink.propertyNamed("$LineLocation", term_339);Term term_102;
        {
          BufferSink buf_765 = sink.context().makeBuffer(); buf_765.start(_M_STRING); buf_765.literal(1); buf_765.end();
          term_102 = buf_765.term();
        } sink.propertyNamed("$ColumnLocation", term_102);
        sink.start(_M__sTextCons);Term term_513;
        {
          BufferSink buf_307 = sink.context().makeBuffer(); buf_307.start(_M_STRING); buf_307.literal(1); buf_307.end();
          term_513 = buf_307.term();
        } sink.propertyNamed("$LineLocation", term_513);Term term_352;
        {
          BufferSink buf_567 = sink.context().makeBuffer(); buf_567.start(_M_STRING); buf_567.literal(2); buf_567.end();
          term_352 = buf_567.term();
        } sink.propertyNamed("$ColumnLocation", term_352);
        sink.start(_M__sTextChars); sink.copy(sub_173.ref());
        sink.end();Term term_682;
        {
          BufferSink buf_638 = sink.context().makeBuffer(); buf_638.start(_M_STRING); buf_638.literal(1); buf_638.end();
          term_682 = buf_638.term();
        } sink.propertyNamed("$LineLocation", term_682);Term term_252;
        {
          BufferSink buf_340 = sink.context().makeBuffer(); buf_340.start(_M_STRING); buf_340.literal(3); buf_340.end();
          term_252 = buf_340.term();
        } sink.propertyNamed("$ColumnLocation", term_252);
        sink.start(_M__sTextCons);Term term_986;
        {
          BufferSink buf_217 = sink.context().makeBuffer(); buf_217.start(_M_STRING); buf_217.literal(1); buf_217.end();
          term_986 = buf_217.term();
        } sink.propertyNamed("$LineLocation", term_986);Term term_700;
        {
          BufferSink buf_481 = sink.context().makeBuffer(); buf_481.start(_M_STRING); buf_481.literal(3); buf_481.end();
          term_700 = buf_481.term();
        } sink.propertyNamed("$ColumnLocation", term_700);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_488;
        {
          BufferSink buf_614 = sink.context().makeBuffer(); buf_614.start(_M_STRING); buf_614.literal(1); buf_614.end();
          term_488 = buf_614.term();
        } sink.propertyNamed("$LineLocation", term_488);Term term_420;
        {
          BufferSink buf_293 = sink.context().makeBuffer(); buf_293.start(_M_STRING); buf_293.literal(7); buf_293.end();
          term_420 = buf_293.term();
        } sink.propertyNamed("$ColumnLocation", term_420);
        sink.start(_M__sTextCons);Term term_385;
        {
          BufferSink buf_478 = sink.context().makeBuffer(); buf_478.start(_M_STRING); buf_478.literal(1); buf_478.end();
          term_385 = buf_478.term();
        } sink.propertyNamed("$LineLocation", term_385);Term term_311;
        {
          BufferSink buf_297 = sink.context().makeBuffer(); buf_297.start(_M_STRING); buf_297.literal(7); buf_297.end();
          term_311 = buf_297.term();
        } sink.propertyNamed("$ColumnLocation", term_311);
        sink.start(_M__sTextEmbed);Term term_188;
        {
          BufferSink buf_509 = sink.context().makeBuffer(); buf_509.start(_M_STRING); buf_509.literal(1); buf_509.end();
          term_188 = buf_509.term();
        } sink.propertyNamed("$LineLocation", term_188);Term term_172;
        {
          BufferSink buf_254 = sink.context().makeBuffer(); buf_254.start(_M_STRING); buf_254.literal(7); buf_254.end();
          term_172 = buf_254.term();
        } sink.propertyNamed("$ColumnLocation", term_172);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_22 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_22});
        sink.start(_M_Crsx_xPrint_xvariable); sink.use(var_22);
        sink.end(); sink.copy(sub_33.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_290;
        {
          BufferSink buf_392 = sink.context().makeBuffer(); buf_392.start(_M_STRING); buf_392.literal(1); buf_392.end();
          term_290 = buf_392.term();
        } sink.propertyNamed("$LineLocation", term_290);Term term_416;
        {
          BufferSink buf_366 = sink.context().makeBuffer();
          buf_366.start(_M_STRING); buf_366.literal(56);
          buf_366.end();
          term_416 = buf_366.term();
        } sink.propertyNamed("$ColumnLocation", term_416);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_436;
        {
          BufferSink buf_380 = sink.context().makeBuffer(); buf_380.start(_M_STRING); buf_380.literal(1); buf_380.end();
          term_436 = buf_380.term();
        } sink.propertyNamed("$LineLocation", term_436);Term term_694;
        {
          BufferSink buf_146 = sink.context().makeBuffer(); buf_146.start(_M_STRING); buf_146.literal(8); buf_146.end();
          term_694 = buf_146.term();
        } sink.propertyNamed("$ColumnLocation", term_694);
        sink.start(_M__sTextCons);Term term_212;
        {
          BufferSink buf_592 = sink.context().makeBuffer(); buf_592.start(_M_STRING); buf_592.literal(1); buf_592.end();
          term_212 = buf_592.term();
        } sink.propertyNamed("$LineLocation", term_212);Term term_415;
        {
          BufferSink buf_631 = sink.context().makeBuffer(); buf_631.start(_M_STRING); buf_631.literal(8); buf_631.end();
          term_415 = buf_631.term();
        } sink.propertyNamed("$ColumnLocation", term_415);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_356;
        {
          BufferSink buf_259 = sink.context().makeBuffer(); buf_259.start(_M_STRING); buf_259.literal(1); buf_259.end();
          term_356 = buf_259.term();
        } sink.propertyNamed("$LineLocation", term_356);Term term_568;
        {
          BufferSink buf_579 = sink.context().makeBuffer();
          buf_579.start(_M_STRING); buf_579.literal(60);
          buf_579.end();
          term_568 = buf_579.term();
        } sink.propertyNamed("$ColumnLocation", term_568);
        sink.start(_M__sTextCons);Term term_380;
        {
          BufferSink buf_596 = sink.context().makeBuffer(); buf_596.start(_M_STRING); buf_596.literal(1); buf_596.end();
          term_380 = buf_596.term();
        } sink.propertyNamed("$LineLocation", term_380);Term term_404;
        {
          BufferSink buf_299 = sink.context().makeBuffer();
          buf_299.start(_M_STRING); buf_299.literal(61);
          buf_299.end();
          term_404 = buf_299.term();
        } sink.propertyNamed("$ColumnLocation", term_404);
        sink.start(_M__sTextChars); sink.copy(sub_90.ref());
        sink.end();Term term_304;
        {
          BufferSink buf_397 = sink.context().makeBuffer(); buf_397.start(_M_STRING); buf_397.literal(1); buf_397.end();
          term_304 = buf_397.term();
        } sink.propertyNamed("$LineLocation", term_304);Term term_735;
        {
          BufferSink buf_471 = sink.context().makeBuffer();
          buf_471.start(_M_STRING); buf_471.literal(62);
          buf_471.end();
          term_735 = buf_471.term();
        } sink.propertyNamed("$ColumnLocation", term_735);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xsortparams, term_521);
  } final public static boolean _M_Crsx_xPrint_xsortDeclaration(Sink sink, int shared, int depth, Term term_410) {
    if (depth < 2000) {
      label_77: {
        if (term_410.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_77;
        }Term sub_52 = term_410.sub(0).ref();
        /* #1=sub */Term sub_95 = term_410.sub(1).ref();
        /* #2=sub */Term sub_64 = term_410.sub(2).ref();
        /* #3=sub */Term sub_32 = term_410.sub(3).ref();
        /* #4=sub */Term sub_96 = term_410.sub(4).ref();
        /* #5=sub */Term sub_154 = term_410.sub(5).ref();
        /* #6=sub */Term sub_59 = term_410.sub(6).ref();
        /* #7=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_809;
        {
          BufferSink buf_1034 = sink.context().makeBuffer();
          buf_1034.start(_M_STRING); buf_1034.literal(1);
          buf_1034.end();
          term_809 = buf_1034.term();
        } sink.propertyNamed("$LineLocation", term_809);Term term_113;
        {
          BufferSink buf_312 = sink.context().makeBuffer(); buf_312.start(_M_STRING); buf_312.literal(1); buf_312.end();
          term_113 = buf_312.term();
        } sink.propertyNamed("$ColumnLocation", term_113);
        sink.start(_M__sTextCons);Term term_275;
        {
          BufferSink buf_253 = sink.context().makeBuffer(); buf_253.start(_M_STRING); buf_253.literal(1); buf_253.end();
          term_275 = buf_253.term();
        } sink.propertyNamed("$LineLocation", term_275);Term term_473;
        {
          BufferSink buf_237 = sink.context().makeBuffer(); buf_237.start(_M_STRING); buf_237.literal(1); buf_237.end();
          term_473 = buf_237.term();
        } sink.propertyNamed("$ColumnLocation", term_473);
        sink.start(_M__sTextEmbed);Term term_294;
        {
          BufferSink buf_373 = sink.context().makeBuffer(); buf_373.start(_M_STRING); buf_373.literal(1); buf_373.end();
          term_294 = buf_373.term();
        } sink.propertyNamed("$LineLocation", term_294);Term term_392;
        {
          BufferSink buf_451 = sink.context().makeBuffer(); buf_451.start(_M_STRING); buf_451.literal(1); buf_451.end();
          term_392 = buf_451.term();
        } sink.propertyNamed("$ColumnLocation", term_392);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_74 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_74});
        sink.start(_M_Crsx_xPrint_xsortparams); sink.use(var_74);
        sink.end(); sink.copy(sub_52.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_434;
        {
          BufferSink buf_584 = sink.context().makeBuffer(); buf_584.start(_M_STRING); buf_584.literal(1); buf_584.end();
          term_434 = buf_584.term();
        } sink.propertyNamed("$LineLocation", term_434);Term term_237;
        {
          BufferSink buf_235 = sink.context().makeBuffer();
          buf_235.start(_M_STRING); buf_235.literal(52);
          buf_235.end();
          term_237 = buf_235.term();
        } sink.propertyNamed("$ColumnLocation", term_237);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_268;
        {
          BufferSink buf_372 = sink.context().makeBuffer(); buf_372.start(_M_STRING); buf_372.literal(1); buf_372.end();
          term_268 = buf_372.term();
        } sink.propertyNamed("$LineLocation", term_268);Term term_195;
        {
          BufferSink buf_249 = sink.context().makeBuffer(); buf_249.start(_M_STRING); buf_249.literal(2); buf_249.end();
          term_195 = buf_249.term();
        } sink.propertyNamed("$ColumnLocation", term_195);
        sink.start(_M__sTextCons);Term term_701;
        {
          BufferSink buf_408 = sink.context().makeBuffer(); buf_408.start(_M_STRING); buf_408.literal(1); buf_408.end();
          term_701 = buf_408.term();
        } sink.propertyNamed("$LineLocation", term_701);Term term_372;
        {
          BufferSink buf_838 = sink.context().makeBuffer(); buf_838.start(_M_STRING); buf_838.literal(2); buf_838.end();
          term_372 = buf_838.term();
        } sink.propertyNamed("$ColumnLocation", term_372);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_543;
        {
          BufferSink buf_460 = sink.context().makeBuffer(); buf_460.start(_M_STRING); buf_460.literal(1); buf_460.end();
          term_543 = buf_460.term();
        } sink.propertyNamed("$LineLocation", term_543);Term term_479;
        {
          BufferSink buf_522 = sink.context().makeBuffer();
          buf_522.start(_M_STRING); buf_522.literal(56);
          buf_522.end();
          term_479 = buf_522.term();
        } sink.propertyNamed("$ColumnLocation", term_479);
        sink.start(_M__sTextCons);Term term_387;
        {
          BufferSink buf_758 = sink.context().makeBuffer(); buf_758.start(_M_STRING); buf_758.literal(1); buf_758.end();
          term_387 = buf_758.term();
        } sink.propertyNamed("$LineLocation", term_387);Term term_646;
        {
          BufferSink buf_275 = sink.context().makeBuffer();
          buf_275.start(_M_STRING); buf_275.literal(56);
          buf_275.end();
          term_646 = buf_275.term();
        } sink.propertyNamed("$ColumnLocation", term_646);
        sink.start(_M__sTextEmbed);Term term_245;
        {
          BufferSink buf_463 = sink.context().makeBuffer(); buf_463.start(_M_STRING); buf_463.literal(1); buf_463.end();
          term_245 = buf_463.term();
        } sink.propertyNamed("$LineLocation", term_245);Term term_441;
        {
          BufferSink buf_655 = sink.context().makeBuffer();
          buf_655.start(_M_STRING); buf_655.literal(56);
          buf_655.end();
          term_441 = buf_655.term();
        } sink.propertyNamed("$ColumnLocation", term_441);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xsortset); sink.copy(sub_95.ref());
        sink.end();
        sink.end();
        sink.end();Term term_402;
        {
          BufferSink buf_277 = sink.context().makeBuffer(); buf_277.start(_M_STRING); buf_277.literal(1); buf_277.end();
          term_402 = buf_277.term();
        } sink.propertyNamed("$LineLocation", term_402);Term term_564;
        {
          BufferSink buf_494 = sink.context().makeBuffer();
          buf_494.start(_M_STRING); buf_494.literal(57);
          buf_494.end();
          term_564 = buf_494.term();
        } sink.propertyNamed("$ColumnLocation", term_564);
        sink.start(_M__sTextCons);Term term_629;
        {
          BufferSink buf_210 = sink.context().makeBuffer(); buf_210.start(_M_STRING); buf_210.literal(1); buf_210.end();
          term_629 = buf_210.term();
        } sink.propertyNamed("$LineLocation", term_629);Term term_726;
        {
          BufferSink buf_739 = sink.context().makeBuffer();
          buf_739.start(_M_STRING); buf_739.literal(57);
          buf_739.end();
          term_726 = buf_739.term();
        } sink.propertyNamed("$ColumnLocation", term_726);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_204;
        {
          BufferSink buf_489 = sink.context().makeBuffer(); buf_489.start(_M_STRING); buf_489.literal(1); buf_489.end();
          term_204 = buf_489.term();
        } sink.propertyNamed("$LineLocation", term_204);Term term_524;
        {
          BufferSink buf_341 = sink.context().makeBuffer();
          buf_341.start(_M_STRING); buf_341.literal(81);
          buf_341.end();
          term_524 = buf_341.term();
        } sink.propertyNamed("$ColumnLocation", term_524);
        sink.start(_M__sTextCons);Term term_567;
        {
          BufferSink buf_446 = sink.context().makeBuffer(); buf_446.start(_M_STRING); buf_446.literal(1); buf_446.end();
          term_567 = buf_446.term();
        } sink.propertyNamed("$LineLocation", term_567);Term term_322;
        {
          BufferSink buf_215 = sink.context().makeBuffer();
          buf_215.start(_M_STRING); buf_215.literal(81);
          buf_215.end();
          term_322 = buf_215.term();
        } sink.propertyNamed("$ColumnLocation", term_322);
        sink.start(_M__sTextEmbed);Term term_376;
        {
          BufferSink buf_296 = sink.context().makeBuffer(); buf_296.start(_M_STRING); buf_296.literal(1); buf_296.end();
          term_376 = buf_296.term();
        } sink.propertyNamed("$LineLocation", term_376);Term term_429;
        {
          BufferSink buf_135 = sink.context().makeBuffer();
          buf_135.start(_M_STRING); buf_135.literal(81);
          buf_135.end();
          term_429 = buf_135.term();
        } sink.propertyNamed("$ColumnLocation", term_429);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xsortname); sink.copy(sub_64.ref());
        sink.end();
        sink.end();
        sink.end();Term term_724;
        {
          BufferSink buf_518 = sink.context().makeBuffer(); buf_518.start(_M_STRING); buf_518.literal(1); buf_518.end();
          term_724 = buf_518.term();
        } sink.propertyNamed("$LineLocation", term_724);Term term_631;
        {
          BufferSink buf_452 = sink.context().makeBuffer();
          buf_452.start(_M_STRING); buf_452.literal(82);
          buf_452.end();
          term_631 = buf_452.term();
        } sink.propertyNamed("$ColumnLocation", term_631);
        sink.start(_M__sTextCons);Term term_556;
        {
          BufferSink buf_308 = sink.context().makeBuffer(); buf_308.start(_M_STRING); buf_308.literal(1); buf_308.end();
          term_556 = buf_308.term();
        } sink.propertyNamed("$LineLocation", term_556);Term term_284;
        {
          BufferSink buf_459 = sink.context().makeBuffer();
          buf_459.start(_M_STRING); buf_459.literal(82);
          buf_459.end();
          term_284 = buf_459.term();
        } sink.propertyNamed("$ColumnLocation", term_284);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_384;
        {
          BufferSink buf_398 = sink.context().makeBuffer(); buf_398.start(_M_STRING); buf_398.literal(1); buf_398.end();
          term_384 = buf_398.term();
        } sink.propertyNamed("$LineLocation", term_384);Term term_196;
        {
          BufferSink buf_461 = sink.context().makeBuffer();
          buf_461.start(_M_STRING); buf_461.literal(107);
          buf_461.end();
          term_196 = buf_461.term();
        } sink.propertyNamed("$ColumnLocation", term_196);
        sink.start(_M__sTextCons);Term term_320;
        {
          BufferSink buf_395 = sink.context().makeBuffer(); buf_395.start(_M_STRING); buf_395.literal(1); buf_395.end();
          term_320 = buf_395.term();
        } sink.propertyNamed("$LineLocation", term_320);Term term_231;
        {
          BufferSink buf_223 = sink.context().makeBuffer();
          buf_223.start(_M_STRING); buf_223.literal(108);
          buf_223.end();
          term_231 = buf_223.term();
        } sink.propertyNamed("$ColumnLocation", term_231);
        sink.start(_M__sTextChars); sink.copy(sub_32.ref());
        sink.end();Term term_382;
        {
          BufferSink buf_538 = sink.context().makeBuffer(); buf_538.start(_M_STRING); buf_538.literal(1); buf_538.end();
          term_382 = buf_538.term();
        } sink.propertyNamed("$LineLocation", term_382);Term term_632;
        {
          BufferSink buf_686 = sink.context().makeBuffer();
          buf_686.start(_M_STRING); buf_686.literal(109);
          buf_686.end();
          term_632 = buf_686.term();
        } sink.propertyNamed("$ColumnLocation", term_632);
        sink.start(_M__sTextCons);Term term_648;
        {
          BufferSink buf_541 = sink.context().makeBuffer(); buf_541.start(_M_STRING); buf_541.literal(1); buf_541.end();
          term_648 = buf_541.term();
        } sink.propertyNamed("$LineLocation", term_648);Term term_814;
        {
          BufferSink buf_388 = sink.context().makeBuffer();
          buf_388.start(_M_STRING); buf_388.literal(109);
          buf_388.end();
          term_814 = buf_388.term();
        } sink.propertyNamed("$ColumnLocation", term_814);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_445;
        {
          BufferSink buf_443 = sink.context().makeBuffer(); buf_443.start(_M_STRING); buf_443.literal(1); buf_443.end();
          term_445 = buf_443.term();
        } sink.propertyNamed("$LineLocation", term_445);Term term_491;
        {
          BufferSink buf_437 = sink.context().makeBuffer();
          buf_437.start(_M_STRING); buf_437.literal(113);
          buf_437.end();
          term_491 = buf_437.term();
        } sink.propertyNamed("$ColumnLocation", term_491);
        sink.start(_M__sTextCons);Term term_220;
        {
          BufferSink buf_455 = sink.context().makeBuffer(); buf_455.start(_M_STRING); buf_455.literal(1); buf_455.end();
          term_220 = buf_455.term();
        } sink.propertyNamed("$LineLocation", term_220);Term term_338;
        {
          BufferSink buf_298 = sink.context().makeBuffer();
          buf_298.start(_M_STRING); buf_298.literal(114);
          buf_298.end();
          term_338 = buf_298.term();
        } sink.propertyNamed("$ColumnLocation", term_338);
        sink.start(_M__sTextChars); sink.copy(sub_96.ref());
        sink.end();Term term_393;
        {
          BufferSink buf_330 = sink.context().makeBuffer(); buf_330.start(_M_STRING); buf_330.literal(1); buf_330.end();
          term_393 = buf_330.term();
        } sink.propertyNamed("$LineLocation", term_393);Term term_293;
        {
          BufferSink buf_287 = sink.context().makeBuffer();
          buf_287.start(_M_STRING); buf_287.literal(115);
          buf_287.end();
          term_293 = buf_287.term();
        } sink.propertyNamed("$ColumnLocation", term_293);
        sink.start(_M__sTextCons);Term term_493;
        {
          BufferSink buf_389 = sink.context().makeBuffer(); buf_389.start(_M_STRING); buf_389.literal(1); buf_389.end();
          term_493 = buf_389.term();
        } sink.propertyNamed("$LineLocation", term_493);Term term_683;
        {
          BufferSink buf_375 = sink.context().makeBuffer();
          buf_375.start(_M_STRING); buf_375.literal(115);
          buf_375.end();
          term_683 = buf_375.term();
        } sink.propertyNamed("$ColumnLocation", term_683);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_370;
        {
          BufferSink buf_469 = sink.context().makeBuffer(); buf_469.start(_M_STRING); buf_469.literal(1); buf_469.end();
          term_370 = buf_469.term();
        } sink.propertyNamed("$LineLocation", term_370);Term term_660;
        {
          BufferSink buf_333 = sink.context().makeBuffer();
          buf_333.start(_M_STRING); buf_333.literal(119);
          buf_333.end();
          term_660 = buf_333.term();
        } sink.propertyNamed("$ColumnLocation", term_660);
        sink.start(_M__sTextCons);Term term_430;
        {
          BufferSink buf_570 = sink.context().makeBuffer(); buf_570.start(_M_STRING); buf_570.literal(1); buf_570.end();
          term_430 = buf_570.term();
        } sink.propertyNamed("$LineLocation", term_430);Term term_312;
        {
          BufferSink buf_229 = sink.context().makeBuffer();
          buf_229.start(_M_STRING); buf_229.literal(119);
          buf_229.end();
          term_312 = buf_229.term();
        } sink.propertyNamed("$ColumnLocation", term_312);
        sink.start(_M__sTextEmbed);Term term_484;
        {
          BufferSink buf_244 = sink.context().makeBuffer(); buf_244.start(_M_STRING); buf_244.literal(1); buf_244.end();
          term_484 = buf_244.term();
        } sink.propertyNamed("$LineLocation", term_484);Term term_686;
        {
          BufferSink buf_448 = sink.context().makeBuffer();
          buf_448.start(_M_STRING); buf_448.literal(119);
          buf_448.end();
          term_686 = buf_448.term();
        } sink.propertyNamed("$ColumnLocation", term_686);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xforms); sink.copy(sub_154.ref());
        sink.end();
        sink.end();
        sink.end();Term term_644;
        {
          BufferSink buf_523 = sink.context().makeBuffer(); buf_523.start(_M_STRING); buf_523.literal(1); buf_523.end();
          term_644 = buf_523.term();
        } sink.propertyNamed("$LineLocation", term_644);Term term_530;
        {
          BufferSink buf_178 = sink.context().makeBuffer();
          buf_178.start(_M_STRING); buf_178.literal(120);
          buf_178.end();
          term_530 = buf_178.term();
        } sink.propertyNamed("$ColumnLocation", term_530);
        sink.start(_M__sTextCons);Term term_562;
        {
          BufferSink buf_328 = sink.context().makeBuffer(); buf_328.start(_M_STRING); buf_328.literal(1); buf_328.end();
          term_562 = buf_328.term();
        } sink.propertyNamed("$LineLocation", term_562);Term term_480;
        {
          BufferSink buf_407 = sink.context().makeBuffer();
          buf_407.start(_M_STRING); buf_407.literal(120);
          buf_407.end();
          term_480 = buf_407.term();
        } sink.propertyNamed("$ColumnLocation", term_480);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_634;
        {
          BufferSink buf_228 = sink.context().makeBuffer(); buf_228.start(_M_STRING); buf_228.literal(1); buf_228.end();
          term_634 = buf_228.term();
        } sink.propertyNamed("$LineLocation", term_634);Term term_379;
        {
          BufferSink buf_470 = sink.context().makeBuffer();
          buf_470.start(_M_STRING); buf_470.literal(142);
          buf_470.end();
          term_379 = buf_470.term();
        } sink.propertyNamed("$ColumnLocation", term_379);
        sink.start(_M__sTextCons);Term term_432;
        {
          BufferSink buf_492 = sink.context().makeBuffer(); buf_492.start(_M_STRING); buf_492.literal(1); buf_492.end();
          term_432 = buf_492.term();
        } sink.propertyNamed("$LineLocation", term_432);Term term_677;
        {
          BufferSink buf_708 = sink.context().makeBuffer();
          buf_708.start(_M_STRING); buf_708.literal(143);
          buf_708.end();
          term_677 = buf_708.term();
        } sink.propertyNamed("$ColumnLocation", term_677);
        sink.start(_M__sTextChars); sink.copy(sub_59.ref());
        sink.end();Term term_656;
        {
          BufferSink buf_685 = sink.context().makeBuffer(); buf_685.start(_M_STRING); buf_685.literal(1); buf_685.end();
          term_656 = buf_685.term();
        } sink.propertyNamed("$LineLocation", term_656);Term term_657;
        {
          BufferSink buf_424 = sink.context().makeBuffer();
          buf_424.start(_M_STRING); buf_424.literal(144);
          buf_424.end();
          term_657 = buf_424.term();
        } sink.propertyNamed("$ColumnLocation", term_657);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_92: {
        if (term_410.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_92;
        }Term sub_180 = term_410.sub(0).ref();
        /* #1=sub */Term sub_34 = term_410.sub(1).ref();
        /* #2=sub */Term sub_40 = term_410.sub(2).ref();
        /* #3=sub */Term sub_53 = term_410.sub(3).ref();
        /* #4=sub */Term sub_75 = term_410.sub(4).ref();
        /* #5=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_798;
        {
          BufferSink buf_352 = sink.context().makeBuffer(); buf_352.start(_M_STRING); buf_352.literal(1); buf_352.end();
          term_798 = buf_352.term();
        } sink.propertyNamed("$LineLocation", term_798);Term term_283;
        {
          BufferSink buf_279 = sink.context().makeBuffer(); buf_279.start(_M_STRING); buf_279.literal(1); buf_279.end();
          term_283 = buf_279.term();
        } sink.propertyNamed("$ColumnLocation", term_283);
        sink.start(_M__sTextCons);Term term_351;
        {
          BufferSink buf_628 = sink.context().makeBuffer(); buf_628.start(_M_STRING); buf_628.literal(1); buf_628.end();
          term_351 = buf_628.term();
        } sink.propertyNamed("$LineLocation", term_351);Term term_591;
        {
          BufferSink buf_305 = sink.context().makeBuffer(); buf_305.start(_M_STRING); buf_305.literal(1); buf_305.end();
          term_591 = buf_305.term();
        } sink.propertyNamed("$ColumnLocation", term_591);
        sink.start(_M__sTextEmbed);Term term_450;
        {
          BufferSink buf_599 = sink.context().makeBuffer(); buf_599.start(_M_STRING); buf_599.literal(1); buf_599.end();
          term_450 = buf_599.term();
        } sink.propertyNamed("$LineLocation", term_450);Term term_286;
        {
          BufferSink buf_533 = sink.context().makeBuffer(); buf_533.start(_M_STRING); buf_533.literal(1); buf_533.end();
          term_286 = buf_533.term();
        } sink.propertyNamed("$ColumnLocation", term_286);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_90 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_90});
        sink.start(_M_Crsx_xPrint_xsortparams); sink.use(var_90);
        sink.end(); sink.copy(sub_180.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_531;
        {
          BufferSink buf_475 = sink.context().makeBuffer(); buf_475.start(_M_STRING); buf_475.literal(1); buf_475.end();
          term_531 = buf_475.term();
        } sink.propertyNamed("$LineLocation", term_531);Term term_242;
        {
          BufferSink buf_283 = sink.context().makeBuffer();
          buf_283.start(_M_STRING); buf_283.literal(52);
          buf_283.end();
          term_242 = buf_283.term();
        } sink.propertyNamed("$ColumnLocation", term_242);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_455;
        {
          BufferSink buf_365 = sink.context().makeBuffer(); buf_365.start(_M_STRING); buf_365.literal(1); buf_365.end();
          term_455 = buf_365.term();
        } sink.propertyNamed("$LineLocation", term_455);Term term_461;
        {
          BufferSink buf_434 = sink.context().makeBuffer(); buf_434.start(_M_STRING); buf_434.literal(2); buf_434.end();
          term_461 = buf_434.term();
        } sink.propertyNamed("$ColumnLocation", term_461);
        sink.start(_M__sTextCons);Term term_738;
        {
          BufferSink buf_369 = sink.context().makeBuffer(); buf_369.start(_M_STRING); buf_369.literal(1); buf_369.end();
          term_738 = buf_369.term();
        } sink.propertyNamed("$LineLocation", term_738);Term term_565;
        {
          BufferSink buf_526 = sink.context().makeBuffer(); buf_526.start(_M_STRING); buf_526.literal(2); buf_526.end();
          term_565 = buf_526.term();
        } sink.propertyNamed("$ColumnLocation", term_565);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_499;
        {
          BufferSink buf_534 = sink.context().makeBuffer(); buf_534.start(_M_STRING); buf_534.literal(1); buf_534.end();
          term_499 = buf_534.term();
        } sink.propertyNamed("$LineLocation", term_499);Term term_487;
        {
          BufferSink buf_941 = sink.context().makeBuffer();
          buf_941.start(_M_STRING); buf_941.literal(56);
          buf_941.end();
          term_487 = buf_941.term();
        } sink.propertyNamed("$ColumnLocation", term_487);
        sink.start(_M__sTextCons);Term term_248;
        {
          BufferSink buf_276 = sink.context().makeBuffer(); buf_276.start(_M_STRING); buf_276.literal(1); buf_276.end();
          term_248 = buf_276.term();
        } sink.propertyNamed("$LineLocation", term_248);Term term_560;
        {
          BufferSink buf_332 = sink.context().makeBuffer();
          buf_332.start(_M_STRING); buf_332.literal(56);
          buf_332.end();
          term_560 = buf_332.term();
        } sink.propertyNamed("$ColumnLocation", term_560);
        sink.start(_M__sTextEmbed);Term term_345;
        {
          BufferSink buf_606 = sink.context().makeBuffer(); buf_606.start(_M_STRING); buf_606.literal(1); buf_606.end();
          term_345 = buf_606.term();
        } sink.propertyNamed("$LineLocation", term_345);Term term_508;
        {
          BufferSink buf_368 = sink.context().makeBuffer();
          buf_368.start(_M_STRING); buf_368.literal(56);
          buf_368.end();
          term_508 = buf_368.term();
        } sink.propertyNamed("$ColumnLocation", term_508);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xsortset); sink.copy(sub_34.ref());
        sink.end();
        sink.end();
        sink.end();Term term_234;
        {
          BufferSink buf_442 = sink.context().makeBuffer(); buf_442.start(_M_STRING); buf_442.literal(1); buf_442.end();
          term_234 = buf_442.term();
        } sink.propertyNamed("$LineLocation", term_234);Term term_341;
        {
          BufferSink buf_566 = sink.context().makeBuffer();
          buf_566.start(_M_STRING); buf_566.literal(57);
          buf_566.end();
          term_341 = buf_566.term();
        } sink.propertyNamed("$ColumnLocation", term_341);
        sink.start(_M__sTextCons);Term term_695;
        {
          BufferSink buf_355 = sink.context().makeBuffer(); buf_355.start(_M_STRING); buf_355.literal(1); buf_355.end();
          term_695 = buf_355.term();
        } sink.propertyNamed("$LineLocation", term_695);Term term_203;
        {
          BufferSink buf_493 = sink.context().makeBuffer();
          buf_493.start(_M_STRING); buf_493.literal(57);
          buf_493.end();
          term_203 = buf_493.term();
        } sink.propertyNamed("$ColumnLocation", term_203);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_549;
        {
          BufferSink buf_531 = sink.context().makeBuffer(); buf_531.start(_M_STRING); buf_531.literal(1); buf_531.end();
          term_549 = buf_531.term();
        } sink.propertyNamed("$LineLocation", term_549);Term term_418;
        {
          BufferSink buf_257 = sink.context().makeBuffer();
          buf_257.start(_M_STRING); buf_257.literal(81);
          buf_257.end();
          term_418 = buf_257.term();
        } sink.propertyNamed("$ColumnLocation", term_418);
        sink.start(_M__sTextCons);Term term_431;
        {
          BufferSink buf_399 = sink.context().makeBuffer(); buf_399.start(_M_STRING); buf_399.literal(1); buf_399.end();
          term_431 = buf_399.term();
        } sink.propertyNamed("$LineLocation", term_431);Term term_578;
        {
          BufferSink buf_502 = sink.context().makeBuffer();
          buf_502.start(_M_STRING); buf_502.literal(81);
          buf_502.end();
          term_578 = buf_502.term();
        } sink.propertyNamed("$ColumnLocation", term_578);
        sink.start(_M__sTextEmbed);Term term_625;
        {
          BufferSink buf_799 = sink.context().makeBuffer(); buf_799.start(_M_STRING); buf_799.literal(1); buf_799.end();
          term_625 = buf_799.term();
        } sink.propertyNamed("$LineLocation", term_625);Term term_498;
        {
          BufferSink buf_563 = sink.context().makeBuffer();
          buf_563.start(_M_STRING); buf_563.literal(81);
          buf_563.end();
          term_498 = buf_563.term();
        } sink.propertyNamed("$ColumnLocation", term_498);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xform); sink.copy(sub_40.ref());
        sink.end();
        sink.end();
        sink.end();Term term_323;
        {
          BufferSink buf_646 = sink.context().makeBuffer(); buf_646.start(_M_STRING); buf_646.literal(1); buf_646.end();
          term_323 = buf_646.term();
        } sink.propertyNamed("$LineLocation", term_323);Term term_175;
        {
          BufferSink buf_669 = sink.context().makeBuffer();
          buf_669.start(_M_STRING); buf_669.literal(82);
          buf_669.end();
          term_175 = buf_669.term();
        } sink.propertyNamed("$ColumnLocation", term_175);
        sink.start(_M__sTextCons);Term term_292;
        {
          BufferSink buf_530 = sink.context().makeBuffer(); buf_530.start(_M_STRING); buf_530.literal(1); buf_530.end();
          term_292 = buf_530.term();
        } sink.propertyNamed("$LineLocation", term_292);Term term_535;
        {
          BufferSink buf_454 = sink.context().makeBuffer();
          buf_454.start(_M_STRING); buf_454.literal(82);
          buf_454.end();
          term_535 = buf_454.term();
        } sink.propertyNamed("$ColumnLocation", term_535);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_374;
        {
          BufferSink buf_291 = sink.context().makeBuffer(); buf_291.start(_M_STRING); buf_291.literal(1); buf_291.end();
          term_374 = buf_291.term();
        } sink.propertyNamed("$LineLocation", term_374);Term term_742;
        {
          BufferSink buf_859 = sink.context().makeBuffer();
          buf_859.start(_M_STRING); buf_859.literal(103);
          buf_859.end();
          term_742 = buf_859.term();
        } sink.propertyNamed("$ColumnLocation", term_742);
        sink.start(_M__sTextCons);Term term_309;
        {
          BufferSink buf_431 = sink.context().makeBuffer(); buf_431.start(_M_STRING); buf_431.literal(1); buf_431.end();
          term_309 = buf_431.term();
        } sink.propertyNamed("$LineLocation", term_309);Term term_426;
        {
          BufferSink buf_678 = sink.context().makeBuffer();
          buf_678.start(_M_STRING); buf_678.literal(104);
          buf_678.end();
          term_426 = buf_678.term();
        } sink.propertyNamed("$ColumnLocation", term_426);
        sink.start(_M__sTextChars); sink.copy(sub_53.ref());
        sink.end();Term term_191;
        {
          BufferSink buf_639 = sink.context().makeBuffer(); buf_639.start(_M_STRING); buf_639.literal(1); buf_639.end();
          term_191 = buf_639.term();
        } sink.propertyNamed("$LineLocation", term_191);Term term_849;
        {
          BufferSink buf_391 = sink.context().makeBuffer();
          buf_391.start(_M_STRING); buf_391.literal(105);
          buf_391.end();
          term_849 = buf_391.term();
        } sink.propertyNamed("$ColumnLocation", term_849);
        sink.start(_M__sTextCons);Term term_427;
        {
          BufferSink buf_477 = sink.context().makeBuffer(); buf_477.start(_M_STRING); buf_477.literal(1); buf_477.end();
          term_427 = buf_477.term();
        } sink.propertyNamed("$LineLocation", term_427);Term term_653;
        {
          BufferSink buf_302 = sink.context().makeBuffer();
          buf_302.start(_M_STRING); buf_302.literal(105);
          buf_302.end();
          term_653 = buf_302.term();
        } sink.propertyNamed("$ColumnLocation", term_653);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_228;
        {
          BufferSink buf_496 = sink.context().makeBuffer(); buf_496.start(_M_STRING); buf_496.literal(1); buf_496.end();
          term_228 = buf_496.term();
        } sink.propertyNamed("$LineLocation", term_228);Term term_807;
        {
          BufferSink buf_499 = sink.context().makeBuffer();
          buf_499.start(_M_STRING); buf_499.literal(109);
          buf_499.end();
          term_807 = buf_499.term();
        } sink.propertyNamed("$ColumnLocation", term_807);
        sink.start(_M__sTextCons);Term term_209;
        {
          BufferSink buf_449 = sink.context().makeBuffer(); buf_449.start(_M_STRING); buf_449.literal(1); buf_449.end();
          term_209 = buf_449.term();
        } sink.propertyNamed("$LineLocation", term_209);Term term_764;
        {
          BufferSink buf_349 = sink.context().makeBuffer();
          buf_349.start(_M_STRING); buf_349.literal(109);
          buf_349.end();
          term_764 = buf_349.term();
        } sink.propertyNamed("$ColumnLocation", term_764);
        sink.start(_M__sTextEmbed);Term term_401;
        {
          BufferSink buf_284 = sink.context().makeBuffer(); buf_284.start(_M_STRING); buf_284.literal(1); buf_284.end();
          term_401 = buf_284.term();
        } sink.propertyNamed("$LineLocation", term_401);Term term_198;
        {
          BufferSink buf_616 = sink.context().makeBuffer();
          buf_616.start(_M_STRING); buf_616.literal(109);
          buf_616.end();
          term_198 = buf_616.term();
        } sink.propertyNamed("$ColumnLocation", term_198);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xsortname); sink.copy(sub_75.ref());
        sink.end();
        sink.end();
        sink.end();Term term_207;
        {
          BufferSink buf_418 = sink.context().makeBuffer(); buf_418.start(_M_STRING); buf_418.literal(1); buf_418.end();
          term_207 = buf_418.term();
        } sink.propertyNamed("$LineLocation", term_207);Term term_490;
        {
          BufferSink buf_766 = sink.context().makeBuffer();
          buf_766.start(_M_STRING); buf_766.literal(110);
          buf_766.end();
          term_490 = buf_766.term();
        } sink.propertyNamed("$ColumnLocation", term_490);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xsortDeclaration, term_410);
  } final public static boolean _M_Crsx_xPrint_xexpression(Sink sink, int shared, int depth, Term term_495) {
    if (depth < 2000) {
      label_0: {
        if (term_495.descriptor() != _M_Crsx_xexpression)
        {   break label_0;
        }Term sub_287 = term_495.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_316;
        {
          BufferSink buf_334 = sink.context().makeBuffer(); buf_334.start(_M_STRING); buf_334.literal(1); buf_334.end();
          term_316 = buf_334.term();
        } sink.propertyNamed("$LineLocation", term_316);Term term_331;
        {
          BufferSink buf_482 = sink.context().makeBuffer(); buf_482.start(_M_STRING); buf_482.literal(1); buf_482.end();
          term_331 = buf_482.term();
        } sink.propertyNamed("$ColumnLocation", term_331);
        sink.start(_M__sTextCons);Term term_457;
        {
          BufferSink buf_406 = sink.context().makeBuffer(); buf_406.start(_M_STRING); buf_406.literal(1); buf_406.end();
          term_457 = buf_406.term();
        } sink.propertyNamed("$LineLocation", term_457);Term term_504;
        {
          BufferSink buf_586 = sink.context().makeBuffer(); buf_586.start(_M_STRING); buf_586.literal(1); buf_586.end();
          term_504 = buf_586.term();
        } sink.propertyNamed("$ColumnLocation", term_504);
        sink.start(_M__sTextEmbed);Term term_509;
        {
          BufferSink buf_497 = sink.context().makeBuffer(); buf_497.start(_M_STRING); buf_497.literal(1); buf_497.end();
          term_509 = buf_497.term();
        } sink.propertyNamed("$LineLocation", term_509);Term term_858;
        {
          BufferSink buf_787 = sink.context().makeBuffer(); buf_787.start(_M_STRING); buf_787.literal(1); buf_787.end();
          term_858 = buf_787.term();
        } sink.propertyNamed("$ColumnLocation", term_858);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdispatch); sink.copy(sub_287.ref());
        sink.end();
        sink.end();
        sink.end();Term term_440;
        {
          BufferSink buf_423 = sink.context().makeBuffer(); buf_423.start(_M_STRING); buf_423.literal(1); buf_423.end();
          term_440 = buf_423.term();
        } sink.propertyNamed("$LineLocation", term_440);Term term_705;
        {
          BufferSink buf_1187 = sink.context().makeBuffer();
          buf_1187.start(_M_STRING); buf_1187.literal(2);
          buf_1187.end();
          term_705 = buf_1187.term();
        } sink.propertyNamed("$ColumnLocation", term_705);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xexpression, term_495);
  } final public static boolean _M_Crsx_xPrint_xproperty(Sink sink, int shared, int depth, Term term_388) {
    if (depth < 2000) {
      label_57: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA1)
        {   break label_57;
        }Term sub_110 = term_388.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_813;
        {
          BufferSink buf_467 = sink.context().makeBuffer(); buf_467.start(_M_STRING); buf_467.literal(1); buf_467.end();
          term_813 = buf_467.term();
        } sink.propertyNamed("$LineLocation", term_813);Term term_520;
        {
          BufferSink buf_841 = sink.context().makeBuffer(); buf_841.start(_M_STRING); buf_841.literal(1); buf_841.end();
          term_520 = buf_841.term();
        } sink.propertyNamed("$ColumnLocation", term_520);
        sink.start(_M__sTextCons);Term term_460;
        {
          BufferSink buf_516 = sink.context().makeBuffer(); buf_516.start(_M_STRING); buf_516.literal(1); buf_516.end();
          term_460 = buf_516.term();
        } sink.propertyNamed("$LineLocation", term_460);Term term_601;
        {
          BufferSink buf_642 = sink.context().makeBuffer(); buf_642.start(_M_STRING); buf_642.literal(2); buf_642.end();
          term_601 = buf_642.term();
        } sink.propertyNamed("$ColumnLocation", term_601);
        sink.start(_M__sTextChars); sink.copy(sub_110.ref());
        sink.end();Term term_532;
        {
          BufferSink buf_364 = sink.context().makeBuffer(); buf_364.start(_M_STRING); buf_364.literal(1); buf_364.end();
          term_532 = buf_364.term();
        } sink.propertyNamed("$LineLocation", term_532);Term term_396;
        {
          BufferSink buf_960 = sink.context().makeBuffer(); buf_960.start(_M_STRING); buf_960.literal(3); buf_960.end();
          term_396 = buf_960.term();
        } sink.propertyNamed("$ColumnLocation", term_396);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_71: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA2)
        {   break label_71;
        }Term sub_184 = term_388.sub(0).ref();
        /* #1=sub */Term sub_73 = term_388.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_637;
        {
          BufferSink buf_168 = sink.context().makeBuffer(); buf_168.start(_M_STRING); buf_168.literal(1); buf_168.end();
          term_637 = buf_168.term();
        } sink.propertyNamed("$LineLocation", term_637);Term term_142;
        {
          BufferSink buf_335 = sink.context().makeBuffer(); buf_335.start(_M_STRING); buf_335.literal(1); buf_335.end();
          term_142 = buf_335.term();
        } sink.propertyNamed("$ColumnLocation", term_142);
        sink.start(_M__sTextCons);Term term_768;
        {
          BufferSink buf_553 = sink.context().makeBuffer(); buf_553.start(_M_STRING); buf_553.literal(1); buf_553.end();
          term_768 = buf_553.term();
        } sink.propertyNamed("$LineLocation", term_768);Term term_570;
        {
          BufferSink buf_400 = sink.context().makeBuffer(); buf_400.start(_M_STRING); buf_400.literal(2); buf_400.end();
          term_570 = buf_400.term();
        } sink.propertyNamed("$ColumnLocation", term_570);
        sink.start(_M__sTextChars); sink.copy(sub_184.ref());
        sink.end();Term term_919;
        {
          BufferSink buf_552 = sink.context().makeBuffer(); buf_552.start(_M_STRING); buf_552.literal(1); buf_552.end();
          term_919 = buf_552.term();
        } sink.propertyNamed("$LineLocation", term_919);Term term_702;
        {
          BufferSink buf_535 = sink.context().makeBuffer(); buf_535.start(_M_STRING); buf_535.literal(3); buf_535.end();
          term_702 = buf_535.term();
        } sink.propertyNamed("$ColumnLocation", term_702);
        sink.start(_M__sTextCons);Term term_706;
        {
          BufferSink buf_775 = sink.context().makeBuffer(); buf_775.start(_M_STRING); buf_775.literal(1); buf_775.end();
          term_706 = buf_775.term();
        } sink.propertyNamed("$LineLocation", term_706);Term term_878;
        {
          BufferSink buf_300 = sink.context().makeBuffer(); buf_300.start(_M_STRING); buf_300.literal(3); buf_300.end();
          term_878 = buf_300.term();
        } sink.propertyNamed("$ColumnLocation", term_878);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_417;
        {
          BufferSink buf_321 = sink.context().makeBuffer(); buf_321.start(_M_STRING); buf_321.literal(1); buf_321.end();
          term_417 = buf_321.term();
        } sink.propertyNamed("$LineLocation", term_417);Term term_638;
        {
          BufferSink buf_716 = sink.context().makeBuffer(); buf_716.start(_M_STRING); buf_716.literal(7); buf_716.end();
          term_638 = buf_716.term();
        } sink.propertyNamed("$ColumnLocation", term_638);
        sink.start(_M__sTextCons);Term term_500;
        {
          BufferSink buf_815 = sink.context().makeBuffer(); buf_815.start(_M_STRING); buf_815.literal(1); buf_815.end();
          term_500 = buf_815.term();
        } sink.propertyNamed("$LineLocation", term_500);Term term_399;
        {
          BufferSink buf_329 = sink.context().makeBuffer(); buf_329.start(_M_STRING); buf_329.literal(8); buf_329.end();
          term_399 = buf_329.term();
        } sink.propertyNamed("$ColumnLocation", term_399);
        sink.start(_M__sTextChars); sink.copy(sub_73.ref());
        sink.end();Term term_553;
        {
          BufferSink buf_536 = sink.context().makeBuffer(); buf_536.start(_M_STRING); buf_536.literal(1); buf_536.end();
          term_553 = buf_536.term();
        } sink.propertyNamed("$LineLocation", term_553);Term term_497;
        {
          BufferSink buf_510 = sink.context().makeBuffer(); buf_510.start(_M_STRING); buf_510.literal(9); buf_510.end();
          term_497 = buf_510.term();
        } sink.propertyNamed("$ColumnLocation", term_497);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_69: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA3)
        {   break label_69;
        }Term sub_29 = term_388.sub(0).ref();
        /* #1=sub */Term sub_57 = term_388.sub(1).ref();
        /* #2=sub */Term sub_28 = term_388.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_733;
        {
          BufferSink buf_582 = sink.context().makeBuffer(); buf_582.start(_M_STRING); buf_582.literal(1); buf_582.end();
          term_733 = buf_582.term();
        } sink.propertyNamed("$LineLocation", term_733);Term term_761;
        {
          BufferSink buf_324 = sink.context().makeBuffer(); buf_324.start(_M_STRING); buf_324.literal(1); buf_324.end();
          term_761 = buf_324.term();
        } sink.propertyNamed("$ColumnLocation", term_761);
        sink.start(_M__sTextCons);Term term_673;
        {
          BufferSink buf_436 = sink.context().makeBuffer(); buf_436.start(_M_STRING); buf_436.literal(1); buf_436.end();
          term_673 = buf_436.term();
        } sink.propertyNamed("$LineLocation", term_673);Term term_655;
        {
          BufferSink buf_562 = sink.context().makeBuffer(); buf_562.start(_M_STRING); buf_562.literal(2); buf_562.end();
          term_655 = buf_562.term();
        } sink.propertyNamed("$ColumnLocation", term_655);
        sink.start(_M__sTextChars); sink.copy(sub_29.ref());
        sink.end();Term term_236;
        {
          BufferSink buf_601 = sink.context().makeBuffer(); buf_601.start(_M_STRING); buf_601.literal(1); buf_601.end();
          term_236 = buf_601.term();
        } sink.propertyNamed("$LineLocation", term_236);Term term_805;
        {
          BufferSink buf_413 = sink.context().makeBuffer(); buf_413.start(_M_STRING); buf_413.literal(3); buf_413.end();
          term_805 = buf_413.term();
        } sink.propertyNamed("$ColumnLocation", term_805);
        sink.start(_M__sTextCons);Term term_476;
        {
          BufferSink buf_495 = sink.context().makeBuffer(); buf_495.start(_M_STRING); buf_495.literal(1); buf_495.end();
          term_476 = buf_495.term();
        } sink.propertyNamed("$LineLocation", term_476);Term term_243;
        {
          BufferSink buf_473 = sink.context().makeBuffer(); buf_473.start(_M_STRING); buf_473.literal(3); buf_473.end();
          term_243 = buf_473.term();
        } sink.propertyNamed("$ColumnLocation", term_243);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_856;
        {
          BufferSink buf_933 = sink.context().makeBuffer(); buf_933.start(_M_STRING); buf_933.literal(1); buf_933.end();
          term_856 = buf_933.term();
        } sink.propertyNamed("$LineLocation", term_856);Term term_407;
        {
          BufferSink buf_465 = sink.context().makeBuffer(); buf_465.start(_M_STRING); buf_465.literal(7); buf_465.end();
          term_407 = buf_465.term();
        } sink.propertyNamed("$ColumnLocation", term_407);
        sink.start(_M__sTextCons);Term term_413;
        {
          BufferSink buf_581 = sink.context().makeBuffer(); buf_581.start(_M_STRING); buf_581.literal(1); buf_581.end();
          term_413 = buf_581.term();
        } sink.propertyNamed("$LineLocation", term_413);Term term_590;
        {
          BufferSink buf_527 = sink.context().makeBuffer(); buf_527.start(_M_STRING); buf_527.literal(8); buf_527.end();
          term_590 = buf_527.term();
        } sink.propertyNamed("$ColumnLocation", term_590);
        sink.start(_M__sTextChars); sink.copy(sub_57.ref());
        sink.end();Term term_748;
        {
          BufferSink buf_554 = sink.context().makeBuffer(); buf_554.start(_M_STRING); buf_554.literal(1); buf_554.end();
          term_748 = buf_554.term();
        } sink.propertyNamed("$LineLocation", term_748);Term term_561;
        {
          BufferSink buf_583 = sink.context().makeBuffer(); buf_583.start(_M_STRING); buf_583.literal(9); buf_583.end();
          term_561 = buf_583.term();
        } sink.propertyNamed("$ColumnLocation", term_561);
        sink.start(_M__sTextCons);Term term_635;
        {
          BufferSink buf_256 = sink.context().makeBuffer(); buf_256.start(_M_STRING); buf_256.literal(1); buf_256.end();
          term_635 = buf_256.term();
        } sink.propertyNamed("$LineLocation", term_635);Term term_688;
        {
          BufferSink buf_483 = sink.context().makeBuffer(); buf_483.start(_M_STRING); buf_483.literal(9); buf_483.end();
          term_688 = buf_483.term();
        } sink.propertyNamed("$ColumnLocation", term_688);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_585;
        {
          BufferSink buf_539 = sink.context().makeBuffer(); buf_539.start(_M_STRING); buf_539.literal(1); buf_539.end();
          term_585 = buf_539.term();
        } sink.propertyNamed("$LineLocation", term_585);Term term_877;
        {
          BufferSink buf_550 = sink.context().makeBuffer();
          buf_550.start(_M_STRING); buf_550.literal(13);
          buf_550.end();
          term_877 = buf_550.term();
        } sink.propertyNamed("$ColumnLocation", term_877);
        sink.start(_M__sTextCons);Term term_411;
        {
          BufferSink buf_595 = sink.context().makeBuffer(); buf_595.start(_M_STRING); buf_595.literal(1); buf_595.end();
          term_411 = buf_595.term();
        } sink.propertyNamed("$LineLocation", term_411);Term term_666;
        {
          BufferSink buf_447 = sink.context().makeBuffer();
          buf_447.start(_M_STRING); buf_447.literal(13);
          buf_447.end();
          term_666 = buf_447.term();
        } sink.propertyNamed("$ColumnLocation", term_666);
        sink.start(_M__sTextEmbed);Term term_586;
        {
          BufferSink buf_236 = sink.context().makeBuffer(); buf_236.start(_M_STRING); buf_236.literal(1); buf_236.end();
          term_586 = buf_236.term();
        } sink.propertyNamed("$LineLocation", term_586);Term term_678;
        {
          BufferSink buf_549 = sink.context().makeBuffer();
          buf_549.start(_M_STRING); buf_549.literal(13);
          buf_549.end();
          term_678 = buf_549.term();
        } sink.propertyNamed("$ColumnLocation", term_678);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_28.ref());
        sink.end();
        sink.end();
        sink.end();Term term_511;
        {
          BufferSink buf_515 = sink.context().makeBuffer(); buf_515.start(_M_STRING); buf_515.literal(1); buf_515.end();
          term_511 = buf_515.term();
        } sink.propertyNamed("$LineLocation", term_511);Term term_507;
        {
          BufferSink buf_743 = sink.context().makeBuffer();
          buf_743.start(_M_STRING); buf_743.literal(14);
          buf_743.end();
          term_507 = buf_743.term();
        } sink.propertyNamed("$ColumnLocation", term_507);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_28: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA4)
        {   break label_28;
        }Term sub_1 = term_388.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_592;
        {
          BufferSink buf_491 = sink.context().makeBuffer(); buf_491.start(_M_STRING); buf_491.literal(1); buf_491.end();
          term_592 = buf_491.term();
        } sink.propertyNamed("$LineLocation", term_592);Term term_1034;
        {
          BufferSink buf_1358 = sink.context().makeBuffer();
          buf_1358.start(_M_STRING); buf_1358.literal(1);
          buf_1358.end();
          term_1034 = buf_1358.term();
        } sink.propertyNamed("$ColumnLocation", term_1034);
        sink.start(_M__sTextCons);Term term_669;
        {
          BufferSink buf_440 = sink.context().makeBuffer(); buf_440.start(_M_STRING); buf_440.literal(1); buf_440.end();
          term_669 = buf_440.term();
        } sink.propertyNamed("$LineLocation", term_669);Term term_995;
        {
          BufferSink buf_657 = sink.context().makeBuffer(); buf_657.start(_M_STRING); buf_657.literal(2); buf_657.end();
          term_995 = buf_657.term();
        } sink.propertyNamed("$ColumnLocation", term_995);
        sink.start(_M__sTextChars); sink.copy(sub_1.ref());
        sink.end();Term term_882;
        {
          BufferSink buf_881 = sink.context().makeBuffer(); buf_881.start(_M_STRING); buf_881.literal(1); buf_881.end();
          term_882 = buf_881.term();
        } sink.propertyNamed("$LineLocation", term_882);Term term_770;
        {
          BufferSink buf_683 = sink.context().makeBuffer(); buf_683.start(_M_STRING); buf_683.literal(3); buf_683.end();
          term_770 = buf_683.term();
        } sink.propertyNamed("$ColumnLocation", term_770);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_45: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA5)
        {   break label_45;
        }Term sub_61 = term_388.sub(0).ref();
        /* #1=sub */Term sub_27 = term_388.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_447;
        {
          BufferSink buf_351 = sink.context().makeBuffer(); buf_351.start(_M_STRING); buf_351.literal(1); buf_351.end();
          term_447 = buf_351.term();
        } sink.propertyNamed("$LineLocation", term_447);Term term_863;
        {
          BufferSink buf_1075 = sink.context().makeBuffer();
          buf_1075.start(_M_STRING); buf_1075.literal(1);
          buf_1075.end();
          term_863 = buf_1075.term();
        } sink.propertyNamed("$ColumnLocation", term_863);
        sink.start(_M__sTextCons);Term term_534;
        {
          BufferSink buf_555 = sink.context().makeBuffer(); buf_555.start(_M_STRING); buf_555.literal(1); buf_555.end();
          term_534 = buf_555.term();
        } sink.propertyNamed("$LineLocation", term_534);Term term_365;
        {
          BufferSink buf_610 = sink.context().makeBuffer(); buf_610.start(_M_STRING); buf_610.literal(2); buf_610.end();
          term_365 = buf_610.term();
        } sink.propertyNamed("$ColumnLocation", term_365);
        sink.start(_M__sTextChars); sink.copy(sub_61.ref());
        sink.end();Term term_438;
        {
          BufferSink buf_416 = sink.context().makeBuffer(); buf_416.start(_M_STRING); buf_416.literal(1); buf_416.end();
          term_438 = buf_416.term();
        } sink.propertyNamed("$LineLocation", term_438);Term term_321;
        {
          BufferSink buf_762 = sink.context().makeBuffer(); buf_762.start(_M_STRING); buf_762.literal(3); buf_762.end();
          term_321 = buf_762.term();
        } sink.propertyNamed("$ColumnLocation", term_321);
        sink.start(_M__sTextCons);Term term_343;
        {
          BufferSink buf_532 = sink.context().makeBuffer(); buf_532.start(_M_STRING); buf_532.literal(1); buf_532.end();
          term_343 = buf_532.term();
        } sink.propertyNamed("$LineLocation", term_343);Term term_456;
        {
          BufferSink buf_777 = sink.context().makeBuffer(); buf_777.start(_M_STRING); buf_777.literal(3); buf_777.end();
          term_456 = buf_777.term();
        } sink.propertyNamed("$ColumnLocation", term_456);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_668;
        {
          BufferSink buf_464 = sink.context().makeBuffer(); buf_464.start(_M_STRING); buf_464.literal(1); buf_464.end();
          term_668 = buf_464.term();
        } sink.propertyNamed("$LineLocation", term_668);Term term_251;
        {
          BufferSink buf_282 = sink.context().makeBuffer(); buf_282.start(_M_STRING); buf_282.literal(7); buf_282.end();
          term_251 = buf_282.term();
        } sink.propertyNamed("$ColumnLocation", term_251);
        sink.start(_M__sTextCons);Term term_451;
        {
          BufferSink buf_626 = sink.context().makeBuffer(); buf_626.start(_M_STRING); buf_626.literal(1); buf_626.end();
          term_451 = buf_626.term();
        } sink.propertyNamed("$LineLocation", term_451);Term term_785;
        {
          BufferSink buf_808 = sink.context().makeBuffer(); buf_808.start(_M_STRING); buf_808.literal(8); buf_808.end();
          term_785 = buf_808.term();
        } sink.propertyNamed("$ColumnLocation", term_785);
        sink.start(_M__sTextChars); sink.copy(sub_27.ref());
        sink.end();Term term_221;
        {
          BufferSink buf_1099 = sink.context().makeBuffer();
          buf_1099.start(_M_STRING); buf_1099.literal(1);
          buf_1099.end();
          term_221 = buf_1099.term();
        } sink.propertyNamed("$LineLocation", term_221);Term term_227;
        {
          BufferSink buf_707 = sink.context().makeBuffer(); buf_707.start(_M_STRING); buf_707.literal(9); buf_707.end();
          term_227 = buf_707.term();
        } sink.propertyNamed("$ColumnLocation", term_227);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_41: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA6)
        {   break label_41;
        }Term sub_55 = term_388.sub(0).ref();
        /* #1=sub */Term sub_72 = term_388.sub(1).ref();
        /* #2=sub */Term sub_185 = term_388.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1111;
        {
          BufferSink buf_578 = sink.context().makeBuffer(); buf_578.start(_M_STRING); buf_578.literal(1); buf_578.end();
          term_1111 = buf_578.term();
        } sink.propertyNamed("$LineLocation", term_1111);Term term_442;
        {
          BufferSink buf_310 = sink.context().makeBuffer(); buf_310.start(_M_STRING); buf_310.literal(1); buf_310.end();
          term_442 = buf_310.term();
        } sink.propertyNamed("$ColumnLocation", term_442);
        sink.start(_M__sTextCons);Term term_593;
        {
          BufferSink buf_729 = sink.context().makeBuffer(); buf_729.start(_M_STRING); buf_729.literal(1); buf_729.end();
          term_593 = buf_729.term();
        } sink.propertyNamed("$LineLocation", term_593);Term term_1006;
        {
          BufferSink buf_394 = sink.context().makeBuffer(); buf_394.start(_M_STRING); buf_394.literal(2); buf_394.end();
          term_1006 = buf_394.term();
        } sink.propertyNamed("$ColumnLocation", term_1006);
        sink.start(_M__sTextChars); sink.copy(sub_55.ref());
        sink.end();Term term_512;
        {
          BufferSink buf_630 = sink.context().makeBuffer(); buf_630.start(_M_STRING); buf_630.literal(1); buf_630.end();
          term_512 = buf_630.term();
        } sink.propertyNamed("$LineLocation", term_512);Term term_651;
        {
          BufferSink buf_327 = sink.context().makeBuffer(); buf_327.start(_M_STRING); buf_327.literal(3); buf_327.end();
          term_651 = buf_327.term();
        } sink.propertyNamed("$ColumnLocation", term_651);
        sink.start(_M__sTextCons);Term term_503;
        {
          BufferSink buf_632 = sink.context().makeBuffer(); buf_632.start(_M_STRING); buf_632.literal(1); buf_632.end();
          term_503 = buf_632.term();
        } sink.propertyNamed("$LineLocation", term_503);Term term_933;
        {
          BufferSink buf_575 = sink.context().makeBuffer(); buf_575.start(_M_STRING); buf_575.literal(3); buf_575.end();
          term_933 = buf_575.term();
        } sink.propertyNamed("$ColumnLocation", term_933);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_540;
        {
          BufferSink buf_429 = sink.context().makeBuffer(); buf_429.start(_M_STRING); buf_429.literal(1); buf_429.end();
          term_540 = buf_429.term();
        } sink.propertyNamed("$LineLocation", term_540);Term term_485;
        {
          BufferSink buf_569 = sink.context().makeBuffer(); buf_569.start(_M_STRING); buf_569.literal(7); buf_569.end();
          term_485 = buf_569.term();
        } sink.propertyNamed("$ColumnLocation", term_485);
        sink.start(_M__sTextCons);Term term_550;
        {
          BufferSink buf_980 = sink.context().makeBuffer(); buf_980.start(_M_STRING); buf_980.literal(1); buf_980.end();
          term_550 = buf_980.term();
        } sink.propertyNamed("$LineLocation", term_550);Term term_772;
        {
          BufferSink buf_623 = sink.context().makeBuffer(); buf_623.start(_M_STRING); buf_623.literal(8); buf_623.end();
          term_772 = buf_623.term();
        } sink.propertyNamed("$ColumnLocation", term_772);
        sink.start(_M__sTextChars); sink.copy(sub_72.ref());
        sink.end();Term term_610;
        {
          BufferSink buf_674 = sink.context().makeBuffer(); buf_674.start(_M_STRING); buf_674.literal(1); buf_674.end();
          term_610 = buf_674.term();
        } sink.propertyNamed("$LineLocation", term_610);Term term_575;
        {
          BufferSink buf_354 = sink.context().makeBuffer(); buf_354.start(_M_STRING); buf_354.literal(9); buf_354.end();
          term_575 = buf_354.term();
        } sink.propertyNamed("$ColumnLocation", term_575);
        sink.start(_M__sTextCons);Term term_459;
        {
          BufferSink buf_309 = sink.context().makeBuffer(); buf_309.start(_M_STRING); buf_309.literal(1); buf_309.end();
          term_459 = buf_309.term();
        } sink.propertyNamed("$LineLocation", term_459);Term term_272;
        {
          BufferSink buf_490 = sink.context().makeBuffer(); buf_490.start(_M_STRING); buf_490.literal(9); buf_490.end();
          term_272 = buf_490.term();
        } sink.propertyNamed("$ColumnLocation", term_272);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_716;
        {
          BufferSink buf_1272 = sink.context().makeBuffer();
          buf_1272.start(_M_STRING); buf_1272.literal(1);
          buf_1272.end();
          term_716 = buf_1272.term();
        } sink.propertyNamed("$LineLocation", term_716);Term term_483;
        {
          BufferSink buf_598 = sink.context().makeBuffer();
          buf_598.start(_M_STRING); buf_598.literal(13);
          buf_598.end();
          term_483 = buf_598.term();
        } sink.propertyNamed("$ColumnLocation", term_483);
        sink.start(_M__sTextCons);Term term_492;
        {
          BufferSink buf_1144 = sink.context().makeBuffer();
          buf_1144.start(_M_STRING); buf_1144.literal(1);
          buf_1144.end();
          term_492 = buf_1144.term();
        } sink.propertyNamed("$LineLocation", term_492);Term term_670;
        {
          BufferSink buf_733 = sink.context().makeBuffer();
          buf_733.start(_M_STRING); buf_733.literal(13);
          buf_733.end();
          term_670 = buf_733.term();
        } sink.propertyNamed("$ColumnLocation", term_670);
        sink.start(_M__sTextEmbed);Term term_852;
        {
          BufferSink buf_776 = sink.context().makeBuffer(); buf_776.start(_M_STRING); buf_776.literal(1); buf_776.end();
          term_852 = buf_776.term();
        } sink.propertyNamed("$LineLocation", term_852);Term term_215;
        {
          BufferSink buf_200 = sink.context().makeBuffer();
          buf_200.start(_M_STRING); buf_200.literal(13);
          buf_200.end();
          term_215 = buf_200.term();
        } sink.propertyNamed("$ColumnLocation", term_215);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_185.ref());
        sink.end();
        sink.end();
        sink.end();Term term_515;
        {
          BufferSink buf_807 = sink.context().makeBuffer(); buf_807.start(_M_STRING); buf_807.literal(1); buf_807.end();
          term_515 = buf_807.term();
        } sink.propertyNamed("$LineLocation", term_515);Term term_552;
        {
          BufferSink buf_772 = sink.context().makeBuffer();
          buf_772.start(_M_STRING); buf_772.literal(14);
          buf_772.end();
          term_552 = buf_772.term();
        } sink.propertyNamed("$ColumnLocation", term_552);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_96: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA7)
        {   break label_96;
        }Term sub_137 = term_388.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_566;
        {
          BufferSink buf_304 = sink.context().makeBuffer(); buf_304.start(_M_STRING); buf_304.literal(1); buf_304.end();
          term_566 = buf_304.term();
        } sink.propertyNamed("$LineLocation", term_566);Term term_754;
        {
          BufferSink buf_653 = sink.context().makeBuffer(); buf_653.start(_M_STRING); buf_653.literal(1); buf_653.end();
          term_754 = buf_653.term();
        } sink.propertyNamed("$ColumnLocation", term_754);
        sink.start(_M__sTextCons);Term term_642;
        {
          BufferSink buf_542 = sink.context().makeBuffer(); buf_542.start(_M_STRING); buf_542.literal(1); buf_542.end();
          term_642 = buf_542.term();
        } sink.propertyNamed("$LineLocation", term_642);Term term_603;
        {
          BufferSink buf_591 = sink.context().makeBuffer(); buf_591.start(_M_STRING); buf_591.literal(2); buf_591.end();
          term_603 = buf_591.term();
        } sink.propertyNamed("$ColumnLocation", term_603);
        sink.start(_M__sTextChars); sink.copy(sub_137.ref());
        sink.end();Term term_218;
        {
          BufferSink buf_338 = sink.context().makeBuffer(); buf_338.start(_M_STRING); buf_338.literal(1); buf_338.end();
          term_218 = buf_338.term();
        } sink.propertyNamed("$LineLocation", term_218);Term term_662;
        {
          BufferSink buf_690 = sink.context().makeBuffer(); buf_690.start(_M_STRING); buf_690.literal(3); buf_690.end();
          term_662 = buf_690.term();
        } sink.propertyNamed("$ColumnLocation", term_662);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_74: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA8)
        {   break label_74;
        }Term sub_60 = term_388.sub(0).ref();
        /* #1=sub */Term sub_74 = term_388.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_741;
        {
          BufferSink buf_720 = sink.context().makeBuffer(); buf_720.start(_M_STRING); buf_720.literal(1); buf_720.end();
          term_741 = buf_720.term();
        } sink.propertyNamed("$LineLocation", term_741);Term term_314;
        {
          BufferSink buf_731 = sink.context().makeBuffer(); buf_731.start(_M_STRING); buf_731.literal(1); buf_731.end();
          term_314 = buf_731.term();
        } sink.propertyNamed("$ColumnLocation", term_314);
        sink.start(_M__sTextCons);Term term_458;
        {
          BufferSink buf_402 = sink.context().makeBuffer(); buf_402.start(_M_STRING); buf_402.literal(1); buf_402.end();
          term_458 = buf_402.term();
        } sink.propertyNamed("$LineLocation", term_458);Term term_734;
        {
          BufferSink buf_1113 = sink.context().makeBuffer();
          buf_1113.start(_M_STRING); buf_1113.literal(2);
          buf_1113.end();
          term_734 = buf_1113.term();
        } sink.propertyNamed("$ColumnLocation", term_734);
        sink.start(_M__sTextChars); sink.copy(sub_60.ref());
        sink.end();Term term_760;
        {
          BufferSink buf_724 = sink.context().makeBuffer(); buf_724.start(_M_STRING); buf_724.literal(1); buf_724.end();
          term_760 = buf_724.term();
        } sink.propertyNamed("$LineLocation", term_760);Term term_839;
        {
          BufferSink buf_786 = sink.context().makeBuffer(); buf_786.start(_M_STRING); buf_786.literal(3); buf_786.end();
          term_839 = buf_786.term();
        } sink.propertyNamed("$ColumnLocation", term_839);
        sink.start(_M__sTextCons);Term term_581;
        {
          BufferSink buf_594 = sink.context().makeBuffer(); buf_594.start(_M_STRING); buf_594.literal(1); buf_594.end();
          term_581 = buf_594.term();
        } sink.propertyNamed("$LineLocation", term_581);Term term_818;
        {
          BufferSink buf_506 = sink.context().makeBuffer(); buf_506.start(_M_STRING); buf_506.literal(3); buf_506.end();
          term_818 = buf_506.term();
        } sink.propertyNamed("$ColumnLocation", term_818);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_769;
        {
          BufferSink buf_576 = sink.context().makeBuffer(); buf_576.start(_M_STRING); buf_576.literal(1); buf_576.end();
          term_769 = buf_576.term();
        } sink.propertyNamed("$LineLocation", term_769);Term term_615;
        {
          BufferSink buf_700 = sink.context().makeBuffer(); buf_700.start(_M_STRING); buf_700.literal(7); buf_700.end();
          term_615 = buf_700.term();
        } sink.propertyNamed("$ColumnLocation", term_615);
        sink.start(_M__sTextCons);Term term_375;
        {
          BufferSink buf_242 = sink.context().makeBuffer(); buf_242.start(_M_STRING); buf_242.literal(1); buf_242.end();
          term_375 = buf_242.term();
        } sink.propertyNamed("$LineLocation", term_375);Term term_867;
        {
          BufferSink buf_568 = sink.context().makeBuffer(); buf_568.start(_M_STRING); buf_568.literal(8); buf_568.end();
          term_867 = buf_568.term();
        } sink.propertyNamed("$ColumnLocation", term_867);
        sink.start(_M__sTextChars); sink.copy(sub_74.ref());
        sink.end();Term term_750;
        {
          BufferSink buf_348 = sink.context().makeBuffer(); buf_348.start(_M_STRING); buf_348.literal(1); buf_348.end();
          term_750 = buf_348.term();
        } sink.propertyNamed("$LineLocation", term_750);Term term_645;
        {
          BufferSink buf_889 = sink.context().makeBuffer(); buf_889.start(_M_STRING); buf_889.literal(9); buf_889.end();
          term_645 = buf_889.term();
        } sink.propertyNamed("$ColumnLocation", term_645);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_94: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA9)
        {   break label_94;
        }Term sub_9 = term_388.sub(0).ref();
        /* #1=sub */Term sub_39 = term_388.sub(1).ref();
        /* #2=sub */Term sub_4 = term_388.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_942;
        {
          BufferSink buf_425 = sink.context().makeBuffer(); buf_425.start(_M_STRING); buf_425.literal(1); buf_425.end();
          term_942 = buf_425.term();
        } sink.propertyNamed("$LineLocation", term_942);Term term_806;
        {
          BufferSink buf_896 = sink.context().makeBuffer(); buf_896.start(_M_STRING); buf_896.literal(1); buf_896.end();
          term_806 = buf_896.term();
        } sink.propertyNamed("$ColumnLocation", term_806);
        sink.start(_M__sTextCons);Term term_692;
        {
          BufferSink buf_843 = sink.context().makeBuffer(); buf_843.start(_M_STRING); buf_843.literal(1); buf_843.end();
          term_692 = buf_843.term();
        } sink.propertyNamed("$LineLocation", term_692);Term term_857;
        {
          BufferSink buf_651 = sink.context().makeBuffer(); buf_651.start(_M_STRING); buf_651.literal(2); buf_651.end();
          term_857 = buf_651.term();
        } sink.propertyNamed("$ColumnLocation", term_857);
        sink.start(_M__sTextChars); sink.copy(sub_9.ref());
        sink.end();Term term_406;
        {
          BufferSink buf_376 = sink.context().makeBuffer(); buf_376.start(_M_STRING); buf_376.literal(1); buf_376.end();
          term_406 = buf_376.term();
        } sink.propertyNamed("$LineLocation", term_406);Term term_832;
        {
          BufferSink buf_611 = sink.context().makeBuffer(); buf_611.start(_M_STRING); buf_611.literal(3); buf_611.end();
          term_832 = buf_611.term();
        } sink.propertyNamed("$ColumnLocation", term_832);
        sink.start(_M__sTextCons);Term term_652;
        {
          BufferSink buf_303 = sink.context().makeBuffer(); buf_303.start(_M_STRING); buf_303.literal(1); buf_303.end();
          term_652 = buf_303.term();
        } sink.propertyNamed("$LineLocation", term_652);Term term_721;
        {
          BufferSink buf_671 = sink.context().makeBuffer(); buf_671.start(_M_STRING); buf_671.literal(3); buf_671.end();
          term_721 = buf_671.term();
        } sink.propertyNamed("$ColumnLocation", term_721);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_880;
        {
          BufferSink buf_445 = sink.context().makeBuffer(); buf_445.start(_M_STRING); buf_445.literal(1); buf_445.end();
          term_880 = buf_445.term();
        } sink.propertyNamed("$LineLocation", term_880);Term term_777;
        {
          BufferSink buf_1177 = sink.context().makeBuffer();
          buf_1177.start(_M_STRING); buf_1177.literal(7);
          buf_1177.end();
          term_777 = buf_1177.term();
        } sink.propertyNamed("$ColumnLocation", term_777);
        sink.start(_M__sTextCons);Term term_514;
        {
          BufferSink buf_744 = sink.context().makeBuffer(); buf_744.start(_M_STRING); buf_744.literal(1); buf_744.end();
          term_514 = buf_744.term();
        } sink.propertyNamed("$LineLocation", term_514);Term term_687;
        {
          BufferSink buf_920 = sink.context().makeBuffer(); buf_920.start(_M_STRING); buf_920.literal(8); buf_920.end();
          term_687 = buf_920.term();
        } sink.propertyNamed("$ColumnLocation", term_687);
        sink.start(_M__sTextChars); sink.copy(sub_39.ref());
        sink.end();Term term_930;
        {
          BufferSink buf_649 = sink.context().makeBuffer(); buf_649.start(_M_STRING); buf_649.literal(1); buf_649.end();
          term_930 = buf_649.term();
        } sink.propertyNamed("$LineLocation", term_930);Term term_359;
        {
          BufferSink buf_666 = sink.context().makeBuffer(); buf_666.start(_M_STRING); buf_666.literal(9); buf_666.end();
          term_359 = buf_666.term();
        } sink.propertyNamed("$ColumnLocation", term_359);
        sink.start(_M__sTextCons);Term term_424;
        {
          BufferSink buf_633 = sink.context().makeBuffer(); buf_633.start(_M_STRING); buf_633.literal(1); buf_633.end();
          term_424 = buf_633.term();
        } sink.propertyNamed("$LineLocation", term_424);Term term_558;
        {
          BufferSink buf_512 = sink.context().makeBuffer(); buf_512.start(_M_STRING); buf_512.literal(9); buf_512.end();
          term_558 = buf_512.term();
        } sink.propertyNamed("$ColumnLocation", term_558);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_793;
        {
          BufferSink buf_736 = sink.context().makeBuffer(); buf_736.start(_M_STRING); buf_736.literal(1); buf_736.end();
          term_793 = buf_736.term();
        } sink.propertyNamed("$LineLocation", term_793);Term term_747;
        {
          BufferSink buf_181 = sink.context().makeBuffer();
          buf_181.start(_M_STRING); buf_181.literal(13);
          buf_181.end();
          term_747 = buf_181.term();
        } sink.propertyNamed("$ColumnLocation", term_747);
        sink.start(_M__sTextCons);Term term_854;
        {
          BufferSink buf_565 = sink.context().makeBuffer(); buf_565.start(_M_STRING); buf_565.literal(1); buf_565.end();
          term_854 = buf_565.term();
        } sink.propertyNamed("$LineLocation", term_854);Term term_621;
        {
          BufferSink buf_900 = sink.context().makeBuffer();
          buf_900.start(_M_STRING); buf_900.literal(13);
          buf_900.end();
          term_621 = buf_900.term();
        } sink.propertyNamed("$ColumnLocation", term_621);
        sink.start(_M__sTextEmbed);Term term_816;
        {
          BufferSink buf_1202 = sink.context().makeBuffer();
          buf_1202.start(_M_STRING); buf_1202.literal(1);
          buf_1202.end();
          term_816 = buf_1202.term();
        } sink.propertyNamed("$LineLocation", term_816);Term term_727;
        {
          BufferSink buf_462 = sink.context().makeBuffer();
          buf_462.start(_M_STRING); buf_462.literal(13);
          buf_462.end();
          term_727 = buf_462.term();
        } sink.propertyNamed("$ColumnLocation", term_727);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_4.ref());
        sink.end();
        sink.end();
        sink.end();Term term_894;
        {
          BufferSink buf_823 = sink.context().makeBuffer(); buf_823.start(_M_STRING); buf_823.literal(1); buf_823.end();
          term_894 = buf_823.term();
        } sink.propertyNamed("$LineLocation", term_894);Term term_672;
        {
          BufferSink buf_326 = sink.context().makeBuffer();
          buf_326.start(_M_STRING); buf_326.literal(14);
          buf_326.end();
          term_672 = buf_326.term();
        } sink.propertyNamed("$ColumnLocation", term_672);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_264: {
        if (term_388.descriptor() != _M_Crsx_xproperty_xA10)
        {   break label_264;
        }Term sub_58 = term_388.sub(0).ref();
        /* #1=sub */Term sub_25 = term_388.sub(1).ref();
        /* #2=sub */Term sub_84 = term_388.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_970;
        {
          BufferSink buf_476 = sink.context().makeBuffer(); buf_476.start(_M_STRING); buf_476.literal(1); buf_476.end();
          term_970 = buf_476.term();
        } sink.propertyNamed("$LineLocation", term_970);Term term_529;
        {
          BufferSink buf_672 = sink.context().makeBuffer(); buf_672.start(_M_STRING); buf_672.literal(1); buf_672.end();
          term_529 = buf_672.term();
        } sink.propertyNamed("$ColumnLocation", term_529);
        sink.start(_M__sTextCons);Term term_555;
        {
          BufferSink buf_288 = sink.context().makeBuffer(); buf_288.start(_M_STRING); buf_288.literal(1); buf_288.end();
          term_555 = buf_288.term();
        } sink.propertyNamed("$LineLocation", term_555);Term term_649;
        {
          BufferSink buf_488 = sink.context().makeBuffer(); buf_488.start(_M_STRING); buf_488.literal(1); buf_488.end();
          term_649 = buf_488.term();
        } sink.propertyNamed("$ColumnLocation", term_649);
        sink.start(_M__sTextEmbed);Term term_501;
        {
          BufferSink buf_268 = sink.context().makeBuffer(); buf_268.start(_M_STRING); buf_268.literal(1); buf_268.end();
          term_501 = buf_268.term();
        } sink.propertyNamed("$LineLocation", term_501);Term term_539;
        {
          BufferSink buf_888 = sink.context().makeBuffer(); buf_888.start(_M_STRING); buf_888.literal(1); buf_888.end();
          term_539 = buf_888.term();
        } sink.propertyNamed("$ColumnLocation", term_539);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_58.ref());
        sink.end();
        sink.end();
        sink.end();Term term_708;
        {
          BufferSink buf_814 = sink.context().makeBuffer(); buf_814.start(_M_STRING); buf_814.literal(1); buf_814.end();
          term_708 = buf_814.term();
        } sink.propertyNamed("$LineLocation", term_708);Term term_337;
        {
          BufferSink buf_728 = sink.context().makeBuffer(); buf_728.start(_M_STRING); buf_728.literal(2); buf_728.end();
          term_337 = buf_728.term();
        } sink.propertyNamed("$ColumnLocation", term_337);
        sink.start(_M__sTextCons);Term term_746;
        {
          BufferSink buf_923 = sink.context().makeBuffer(); buf_923.start(_M_STRING); buf_923.literal(1); buf_923.end();
          term_746 = buf_923.term();
        } sink.propertyNamed("$LineLocation", term_746);Term term_731;
        {
          BufferSink buf_546 = sink.context().makeBuffer(); buf_546.start(_M_STRING); buf_546.literal(2); buf_546.end();
          term_731 = buf_546.term();
        } sink.propertyNamed("$ColumnLocation", term_731);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_650;
        {
          BufferSink buf_1037 = sink.context().makeBuffer();
          buf_1037.start(_M_STRING); buf_1037.literal(1);
          buf_1037.end();
          term_650 = buf_1037.term();
        } sink.propertyNamed("$LineLocation", term_650);Term term_577;
        {
          BufferSink buf_520 = sink.context().makeBuffer();
          buf_520.start(_M_STRING); buf_520.literal(30);
          buf_520.end();
          term_577 = buf_520.term();
        } sink.propertyNamed("$ColumnLocation", term_577);
        sink.start(_M__sTextCons);Term term_999;
        {
          BufferSink buf_410 = sink.context().makeBuffer(); buf_410.start(_M_STRING); buf_410.literal(1); buf_410.end();
          term_999 = buf_410.term();
        } sink.propertyNamed("$LineLocation", term_999);Term term_205;
        {
          BufferSink buf_636 = sink.context().makeBuffer();
          buf_636.start(_M_STRING); buf_636.literal(31);
          buf_636.end();
          term_205 = buf_636.term();
        } sink.propertyNamed("$ColumnLocation", term_205);
        sink.start(_M__sTextChars); sink.copy(sub_25.ref());
        sink.end();Term term_811;
        {
          BufferSink buf_560 = sink.context().makeBuffer(); buf_560.start(_M_STRING); buf_560.literal(1); buf_560.end();
          term_811 = buf_560.term();
        } sink.propertyNamed("$LineLocation", term_811);Term term_784;
        {
          BufferSink buf_585 = sink.context().makeBuffer();
          buf_585.start(_M_STRING); buf_585.literal(32);
          buf_585.end();
          term_784 = buf_585.term();
        } sink.propertyNamed("$ColumnLocation", term_784);
        sink.start(_M__sTextCons);Term term_862;
        {
          BufferSink buf_607 = sink.context().makeBuffer(); buf_607.start(_M_STRING); buf_607.literal(1); buf_607.end();
          term_862 = buf_607.term();
        } sink.propertyNamed("$LineLocation", term_862);Term term_690;
        {
          BufferSink buf_930 = sink.context().makeBuffer();
          buf_930.start(_M_STRING); buf_930.literal(32);
          buf_930.end();
          term_690 = buf_930.term();
        } sink.propertyNamed("$ColumnLocation", term_690);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_353;
        {
          BufferSink buf_511 = sink.context().makeBuffer(); buf_511.start(_M_STRING); buf_511.literal(1); buf_511.end();
          term_353 = buf_511.term();
        } sink.propertyNamed("$LineLocation", term_353);Term term_506;
        {
          BufferSink buf_809 = sink.context().makeBuffer();
          buf_809.start(_M_STRING); buf_809.literal(36);
          buf_809.end();
          term_506 = buf_809.term();
        } sink.propertyNamed("$ColumnLocation", term_506);
        sink.start(_M__sTextCons);Term term_1036;
        {
          BufferSink buf_816 = sink.context().makeBuffer(); buf_816.start(_M_STRING); buf_816.literal(1); buf_816.end();
          term_1036 = buf_816.term();
        } sink.propertyNamed("$LineLocation", term_1036);Term term_579;
        {
          BufferSink buf_386 = sink.context().makeBuffer();
          buf_386.start(_M_STRING); buf_386.literal(36);
          buf_386.end();
          term_579 = buf_386.term();
        } sink.propertyNamed("$ColumnLocation", term_579);
        sink.start(_M__sTextEmbed);Term term_449;
        {
          BufferSink buf_620 = sink.context().makeBuffer(); buf_620.start(_M_STRING); buf_620.literal(1); buf_620.end();
          term_449 = buf_620.term();
        } sink.propertyNamed("$LineLocation", term_449);Term term_627;
        {
          BufferSink buf_420 = sink.context().makeBuffer();
          buf_420.start(_M_STRING); buf_420.literal(36);
          buf_420.end();
          term_627 = buf_420.term();
        } sink.propertyNamed("$ColumnLocation", term_627);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_84.ref());
        sink.end();
        sink.end();
        sink.end();Term term_397;
        {
          BufferSink buf_513 = sink.context().makeBuffer(); buf_513.start(_M_STRING); buf_513.literal(1); buf_513.end();
          term_397 = buf_513.term();
        } sink.propertyNamed("$LineLocation", term_397);Term term_572;
        {
          BufferSink buf_725 = sink.context().makeBuffer();
          buf_725.start(_M_STRING); buf_725.literal(37);
          buf_725.end();
          term_572 = buf_725.term();
        } sink.propertyNamed("$ColumnLocation", term_572);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xproperty, term_388);
  } final public static boolean _M_Crsx_xPrint_xpropertyList_xS1(Sink sink, int shared, int depth, Term term_1099) {
    if (depth < 2000) {
      label_49: {
        if (term_1099.descriptor() != _M_Crsx_xpropertyList_xS1)
        {   break label_49;
        }Term sub_128 = term_1099.sub(0).ref();
        /* #1=sub */Term sub_103 = term_1099.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_815;
        {
          BufferSink buf_346 = sink.context().makeBuffer(); buf_346.start(_M_STRING); buf_346.literal(1); buf_346.end();
          term_815 = buf_346.term();
        } sink.propertyNamed("$LineLocation", term_815);Term term_594;
        {
          BufferSink buf_1218 = sink.context().makeBuffer();
          buf_1218.start(_M_STRING); buf_1218.literal(1);
          buf_1218.end();
          term_594 = buf_1218.term();
        } sink.propertyNamed("$ColumnLocation", term_594);
        sink.start(_M__sTextCons);Term term_600;
        {
          BufferSink buf_1039 = sink.context().makeBuffer();
          buf_1039.start(_M_STRING); buf_1039.literal(1);
          buf_1039.end();
          term_600 = buf_1039.term();
        } sink.propertyNamed("$LineLocation", term_600);Term term_471;
        {
          BufferSink buf_1031 = sink.context().makeBuffer();
          buf_1031.start(_M_STRING); buf_1031.literal(2);
          buf_1031.end();
          term_471 = buf_1031.term();
        } sink.propertyNamed("$ColumnLocation", term_471);
        sink.start(_M__sTextChars); sink.copy(sub_128.ref());
        sink.end();Term term_439;
        {
          BufferSink buf_458 = sink.context().makeBuffer(); buf_458.start(_M_STRING); buf_458.literal(1); buf_458.end();
          term_439 = buf_458.term();
        } sink.propertyNamed("$LineLocation", term_439);Term term_583;
        {
          BufferSink buf_753 = sink.context().makeBuffer(); buf_753.start(_M_STRING); buf_753.literal(3); buf_753.end();
          term_583 = buf_753.term();
        } sink.propertyNamed("$ColumnLocation", term_583);
        sink.start(_M__sTextCons);Term term_313;
        {
          BufferSink buf_1186 = sink.context().makeBuffer();
          buf_1186.start(_M_STRING); buf_1186.literal(1);
          buf_1186.end();
          term_313 = buf_1186.term();
        } sink.propertyNamed("$LineLocation", term_313);Term term_766;
        {
          BufferSink buf_691 = sink.context().makeBuffer(); buf_691.start(_M_STRING); buf_691.literal(3); buf_691.end();
          term_766 = buf_691.term();
        } sink.propertyNamed("$ColumnLocation", term_766);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_883;
        {
          BufferSink buf_873 = sink.context().makeBuffer(); buf_873.start(_M_STRING); buf_873.literal(1); buf_873.end();
          term_883 = buf_873.term();
        } sink.propertyNamed("$LineLocation", term_883);Term term_563;
        {
          BufferSink buf_255 = sink.context().makeBuffer(); buf_255.start(_M_STRING); buf_255.literal(7); buf_255.end();
          term_563 = buf_255.term();
        } sink.propertyNamed("$ColumnLocation", term_563);
        sink.start(_M__sTextCons);Term term_679;
        {
          BufferSink buf_849 = sink.context().makeBuffer(); buf_849.start(_M_STRING); buf_849.literal(1); buf_849.end();
          term_679 = buf_849.term();
        } sink.propertyNamed("$LineLocation", term_679);Term term_537;
        {
          BufferSink buf_840 = sink.context().makeBuffer(); buf_840.start(_M_STRING); buf_840.literal(7); buf_840.end();
          term_537 = buf_840.term();
        } sink.propertyNamed("$ColumnLocation", term_537);
        sink.start(_M__sTextEmbed);Term term_840;
        {
          BufferSink buf_818 = sink.context().makeBuffer(); buf_818.start(_M_STRING); buf_818.literal(1); buf_818.end();
          term_840 = buf_818.term();
        } sink.propertyNamed("$LineLocation", term_840);Term term_1315;
        {
          BufferSink buf_1014 = sink.context().makeBuffer();
          buf_1014.start(_M_STRING); buf_1014.literal(7);
          buf_1014.end();
          term_1315 = buf_1014.term();
        } sink.propertyNamed("$ColumnLocation", term_1315);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_11 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_11});
        sink.start(_M_Crsx_xPrint_xproperty); sink.use(var_11);
        sink.end(); sink.copy(sub_103.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_924;
        {
          BufferSink buf_658 = sink.context().makeBuffer(); buf_658.start(_M_STRING); buf_658.literal(1); buf_658.end();
          term_924 = buf_658.term();
        } sink.propertyNamed("$LineLocation", term_924);Term term_825;
        {
          BufferSink buf_504 = sink.context().makeBuffer();
          buf_504.start(_M_STRING); buf_504.literal(56);
          buf_504.end();
          term_825 = buf_504.term();
        } sink.propertyNamed("$ColumnLocation", term_825);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_952;
        {
          BufferSink buf_625 = sink.context().makeBuffer(); buf_625.start(_M_STRING); buf_625.literal(1); buf_625.end();
          term_952 = buf_625.term();
        } sink.propertyNamed("$LineLocation", term_952);Term term_502;
        {
          BufferSink buf_379 = sink.context().makeBuffer(); buf_379.start(_M_STRING); buf_379.literal(8); buf_379.end();
          term_502 = buf_379.term();
        } sink.propertyNamed("$ColumnLocation", term_502);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xpropertyList_xS1, term_1099);
  } final public static boolean _M_Crsx_xPrint_xpropertyList(Sink sink, int shared, int depth, Term term_626) {
    if (depth < 2000) {
      label_12: {
        if (term_626.descriptor() != _M_Crsx_xpropertyList)
        {   break label_12;
        }Term sub_13 = term_626.sub(0).ref();
        /* #1=sub */Term sub_177 = term_626.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_466;
        {
          BufferSink buf_507 = sink.context().makeBuffer(); buf_507.start(_M_STRING); buf_507.literal(1); buf_507.end();
          term_466 = buf_507.term();
        } sink.propertyNamed("$LineLocation", term_466);Term term_602;
        {
          BufferSink buf_1198 = sink.context().makeBuffer();
          buf_1198.start(_M_STRING); buf_1198.literal(1);
          buf_1198.end();
          term_602 = buf_1198.term();
        } sink.propertyNamed("$ColumnLocation", term_602);
        sink.start(_M__sTextCons);Term term_698;
        {
          BufferSink buf_862 = sink.context().makeBuffer(); buf_862.start(_M_STRING); buf_862.literal(1); buf_862.end();
          term_698 = buf_862.term();
        } sink.propertyNamed("$LineLocation", term_698);Term term_1071;
        {
          BufferSink buf_732 = sink.context().makeBuffer(); buf_732.start(_M_STRING); buf_732.literal(1); buf_732.end();
          term_1071 = buf_732.term();
        } sink.propertyNamed("$ColumnLocation", term_1071);
        sink.start(_M__sTextEmbed);Term term_792;
        {
          BufferSink buf_850 = sink.context().makeBuffer(); buf_850.start(_M_STRING); buf_850.literal(1); buf_850.end();
          term_792 = buf_850.term();
        } sink.propertyNamed("$LineLocation", term_792);Term term_703;
        {
          BufferSink buf_647 = sink.context().makeBuffer(); buf_647.start(_M_STRING); buf_647.literal(1); buf_647.end();
          term_703 = buf_647.term();
        } sink.propertyNamed("$ColumnLocation", term_703);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xproperty); sink.copy(sub_13.ref());
        sink.end();
        sink.end();
        sink.end();Term term_841;
        {
          BufferSink buf_505 = sink.context().makeBuffer(); buf_505.start(_M_STRING); buf_505.literal(1); buf_505.end();
          term_841 = buf_505.term();
        } sink.propertyNamed("$LineLocation", term_841);Term term_983;
        {
          BufferSink buf_1001 = sink.context().makeBuffer();
          buf_1001.start(_M_STRING); buf_1001.literal(2);
          buf_1001.end();
          term_983 = buf_1001.term();
        } sink.propertyNamed("$ColumnLocation", term_983);
        sink.start(_M__sTextCons);Term term_782;
        {
          BufferSink buf_953 = sink.context().makeBuffer(); buf_953.start(_M_STRING); buf_953.literal(1); buf_953.end();
          term_782 = buf_953.term();
        } sink.propertyNamed("$LineLocation", term_782);Term term_906;
        {
          BufferSink buf_854 = sink.context().makeBuffer(); buf_854.start(_M_STRING); buf_854.literal(2); buf_854.end();
          term_906 = buf_854.term();
        } sink.propertyNamed("$ColumnLocation", term_906);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_546;
        {
          BufferSink buf_1020 = sink.context().makeBuffer();
          buf_1020.start(_M_STRING); buf_1020.literal(1);
          buf_1020.end();
          term_546 = buf_1020.term();
        } sink.propertyNamed("$LineLocation", term_546);Term term_647;
        {
          BufferSink buf_791 = sink.context().makeBuffer();
          buf_791.start(_M_STRING); buf_791.literal(27);
          buf_791.end();
          term_647 = buf_791.term();
        } sink.propertyNamed("$ColumnLocation", term_647);
        sink.start(_M__sTextCons);Term term_428;
        {
          BufferSink buf_761 = sink.context().makeBuffer(); buf_761.start(_M_STRING); buf_761.literal(1); buf_761.end();
          term_428 = buf_761.term();
        } sink.propertyNamed("$LineLocation", term_428);Term term_913;
        {
          BufferSink buf_856 = sink.context().makeBuffer();
          buf_856.start(_M_STRING); buf_856.literal(27);
          buf_856.end();
          term_913 = buf_856.term();
        } sink.propertyNamed("$ColumnLocation", term_913);
        sink.start(_M__sTextEmbed);Term term_978;
        {
          BufferSink buf_819 = sink.context().makeBuffer(); buf_819.start(_M_STRING); buf_819.literal(1); buf_819.end();
          term_978 = buf_819.term();
        } sink.propertyNamed("$LineLocation", term_978);Term term_697;
        {
          BufferSink buf_1112 = sink.context().makeBuffer();
          buf_1112.start(_M_STRING); buf_1112.literal(27);
          buf_1112.end();
          term_697 = buf_1112.term();
        } sink.propertyNamed("$ColumnLocation", term_697);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_49 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_49});
        sink.start(_M_Crsx_xPrint_xpropertyList_xS1); sink.use(var_49);
        sink.end(); sink.copy(sub_177.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_599;
        {
          BufferSink buf_401 = sink.context().makeBuffer(); buf_401.start(_M_STRING); buf_401.literal(1); buf_401.end();
          term_599 = buf_401.term();
        } sink.propertyNamed("$LineLocation", term_599);Term term_559;
        {
          BufferSink buf_1024 = sink.context().makeBuffer();
          buf_1024.start(_M_STRING); buf_1024.literal(83);
          buf_1024.end();
          term_559 = buf_1024.term();
        } sink.propertyNamed("$ColumnLocation", term_559);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_640;
        {
          BufferSink buf_640 = sink.context().makeBuffer(); buf_640.start(_M_STRING); buf_640.literal(1); buf_640.end();
          term_640 = buf_640.term();
        } sink.propertyNamed("$LineLocation", term_640);Term term_617;
        {
          BufferSink buf_1147 = sink.context().makeBuffer();
          buf_1147.start(_M_STRING); buf_1147.literal(28);
          buf_1147.end();
          term_617 = buf_1147.term();
        } sink.propertyNamed("$ColumnLocation", term_617);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xpropertyList, term_626);
  } final public static boolean _M_Crsx_xPrint_xproperties(Sink sink, int shared, int depth, Term term_778) {
    if (depth < 2000) {
      label_70: {
        if (term_778.descriptor() != _M_Crsx_xproperties)
        {   break label_70;
        }Term sub_69 = term_778.sub(0).ref();
        /* #1=sub */Term sub_5 = term_778.sub(1).ref();
        /* #2=sub */Term sub_78 = term_778.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1088;
        {
          BufferSink buf_652 = sink.context().makeBuffer(); buf_652.start(_M_STRING); buf_652.literal(1); buf_652.end();
          term_1088 = buf_652.term();
        } sink.propertyNamed("$LineLocation", term_1088);Term term_859;
        {
          BufferSink buf_430 = sink.context().makeBuffer(); buf_430.start(_M_STRING); buf_430.literal(1); buf_430.end();
          term_859 = buf_430.term();
        } sink.propertyNamed("$ColumnLocation", term_859);
        sink.start(_M__sTextCons);Term term_541;
        {
          BufferSink buf_313 = sink.context().makeBuffer(); buf_313.start(_M_STRING); buf_313.literal(1); buf_313.end();
          term_541 = buf_313.term();
        } sink.propertyNamed("$LineLocation", term_541);Term term_763;
        {
          BufferSink buf_1048 = sink.context().makeBuffer();
          buf_1048.start(_M_STRING); buf_1048.literal(2);
          buf_1048.end();
          term_763 = buf_1048.term();
        } sink.propertyNamed("$ColumnLocation", term_763);
        sink.start(_M__sTextChars); sink.copy(sub_69.ref());
        sink.end();Term term_790;
        {
          BufferSink buf_995 = sink.context().makeBuffer(); buf_995.start(_M_STRING); buf_995.literal(1); buf_995.end();
          term_790 = buf_995.term();
        } sink.propertyNamed("$LineLocation", term_790);Term term_641;
        {
          BufferSink buf_712 = sink.context().makeBuffer(); buf_712.start(_M_STRING); buf_712.literal(3); buf_712.end();
          term_641 = buf_712.term();
        } sink.propertyNamed("$ColumnLocation", term_641);
        sink.start(_M__sTextCons);Term term_797;
        {
          BufferSink buf_548 = sink.context().makeBuffer(); buf_548.start(_M_STRING); buf_548.literal(1); buf_548.end();
          term_797 = buf_548.term();
        } sink.propertyNamed("$LineLocation", term_797);Term term_307;
        {
          BufferSink buf_705 = sink.context().makeBuffer(); buf_705.start(_M_STRING); buf_705.literal(3); buf_705.end();
          term_307 = buf_705.term();
        } sink.propertyNamed("$ColumnLocation", term_307);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_887;
        {
          BufferSink buf_774 = sink.context().makeBuffer(); buf_774.start(_M_STRING); buf_774.literal(1); buf_774.end();
          term_887 = buf_774.term();
        } sink.propertyNamed("$LineLocation", term_887);Term term_802;
        {
          BufferSink buf_571 = sink.context().makeBuffer(); buf_571.start(_M_STRING); buf_571.literal(7); buf_571.end();
          term_802 = buf_571.term();
        } sink.propertyNamed("$ColumnLocation", term_802);
        sink.start(_M__sTextCons);Term term_664;
        {
          BufferSink buf_654 = sink.context().makeBuffer(); buf_654.start(_M_STRING); buf_654.literal(1); buf_654.end();
          term_664 = buf_654.term();
        } sink.propertyNamed("$LineLocation", term_664);Term term_528;
        {
          BufferSink buf_679 = sink.context().makeBuffer(); buf_679.start(_M_STRING); buf_679.literal(7); buf_679.end();
          term_528 = buf_679.term();
        } sink.propertyNamed("$ColumnLocation", term_528);
        sink.start(_M__sTextEmbed);Term term_494;
        {
          BufferSink buf_785 = sink.context().makeBuffer(); buf_785.start(_M_STRING); buf_785.literal(1); buf_785.end();
          term_494 = buf_785.term();
        } sink.propertyNamed("$LineLocation", term_494);Term term_848;
        {
          BufferSink buf_998 = sink.context().makeBuffer(); buf_998.start(_M_STRING); buf_998.literal(7); buf_998.end();
          term_848 = buf_998.term();
        } sink.propertyNamed("$ColumnLocation", term_848);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_15 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_15});
        sink.start(_M_Crsx_xPrint_xpropertyList); sink.use(var_15);
        sink.end(); sink.copy(sub_5.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_949;
        {
          BufferSink buf_756 = sink.context().makeBuffer(); buf_756.start(_M_STRING); buf_756.literal(1); buf_756.end();
          term_949 = buf_756.term();
        } sink.propertyNamed("$LineLocation", term_949);Term term_931;
        {
          BufferSink buf_677 = sink.context().makeBuffer();
          buf_677.start(_M_STRING); buf_677.literal(60);
          buf_677.end();
          term_931 = buf_677.term();
        } sink.propertyNamed("$ColumnLocation", term_931);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_875;
        {
          BufferSink buf_1263 = sink.context().makeBuffer();
          buf_1263.start(_M_STRING); buf_1263.literal(1);
          buf_1263.end();
          term_875 = buf_1263.term();
        } sink.propertyNamed("$LineLocation", term_875);Term term_1353;
        {
          BufferSink buf_882 = sink.context().makeBuffer(); buf_882.start(_M_STRING); buf_882.literal(8); buf_882.end();
          term_1353 = buf_882.term();
        } sink.propertyNamed("$ColumnLocation", term_1353);
        sink.start(_M__sTextCons);Term term_607;
        {
          BufferSink buf_699 = sink.context().makeBuffer(); buf_699.start(_M_STRING); buf_699.literal(1); buf_699.end();
          term_607 = buf_699.term();
        } sink.propertyNamed("$LineLocation", term_607);Term term_908;
        {
          BufferSink buf_670 = sink.context().makeBuffer(); buf_670.start(_M_STRING); buf_670.literal(8); buf_670.end();
          term_908 = buf_670.term();
        } sink.propertyNamed("$ColumnLocation", term_908);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_505;
        {
          BufferSink buf_778 = sink.context().makeBuffer(); buf_778.start(_M_STRING); buf_778.literal(1); buf_778.end();
          term_505 = buf_778.term();
        } sink.propertyNamed("$LineLocation", term_505);Term term_904;
        {
          BufferSink buf_784 = sink.context().makeBuffer();
          buf_784.start(_M_STRING); buf_784.literal(64);
          buf_784.end();
          term_904 = buf_784.term();
        } sink.propertyNamed("$ColumnLocation", term_904);
        sink.start(_M__sTextCons);Term term_422;
        {
          BufferSink buf_696 = sink.context().makeBuffer(); buf_696.start(_M_STRING); buf_696.literal(1); buf_696.end();
          term_422 = buf_696.term();
        } sink.propertyNamed("$LineLocation", term_422);Term term_992;
        {
          BufferSink buf_890 = sink.context().makeBuffer();
          buf_890.start(_M_STRING); buf_890.literal(65);
          buf_890.end();
          term_992 = buf_890.term();
        } sink.propertyNamed("$ColumnLocation", term_992);
        sink.start(_M__sTextChars); sink.copy(sub_78.ref());
        sink.end();Term term_636;
        {
          BufferSink buf_697 = sink.context().makeBuffer(); buf_697.start(_M_STRING); buf_697.literal(1); buf_697.end();
          term_636 = buf_697.term();
        } sink.propertyNamed("$LineLocation", term_636);Term term_527;
        {
          BufferSink buf_415 = sink.context().makeBuffer();
          buf_415.start(_M_STRING); buf_415.literal(66);
          buf_415.end();
          term_527 = buf_415.term();
        } sink.propertyNamed("$ColumnLocation", term_527);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xproperties, term_778);
  } final public static boolean _M_Crsx_xPrint_xdelayCase(Sink sink, int shared, int depth, Term term_948) {
    if (depth < 2000) {
      label_86: {
        if (term_948.descriptor() != _M_Crsx_xdelayCase)
        {   break label_86;
        }Term sub_144 = term_948.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1393;
        {
          BufferSink buf_622 = sink.context().makeBuffer(); buf_622.start(_M_STRING); buf_622.literal(1); buf_622.end();
          term_1393 = buf_622.term();
        } sink.propertyNamed("$LineLocation", term_1393);Term term_571;
        {
          BufferSink buf_913 = sink.context().makeBuffer(); buf_913.start(_M_STRING); buf_913.literal(1); buf_913.end();
          term_571 = buf_913.term();
        } sink.propertyNamed("$ColumnLocation", term_571);
        sink.start(_M__sTextCons);Term term_522;
        {
          BufferSink buf_780 = sink.context().makeBuffer(); buf_780.start(_M_STRING); buf_780.literal(1); buf_780.end();
          term_522 = buf_780.term();
        } sink.propertyNamed("$LineLocation", term_522);Term term_1152;
        {
          BufferSink buf_717 = sink.context().makeBuffer(); buf_717.start(_M_STRING); buf_717.literal(2); buf_717.end();
          term_1152 = buf_717.term();
        } sink.propertyNamed("$ColumnLocation", term_1152);
        sink.start(_M__sTextChars); sink.copy(sub_144.ref());
        sink.end();Term term_518;
        {
          BufferSink buf_1148 = sink.context().makeBuffer();
          buf_1148.start(_M_STRING); buf_1148.literal(1);
          buf_1148.end();
          term_518 = buf_1148.term();
        } sink.propertyNamed("$LineLocation", term_518);Term term_751;
        {
          BufferSink buf_608 = sink.context().makeBuffer(); buf_608.start(_M_STRING); buf_608.literal(3); buf_608.end();
          term_751 = buf_608.term();
        } sink.propertyNamed("$ColumnLocation", term_751);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdelayCase, term_948);
  } final public static boolean _M_Crsx_xPrint_xdispatchCase(Sink sink, int shared, int depth, Term term_1028) {
    if (depth < 2000) {
      label_62: {
        if (term_1028.descriptor() != _M_Crsx_xdispatchCase)
        {   break label_62;
        }Term sub_62 = term_1028.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_947;
        {
          BufferSink buf_940 = sink.context().makeBuffer(); buf_940.start(_M_STRING); buf_940.literal(1); buf_940.end();
          term_947 = buf_940.term();
        } sink.propertyNamed("$LineLocation", term_947);Term term_821;
        {
          BufferSink buf_726 = sink.context().makeBuffer(); buf_726.start(_M_STRING); buf_726.literal(1); buf_726.end();
          term_821 = buf_726.term();
        } sink.propertyNamed("$ColumnLocation", term_821);
        sink.start(_M__sTextCons);Term term_834;
        {
          BufferSink buf_624 = sink.context().makeBuffer(); buf_624.start(_M_STRING); buf_624.literal(1); buf_624.end();
          term_834 = buf_624.term();
        } sink.propertyNamed("$LineLocation", term_834);Term term_955;
        {
          BufferSink buf_779 = sink.context().makeBuffer(); buf_779.start(_M_STRING); buf_779.literal(1); buf_779.end();
          term_955 = buf_779.term();
        } sink.propertyNamed("$ColumnLocation", term_955);
        sink.start(_M__sTextEmbed);Term term_892;
        {
          BufferSink buf_577 = sink.context().makeBuffer(); buf_577.start(_M_STRING); buf_577.literal(1); buf_577.end();
          term_892 = buf_577.term();
        } sink.propertyNamed("$LineLocation", term_892);Term term_696;
        {
          BufferSink buf_789 = sink.context().makeBuffer(); buf_789.start(_M_STRING); buf_789.literal(1); buf_789.end();
          term_696 = buf_789.term();
        } sink.propertyNamed("$ColumnLocation", term_696);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xruleDeclaration); sink.copy(sub_62.ref());
        sink.end();
        sink.end();
        sink.end();Term term_658;
        {
          BufferSink buf_868 = sink.context().makeBuffer(); buf_868.start(_M_STRING); buf_868.literal(1); buf_868.end();
          term_658 = buf_868.term();
        } sink.propertyNamed("$LineLocation", term_658);Term term_744;
        {
          BufferSink buf_711 = sink.context().makeBuffer(); buf_711.start(_M_STRING); buf_711.literal(2); buf_711.end();
          term_744 = buf_711.term();
        } sink.propertyNamed("$ColumnLocation", term_744);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdispatchCase, term_1028);
  } final public static boolean _M_Crsx_xPrint_xdispatchCases_xS1(Sink sink, int shared, int depth, Term term_1255) {
    if (depth < 2000) {
      label_138: {
        if (term_1255.descriptor() != _M_Crsx_xdispatchCases_xS1)
        {   break label_138;
        }Term sub_15 = term_1255.sub(0).ref();
        /* #1=sub */Term sub_193 = term_1255.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_871;
        {
          BufferSink buf_879 = sink.context().makeBuffer(); buf_879.start(_M_STRING); buf_879.literal(1); buf_879.end();
          term_871 = buf_879.term();
        } sink.propertyNamed("$LineLocation", term_871);Term term_533;
        {
          BufferSink buf_684 = sink.context().makeBuffer(); buf_684.start(_M_STRING); buf_684.literal(1); buf_684.end();
          term_533 = buf_684.term();
        } sink.propertyNamed("$ColumnLocation", term_533);
        sink.start(_M__sTextCons);Term term_707;
        {
          BufferSink buf_836 = sink.context().makeBuffer(); buf_836.start(_M_STRING); buf_836.literal(1); buf_836.end();
          term_707 = buf_836.term();
        } sink.propertyNamed("$LineLocation", term_707);Term term_619;
        {
          BufferSink buf_749 = sink.context().makeBuffer(); buf_749.start(_M_STRING); buf_749.literal(2); buf_749.end();
          term_619 = buf_749.term();
        } sink.propertyNamed("$ColumnLocation", term_619);
        sink.start(_M__sTextChars); sink.copy(sub_15.ref());
        sink.end();Term term_624;
        {
          BufferSink buf_517 = sink.context().makeBuffer(); buf_517.start(_M_STRING); buf_517.literal(1); buf_517.end();
          term_624 = buf_517.term();
        } sink.propertyNamed("$LineLocation", term_624);Term term_776;
        {
          BufferSink buf_635 = sink.context().makeBuffer(); buf_635.start(_M_STRING); buf_635.literal(3); buf_635.end();
          term_776 = buf_635.term();
        } sink.propertyNamed("$ColumnLocation", term_776);
        sink.start(_M__sTextCons);Term term_516;
        {
          BufferSink buf_547 = sink.context().makeBuffer(); buf_547.start(_M_STRING); buf_547.literal(1); buf_547.end();
          term_516 = buf_547.term();
        } sink.propertyNamed("$LineLocation", term_516);Term term_756;
        {
          BufferSink buf_1066 = sink.context().makeBuffer();
          buf_1066.start(_M_STRING); buf_1066.literal(3);
          buf_1066.end();
          term_756 = buf_1066.term();
        } sink.propertyNamed("$ColumnLocation", term_756);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1000;
        {
          BufferSink buf_444 = sink.context().makeBuffer(); buf_444.start(_M_STRING); buf_444.literal(1); buf_444.end();
          term_1000 = buf_444.term();
        } sink.propertyNamed("$LineLocation", term_1000);Term term_526;
        {
          BufferSink buf_917 = sink.context().makeBuffer(); buf_917.start(_M_STRING); buf_917.literal(7); buf_917.end();
          term_526 = buf_917.term();
        } sink.propertyNamed("$ColumnLocation", term_526);
        sink.start(_M__sTextCons);Term term_597;
        {
          BufferSink buf_958 = sink.context().makeBuffer(); buf_958.start(_M_STRING); buf_958.literal(1); buf_958.end();
          term_597 = buf_958.term();
        } sink.propertyNamed("$LineLocation", term_597);Term term_1032;
        {
          BufferSink buf_878 = sink.context().makeBuffer(); buf_878.start(_M_STRING); buf_878.literal(7); buf_878.end();
          term_1032 = buf_878.term();
        } sink.propertyNamed("$ColumnLocation", term_1032);
        sink.start(_M__sTextEmbed);Term term_1094;
        {
          BufferSink buf_718 = sink.context().makeBuffer(); buf_718.start(_M_STRING); buf_718.literal(1); buf_718.end();
          term_1094 = buf_718.term();
        } sink.propertyNamed("$LineLocation", term_1094);Term term_868;
        {
          BufferSink buf_1012 = sink.context().makeBuffer();
          buf_1012.start(_M_STRING); buf_1012.literal(7);
          buf_1012.end();
          term_868 = buf_1012.term();
        } sink.propertyNamed("$ColumnLocation", term_868);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdispatchCase); sink.copy(sub_193.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1093;
        {
          BufferSink buf_1137 = sink.context().makeBuffer();
          buf_1137.start(_M_STRING); buf_1137.literal(1);
          buf_1137.end();
          term_1093 = buf_1137.term();
        } sink.propertyNamed("$LineLocation", term_1093);Term term_869;
        {
          BufferSink buf_411 = sink.context().makeBuffer(); buf_411.start(_M_STRING); buf_411.literal(8); buf_411.end();
          term_869 = buf_411.term();
        } sink.propertyNamed("$ColumnLocation", term_869);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdispatchCases_xS1, term_1255);
  } final public static boolean _M_Crsx_xPrint_xdispatchCases(Sink sink, int shared, int depth, Term term_737) {
    if (depth < 2000) {
      label_14: {
        if (term_737.descriptor() != _M_Crsx_xdispatchCases)
        {   break label_14;
        }Term sub_112 = term_737.sub(0).ref();
        /* #1=sub */Term sub_18 = term_737.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1229;
        {
          BufferSink buf_605 = sink.context().makeBuffer(); buf_605.start(_M_STRING); buf_605.literal(1); buf_605.end();
          term_1229 = buf_605.term();
        } sink.propertyNamed("$LineLocation", term_1229);Term term_1018;
        {
          BufferSink buf_865 = sink.context().makeBuffer(); buf_865.start(_M_STRING); buf_865.literal(1); buf_865.end();
          term_1018 = buf_865.term();
        } sink.propertyNamed("$ColumnLocation", term_1018);
        sink.start(_M__sTextCons);Term term_765;
        {
          BufferSink buf_438 = sink.context().makeBuffer(); buf_438.start(_M_STRING); buf_438.literal(1); buf_438.end();
          term_765 = buf_438.term();
        } sink.propertyNamed("$LineLocation", term_765);Term term_830;
        {
          BufferSink buf_1321 = sink.context().makeBuffer();
          buf_1321.start(_M_STRING); buf_1321.literal(1);
          buf_1321.end();
          term_830 = buf_1321.term();
        } sink.propertyNamed("$ColumnLocation", term_830);
        sink.start(_M__sTextEmbed);Term term_659;
        {
          BufferSink buf_866 = sink.context().makeBuffer(); buf_866.start(_M_STRING); buf_866.literal(1); buf_866.end();
          term_659 = buf_866.term();
        } sink.propertyNamed("$LineLocation", term_659);Term term_787;
        {
          BufferSink buf_660 = sink.context().makeBuffer(); buf_660.start(_M_STRING); buf_660.literal(1); buf_660.end();
          term_787 = buf_660.term();
        } sink.propertyNamed("$ColumnLocation", term_787);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdispatchCase); sink.copy(sub_112.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1064;
        {
          BufferSink buf_723 = sink.context().makeBuffer(); buf_723.start(_M_STRING); buf_723.literal(1); buf_723.end();
          term_1064 = buf_723.term();
        } sink.propertyNamed("$LineLocation", term_1064);Term term_864;
        {
          BufferSink buf_796 = sink.context().makeBuffer(); buf_796.start(_M_STRING); buf_796.literal(2); buf_796.end();
          term_864 = buf_796.term();
        } sink.propertyNamed("$ColumnLocation", term_864);
        sink.start(_M__sTextCons);Term term_879;
        {
          BufferSink buf_876 = sink.context().makeBuffer(); buf_876.start(_M_STRING); buf_876.literal(1); buf_876.end();
          term_879 = buf_876.term();
        } sink.propertyNamed("$LineLocation", term_879);Term term_623;
        {
          BufferSink buf_612 = sink.context().makeBuffer(); buf_612.start(_M_STRING); buf_612.literal(2); buf_612.end();
          term_623 = buf_612.term();
        } sink.propertyNamed("$ColumnLocation", term_623);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_448;
        {
          BufferSink buf_561 = sink.context().makeBuffer(); buf_561.start(_M_STRING); buf_561.literal(1); buf_561.end();
          term_448 = buf_561.term();
        } sink.propertyNamed("$LineLocation", term_448);Term term_900;
        {
          BufferSink buf_710 = sink.context().makeBuffer();
          buf_710.start(_M_STRING); buf_710.literal(31);
          buf_710.end();
          term_900 = buf_710.term();
        } sink.propertyNamed("$ColumnLocation", term_900);
        sink.start(_M__sTextCons);Term term_783;
        {
          BufferSink buf_433 = sink.context().makeBuffer(); buf_433.start(_M_STRING); buf_433.literal(1); buf_433.end();
          term_783 = buf_433.term();
        } sink.propertyNamed("$LineLocation", term_783);Term term_974;
        {
          BufferSink buf_822 = sink.context().makeBuffer();
          buf_822.start(_M_STRING); buf_822.literal(31);
          buf_822.end();
          term_974 = buf_822.term();
        } sink.propertyNamed("$ColumnLocation", term_974);
        sink.start(_M__sTextEmbed);Term term_433;
        {
          BufferSink buf_722 = sink.context().makeBuffer(); buf_722.start(_M_STRING); buf_722.literal(1); buf_722.end();
          term_433 = buf_722.term();
        } sink.propertyNamed("$LineLocation", term_433);Term term_1210;
        {
          BufferSink buf_904 = sink.context().makeBuffer();
          buf_904.start(_M_STRING); buf_904.literal(31);
          buf_904.end();
          term_1210 = buf_904.term();
        } sink.propertyNamed("$ColumnLocation", term_1210);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_46 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_46});
        sink.start(_M_Crsx_xPrint_xdispatchCases_xS1); sink.use(var_46);
        sink.end(); sink.copy(sub_18.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_817;
        {
          BufferSink buf_409 = sink.context().makeBuffer(); buf_409.start(_M_STRING); buf_409.literal(1); buf_409.end();
          term_817 = buf_409.term();
        } sink.propertyNamed("$LineLocation", term_817);Term term_909;
        {
          BufferSink buf_734 = sink.context().makeBuffer();
          buf_734.start(_M_STRING); buf_734.literal(88);
          buf_734.end();
          term_909 = buf_734.term();
        } sink.propertyNamed("$ColumnLocation", term_909);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_891;
        {
          BufferSink buf_860 = sink.context().makeBuffer(); buf_860.start(_M_STRING); buf_860.literal(1); buf_860.end();
          term_891 = buf_860.term();
        } sink.propertyNamed("$LineLocation", term_891);Term term_803;
        {
          BufferSink buf_1320 = sink.context().makeBuffer();
          buf_1320.start(_M_STRING); buf_1320.literal(32);
          buf_1320.end();
          term_803 = buf_1320.term();
        } sink.propertyNamed("$ColumnLocation", term_803);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdispatchCases, term_737);
  } final public static boolean _M_Crsx_xPrint_xdispatchTerm(Sink sink, int shared, int depth, Term term_711) {
    if (depth < 2000) {
      label_145: {
        if (term_711.descriptor() != _M_Crsx_xdispatchTerm)
        {   break label_145;
        }Term sub_152 = term_711.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1004;
        {
          BufferSink buf_1180 = sink.context().makeBuffer();
          buf_1180.start(_M_STRING); buf_1180.literal(1);
          buf_1180.end();
          term_1004 = buf_1180.term();
        } sink.propertyNamed("$LineLocation", term_1004);Term term_551;
        {
          BufferSink buf_800 = sink.context().makeBuffer(); buf_800.start(_M_STRING); buf_800.literal(1); buf_800.end();
          term_551 = buf_800.term();
        } sink.propertyNamed("$ColumnLocation", term_551);
        sink.start(_M__sTextCons);Term term_684;
        {
          BufferSink buf_572 = sink.context().makeBuffer(); buf_572.start(_M_STRING); buf_572.literal(1); buf_572.end();
          term_684 = buf_572.term();
        } sink.propertyNamed("$LineLocation", term_684);Term term_1484;
        {
          BufferSink buf_795 = sink.context().makeBuffer(); buf_795.start(_M_STRING); buf_795.literal(1); buf_795.end();
          term_1484 = buf_795.term();
        } sink.propertyNamed("$ColumnLocation", term_1484);
        sink.start(_M__sTextEmbed);Term term_1302;
        {
          BufferSink buf_747 = sink.context().makeBuffer(); buf_747.start(_M_STRING); buf_747.literal(1); buf_747.end();
          term_1302 = buf_747.term();
        } sink.propertyNamed("$LineLocation", term_1302);Term term_1157;
        {
          BufferSink buf_1076 = sink.context().makeBuffer();
          buf_1076.start(_M_STRING); buf_1076.literal(1);
          buf_1076.end();
          term_1157 = buf_1076.term();
        } sink.propertyNamed("$ColumnLocation", term_1157);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_152.ref());
        sink.end();
        sink.end();
        sink.end();Term term_870;
        {
          BufferSink buf_694 = sink.context().makeBuffer(); buf_694.start(_M_STRING); buf_694.literal(1); buf_694.end();
          term_870 = buf_694.term();
        } sink.propertyNamed("$LineLocation", term_870);Term term_1273;
        {
          BufferSink buf_897 = sink.context().makeBuffer(); buf_897.start(_M_STRING); buf_897.literal(2); buf_897.end();
          term_1273 = buf_897.term();
        } sink.propertyNamed("$ColumnLocation", term_1273);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdispatchTerm, term_711);
  } final public static boolean _M_Crsx_xPrint_xdispatch(Sink sink, int shared, int depth, Term term_1227) {
    if (depth < 2000) {
      label_63: {
        if (term_1227.descriptor() != _M_Crsx_xdispatch)
        {   break label_63;
        }Term sub_163 = term_1227.sub(0).ref();
        /* #1=sub */Term sub_83 = term_1227.sub(1).ref();
        /* #2=sub */Term sub_131 = term_1227.sub(2).ref();
        /* #3=sub */Term sub_91 = term_1227.sub(3).ref();
        /* #4=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_604;
        {
          BufferSink buf_441 = sink.context().makeBuffer(); buf_441.start(_M_STRING); buf_441.literal(1); buf_441.end();
          term_604 = buf_441.term();
        } sink.propertyNamed("$LineLocation", term_604);Term term_319;
        {
          BufferSink buf_498 = sink.context().makeBuffer(); buf_498.start(_M_STRING); buf_498.literal(1); buf_498.end();
          term_319 = buf_498.term();
        } sink.propertyNamed("$ColumnLocation", term_319);
        sink.start(_M__sTextCons);Term term_717;
        {
          BufferSink buf_544 = sink.context().makeBuffer(); buf_544.start(_M_STRING); buf_544.literal(1); buf_544.end();
          term_717 = buf_544.term();
        } sink.propertyNamed("$LineLocation", term_717);Term term_443;
        {
          BufferSink buf_1004 = sink.context().makeBuffer();
          buf_1004.start(_M_STRING); buf_1004.literal(2);
          buf_1004.end();
          term_443 = buf_1004.term();
        } sink.propertyNamed("$ColumnLocation", term_443);
        sink.start(_M__sTextChars); sink.copy(sub_163.ref());
        sink.end();Term term_1016;
        {
          BufferSink buf_414 = sink.context().makeBuffer(); buf_414.start(_M_STRING); buf_414.literal(1); buf_414.end();
          term_1016 = buf_414.term();
        } sink.propertyNamed("$LineLocation", term_1016);Term term_519;
        {
          BufferSink buf_830 = sink.context().makeBuffer(); buf_830.start(_M_STRING); buf_830.literal(3); buf_830.end();
          term_519 = buf_830.term();
        } sink.propertyNamed("$ColumnLocation", term_519);
        sink.start(_M__sTextCons);Term term_446;
        {
          BufferSink buf_931 = sink.context().makeBuffer(); buf_931.start(_M_STRING); buf_931.literal(1); buf_931.end();
          term_446 = buf_931.term();
        } sink.propertyNamed("$LineLocation", term_446);Term term_872;
        {
          BufferSink buf_500 = sink.context().makeBuffer(); buf_500.start(_M_STRING); buf_500.literal(3); buf_500.end();
          term_872 = buf_500.term();
        } sink.propertyNamed("$ColumnLocation", term_872);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1450;
        {
          BufferSink buf_514 = sink.context().makeBuffer(); buf_514.start(_M_STRING); buf_514.literal(1); buf_514.end();
          term_1450 = buf_514.term();
        } sink.propertyNamed("$LineLocation", term_1450);Term term_557;
        {
          BufferSink buf_1160 = sink.context().makeBuffer();
          buf_1160.start(_M_STRING); buf_1160.literal(7);
          buf_1160.end();
          term_557 = buf_1160.term();
        } sink.propertyNamed("$ColumnLocation", term_557);
        sink.start(_M__sTextCons);Term term_939;
        {
          BufferSink buf_688 = sink.context().makeBuffer(); buf_688.start(_M_STRING); buf_688.literal(1); buf_688.end();
          term_939 = buf_688.term();
        } sink.propertyNamed("$LineLocation", term_939);Term term_614;
        {
          BufferSink buf_832 = sink.context().makeBuffer(); buf_832.start(_M_STRING); buf_832.literal(7); buf_832.end();
          term_614 = buf_832.term();
        } sink.propertyNamed("$ColumnLocation", term_614);
        sink.start(_M__sTextEmbed);Term term_1079;
        {
          BufferSink buf_884 = sink.context().makeBuffer(); buf_884.start(_M_STRING); buf_884.literal(1); buf_884.end();
          term_1079 = buf_884.term();
        } sink.propertyNamed("$LineLocation", term_1079);Term term_796;
        {
          BufferSink buf_680 = sink.context().makeBuffer(); buf_680.start(_M_STRING); buf_680.literal(7); buf_680.end();
          term_796 = buf_680.term();
        } sink.propertyNamed("$ColumnLocation", term_796);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdispatchTerm); sink.copy(sub_83.ref());
        sink.end();
        sink.end();
        sink.end();Term term_899;
        {
          BufferSink buf_727 = sink.context().makeBuffer(); buf_727.start(_M_STRING); buf_727.literal(1); buf_727.end();
          term_899 = buf_727.term();
        } sink.propertyNamed("$LineLocation", term_899);Term term_545;
        {
          BufferSink buf_811 = sink.context().makeBuffer(); buf_811.start(_M_STRING); buf_811.literal(8); buf_811.end();
          term_545 = buf_811.term();
        } sink.propertyNamed("$ColumnLocation", term_545);
        sink.start(_M__sTextCons);Term term_618;
        {
          BufferSink buf_944 = sink.context().makeBuffer(); buf_944.start(_M_STRING); buf_944.literal(1); buf_944.end();
          term_618 = buf_944.term();
        } sink.propertyNamed("$LineLocation", term_618);Term term_886;
        {
          BufferSink buf_456 = sink.context().makeBuffer(); buf_456.start(_M_STRING); buf_456.literal(8); buf_456.end();
          term_886 = buf_456.term();
        } sink.propertyNamed("$ColumnLocation", term_886);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_927;
        {
          BufferSink buf_1032 = sink.context().makeBuffer();
          buf_1032.start(_M_STRING); buf_1032.literal(1);
          buf_1032.end();
          term_927 = buf_1032.term();
        } sink.propertyNamed("$LineLocation", term_927);Term term_838;
        {
          BufferSink buf_629 = sink.context().makeBuffer();
          buf_629.start(_M_STRING); buf_629.literal(37);
          buf_629.end();
          term_838 = buf_629.term();
        } sink.propertyNamed("$ColumnLocation", term_838);
        sink.start(_M__sTextCons);Term term_725;
        {
          BufferSink buf_667 = sink.context().makeBuffer(); buf_667.start(_M_STRING); buf_667.literal(1); buf_667.end();
          term_725 = buf_667.term();
        } sink.propertyNamed("$LineLocation", term_725);Term term_611;
        {
          BufferSink buf_466 = sink.context().makeBuffer();
          buf_466.start(_M_STRING); buf_466.literal(37);
          buf_466.end();
          term_611 = buf_466.term();
        } sink.propertyNamed("$ColumnLocation", term_611);
        sink.start(_M__sTextEmbed);Term term_620;
        {
          BufferSink buf_977 = sink.context().makeBuffer(); buf_977.start(_M_STRING); buf_977.literal(1); buf_977.end();
          term_620 = buf_977.term();
        } sink.propertyNamed("$LineLocation", term_620);Term term_847;
        {
          BufferSink buf_945 = sink.context().makeBuffer();
          buf_945.start(_M_STRING); buf_945.literal(37);
          buf_945.end();
          term_847 = buf_945.term();
        } sink.propertyNamed("$ColumnLocation", term_847);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdispatchCases); sink.copy(sub_131.ref());
        sink.end();
        sink.end();
        sink.end();Term term_437;
        {
          BufferSink buf_763 = sink.context().makeBuffer(); buf_763.start(_M_STRING); buf_763.literal(1); buf_763.end();
          term_437 = buf_763.term();
        } sink.propertyNamed("$LineLocation", term_437);Term term_628;
        {
          BufferSink buf_702 = sink.context().makeBuffer();
          buf_702.start(_M_STRING); buf_702.literal(38);
          buf_702.end();
          term_628 = buf_702.term();
        } sink.propertyNamed("$ColumnLocation", term_628);
        sink.start(_M__sTextCons);Term term_710;
        {
          BufferSink buf_403 = sink.context().makeBuffer(); buf_403.start(_M_STRING); buf_403.literal(1); buf_403.end();
          term_710 = buf_403.term();
        } sink.propertyNamed("$LineLocation", term_710);Term term_794;
        {
          BufferSink buf_974 = sink.context().makeBuffer();
          buf_974.start(_M_STRING); buf_974.literal(38);
          buf_974.end();
          term_794 = buf_974.term();
        } sink.propertyNamed("$ColumnLocation", term_794);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1050;
        {
          BufferSink buf_641 = sink.context().makeBuffer(); buf_641.start(_M_STRING); buf_641.literal(1); buf_641.end();
          term_1050 = buf_641.term();
        } sink.propertyNamed("$LineLocation", term_1050);Term term_1073;
        {
          BufferSink buf_972 = sink.context().makeBuffer();
          buf_972.start(_M_STRING); buf_972.literal(68);
          buf_972.end();
          term_1073 = buf_972.term();
        } sink.propertyNamed("$ColumnLocation", term_1073);
        sink.start(_M__sTextCons);Term term_1169;
        {
          BufferSink buf_793 = sink.context().makeBuffer(); buf_793.start(_M_STRING); buf_793.literal(1); buf_793.end();
          term_1169 = buf_793.term();
        } sink.propertyNamed("$LineLocation", term_1169);Term term_795;
        {
          BufferSink buf_742 = sink.context().makeBuffer();
          buf_742.start(_M_STRING); buf_742.literal(68);
          buf_742.end();
          term_795 = buf_742.term();
        } sink.propertyNamed("$ColumnLocation", term_795);
        sink.start(_M__sTextEmbed);Term term_789;
        {
          BufferSink buf_892 = sink.context().makeBuffer(); buf_892.start(_M_STRING); buf_892.literal(1); buf_892.end();
          term_789 = buf_892.term();
        } sink.propertyNamed("$LineLocation", term_789);Term term_915;
        {
          BufferSink buf_681 = sink.context().makeBuffer();
          buf_681.start(_M_STRING); buf_681.literal(68);
          buf_681.end();
          term_915 = buf_681.term();
        } sink.propertyNamed("$ColumnLocation", term_915);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_94 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_94});
        sink.start(_M_Crsx_xPrint_xdelayCase); sink.use(var_94);
        sink.end(); sink.copy(sub_91.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1259;
        {
          BufferSink buf_1033 = sink.context().makeBuffer();
          buf_1033.start(_M_STRING); buf_1033.literal(1);
          buf_1033.end();
          term_1259 = buf_1033.term();
        } sink.propertyNamed("$LineLocation", term_1259);Term term_1200;
        {
          BufferSink buf_1267 = sink.context().makeBuffer();
          buf_1267.start(_M_STRING); buf_1267.literal(118);
          buf_1267.end();
          term_1200 = buf_1267.term();
        } sink.propertyNamed("$ColumnLocation", term_1200);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_819;
        {
          BufferSink buf_663 = sink.context().makeBuffer(); buf_663.start(_M_STRING); buf_663.literal(1); buf_663.end();
          term_819 = buf_663.term();
        } sink.propertyNamed("$LineLocation", term_819);Term term_1012;
        {
          BufferSink buf_1271 = sink.context().makeBuffer();
          buf_1271.start(_M_STRING); buf_1271.literal(69);
          buf_1271.end();
          term_1012 = buf_1271.term();
        } sink.propertyNamed("$ColumnLocation", term_1012);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdispatch, term_1227);
  } final public static boolean _M_Crsx_xPrint_xconcrete(Sink sink, int shared, int depth, Term term_755) {
    if (depth < 2000) {
      label_65: {
        if (term_755.descriptor() != _M_Crsx_xconcrete_xA1)
        {   break label_65;
        }Term sub_79 = term_755.sub(0).ref();
        /* #1=sub */Term sub_195 = term_755.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_523;
        {
          BufferSink buf_825 = sink.context().makeBuffer(); buf_825.start(_M_STRING); buf_825.literal(1); buf_825.end();
          term_523 = buf_825.term();
        } sink.propertyNamed("$LineLocation", term_523);Term term_569;
        {
          BufferSink buf_991 = sink.context().makeBuffer(); buf_991.start(_M_STRING); buf_991.literal(1); buf_991.end();
          term_569 = buf_991.term();
        } sink.propertyNamed("$ColumnLocation", term_569);
        sink.start(_M__sTextCons);Term term_1370;
        {
          BufferSink buf_468 = sink.context().makeBuffer(); buf_468.start(_M_STRING); buf_468.literal(1); buf_468.end();
          term_1370 = buf_468.term();
        } sink.propertyNamed("$LineLocation", term_1370);Term term_576;
        {
          BufferSink buf_1041 = sink.context().makeBuffer();
          buf_1041.start(_M_STRING); buf_1041.literal(2);
          buf_1041.end();
          term_576 = buf_1041.term();
        } sink.propertyNamed("$ColumnLocation", term_576);
        sink.start(_M__sTextChars); sink.copy(sub_79.ref());
        sink.end();Term term_799;
        {
          BufferSink buf_1093 = sink.context().makeBuffer();
          buf_1093.start(_M_STRING); buf_1093.literal(1);
          buf_1093.end();
          term_799 = buf_1093.term();
        } sink.propertyNamed("$LineLocation", term_799);Term term_1101;
        {
          BufferSink buf_627 = sink.context().makeBuffer(); buf_627.start(_M_STRING); buf_627.literal(3); buf_627.end();
          term_1101 = buf_627.term();
        } sink.propertyNamed("$ColumnLocation", term_1101);
        sink.start(_M__sTextCons);Term term_1109;
        {
          BufferSink buf_755 = sink.context().makeBuffer(); buf_755.start(_M_STRING); buf_755.literal(1); buf_755.end();
          term_1109 = buf_755.term();
        } sink.propertyNamed("$LineLocation", term_1109);Term term_923;
        {
          BufferSink buf_1318 = sink.context().makeBuffer();
          buf_1318.start(_M_STRING); buf_1318.literal(3);
          buf_1318.end();
          term_923 = buf_1318.term();
        } sink.propertyNamed("$ColumnLocation", term_923);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_723;
        {
          BufferSink buf_975 = sink.context().makeBuffer(); buf_975.start(_M_STRING); buf_975.literal(1); buf_975.end();
          term_723 = buf_975.term();
        } sink.propertyNamed("$LineLocation", term_723);Term term_1087;
        {
          BufferSink buf_486 = sink.context().makeBuffer(); buf_486.start(_M_STRING); buf_486.literal(7); buf_486.end();
          term_1087 = buf_486.term();
        } sink.propertyNamed("$ColumnLocation", term_1087);
        sink.start(_M__sTextCons);Term term_606;
        {
          BufferSink buf_932 = sink.context().makeBuffer(); buf_932.start(_M_STRING); buf_932.literal(1); buf_932.end();
          term_606 = buf_932.term();
        } sink.propertyNamed("$LineLocation", term_606);Term term_954;
        {
          BufferSink buf_593 = sink.context().makeBuffer(); buf_593.start(_M_STRING); buf_593.literal(8); buf_593.end();
          term_954 = buf_593.term();
        } sink.propertyNamed("$ColumnLocation", term_954);
        sink.start(_M__sTextChars); sink.copy(sub_195.ref());
        sink.end();Term term_595;
        {
          BufferSink buf_480 = sink.context().makeBuffer(); buf_480.start(_M_STRING); buf_480.literal(1); buf_480.end();
          term_595 = buf_480.term();
        } sink.propertyNamed("$LineLocation", term_595);Term term_987;
        {
          BufferSink buf_709 = sink.context().makeBuffer(); buf_709.start(_M_STRING); buf_709.literal(9); buf_709.end();
          term_987 = buf_709.term();
        } sink.propertyNamed("$ColumnLocation", term_987);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_178: {
        if (term_755.descriptor() != _M_Crsx_xconcrete_xA2)
        {   break label_178;
        }Term sub_182 = term_755.sub(0).ref();
        /* #1=sub */Term sub_87 = term_755.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1160;
        {
          BufferSink buf_867 = sink.context().makeBuffer(); buf_867.start(_M_STRING); buf_867.literal(1); buf_867.end();
          term_1160 = buf_867.term();
        } sink.propertyNamed("$LineLocation", term_1160);Term term_831;
        {
          BufferSink buf_875 = sink.context().makeBuffer(); buf_875.start(_M_STRING); buf_875.literal(1); buf_875.end();
          term_831 = buf_875.term();
        } sink.propertyNamed("$ColumnLocation", term_831);
        sink.start(_M__sTextCons);Term term_890;
        {
          BufferSink buf_1194 = sink.context().makeBuffer();
          buf_1194.start(_M_STRING); buf_1194.literal(1);
          buf_1194.end();
          term_890 = buf_1194.term();
        } sink.propertyNamed("$LineLocation", term_890);Term term_1253;
        {
          BufferSink buf_870 = sink.context().makeBuffer(); buf_870.start(_M_STRING); buf_870.literal(2); buf_870.end();
          term_1253 = buf_870.term();
        } sink.propertyNamed("$ColumnLocation", term_1253);
        sink.start(_M__sTextChars); sink.copy(sub_182.ref());
        sink.end();Term term_403;
        {
          BufferSink buf_1021 = sink.context().makeBuffer();
          buf_1021.start(_M_STRING); buf_1021.literal(1);
          buf_1021.end();
          term_403 = buf_1021.term();
        } sink.propertyNamed("$LineLocation", term_403);Term term_685;
        {
          BufferSink buf_615 = sink.context().makeBuffer(); buf_615.start(_M_STRING); buf_615.literal(3); buf_615.end();
          term_685 = buf_615.term();
        } sink.propertyNamed("$ColumnLocation", term_685);
        sink.start(_M__sTextCons);Term term_1247;
        {
          BufferSink buf_675 = sink.context().makeBuffer(); buf_675.start(_M_STRING); buf_675.literal(1); buf_675.end();
          term_1247 = buf_675.term();
        } sink.propertyNamed("$LineLocation", term_1247);Term term_1385;
        {
          BufferSink buf_1279 = sink.context().makeBuffer();
          buf_1279.start(_M_STRING); buf_1279.literal(3);
          buf_1279.end();
          term_1385 = buf_1279.term();
        } sink.propertyNamed("$ColumnLocation", term_1385);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_876;
        {
          BufferSink buf_1022 = sink.context().makeBuffer();
          buf_1022.start(_M_STRING); buf_1022.literal(1);
          buf_1022.end();
          term_876 = buf_1022.term();
        } sink.propertyNamed("$LineLocation", term_876);Term term_844;
        {
          BufferSink buf_994 = sink.context().makeBuffer(); buf_994.start(_M_STRING); buf_994.literal(7); buf_994.end();
          term_844 = buf_994.term();
        } sink.propertyNamed("$ColumnLocation", term_844);
        sink.start(_M__sTextCons);Term term_1007;
        {
          BufferSink buf_915 = sink.context().makeBuffer(); buf_915.start(_M_STRING); buf_915.literal(1); buf_915.end();
          term_1007 = buf_915.term();
        } sink.propertyNamed("$LineLocation", term_1007);Term term_1184;
        {
          BufferSink buf_835 = sink.context().makeBuffer(); buf_835.start(_M_STRING); buf_835.literal(8); buf_835.end();
          term_1184 = buf_835.term();
        } sink.propertyNamed("$ColumnLocation", term_1184);
        sink.start(_M__sTextChars); sink.copy(sub_87.ref());
        sink.end();Term term_729;
        {
          BufferSink buf_834 = sink.context().makeBuffer(); buf_834.start(_M_STRING); buf_834.literal(1); buf_834.end();
          term_729 = buf_834.term();
        } sink.propertyNamed("$LineLocation", term_729);Term term_405;
        {
          BufferSink buf_1486 = sink.context().makeBuffer();
          buf_1486.start(_M_STRING); buf_1486.literal(9);
          buf_1486.end();
          term_405 = buf_1486.term();
        } sink.propertyNamed("$ColumnLocation", term_405);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_25: {
        if (term_755.descriptor() != _M_Crsx_xconcrete_xA3)
        {   break label_25;
        }Term sub_153 = term_755.sub(0).ref();
        /* #1=sub */Term sub_50 = term_755.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1481;
        {
          BufferSink buf_412 = sink.context().makeBuffer(); buf_412.start(_M_STRING); buf_412.literal(1); buf_412.end();
          term_1481 = buf_412.term();
        } sink.propertyNamed("$LineLocation", term_1481);Term term_991;
        {
          BufferSink buf_1175 = sink.context().makeBuffer();
          buf_1175.start(_M_STRING); buf_1175.literal(1);
          buf_1175.end();
          term_991 = buf_1175.term();
        } sink.propertyNamed("$ColumnLocation", term_991);
        sink.start(_M__sTextCons);Term term_574;
        {
          BufferSink buf_746 = sink.context().makeBuffer(); buf_746.start(_M_STRING); buf_746.literal(1); buf_746.end();
          term_574 = buf_746.term();
        } sink.propertyNamed("$LineLocation", term_574);Term term_538;
        {
          BufferSink buf_804 = sink.context().makeBuffer(); buf_804.start(_M_STRING); buf_804.literal(2); buf_804.end();
          term_538 = buf_804.term();
        } sink.propertyNamed("$ColumnLocation", term_538);
        sink.start(_M__sTextChars); sink.copy(sub_153.ref());
        sink.end();Term term_596;
        {
          BufferSink buf_858 = sink.context().makeBuffer(); buf_858.start(_M_STRING); buf_858.literal(1); buf_858.end();
          term_596 = buf_858.term();
        } sink.propertyNamed("$LineLocation", term_596);Term term_1242;
        {
          BufferSink buf_1072 = sink.context().makeBuffer();
          buf_1072.start(_M_STRING); buf_1072.literal(3);
          buf_1072.end();
          term_1242 = buf_1072.term();
        } sink.propertyNamed("$ColumnLocation", term_1242);
        sink.start(_M__sTextCons);Term term_855;
        {
          BufferSink buf_1120 = sink.context().makeBuffer();
          buf_1120.start(_M_STRING); buf_1120.literal(1);
          buf_1120.end();
          term_855 = buf_1120.term();
        } sink.propertyNamed("$LineLocation", term_855);Term term_911;
        {
          BufferSink buf_656 = sink.context().makeBuffer(); buf_656.start(_M_STRING); buf_656.literal(3); buf_656.end();
          term_911 = buf_656.term();
        } sink.propertyNamed("$ColumnLocation", term_911);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_730;
        {
          BufferSink buf_1084 = sink.context().makeBuffer();
          buf_1084.start(_M_STRING); buf_1084.literal(1);
          buf_1084.end();
          term_730 = buf_1084.term();
        } sink.propertyNamed("$LineLocation", term_730);Term term_810;
        {
          BufferSink buf_1042 = sink.context().makeBuffer();
          buf_1042.start(_M_STRING); buf_1042.literal(7);
          buf_1042.end();
          term_810 = buf_1042.term();
        } sink.propertyNamed("$ColumnLocation", term_810);
        sink.start(_M__sTextCons);Term term_1081;
        {
          BufferSink buf_828 = sink.context().makeBuffer(); buf_828.start(_M_STRING); buf_828.literal(1); buf_828.end();
          term_1081 = buf_828.term();
        } sink.propertyNamed("$LineLocation", term_1081);Term term_998;
        {
          BufferSink buf_916 = sink.context().makeBuffer(); buf_916.start(_M_STRING); buf_916.literal(8); buf_916.end();
          term_998 = buf_916.term();
        } sink.propertyNamed("$ColumnLocation", term_998);
        sink.start(_M__sTextChars); sink.copy(sub_50.ref());
        sink.end();Term term_1212;
        {
          BufferSink buf_701 = sink.context().makeBuffer(); buf_701.start(_M_STRING); buf_701.literal(1); buf_701.end();
          term_1212 = buf_701.term();
        } sink.propertyNamed("$LineLocation", term_1212);Term term_671;
        {
          BufferSink buf_855 = sink.context().makeBuffer(); buf_855.start(_M_STRING); buf_855.literal(9); buf_855.end();
          term_671 = buf_855.term();
        } sink.propertyNamed("$ColumnLocation", term_671);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_171: {
        if (term_755.descriptor() != _M_Crsx_xconcrete_xA4)
        {   break label_171;
        }Term sub_429 = term_755.sub(0).ref();
        /* #1=sub */Term sub_299 = term_755.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1205;
        {
          BufferSink buf_794 = sink.context().makeBuffer(); buf_794.start(_M_STRING); buf_794.literal(1); buf_794.end();
          term_1205 = buf_794.term();
        } sink.propertyNamed("$LineLocation", term_1205);Term term_1141;
        {
          BufferSink buf_1154 = sink.context().makeBuffer();
          buf_1154.start(_M_STRING); buf_1154.literal(1);
          buf_1154.end();
          term_1141 = buf_1154.term();
        } sink.propertyNamed("$ColumnLocation", term_1141);
        sink.start(_M__sTextCons);Term term_874;
        {
          BufferSink buf_824 = sink.context().makeBuffer(); buf_824.start(_M_STRING); buf_824.literal(1); buf_824.end();
          term_874 = buf_824.term();
        } sink.propertyNamed("$LineLocation", term_874);Term term_1089;
        {
          BufferSink buf_801 = sink.context().makeBuffer(); buf_801.start(_M_STRING); buf_801.literal(2); buf_801.end();
          term_1089 = buf_801.term();
        } sink.propertyNamed("$ColumnLocation", term_1089);
        sink.start(_M__sTextChars); sink.copy(sub_429.ref());
        sink.end();Term term_959;
        {
          BufferSink buf_741 = sink.context().makeBuffer(); buf_741.start(_M_STRING); buf_741.literal(1); buf_741.end();
          term_959 = buf_741.term();
        } sink.propertyNamed("$LineLocation", term_959);Term term_1143;
        {
          BufferSink buf_907 = sink.context().makeBuffer(); buf_907.start(_M_STRING); buf_907.literal(3); buf_907.end();
          term_1143 = buf_907.term();
        } sink.propertyNamed("$ColumnLocation", term_1143);
        sink.start(_M__sTextCons);Term term_722;
        {
          BufferSink buf_946 = sink.context().makeBuffer(); buf_946.start(_M_STRING); buf_946.literal(1); buf_946.end();
          term_722 = buf_946.term();
        } sink.propertyNamed("$LineLocation", term_722);Term term_843;
        {
          BufferSink buf_564 = sink.context().makeBuffer(); buf_564.start(_M_STRING); buf_564.literal(3); buf_564.end();
          term_843 = buf_564.term();
        } sink.propertyNamed("$ColumnLocation", term_843);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_542;
        {
          BufferSink buf_521 = sink.context().makeBuffer(); buf_521.start(_M_STRING); buf_521.literal(1); buf_521.end();
          term_542 = buf_521.term();
        } sink.propertyNamed("$LineLocation", term_542);Term term_689;
        {
          BufferSink buf_1013 = sink.context().makeBuffer();
          buf_1013.start(_M_STRING); buf_1013.literal(7);
          buf_1013.end();
          term_689 = buf_1013.term();
        } sink.propertyNamed("$ColumnLocation", term_689);
        sink.start(_M__sTextCons);Term term_1501;
        {
          BufferSink buf_979 = sink.context().makeBuffer(); buf_979.start(_M_STRING); buf_979.literal(1); buf_979.end();
          term_1501 = buf_979.term();
        } sink.propertyNamed("$LineLocation", term_1501);Term term_1145;
        {
          BufferSink buf_730 = sink.context().makeBuffer(); buf_730.start(_M_STRING); buf_730.literal(8); buf_730.end();
          term_1145 = buf_730.term();
        } sink.propertyNamed("$ColumnLocation", term_1145);
        sink.start(_M__sTextChars); sink.copy(sub_299.ref());
        sink.end();Term term_967;
        {
          BufferSink buf_1525 = sink.context().makeBuffer();
          buf_1525.start(_M_STRING); buf_1525.literal(1);
          buf_1525.end();
          term_967 = buf_1525.term();
        } sink.propertyNamed("$LineLocation", term_967);Term term_1062;
        {
          BufferSink buf_1089 = sink.context().makeBuffer();
          buf_1089.start(_M_STRING); buf_1089.literal(9);
          buf_1089.end();
          term_1062 = buf_1089.term();
        } sink.propertyNamed("$ColumnLocation", term_1062);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xconcrete, term_755);
  } final public static boolean _M_Crsx_xPrint_xvarsort(Sink sink, int shared, int depth, Term term_980) {
    if (depth < 2000) {
      label_64: {
        if (term_980.descriptor() != _M_Crsx_xvarsort)
        {   break label_64;
        }Term sub_248 = term_980.sub(0).ref();
        /* #1=sub */Term sub_140 = term_980.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1696;
        {
          BufferSink buf_903 = sink.context().makeBuffer(); buf_903.start(_M_STRING); buf_903.literal(1); buf_903.end();
          term_1696 = buf_903.term();
        } sink.propertyNamed("$LineLocation", term_1696);Term term_630;
        {
          BufferSink buf_842 = sink.context().makeBuffer(); buf_842.start(_M_STRING); buf_842.literal(1); buf_842.end();
          term_630 = buf_842.term();
        } sink.propertyNamed("$ColumnLocation", term_630);
        sink.start(_M__sTextCons);Term term_728;
        {
          BufferSink buf_519 = sink.context().makeBuffer(); buf_519.start(_M_STRING); buf_519.literal(1); buf_519.end();
          term_728 = buf_519.term();
        } sink.propertyNamed("$LineLocation", term_728);Term term_788;
        {
          BufferSink buf_1007 = sink.context().makeBuffer();
          buf_1007.start(_M_STRING); buf_1007.literal(2);
          buf_1007.end();
          term_788 = buf_1007.term();
        } sink.propertyNamed("$ColumnLocation", term_788);
        sink.start(_M__sTextChars); sink.copy(sub_248.ref());
        sink.end();Term term_822;
        {
          BufferSink buf_1142 = sink.context().makeBuffer();
          buf_1142.start(_M_STRING); buf_1142.literal(1);
          buf_1142.end();
          term_822 = buf_1142.term();
        } sink.propertyNamed("$LineLocation", term_822);Term term_759;
        {
          BufferSink buf_1065 = sink.context().makeBuffer();
          buf_1065.start(_M_STRING); buf_1065.literal(3);
          buf_1065.end();
          term_759 = buf_1065.term();
        } sink.propertyNamed("$ColumnLocation", term_759);
        sink.start(_M__sTextCons);Term term_1022;
        {
          BufferSink buf_782 = sink.context().makeBuffer(); buf_782.start(_M_STRING); buf_782.literal(1); buf_782.end();
          term_1022 = buf_782.term();
        } sink.propertyNamed("$LineLocation", term_1022);Term term_888;
        {
          BufferSink buf_551 = sink.context().makeBuffer(); buf_551.start(_M_STRING); buf_551.literal(3); buf_551.end();
          term_888 = buf_551.term();
        } sink.propertyNamed("$ColumnLocation", term_888);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_462;
        {
          BufferSink buf_857 = sink.context().makeBuffer(); buf_857.start(_M_STRING); buf_857.literal(1); buf_857.end();
          term_462 = buf_857.term();
        } sink.propertyNamed("$LineLocation", term_462);Term term_665;
        {
          BufferSink buf_911 = sink.context().makeBuffer(); buf_911.start(_M_STRING); buf_911.literal(7); buf_911.end();
          term_665 = buf_911.term();
        } sink.propertyNamed("$ColumnLocation", term_665);
        sink.start(_M__sTextCons);Term term_804;
        {
          BufferSink buf_918 = sink.context().makeBuffer(); buf_918.start(_M_STRING); buf_918.literal(1); buf_918.end();
          term_804 = buf_918.term();
        } sink.propertyNamed("$LineLocation", term_804);Term term_1151;
        {
          BufferSink buf_689 = sink.context().makeBuffer(); buf_689.start(_M_STRING); buf_689.literal(7); buf_689.end();
          term_1151 = buf_689.term();
        } sink.propertyNamed("$ColumnLocation", term_1151);
        sink.start(_M__sTextEmbed);Term term_720;
        {
          BufferSink buf_714 = sink.context().makeBuffer(); buf_714.start(_M_STRING); buf_714.literal(1); buf_714.end();
          term_720 = buf_714.term();
        } sink.propertyNamed("$LineLocation", term_720);Term term_486;
        {
          BufferSink buf_609 = sink.context().makeBuffer(); buf_609.start(_M_STRING); buf_609.literal(7); buf_609.end();
          term_486 = buf_609.term();
        } sink.propertyNamed("$ColumnLocation", term_486);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xsortname); sink.copy(sub_140.ref());
        sink.end();
        sink.end();
        sink.end();Term term_800;
        {
          BufferSink buf_893 = sink.context().makeBuffer(); buf_893.start(_M_STRING); buf_893.literal(1); buf_893.end();
          term_800 = buf_893.term();
        } sink.propertyNamed("$LineLocation", term_800);Term term_547;
        {
          BufferSink buf_1157 = sink.context().makeBuffer();
          buf_1157.start(_M_STRING); buf_1157.literal(8);
          buf_1157.end();
          term_547 = buf_1157.term();
        } sink.propertyNamed("$ColumnLocation", term_547);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xvarsort, term_980);
  } final public static boolean _M_Crsx_xPrint_xbinder(Sink sink, int shared, int depth, Term term_851) {
    if (depth < 2000) {
      label_159: {
        if (term_851.descriptor() != _M_Crsx_xbinder)
        {   break label_159;
        }Term sub_120 = term_851.sub(0).ref();
        /* #1=sub */Term sub_303 = term_851.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_663;
        {
          BufferSink buf_1440 = sink.context().makeBuffer();
          buf_1440.start(_M_STRING); buf_1440.literal(1);
          buf_1440.end();
          term_663 = buf_1440.term();
        } sink.propertyNamed("$LineLocation", term_663);Term term_633;
        {
          BufferSink buf_537 = sink.context().makeBuffer(); buf_537.start(_M_STRING); buf_537.literal(1); buf_537.end();
          term_633 = buf_537.term();
        } sink.propertyNamed("$ColumnLocation", term_633);
        sink.start(_M__sTextCons);Term term_1293;
        {
          BufferSink buf_659 = sink.context().makeBuffer(); buf_659.start(_M_STRING); buf_659.literal(1); buf_659.end();
          term_1293 = buf_659.term();
        } sink.propertyNamed("$LineLocation", term_1293);Term term_918;
        {
          BufferSink buf_1615 = sink.context().makeBuffer();
          buf_1615.start(_M_STRING); buf_1615.literal(1);
          buf_1615.end();
          term_918 = buf_1615.term();
        } sink.propertyNamed("$ColumnLocation", term_918);
        sink.start(_M__sTextEmbed);Term term_757;
        {
          BufferSink buf_644 = sink.context().makeBuffer(); buf_644.start(_M_STRING); buf_644.literal(1); buf_644.end();
          term_757 = buf_644.term();
        } sink.propertyNamed("$LineLocation", term_757);Term term_1166;
        {
          BufferSink buf_1062 = sink.context().makeBuffer();
          buf_1062.start(_M_STRING); buf_1062.literal(1);
          buf_1062.end();
          term_1166 = buf_1062.term();
        } sink.propertyNamed("$ColumnLocation", term_1166);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_68 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_68});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_68);
        sink.end(); sink.copy(sub_120.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1069;
        {
          BufferSink buf_1196 = sink.context().makeBuffer();
          buf_1196.start(_M_STRING); buf_1196.literal(1);
          buf_1196.end();
          term_1069 = buf_1196.term();
        } sink.propertyNamed("$LineLocation", term_1069);Term term_979;
        {
          BufferSink buf_769 = sink.context().makeBuffer();
          buf_769.start(_M_STRING); buf_769.literal(53);
          buf_769.end();
          term_979 = buf_769.term();
        } sink.propertyNamed("$ColumnLocation", term_979);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_920;
        {
          BufferSink buf_927 = sink.context().makeBuffer(); buf_927.start(_M_STRING); buf_927.literal(1); buf_927.end();
          term_920 = buf_927.term();
        } sink.propertyNamed("$LineLocation", term_920);Term term_1262;
        {
          BufferSink buf_1475 = sink.context().makeBuffer();
          buf_1475.start(_M_STRING); buf_1475.literal(2);
          buf_1475.end();
          term_1262 = buf_1475.term();
        } sink.propertyNamed("$ColumnLocation", term_1262);
        sink.start(_M__sTextCons);Term term_712;
        {
          BufferSink buf_962 = sink.context().makeBuffer(); buf_962.start(_M_STRING); buf_962.literal(1); buf_962.end();
          term_712 = buf_962.term();
        } sink.propertyNamed("$LineLocation", term_712);Term term_786;
        {
          BufferSink buf_1045 = sink.context().makeBuffer();
          buf_1045.start(_M_STRING); buf_1045.literal(2);
          buf_1045.end();
          term_786 = buf_1045.term();
        } sink.propertyNamed("$ColumnLocation", term_786);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_932;
        {
          BufferSink buf_757 = sink.context().makeBuffer(); buf_757.start(_M_STRING); buf_757.literal(1); buf_757.end();
          term_932 = buf_757.term();
        } sink.propertyNamed("$LineLocation", term_932);Term term_1133;
        {
          BufferSink buf_1171 = sink.context().makeBuffer();
          buf_1171.start(_M_STRING); buf_1171.literal(57);
          buf_1171.end();
          term_1133 = buf_1171.term();
        } sink.propertyNamed("$ColumnLocation", term_1133);
        sink.start(_M__sTextCons);Term term_977;
        {
          BufferSink buf_1170 = sink.context().makeBuffer();
          buf_1170.start(_M_STRING); buf_1170.literal(1);
          buf_1170.end();
          term_977 = buf_1170.term();
        } sink.propertyNamed("$LineLocation", term_977);Term term_845;
        {
          BufferSink buf_1401 = sink.context().makeBuffer();
          buf_1401.start(_M_STRING); buf_1401.literal(57);
          buf_1401.end();
          term_845 = buf_1401.term();
        } sink.propertyNamed("$ColumnLocation", term_845);
        sink.start(_M__sTextEmbed);Term term_1180;
        {
          BufferSink buf_637 = sink.context().makeBuffer(); buf_637.start(_M_STRING); buf_637.literal(1); buf_637.end();
          term_1180 = buf_637.term();
        } sink.propertyNamed("$LineLocation", term_1180);Term term_1237;
        {
          BufferSink buf_1046 = sink.context().makeBuffer();
          buf_1046.start(_M_STRING); buf_1046.literal(57);
          buf_1046.end();
          term_1237 = buf_1046.term();
        } sink.propertyNamed("$ColumnLocation", term_1237);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xvariable); sink.copy(sub_303.ref());
        sink.end();
        sink.end();
        sink.end();Term term_905;
        {
          BufferSink buf_1131 = sink.context().makeBuffer();
          buf_1131.start(_M_STRING); buf_1131.literal(1);
          buf_1131.end();
          term_905 = buf_1131.term();
        } sink.propertyNamed("$LineLocation", term_905);Term term_1098;
        {
          BufferSink buf_894 = sink.context().makeBuffer();
          buf_894.start(_M_STRING); buf_894.literal(58);
          buf_894.end();
          term_1098 = buf_894.term();
        } sink.propertyNamed("$ColumnLocation", term_1098);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xbinder, term_851);
  } final public static boolean _M_Crsx_xPrint_xliteral(Sink sink, int shared, int depth, Term term_1053) {
    if (depth < 2000) {
      label_30: {
        if (term_1053.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_30;
        }Term sub_249 = term_1053.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1014;
        {
          BufferSink buf_906 = sink.context().makeBuffer(); buf_906.start(_M_STRING); buf_906.literal(1); buf_906.end();
          term_1014 = buf_906.term();
        } sink.propertyNamed("$LineLocation", term_1014);Term term_588;
        {
          BufferSink buf_1052 = sink.context().makeBuffer();
          buf_1052.start(_M_STRING); buf_1052.literal(1);
          buf_1052.end();
          term_588 = buf_1052.term();
        } sink.propertyNamed("$ColumnLocation", term_588);
        sink.start(_M__sTextCons);Term term_1125;
        {
          BufferSink buf_600 = sink.context().makeBuffer(); buf_600.start(_M_STRING); buf_600.literal(1); buf_600.end();
          term_1125 = buf_600.term();
        } sink.propertyNamed("$LineLocation", term_1125);Term term_1529;
        {
          BufferSink buf_528 = sink.context().makeBuffer(); buf_528.start(_M_STRING); buf_528.literal(2); buf_528.end();
          term_1529 = buf_528.term();
        } sink.propertyNamed("$ColumnLocation", term_1529);
        sink.start(_M__sTextChars); sink.copy(sub_249.ref());
        sink.end();Term term_1172;
        {
          BufferSink buf_1094 = sink.context().makeBuffer();
          buf_1094.start(_M_STRING); buf_1094.literal(1);
          buf_1094.end();
          term_1172 = buf_1094.term();
        } sink.propertyNamed("$LineLocation", term_1172);Term term_941;
        {
          BufferSink buf_1156 = sink.context().makeBuffer();
          buf_1156.start(_M_STRING); buf_1156.literal(3);
          buf_1156.end();
          term_941 = buf_1156.term();
        } sink.propertyNamed("$ColumnLocation", term_941);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_31: {
        if (term_1053.descriptor() != _M_Crsx_xliteral_xA2)
        {   break label_31;
        }Term sub_314 = term_1053.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_771;
        {
          BufferSink buf_1255 = sink.context().makeBuffer();
          buf_1255.start(_M_STRING); buf_1255.literal(1);
          buf_1255.end();
          term_771 = buf_1255.term();
        } sink.propertyNamed("$LineLocation", term_771);Term term_926;
        {
          BufferSink buf_921 = sink.context().makeBuffer(); buf_921.start(_M_STRING); buf_921.literal(1); buf_921.end();
          term_926 = buf_921.term();
        } sink.propertyNamed("$ColumnLocation", term_926);
        sink.start(_M__sTextCons);Term term_1059;
        {
          BufferSink buf_472 = sink.context().makeBuffer(); buf_472.start(_M_STRING); buf_472.literal(1); buf_472.end();
          term_1059 = buf_472.term();
        } sink.propertyNamed("$LineLocation", term_1059);Term term_1548;
        {
          BufferSink buf_957 = sink.context().makeBuffer(); buf_957.start(_M_STRING); buf_957.literal(2); buf_957.end();
          term_1548 = buf_957.term();
        } sink.propertyNamed("$ColumnLocation", term_1548);
        sink.start(_M__sTextChars); sink.copy(sub_314.ref());
        sink.end();Term term_1398;
        {
          BufferSink buf_767 = sink.context().makeBuffer(); buf_767.start(_M_STRING); buf_767.literal(1); buf_767.end();
          term_1398 = buf_767.term();
        } sink.propertyNamed("$LineLocation", term_1398);Term term_1026;
        {
          BufferSink buf_987 = sink.context().makeBuffer(); buf_987.start(_M_STRING); buf_987.literal(3); buf_987.end();
          term_1026 = buf_987.term();
        } sink.propertyNamed("$ColumnLocation", term_1026);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xliteral, term_1053);
  } final public static boolean _M_Crsx_xPrint_xfunctional(Sink sink, int shared, int depth, Term term_842) {
    if (depth < 2000) {
      label_27: {
        if (term_842.descriptor() != _M_Crsx_xfunctional)
        {   break label_27;
        }Term sub_136 = term_842.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_827;
        {
          BufferSink buf_603 = sink.context().makeBuffer(); buf_603.start(_M_STRING); buf_603.literal(1); buf_603.end();
          term_827 = buf_603.term();
        } sink.propertyNamed("$LineLocation", term_827);Term term_1163;
        {
          BufferSink buf_919 = sink.context().makeBuffer(); buf_919.start(_M_STRING); buf_919.literal(1); buf_919.end();
          term_1163 = buf_919.term();
        } sink.propertyNamed("$ColumnLocation", term_1163);
        sink.start(_M__sTextCons);Term term_962;
        {
          BufferSink buf_1204 = sink.context().makeBuffer();
          buf_1204.start(_M_STRING); buf_1204.literal(1);
          buf_1204.end();
          term_962 = buf_1204.term();
        } sink.propertyNamed("$LineLocation", term_962);Term term_758;
        {
          BufferSink buf_1025 = sink.context().makeBuffer();
          buf_1025.start(_M_STRING); buf_1025.literal(2);
          buf_1025.end();
          term_758 = buf_1025.term();
        } sink.propertyNamed("$ColumnLocation", term_758);
        sink.start(_M__sTextChars); sink.copy(sub_136.ref());
        sink.end();Term term_1275;
        {
          BufferSink buf_871 = sink.context().makeBuffer(); buf_871.start(_M_STRING); buf_871.literal(1); buf_871.end();
          term_1275 = buf_871.term();
        } sink.propertyNamed("$LineLocation", term_1275);Term term_773;
        {
          BufferSink buf_768 = sink.context().makeBuffer(); buf_768.start(_M_STRING); buf_768.literal(3); buf_768.end();
          term_773 = buf_768.term();
        } sink.propertyNamed("$ColumnLocation", term_773);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xfunctional, term_842);
  } final public static boolean _M_Crsx_xPrint_xlinear(Sink sink, int shared, int depth, Term term_975) {
    if (depth < 2000) {
      label_198: {
        if (term_975.descriptor() != _M_Crsx_xlinear)
        {   break label_198;
        }Term sub_247 = term_975.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_709;
        {
          BufferSink buf_545 = sink.context().makeBuffer(); buf_545.start(_M_STRING); buf_545.literal(1); buf_545.end();
          term_709 = buf_545.term();
        } sink.propertyNamed("$LineLocation", term_709);Term term_928;
        {
          BufferSink buf_926 = sink.context().makeBuffer(); buf_926.start(_M_STRING); buf_926.literal(1); buf_926.end();
          term_928 = buf_926.term();
        } sink.propertyNamed("$ColumnLocation", term_928);
        sink.start(_M__sTextCons);Term term_1681;
        {
          BufferSink buf_826 = sink.context().makeBuffer(); buf_826.start(_M_STRING); buf_826.literal(1); buf_826.end();
          term_1681 = buf_826.term();
        } sink.propertyNamed("$LineLocation", term_1681);Term term_956;
        {
          BufferSink buf_574 = sink.context().makeBuffer(); buf_574.start(_M_STRING); buf_574.literal(2); buf_574.end();
          term_956 = buf_574.term();
        } sink.propertyNamed("$ColumnLocation", term_956);
        sink.start(_M__sTextChars); sink.copy(sub_247.ref());
        sink.end();Term term_833;
        {
          BufferSink buf_662 = sink.context().makeBuffer(); buf_662.start(_M_STRING); buf_662.literal(1); buf_662.end();
          term_833 = buf_662.term();
        } sink.propertyNamed("$LineLocation", term_833);Term term_704;
        {
          BufferSink buf_1050 = sink.context().makeBuffer();
          buf_1050.start(_M_STRING); buf_1050.literal(3);
          buf_1050.end();
          term_704 = buf_1050.term();
        } sink.propertyNamed("$ColumnLocation", term_704);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xlinear, term_975);
  } final public static boolean _M_Crsx_xPrint_xvariable(Sink sink, int shared, int depth, Term term_739) {
    if (depth < 2000) {
      label_58: {
        if (term_739.descriptor() != _M_Crsx_xvariable)
        {   break label_58;
        }Term sub_171 = term_739.sub(0).ref();
        /* #1=sub */Term sub_42 = term_739.sub(1).ref();
        /* #2=sub */Term sub_161 = term_739.sub(2).ref();
        /* #3=sub */Term sub_98 = term_739.sub(3).ref();
        /* #4=sub */Term sub_56 = term_739.sub(4).ref();
        /* #5=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1249;
        {
          BufferSink buf_1051 = sink.context().makeBuffer();
          buf_1051.start(_M_STRING); buf_1051.literal(1);
          buf_1051.end();
          term_1249 = buf_1051.term();
        } sink.propertyNamed("$LineLocation", term_1249);Term term_1070;
        {
          BufferSink buf_788 = sink.context().makeBuffer(); buf_788.start(_M_STRING); buf_788.literal(1); buf_788.end();
          term_1070 = buf_788.term();
        } sink.propertyNamed("$ColumnLocation", term_1070);
        sink.start(_M__sTextCons);Term term_1348;
        {
          BufferSink buf_951 = sink.context().makeBuffer(); buf_951.start(_M_STRING); buf_951.literal(1); buf_951.end();
          term_1348 = buf_951.term();
        } sink.propertyNamed("$LineLocation", term_1348);Term term_767;
        {
          BufferSink buf_821 = sink.context().makeBuffer(); buf_821.start(_M_STRING); buf_821.literal(1); buf_821.end();
          term_767 = buf_821.term();
        } sink.propertyNamed("$ColumnLocation", term_767);
        sink.start(_M__sTextEmbed);Term term_951;
        {
          BufferSink buf_764 = sink.context().makeBuffer(); buf_764.start(_M_STRING); buf_764.literal(1); buf_764.end();
          term_951 = buf_764.term();
        } sink.propertyNamed("$LineLocation", term_951);Term term_895;
        {
          BufferSink buf_692 = sink.context().makeBuffer(); buf_692.start(_M_STRING); buf_692.literal(1); buf_692.end();
          term_895 = buf_692.term();
        } sink.propertyNamed("$ColumnLocation", term_895);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_55 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_55});
        sink.start(_M_Crsx_xPrint_xlinear); sink.use(var_55);
        sink.end(); sink.copy(sub_171.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_643;
        {
          BufferSink buf_1088 = sink.context().makeBuffer();
          buf_1088.start(_M_STRING); buf_1088.literal(1);
          buf_1088.end();
          term_643 = buf_1088.term();
        } sink.propertyNamed("$LineLocation", term_643);Term term_762;
        {
          BufferSink buf_1224 = sink.context().makeBuffer();
          buf_1224.start(_M_STRING); buf_1224.literal(48);
          buf_1224.end();
          term_762 = buf_1224.term();
        } sink.propertyNamed("$ColumnLocation", term_762);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1008;
        {
          BufferSink buf_450 = sink.context().makeBuffer(); buf_450.start(_M_STRING); buf_450.literal(1); buf_450.end();
          term_1008 = buf_450.term();
        } sink.propertyNamed("$LineLocation", term_1008);Term term_781;
        {
          BufferSink buf_1408 = sink.context().makeBuffer();
          buf_1408.start(_M_STRING); buf_1408.literal(2);
          buf_1408.end();
          term_781 = buf_1408.term();
        } sink.propertyNamed("$ColumnLocation", term_781);
        sink.start(_M__sTextCons);Term term_745;
        {
          BufferSink buf_970 = sink.context().makeBuffer(); buf_970.start(_M_STRING); buf_970.literal(1); buf_970.end();
          term_745 = buf_970.term();
        } sink.propertyNamed("$LineLocation", term_745);Term term_752;
        {
          BufferSink buf_1047 = sink.context().makeBuffer();
          buf_1047.start(_M_STRING); buf_1047.literal(2);
          buf_1047.end();
          term_752 = buf_1047.term();
        } sink.propertyNamed("$ColumnLocation", term_752);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_934;
        {
          BufferSink buf_1306 = sink.context().makeBuffer();
          buf_1306.start(_M_STRING); buf_1306.literal(1);
          buf_1306.end();
          term_934 = buf_1306.term();
        } sink.propertyNamed("$LineLocation", term_934);Term term_613;
        {
          BufferSink buf_985 = sink.context().makeBuffer();
          buf_985.start(_M_STRING); buf_985.literal(52);
          buf_985.end();
          term_613 = buf_985.term();
        } sink.propertyNamed("$ColumnLocation", term_613);
        sink.start(_M__sTextCons);Term term_966;
        {
          BufferSink buf_1585 = sink.context().makeBuffer();
          buf_1585.start(_M_STRING); buf_1585.literal(1);
          buf_1585.end();
          term_966 = buf_1585.term();
        } sink.propertyNamed("$LineLocation", term_966);Term term_829;
        {
          BufferSink buf_602 = sink.context().makeBuffer();
          buf_602.start(_M_STRING); buf_602.literal(53);
          buf_602.end();
          term_829 = buf_602.term();
        } sink.propertyNamed("$ColumnLocation", term_829);
        sink.start(_M__sTextChars); sink.copy(sub_42.ref());
        sink.end();Term term_1003;
        {
          BufferSink buf_643 = sink.context().makeBuffer(); buf_643.start(_M_STRING); buf_643.literal(1); buf_643.end();
          term_1003 = buf_643.term();
        } sink.propertyNamed("$LineLocation", term_1003);Term term_719;
        {
          BufferSink buf_1249 = sink.context().makeBuffer();
          buf_1249.start(_M_STRING); buf_1249.literal(54);
          buf_1249.end();
          term_719 = buf_1249.term();
        } sink.propertyNamed("$ColumnLocation", term_719);
        sink.start(_M__sTextCons);Term term_1270;
        {
          BufferSink buf_621 = sink.context().makeBuffer(); buf_621.start(_M_STRING); buf_621.literal(1); buf_621.end();
          term_1270 = buf_621.term();
        } sink.propertyNamed("$LineLocation", term_1270);Term term_749;
        {
          BufferSink buf_1192 = sink.context().makeBuffer();
          buf_1192.start(_M_STRING); buf_1192.literal(54);
          buf_1192.end();
          term_749 = buf_1192.term();
        } sink.propertyNamed("$ColumnLocation", term_749);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1453;
        {
          BufferSink buf_404 = sink.context().makeBuffer(); buf_404.start(_M_STRING); buf_404.literal(1); buf_404.end();
          term_1453 = buf_404.term();
        } sink.propertyNamed("$LineLocation", term_1453);Term term_1288;
        {
          BufferSink buf_1297 = sink.context().makeBuffer();
          buf_1297.start(_M_STRING); buf_1297.literal(58);
          buf_1297.end();
          term_1288 = buf_1297.term();
        } sink.propertyNamed("$ColumnLocation", term_1288);
        sink.start(_M__sTextCons);Term term_1322;
        {
          BufferSink buf_952 = sink.context().makeBuffer(); buf_952.start(_M_STRING); buf_952.literal(1); buf_952.end();
          term_1322 = buf_952.term();
        } sink.propertyNamed("$LineLocation", term_1322);Term term_732;
        {
          BufferSink buf_1185 = sink.context().makeBuffer();
          buf_1185.start(_M_STRING); buf_1185.literal(58);
          buf_1185.end();
          term_732 = buf_1185.term();
        } sink.propertyNamed("$ColumnLocation", term_732);
        sink.start(_M__sTextEmbed);Term term_982;
        {
          BufferSink buf_650 = sink.context().makeBuffer(); buf_650.start(_M_STRING); buf_650.literal(1); buf_650.end();
          term_982 = buf_650.term();
        } sink.propertyNamed("$LineLocation", term_982);Term term_639;
        {
          BufferSink buf_634 = sink.context().makeBuffer();
          buf_634.start(_M_STRING); buf_634.literal(58);
          buf_634.end();
          term_639 = buf_634.term();
        } sink.propertyNamed("$ColumnLocation", term_639);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_28 = sink.context().makeVariable("x_75");
        sink.binds(new Variable[] {var_28});
        sink.start(_M_Crsx_xPrint_xlinear); sink.use(var_28);
        sink.end(); sink.copy(sub_161.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_963;
        {
          BufferSink buf_874 = sink.context().makeBuffer(); buf_874.start(_M_STRING); buf_874.literal(1); buf_874.end();
          term_963 = buf_874.term();
        } sink.propertyNamed("$LineLocation", term_963);Term term_1046;
        {
          BufferSink buf_914 = sink.context().makeBuffer();
          buf_914.start(_M_STRING); buf_914.literal(105);
          buf_914.end();
          term_1046 = buf_914.term();
        } sink.propertyNamed("$ColumnLocation", term_1046);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_984;
        {
          BufferSink buf_604 = sink.context().makeBuffer(); buf_604.start(_M_STRING); buf_604.literal(1); buf_604.end();
          term_984 = buf_604.term();
        } sink.propertyNamed("$LineLocation", term_984);Term term_1194;
        {
          BufferSink buf_948 = sink.context().makeBuffer();
          buf_948.start(_M_STRING); buf_948.literal(59);
          buf_948.end();
          term_1194 = buf_948.term();
        } sink.propertyNamed("$ColumnLocation", term_1194);
        sink.start(_M__sTextCons);Term term_1278;
        {
          BufferSink buf_798 = sink.context().makeBuffer(); buf_798.start(_M_STRING); buf_798.literal(1); buf_798.end();
          term_1278 = buf_798.term();
        } sink.propertyNamed("$LineLocation", term_1278);Term term_681;
        {
          BufferSink buf_1068 = sink.context().makeBuffer();
          buf_1068.start(_M_STRING); buf_1068.literal(59);
          buf_1068.end();
          term_681 = buf_1068.term();
        } sink.propertyNamed("$ColumnLocation", term_681);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_985;
        {
          BufferSink buf_1086 = sink.context().makeBuffer();
          buf_1086.start(_M_STRING); buf_1086.literal(1);
          buf_1086.end();
          term_985 = buf_1086.term();
        } sink.propertyNamed("$LineLocation", term_985);Term term_715;
        {
          BufferSink buf_924 = sink.context().makeBuffer();
          buf_924.start(_M_STRING); buf_924.literal(109);
          buf_924.end();
          term_715 = buf_924.term();
        } sink.propertyNamed("$ColumnLocation", term_715);
        sink.start(_M__sTextCons);Term term_824;
        {
          BufferSink buf_693 = sink.context().makeBuffer(); buf_693.start(_M_STRING); buf_693.literal(1); buf_693.end();
          term_824 = buf_693.term();
        } sink.propertyNamed("$LineLocation", term_824);Term term_1031;
        {
          BufferSink buf_1173 = sink.context().makeBuffer();
          buf_1173.start(_M_STRING); buf_1173.literal(109);
          buf_1173.end();
          term_1031 = buf_1173.term();
        } sink.propertyNamed("$ColumnLocation", term_1031);
        sink.start(_M__sTextEmbed);Term term_910;
        {
          BufferSink buf_1108 = sink.context().makeBuffer();
          buf_1108.start(_M_STRING); buf_1108.literal(1);
          buf_1108.end();
          term_910 = buf_1108.term();
        } sink.propertyNamed("$LineLocation", term_910);Term term_1060;
        {
          BufferSink buf_1238 = sink.context().makeBuffer();
          buf_1238.start(_M_STRING); buf_1238.literal(109);
          buf_1238.end();
          term_1060 = buf_1238.term();
        } sink.propertyNamed("$ColumnLocation", term_1060);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_66 = sink.context().makeVariable("x_83");
        sink.binds(new Variable[] {var_66});
        sink.start(_M_Crsx_xPrint_xfunctional); sink.use(var_66);
        sink.end(); sink.copy(sub_98.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_826;
        {
          BufferSink buf_1303 = sink.context().makeBuffer();
          buf_1303.start(_M_STRING); buf_1303.literal(1);
          buf_1303.end();
          term_826 = buf_1303.term();
        } sink.propertyNamed("$LineLocation", term_826);Term term_675;
        {
          BufferSink buf_1247 = sink.context().makeBuffer();
          buf_1247.start(_M_STRING); buf_1247.literal(160);
          buf_1247.end();
          term_675 = buf_1247.term();
        } sink.propertyNamed("$ColumnLocation", term_675);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1190;
        {
          BufferSink buf_817 = sink.context().makeBuffer(); buf_817.start(_M_STRING); buf_817.literal(1); buf_817.end();
          term_1190 = buf_817.term();
        } sink.propertyNamed("$LineLocation", term_1190);Term term_693;
        {
          BufferSink buf_1139 = sink.context().makeBuffer();
          buf_1139.start(_M_STRING); buf_1139.literal(110);
          buf_1139.end();
          term_693 = buf_1139.term();
        } sink.propertyNamed("$ColumnLocation", term_693);
        sink.start(_M__sTextCons);Term term_866;
        {
          BufferSink buf_1188 = sink.context().makeBuffer();
          buf_1188.start(_M_STRING); buf_1188.literal(1);
          buf_1188.end();
          term_866 = buf_1188.term();
        } sink.propertyNamed("$LineLocation", term_866);Term term_1437;
        {
          BufferSink buf_1158 = sink.context().makeBuffer();
          buf_1158.start(_M_STRING); buf_1158.literal(110);
          buf_1158.end();
          term_1437 = buf_1158.term();
        } sink.propertyNamed("$ColumnLocation", term_1437);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_801;
        {
          BufferSink buf_1081 = sink.context().makeBuffer();
          buf_1081.start(_M_STRING); buf_1081.literal(1);
          buf_1081.end();
          term_801 = buf_1081.term();
        } sink.propertyNamed("$LineLocation", term_801);Term term_1100;
        {
          BufferSink buf_813 = sink.context().makeBuffer();
          buf_813.start(_M_STRING); buf_813.literal(164);
          buf_813.end();
          term_1100 = buf_813.term();
        } sink.propertyNamed("$ColumnLocation", term_1100);
        sink.start(_M__sTextCons);Term term_1280;
        {
          BufferSink buf_790 = sink.context().makeBuffer(); buf_790.start(_M_STRING); buf_790.literal(1); buf_790.end();
          term_1280 = buf_790.term();
        } sink.propertyNamed("$LineLocation", term_1280);Term term_718;
        {
          BufferSink buf_1141 = sink.context().makeBuffer();
          buf_1141.start(_M_STRING); buf_1141.literal(164);
          buf_1141.end();
          term_718 = buf_1141.term();
        } sink.propertyNamed("$ColumnLocation", term_718);
        sink.start(_M__sTextEmbed);Term term_1043;
        {
          BufferSink buf_1026 = sink.context().makeBuffer();
          buf_1026.start(_M_STRING); buf_1026.literal(1);
          buf_1026.end();
          term_1043 = buf_1026.term();
        } sink.propertyNamed("$LineLocation", term_1043);Term term_1216;
        {
          BufferSink buf_752 = sink.context().makeBuffer();
          buf_752.start(_M_STRING); buf_752.literal(164);
          buf_752.end();
          term_1216 = buf_752.term();
        } sink.propertyNamed("$ColumnLocation", term_1216);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_10 = sink.context().makeVariable("x_32");
        sink.binds(new Variable[] {var_10});
        sink.start(_M_Crsx_xPrint_xvarsort); sink.use(var_10);
        sink.end(); sink.copy(sub_56.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1074;
        {
          BufferSink buf_1261 = sink.context().makeBuffer();
          buf_1261.start(_M_STRING); buf_1261.literal(1);
          buf_1261.end();
          term_1074 = buf_1261.term();
        } sink.propertyNamed("$LineLocation", term_1074);Term term_1224;
        {
          BufferSink buf_1005 = sink.context().makeBuffer();
          buf_1005.start(_M_STRING); buf_1005.literal(212);
          buf_1005.end();
          term_1224 = buf_1005.term();
        } sink.propertyNamed("$ColumnLocation", term_1224);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1296;
        {
          BufferSink buf_1078 = sink.context().makeBuffer();
          buf_1078.start(_M_STRING); buf_1078.literal(1);
          buf_1078.end();
          term_1296 = buf_1078.term();
        } sink.propertyNamed("$LineLocation", term_1296);Term term_1327;
        {
          BufferSink buf_1149 = sink.context().makeBuffer();
          buf_1149.start(_M_STRING); buf_1149.literal(165);
          buf_1149.end();
          term_1327 = buf_1149.term();
        } sink.propertyNamed("$ColumnLocation", term_1327);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xvariable, term_739);
  } final public static boolean _M_Crsx_xPrint_xtermList_xS1(Sink sink, int shared, int depth, Term term_1236) {
    if (depth < 2000) {
      label_8: {
        if (term_1236.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_8;
        }Term sub_189 = term_1236.sub(0).ref();
        /* #1=sub */Term sub_122 = term_1236.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1402;
        {
          BufferSink buf_1373 = sink.context().makeBuffer();
          buf_1373.start(_M_STRING); buf_1373.literal(1);
          buf_1373.end();
          term_1402 = buf_1373.term();
        } sink.propertyNamed("$LineLocation", term_1402);Term term_1051;
        {
          BufferSink buf_613 = sink.context().makeBuffer(); buf_613.start(_M_STRING); buf_613.literal(1); buf_613.end();
          term_1051 = buf_613.term();
        } sink.propertyNamed("$ColumnLocation", term_1051);
        sink.start(_M__sTextCons);Term term_1082;
        {
          BufferSink buf_698 = sink.context().makeBuffer(); buf_698.start(_M_STRING); buf_698.literal(1); buf_698.end();
          term_1082 = buf_698.term();
        } sink.propertyNamed("$LineLocation", term_1082);Term term_957;
        {
          BufferSink buf_704 = sink.context().makeBuffer(); buf_704.start(_M_STRING); buf_704.literal(2); buf_704.end();
          term_957 = buf_704.term();
        } sink.propertyNamed("$ColumnLocation", term_957);
        sink.start(_M__sTextChars); sink.copy(sub_189.ref());
        sink.end();Term term_873;
        {
          BufferSink buf_645 = sink.context().makeBuffer(); buf_645.start(_M_STRING); buf_645.literal(1); buf_645.end();
          term_873 = buf_645.term();
        } sink.propertyNamed("$LineLocation", term_873);Term term_1113;
        {
          BufferSink buf_1241 = sink.context().makeBuffer();
          buf_1241.start(_M_STRING); buf_1241.literal(3);
          buf_1241.end();
          term_1113 = buf_1241.term();
        } sink.propertyNamed("$ColumnLocation", term_1113);
        sink.start(_M__sTextCons);Term term_1066;
        {
          BufferSink buf_1250 = sink.context().makeBuffer();
          buf_1250.start(_M_STRING); buf_1250.literal(1);
          buf_1250.end();
          term_1066 = buf_1250.term();
        } sink.propertyNamed("$LineLocation", term_1066);Term term_1096;
        {
          BufferSink buf_1269 = sink.context().makeBuffer();
          buf_1269.start(_M_STRING); buf_1269.literal(3);
          buf_1269.end();
          term_1096 = buf_1269.term();
        } sink.propertyNamed("$ColumnLocation", term_1096);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_482;
        {
          BufferSink buf_754 = sink.context().makeBuffer(); buf_754.start(_M_STRING); buf_754.literal(1); buf_754.end();
          term_482 = buf_754.term();
        } sink.propertyNamed("$LineLocation", term_482);Term term_896;
        {
          BufferSink buf_1038 = sink.context().makeBuffer();
          buf_1038.start(_M_STRING); buf_1038.literal(7);
          buf_1038.end();
          term_896 = buf_1038.term();
        } sink.propertyNamed("$ColumnLocation", term_896);
        sink.start(_M__sTextCons);Term term_1407;
        {
          BufferSink buf_559 = sink.context().makeBuffer(); buf_559.start(_M_STRING); buf_559.literal(1); buf_559.end();
          term_1407 = buf_559.term();
        } sink.propertyNamed("$LineLocation", term_1407);Term term_958;
        {
          BufferSink buf_847 = sink.context().makeBuffer(); buf_847.start(_M_STRING); buf_847.literal(7); buf_847.end();
          term_958 = buf_847.term();
        } sink.propertyNamed("$ColumnLocation", term_958);
        sink.start(_M__sTextEmbed);Term term_823;
        {
          BufferSink buf_1289 = sink.context().makeBuffer();
          buf_1289.start(_M_STRING); buf_1289.literal(1);
          buf_1289.end();
          term_823 = buf_1289.term();
        } sink.propertyNamed("$LineLocation", term_823);Term term_1308;
        {
          BufferSink buf_648 = sink.context().makeBuffer(); buf_648.start(_M_STRING); buf_648.literal(7); buf_648.end();
          term_1308 = buf_648.term();
        } sink.propertyNamed("$ColumnLocation", term_1308);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_80 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_80});
        sink.start(_M_Crsx_xPrint_xterm); sink.use(var_80);
        sink.end(); sink.copy(sub_122.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1057;
        {
          BufferSink buf_1460 = sink.context().makeBuffer();
          buf_1460.start(_M_STRING); buf_1460.literal(1);
          buf_1460.end();
          term_1057 = buf_1460.term();
        } sink.propertyNamed("$LineLocation", term_1057);Term term_853;
        {
          BufferSink buf_1309 = sink.context().makeBuffer();
          buf_1309.start(_M_STRING); buf_1309.literal(52);
          buf_1309.end();
          term_853 = buf_1309.term();
        } sink.propertyNamed("$ColumnLocation", term_853);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_775;
        {
          BufferSink buf_771 = sink.context().makeBuffer(); buf_771.start(_M_STRING); buf_771.literal(1); buf_771.end();
          term_775 = buf_771.term();
        } sink.propertyNamed("$LineLocation", term_775);Term term_976;
        {
          BufferSink buf_981 = sink.context().makeBuffer(); buf_981.start(_M_STRING); buf_981.literal(8); buf_981.end();
          term_976 = buf_981.term();
        } sink.propertyNamed("$ColumnLocation", term_976);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xtermList_xS1, term_1236);
  } final public static boolean _M_Crsx_xPrint_xtermList(Sink sink, int shared, int depth, Term term_544) {
    if (depth < 2000) {
      label_46: {
        if (term_544.descriptor() != _M_Crsx_xtermList)
        {   break label_46;
        }Term sub_210 = term_544.sub(0).ref();
        /* #1=sub */Term sub_208 = term_544.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_850;
        {
          BufferSink buf_968 = sink.context().makeBuffer(); buf_968.start(_M_STRING); buf_968.literal(1); buf_968.end();
          term_850 = buf_968.term();
        } sink.propertyNamed("$LineLocation", term_850);Term term_1041;
        {
          BufferSink buf_1323 = sink.context().makeBuffer();
          buf_1323.start(_M_STRING); buf_1323.literal(1);
          buf_1323.end();
          term_1041 = buf_1323.term();
        } sink.propertyNamed("$ColumnLocation", term_1041);
        sink.start(_M__sTextCons);Term term_922;
        {
          BufferSink buf_1264 = sink.context().makeBuffer();
          buf_1264.start(_M_STRING); buf_1264.literal(1);
          buf_1264.end();
          term_922 = buf_1264.term();
        } sink.propertyNamed("$LineLocation", term_922);Term term_1072;
        {
          BufferSink buf_1850 = sink.context().makeBuffer();
          buf_1850.start(_M_STRING); buf_1850.literal(1);
          buf_1850.end();
          term_1072 = buf_1850.term();
        } sink.propertyNamed("$ColumnLocation", term_1072);
        sink.start(_M__sTextEmbed);Term term_1158;
        {
          BufferSink buf_1172 = sink.context().makeBuffer();
          buf_1172.start(_M_STRING); buf_1172.literal(1);
          buf_1172.end();
          term_1158 = buf_1172.term();
        } sink.propertyNamed("$LineLocation", term_1158);Term term_1412;
        {
          BufferSink buf_988 = sink.context().makeBuffer(); buf_988.start(_M_STRING); buf_988.literal(1); buf_988.end();
          term_1412 = buf_988.term();
        } sink.propertyNamed("$ColumnLocation", term_1412);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xterm); sink.copy(sub_210.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1265;
        {
          BufferSink buf_910 = sink.context().makeBuffer(); buf_910.start(_M_STRING); buf_910.literal(1); buf_910.end();
          term_1265 = buf_910.term();
        } sink.propertyNamed("$LineLocation", term_1265);Term term_1334;
        {
          BufferSink buf_806 = sink.context().makeBuffer(); buf_806.start(_M_STRING); buf_806.literal(2); buf_806.end();
          term_1334 = buf_806.term();
        } sink.propertyNamed("$ColumnLocation", term_1334);
        sink.start(_M__sTextCons);Term term_1185;
        {
          BufferSink buf_706 = sink.context().makeBuffer(); buf_706.start(_M_STRING); buf_706.literal(1); buf_706.end();
          term_1185 = buf_706.term();
        } sink.propertyNamed("$LineLocation", term_1185);Term term_1332;
        {
          BufferSink buf_846 = sink.context().makeBuffer(); buf_846.start(_M_STRING); buf_846.literal(2); buf_846.end();
          term_1332 = buf_846.term();
        } sink.propertyNamed("$ColumnLocation", term_1332);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_605;
        {
          BufferSink buf_891 = sink.context().makeBuffer(); buf_891.start(_M_STRING); buf_891.literal(1); buf_891.end();
          term_605 = buf_891.term();
        } sink.propertyNamed("$LineLocation", term_605);Term term_736;
        {
          BufferSink buf_760 = sink.context().makeBuffer();
          buf_760.start(_M_STRING); buf_760.literal(23);
          buf_760.end();
          term_736 = buf_760.term();
        } sink.propertyNamed("$ColumnLocation", term_736);
        sink.start(_M__sTextCons);Term term_1077;
        {
          BufferSink buf_687 = sink.context().makeBuffer(); buf_687.start(_M_STRING); buf_687.literal(1); buf_687.end();
          term_1077 = buf_687.term();
        } sink.propertyNamed("$LineLocation", term_1077);Term term_740;
        {
          BufferSink buf_949 = sink.context().makeBuffer();
          buf_949.start(_M_STRING); buf_949.literal(23);
          buf_949.end();
          term_740 = buf_949.term();
        } sink.propertyNamed("$ColumnLocation", term_740);
        sink.start(_M__sTextEmbed);Term term_1420;
        {
          BufferSink buf_426 = sink.context().makeBuffer(); buf_426.start(_M_STRING); buf_426.literal(1); buf_426.end();
          term_1420 = buf_426.term();
        } sink.propertyNamed("$LineLocation", term_1420);Term term_912;
        {
          BufferSink buf_1119 = sink.context().makeBuffer();
          buf_1119.start(_M_STRING); buf_1119.literal(23);
          buf_1119.end();
          term_912 = buf_1119.term();
        } sink.propertyNamed("$ColumnLocation", term_912);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_71 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_71});
        sink.start(_M_Crsx_xPrint_xtermList_xS1); sink.use(var_71);
        sink.end(); sink.copy(sub_208.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_820;
        {
          BufferSink buf_1382 = sink.context().makeBuffer();
          buf_1382.start(_M_STRING); buf_1382.literal(1);
          buf_1382.end();
          term_820 = buf_1382.term();
        } sink.propertyNamed("$LineLocation", term_820);Term term_1371;
        {
          BufferSink buf_986 = sink.context().makeBuffer();
          buf_986.start(_M_STRING); buf_986.literal(75);
          buf_986.end();
          term_1371 = buf_986.term();
        } sink.propertyNamed("$ColumnLocation", term_1371);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1154;
        {
          BufferSink buf_1128 = sink.context().makeBuffer();
          buf_1128.start(_M_STRING); buf_1128.literal(1);
          buf_1128.end();
          term_1154 = buf_1128.term();
        } sink.propertyNamed("$LineLocation", term_1154);Term term_1181;
        {
          BufferSink buf_1451 = sink.context().makeBuffer();
          buf_1451.start(_M_STRING); buf_1451.literal(24);
          buf_1451.end();
          term_1181 = buf_1451.term();
        } sink.propertyNamed("$ColumnLocation", term_1181);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xtermList, term_544);
  } final public static boolean _M_Crsx_xPrint_xlist(Sink sink, int shared, int depth, Term term_1119) {
    if (depth < 2000) {
      label_47: {
        if (term_1119.descriptor() != _M_Crsx_xlist)
        {   break label_47;
        }Term sub_133 = term_1119.sub(0).ref();
        /* #1=sub */Term sub_115 = term_1119.sub(1).ref();
        /* #2=sub */Term sub_339 = term_1119.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1011;
        {
          BufferSink buf_783 = sink.context().makeBuffer(); buf_783.start(_M_STRING); buf_783.literal(1); buf_783.end();
          term_1011 = buf_783.term();
        } sink.propertyNamed("$LineLocation", term_1011);Term term_1256;
        {
          BufferSink buf_748 = sink.context().makeBuffer(); buf_748.start(_M_STRING); buf_748.literal(1); buf_748.end();
          term_1256 = buf_748.term();
        } sink.propertyNamed("$ColumnLocation", term_1256);
        sink.start(_M__sTextCons);Term term_1433;
        {
          BufferSink buf_887 = sink.context().makeBuffer(); buf_887.start(_M_STRING); buf_887.literal(1); buf_887.end();
          term_1433 = buf_887.term();
        } sink.propertyNamed("$LineLocation", term_1433);Term term_713;
        {
          BufferSink buf_676 = sink.context().makeBuffer(); buf_676.start(_M_STRING); buf_676.literal(2); buf_676.end();
          term_713 = buf_676.term();
        } sink.propertyNamed("$ColumnLocation", term_713);
        sink.start(_M__sTextChars); sink.copy(sub_133.ref());
        sink.end();Term term_1258;
        {
          BufferSink buf_1280 = sink.context().makeBuffer();
          buf_1280.start(_M_STRING); buf_1280.literal(1);
          buf_1280.end();
          term_1258 = buf_1280.term();
        } sink.propertyNamed("$LineLocation", term_1258);Term term_1017;
        {
          BufferSink buf_1010 = sink.context().makeBuffer();
          buf_1010.start(_M_STRING); buf_1010.literal(3);
          buf_1010.end();
          term_1017 = buf_1010.term();
        } sink.propertyNamed("$ColumnLocation", term_1017);
        sink.start(_M__sTextCons);Term term_1333;
        {
          BufferSink buf_812 = sink.context().makeBuffer(); buf_812.start(_M_STRING); buf_812.literal(1); buf_812.end();
          term_1333 = buf_812.term();
        } sink.propertyNamed("$LineLocation", term_1333);Term term_1281;
        {
          BufferSink buf_797 = sink.context().makeBuffer(); buf_797.start(_M_STRING); buf_797.literal(3); buf_797.end();
          term_1281 = buf_797.term();
        } sink.propertyNamed("$ColumnLocation", term_1281);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1577;
        {
          BufferSink buf_1410 = sink.context().makeBuffer();
          buf_1410.start(_M_STRING); buf_1410.literal(1);
          buf_1410.end();
          term_1577 = buf_1410.term();
        } sink.propertyNamed("$LineLocation", term_1577);Term term_960;
        {
          BufferSink buf_1146 = sink.context().makeBuffer();
          buf_1146.start(_M_STRING); buf_1146.literal(7);
          buf_1146.end();
          term_960 = buf_1146.term();
        } sink.propertyNamed("$ColumnLocation", term_960);
        sink.start(_M__sTextCons);Term term_1058;
        {
          BufferSink buf_1788 = sink.context().makeBuffer();
          buf_1788.start(_M_STRING); buf_1788.literal(1);
          buf_1788.end();
          term_1058 = buf_1788.term();
        } sink.propertyNamed("$LineLocation", term_1058);Term term_554;
        {
          BufferSink buf_1136 = sink.context().makeBuffer();
          buf_1136.start(_M_STRING); buf_1136.literal(7);
          buf_1136.end();
          term_554 = buf_1136.term();
        } sink.propertyNamed("$ColumnLocation", term_554);
        sink.start(_M__sTextEmbed);Term term_1726;
        {
          BufferSink buf_989 = sink.context().makeBuffer(); buf_989.start(_M_STRING); buf_989.literal(1); buf_989.end();
          term_1726 = buf_989.term();
        } sink.propertyNamed("$LineLocation", term_1726);Term term_1287;
        {
          BufferSink buf_961 = sink.context().makeBuffer(); buf_961.start(_M_STRING); buf_961.literal(7); buf_961.end();
          term_1287 = buf_961.term();
        } sink.propertyNamed("$ColumnLocation", term_1287);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_47 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_47});
        sink.start(_M_Crsx_xPrint_xtermList); sink.use(var_47);
        sink.end(); sink.copy(sub_115.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1341;
        {
          BufferSink buf_1454 = sink.context().makeBuffer();
          buf_1454.start(_M_STRING); buf_1454.literal(1);
          buf_1454.end();
          term_1341 = buf_1454.term();
        } sink.propertyNamed("$LineLocation", term_1341);Term term_1042;
        {
          BufferSink buf_935 = sink.context().makeBuffer();
          buf_935.start(_M_STRING); buf_935.literal(56);
          buf_935.end();
          term_1042 = buf_935.term();
        } sink.propertyNamed("$ColumnLocation", term_1042);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1136;
        {
          BufferSink buf_1461 = sink.context().makeBuffer();
          buf_1461.start(_M_STRING); buf_1461.literal(1);
          buf_1461.end();
          term_1136 = buf_1461.term();
        } sink.propertyNamed("$LineLocation", term_1136);Term term_1144;
        {
          BufferSink buf_1508 = sink.context().makeBuffer();
          buf_1508.start(_M_STRING); buf_1508.literal(8);
          buf_1508.end();
          term_1144 = buf_1508.term();
        } sink.propertyNamed("$ColumnLocation", term_1144);
        sink.start(_M__sTextCons);Term term_945;
        {
          BufferSink buf_851 = sink.context().makeBuffer(); buf_851.start(_M_STRING); buf_851.literal(1); buf_851.end();
          term_945 = buf_851.term();
        } sink.propertyNamed("$LineLocation", term_945);Term term_1139;
        {
          BufferSink buf_1181 = sink.context().makeBuffer();
          buf_1181.start(_M_STRING); buf_1181.literal(8);
          buf_1181.end();
          term_1139 = buf_1181.term();
        } sink.propertyNamed("$ColumnLocation", term_1139);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1091;
        {
          BufferSink buf_820 = sink.context().makeBuffer(); buf_820.start(_M_STRING); buf_820.literal(1); buf_820.end();
          term_1091 = buf_820.term();
        } sink.propertyNamed("$LineLocation", term_1091);Term term_889;
        {
          BufferSink buf_943 = sink.context().makeBuffer();
          buf_943.start(_M_STRING); buf_943.literal(60);
          buf_943.end();
          term_889 = buf_943.term();
        } sink.propertyNamed("$ColumnLocation", term_889);
        sink.start(_M__sTextCons);Term term_897;
        {
          BufferSink buf_967 = sink.context().makeBuffer(); buf_967.start(_M_STRING); buf_967.literal(1); buf_967.end();
          term_897 = buf_967.term();
        } sink.propertyNamed("$LineLocation", term_897);Term term_1187;
        {
          BufferSink buf_886 = sink.context().makeBuffer();
          buf_886.start(_M_STRING); buf_886.literal(61);
          buf_886.end();
          term_1187 = buf_886.term();
        } sink.propertyNamed("$ColumnLocation", term_1187);
        sink.start(_M__sTextChars); sink.copy(sub_339.ref());
        sink.end();Term term_835;
        {
          BufferSink buf_1403 = sink.context().makeBuffer();
          buf_1403.start(_M_STRING); buf_1403.literal(1);
          buf_1403.end();
          term_835 = buf_1403.term();
        } sink.propertyNamed("$LineLocation", term_835);Term term_1106;
        {
          BufferSink buf_1682 = sink.context().makeBuffer();
          buf_1682.start(_M_STRING); buf_1682.literal(62);
          buf_1682.end();
          term_1106 = buf_1682.term();
        } sink.propertyNamed("$ColumnLocation", term_1106);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xlist, term_1119);
  } final public static boolean _M_Crsx_xPrint_xfreeTerms_xS1(Sink sink, int shared, int depth, Term term_1388) {
    if (depth < 2000) {
      label_99: {
        if (term_1388.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_99;
        }Term sub_485 = term_1388.sub(0).ref();
        /* #1=sub */Term sub_126 = term_1388.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_993;
        {
          BufferSink buf_435 = sink.context().makeBuffer(); buf_435.start(_M_STRING); buf_435.literal(1); buf_435.end();
          term_993 = buf_435.term();
        } sink.propertyNamed("$LineLocation", term_993);Term term_1733;
        {
          BufferSink buf_1203 = sink.context().makeBuffer();
          buf_1203.start(_M_STRING); buf_1203.literal(1);
          buf_1203.end();
          term_1733 = buf_1203.term();
        } sink.propertyNamed("$ColumnLocation", term_1733);
        sink.start(_M__sTextCons);Term term_1148;
        {
          BufferSink buf_1189 = sink.context().makeBuffer();
          buf_1189.start(_M_STRING); buf_1189.literal(1);
          buf_1189.end();
          term_1148 = buf_1189.term();
        } sink.propertyNamed("$LineLocation", term_1148);Term term_914;
        {
          BufferSink buf_895 = sink.context().makeBuffer(); buf_895.start(_M_STRING); buf_895.literal(2); buf_895.end();
          term_914 = buf_895.term();
        } sink.propertyNamed("$ColumnLocation", term_914);
        sink.start(_M__sTextChars); sink.copy(sub_485.ref());
        sink.end();Term term_1244;
        {
          BufferSink buf_1055 = sink.context().makeBuffer();
          buf_1055.start(_M_STRING); buf_1055.literal(1);
          buf_1055.end();
          term_1244 = buf_1055.term();
        } sink.propertyNamed("$LineLocation", term_1244);Term term_1202;
        {
          BufferSink buf_1002 = sink.context().makeBuffer();
          buf_1002.start(_M_STRING); buf_1002.literal(3);
          buf_1002.end();
          term_1202 = buf_1002.term();
        } sink.propertyNamed("$ColumnLocation", term_1202);
        sink.start(_M__sTextCons);Term term_865;
        {
          BufferSink buf_993 = sink.context().makeBuffer(); buf_993.start(_M_STRING); buf_993.literal(1); buf_993.end();
          term_865 = buf_993.term();
        } sink.propertyNamed("$LineLocation", term_865);Term term_1211;
        {
          BufferSink buf_1105 = sink.context().makeBuffer();
          buf_1105.start(_M_STRING); buf_1105.literal(3);
          buf_1105.end();
          term_1211 = buf_1105.term();
        } sink.propertyNamed("$ColumnLocation", term_1211);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1108;
        {
          BufferSink buf_740 = sink.context().makeBuffer(); buf_740.start(_M_STRING); buf_740.literal(1); buf_740.end();
          term_1108 = buf_740.term();
        } sink.propertyNamed("$LineLocation", term_1108);Term term_1024;
        {
          BufferSink buf_869 = sink.context().makeBuffer(); buf_869.start(_M_STRING); buf_869.literal(7); buf_869.end();
          term_1024 = buf_869.term();
        } sink.propertyNamed("$ColumnLocation", term_1024);
        sink.start(_M__sTextCons);Term term_1122;
        {
          BufferSink buf_792 = sink.context().makeBuffer(); buf_792.start(_M_STRING); buf_792.literal(1); buf_792.end();
          term_1122 = buf_792.term();
        } sink.propertyNamed("$LineLocation", term_1122);Term term_1220;
        {
          BufferSink buf_1169 = sink.context().makeBuffer();
          buf_1169.start(_M_STRING); buf_1169.literal(7);
          buf_1169.end();
          term_1220 = buf_1169.term();
        } sink.propertyNamed("$ColumnLocation", term_1220);
        sink.start(_M__sTextEmbed);Term term_1156;
        {
          BufferSink buf_1278 = sink.context().makeBuffer();
          buf_1278.start(_M_STRING); buf_1278.literal(1);
          buf_1278.end();
          term_1156 = buf_1278.term();
        } sink.propertyNamed("$LineLocation", term_1156);Term term_743;
        {
          BufferSink buf_422 = sink.context().makeBuffer(); buf_422.start(_M_STRING); buf_422.literal(7); buf_422.end();
          term_743 = buf_422.term();
        } sink.propertyNamed("$ColumnLocation", term_743);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_126.ref());
        sink.end();
        sink.end();
        sink.end();Term term_946;
        {
          BufferSink buf_950 = sink.context().makeBuffer(); buf_950.start(_M_STRING); buf_950.literal(1); buf_950.end();
          term_946 = buf_950.term();
        } sink.propertyNamed("$LineLocation", term_946);Term term_1460;
        {
          BufferSink buf_1003 = sink.context().makeBuffer();
          buf_1003.start(_M_STRING); buf_1003.literal(8);
          buf_1003.end();
          term_1460 = buf_1003.term();
        } sink.propertyNamed("$ColumnLocation", term_1460);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xfreeTerms_xS1, term_1388);
  } final public static boolean _M_Crsx_xPrint_xfreeTerms(Sink sink, int shared, int depth, Term term_1338) {
    if (depth < 2000) {
      label_78: {
        if (term_1338.descriptor() != _M_Crsx_xfreeTerms)
        {   break label_78;
        }Term sub_260 = term_1338.sub(0).ref();
        /* #1=sub */Term sub_150 = term_1338.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_582;
        {
          BufferSink buf_971 = sink.context().makeBuffer(); buf_971.start(_M_STRING); buf_971.literal(1); buf_971.end();
          term_582 = buf_971.term();
        } sink.propertyNamed("$LineLocation", term_582);Term term_1085;
        {
          BufferSink buf_1604 = sink.context().makeBuffer();
          buf_1604.start(_M_STRING); buf_1604.literal(1);
          buf_1604.end();
          term_1085 = buf_1604.term();
        } sink.propertyNamed("$ColumnLocation", term_1085);
        sink.start(_M__sTextCons);Term term_1654;
        {
          BufferSink buf_1011 = sink.context().makeBuffer();
          buf_1011.start(_M_STRING); buf_1011.literal(1);
          buf_1011.end();
          term_1654 = buf_1011.term();
        } sink.propertyNamed("$LineLocation", term_1654);Term term_1579;
        {
          BufferSink buf_1035 = sink.context().makeBuffer();
          buf_1035.start(_M_STRING); buf_1035.literal(1);
          buf_1035.end();
          term_1579 = buf_1035.term();
        } sink.propertyNamed("$ColumnLocation", term_1579);
        sink.start(_M__sTextEmbed);Term term_997;
        {
          BufferSink buf_1339 = sink.context().makeBuffer();
          buf_1339.start(_M_STRING); buf_1339.literal(1);
          buf_1339.end();
          term_997 = buf_1339.term();
        } sink.propertyNamed("$LineLocation", term_997);Term term_860;
        {
          BufferSink buf_1397 = sink.context().makeBuffer();
          buf_1397.start(_M_STRING); buf_1397.literal(1);
          buf_1397.end();
          term_860 = buf_1397.term();
        } sink.propertyNamed("$ColumnLocation", term_860);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_260.ref());
        sink.end();
        sink.end();
        sink.end();Term term_925;
        {
          BufferSink buf_899 = sink.context().makeBuffer(); buf_899.start(_M_STRING); buf_899.literal(1); buf_899.end();
          term_925 = buf_899.term();
        } sink.propertyNamed("$LineLocation", term_925);Term term_1045;
        {
          BufferSink buf_1071 = sink.context().makeBuffer();
          buf_1071.start(_M_STRING); buf_1071.literal(2);
          buf_1071.end();
          term_1045 = buf_1071.term();
        } sink.propertyNamed("$ColumnLocation", term_1045);
        sink.start(_M__sTextCons);Term term_1117;
        {
          BufferSink buf_984 = sink.context().makeBuffer(); buf_984.start(_M_STRING); buf_984.literal(1); buf_984.end();
          term_1117 = buf_984.term();
        } sink.propertyNamed("$LineLocation", term_1117);Term term_1316;
        {
          BufferSink buf_1553 = sink.context().makeBuffer();
          buf_1553.start(_M_STRING); buf_1553.literal(2);
          buf_1553.end();
          term_1316 = buf_1553.term();
        } sink.propertyNamed("$ColumnLocation", term_1316);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1027;
        {
          BufferSink buf_965 = sink.context().makeBuffer(); buf_965.start(_M_STRING); buf_965.literal(1); buf_965.end();
          term_1027 = buf_965.term();
        } sink.propertyNamed("$LineLocation", term_1027);Term term_1175;
        {
          BufferSink buf_1019 = sink.context().makeBuffer();
          buf_1019.start(_M_STRING); buf_1019.literal(27);
          buf_1019.end();
          term_1175 = buf_1019.term();
        } sink.propertyNamed("$ColumnLocation", term_1175);
        sink.start(_M__sTextCons);Term term_968;
        {
          BufferSink buf_1437 = sink.context().makeBuffer();
          buf_1437.start(_M_STRING); buf_1437.literal(1);
          buf_1437.end();
          term_968 = buf_1437.term();
        } sink.propertyNamed("$LineLocation", term_968);Term term_1197;
        {
          BufferSink buf_1459 = sink.context().makeBuffer();
          buf_1459.start(_M_STRING); buf_1459.literal(27);
          buf_1459.end();
          term_1197 = buf_1459.term();
        } sink.propertyNamed("$ColumnLocation", term_1197);
        sink.start(_M__sTextEmbed);Term term_1409;
        {
          BufferSink buf_751 = sink.context().makeBuffer(); buf_751.start(_M_STRING); buf_751.literal(1); buf_751.end();
          term_1409 = buf_751.term();
        } sink.propertyNamed("$LineLocation", term_1409);Term term_1710;
        {
          BufferSink buf_1491 = sink.context().makeBuffer();
          buf_1491.start(_M_STRING); buf_1491.literal(27);
          buf_1491.end();
          term_1710 = buf_1491.term();
        } sink.propertyNamed("$ColumnLocation", term_1710);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_1 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_1});
        sink.start(_M_Crsx_xPrint_xfreeTerms_xS1); sink.use(var_1);
        sink.end(); sink.copy(sub_150.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_616;
        {
          BufferSink buf_925 = sink.context().makeBuffer(); buf_925.start(_M_STRING); buf_925.literal(1); buf_925.end();
          term_616 = buf_925.term();
        } sink.propertyNamed("$LineLocation", term_616);Term term_1140;
        {
          BufferSink buf_837 = sink.context().makeBuffer();
          buf_837.start(_M_STRING); buf_837.literal(80);
          buf_837.end();
          term_1140 = buf_837.term();
        } sink.propertyNamed("$ColumnLocation", term_1140);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1285;
        {
          BufferSink buf_1133 = sink.context().makeBuffer();
          buf_1133.start(_M_STRING); buf_1133.literal(1);
          buf_1133.end();
          term_1285 = buf_1133.term();
        } sink.propertyNamed("$LineLocation", term_1285);Term term_1369;
        {
          BufferSink buf_1209 = sink.context().makeBuffer();
          buf_1209.start(_M_STRING); buf_1209.literal(28);
          buf_1209.end();
          term_1369 = buf_1209.term();
        } sink.propertyNamed("$ColumnLocation", term_1369);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xfreeTerms, term_1338);
  } final public static boolean _M_Crsx_xPrint_xfreeArguments(Sink sink, int shared, int depth, Term term_622) {
    if (depth < 2000) {
      label_7: {
        if (term_622.descriptor() != _M_Crsx_xfreeArguments)
        {   break label_7;
        }Term sub_46 = term_622.sub(0).ref();
        /* #1=sub */Term sub_134 = term_622.sub(1).ref();
        /* #2=sub */Term sub_205 = term_622.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1309;
        {
          BufferSink buf_1301 = sink.context().makeBuffer();
          buf_1301.start(_M_STRING); buf_1301.literal(1);
          buf_1301.end();
          term_1309 = buf_1301.term();
        } sink.propertyNamed("$LineLocation", term_1309);Term term_1319;
        {
          BufferSink buf_942 = sink.context().makeBuffer(); buf_942.start(_M_STRING); buf_942.literal(1); buf_942.end();
          term_1319 = buf_942.term();
        } sink.propertyNamed("$ColumnLocation", term_1319);
        sink.start(_M__sTextCons);Term term_753;
        {
          BufferSink buf_833 = sink.context().makeBuffer(); buf_833.start(_M_STRING); buf_833.literal(1); buf_833.end();
          term_753 = buf_833.term();
        } sink.propertyNamed("$LineLocation", term_753);Term term_1833;
        {
          BufferSink buf_1473 = sink.context().makeBuffer();
          buf_1473.start(_M_STRING); buf_1473.literal(2);
          buf_1473.end();
          term_1833 = buf_1473.term();
        } sink.propertyNamed("$ColumnLocation", term_1833);
        sink.start(_M__sTextChars); sink.copy(sub_46.ref());
        sink.end();Term term_1183;
        {
          BufferSink buf_939 = sink.context().makeBuffer(); buf_939.start(_M_STRING); buf_939.literal(1); buf_939.end();
          term_1183 = buf_939.term();
        } sink.propertyNamed("$LineLocation", term_1183);Term term_964;
        {
          BufferSink buf_1637 = sink.context().makeBuffer();
          buf_1637.start(_M_STRING); buf_1637.literal(3);
          buf_1637.end();
          term_964 = buf_1637.term();
        } sink.propertyNamed("$ColumnLocation", term_964);
        sink.start(_M__sTextCons);Term term_1361;
        {
          BufferSink buf_1153 = sink.context().makeBuffer();
          buf_1153.start(_M_STRING); buf_1153.literal(1);
          buf_1153.end();
          term_1361 = buf_1153.term();
        } sink.propertyNamed("$LineLocation", term_1361);Term term_573;
        {
          BufferSink buf_735 = sink.context().makeBuffer(); buf_735.start(_M_STRING); buf_735.literal(3); buf_735.end();
          term_573 = buf_735.term();
        } sink.propertyNamed("$ColumnLocation", term_573);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1104;
        {
          BufferSink buf_617 = sink.context().makeBuffer(); buf_617.start(_M_STRING); buf_617.literal(1); buf_617.end();
          term_1104 = buf_617.term();
        } sink.propertyNamed("$LineLocation", term_1104);Term term_884;
        {
          BufferSink buf_1419 = sink.context().makeBuffer();
          buf_1419.start(_M_STRING); buf_1419.literal(7);
          buf_1419.end();
          term_884 = buf_1419.term();
        } sink.propertyNamed("$ColumnLocation", term_884);
        sink.start(_M__sTextCons);Term term_1364;
        {
          BufferSink buf_1386 = sink.context().makeBuffer();
          buf_1386.start(_M_STRING); buf_1386.literal(1);
          buf_1386.end();
          term_1364 = buf_1386.term();
        } sink.propertyNamed("$LineLocation", term_1364);Term term_1396;
        {
          BufferSink buf_1523 = sink.context().makeBuffer();
          buf_1523.start(_M_STRING); buf_1523.literal(7);
          buf_1523.end();
          term_1396 = buf_1523.term();
        } sink.propertyNamed("$ColumnLocation", term_1396);
        sink.start(_M__sTextEmbed);Term term_1019;
        {
          BufferSink buf_845 = sink.context().makeBuffer(); buf_845.start(_M_STRING); buf_845.literal(1); buf_845.end();
          term_1019 = buf_845.term();
        } sink.propertyNamed("$LineLocation", term_1019);Term term_1457;
        {
          BufferSink buf_1276 = sink.context().makeBuffer();
          buf_1276.start(_M_STRING); buf_1276.literal(7);
          buf_1276.end();
          term_1457 = buf_1276.term();
        } sink.propertyNamed("$ColumnLocation", term_1457);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_70 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_70});
        sink.start(_M_Crsx_xPrint_xfreeTerms); sink.use(var_70);
        sink.end(); sink.copy(sub_134.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_972;
        {
          BufferSink buf_1259 = sink.context().makeBuffer();
          buf_1259.start(_M_STRING); buf_1259.literal(1);
          buf_1259.end();
          term_972 = buf_1259.term();
        } sink.propertyNamed("$LineLocation", term_972);Term term_1515;
        {
          BufferSink buf_1374 = sink.context().makeBuffer();
          buf_1374.start(_M_STRING); buf_1374.literal(57);
          buf_1374.end();
          term_1515 = buf_1374.term();
        } sink.propertyNamed("$ColumnLocation", term_1515);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1891;
        {
          BufferSink buf_1499 = sink.context().makeBuffer();
          buf_1499.start(_M_STRING); buf_1499.literal(1);
          buf_1499.end();
          term_1891 = buf_1499.term();
        } sink.propertyNamed("$LineLocation", term_1891);Term term_836;
        {
          BufferSink buf_1520 = sink.context().makeBuffer();
          buf_1520.start(_M_STRING); buf_1520.literal(8);
          buf_1520.end();
          term_836 = buf_1520.term();
        } sink.propertyNamed("$ColumnLocation", term_836);
        sink.start(_M__sTextCons);Term term_1885;
        {
          BufferSink buf_1107 = sink.context().makeBuffer();
          buf_1107.start(_M_STRING); buf_1107.literal(1);
          buf_1107.end();
          term_1885 = buf_1107.term();
        } sink.propertyNamed("$LineLocation", term_1885);Term term_1065;
        {
          BufferSink buf_802 = sink.context().makeBuffer(); buf_802.start(_M_STRING); buf_802.literal(8); buf_802.end();
          term_1065 = buf_802.term();
        } sink.propertyNamed("$ColumnLocation", term_1065);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_828;
        {
          BufferSink buf_1573 = sink.context().makeBuffer();
          buf_1573.start(_M_STRING); buf_1573.literal(1);
          buf_1573.end();
          term_828 = buf_1573.term();
        } sink.propertyNamed("$LineLocation", term_828);Term term_1075;
        {
          BufferSink buf_1385 = sink.context().makeBuffer();
          buf_1385.start(_M_STRING); buf_1385.literal(61);
          buf_1385.end();
          term_1075 = buf_1385.term();
        } sink.propertyNamed("$ColumnLocation", term_1075);
        sink.start(_M__sTextCons);Term term_921;
        {
          BufferSink buf_1490 = sink.context().makeBuffer();
          buf_1490.start(_M_STRING); buf_1490.literal(1);
          buf_1490.end();
          term_921 = buf_1490.term();
        } sink.propertyNamed("$LineLocation", term_921);Term term_989;
        {
          BufferSink buf_1743 = sink.context().makeBuffer();
          buf_1743.start(_M_STRING); buf_1743.literal(62);
          buf_1743.end();
          term_989 = buf_1743.term();
        } sink.propertyNamed("$ColumnLocation", term_989);
        sink.start(_M__sTextChars); sink.copy(sub_205.ref());
        sink.end();Term term_779;
        {
          BufferSink buf_1583 = sink.context().makeBuffer();
          buf_1583.start(_M_STRING); buf_1583.literal(1);
          buf_1583.end();
          term_779 = buf_1583.term();
        } sink.propertyNamed("$LineLocation", term_779);Term term_1179;
        {
          BufferSink buf_1392 = sink.context().makeBuffer();
          buf_1392.start(_M_STRING); buf_1392.literal(63);
          buf_1392.end();
          term_1179 = buf_1392.term();
        } sink.propertyNamed("$ColumnLocation", term_1179);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xfreeArguments, term_622);
  } final public static boolean _M_Crsx_xPrint_xterms_xS1(Sink sink, int shared, int depth, Term term_1130) {
    if (depth < 2000) {
      label_66: {
        if (term_1130.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_66;
        }Term sub_7 = term_1130.sub(0).ref();
        /* #1=sub */Term sub_17 = term_1130.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1359;
        {
          BufferSink buf_1117 = sink.context().makeBuffer();
          buf_1117.start(_M_STRING); buf_1117.literal(1);
          buf_1117.end();
          term_1359 = buf_1117.term();
        } sink.propertyNamed("$LineLocation", term_1359);Term term_1678;
        {
          BufferSink buf_1290 = sink.context().makeBuffer();
          buf_1290.start(_M_STRING); buf_1290.literal(1);
          buf_1290.end();
          term_1678 = buf_1290.term();
        } sink.propertyNamed("$ColumnLocation", term_1678);
        sink.start(_M__sTextCons);Term term_1195;
        {
          BufferSink buf_1090 = sink.context().makeBuffer();
          buf_1090.start(_M_STRING); buf_1090.literal(1);
          buf_1090.end();
          term_1195 = buf_1090.term();
        } sink.propertyNamed("$LineLocation", term_1195);Term term_1387;
        {
          BufferSink buf_1083 = sink.context().makeBuffer();
          buf_1083.start(_M_STRING); buf_1083.literal(2);
          buf_1083.end();
          term_1387 = buf_1083.term();
        } sink.propertyNamed("$ColumnLocation", term_1387);
        sink.start(_M__sTextChars); sink.copy(sub_7.ref());
        sink.end();Term term_1352;
        {
          BufferSink buf_1008 = sink.context().makeBuffer();
          buf_1008.start(_M_STRING); buf_1008.literal(1);
          buf_1008.end();
          term_1352 = buf_1008.term();
        } sink.propertyNamed("$LineLocation", term_1352);Term term_1257;
        {
          BufferSink buf_1784 = sink.context().makeBuffer();
          buf_1784.start(_M_STRING); buf_1784.literal(3);
          buf_1784.end();
          term_1257 = buf_1784.term();
        } sink.propertyNamed("$ColumnLocation", term_1257);
        sink.start(_M__sTextCons);Term term_1477;
        {
          BufferSink buf_885 = sink.context().makeBuffer(); buf_885.start(_M_STRING); buf_885.literal(1); buf_885.end();
          term_1477 = buf_885.term();
        } sink.propertyNamed("$LineLocation", term_1477);Term term_1040;
        {
          BufferSink buf_1200 = sink.context().makeBuffer();
          buf_1200.start(_M_STRING); buf_1200.literal(3);
          buf_1200.end();
          term_1040 = buf_1200.term();
        } sink.propertyNamed("$ColumnLocation", term_1040);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1312;
        {
          BufferSink buf_983 = sink.context().makeBuffer(); buf_983.start(_M_STRING); buf_983.literal(1); buf_983.end();
          term_1312 = buf_983.term();
        } sink.propertyNamed("$LineLocation", term_1312);Term term_943;
        {
          BufferSink buf_1176 = sink.context().makeBuffer();
          buf_1176.start(_M_STRING); buf_1176.literal(7);
          buf_1176.end();
          term_943 = buf_1176.term();
        } sink.propertyNamed("$ColumnLocation", term_943);
        sink.start(_M__sTextCons);Term term_1030;
        {
          BufferSink buf_978 = sink.context().makeBuffer(); buf_978.start(_M_STRING); buf_978.literal(1); buf_978.end();
          term_1030 = buf_978.term();
        } sink.propertyNamed("$LineLocation", term_1030);Term term_1931;
        {
          BufferSink buf_1110 = sink.context().makeBuffer();
          buf_1110.start(_M_STRING); buf_1110.literal(7);
          buf_1110.end();
          term_1931 = buf_1110.term();
        } sink.propertyNamed("$ColumnLocation", term_1931);
        sink.start(_M__sTextEmbed);Term term_837;
        {
          BufferSink buf_1226 = sink.context().makeBuffer();
          buf_1226.start(_M_STRING); buf_1226.literal(1);
          buf_1226.end();
          term_837 = buf_1226.term();
        } sink.propertyNamed("$LineLocation", term_837);Term term_1233;
        {
          BufferSink buf_1391 = sink.context().makeBuffer();
          buf_1391.start(_M_STRING); buf_1391.literal(7);
          buf_1391.end();
          term_1233 = buf_1391.term();
        } sink.propertyNamed("$ColumnLocation", term_1233);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xterm); sink.copy(sub_17.ref());
        sink.end();
        sink.end();
        sink.end();Term term_971;
        {
          BufferSink buf_1234 = sink.context().makeBuffer();
          buf_1234.start(_M_STRING); buf_1234.literal(1);
          buf_1234.end();
          term_971 = buf_1234.term();
        } sink.propertyNamed("$LineLocation", term_971);Term term_846;
        {
          BufferSink buf_902 = sink.context().makeBuffer(); buf_902.start(_M_STRING); buf_902.literal(8); buf_902.end();
          term_846 = buf_902.term();
        } sink.propertyNamed("$ColumnLocation", term_846);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xterms_xS1, term_1130);
  } final public static boolean _M_Crsx_xPrint_xterms(Sink sink, int shared, int depth, Term term_1750) {
    if (depth < 2000) {
      label_36: {
        if (term_1750.descriptor() != _M_Crsx_xterms)
        {   break label_36;
        }Term sub_23 = term_1750.sub(0).ref();
        /* #1=sub */Term sub_92 = term_1750.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1020;
        {
          BufferSink buf_1342 = sink.context().makeBuffer();
          buf_1342.start(_M_STRING); buf_1342.literal(1);
          buf_1342.end();
          term_1020 = buf_1342.term();
        } sink.propertyNamed("$LineLocation", term_1020);Term term_1920;
        {
          BufferSink buf_1059 = sink.context().makeBuffer();
          buf_1059.start(_M_STRING); buf_1059.literal(1);
          buf_1059.end();
          term_1920 = buf_1059.term();
        } sink.propertyNamed("$ColumnLocation", term_1920);
        sink.start(_M__sTextCons);Term term_1192;
        {
          BufferSink buf_1030 = sink.context().makeBuffer();
          buf_1030.start(_M_STRING); buf_1030.literal(1);
          buf_1030.end();
          term_1192 = buf_1030.term();
        } sink.propertyNamed("$LineLocation", term_1192);Term term_1377;
        {
          BufferSink buf_1118 = sink.context().makeBuffer();
          buf_1118.start(_M_STRING); buf_1118.literal(1);
          buf_1118.end();
          term_1377 = buf_1118.term();
        } sink.propertyNamed("$ColumnLocation", term_1377);
        sink.start(_M__sTextEmbed);Term term_1092;
        {
          BufferSink buf_947 = sink.context().makeBuffer(); buf_947.start(_M_STRING); buf_947.literal(1); buf_947.end();
          term_1092 = buf_947.term();
        } sink.propertyNamed("$LineLocation", term_1092);Term term_1282;
        {
          BufferSink buf_1671 = sink.context().makeBuffer();
          buf_1671.start(_M_STRING); buf_1671.literal(1);
          buf_1671.end();
          term_1282 = buf_1671.term();
        } sink.propertyNamed("$ColumnLocation", term_1282);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xterm); sink.copy(sub_23.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1408;
        {
          BufferSink buf_1077 = sink.context().makeBuffer();
          buf_1077.start(_M_STRING); buf_1077.literal(1);
          buf_1077.end();
          term_1408 = buf_1077.term();
        } sink.propertyNamed("$LineLocation", term_1408);Term term_1294;
        {
          BufferSink buf_1085 = sink.context().makeBuffer();
          buf_1085.start(_M_STRING); buf_1085.literal(2);
          buf_1085.end();
          term_1294 = buf_1085.term();
        } sink.propertyNamed("$ColumnLocation", term_1294);
        sink.start(_M__sTextCons);Term term_1121;
        {
          BufferSink buf_1162 = sink.context().makeBuffer();
          buf_1162.start(_M_STRING); buf_1162.literal(1);
          buf_1162.end();
          term_1121 = buf_1162.term();
        } sink.propertyNamed("$LineLocation", term_1121);Term term_996;
        {
          BufferSink buf_1285 = sink.context().makeBuffer();
          buf_1285.start(_M_STRING); buf_1285.literal(2);
          buf_1285.end();
          term_996 = buf_1285.term();
        } sink.propertyNamed("$ColumnLocation", term_996);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1297;
        {
          BufferSink buf_1240 = sink.context().makeBuffer();
          buf_1240.start(_M_STRING); buf_1240.literal(1);
          buf_1240.end();
          term_1297 = buf_1240.term();
        } sink.propertyNamed("$LineLocation", term_1297);Term term_940;
        {
          BufferSink buf_1751 = sink.context().makeBuffer();
          buf_1751.start(_M_STRING); buf_1751.literal(23);
          buf_1751.end();
          term_940 = buf_1751.term();
        } sink.propertyNamed("$ColumnLocation", term_940);
        sink.start(_M__sTextCons);Term term_929;
        {
          BufferSink buf_955 = sink.context().makeBuffer(); buf_955.start(_M_STRING); buf_955.literal(1); buf_955.end();
          term_929 = buf_955.term();
        } sink.propertyNamed("$LineLocation", term_929);Term term_1129;
        {
          BufferSink buf_976 = sink.context().makeBuffer();
          buf_976.start(_M_STRING); buf_976.literal(23);
          buf_976.end();
          term_1129 = buf_976.term();
        } sink.propertyNamed("$ColumnLocation", term_1129);
        sink.start(_M__sTextEmbed);Term term_1228;
        {
          BufferSink buf_737 = sink.context().makeBuffer(); buf_737.start(_M_STRING); buf_737.literal(1); buf_737.end();
          term_1228 = buf_737.term();
        } sink.propertyNamed("$LineLocation", term_1228);Term term_1246;
        {
          BufferSink buf_1104 = sink.context().makeBuffer();
          buf_1104.start(_M_STRING); buf_1104.literal(23);
          buf_1104.end();
          term_1246 = buf_1104.term();
        } sink.propertyNamed("$ColumnLocation", term_1246);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_93 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_93});
        sink.start(_M_Crsx_xPrint_xterms_xS1); sink.use(var_93);
        sink.end(); sink.copy(sub_92.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1176;
        {
          BufferSink buf_852 = sink.context().makeBuffer(); buf_852.start(_M_STRING); buf_852.literal(1); buf_852.end();
          term_1176 = buf_852.term();
        } sink.propertyNamed("$LineLocation", term_1176);Term term_1196;
        {
          BufferSink buf_1143 = sink.context().makeBuffer();
          buf_1143.start(_M_STRING); buf_1143.literal(72);
          buf_1143.end();
          term_1196 = buf_1143.term();
        } sink.propertyNamed("$ColumnLocation", term_1196);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1023;
        {
          BufferSink buf_1795 = sink.context().makeBuffer();
          buf_1795.start(_M_STRING); buf_1795.literal(1);
          buf_1795.end();
          term_1023 = buf_1795.term();
        } sink.propertyNamed("$LineLocation", term_1023);Term term_1468;
        {
          BufferSink buf_1580 = sink.context().makeBuffer();
          buf_1580.start(_M_STRING); buf_1580.literal(24);
          buf_1580.end();
          term_1468 = buf_1580.term();
        } sink.propertyNamed("$ColumnLocation", term_1468);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xterms, term_1750);
  } final public static boolean _M_Crsx_xPrint_xarguments(Sink sink, int shared, int depth, Term term_1425) {
    if (depth < 2000) {
      label_73: {
        if (term_1425.descriptor() != _M_Crsx_xarguments)
        {   break label_73;
        }Term sub_389 = term_1425.sub(0).ref();
        /* #1=sub */Term sub_170 = term_1425.sub(1).ref();
        /* #2=sub */Term sub_157 = term_1425.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1235;
        {
          BufferSink buf_1557 = sink.context().makeBuffer();
          buf_1557.start(_M_STRING); buf_1557.literal(1);
          buf_1557.end();
          term_1235 = buf_1557.term();
        } sink.propertyNamed("$LineLocation", term_1235);Term term_1633;
        {
          BufferSink buf_1214 = sink.context().makeBuffer();
          buf_1214.start(_M_STRING); buf_1214.literal(1);
          buf_1214.end();
          term_1633 = buf_1214.term();
        } sink.propertyNamed("$ColumnLocation", term_1633);
        sink.start(_M__sTextCons);Term term_1047;
        {
          BufferSink buf_1277 = sink.context().makeBuffer();
          buf_1277.start(_M_STRING); buf_1277.literal(1);
          buf_1277.end();
          term_1047 = buf_1277.term();
        } sink.propertyNamed("$LineLocation", term_1047);Term term_944;
        {
          BufferSink buf_1246 = sink.context().makeBuffer();
          buf_1246.start(_M_STRING); buf_1246.literal(2);
          buf_1246.end();
          term_944 = buf_1246.term();
        } sink.propertyNamed("$ColumnLocation", term_944);
        sink.start(_M__sTextChars); sink.copy(sub_389.ref());
        sink.end();Term term_881;
        {
          BufferSink buf_1097 = sink.context().makeBuffer();
          buf_1097.start(_M_STRING); buf_1097.literal(1);
          buf_1097.end();
          term_881 = buf_1097.term();
        } sink.propertyNamed("$LineLocation", term_881);Term term_1171;
        {
          BufferSink buf_1091 = sink.context().makeBuffer();
          buf_1091.start(_M_STRING); buf_1091.literal(3);
          buf_1091.end();
          term_1171 = buf_1091.term();
        } sink.propertyNamed("$ColumnLocation", term_1171);
        sink.start(_M__sTextCons);Term term_1298;
        {
          BufferSink buf_1356 = sink.context().makeBuffer();
          buf_1356.start(_M_STRING); buf_1356.literal(1);
          buf_1356.end();
          term_1298 = buf_1356.term();
        } sink.propertyNamed("$LineLocation", term_1298);Term term_1379;
        {
          BufferSink buf_1098 = sink.context().makeBuffer();
          buf_1098.start(_M_STRING); buf_1098.literal(3);
          buf_1098.end();
          term_1379 = buf_1098.term();
        } sink.propertyNamed("$ColumnLocation", term_1379);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1549;
        {
          BufferSink buf_1400 = sink.context().makeBuffer();
          buf_1400.start(_M_STRING); buf_1400.literal(1);
          buf_1400.end();
          term_1549 = buf_1400.term();
        } sink.propertyNamed("$LineLocation", term_1549);Term term_1168;
        {
          BufferSink buf_1222 = sink.context().makeBuffer();
          buf_1222.start(_M_STRING); buf_1222.literal(7);
          buf_1222.end();
          term_1168 = buf_1222.term();
        } sink.propertyNamed("$ColumnLocation", term_1168);
        sink.start(_M__sTextCons);Term term_1044;
        {
          BufferSink buf_853 = sink.context().makeBuffer(); buf_853.start(_M_STRING); buf_853.literal(1); buf_853.end();
          term_1044 = buf_853.term();
        } sink.propertyNamed("$LineLocation", term_1044);Term term_1124;
        {
          BufferSink buf_1407 = sink.context().makeBuffer();
          buf_1407.start(_M_STRING); buf_1407.literal(7);
          buf_1407.end();
          term_1124 = buf_1407.term();
        } sink.propertyNamed("$ColumnLocation", term_1124);
        sink.start(_M__sTextEmbed);Term term_1671;
        {
          BufferSink buf_1164 = sink.context().makeBuffer();
          buf_1164.start(_M_STRING); buf_1164.literal(1);
          buf_1164.end();
          term_1671 = buf_1164.term();
        } sink.propertyNamed("$LineLocation", term_1671);Term term_1300;
        {
          BufferSink buf_969 = sink.context().makeBuffer(); buf_969.start(_M_STRING); buf_969.literal(7); buf_969.end();
          term_1300 = buf_969.term();
        } sink.propertyNamed("$ColumnLocation", term_1300);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_54 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_54});
        sink.start(_M_Crsx_xPrint_xterms); sink.use(var_54);
        sink.end(); sink.copy(sub_170.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_612;
        {
          BufferSink buf_1820 = sink.context().makeBuffer();
          buf_1820.start(_M_STRING); buf_1820.literal(1);
          buf_1820.end();
          term_612 = buf_1820.term();
        } sink.propertyNamed("$LineLocation", term_612);Term term_1485;
        {
          BufferSink buf_1213 = sink.context().makeBuffer();
          buf_1213.start(_M_STRING); buf_1213.literal(53);
          buf_1213.end();
          term_1485 = buf_1213.term();
        } sink.propertyNamed("$ColumnLocation", term_1485);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1161;
        {
          BufferSink buf_1435 = sink.context().makeBuffer();
          buf_1435.start(_M_STRING); buf_1435.literal(1);
          buf_1435.end();
          term_1161 = buf_1435.term();
        } sink.propertyNamed("$LineLocation", term_1161);Term term_1498;
        {
          BufferSink buf_525 = sink.context().makeBuffer(); buf_525.start(_M_STRING); buf_525.literal(8); buf_525.end();
          term_1498 = buf_525.term();
        } sink.propertyNamed("$ColumnLocation", term_1498);
        sink.start(_M__sTextCons);Term term_1318;
        {
          BufferSink buf_597 = sink.context().makeBuffer(); buf_597.start(_M_STRING); buf_597.literal(1); buf_597.end();
          term_1318 = buf_597.term();
        } sink.propertyNamed("$LineLocation", term_1318);Term term_893;
        {
          BufferSink buf_781 = sink.context().makeBuffer(); buf_781.start(_M_STRING); buf_781.literal(8); buf_781.end();
          term_893 = buf_781.term();
        } sink.propertyNamed("$ColumnLocation", term_893);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1310;
        {
          BufferSink buf_1310 = sink.context().makeBuffer();
          buf_1310.start(_M_STRING); buf_1310.literal(1);
          buf_1310.end();
          term_1310 = buf_1310.term();
        } sink.propertyNamed("$LineLocation", term_1310);Term term_1354;
        {
          BufferSink buf_1653 = sink.context().makeBuffer();
          buf_1653.start(_M_STRING); buf_1653.literal(57);
          buf_1653.end();
          term_1354 = buf_1653.term();
        } sink.propertyNamed("$ColumnLocation", term_1354);
        sink.start(_M__sTextCons);Term term_1330;
        {
          BufferSink buf_1311 = sink.context().makeBuffer();
          buf_1311.start(_M_STRING); buf_1311.literal(1);
          buf_1311.end();
          term_1330 = buf_1311.term();
        } sink.propertyNamed("$LineLocation", term_1330);Term term_1386;
        {
          BufferSink buf_1450 = sink.context().makeBuffer();
          buf_1450.start(_M_STRING); buf_1450.literal(58);
          buf_1450.end();
          term_1386 = buf_1450.term();
        } sink.propertyNamed("$ColumnLocation", term_1386);
        sink.start(_M__sTextChars); sink.copy(sub_157.ref());
        sink.end();Term term_1786;
        {
          BufferSink buf_1231 = sink.context().makeBuffer();
          buf_1231.start(_M_STRING); buf_1231.literal(1);
          buf_1231.end();
          term_1786 = buf_1231.term();
        } sink.propertyNamed("$LineLocation", term_1786);Term term_1173;
        {
          BufferSink buf_1232 = sink.context().makeBuffer();
          buf_1232.start(_M_STRING); buf_1232.literal(59);
          buf_1232.end();
          term_1173 = buf_1232.term();
        } sink.propertyNamed("$ColumnLocation", term_1173);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xarguments, term_1425);
  } final public static boolean _M_Crsx_xPrint_xnextBinder(Sink sink, int shared, int depth, Term term_1382) {
    if (depth < 2000) {
      label_83: {
        if (term_1382.descriptor() != _M_Crsx_xnextBinder_xA1)
        {   break label_83;
        }Term sub_85 = term_1382.sub(0).ref();
        /* #1=sub */Term sub_2 = term_1382.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1052;
        {
          BufferSink buf_1123 = sink.context().makeBuffer();
          buf_1123.start(_M_STRING); buf_1123.literal(1);
          buf_1123.end();
          term_1052 = buf_1123.term();
        } sink.propertyNamed("$LineLocation", term_1052);Term term_1222;
        {
          BufferSink buf_1388 = sink.context().makeBuffer();
          buf_1388.start(_M_STRING); buf_1388.literal(1);
          buf_1388.end();
          term_1222 = buf_1388.term();
        } sink.propertyNamed("$ColumnLocation", term_1222);
        sink.start(_M__sTextCons);Term term_1164;
        {
          BufferSink buf_703 = sink.context().makeBuffer(); buf_703.start(_M_STRING); buf_703.literal(1); buf_703.end();
          term_1164 = buf_703.term();
        } sink.propertyNamed("$LineLocation", term_1164);Term term_1134;
        {
          BufferSink buf_1166 = sink.context().makeBuffer();
          buf_1166.start(_M_STRING); buf_1166.literal(1);
          buf_1166.end();
          term_1134 = buf_1166.term();
        } sink.propertyNamed("$ColumnLocation", term_1134);
        sink.start(_M__sTextEmbed);Term term_1033;
        {
          BufferSink buf_1106 = sink.context().makeBuffer();
          buf_1106.start(_M_STRING); buf_1106.literal(1);
          buf_1106.end();
          term_1033 = buf_1106.term();
        } sink.propertyNamed("$LineLocation", term_1033);Term term_680;
        {
          BufferSink buf_1265 = sink.context().makeBuffer();
          buf_1265.start(_M_STRING); buf_1265.literal(1);
          buf_1265.end();
          term_680 = buf_1265.term();
        } sink.propertyNamed("$ColumnLocation", term_680);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xbinder); sink.copy(sub_85.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1067;
        {
          BufferSink buf_877 = sink.context().makeBuffer(); buf_877.start(_M_STRING); buf_877.literal(1); buf_877.end();
          term_1067 = buf_877.term();
        } sink.propertyNamed("$LineLocation", term_1067);Term term_902;
        {
          BufferSink buf_1190 = sink.context().makeBuffer();
          buf_1190.start(_M_STRING); buf_1190.literal(2);
          buf_1190.end();
          term_902 = buf_1190.term();
        } sink.propertyNamed("$ColumnLocation", term_902);
        sink.start(_M__sTextCons);Term term_1155;
        {
          BufferSink buf_713 = sink.context().makeBuffer(); buf_713.start(_M_STRING); buf_713.literal(1); buf_713.end();
          term_1155 = buf_713.term();
        } sink.propertyNamed("$LineLocation", term_1155);Term term_1665;
        {
          BufferSink buf_1109 = sink.context().makeBuffer();
          buf_1109.start(_M_STRING); buf_1109.literal(2);
          buf_1109.end();
          term_1665 = buf_1109.term();
        } sink.propertyNamed("$ColumnLocation", term_1665);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1306;
        {
          BufferSink buf_905 = sink.context().makeBuffer(); buf_905.start(_M_STRING); buf_905.literal(1); buf_905.end();
          term_1306 = buf_905.term();
        } sink.propertyNamed("$LineLocation", term_1306);Term term_1095;
        {
          BufferSink buf_1324 = sink.context().makeBuffer();
          buf_1324.start(_M_STRING); buf_1324.literal(25);
          buf_1324.end();
          term_1095 = buf_1324.term();
        } sink.propertyNamed("$ColumnLocation", term_1095);
        sink.start(_M__sTextCons);Term term_936;
        {
          BufferSink buf_1126 = sink.context().makeBuffer();
          buf_1126.start(_M_STRING); buf_1126.literal(1);
          buf_1126.end();
          term_936 = buf_1126.term();
        } sink.propertyNamed("$LineLocation", term_936);Term term_1713;
        {
          BufferSink buf_1421 = sink.context().makeBuffer();
          buf_1421.start(_M_STRING); buf_1421.literal(25);
          buf_1421.end();
          term_1713 = buf_1421.term();
        } sink.propertyNamed("$ColumnLocation", term_1713);
        sink.start(_M__sTextEmbed);Term term_1807;
        {
          BufferSink buf_1135 = sink.context().makeBuffer();
          buf_1135.start(_M_STRING); buf_1135.literal(1);
          buf_1135.end();
          term_1807 = buf_1135.term();
        } sink.propertyNamed("$LineLocation", term_1807);Term term_1469;
        {
          BufferSink buf_664 = sink.context().makeBuffer();
          buf_664.start(_M_STRING); buf_664.literal(25);
          buf_664.end();
          term_1469 = buf_664.term();
        } sink.propertyNamed("$ColumnLocation", term_1469);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xnextBinder); sink.copy(sub_2.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1721;
        {
          BufferSink buf_1378 = sink.context().makeBuffer();
          buf_1378.start(_M_STRING); buf_1378.literal(1);
          buf_1378.end();
          term_1721 = buf_1378.term();
        } sink.propertyNamed("$LineLocation", term_1721);Term term_1495;
        {
          BufferSink buf_1000 = sink.context().makeBuffer();
          buf_1000.start(_M_STRING); buf_1000.literal(26);
          buf_1000.end();
          term_1495 = buf_1000.term();
        } sink.propertyNamed("$ColumnLocation", term_1495);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_116: {
        if (term_1382.descriptor() != _M_Crsx_xnextBinder_xA2)
        {   break label_116;
        }Term sub_19 = term_1382.sub(0).ref();
        /* #1=sub */Term sub_124 = term_1382.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1146;
        {
          BufferSink buf_1178 = sink.context().makeBuffer();
          buf_1178.start(_M_STRING); buf_1178.literal(1);
          buf_1178.end();
          term_1146 = buf_1178.term();
        } sink.propertyNamed("$LineLocation", term_1146);Term term_1039;
        {
          BufferSink buf_1542 = sink.context().makeBuffer();
          buf_1542.start(_M_STRING); buf_1542.literal(1);
          buf_1542.end();
          term_1039 = buf_1542.term();
        } sink.propertyNamed("$ColumnLocation", term_1039);
        sink.start(_M__sTextCons);Term term_1299;
        {
          BufferSink buf_1613 = sink.context().makeBuffer();
          buf_1613.start(_M_STRING); buf_1613.literal(1);
          buf_1613.end();
          term_1299 = buf_1613.term();
        } sink.propertyNamed("$LineLocation", term_1299);Term term_1432;
        {
          BufferSink buf_721 = sink.context().makeBuffer(); buf_721.start(_M_STRING); buf_721.literal(2); buf_721.end();
          term_1432 = buf_721.term();
        } sink.propertyNamed("$ColumnLocation", term_1432);
        sink.start(_M__sTextChars); sink.copy(sub_19.ref());
        sink.end();Term term_1029;
        {
          BufferSink buf_964 = sink.context().makeBuffer(); buf_964.start(_M_STRING); buf_964.literal(1); buf_964.end();
          term_1029 = buf_964.term();
        } sink.propertyNamed("$LineLocation", term_1029);Term term_1086;
        {
          BufferSink buf_1579 = sink.context().makeBuffer();
          buf_1579.start(_M_STRING); buf_1579.literal(3);
          buf_1579.end();
          term_1086 = buf_1579.term();
        } sink.propertyNamed("$ColumnLocation", term_1086);
        sink.start(_M__sTextCons);Term term_1869;
        {
          BufferSink buf_1466 = sink.context().makeBuffer();
          buf_1466.start(_M_STRING); buf_1466.literal(1);
          buf_1466.end();
          term_1869 = buf_1466.term();
        } sink.propertyNamed("$LineLocation", term_1869);Term term_1182;
        {
          BufferSink buf_1576 = sink.context().makeBuffer();
          buf_1576.start(_M_STRING); buf_1576.literal(3);
          buf_1576.end();
          term_1182 = buf_1576.term();
        } sink.propertyNamed("$ColumnLocation", term_1182);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1001;
        {
          BufferSink buf_1639 = sink.context().makeBuffer();
          buf_1639.start(_M_STRING); buf_1639.literal(1);
          buf_1639.end();
          term_1001 = buf_1639.term();
        } sink.propertyNamed("$LineLocation", term_1001);Term term_1084;
        {
          BufferSink buf_1314 = sink.context().makeBuffer();
          buf_1314.start(_M_STRING); buf_1314.literal(7);
          buf_1314.end();
          term_1084 = buf_1314.term();
        } sink.propertyNamed("$ColumnLocation", term_1084);
        sink.start(_M__sTextCons);Term term_990;
        {
          BufferSink buf_1312 = sink.context().makeBuffer();
          buf_1312.start(_M_STRING); buf_1312.literal(1);
          buf_1312.end();
          term_990 = buf_1312.term();
        } sink.propertyNamed("$LineLocation", term_990);Term term_1358;
        {
          BufferSink buf_1183 = sink.context().makeBuffer();
          buf_1183.start(_M_STRING); buf_1183.literal(7);
          buf_1183.end();
          term_1358 = buf_1183.term();
        } sink.propertyNamed("$ColumnLocation", term_1358);
        sink.start(_M__sTextEmbed);Term term_1817;
        {
          BufferSink buf_1494 = sink.context().makeBuffer();
          buf_1494.start(_M_STRING); buf_1494.literal(1);
          buf_1494.end();
          term_1817 = buf_1494.term();
        } sink.propertyNamed("$LineLocation", term_1817);Term term_1464;
        {
          BufferSink buf_715 = sink.context().makeBuffer(); buf_715.start(_M_STRING); buf_715.literal(7); buf_715.end();
          term_1464 = buf_715.term();
        } sink.propertyNamed("$ColumnLocation", term_1464);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_124.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1254;
        {
          BufferSink buf_1174 = sink.context().makeBuffer();
          buf_1174.start(_M_STRING); buf_1174.literal(1);
          buf_1174.end();
          term_1254 = buf_1174.term();
        } sink.propertyNamed("$LineLocation", term_1254);Term term_1214;
        {
          BufferSink buf_1095 = sink.context().makeBuffer();
          buf_1095.start(_M_STRING); buf_1095.literal(8);
          buf_1095.end();
          term_1214 = buf_1095.term();
        } sink.propertyNamed("$ColumnLocation", term_1214);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xnextBinder, term_1382);
  } final public static boolean _M_Crsx_xPrint_xboundTerm(Sink sink, int shared, int depth, Term term_1131) {
    if (depth < 2000) {
      label_2: {
        if (term_1131.descriptor() != _M_Crsx_xboundTerm)
        {   break label_2;
        }Term sub_231 = term_1131.sub(0).ref();
        /* #1=sub */Term sub_145 = term_1131.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1623;
        {
          BufferSink buf_805 = sink.context().makeBuffer(); buf_805.start(_M_STRING); buf_805.literal(1); buf_805.end();
          term_1623 = buf_805.term();
        } sink.propertyNamed("$LineLocation", term_1623);Term term_791;
        {
          BufferSink buf_1179 = sink.context().makeBuffer();
          buf_1179.start(_M_STRING); buf_1179.literal(1);
          buf_1179.end();
          term_791 = buf_1179.term();
        } sink.propertyNamed("$ColumnLocation", term_791);
        sink.start(_M__sTextCons);Term term_1439;
        {
          BufferSink buf_1151 = sink.context().makeBuffer();
          buf_1151.start(_M_STRING); buf_1151.literal(1);
          buf_1151.end();
          term_1439 = buf_1151.term();
        } sink.propertyNamed("$LineLocation", term_1439);Term term_1127;
        {
          BufferSink buf_928 = sink.context().makeBuffer(); buf_928.start(_M_STRING); buf_928.literal(1); buf_928.end();
          term_1127 = buf_928.term();
        } sink.propertyNamed("$ColumnLocation", term_1127);
        sink.start(_M__sTextEmbed);Term term_1344;
        {
          BufferSink buf_719 = sink.context().makeBuffer(); buf_719.start(_M_STRING); buf_719.literal(1); buf_719.end();
          term_1344 = buf_719.term();
        } sink.propertyNamed("$LineLocation", term_1344);Term term_1497;
        {
          BufferSink buf_839 = sink.context().makeBuffer(); buf_839.start(_M_STRING); buf_839.literal(1); buf_839.end();
          term_1497 = buf_839.term();
        } sink.propertyNamed("$ColumnLocation", term_1497);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xbinder); sink.copy(sub_231.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1381;
        {
          BufferSink buf_1121 = sink.context().makeBuffer();
          buf_1121.start(_M_STRING); buf_1121.literal(1);
          buf_1121.end();
          term_1381 = buf_1121.term();
        } sink.propertyNamed("$LineLocation", term_1381);Term term_1347;
        {
          BufferSink buf_1223 = sink.context().makeBuffer();
          buf_1223.start(_M_STRING); buf_1223.literal(2);
          buf_1223.end();
          term_1347 = buf_1223.term();
        } sink.propertyNamed("$ColumnLocation", term_1347);
        sink.start(_M__sTextCons);Term term_1056;
        {
          BufferSink buf_1623 = sink.context().makeBuffer();
          buf_1623.start(_M_STRING); buf_1623.literal(1);
          buf_1623.end();
          term_1056 = buf_1623.term();
        } sink.propertyNamed("$LineLocation", term_1056);Term term_937;
        {
          BufferSink buf_1782 = sink.context().makeBuffer();
          buf_1782.start(_M_STRING); buf_1782.literal(2);
          buf_1782.end();
          term_937 = buf_1782.term();
        } sink.propertyNamed("$ColumnLocation", term_937);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1243;
        {
          BufferSink buf_1518 = sink.context().makeBuffer();
          buf_1518.start(_M_STRING); buf_1518.literal(1);
          buf_1518.end();
          term_1243 = buf_1518.term();
        } sink.propertyNamed("$LineLocation", term_1243);Term term_1644;
        {
          BufferSink buf_1243 = sink.context().makeBuffer();
          buf_1243.start(_M_STRING); buf_1243.literal(25);
          buf_1243.end();
          term_1644 = buf_1243.term();
        } sink.propertyNamed("$ColumnLocation", term_1644);
        sink.start(_M__sTextCons);Term term_1186;
        {
          BufferSink buf_1074 = sink.context().makeBuffer();
          buf_1074.start(_M_STRING); buf_1074.literal(1);
          buf_1074.end();
          term_1186 = buf_1074.term();
        } sink.propertyNamed("$LineLocation", term_1186);Term term_1191;
        {
          BufferSink buf_1444 = sink.context().makeBuffer();
          buf_1444.start(_M_STRING); buf_1444.literal(25);
          buf_1444.end();
          term_1191 = buf_1444.term();
        } sink.propertyNamed("$ColumnLocation", term_1191);
        sink.start(_M__sTextEmbed);Term term_654;
        {
          BufferSink buf_1069 = sink.context().makeBuffer();
          buf_1069.start(_M_STRING); buf_1069.literal(1);
          buf_1069.end();
          term_654 = buf_1069.term();
        } sink.propertyNamed("$LineLocation", term_654);Term term_1472;
        {
          BufferSink buf_1295 = sink.context().makeBuffer();
          buf_1295.start(_M_STRING); buf_1295.literal(25);
          buf_1295.end();
          term_1472 = buf_1295.term();
        } sink.propertyNamed("$ColumnLocation", term_1472);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xnextBinder); sink.copy(sub_145.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1193;
        {
          BufferSink buf_1248 = sink.context().makeBuffer();
          buf_1248.start(_M_STRING); buf_1248.literal(1);
          buf_1248.end();
          term_1193 = buf_1248.term();
        } sink.propertyNamed("$LineLocation", term_1193);Term term_981;
        {
          BufferSink buf_1018 = sink.context().makeBuffer();
          buf_1018.start(_M_STRING); buf_1018.literal(26);
          buf_1018.end();
          term_981 = buf_1018.term();
        } sink.propertyNamed("$ColumnLocation", term_981);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xboundTerm, term_1131);
  } final public static boolean _M_Crsx_xPrint_xfreeTerm(Sink sink, int shared, int depth, Term term_1547) {
    if (depth < 2000) {
      label_24: {
        if (term_1547.descriptor() != _M_Crsx_xfreeTerm_xA1)
        {   break label_24;
        }Term sub_197 = term_1547.sub(0).ref();
        /* #1=sub */Term sub_223 = term_1547.sub(1).ref();
        /* #2=sub */Term sub_270 = term_1547.sub(2).ref();
        /* #3=sub */Term sub_263 = term_1547.sub(3).ref();
        /* #4=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1035;
        {
          BufferSink buf_1266 = sink.context().makeBuffer();
          buf_1266.start(_M_STRING); buf_1266.literal(1);
          buf_1266.end();
          term_1035 = buf_1266.term();
        } sink.propertyNamed("$LineLocation", term_1035);Term term_1368;
        {
          BufferSink buf_810 = sink.context().makeBuffer(); buf_810.start(_M_STRING); buf_810.literal(1); buf_810.end();
          term_1368 = buf_810.term();
        } sink.propertyNamed("$ColumnLocation", term_1368);
        sink.start(_M__sTextCons);Term term_994;
        {
          BufferSink buf_1381 = sink.context().makeBuffer();
          buf_1381.start(_M_STRING); buf_1381.literal(1);
          buf_1381.end();
          term_994 = buf_1381.term();
        } sink.propertyNamed("$LineLocation", term_994);Term term_1350;
        {
          BufferSink buf_1347 = sink.context().makeBuffer();
          buf_1347.start(_M_STRING); buf_1347.literal(1);
          buf_1347.end();
          term_1350 = buf_1347.term();
        } sink.propertyNamed("$ColumnLocation", term_1350);
        sink.start(_M__sTextEmbed);Term term_1002;
        {
          BufferSink buf_898 = sink.context().makeBuffer(); buf_898.start(_M_STRING); buf_898.literal(1); buf_898.end();
          term_1002 = buf_898.term();
        } sink.propertyNamed("$LineLocation", term_1002);Term term_1602;
        {
          BufferSink buf_1237 = sink.context().makeBuffer();
          buf_1237.start(_M_STRING); buf_1237.literal(1);
          buf_1237.end();
          term_1602 = buf_1237.term();
        } sink.propertyNamed("$ColumnLocation", term_1602);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_127 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_127});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_127);
        sink.end(); sink.copy(sub_197.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1304;
        {
          BufferSink buf_1338 = sink.context().makeBuffer();
          buf_1338.start(_M_STRING); buf_1338.literal(1);
          buf_1338.end();
          term_1304 = buf_1338.term();
        } sink.propertyNamed("$LineLocation", term_1304);Term term_1120;
        {
          BufferSink buf_1182 = sink.context().makeBuffer();
          buf_1182.start(_M_STRING); buf_1182.literal(53);
          buf_1182.end();
          term_1120 = buf_1182.term();
        } sink.propertyNamed("$ColumnLocation", term_1120);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1429;
        {
          BufferSink buf_1283 = sink.context().makeBuffer();
          buf_1283.start(_M_STRING); buf_1283.literal(1);
          buf_1283.end();
          term_1429 = buf_1283.term();
        } sink.propertyNamed("$LineLocation", term_1429);Term term_1872;
        {
          BufferSink buf_1201 = sink.context().makeBuffer();
          buf_1201.start(_M_STRING); buf_1201.literal(2);
          buf_1201.end();
          term_1872 = buf_1201.term();
        } sink.propertyNamed("$ColumnLocation", term_1872);
        sink.start(_M__sTextCons);Term term_1277;
        {
          BufferSink buf_1298 = sink.context().makeBuffer();
          buf_1298.start(_M_STRING); buf_1298.literal(1);
          buf_1298.end();
          term_1277 = buf_1298.term();
        } sink.propertyNamed("$LineLocation", term_1277);Term term_1326;
        {
          BufferSink buf_1070 = sink.context().makeBuffer();
          buf_1070.start(_M_STRING); buf_1070.literal(2);
          buf_1070.end();
          term_1326 = buf_1070.term();
        } sink.propertyNamed("$ColumnLocation", term_1326);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_969;
        {
          BufferSink buf_1080 = sink.context().makeBuffer();
          buf_1080.start(_M_STRING); buf_1080.literal(1);
          buf_1080.end();
          term_969 = buf_1080.term();
        } sink.propertyNamed("$LineLocation", term_969);Term term_1491;
        {
          BufferSink buf_1053 = sink.context().makeBuffer();
          buf_1053.start(_M_STRING); buf_1053.literal(57);
          buf_1053.end();
          term_1491 = buf_1053.term();
        } sink.propertyNamed("$ColumnLocation", term_1491);
        sink.start(_M__sTextCons);Term term_1603;
        {
          BufferSink buf_1501 = sink.context().makeBuffer();
          buf_1501.start(_M_STRING); buf_1501.literal(1);
          buf_1501.end();
          term_1603 = buf_1501.term();
        } sink.propertyNamed("$LineLocation", term_1603);Term term_1025;
        {
          BufferSink buf_1056 = sink.context().makeBuffer();
          buf_1056.start(_M_STRING); buf_1056.literal(57);
          buf_1056.end();
          term_1025 = buf_1056.term();
        } sink.propertyNamed("$ColumnLocation", term_1025);
        sink.start(_M__sTextEmbed);Term term_1351;
        {
          BufferSink buf_934 = sink.context().makeBuffer(); buf_934.start(_M_STRING); buf_934.literal(1); buf_934.end();
          term_1351 = buf_934.term();
        } sink.propertyNamed("$LineLocation", term_1351);Term term_1103;
        {
          BufferSink buf_1282 = sink.context().makeBuffer();
          buf_1282.start(_M_STRING); buf_1282.literal(57);
          buf_1282.end();
          term_1103 = buf_1282.term();
        } sink.propertyNamed("$ColumnLocation", term_1103);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_96 = sink.context().makeVariable("x_93");
        sink.binds(new Variable[] {var_96});
        sink.start(_M_Crsx_xPrint_xproperties); sink.use(var_96);
        sink.end(); sink.copy(sub_223.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1252;
        {
          BufferSink buf_1029 = sink.context().makeBuffer();
          buf_1029.start(_M_STRING); buf_1029.literal(1);
          buf_1029.end();
          term_1252 = buf_1029.term();
        } sink.propertyNamed("$LineLocation", term_1252);Term term_1264;
        {
          BufferSink buf_1552 = sink.context().makeBuffer();
          buf_1552.start(_M_STRING); buf_1552.literal(108);
          buf_1552.end();
          term_1264 = buf_1552.term();
        } sink.propertyNamed("$ColumnLocation", term_1264);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1487;
        {
          BufferSink buf_1165 = sink.context().makeBuffer();
          buf_1165.start(_M_STRING); buf_1165.literal(1);
          buf_1165.end();
          term_1487 = buf_1165.term();
        } sink.propertyNamed("$LineLocation", term_1487);Term term_1608;
        {
          BufferSink buf_1502 = sink.context().makeBuffer();
          buf_1502.start(_M_STRING); buf_1502.literal(58);
          buf_1502.end();
          term_1608 = buf_1502.term();
        } sink.propertyNamed("$ColumnLocation", term_1608);
        sink.start(_M__sTextCons);Term term_1367;
        {
          BufferSink buf_1009 = sink.context().makeBuffer();
          buf_1009.start(_M_STRING); buf_1009.literal(1);
          buf_1009.end();
          term_1367 = buf_1009.term();
        } sink.propertyNamed("$LineLocation", term_1367);Term term_1479;
        {
          BufferSink buf_861 = sink.context().makeBuffer();
          buf_861.start(_M_STRING); buf_861.literal(58);
          buf_861.end();
          term_1479 = buf_861.term();
        } sink.propertyNamed("$ColumnLocation", term_1479);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1303;
        {
          BufferSink buf_1063 = sink.context().makeBuffer();
          buf_1063.start(_M_STRING); buf_1063.literal(1);
          buf_1063.end();
          term_1303 = buf_1063.term();
        } sink.propertyNamed("$LineLocation", term_1303);Term term_1451;
        {
          BufferSink buf_844 = sink.context().makeBuffer();
          buf_844.start(_M_STRING); buf_844.literal(112);
          buf_844.end();
          term_1451 = buf_844.term();
        } sink.propertyNamed("$ColumnLocation", term_1451);
        sink.start(_M__sTextCons);Term term_1283;
        {
          BufferSink buf_1027 = sink.context().makeBuffer();
          buf_1027.start(_M_STRING); buf_1027.literal(1);
          buf_1027.end();
          term_1283 = buf_1027.term();
        } sink.propertyNamed("$LineLocation", term_1283);Term term_1503;
        {
          BufferSink buf_1205 = sink.context().makeBuffer();
          buf_1205.start(_M_STRING); buf_1205.literal(112);
          buf_1205.end();
          term_1503 = buf_1205.term();
        } sink.propertyNamed("$ColumnLocation", term_1503);
        sink.start(_M__sTextEmbed);Term term_1619;
        {
          BufferSink buf_1677 = sink.context().makeBuffer();
          buf_1677.start(_M_STRING); buf_1677.literal(1);
          buf_1677.end();
          term_1619 = buf_1677.term();
        } sink.propertyNamed("$LineLocation", term_1619);Term term_1436;
        {
          BufferSink buf_1720 = sink.context().makeBuffer();
          buf_1720.start(_M_STRING); buf_1720.literal(112);
          buf_1720.end();
          term_1436 = buf_1720.term();
        } sink.propertyNamed("$ColumnLocation", term_1436);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_270.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1048;
        {
          BufferSink buf_1235 = sink.context().makeBuffer();
          buf_1235.start(_M_STRING); buf_1235.literal(1);
          buf_1235.end();
          term_1048 = buf_1235.term();
        } sink.propertyNamed("$LineLocation", term_1048);Term term_1545;
        {
          BufferSink buf_827 = sink.context().makeBuffer();
          buf_827.start(_M_STRING); buf_827.literal(113);
          buf_827.end();
          term_1545 = buf_827.term();
        } sink.propertyNamed("$ColumnLocation", term_1545);
        sink.start(_M__sTextCons);Term term_1535;
        {
          BufferSink buf_1115 = sink.context().makeBuffer();
          buf_1115.start(_M_STRING); buf_1115.literal(1);
          buf_1115.end();
          term_1535 = buf_1115.term();
        } sink.propertyNamed("$LineLocation", term_1535);Term term_1399;
        {
          BufferSink buf_759 = sink.context().makeBuffer();
          buf_759.start(_M_STRING); buf_759.literal(113);
          buf_759.end();
          term_1399 = buf_759.term();
        } sink.propertyNamed("$ColumnLocation", term_1399);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1821;
        {
          BufferSink buf_1375 = sink.context().makeBuffer();
          buf_1375.start(_M_STRING); buf_1375.literal(1);
          buf_1375.end();
          term_1821 = buf_1375.term();
        } sink.propertyNamed("$LineLocation", term_1821);Term term_950;
        {
          BufferSink buf_803 = sink.context().makeBuffer();
          buf_803.start(_M_STRING); buf_803.literal(141);
          buf_803.end();
          term_950 = buf_803.term();
        } sink.propertyNamed("$ColumnLocation", term_950);
        sink.start(_M__sTextCons);Term term_1061;
        {
          BufferSink buf_1920 = sink.context().makeBuffer();
          buf_1920.start(_M_STRING); buf_1920.literal(1);
          buf_1920.end();
          term_1061 = buf_1920.term();
        } sink.propertyNamed("$LineLocation", term_1061);Term term_1686;
        {
          BufferSink buf_1673 = sink.context().makeBuffer();
          buf_1673.start(_M_STRING); buf_1673.literal(141);
          buf_1673.end();
          term_1686 = buf_1673.term();
        } sink.propertyNamed("$ColumnLocation", term_1686);
        sink.start(_M__sTextEmbed);Term term_1593;
        {
          BufferSink buf_1458 = sink.context().makeBuffer();
          buf_1458.start(_M_STRING); buf_1458.literal(1);
          buf_1458.end();
          term_1593 = buf_1458.term();
        } sink.propertyNamed("$LineLocation", term_1593);Term term_1292;
        {
          BufferSink buf_1079 = sink.context().makeBuffer();
          buf_1079.start(_M_STRING); buf_1079.literal(141);
          buf_1079.end();
          term_1292 = buf_1079.term();
        } sink.propertyNamed("$ColumnLocation", term_1292);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_60 = sink.context().makeVariable("x_64");
        sink.binds(new Variable[] {var_60});
        sink.start(_M_Crsx_xPrint_xarguments); sink.use(var_60);
        sink.end(); sink.copy(sub_263.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1406;
        {
          BufferSink buf_1383 = sink.context().makeBuffer();
          buf_1383.start(_M_STRING); buf_1383.literal(1);
          buf_1383.end();
          term_1406 = buf_1383.term();
        } sink.propertyNamed("$LineLocation", term_1406);Term term_1788;
        {
          BufferSink buf_1443 = sink.context().makeBuffer();
          buf_1443.start(_M_STRING); buf_1443.literal(191);
          buf_1443.end();
          term_1788 = buf_1443.term();
        } sink.propertyNamed("$ColumnLocation", term_1788);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1683;
        {
          BufferSink buf_1477 = sink.context().makeBuffer();
          buf_1477.start(_M_STRING); buf_1477.literal(1);
          buf_1477.end();
          term_1683 = buf_1477.term();
        } sink.propertyNamed("$LineLocation", term_1683);Term term_1339;
        {
          BufferSink buf_992 = sink.context().makeBuffer();
          buf_992.start(_M_STRING); buf_992.literal(142);
          buf_992.end();
          term_1339 = buf_992.term();
        } sink.propertyNamed("$ColumnLocation", term_1339);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_26: {
        if (term_1547.descriptor() != _M_Crsx_xfreeTerm_xA2)
        {   break label_26;
        }Term sub_465 = term_1547.sub(0).ref();
        /* #1=sub */Term sub_113 = term_1547.sub(1).ref();
        /* #2=sub */Term sub_97 = term_1547.sub(2).ref();
        /* #3=sub */Term sub_281 = term_1547.sub(3).ref();
        /* #4=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1325;
        {
          BufferSink buf_1352 = sink.context().makeBuffer();
          buf_1352.start(_M_STRING); buf_1352.literal(1);
          buf_1352.end();
          term_1325 = buf_1352.term();
        } sink.propertyNamed("$LineLocation", term_1325);Term term_1586;
        {
          BufferSink buf_1467 = sink.context().makeBuffer();
          buf_1467.start(_M_STRING); buf_1467.literal(1);
          buf_1467.end();
          term_1586 = buf_1467.term();
        } sink.propertyNamed("$ColumnLocation", term_1586);
        sink.start(_M__sTextCons);Term term_1239;
        {
          BufferSink buf_1744 = sink.context().makeBuffer();
          buf_1744.start(_M_STRING); buf_1744.literal(1);
          buf_1744.end();
          term_1239 = buf_1744.term();
        } sink.propertyNamed("$LineLocation", term_1239);Term term_1449;
        {
          BufferSink buf_966 = sink.context().makeBuffer(); buf_966.start(_M_STRING); buf_966.literal(1); buf_966.end();
          term_1449 = buf_966.term();
        } sink.propertyNamed("$ColumnLocation", term_1449);
        sink.start(_M__sTextEmbed);Term term_953;
        {
          BufferSink buf_661 = sink.context().makeBuffer(); buf_661.start(_M_STRING); buf_661.literal(1); buf_661.end();
          term_953 = buf_661.term();
        } sink.propertyNamed("$LineLocation", term_953);Term term_861;
        {
          BufferSink buf_1208 = sink.context().makeBuffer();
          buf_1208.start(_M_STRING); buf_1208.literal(1);
          buf_1208.end();
          term_861 = buf_1208.term();
        } sink.propertyNamed("$ColumnLocation", term_861);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_91 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_91});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_91);
        sink.end(); sink.copy(sub_465.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1105;
        {
          BufferSink buf_959 = sink.context().makeBuffer(); buf_959.start(_M_STRING); buf_959.literal(1); buf_959.end();
          term_1105 = buf_959.term();
        } sink.propertyNamed("$LineLocation", term_1105);Term term_1875;
        {
          BufferSink buf_1559 = sink.context().makeBuffer();
          buf_1559.start(_M_STRING); buf_1559.literal(53);
          buf_1559.end();
          term_1875 = buf_1559.term();
        } sink.propertyNamed("$ColumnLocation", term_1875);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_2367;
        {
          BufferSink buf_1073 = sink.context().makeBuffer();
          buf_1073.start(_M_STRING); buf_1073.literal(1);
          buf_1073.end();
          term_2367 = buf_1073.term();
        } sink.propertyNamed("$LineLocation", term_2367);Term term_1760;
        {
          BufferSink buf_1468 = sink.context().makeBuffer();
          buf_1468.start(_M_STRING); buf_1468.literal(2);
          buf_1468.end();
          term_1760 = buf_1468.term();
        } sink.propertyNamed("$ColumnLocation", term_1760);
        sink.start(_M__sTextCons);Term term_1805;
        {
          BufferSink buf_1150 = sink.context().makeBuffer();
          buf_1150.start(_M_STRING); buf_1150.literal(1);
          buf_1150.end();
          term_1805 = buf_1150.term();
        } sink.propertyNamed("$LineLocation", term_1805);Term term_1419;
        {
          BufferSink buf_848 = sink.context().makeBuffer(); buf_848.start(_M_STRING); buf_848.literal(2); buf_848.end();
          term_1419 = buf_848.term();
        } sink.propertyNamed("$ColumnLocation", term_1419);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_973;
        {
          BufferSink buf_1379 = sink.context().makeBuffer();
          buf_1379.start(_M_STRING); buf_1379.literal(1);
          buf_1379.end();
          term_973 = buf_1379.term();
        } sink.propertyNamed("$LineLocation", term_973);Term term_1225;
        {
          BufferSink buf_1132 = sink.context().makeBuffer();
          buf_1132.start(_M_STRING); buf_1132.literal(57);
          buf_1132.end();
          term_1225 = buf_1132.term();
        } sink.propertyNamed("$ColumnLocation", term_1225);
        sink.start(_M__sTextCons);Term term_1313;
        {
          BufferSink buf_1152 = sink.context().makeBuffer();
          buf_1152.start(_M_STRING); buf_1152.literal(1);
          buf_1152.end();
          term_1313 = buf_1152.term();
        } sink.propertyNamed("$LineLocation", term_1313);Term term_1526;
        {
          BufferSink buf_1893 = sink.context().makeBuffer();
          buf_1893.start(_M_STRING); buf_1893.literal(57);
          buf_1893.end();
          term_1526 = buf_1893.term();
        } sink.propertyNamed("$ColumnLocation", term_1526);
        sink.start(_M__sTextEmbed);Term term_1655;
        {
          BufferSink buf_1292 = sink.context().makeBuffer();
          buf_1292.start(_M_STRING); buf_1292.literal(1);
          buf_1292.end();
          term_1655 = buf_1292.term();
        } sink.propertyNamed("$LineLocation", term_1655);Term term_1063;
        {
          BufferSink buf_1661 = sink.context().makeBuffer();
          buf_1661.start(_M_STRING); buf_1661.literal(57);
          buf_1661.end();
          term_1063 = buf_1661.term();
        } sink.propertyNamed("$ColumnLocation", term_1063);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_40 = sink.context().makeVariable("x_75");
        sink.binds(new Variable[] {var_40});
        sink.start(_M_Crsx_xPrint_xproperties); sink.use(var_40);
        sink.end(); sink.copy(sub_113.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1463;
        {
          BufferSink buf_1423 = sink.context().makeBuffer();
          buf_1423.start(_M_STRING); buf_1423.literal(1);
          buf_1423.end();
          term_1463 = buf_1423.term();
        } sink.propertyNamed("$LineLocation", term_1463);Term term_1395;
        {
          BufferSink buf_880 = sink.context().makeBuffer();
          buf_880.start(_M_STRING); buf_880.literal(108);
          buf_880.end();
          term_1395 = buf_880.term();
        } sink.propertyNamed("$ColumnLocation", term_1395);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1274;
        {
          BufferSink buf_1558 = sink.context().makeBuffer();
          buf_1558.start(_M_STRING); buf_1558.literal(1);
          buf_1558.end();
          term_1274 = buf_1558.term();
        } sink.propertyNamed("$LineLocation", term_1274);Term term_1995;
        {
          BufferSink buf_908 = sink.context().makeBuffer();
          buf_908.start(_M_STRING); buf_908.literal(58);
          buf_908.end();
          term_1995 = buf_908.term();
        } sink.propertyNamed("$ColumnLocation", term_1995);
        sink.start(_M__sTextCons);Term term_1372;
        {
          BufferSink buf_1412 = sink.context().makeBuffer();
          buf_1412.start(_M_STRING); buf_1412.literal(1);
          buf_1412.end();
          term_1372 = buf_1412.term();
        } sink.propertyNamed("$LineLocation", term_1372);Term term_1621;
        {
          BufferSink buf_1516 = sink.context().makeBuffer();
          buf_1516.start(_M_STRING); buf_1516.literal(58);
          buf_1516.end();
          term_1621 = buf_1516.term();
        } sink.propertyNamed("$ColumnLocation", term_1621);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1162;
        {
          BufferSink buf_1220 = sink.context().makeBuffer();
          buf_1220.start(_M_STRING); buf_1220.literal(1);
          buf_1220.end();
          term_1162 = buf_1220.term();
        } sink.propertyNamed("$LineLocation", term_1162);Term term_1188;
        {
          BufferSink buf_1823 = sink.context().makeBuffer();
          buf_1823.start(_M_STRING); buf_1823.literal(112);
          buf_1823.end();
          term_1188 = buf_1823.term();
        } sink.propertyNamed("$ColumnLocation", term_1188);
        sink.start(_M__sTextCons);Term term_1218;
        {
          BufferSink buf_1317 = sink.context().makeBuffer();
          buf_1317.start(_M_STRING); buf_1317.literal(1);
          buf_1317.end();
          term_1218 = buf_1317.term();
        } sink.propertyNamed("$LineLocation", term_1218);Term term_2084;
        {
          BufferSink buf_863 = sink.context().makeBuffer();
          buf_863.start(_M_STRING); buf_863.literal(112);
          buf_863.end();
          term_2084 = buf_863.term();
        } sink.propertyNamed("$ColumnLocation", term_2084);
        sink.start(_M__sTextEmbed);Term term_1328;
        {
          BufferSink buf_829 = sink.context().makeBuffer(); buf_829.start(_M_STRING); buf_829.literal(1); buf_829.end();
          term_1328 = buf_829.term();
        } sink.propertyNamed("$LineLocation", term_1328);Term term_1365;
        {
          BufferSink buf_1624 = sink.context().makeBuffer();
          buf_1624.start(_M_STRING); buf_1624.literal(112);
          buf_1624.end();
          term_1365 = buf_1624.term();
        } sink.propertyNamed("$ColumnLocation", term_1365);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_97.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1473;
        {
          BufferSink buf_1533 = sink.context().makeBuffer();
          buf_1533.start(_M_STRING); buf_1533.literal(1);
          buf_1533.end();
          term_1473 = buf_1533.term();
        } sink.propertyNamed("$LineLocation", term_1473);Term term_1854;
        {
          BufferSink buf_1510 = sink.context().makeBuffer();
          buf_1510.start(_M_STRING); buf_1510.literal(113);
          buf_1510.end();
          term_1854 = buf_1510.term();
        } sink.propertyNamed("$ColumnLocation", term_1854);
        sink.start(_M__sTextCons);Term term_1231;
        {
          BufferSink buf_1367 = sink.context().makeBuffer();
          buf_1367.start(_M_STRING); buf_1367.literal(1);
          buf_1367.end();
          term_1231 = buf_1367.term();
        } sink.propertyNamed("$LineLocation", term_1231);Term term_780;
        {
          BufferSink buf_1353 = sink.context().makeBuffer();
          buf_1353.start(_M_STRING); buf_1353.literal(113);
          buf_1353.end();
          term_780 = buf_1353.term();
        } sink.propertyNamed("$ColumnLocation", term_780);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1263;
        {
          BufferSink buf_1362 = sink.context().makeBuffer();
          buf_1362.start(_M_STRING); buf_1362.literal(1);
          buf_1362.end();
          term_1263 = buf_1362.term();
        } sink.propertyNamed("$LineLocation", term_1263);Term term_1394;
        {
          BufferSink buf_1219 = sink.context().makeBuffer();
          buf_1219.start(_M_STRING); buf_1219.literal(141);
          buf_1219.end();
          term_1394 = buf_1219.term();
        } sink.propertyNamed("$ColumnLocation", term_1394);
        sink.start(_M__sTextCons);Term term_961;
        {
          BufferSink buf_1336 = sink.context().makeBuffer();
          buf_1336.start(_M_STRING); buf_1336.literal(1);
          buf_1336.end();
          term_961 = buf_1336.term();
        } sink.propertyNamed("$LineLocation", term_961);Term term_1272;
        {
          BufferSink buf_1215 = sink.context().makeBuffer();
          buf_1215.start(_M_STRING); buf_1215.literal(141);
          buf_1215.end();
          term_1272 = buf_1215.term();
        } sink.propertyNamed("$ColumnLocation", term_1272);
        sink.start(_M__sTextEmbed);Term term_898;
        {
          BufferSink buf_1116 = sink.context().makeBuffer();
          buf_1116.start(_M_STRING); buf_1116.literal(1);
          buf_1116.end();
          term_898 = buf_1116.term();
        } sink.propertyNamed("$LineLocation", term_898);Term term_1691;
        {
          BufferSink buf_1497 = sink.context().makeBuffer();
          buf_1497.start(_M_STRING); buf_1497.literal(141);
          buf_1497.end();
          term_1691 = buf_1497.term();
        } sink.propertyNamed("$ColumnLocation", term_1691);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xterm); sink.copy(sub_281.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1723;
        {
          BufferSink buf_1432 = sink.context().makeBuffer();
          buf_1432.start(_M_STRING); buf_1432.literal(1);
          buf_1432.end();
          term_1723 = buf_1432.term();
        } sink.propertyNamed("$LineLocation", term_1723);Term term_903;
        {
          BufferSink buf_1511 = sink.context().makeBuffer();
          buf_1511.start(_M_STRING); buf_1511.literal(142);
          buf_1511.end();
          term_903 = buf_1511.term();
        } sink.propertyNamed("$ColumnLocation", term_903);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_196: {
        if (term_1547.descriptor() != _M_Crsx_xfreeTerm_xA3)
        {   break label_196;
        }Term sub_11 = term_1547.sub(0).ref();
        /* #1=sub */Term sub_47 = term_1547.sub(1).ref();
        /* #2=sub */Term sub_176 = term_1547.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1137;
        {
          BufferSink buf_1233 = sink.context().makeBuffer();
          buf_1233.start(_M_STRING); buf_1233.literal(1);
          buf_1233.end();
          term_1137 = buf_1233.term();
        } sink.propertyNamed("$LineLocation", term_1137);Term term_901;
        {
          BufferSink buf_1155 = sink.context().makeBuffer();
          buf_1155.start(_M_STRING); buf_1155.literal(1);
          buf_1155.end();
          term_901 = buf_1155.term();
        } sink.propertyNamed("$ColumnLocation", term_901);
        sink.start(_M__sTextCons);Term term_1054;
        {
          BufferSink buf_1457 = sink.context().makeBuffer();
          buf_1457.start(_M_STRING); buf_1457.literal(1);
          buf_1457.end();
          term_1054 = buf_1457.term();
        } sink.propertyNamed("$LineLocation", term_1054);Term term_1718;
        {
          BufferSink buf_1971 = sink.context().makeBuffer();
          buf_1971.start(_M_STRING); buf_1971.literal(1);
          buf_1971.end();
          term_1718 = buf_1971.term();
        } sink.propertyNamed("$ColumnLocation", term_1718);
        sink.start(_M__sTextEmbed);Term term_608;
        {
          BufferSink buf_1254 = sink.context().makeBuffer();
          buf_1254.start(_M_STRING); buf_1254.literal(1);
          buf_1254.end();
          term_608 = buf_1254.term();
        } sink.propertyNamed("$LineLocation", term_608);Term term_1232;
        {
          BufferSink buf_901 = sink.context().makeBuffer(); buf_901.start(_M_STRING); buf_901.literal(1); buf_901.end();
          term_1232 = buf_901.term();
        } sink.propertyNamed("$ColumnLocation", term_1232);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_76 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_76});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_76);
        sink.end(); sink.copy(sub_11.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1107;
        {
          BufferSink buf_1057 = sink.context().makeBuffer();
          buf_1057.start(_M_STRING); buf_1057.literal(1);
          buf_1057.end();
          term_1107 = buf_1057.term();
        } sink.propertyNamed("$LineLocation", term_1107);Term term_1199;
        {
          BufferSink buf_1514 = sink.context().makeBuffer();
          buf_1514.start(_M_STRING); buf_1514.literal(53);
          buf_1514.end();
          term_1199 = buf_1514.term();
        } sink.propertyNamed("$ColumnLocation", term_1199);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1716;
        {
          BufferSink buf_1229 = sink.context().makeBuffer();
          buf_1229.start(_M_STRING); buf_1229.literal(1);
          buf_1229.end();
          term_1716 = buf_1229.term();
        } sink.propertyNamed("$LineLocation", term_1716);Term term_1612;
        {
          BufferSink buf_1125 = sink.context().makeBuffer();
          buf_1125.start(_M_STRING); buf_1125.literal(2);
          buf_1125.end();
          term_1612 = buf_1125.term();
        } sink.propertyNamed("$ColumnLocation", term_1612);
        sink.start(_M__sTextCons);Term term_1149;
        {
          BufferSink buf_1586 = sink.context().makeBuffer();
          buf_1586.start(_M_STRING); buf_1586.literal(1);
          buf_1586.end();
          term_1149 = buf_1586.term();
        } sink.propertyNamed("$LineLocation", term_1149);Term term_1208;
        {
          BufferSink buf_1368 = sink.context().makeBuffer();
          buf_1368.start(_M_STRING); buf_1368.literal(2);
          buf_1368.end();
          term_1208 = buf_1368.term();
        } sink.propertyNamed("$ColumnLocation", term_1208);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1507;
        {
          BufferSink buf_1351 = sink.context().makeBuffer();
          buf_1351.start(_M_STRING); buf_1351.literal(1);
          buf_1351.end();
          term_1507 = buf_1351.term();
        } sink.propertyNamed("$LineLocation", term_1507);Term term_1147;
        {
          BufferSink buf_1216 = sink.context().makeBuffer();
          buf_1216.start(_M_STRING); buf_1216.literal(57);
          buf_1216.end();
          term_1147 = buf_1216.term();
        } sink.propertyNamed("$ColumnLocation", term_1147);
        sink.start(_M__sTextCons);Term term_1667;
        {
          BufferSink buf_1260 = sink.context().makeBuffer();
          buf_1260.start(_M_STRING); buf_1260.literal(1);
          buf_1260.end();
          term_1667 = buf_1260.term();
        } sink.propertyNamed("$LineLocation", term_1667);Term term_2163;
        {
          BufferSink buf_1860 = sink.context().makeBuffer();
          buf_1860.start(_M_STRING); buf_1860.literal(57);
          buf_1860.end();
          term_2163 = buf_1860.term();
        } sink.propertyNamed("$ColumnLocation", term_2163);
        sink.start(_M__sTextEmbed);Term term_1366;
        {
          BufferSink buf_1006 = sink.context().makeBuffer();
          buf_1006.start(_M_STRING); buf_1006.literal(1);
          buf_1006.end();
          term_1366 = buf_1006.term();
        } sink.propertyNamed("$LineLocation", term_1366);Term term_1421;
        {
          BufferSink buf_1610 = sink.context().makeBuffer();
          buf_1610.start(_M_STRING); buf_1610.literal(57);
          buf_1610.end();
          term_1421 = buf_1610.term();
        } sink.propertyNamed("$ColumnLocation", term_1421);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_18 = sink.context().makeVariable("x_39");
        sink.binds(new Variable[] {var_18});
        sink.start(_M_Crsx_xPrint_xproperties); sink.use(var_18);
        sink.end(); sink.copy(sub_47.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1467;
        {
          BufferSink buf_1060 = sink.context().makeBuffer();
          buf_1060.start(_M_STRING); buf_1060.literal(1);
          buf_1060.end();
          term_1467 = buf_1060.term();
        } sink.propertyNamed("$LineLocation", term_1467);Term term_1276;
        {
          BufferSink buf_1016 = sink.context().makeBuffer();
          buf_1016.start(_M_STRING); buf_1016.literal(108);
          buf_1016.end();
          term_1276 = buf_1016.term();
        } sink.propertyNamed("$ColumnLocation", term_1276);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1217;
        {
          BufferSink buf_1633 = sink.context().makeBuffer();
          buf_1633.start(_M_STRING); buf_1633.literal(1);
          buf_1633.end();
          term_1217 = buf_1633.term();
        } sink.propertyNamed("$LineLocation", term_1217);Term term_1317;
        {
          BufferSink buf_1387 = sink.context().makeBuffer();
          buf_1387.start(_M_STRING); buf_1387.literal(58);
          buf_1387.end();
          term_1317 = buf_1387.term();
        } sink.propertyNamed("$ColumnLocation", term_1317);
        sink.start(_M__sTextCons);Term term_1177;
        {
          BufferSink buf_1663 = sink.context().makeBuffer();
          buf_1663.start(_M_STRING); buf_1663.literal(1);
          buf_1663.end();
          term_1177 = buf_1663.term();
        } sink.propertyNamed("$LineLocation", term_1177);Term term_1360;
        {
          BufferSink buf_1191 = sink.context().makeBuffer();
          buf_1191.start(_M_STRING); buf_1191.literal(58);
          buf_1191.end();
          term_1360 = buf_1191.term();
        } sink.propertyNamed("$ColumnLocation", term_1360);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1840;
        {
          BufferSink buf_1130 = sink.context().makeBuffer();
          buf_1130.start(_M_STRING); buf_1130.literal(1);
          buf_1130.end();
          term_1840 = buf_1130.term();
        } sink.propertyNamed("$LineLocation", term_1840);Term term_907;
        {
          BufferSink buf_1369 = sink.context().makeBuffer();
          buf_1369.start(_M_STRING); buf_1369.literal(112);
          buf_1369.end();
          term_907 = buf_1369.term();
        } sink.propertyNamed("$ColumnLocation", term_907);
        sink.start(_M__sTextCons);Term term_1567;
        {
          BufferSink buf_1028 = sink.context().makeBuffer();
          buf_1028.start(_M_STRING); buf_1028.literal(1);
          buf_1028.end();
          term_1567 = buf_1028.term();
        } sink.propertyNamed("$LineLocation", term_1567);Term term_1749;
        {
          BufferSink buf_1221 = sink.context().makeBuffer();
          buf_1221.start(_M_STRING); buf_1221.literal(112);
          buf_1221.end();
          term_1749 = buf_1221.term();
        } sink.propertyNamed("$ColumnLocation", term_1749);
        sink.start(_M__sTextEmbed);Term term_1118;
        {
          BufferSink buf_1372 = sink.context().makeBuffer();
          buf_1372.start(_M_STRING); buf_1372.literal(1);
          buf_1372.end();
          term_1118 = buf_1372.term();
        } sink.propertyNamed("$LineLocation", term_1118);Term term_1428;
        {
          BufferSink buf_1322 = sink.context().makeBuffer();
          buf_1322.start(_M_STRING); buf_1322.literal(112);
          buf_1322.end();
          term_1428 = buf_1322.term();
        } sink.propertyNamed("$ColumnLocation", term_1428);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xliteral); sink.copy(sub_176.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1290;
        {
          BufferSink buf_1114 = sink.context().makeBuffer();
          buf_1114.start(_M_STRING); buf_1114.literal(1);
          buf_1114.end();
          term_1290 = buf_1114.term();
        } sink.propertyNamed("$LineLocation", term_1290);Term term_1135;
        {
          BufferSink buf_1199 = sink.context().makeBuffer();
          buf_1199.start(_M_STRING); buf_1199.literal(113);
          buf_1199.end();
          term_1135 = buf_1199.term();
        } sink.propertyNamed("$ColumnLocation", term_1135);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_465: {
        if (term_1547.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_465;
        }Term sub_324 = term_1547.sub(0).ref();
        /* #1=sub */Term sub_344 = term_1547.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1898;
        {
          BufferSink buf_1669 = sink.context().makeBuffer();
          buf_1669.start(_M_STRING); buf_1669.literal(1);
          buf_1669.end();
          term_1898 = buf_1669.term();
        } sink.propertyNamed("$LineLocation", term_1898);Term term_1342;
        {
          BufferSink buf_1096 = sink.context().makeBuffer();
          buf_1096.start(_M_STRING); buf_1096.literal(1);
          buf_1096.end();
          term_1342 = buf_1096.term();
        } sink.propertyNamed("$ColumnLocation", term_1342);
        sink.start(_M__sTextCons);Term term_1336;
        {
          BufferSink buf_1252 = sink.context().makeBuffer();
          buf_1252.start(_M_STRING); buf_1252.literal(1);
          buf_1252.end();
          term_1336 = buf_1252.term();
        } sink.propertyNamed("$LineLocation", term_1336);Term term_1142;
        {
          BufferSink buf_1747 = sink.context().makeBuffer();
          buf_1747.start(_M_STRING); buf_1747.literal(1);
          buf_1747.end();
          term_1142 = buf_1747.term();
        } sink.propertyNamed("$ColumnLocation", term_1142);
        sink.start(_M__sTextEmbed);Term term_1867;
        {
          BufferSink buf_1299 = sink.context().makeBuffer();
          buf_1299.start(_M_STRING); buf_1299.literal(1);
          buf_1299.end();
          term_1867 = buf_1299.term();
        } sink.propertyNamed("$LineLocation", term_1867);Term term_1346;
        {
          BufferSink buf_1129 = sink.context().makeBuffer();
          buf_1129.start(_M_STRING); buf_1129.literal(1);
          buf_1129.end();
          term_1346 = buf_1129.term();
        } sink.propertyNamed("$ColumnLocation", term_1346);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_81 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_81});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_81);
        sink.end(); sink.copy(sub_324.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1438;
        {
          BufferSink buf_1519 = sink.context().makeBuffer();
          buf_1519.start(_M_STRING); buf_1519.literal(1);
          buf_1519.end();
          term_1438 = buf_1519.term();
        } sink.propertyNamed("$LineLocation", term_1438);Term term_2060;
        {
          BufferSink buf_770 = sink.context().makeBuffer();
          buf_770.start(_M_STRING); buf_770.literal(53);
          buf_770.end();
          term_2060 = buf_770.term();
        } sink.propertyNamed("$ColumnLocation", term_2060);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1021;
        {
          BufferSink buf_1593 = sink.context().makeBuffer();
          buf_1593.start(_M_STRING); buf_1593.literal(1);
          buf_1593.end();
          term_1021 = buf_1593.term();
        } sink.propertyNamed("$LineLocation", term_1021);Term term_1245;
        {
          BufferSink buf_922 = sink.context().makeBuffer(); buf_922.start(_M_STRING); buf_922.literal(2); buf_922.end();
          term_1245 = buf_922.term();
        } sink.propertyNamed("$ColumnLocation", term_1245);
        sink.start(_M__sTextCons);Term term_1506;
        {
          BufferSink buf_1396 = sink.context().makeBuffer();
          buf_1396.start(_M_STRING); buf_1396.literal(1);
          buf_1396.end();
          term_1506 = buf_1396.term();
        } sink.propertyNamed("$LineLocation", term_1506);Term term_1647;
        {
          BufferSink buf_1366 = sink.context().makeBuffer();
          buf_1366.start(_M_STRING); buf_1366.literal(2);
          buf_1366.end();
          term_1647 = buf_1366.term();
        } sink.propertyNamed("$ColumnLocation", term_1647);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1553;
        {
          BufferSink buf_1036 = sink.context().makeBuffer();
          buf_1036.start(_M_STRING); buf_1036.literal(1);
          buf_1036.end();
          term_1553 = buf_1036.term();
        } sink.propertyNamed("$LineLocation", term_1553);Term term_1822;
        {
          BufferSink buf_1242 = sink.context().makeBuffer();
          buf_1242.start(_M_STRING); buf_1242.literal(57);
          buf_1242.end();
          term_1822 = buf_1242.term();
        } sink.propertyNamed("$ColumnLocation", term_1822);
        sink.start(_M__sTextCons);Term term_1049;
        {
          BufferSink buf_1449 = sink.context().makeBuffer();
          buf_1449.start(_M_STRING); buf_1449.literal(1);
          buf_1449.end();
          term_1049 = buf_1449.term();
        } sink.propertyNamed("$LineLocation", term_1049);Term term_1112;
        {
          BufferSink buf_1968 = sink.context().makeBuffer();
          buf_1968.start(_M_STRING); buf_1968.literal(57);
          buf_1968.end();
          term_1112 = buf_1968.term();
        } sink.propertyNamed("$ColumnLocation", term_1112);
        sink.start(_M__sTextEmbed);Term term_812;
        {
          BufferSink buf_1498 = sink.context().makeBuffer();
          buf_1498.start(_M_STRING); buf_1498.literal(1);
          buf_1498.end();
          term_812 = buf_1498.term();
        } sink.propertyNamed("$LineLocation", term_812);Term term_808;
        {
          BufferSink buf_1479 = sink.context().makeBuffer();
          buf_1479.start(_M_STRING); buf_1479.literal(57);
          buf_1479.end();
          term_808 = buf_1479.term();
        } sink.propertyNamed("$ColumnLocation", term_808);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xlist); sink.copy(sub_344.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1825;
        {
          BufferSink buf_1101 = sink.context().makeBuffer();
          buf_1101.start(_M_STRING); buf_1101.literal(1);
          buf_1101.end();
          term_1825 = buf_1101.term();
        } sink.propertyNamed("$LineLocation", term_1825);Term term_1314;
        {
          BufferSink buf_1371 = sink.context().makeBuffer();
          buf_1371.start(_M_STRING); buf_1371.literal(58);
          buf_1371.end();
          term_1314 = buf_1371.term();
        } sink.propertyNamed("$ColumnLocation", term_1314);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_52: {
        if (term_1547.descriptor() != _M_Crsx_xfreeTerm_xA5)
        {   break label_52;
        }Term sub_12 = term_1547.sub(0).ref();
        /* #1=sub */Term sub_174 = term_1547.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1068;
        {
          BufferSink buf_1124 = sink.context().makeBuffer();
          buf_1124.start(_M_STRING); buf_1124.literal(1);
          buf_1124.end();
          term_1068 = buf_1124.term();
        } sink.propertyNamed("$LineLocation", term_1068);Term term_1378;
        {
          BufferSink buf_1512 = sink.context().makeBuffer();
          buf_1512.start(_M_STRING); buf_1512.literal(1);
          buf_1512.end();
          term_1378 = buf_1512.term();
        } sink.propertyNamed("$ColumnLocation", term_1378);
        sink.start(_M__sTextCons);Term term_1961;
        {
          BufferSink buf_1054 = sink.context().makeBuffer();
          buf_1054.start(_M_STRING); buf_1054.literal(1);
          buf_1054.end();
          term_1961 = buf_1054.term();
        } sink.propertyNamed("$LineLocation", term_1961);Term term_589;
        {
          BufferSink buf_1365 = sink.context().makeBuffer();
          buf_1365.start(_M_STRING); buf_1365.literal(1);
          buf_1365.end();
          term_589 = buf_1365.term();
        } sink.propertyNamed("$ColumnLocation", term_589);
        sink.start(_M__sTextEmbed);Term term_1423;
        {
          BufferSink buf_1742 = sink.context().makeBuffer();
          buf_1742.start(_M_STRING); buf_1742.literal(1);
          buf_1742.end();
          term_1423 = buf_1742.term();
        } sink.propertyNamed("$LineLocation", term_1423);Term term_1538;
        {
          BufferSink buf_2085 = sink.context().makeBuffer();
          buf_2085.start(_M_STRING); buf_2085.literal(1);
          buf_2085.end();
          term_1538 = buf_2085.term();
        } sink.propertyNamed("$ColumnLocation", term_1538);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_41 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_41});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_41);
        sink.end(); sink.copy(sub_12.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2113;
        {
          BufferSink buf_1268 = sink.context().makeBuffer();
          buf_1268.start(_M_STRING); buf_1268.literal(1);
          buf_1268.end();
          term_2113 = buf_1268.term();
        } sink.propertyNamed("$LineLocation", term_2113);Term term_1522;
        {
          BufferSink buf_1776 = sink.context().makeBuffer();
          buf_1776.start(_M_STRING); buf_1776.literal(53);
          buf_1776.end();
          term_1522 = buf_1776.term();
        } sink.propertyNamed("$ColumnLocation", term_1522);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1591;
        {
          BufferSink buf_864 = sink.context().makeBuffer(); buf_864.start(_M_STRING); buf_864.literal(1); buf_864.end();
          term_1591 = buf_864.term();
        } sink.propertyNamed("$LineLocation", term_1591);Term term_1331;
        {
          BufferSink buf_1735 = sink.context().makeBuffer();
          buf_1735.start(_M_STRING); buf_1735.literal(2);
          buf_1735.end();
          term_1331 = buf_1735.term();
        } sink.propertyNamed("$ColumnLocation", term_1331);
        sink.start(_M__sTextCons);Term term_1442;
        {
          BufferSink buf_1912 = sink.context().makeBuffer();
          buf_1912.start(_M_STRING); buf_1912.literal(1);
          buf_1912.end();
          term_1442 = buf_1912.term();
        } sink.propertyNamed("$LineLocation", term_1442);Term term_774;
        {
          BufferSink buf_1300 = sink.context().makeBuffer();
          buf_1300.start(_M_STRING); buf_1300.literal(2);
          buf_1300.end();
          term_774 = buf_1300.term();
        } sink.propertyNamed("$ColumnLocation", term_774);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_2264;
        {
          BufferSink buf_2239 = sink.context().makeBuffer();
          buf_2239.start(_M_STRING); buf_2239.literal(1);
          buf_2239.end();
          term_2264 = buf_2239.term();
        } sink.propertyNamed("$LineLocation", term_2264);Term term_1295;
        {
          BufferSink buf_1044 = sink.context().makeBuffer();
          buf_1044.start(_M_STRING); buf_1044.literal(57);
          buf_1044.end();
          term_1295 = buf_1044.term();
        } sink.propertyNamed("$ColumnLocation", term_1295);
        sink.start(_M__sTextCons);Term term_1221;
        {
          BufferSink buf_1433 = sink.context().makeBuffer();
          buf_1433.start(_M_STRING); buf_1433.literal(1);
          buf_1433.end();
          term_1221 = buf_1433.term();
        } sink.propertyNamed("$LineLocation", term_1221);Term term_1674;
        {
          BufferSink buf_1608 = sink.context().makeBuffer();
          buf_1608.start(_M_STRING); buf_1608.literal(57);
          buf_1608.end();
          term_1674 = buf_1608.term();
        } sink.propertyNamed("$ColumnLocation", term_1674);
        sink.start(_M__sTextEmbed);Term term_1543;
        {
          BufferSink buf_1600 = sink.context().makeBuffer();
          buf_1600.start(_M_STRING); buf_1600.literal(1);
          buf_1600.end();
          term_1543 = buf_1600.term();
        } sink.propertyNamed("$LineLocation", term_1543);Term term_1397;
        {
          BufferSink buf_1227 = sink.context().makeBuffer();
          buf_1227.start(_M_STRING); buf_1227.literal(57);
          buf_1227.end();
          term_1397 = buf_1227.term();
        } sink.propertyNamed("$ColumnLocation", term_1397);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xvariable); sink.copy(sub_174.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1349;
        {
          BufferSink buf_1361 = sink.context().makeBuffer();
          buf_1361.start(_M_STRING); buf_1361.literal(1);
          buf_1361.end();
          term_1349 = buf_1361.term();
        } sink.propertyNamed("$LineLocation", term_1349);Term term_2216;
        {
          BufferSink buf_1691 = sink.context().makeBuffer();
          buf_1691.start(_M_STRING); buf_1691.literal(58);
          buf_1691.end();
          term_2216 = buf_1691.term();
        } sink.propertyNamed("$ColumnLocation", term_2216);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_13: {
        if (term_1547.descriptor() != _M_Crsx_xfreeTerm_xA6)
        {   break label_13;
        }Term sub_82 = term_1547.sub(0).ref();
        /* #1=sub */Term sub_22 = term_1547.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1410;
        {
          BufferSink buf_1668 = sink.context().makeBuffer();
          buf_1668.start(_M_STRING); buf_1668.literal(1);
          buf_1668.end();
          term_1410 = buf_1668.term();
        } sink.propertyNamed("$LineLocation", term_1410);Term term_1475;
        {
          BufferSink buf_1256 = sink.context().makeBuffer();
          buf_1256.start(_M_STRING); buf_1256.literal(1);
          buf_1256.end();
          term_1475 = buf_1256.term();
        } sink.propertyNamed("$ColumnLocation", term_1475);
        sink.start(_M__sTextCons);Term term_1609;
        {
          BufferSink buf_1304 = sink.context().makeBuffer();
          buf_1304.start(_M_STRING); buf_1304.literal(1);
          buf_1304.end();
          term_1609 = buf_1304.term();
        } sink.propertyNamed("$LineLocation", term_1609);Term term_1150;
        {
          BufferSink buf_1729 = sink.context().makeBuffer();
          buf_1729.start(_M_STRING); buf_1729.literal(1);
          buf_1729.end();
          term_1150 = buf_1729.term();
        } sink.propertyNamed("$ColumnLocation", term_1150);
        sink.start(_M__sTextEmbed);Term term_1578;
        {
          BufferSink buf_1411 = sink.context().makeBuffer();
          buf_1411.start(_M_STRING); buf_1411.literal(1);
          buf_1411.end();
          term_1578 = buf_1411.term();
        } sink.propertyNamed("$LineLocation", term_1578);Term term_1241;
        {
          BufferSink buf_1195 = sink.context().makeBuffer();
          buf_1195.start(_M_STRING); buf_1195.literal(1);
          buf_1195.end();
          term_1241 = buf_1195.term();
        } sink.propertyNamed("$ColumnLocation", term_1241);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_36 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_36});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_36);
        sink.end(); sink.copy(sub_82.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1269;
        {
          BufferSink buf_1402 = sink.context().makeBuffer();
          buf_1402.start(_M_STRING); buf_1402.literal(1);
          buf_1402.end();
          term_1269 = buf_1402.term();
        } sink.propertyNamed("$LineLocation", term_1269);Term term_1355;
        {
          BufferSink buf_996 = sink.context().makeBuffer();
          buf_996.start(_M_STRING); buf_996.literal(53);
          buf_996.end();
          term_1355 = buf_996.term();
        } sink.propertyNamed("$ColumnLocation", term_1355);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1076;
        {
          BufferSink buf_872 = sink.context().makeBuffer(); buf_872.start(_M_STRING); buf_872.literal(1); buf_872.end();
          term_1076 = buf_872.term();
        } sink.propertyNamed("$LineLocation", term_1076);Term term_1978;
        {
          BufferSink buf_1597 = sink.context().makeBuffer();
          buf_1597.start(_M_STRING); buf_1597.literal(2);
          buf_1597.end();
          term_1978 = buf_1597.term();
        } sink.propertyNamed("$ColumnLocation", term_1978);
        sink.start(_M__sTextCons);Term term_1478;
        {
          BufferSink buf_1463 = sink.context().makeBuffer();
          buf_1463.start(_M_STRING); buf_1463.literal(1);
          buf_1463.end();
          term_1478 = buf_1463.term();
        } sink.propertyNamed("$LineLocation", term_1478);Term term_1499;
        {
          BufferSink buf_1330 = sink.context().makeBuffer();
          buf_1330.start(_M_STRING); buf_1330.literal(2);
          buf_1330.end();
          term_1499 = buf_1330.term();
        } sink.propertyNamed("$ColumnLocation", term_1499);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1083;
        {
          BufferSink buf_1730 = sink.context().makeBuffer();
          buf_1730.start(_M_STRING); buf_1730.literal(1);
          buf_1730.end();
          term_1083 = buf_1730.term();
        } sink.propertyNamed("$LineLocation", term_1083);Term term_1551;
        {
          BufferSink buf_1507 = sink.context().makeBuffer();
          buf_1507.start(_M_STRING); buf_1507.literal(57);
          buf_1507.end();
          term_1551 = buf_1507.term();
        } sink.propertyNamed("$ColumnLocation", term_1551);
        sink.start(_M__sTextCons);Term term_1641;
        {
          BufferSink buf_2075 = sink.context().makeBuffer();
          buf_2075.start(_M_STRING); buf_2075.literal(1);
          buf_2075.end();
          term_1641 = buf_2075.term();
        } sink.propertyNamed("$LineLocation", term_1641);Term term_1604;
        {
          BufferSink buf_990 = sink.context().makeBuffer();
          buf_990.start(_M_STRING); buf_990.literal(57);
          buf_990.end();
          term_1604 = buf_990.term();
        } sink.propertyNamed("$ColumnLocation", term_1604);
        sink.start(_M__sTextEmbed);Term term_1189;
        {
          BufferSink buf_1210 = sink.context().makeBuffer();
          buf_1210.start(_M_STRING); buf_1210.literal(1);
          buf_1210.end();
          term_1189 = buf_1210.term();
        } sink.propertyNamed("$LineLocation", term_1189);Term term_1301;
        {
          BufferSink buf_1714 = sink.context().makeBuffer();
          buf_1714.start(_M_STRING); buf_1714.literal(57);
          buf_1714.end();
          term_1301 = buf_1714.term();
        } sink.propertyNamed("$ColumnLocation", term_1301);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xproperties); sink.copy(sub_22.ref());
        sink.end();
        sink.end();
        sink.end();Term term_916;
        {
          BufferSink buf_1602 = sink.context().makeBuffer();
          buf_1602.start(_M_STRING); buf_1602.literal(1);
          buf_1602.end();
          term_916 = buf_1602.term();
        } sink.propertyNamed("$LineLocation", term_916);Term term_1357;
        {
          BufferSink buf_1765 = sink.context().makeBuffer();
          buf_1765.start(_M_STRING); buf_1765.literal(58);
          buf_1765.end();
          term_1357 = buf_1765.term();
        } sink.propertyNamed("$ColumnLocation", term_1357);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_120: {
        if (term_1547.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_120;
        }Term sub_295 = term_1547.sub(0).ref();
        /* #1=sub */Term sub_360 = term_1547.sub(1).ref();
        /* #2=sub */Term sub_377 = term_1547.sub(2).ref();
        /* #3=sub */Term sub_190 = term_1547.sub(3).ref();
        /* #4=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1080;
        {
          BufferSink buf_1563 = sink.context().makeBuffer();
          buf_1563.start(_M_STRING); buf_1563.literal(1);
          buf_1563.end();
          term_1080 = buf_1563.term();
        } sink.propertyNamed("$LineLocation", term_1080);Term term_2031;
        {
          BufferSink buf_1667 = sink.context().makeBuffer();
          buf_1667.start(_M_STRING); buf_1667.literal(1);
          buf_1667.end();
          term_2031 = buf_1667.term();
        } sink.propertyNamed("$ColumnLocation", term_2031);
        sink.start(_M__sTextCons);Term term_1565;
        {
          BufferSink buf_1517 = sink.context().makeBuffer();
          buf_1517.start(_M_STRING); buf_1517.literal(1);
          buf_1517.end();
          term_1565 = buf_1517.term();
        } sink.propertyNamed("$LineLocation", term_1565);Term term_965;
        {
          BufferSink buf_1275 = sink.context().makeBuffer();
          buf_1275.start(_M_STRING); buf_1275.literal(1);
          buf_1275.end();
          term_965 = buf_1275.term();
        } sink.propertyNamed("$ColumnLocation", term_965);
        sink.start(_M__sTextEmbed);Term term_1411;
        {
          BufferSink buf_1049 = sink.context().makeBuffer();
          buf_1049.start(_M_STRING); buf_1049.literal(1);
          buf_1049.end();
          term_1411 = buf_1049.term();
        } sink.propertyNamed("$LineLocation", term_1411);Term term_1987;
        {
          BufferSink buf_883 = sink.context().makeBuffer(); buf_883.start(_M_STRING); buf_883.literal(1); buf_883.end();
          term_1987 = buf_883.term();
        } sink.propertyNamed("$ColumnLocation", term_1987);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_38 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_38});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_38);
        sink.end(); sink.copy(sub_295.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1248;
        {
          BufferSink buf_1681 = sink.context().makeBuffer();
          buf_1681.start(_M_STRING); buf_1681.literal(1);
          buf_1681.end();
          term_1248 = buf_1681.term();
        } sink.propertyNamed("$LineLocation", term_1248);Term term_1038;
        {
          BufferSink buf_1082 = sink.context().makeBuffer();
          buf_1082.start(_M_STRING); buf_1082.literal(53);
          buf_1082.end();
          term_1038 = buf_1082.term();
        } sink.propertyNamed("$ColumnLocation", term_1038);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1430;
        {
          BufferSink buf_1480 = sink.context().makeBuffer();
          buf_1480.start(_M_STRING); buf_1480.literal(1);
          buf_1480.end();
          term_1430 = buf_1480.term();
        } sink.propertyNamed("$LineLocation", term_1430);Term term_1598;
        {
          BufferSink buf_2125 = sink.context().makeBuffer();
          buf_2125.start(_M_STRING); buf_2125.literal(2);
          buf_2125.end();
          term_1598 = buf_2125.term();
        } sink.propertyNamed("$ColumnLocation", term_1598);
        sink.start(_M__sTextCons);Term term_1743;
        {
          BufferSink buf_956 = sink.context().makeBuffer(); buf_956.start(_M_STRING); buf_956.literal(1); buf_956.end();
          term_1743 = buf_956.term();
        } sink.propertyNamed("$LineLocation", term_1743);Term term_1116;
        {
          BufferSink buf_1273 = sink.context().makeBuffer();
          buf_1273.start(_M_STRING); buf_1273.literal(2);
          buf_1273.end();
          term_1116 = buf_1273.term();
        } sink.propertyNamed("$ColumnLocation", term_1116);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1757;
        {
          BufferSink buf_1416 = sink.context().makeBuffer();
          buf_1416.start(_M_STRING); buf_1416.literal(1);
          buf_1416.end();
          term_1757 = buf_1416.term();
        } sink.propertyNamed("$LineLocation", term_1757);Term term_1201;
        {
          BufferSink buf_1168 = sink.context().makeBuffer();
          buf_1168.start(_M_STRING); buf_1168.literal(57);
          buf_1168.end();
          term_1201 = buf_1168.term();
        } sink.propertyNamed("$ColumnLocation", term_1201);
        sink.start(_M__sTextCons);Term term_1418;
        {
          BufferSink buf_738 = sink.context().makeBuffer(); buf_738.start(_M_STRING); buf_738.literal(1); buf_738.end();
          term_1418 = buf_738.term();
        } sink.propertyNamed("$LineLocation", term_1418);Term term_1520;
        {
          BufferSink buf_1340 = sink.context().makeBuffer();
          buf_1340.start(_M_STRING); buf_1340.literal(57);
          buf_1340.end();
          term_1520 = buf_1340.term();
        } sink.propertyNamed("$ColumnLocation", term_1520);
        sink.start(_M__sTextEmbed);Term term_1443;
        {
          BufferSink buf_1103 = sink.context().makeBuffer();
          buf_1103.start(_M_STRING); buf_1103.literal(1);
          buf_1103.end();
          term_1443 = buf_1103.term();
        } sink.propertyNamed("$LineLocation", term_1443);Term term_1405;
        {
          BufferSink buf_1058 = sink.context().makeBuffer();
          buf_1058.start(_M_STRING); buf_1058.literal(57);
          buf_1058.end();
          term_1405 = buf_1058.term();
        } sink.propertyNamed("$ColumnLocation", term_1405);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_33 = sink.context().makeVariable("x_24");
        sink.binds(new Variable[] {var_33});
        sink.start(_M_Crsx_xPrint_xproperties); sink.use(var_33);
        sink.end(); sink.copy(sub_360.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1435;
        {
          BufferSink buf_1355 = sink.context().makeBuffer();
          buf_1355.start(_M_STRING); buf_1355.literal(1);
          buf_1355.end();
          term_1435 = buf_1355.term();
        } sink.propertyNamed("$LineLocation", term_1435);Term term_1680;
        {
          BufferSink buf_1907 = sink.context().makeBuffer();
          buf_1907.start(_M_STRING); buf_1907.literal(108);
          buf_1907.end();
          term_1680 = buf_1907.term();
        } sink.propertyNamed("$ColumnLocation", term_1680);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1561;
        {
          BufferSink buf_2010 = sink.context().makeBuffer();
          buf_2010.start(_M_STRING); buf_2010.literal(1);
          buf_2010.end();
          term_1561 = buf_2010.term();
        } sink.propertyNamed("$LineLocation", term_1561);Term term_2312;
        {
          BufferSink buf_1614 = sink.context().makeBuffer();
          buf_1614.start(_M_STRING); buf_1614.literal(58);
          buf_1614.end();
          term_2312 = buf_1614.term();
        } sink.propertyNamed("$ColumnLocation", term_2312);
        sink.start(_M__sTextCons);Term term_1888;
        {
          BufferSink buf_2086 = sink.context().makeBuffer();
          buf_2086.start(_M_STRING); buf_2086.literal(1);
          buf_2086.end();
          term_1888 = buf_2086.term();
        } sink.propertyNamed("$LineLocation", term_1888);Term term_1889;
        {
          BufferSink buf_1713 = sink.context().makeBuffer();
          buf_1713.start(_M_STRING); buf_1713.literal(58);
          buf_1713.end();
          term_1889 = buf_1713.term();
        } sink.propertyNamed("$ColumnLocation", term_1889);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1114;
        {
          BufferSink buf_1770 = sink.context().makeBuffer();
          buf_1770.start(_M_STRING); buf_1770.literal(1);
          buf_1770.end();
          term_1114 = buf_1770.term();
        } sink.propertyNamed("$LineLocation", term_1114);Term term_1013;
        {
          BufferSink buf_1441 = sink.context().makeBuffer();
          buf_1441.start(_M_STRING); buf_1441.literal(112);
          buf_1441.end();
          term_1013 = buf_1441.term();
        } sink.propertyNamed("$ColumnLocation", term_1013);
        sink.start(_M__sTextCons);Term term_1601;
        {
          BufferSink buf_1644 = sink.context().makeBuffer();
          buf_1644.start(_M_STRING); buf_1644.literal(1);
          buf_1644.end();
          term_1601 = buf_1644.term();
        } sink.propertyNamed("$LineLocation", term_1601);Term term_1286;
        {
          BufferSink buf_1349 = sink.context().makeBuffer();
          buf_1349.start(_M_STRING); buf_1349.literal(113);
          buf_1349.end();
          term_1286 = buf_1349.term();
        } sink.propertyNamed("$ColumnLocation", term_1286);
        sink.start(_M__sTextChars); sink.copy(sub_377.ref());
        sink.end();Term term_1970;
        {
          BufferSink buf_1538 = sink.context().makeBuffer();
          buf_1538.start(_M_STRING); buf_1538.literal(1);
          buf_1538.end();
          term_1970 = buf_1538.term();
        } sink.propertyNamed("$LineLocation", term_1970);Term term_1864;
        {
          BufferSink buf_1193 = sink.context().makeBuffer();
          buf_1193.start(_M_STRING); buf_1193.literal(114);
          buf_1193.end();
          term_1864 = buf_1193.term();
        } sink.propertyNamed("$ColumnLocation", term_1864);
        sink.start(_M__sTextCons);Term term_1850;
        {
          BufferSink buf_1329 = sink.context().makeBuffer();
          buf_1329.start(_M_STRING); buf_1329.literal(1);
          buf_1329.end();
          term_1850 = buf_1329.term();
        } sink.propertyNamed("$LineLocation", term_1850);Term term_1868;
        {
          BufferSink buf_1270 = sink.context().makeBuffer();
          buf_1270.start(_M_STRING); buf_1270.literal(114);
          buf_1270.end();
          term_1868 = buf_1270.term();
        } sink.propertyNamed("$ColumnLocation", term_1868);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1015;
        {
          BufferSink buf_1513 = sink.context().makeBuffer();
          buf_1513.start(_M_STRING); buf_1513.literal(1);
          buf_1513.end();
          term_1015 = buf_1513.term();
        } sink.propertyNamed("$LineLocation", term_1015);Term term_1778;
        {
          BufferSink buf_1612 = sink.context().makeBuffer();
          buf_1612.start(_M_STRING); buf_1612.literal(118);
          buf_1612.end();
          term_1778 = buf_1612.term();
        } sink.propertyNamed("$ColumnLocation", term_1778);
        sink.start(_M__sTextCons);Term term_1772;
        {
          BufferSink buf_1694 = sink.context().makeBuffer();
          buf_1694.start(_M_STRING); buf_1694.literal(1);
          buf_1694.end();
          term_1772 = buf_1694.term();
        } sink.propertyNamed("$LineLocation", term_1772);Term term_1679;
        {
          BufferSink buf_973 = sink.context().makeBuffer();
          buf_973.start(_M_STRING); buf_973.literal(118);
          buf_973.end();
          term_1679 = buf_973.term();
        } sink.propertyNamed("$ColumnLocation", term_1679);
        sink.start(_M__sTextEmbed);Term term_1523;
        {
          BufferSink buf_1749 = sink.context().makeBuffer();
          buf_1749.start(_M_STRING); buf_1749.literal(1);
          buf_1749.end();
          term_1523 = buf_1749.term();
        } sink.propertyNamed("$LineLocation", term_1523);Term term_2108;
        {
          BufferSink buf_982 = sink.context().makeBuffer();
          buf_982.start(_M_STRING); buf_982.literal(118);
          buf_982.end();
          term_2108 = buf_982.term();
        } sink.propertyNamed("$ColumnLocation", term_2108);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_135 = sink.context().makeVariable("x_23");
        sink.binds(new Variable[] {var_135});
        sink.start(_M_Crsx_xPrint_xfreeArguments); sink.use(var_135);
        sink.end(); sink.copy(sub_190.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1706;
        {
          BufferSink buf_1023 = sink.context().makeBuffer();
          buf_1023.start(_M_STRING); buf_1023.literal(1);
          buf_1023.end();
          term_1706 = buf_1023.term();
        } sink.propertyNamed("$LineLocation", term_1706);Term term_1492;
        {
          BufferSink buf_1683 = sink.context().makeBuffer();
          buf_1683.start(_M_STRING); buf_1683.literal(172);
          buf_1683.end();
          term_1492 = buf_1683.term();
        } sink.propertyNamed("$ColumnLocation", term_1492);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_2105;
        {
          BufferSink buf_1393 = sink.context().makeBuffer();
          buf_1393.start(_M_STRING); buf_1393.literal(1);
          buf_1393.end();
          term_2105 = buf_1393.term();
        } sink.propertyNamed("$LineLocation", term_2105);Term term_1170;
        {
          BufferSink buf_1414 = sink.context().makeBuffer();
          buf_1414.start(_M_STRING); buf_1414.literal(119);
          buf_1414.end();
          term_1170 = buf_1414.term();
        } sink.propertyNamed("$ColumnLocation", term_1170);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_19: {
        if (term_1547.descriptor() != _M_Crsx_xfreeTerm_xA8)
        {   break label_19;
        }Term sub_148 = term_1547.sub(0).ref();
        /* #1=sub */Term sub_236 = term_1547.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1097;
        {
          BufferSink buf_1532 = sink.context().makeBuffer();
          buf_1532.start(_M_STRING); buf_1532.literal(1);
          buf_1532.end();
          term_1097 = buf_1532.term();
        } sink.propertyNamed("$LineLocation", term_1097);Term term_1384;
        {
          BufferSink buf_1531 = sink.context().makeBuffer();
          buf_1531.start(_M_STRING); buf_1531.literal(1);
          buf_1531.end();
          term_1384 = buf_1531.term();
        } sink.propertyNamed("$ColumnLocation", term_1384);
        sink.start(_M__sTextCons);Term term_1271;
        {
          BufferSink buf_1599 = sink.context().makeBuffer();
          buf_1599.start(_M_STRING); buf_1599.literal(1);
          buf_1599.end();
          term_1271 = buf_1599.term();
        } sink.propertyNamed("$LineLocation", term_1271);Term term_1005;
        {
          BufferSink buf_1649 = sink.context().makeBuffer();
          buf_1649.start(_M_STRING); buf_1649.literal(1);
          buf_1649.end();
          term_1005 = buf_1649.term();
        } sink.propertyNamed("$ColumnLocation", term_1005);
        sink.start(_M__sTextEmbed);Term term_1815;
        {
          BufferSink buf_1325 = sink.context().makeBuffer();
          buf_1325.start(_M_STRING); buf_1325.literal(1);
          buf_1325.end();
          term_1815 = buf_1325.term();
        } sink.propertyNamed("$LineLocation", term_1815);Term term_1758;
        {
          BufferSink buf_2523 = sink.context().makeBuffer();
          buf_2523.start(_M_STRING); buf_2523.literal(1);
          buf_2523.end();
          term_1758 = buf_2523.term();
        } sink.propertyNamed("$ColumnLocation", term_1758);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_44 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_44});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_44);
        sink.end(); sink.copy(sub_148.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1754;
        {
          BufferSink buf_831 = sink.context().makeBuffer(); buf_831.start(_M_STRING); buf_831.literal(1); buf_831.end();
          term_1754 = buf_831.term();
        } sink.propertyNamed("$LineLocation", term_1754);Term term_1289;
        {
          BufferSink buf_773 = sink.context().makeBuffer();
          buf_773.start(_M_STRING); buf_773.literal(53);
          buf_773.end();
          term_1289 = buf_773.term();
        } sink.propertyNamed("$ColumnLocation", term_1289);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1949;
        {
          BufferSink buf_1779 = sink.context().makeBuffer();
          buf_1779.start(_M_STRING); buf_1779.literal(1);
          buf_1779.end();
          term_1949 = buf_1779.term();
        } sink.propertyNamed("$LineLocation", term_1949);Term term_2356;
        {
          BufferSink buf_1505 = sink.context().makeBuffer();
          buf_1505.start(_M_STRING); buf_1505.literal(2);
          buf_1505.end();
          term_2356 = buf_1505.term();
        } sink.propertyNamed("$ColumnLocation", term_2356);
        sink.start(_M__sTextCons);Term term_1374;
        {
          BufferSink buf_2071 = sink.context().makeBuffer();
          buf_2071.start(_M_STRING); buf_2071.literal(1);
          buf_2071.end();
          term_1374 = buf_2071.term();
        } sink.propertyNamed("$LineLocation", term_1374);Term term_1138;
        {
          BufferSink buf_2060 = sink.context().makeBuffer();
          buf_2060.start(_M_STRING); buf_2060.literal(2);
          buf_2060.end();
          term_1138 = buf_2060.term();
        } sink.propertyNamed("$ColumnLocation", term_1138);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1564;
        {
          BufferSink buf_1061 = sink.context().makeBuffer();
          buf_1061.start(_M_STRING); buf_1061.literal(1);
          buf_1061.end();
          term_1564 = buf_1061.term();
        } sink.propertyNamed("$LineLocation", term_1564);Term term_2082;
        {
          BufferSink buf_1448 = sink.context().makeBuffer();
          buf_1448.start(_M_STRING); buf_1448.literal(57);
          buf_1448.end();
          term_2082 = buf_1448.term();
        } sink.propertyNamed("$ColumnLocation", term_2082);
        sink.start(_M__sTextCons);Term term_1844;
        {
          BufferSink buf_1334 = sink.context().makeBuffer();
          buf_1334.start(_M_STRING); buf_1334.literal(1);
          buf_1334.end();
          term_1844 = buf_1334.term();
        } sink.propertyNamed("$LineLocation", term_1844);Term term_1250;
        {
          BufferSink buf_1092 = sink.context().makeBuffer();
          buf_1092.start(_M_STRING); buf_1092.literal(57);
          buf_1092.end();
          term_1250 = buf_1092.term();
        } sink.propertyNamed("$ColumnLocation", term_1250);
        sink.start(_M__sTextEmbed);Term term_1566;
        {
          BufferSink buf_1594 = sink.context().makeBuffer();
          buf_1594.start(_M_STRING); buf_1594.literal(1);
          buf_1594.end();
          term_1566 = buf_1594.term();
        } sink.propertyNamed("$LineLocation", term_1566);Term term_2029;
        {
          BufferSink buf_1245 = sink.context().makeBuffer();
          buf_1245.start(_M_STRING); buf_1245.literal(57);
          buf_1245.end();
          term_2029 = buf_1245.term();
        } sink.propertyNamed("$ColumnLocation", term_2029);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconcrete); sink.copy(sub_236.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1576;
        {
          BufferSink buf_1989 = sink.context().makeBuffer();
          buf_1989.start(_M_STRING); buf_1989.literal(1);
          buf_1989.end();
          term_1576 = buf_1989.term();
        } sink.propertyNamed("$LineLocation", term_1576);Term term_2129;
        {
          BufferSink buf_1040 = sink.context().makeBuffer();
          buf_1040.start(_M_STRING); buf_1040.literal(58);
          buf_1040.end();
          term_2129 = buf_1040.term();
        } sink.propertyNamed("$ColumnLocation", term_2129);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_252: {
        if (term_1547.descriptor() != _M_Crsx_xfreeTerm_xA9)
        {   break label_252;
        }Term sub_188 = term_1547.sub(0).ref();
        /* #1=sub */Term sub_300 = term_1547.sub(1).ref();
        /* #2=sub */Term sub_293 = term_1547.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1646;
        {
          BufferSink buf_1535 = sink.context().makeBuffer();
          buf_1535.start(_M_STRING); buf_1535.literal(1);
          buf_1535.end();
          term_1646 = buf_1535.term();
        } sink.propertyNamed("$LineLocation", term_1646);Term term_1673;
        {
          BufferSink buf_1858 = sink.context().makeBuffer();
          buf_1858.start(_M_STRING); buf_1858.literal(1);
          buf_1858.end();
          term_1673 = buf_1858.term();
        } sink.propertyNamed("$ColumnLocation", term_1673);
        sink.start(_M__sTextCons);Term term_1494;
        {
          BufferSink buf_1431 = sink.context().makeBuffer();
          buf_1431.start(_M_STRING); buf_1431.literal(1);
          buf_1431.end();
          term_1494 = buf_1431.term();
        } sink.propertyNamed("$LineLocation", term_1494);Term term_1516;
        {
          BufferSink buf_1625 = sink.context().makeBuffer();
          buf_1625.start(_M_STRING); buf_1625.literal(1);
          buf_1625.end();
          term_1516 = buf_1625.term();
        } sink.propertyNamed("$ColumnLocation", term_1516);
        sink.start(_M__sTextEmbed);Term term_1284;
        {
          BufferSink buf_1302 = sink.context().makeBuffer();
          buf_1302.start(_M_STRING); buf_1302.literal(1);
          buf_1302.end();
          term_1284 = buf_1302.term();
        } sink.propertyNamed("$LineLocation", term_1284);Term term_1720;
        {
          BufferSink buf_997 = sink.context().makeBuffer(); buf_997.start(_M_STRING); buf_997.literal(1); buf_997.end();
          term_1720 = buf_997.term();
        } sink.propertyNamed("$ColumnLocation", term_1720);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_34 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_34});
        sink.start(_M_Crsx_xPrint_xannotations); sink.use(var_34);
        sink.end(); sink.copy(sub_188.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2149;
        {
          BufferSink buf_1642 = sink.context().makeBuffer();
          buf_1642.start(_M_STRING); buf_1642.literal(1);
          buf_1642.end();
          term_2149 = buf_1642.term();
        } sink.propertyNamed("$LineLocation", term_2149);Term term_1128;
        {
          BufferSink buf_1228 = sink.context().makeBuffer();
          buf_1228.start(_M_STRING); buf_1228.literal(53);
          buf_1228.end();
          term_1128 = buf_1228.term();
        } sink.propertyNamed("$ColumnLocation", term_1128);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_2184;
        {
          BufferSink buf_1434 = sink.context().makeBuffer();
          buf_1434.start(_M_STRING); buf_1434.literal(1);
          buf_1434.end();
          term_2184 = buf_1434.term();
        } sink.propertyNamed("$LineLocation", term_2184);Term term_1610;
        {
          BufferSink buf_1145 = sink.context().makeBuffer();
          buf_1145.start(_M_STRING); buf_1145.literal(2);
          buf_1145.end();
          term_1610 = buf_1145.term();
        } sink.propertyNamed("$ColumnLocation", term_1610);
        sink.start(_M__sTextCons);Term term_1480;
        {
          BufferSink buf_1064 = sink.context().makeBuffer();
          buf_1064.start(_M_STRING); buf_1064.literal(1);
          buf_1064.end();
          term_1480 = buf_1064.term();
        } sink.propertyNamed("$LineLocation", term_1480);Term term_1903;
        {
          BufferSink buf_909 = sink.context().makeBuffer(); buf_909.start(_M_STRING); buf_909.literal(2); buf_909.end();
          term_1903 = buf_909.term();
        } sink.propertyNamed("$ColumnLocation", term_1903);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1966;
        {
          BufferSink buf_1548 = sink.context().makeBuffer();
          buf_1548.start(_M_STRING); buf_1548.literal(1);
          buf_1548.end();
          term_1966 = buf_1548.term();
        } sink.propertyNamed("$LineLocation", term_1966);Term term_938;
        {
          BufferSink buf_1830 = sink.context().makeBuffer();
          buf_1830.start(_M_STRING); buf_1830.literal(57);
          buf_1830.end();
          term_938 = buf_1830.term();
        } sink.propertyNamed("$ColumnLocation", term_938);
        sink.start(_M__sTextCons);Term term_1592;
        {
          BufferSink buf_1453 = sink.context().makeBuffer();
          buf_1453.start(_M_STRING); buf_1453.literal(1);
          buf_1453.end();
          term_1592 = buf_1453.term();
        } sink.propertyNamed("$LineLocation", term_1592);Term term_1649;
        {
          BufferSink buf_1430 = sink.context().makeBuffer();
          buf_1430.start(_M_STRING); buf_1430.literal(57);
          buf_1430.end();
          term_1649 = buf_1430.term();
        } sink.propertyNamed("$ColumnLocation", term_1649);
        sink.start(_M__sTextEmbed);Term term_1590;
        {
          BufferSink buf_1438 = sink.context().makeBuffer();
          buf_1438.start(_M_STRING); buf_1438.literal(1);
          buf_1438.end();
          term_1590 = buf_1438.term();
        } sink.propertyNamed("$LineLocation", term_1590);Term term_1774;
        {
          BufferSink buf_1487 = sink.context().makeBuffer();
          buf_1487.start(_M_STRING); buf_1487.literal(57);
          buf_1487.end();
          term_1774 = buf_1487.term();
        } sink.propertyNamed("$ColumnLocation", term_1774);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_0 = sink.context().makeVariable("x_28");
        sink.binds(new Variable[] {var_0});
        sink.start(_M_Crsx_xPrint_xproperties); sink.use(var_0);
        sink.end(); sink.copy(sub_300.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_580;
        {
          BufferSink buf_1341 = sink.context().makeBuffer();
          buf_1341.start(_M_STRING); buf_1341.literal(1);
          buf_1341.end();
          term_580 = buf_1341.term();
        } sink.propertyNamed("$LineLocation", term_580);Term term_2067;
        {
          BufferSink buf_1350 = sink.context().makeBuffer();
          buf_1350.start(_M_STRING); buf_1350.literal(108);
          buf_1350.end();
          term_2067 = buf_1350.term();
        } sink.propertyNamed("$ColumnLocation", term_2067);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1489;
        {
          BufferSink buf_1565 = sink.context().makeBuffer();
          buf_1565.start(_M_STRING); buf_1565.literal(1);
          buf_1565.end();
          term_1489 = buf_1565.term();
        } sink.propertyNamed("$LineLocation", term_1489);Term term_1734;
        {
          BufferSink buf_1207 = sink.context().makeBuffer();
          buf_1207.start(_M_STRING); buf_1207.literal(58);
          buf_1207.end();
          term_1734 = buf_1207.term();
        } sink.propertyNamed("$ColumnLocation", term_1734);
        sink.start(_M__sTextCons);Term term_1562;
        {
          BufferSink buf_1868 = sink.context().makeBuffer();
          buf_1868.start(_M_STRING); buf_1868.literal(1);
          buf_1868.end();
          term_1562 = buf_1868.term();
        } sink.propertyNamed("$LineLocation", term_1562);Term term_1563;
        {
          BufferSink buf_1588 = sink.context().makeBuffer();
          buf_1588.start(_M_STRING); buf_1588.literal(58);
          buf_1588.end();
          term_1563 = buf_1588.term();
        } sink.propertyNamed("$ColumnLocation", term_1563);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1486;
        {
          BufferSink buf_1476 = sink.context().makeBuffer();
          buf_1476.start(_M_STRING); buf_1476.literal(1);
          buf_1476.end();
          term_1486 = buf_1476.term();
        } sink.propertyNamed("$LineLocation", term_1486);Term term_1605;
        {
          BufferSink buf_1992 = sink.context().makeBuffer();
          buf_1992.start(_M_STRING); buf_1992.literal(112);
          buf_1992.end();
          term_1605 = buf_1992.term();
        } sink.propertyNamed("$ColumnLocation", term_1605);
        sink.start(_M__sTextCons);Term term_1505;
        {
          BufferSink buf_1587 = sink.context().makeBuffer();
          buf_1587.start(_M_STRING); buf_1587.literal(1);
          buf_1587.end();
          term_1505 = buf_1587.term();
        } sink.propertyNamed("$LineLocation", term_1505);Term term_1226;
        {
          BufferSink buf_1529 = sink.context().makeBuffer();
          buf_1529.start(_M_STRING); buf_1529.literal(112);
          buf_1529.end();
          term_1226 = buf_1529.term();
        } sink.propertyNamed("$ColumnLocation", term_1226);
        sink.start(_M__sTextEmbed);Term term_1511;
        {
          BufferSink buf_1796 = sink.context().makeBuffer();
          buf_1796.start(_M_STRING); buf_1796.literal(1);
          buf_1796.end();
          term_1511 = buf_1796.term();
        } sink.propertyNamed("$LineLocation", term_1511);Term term_1624;
        {
          BufferSink buf_1167 = sink.context().makeBuffer();
          buf_1167.start(_M_STRING); buf_1167.literal(112);
          buf_1167.end();
          term_1624 = buf_1167.term();
        } sink.propertyNamed("$ColumnLocation", term_1624);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xexpression); sink.copy(sub_293.ref());
        sink.end();
        sink.end();
        sink.end();Term term_935;
        {
          BufferSink buf_1865 = sink.context().makeBuffer();
          buf_1865.start(_M_STRING); buf_1865.literal(1);
          buf_1865.end();
          term_935 = buf_1865.term();
        } sink.propertyNamed("$LineLocation", term_935);Term term_1777;
        {
          BufferSink buf_1394 = sink.context().makeBuffer();
          buf_1394.start(_M_STRING); buf_1394.literal(113);
          buf_1394.end();
          term_1777 = buf_1394.term();
        } sink.propertyNamed("$ColumnLocation", term_1777);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xfreeTerm, term_1547);
  } final public static boolean _M_Crsx_xPrint_xterm(Sink sink, int shared, int depth, Term term_1588) {
    if (depth < 2000) {
      label_9: {
        if (term_1588.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_9;
        }Term sub_76 = term_1588.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1260;
        {
          BufferSink buf_1834 = sink.context().makeBuffer();
          buf_1834.start(_M_STRING); buf_1834.literal(1);
          buf_1834.end();
          term_1260 = buf_1834.term();
        } sink.propertyNamed("$LineLocation", term_1260);Term term_1414;
        {
          BufferSink buf_1495 = sink.context().makeBuffer();
          buf_1495.start(_M_STRING); buf_1495.literal(1);
          buf_1495.end();
          term_1414 = buf_1495.term();
        } sink.propertyNamed("$ColumnLocation", term_1414);
        sink.start(_M__sTextCons);Term term_1362;
        {
          BufferSink buf_1915 = sink.context().makeBuffer();
          buf_1915.start(_M_STRING); buf_1915.literal(1);
          buf_1915.end();
          term_1362 = buf_1915.term();
        } sink.propertyNamed("$LineLocation", term_1362);Term term_1470;
        {
          BufferSink buf_1701 = sink.context().makeBuffer();
          buf_1701.start(_M_STRING); buf_1701.literal(1);
          buf_1701.end();
          term_1470 = buf_1701.term();
        } sink.propertyNamed("$ColumnLocation", term_1470);
        sink.start(_M__sTextEmbed);Term term_1459;
        {
          BufferSink buf_1262 = sink.context().makeBuffer();
          buf_1262.start(_M_STRING); buf_1262.literal(1);
          buf_1262.end();
          term_1459 = buf_1262.term();
        } sink.propertyNamed("$LineLocation", term_1459);Term term_1198;
        {
          BufferSink buf_1590 = sink.context().makeBuffer();
          buf_1590.start(_M_STRING); buf_1590.literal(1);
          buf_1590.end();
          term_1198 = buf_1590.term();
        } sink.propertyNamed("$ColumnLocation", term_1198);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_76.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1517;
        {
          BufferSink buf_1626 = sink.context().makeBuffer();
          buf_1626.start(_M_STRING); buf_1626.literal(1);
          buf_1626.end();
          term_1517 = buf_1626.term();
        } sink.propertyNamed("$LineLocation", term_1517);Term term_1536;
        {
          BufferSink buf_1643 = sink.context().makeBuffer();
          buf_1643.start(_M_STRING); buf_1643.literal(2);
          buf_1643.end();
          term_1536 = buf_1643.term();
        } sink.propertyNamed("$ColumnLocation", term_1536);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_11: {
        if (term_1588.descriptor() != _M_Crsx_xterm_xA2)
        {   break label_11;
        }Term sub_159 = term_1588.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1279;
        {
          BufferSink buf_1359 = sink.context().makeBuffer();
          buf_1359.start(_M_STRING); buf_1359.literal(1);
          buf_1359.end();
          term_1279 = buf_1359.term();
        } sink.propertyNamed("$LineLocation", term_1279);Term term_1305;
        {
          BufferSink buf_1418 = sink.context().makeBuffer();
          buf_1418.start(_M_STRING); buf_1418.literal(1);
          buf_1418.end();
          term_1305 = buf_1418.term();
        } sink.propertyNamed("$ColumnLocation", term_1305);
        sink.start(_M__sTextCons);Term term_1635;
        {
          BufferSink buf_1439 = sink.context().makeBuffer();
          buf_1439.start(_M_STRING); buf_1439.literal(1);
          buf_1439.end();
          term_1635 = buf_1439.term();
        } sink.propertyNamed("$LineLocation", term_1635);Term term_1324;
        {
          BufferSink buf_1826 = sink.context().makeBuffer();
          buf_1826.start(_M_STRING); buf_1826.literal(1);
          buf_1826.end();
          term_1324 = buf_1826.term();
        } sink.propertyNamed("$ColumnLocation", term_1324);
        sink.start(_M__sTextEmbed);Term term_1554;
        {
          BufferSink buf_1734 = sink.context().makeBuffer();
          buf_1734.start(_M_STRING); buf_1734.literal(1);
          buf_1734.end();
          term_1554 = buf_1734.term();
        } sink.propertyNamed("$LineLocation", term_1554);Term term_1537;
        {
          BufferSink buf_2487 = sink.context().makeBuffer();
          buf_2487.start(_M_STRING); buf_2487.literal(1);
          buf_2487.end();
          term_1537 = buf_2487.term();
        } sink.propertyNamed("$ColumnLocation", term_1537);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xboundTerm); sink.copy(sub_159.ref());
        sink.end();
        sink.end();
        sink.end();Term term_2507;
        {
          BufferSink buf_1424 = sink.context().makeBuffer();
          buf_1424.start(_M_STRING); buf_1424.literal(1);
          buf_1424.end();
          term_2507 = buf_1424.term();
        } sink.propertyNamed("$LineLocation", term_2507);Term term_1684;
        {
          BufferSink buf_1793 = sink.context().makeBuffer();
          buf_1793.start(_M_STRING); buf_1793.literal(2);
          buf_1793.end();
          term_1684 = buf_1793.term();
        } sink.propertyNamed("$ColumnLocation", term_1684);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xterm, term_1588);
  } final public static boolean _M_Crsx_xPrint_xannotation(Sink sink, int shared, int depth, Term term_1540) {
    if (depth < 2000) {
      label_226: {
        if (term_1540.descriptor() != _M_Crsx_xannotation)
        {   break label_226;
        }Term sub_198 = term_1540.sub(0).ref();
        /* #1=sub */Term sub_70 = term_1540.sub(1).ref();
        /* #2=sub */Term sub_246 = term_1540.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1471;
        {
          BufferSink buf_1478 = sink.context().makeBuffer();
          buf_1478.start(_M_STRING); buf_1478.literal(1);
          buf_1478.end();
          term_1471 = buf_1478.term();
        } sink.propertyNamed("$LineLocation", term_1471);Term term_1917;
        {
          BufferSink buf_1348 = sink.context().makeBuffer();
          buf_1348.start(_M_STRING); buf_1348.literal(1);
          buf_1348.end();
          term_1917 = buf_1348.term();
        } sink.propertyNamed("$ColumnLocation", term_1917);
        sink.start(_M__sTextCons);Term term_1842;
        {
          BufferSink buf_745 = sink.context().makeBuffer(); buf_745.start(_M_STRING); buf_745.literal(1); buf_745.end();
          term_1842 = buf_745.term();
        } sink.propertyNamed("$LineLocation", term_1842);Term term_1870;
        {
          BufferSink buf_1818 = sink.context().makeBuffer();
          buf_1818.start(_M_STRING); buf_1818.literal(2);
          buf_1818.end();
          term_1870 = buf_1818.term();
        } sink.propertyNamed("$ColumnLocation", term_1870);
        sink.start(_M__sTextChars); sink.copy(sub_198.ref());
        sink.end();Term term_2309;
        {
          BufferSink buf_1184 = sink.context().makeBuffer();
          buf_1184.start(_M_STRING); buf_1184.literal(1);
          buf_1184.end();
          term_2309 = buf_1184.term();
        } sink.propertyNamed("$LineLocation", term_2309);Term term_1525;
        {
          BufferSink buf_1748 = sink.context().makeBuffer();
          buf_1748.start(_M_STRING); buf_1748.literal(3);
          buf_1748.end();
          term_1525 = buf_1748.term();
        } sink.propertyNamed("$ColumnLocation", term_1525);
        sink.start(_M__sTextCons);Term term_1657;
        {
          BufferSink buf_1140 = sink.context().makeBuffer();
          buf_1140.start(_M_STRING); buf_1140.literal(1);
          buf_1140.end();
          term_1657 = buf_1140.term();
        } sink.propertyNamed("$LineLocation", term_1657);Term term_1779;
        {
          BufferSink buf_1554 = sink.context().makeBuffer();
          buf_1554.start(_M_STRING); buf_1554.literal(3);
          buf_1554.end();
          term_1779 = buf_1554.term();
        } sink.propertyNamed("$ColumnLocation", term_1779);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1009;
        {
          BufferSink buf_1764 = sink.context().makeBuffer();
          buf_1764.start(_M_STRING); buf_1764.literal(1);
          buf_1764.end();
          term_1009 = buf_1764.term();
        } sink.propertyNamed("$LineLocation", term_1009);Term term_1476;
        {
          BufferSink buf_1436 = sink.context().makeBuffer();
          buf_1436.start(_M_STRING); buf_1436.literal(7);
          buf_1436.end();
          term_1476 = buf_1436.term();
        } sink.propertyNamed("$ColumnLocation", term_1476);
        sink.start(_M__sTextCons);Term term_1988;
        {
          BufferSink buf_1664 = sink.context().makeBuffer();
          buf_1664.start(_M_STRING); buf_1664.literal(1);
          buf_1664.end();
          term_1988 = buf_1664.term();
        } sink.propertyNamed("$LineLocation", term_1988);Term term_1153;
        {
          BufferSink buf_1344 = sink.context().makeBuffer();
          buf_1344.start(_M_STRING); buf_1344.literal(7);
          buf_1344.end();
          term_1153 = buf_1344.term();
        } sink.propertyNamed("$ColumnLocation", term_1153);
        sink.start(_M__sTextEmbed);Term term_1446;
        {
          BufferSink buf_1217 = sink.context().makeBuffer();
          buf_1217.start(_M_STRING); buf_1217.literal(1);
          buf_1217.end();
          term_1446 = buf_1217.term();
        } sink.propertyNamed("$LineLocation", term_1446);Term term_1110;
        {
          BufferSink buf_1357 = sink.context().makeBuffer();
          buf_1357.start(_M_STRING); buf_1357.literal(7);
          buf_1357.end();
          term_1110 = buf_1357.term();
        } sink.propertyNamed("$ColumnLocation", term_1110);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_70.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1628;
        {
          BufferSink buf_1257 = sink.context().makeBuffer();
          buf_1257.start(_M_STRING); buf_1257.literal(1);
          buf_1257.end();
          term_1628 = buf_1257.term();
        } sink.propertyNamed("$LineLocation", term_1628);Term term_1541;
        {
          BufferSink buf_1635 = sink.context().makeBuffer();
          buf_1635.start(_M_STRING); buf_1635.literal(8);
          buf_1635.end();
          term_1541 = buf_1635.term();
        } sink.propertyNamed("$ColumnLocation", term_1541);
        sink.start(_M__sTextCons);Term term_1584;
        {
          BufferSink buf_1395 = sink.context().makeBuffer();
          buf_1395.start(_M_STRING); buf_1395.literal(1);
          buf_1395.end();
          term_1584 = buf_1395.term();
        } sink.propertyNamed("$LineLocation", term_1584);Term term_1573;
        {
          BufferSink buf_1474 = sink.context().makeBuffer();
          buf_1474.start(_M_STRING); buf_1474.literal(8);
          buf_1474.end();
          term_1573 = buf_1474.term();
        } sink.propertyNamed("$ColumnLocation", term_1573);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1595;
        {
          BufferSink buf_1332 = sink.context().makeBuffer();
          buf_1332.start(_M_STRING); buf_1332.literal(1);
          buf_1332.end();
          term_1595 = buf_1332.term();
        } sink.propertyNamed("$LineLocation", term_1595);Term term_2545;
        {
          BufferSink buf_929 = sink.context().makeBuffer();
          buf_929.start(_M_STRING); buf_929.literal(36);
          buf_929.end();
          term_2545 = buf_929.term();
        } sink.propertyNamed("$ColumnLocation", term_2545);
        sink.start(_M__sTextCons);Term term_1401;
        {
          BufferSink buf_1291 = sink.context().makeBuffer();
          buf_1291.start(_M_STRING); buf_1291.literal(1);
          buf_1291.end();
          term_1401 = buf_1291.term();
        } sink.propertyNamed("$LineLocation", term_1401);Term term_1675;
        {
          BufferSink buf_1452 = sink.context().makeBuffer();
          buf_1452.start(_M_STRING); buf_1452.literal(36);
          buf_1452.end();
          term_1675 = buf_1452.term();
        } sink.propertyNamed("$ColumnLocation", term_1675);
        sink.start(_M__sTextEmbed);Term term_2059;
        {
          BufferSink buf_1445 = sink.context().makeBuffer();
          buf_1445.start(_M_STRING); buf_1445.literal(1);
          buf_1445.end();
          term_2059 = buf_1445.term();
        } sink.propertyNamed("$LineLocation", term_2059);Term term_1871;
        {
          BufferSink buf_1705 = sink.context().makeBuffer();
          buf_1705.start(_M_STRING); buf_1705.literal(36);
          buf_1705.end();
          term_1871 = buf_1705.term();
        } sink.propertyNamed("$ColumnLocation", term_1871);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_92 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_92});
        sink.start(_M_Crsx_xPrint_xarguments); sink.use(var_92);
        sink.end(); sink.copy(sub_246.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1639;
        {
          BufferSink buf_2129 = sink.context().makeBuffer();
          buf_2129.start(_M_STRING); buf_2129.literal(1);
          buf_2129.end();
          term_1639 = buf_2129.term();
        } sink.propertyNamed("$LineLocation", term_1639);Term term_1965;
        {
          BufferSink buf_1741 = sink.context().makeBuffer();
          buf_1741.start(_M_STRING); buf_1741.literal(86);
          buf_1741.end();
          term_1965 = buf_1741.term();
        } sink.propertyNamed("$ColumnLocation", term_1965);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1629;
        {
          BufferSink buf_1931 = sink.context().makeBuffer();
          buf_1931.start(_M_STRING); buf_1931.literal(1);
          buf_1931.end();
          term_1629 = buf_1931.term();
        } sink.propertyNamed("$LineLocation", term_1629);Term term_1800;
        {
          BufferSink buf_1428 = sink.context().makeBuffer();
          buf_1428.start(_M_STRING); buf_1428.literal(37);
          buf_1428.end();
          term_1800 = buf_1428.term();
        } sink.propertyNamed("$ColumnLocation", term_1800);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xannotation, term_1540);
  } final public static boolean _M_Crsx_xPrint_xannotations(Sink sink, int shared, int depth, Term term_2141) {
    if (depth < 2000) {
      label_5: {
        if (term_2141.descriptor() != _M_Crsx_xannotations)
        {   break label_5;
        }Term sub_117 = term_2141.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1945;
        {
          BufferSink buf_1686 = sink.context().makeBuffer();
          buf_1686.start(_M_STRING); buf_1686.literal(1);
          buf_1686.end();
          term_1945 = buf_1686.term();
        } sink.propertyNamed("$LineLocation", term_1945);Term term_1587;
        {
          BufferSink buf_2130 = sink.context().makeBuffer();
          buf_2130.start(_M_STRING); buf_2130.literal(1);
          buf_2130.end();
          term_1587 = buf_2130.term();
        } sink.propertyNamed("$ColumnLocation", term_1587);
        sink.start(_M__sTextCons);Term term_1413;
        {
          BufferSink buf_2282 = sink.context().makeBuffer();
          buf_2282.start(_M_STRING); buf_2282.literal(1);
          buf_2282.end();
          term_1413 = buf_2282.term();
        } sink.propertyNamed("$LineLocation", term_1413);Term term_1204;
        {
          BufferSink buf_2362 = sink.context().makeBuffer();
          buf_2362.start(_M_STRING); buf_2362.literal(1);
          buf_2362.end();
          term_1204 = buf_2362.term();
        } sink.propertyNamed("$ColumnLocation", term_1204);
        sink.start(_M__sTextEmbed);Term term_1651;
        {
          BufferSink buf_2697 = sink.context().makeBuffer();
          buf_2697.start(_M_STRING); buf_2697.literal(1);
          buf_2697.end();
          term_1651 = buf_2697.term();
        } sink.propertyNamed("$LineLocation", term_1651);Term term_1448;
        {
          BufferSink buf_912 = sink.context().makeBuffer(); buf_912.start(_M_STRING); buf_912.literal(1); buf_912.end();
          term_1448 = buf_912.term();
        } sink.propertyNamed("$ColumnLocation", term_1448);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_99 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_99});
        sink.start(_M_Crsx_xPrint_xannotation); sink.use(var_99);
        sink.end(); sink.copy(sub_117.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1219;
        {
          BufferSink buf_1465 = sink.context().makeBuffer();
          buf_1465.start(_M_STRING); buf_1465.literal(1);
          buf_1465.end();
          term_1219 = buf_1465.term();
        } sink.propertyNamed("$LineLocation", term_1219);Term term_1383;
        {
          BufferSink buf_2012 = sink.context().makeBuffer();
          buf_2012.start(_M_STRING); buf_2012.literal(52);
          buf_2012.end();
          term_1383 = buf_2012.term();
        } sink.propertyNamed("$ColumnLocation", term_1383);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1873;
        {
          BufferSink buf_1225 = sink.context().makeBuffer();
          buf_1225.start(_M_STRING); buf_1225.literal(1);
          buf_1225.end();
          term_1873 = buf_1225.term();
        } sink.propertyNamed("$LineLocation", term_1873);Term term_1574;
        {
          BufferSink buf_1376 = sink.context().makeBuffer();
          buf_1376.start(_M_STRING); buf_1376.literal(2);
          buf_1376.end();
          term_1574 = buf_1376.term();
        } sink.propertyNamed("$ColumnLocation", term_1574);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xannotations, term_2141);
  } final public static boolean _M_Crsx_xPrint_xcontractum(Sink sink, int shared, int depth, Term term_1929) {
    if (depth < 2000) {
      label_87: {
        if (term_1929.descriptor() != _M_Crsx_xcontractum)
        {   break label_87;
        }Term sub_257 = term_1929.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1890;
        {
          BufferSink buf_1127 = sink.context().makeBuffer();
          buf_1127.start(_M_STRING); buf_1127.literal(1);
          buf_1127.end();
          term_1890 = buf_1127.term();
        } sink.propertyNamed("$LineLocation", term_1890);Term term_1441;
        {
          BufferSink buf_1288 = sink.context().makeBuffer();
          buf_1288.start(_M_STRING); buf_1288.literal(1);
          buf_1288.end();
          term_1441 = buf_1288.term();
        } sink.propertyNamed("$ColumnLocation", term_1441);
        sink.start(_M__sTextCons);Term term_1556;
        {
          BufferSink buf_1251 = sink.context().makeBuffer();
          buf_1251.start(_M_STRING); buf_1251.literal(1);
          buf_1251.end();
          term_1556 = buf_1251.term();
        } sink.propertyNamed("$LineLocation", term_1556);Term term_1391;
        {
          BufferSink buf_1163 = sink.context().makeBuffer();
          buf_1163.start(_M_STRING); buf_1163.literal(1);
          buf_1163.end();
          term_1391 = buf_1163.term();
        } sink.propertyNamed("$ColumnLocation", term_1391);
        sink.start(_M__sTextEmbed);Term term_1899;
        {
          BufferSink buf_1244 = sink.context().makeBuffer();
          buf_1244.start(_M_STRING); buf_1244.literal(1);
          buf_1244.end();
          term_1899 = buf_1244.term();
        } sink.propertyNamed("$LineLocation", term_1899);Term term_1766;
        {
          BufferSink buf_1808 = sink.context().makeBuffer();
          buf_1808.start(_M_STRING); buf_1808.literal(1);
          buf_1808.end();
          term_1766 = buf_1808.term();
        } sink.propertyNamed("$ColumnLocation", term_1766);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xfreeTerm); sink.copy(sub_257.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1291;
        {
          BufferSink buf_1849 = sink.context().makeBuffer();
          buf_1849.start(_M_STRING); buf_1849.literal(1);
          buf_1849.end();
          term_1291 = buf_1849.term();
        } sink.propertyNamed("$LineLocation", term_1291);Term term_1569;
        {
          BufferSink buf_1754 = sink.context().makeBuffer();
          buf_1754.start(_M_STRING); buf_1754.literal(2);
          buf_1754.end();
          term_1569 = buf_1754.term();
        } sink.propertyNamed("$ColumnLocation", term_1569);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xcontractum, term_1929);
  } final public static boolean _M_Crsx_xPrint_xpattern(Sink sink, int shared, int depth, Term term_1887) {
    if (depth < 2000) {
      label_59: {
        if (term_1887.descriptor() != _M_Crsx_xpattern)
        {   break label_59;
        }Term sub_143 = term_1887.sub(0).ref();
        /* #1=sub */Term sub_192 = term_1887.sub(1).ref();
        /* #2=sub */Term sub_129 = term_1887.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1972;
        {
          BufferSink buf_1710 = sink.context().makeBuffer();
          buf_1710.start(_M_STRING); buf_1710.literal(1);
          buf_1710.end();
          term_1972 = buf_1710.term();
        } sink.propertyNamed("$LineLocation", term_1972);Term term_1483;
        {
          BufferSink buf_1631 = sink.context().makeBuffer();
          buf_1631.start(_M_STRING); buf_1631.literal(1);
          buf_1631.end();
          term_1483 = buf_1631.term();
        } sink.propertyNamed("$ColumnLocation", term_1483);
        sink.start(_M__sTextCons);Term term_1528;
        {
          BufferSink buf_1566 = sink.context().makeBuffer();
          buf_1566.start(_M_STRING); buf_1566.literal(1);
          buf_1566.end();
          term_1528 = buf_1566.term();
        } sink.propertyNamed("$LineLocation", term_1528);Term term_1329;
        {
          BufferSink buf_1100 = sink.context().makeBuffer();
          buf_1100.start(_M_STRING); buf_1100.literal(1);
          buf_1100.end();
          term_1329 = buf_1100.term();
        } sink.propertyNamed("$ColumnLocation", term_1329);
        sink.start(_M__sTextEmbed);Term term_1230;
        {
          BufferSink buf_1693 = sink.context().makeBuffer();
          buf_1693.start(_M_STRING); buf_1693.literal(1);
          buf_1693.end();
          term_1230 = buf_1693.term();
        } sink.propertyNamed("$LineLocation", term_1230);Term term_1575;
        {
          BufferSink buf_2178 = sink.context().makeBuffer();
          buf_2178.start(_M_STRING); buf_2178.literal(1);
          buf_2178.end();
          term_1575 = buf_2178.term();
        } sink.propertyNamed("$ColumnLocation", term_1575);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_12 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_12});
        sink.start(_M_Crsx_xPrint_xproperties); sink.use(var_12);
        sink.end(); sink.copy(sub_143.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2300;
        {
          BufferSink buf_1493 = sink.context().makeBuffer();
          buf_1493.start(_M_STRING); buf_1493.literal(1);
          buf_1493.end();
          term_2300 = buf_1493.term();
        } sink.propertyNamed("$LineLocation", term_2300);Term term_1390;
        {
          BufferSink buf_2226 = sink.context().makeBuffer();
          buf_2226.start(_M_STRING); buf_2226.literal(52);
          buf_2226.end();
          term_1390 = buf_2226.term();
        } sink.propertyNamed("$ColumnLocation", term_1390);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1692;
        {
          BufferSink buf_1698 = sink.context().makeBuffer();
          buf_1698.start(_M_STRING); buf_1698.literal(1);
          buf_1698.end();
          term_1692 = buf_1698.term();
        } sink.propertyNamed("$LineLocation", term_1692);Term term_1490;
        {
          BufferSink buf_1605 = sink.context().makeBuffer();
          buf_1605.start(_M_STRING); buf_1605.literal(2);
          buf_1605.end();
          term_1490 = buf_1605.term();
        } sink.propertyNamed("$ColumnLocation", term_1490);
        sink.start(_M__sTextCons);Term term_1546;
        {
          BufferSink buf_2099 = sink.context().makeBuffer();
          buf_2099.start(_M_STRING); buf_2099.literal(1);
          buf_2099.end();
          term_1546 = buf_2099.term();
        } sink.propertyNamed("$LineLocation", term_1546);Term term_2017;
        {
          BufferSink buf_1844 = sink.context().makeBuffer();
          buf_1844.start(_M_STRING); buf_1844.literal(2);
          buf_1844.end();
          term_2017 = buf_1844.term();
        } sink.propertyNamed("$ColumnLocation", term_2017);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1632;
        {
          BufferSink buf_1800 = sink.context().makeBuffer();
          buf_1800.start(_M_STRING); buf_1800.literal(1);
          buf_1800.end();
          term_1632 = buf_1800.term();
        } sink.propertyNamed("$LineLocation", term_1632);Term term_1555;
        {
          BufferSink buf_1067 = sink.context().makeBuffer();
          buf_1067.start(_M_STRING); buf_1067.literal(56);
          buf_1067.end();
          term_1555 = buf_1067.term();
        } sink.propertyNamed("$ColumnLocation", term_1555);
        sink.start(_M__sTextCons);Term term_1335;
        {
          BufferSink buf_1662 = sink.context().makeBuffer();
          buf_1662.start(_M_STRING); buf_1662.literal(1);
          buf_1662.end();
          term_1335 = buf_1662.term();
        } sink.propertyNamed("$LineLocation", term_1335);Term term_1504;
        {
          BufferSink buf_1870 = sink.context().makeBuffer();
          buf_1870.start(_M_STRING); buf_1870.literal(56);
          buf_1870.end();
          term_1504 = buf_1870.term();
        } sink.propertyNamed("$ColumnLocation", term_1504);
        sink.start(_M__sTextEmbed);Term term_1209;
        {
          BufferSink buf_1998 = sink.context().makeBuffer();
          buf_1998.start(_M_STRING); buf_1998.literal(1);
          buf_1998.end();
          term_1209 = buf_1998.term();
        } sink.propertyNamed("$LineLocation", term_1209);Term term_2005;
        {
          BufferSink buf_1522 = sink.context().makeBuffer();
          buf_1522.start(_M_STRING); buf_1522.literal(56);
          buf_1522.end();
          term_2005 = buf_1522.term();
        } sink.propertyNamed("$ColumnLocation", term_2005);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_192.ref());
        sink.end();
        sink.end();
        sink.end();Term term_2088;
        {
          BufferSink buf_1574 = sink.context().makeBuffer();
          buf_1574.start(_M_STRING); buf_1574.literal(1);
          buf_1574.end();
          term_2088 = buf_1574.term();
        } sink.propertyNamed("$LineLocation", term_2088);Term term_1851;
        {
          BufferSink buf_1724 = sink.context().makeBuffer();
          buf_1724.start(_M_STRING); buf_1724.literal(57);
          buf_1724.end();
          term_1851 = buf_1724.term();
        } sink.propertyNamed("$ColumnLocation", term_1851);
        sink.start(_M__sTextCons);Term term_1752;
        {
          BufferSink buf_1284 = sink.context().makeBuffer();
          buf_1284.start(_M_STRING); buf_1284.literal(1);
          buf_1284.end();
          term_1752 = buf_1284.term();
        } sink.propertyNamed("$LineLocation", term_1752);Term term_1427;
        {
          BufferSink buf_1568 = sink.context().makeBuffer();
          buf_1568.start(_M_STRING); buf_1568.literal(57);
          buf_1568.end();
          term_1427 = buf_1568.term();
        } sink.propertyNamed("$ColumnLocation", term_1427);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1178;
        {
          BufferSink buf_1752 = sink.context().makeBuffer();
          buf_1752.start(_M_STRING); buf_1752.literal(1);
          buf_1752.end();
          term_1178 = buf_1752.term();
        } sink.propertyNamed("$LineLocation", term_1178);Term term_1741;
        {
          BufferSink buf_1569 = sink.context().makeBuffer();
          buf_1569.start(_M_STRING); buf_1569.literal(85);
          buf_1569.end();
          term_1741 = buf_1569.term();
        } sink.propertyNamed("$ColumnLocation", term_1741);
        sink.start(_M__sTextCons);Term term_1510;
        {
          BufferSink buf_1902 = sink.context().makeBuffer();
          buf_1902.start(_M_STRING); buf_1902.literal(1);
          buf_1902.end();
          term_1510 = buf_1902.term();
        } sink.propertyNamed("$LineLocation", term_1510);Term term_1466;
        {
          BufferSink buf_1377 = sink.context().makeBuffer();
          buf_1377.start(_M_STRING); buf_1377.literal(85);
          buf_1377.end();
          term_1466 = buf_1377.term();
        } sink.propertyNamed("$ColumnLocation", term_1466);
        sink.start(_M__sTextEmbed);Term term_1207;
        {
          BufferSink buf_954 = sink.context().makeBuffer(); buf_954.start(_M_STRING); buf_954.literal(1); buf_954.end();
          term_1207 = buf_954.term();
        } sink.propertyNamed("$LineLocation", term_1207);Term term_1915;
        {
          BufferSink buf_1877 = sink.context().makeBuffer();
          buf_1877.start(_M_STRING); buf_1877.literal(85);
          buf_1877.end();
          term_1915 = buf_1877.term();
        } sink.propertyNamed("$ColumnLocation", term_1915);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_30 = sink.context().makeVariable("x_23");
        sink.binds(new Variable[] {var_30});
        sink.start(_M_Crsx_xPrint_xarguments); sink.use(var_30);
        sink.end(); sink.copy(sub_129.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1666;
        {
          BufferSink buf_1363 = sink.context().makeBuffer();
          buf_1363.start(_M_STRING); buf_1363.literal(1);
          buf_1363.end();
          term_1666 = buf_1363.term();
        } sink.propertyNamed("$LineLocation", term_1666);Term term_1849;
        {
          BufferSink buf_1582 = sink.context().makeBuffer();
          buf_1582.start(_M_STRING); buf_1582.literal(135);
          buf_1582.end();
          term_1849 = buf_1582.term();
        } sink.propertyNamed("$ColumnLocation", term_1849);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_2102;
        {
          BufferSink buf_1790 = sink.context().makeBuffer();
          buf_1790.start(_M_STRING); buf_1790.literal(1);
          buf_1790.end();
          term_2102 = buf_1790.term();
        } sink.propertyNamed("$LineLocation", term_2102);Term term_1698;
        {
          BufferSink buf_2414 = sink.context().makeBuffer();
          buf_2414.start(_M_STRING); buf_2414.literal(86);
          buf_2414.end();
          term_1698 = buf_2414.term();
        } sink.propertyNamed("$ColumnLocation", term_1698);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xpattern, term_1887);
  } final public static boolean _M_Crsx_xPrint_xoption(Sink sink, int shared, int depth, Term term_1693) {
    if (depth < 2000) {
      label_211: {
        if (term_1693.descriptor() != _M_Crsx_xoption_xA1)
        {   break label_211;
        }Term sub_111 = term_1693.sub(0).ref();
        /* #1=sub */Term sub_394 = term_1693.sub(1).ref();
        /* #2=sub */Term sub_37 = term_1693.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2169;
        {
          BufferSink buf_1917 = sink.context().makeBuffer();
          buf_1917.start(_M_STRING); buf_1917.literal(1);
          buf_1917.end();
          term_2169 = buf_1917.term();
        } sink.propertyNamed("$LineLocation", term_2169);Term term_1524;
        {
          BufferSink buf_1333 = sink.context().makeBuffer();
          buf_1333.start(_M_STRING); buf_1333.literal(1);
          buf_1333.end();
          term_1524 = buf_1333.term();
        } sink.propertyNamed("$ColumnLocation", term_1524);
        sink.start(_M__sTextCons);Term term_1513;
        {
          BufferSink buf_1319 = sink.context().makeBuffer();
          buf_1319.start(_M_STRING); buf_1319.literal(1);
          buf_1319.end();
          term_1513 = buf_1319.term();
        } sink.propertyNamed("$LineLocation", term_1513);Term term_2198;
        {
          BufferSink buf_2144 = sink.context().makeBuffer();
          buf_2144.start(_M_STRING); buf_2144.literal(1);
          buf_2144.end();
          term_2198 = buf_2144.term();
        } sink.propertyNamed("$ColumnLocation", term_2198);
        sink.start(_M__sTextEmbed);Term term_917;
        {
          BufferSink buf_1575 = sink.context().makeBuffer();
          buf_1575.start(_M_STRING); buf_1575.literal(1);
          buf_1575.end();
          term_917 = buf_1575.term();
        } sink.propertyNamed("$LineLocation", term_917);Term term_1424;
        {
          BufferSink buf_1794 = sink.context().makeBuffer();
          buf_1794.start(_M_STRING); buf_1794.literal(1);
          buf_1794.end();
          term_1424 = buf_1794.term();
        } sink.propertyNamed("$ColumnLocation", term_1424);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_111.ref());
        sink.end();
        sink.end();
        sink.end();Term term_2034;
        {
          BufferSink buf_1294 = sink.context().makeBuffer();
          buf_1294.start(_M_STRING); buf_1294.literal(1);
          buf_1294.end();
          term_2034 = buf_1294.term();
        } sink.propertyNamed("$LineLocation", term_2034);Term term_1508;
        {
          BufferSink buf_1680 = sink.context().makeBuffer();
          buf_1680.start(_M_STRING); buf_1680.literal(2);
          buf_1680.end();
          term_1508 = buf_1680.term();
        } sink.propertyNamed("$ColumnLocation", term_1508);
        sink.start(_M__sTextCons);Term term_2076;
        {
          BufferSink buf_1659 = sink.context().makeBuffer();
          buf_1659.start(_M_STRING); buf_1659.literal(1);
          buf_1659.end();
          term_2076 = buf_1659.term();
        } sink.propertyNamed("$LineLocation", term_2076);Term term_1785;
        {
          BufferSink buf_1555 = sink.context().makeBuffer();
          buf_1555.start(_M_STRING); buf_1555.literal(2);
          buf_1555.end();
          term_1785 = buf_1555.term();
        } sink.propertyNamed("$ColumnLocation", term_1785);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1835;
        {
          BufferSink buf_1812 = sink.context().makeBuffer();
          buf_1812.start(_M_STRING); buf_1812.literal(1);
          buf_1812.end();
          term_1835 = buf_1812.term();
        } sink.propertyNamed("$LineLocation", term_1835);Term term_2672;
        {
          BufferSink buf_1399 = sink.context().makeBuffer();
          buf_1399.start(_M_STRING); buf_1399.literal(30);
          buf_1399.end();
          term_2672 = buf_1399.term();
        } sink.propertyNamed("$ColumnLocation", term_2672);
        sink.start(_M__sTextCons);Term term_1769;
        {
          BufferSink buf_2073 = sink.context().makeBuffer();
          buf_2073.start(_M_STRING); buf_2073.literal(1);
          buf_2073.end();
          term_1769 = buf_2073.term();
        } sink.propertyNamed("$LineLocation", term_1769);Term term_2003;
        {
          BufferSink buf_1239 = sink.context().makeBuffer();
          buf_1239.start(_M_STRING); buf_1239.literal(30);
          buf_1239.end();
          term_2003 = buf_1239.term();
        } sink.propertyNamed("$ColumnLocation", term_2003);
        sink.start(_M__sTextEmbed);Term term_1126;
        {
          BufferSink buf_1527 = sink.context().makeBuffer();
          buf_1527.start(_M_STRING); buf_1527.literal(1);
          buf_1527.end();
          term_1126 = buf_1527.term();
        } sink.propertyNamed("$LineLocation", term_1126);Term term_2277;
        {
          BufferSink buf_1541 = sink.context().makeBuffer();
          buf_1541.start(_M_STRING); buf_1541.literal(30);
          buf_1541.end();
          term_2277 = buf_1541.term();
        } sink.propertyNamed("$ColumnLocation", term_2277);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_104 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_104});
        sink.start(_M_Crsx_xPrint_xarguments); sink.use(var_104);
        sink.end(); sink.copy(sub_394.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1445;
        {
          BufferSink buf_1699 = sink.context().makeBuffer();
          buf_1699.start(_M_STRING); buf_1699.literal(1);
          buf_1699.end();
          term_1445 = buf_1699.term();
        } sink.propertyNamed("$LineLocation", term_1445);Term term_1685;
        {
          BufferSink buf_1685 = sink.context().makeBuffer();
          buf_1685.start(_M_STRING); buf_1685.literal(80);
          buf_1685.end();
          term_1685 = buf_1685.term();
        } sink.propertyNamed("$ColumnLocation", term_1685);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1037;
        {
          BufferSink buf_1212 = sink.context().makeBuffer();
          buf_1212.start(_M_STRING); buf_1212.literal(1);
          buf_1212.end();
          term_1037 = buf_1212.term();
        } sink.propertyNamed("$LineLocation", term_1037);Term term_2189;
        {
          BufferSink buf_1955 = sink.context().makeBuffer();
          buf_1955.start(_M_STRING); buf_1955.literal(31);
          buf_1955.end();
          term_2189 = buf_1955.term();
        } sink.propertyNamed("$ColumnLocation", term_2189);
        sink.start(_M__sTextCons);Term term_1550;
        {
          BufferSink buf_1102 = sink.context().makeBuffer();
          buf_1102.start(_M_STRING); buf_1102.literal(1);
          buf_1102.end();
          term_1550 = buf_1102.term();
        } sink.propertyNamed("$LineLocation", term_1550);Term term_2446;
        {
          BufferSink buf_1380 = sink.context().makeBuffer();
          buf_1380.start(_M_STRING); buf_1380.literal(31);
          buf_1380.end();
          term_2446 = buf_1380.term();
        } sink.propertyNamed("$ColumnLocation", term_2446);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1509;
        {
          BufferSink buf_1456 = sink.context().makeBuffer();
          buf_1456.start(_M_STRING); buf_1456.literal(1);
          buf_1456.end();
          term_1509 = buf_1456.term();
        } sink.propertyNamed("$LineLocation", term_1509);Term term_1736;
        {
          BufferSink buf_1894 = sink.context().makeBuffer();
          buf_1894.start(_M_STRING); buf_1894.literal(84);
          buf_1894.end();
          term_1736 = buf_1894.term();
        } sink.propertyNamed("$ColumnLocation", term_1736);
        sink.start(_M__sTextCons);Term term_2094;
        {
          BufferSink buf_2153 = sink.context().makeBuffer();
          buf_2153.start(_M_STRING); buf_2153.literal(1);
          buf_2153.end();
          term_2094 = buf_2153.term();
        } sink.propertyNamed("$LineLocation", term_2094);Term term_1699;
        {
          BufferSink buf_1287 = sink.context().makeBuffer();
          buf_1287.start(_M_STRING); buf_1287.literal(85);
          buf_1287.end();
          term_1699 = buf_1287.term();
        } sink.propertyNamed("$ColumnLocation", term_1699);
        sink.start(_M__sTextChars); sink.copy(sub_37.ref());
        sink.end();Term term_1792;
        {
          BufferSink buf_1944 = sink.context().makeBuffer();
          buf_1944.start(_M_STRING); buf_1944.literal(1);
          buf_1944.end();
          term_1792 = buf_1944.term();
        } sink.propertyNamed("$LineLocation", term_1792);Term term_1010;
        {
          BufferSink buf_1286 = sink.context().makeBuffer();
          buf_1286.start(_M_STRING); buf_1286.literal(86);
          buf_1286.end();
          term_1010 = buf_1286.term();
        } sink.propertyNamed("$ColumnLocation", term_1010);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_179: {
        if (term_1693.descriptor() != _M_Crsx_xoption_xA2)
        {   break label_179;
        }Term sub_355 = term_1693.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2244;
        {
          BufferSink buf_1547 = sink.context().makeBuffer();
          buf_1547.start(_M_STRING); buf_1547.literal(1);
          buf_1547.end();
          term_2244 = buf_1547.term();
        } sink.propertyNamed("$LineLocation", term_2244);Term term_2008;
        {
          BufferSink buf_1607 = sink.context().makeBuffer();
          buf_1607.start(_M_STRING); buf_1607.literal(1);
          buf_1607.end();
          term_2008 = buf_1607.term();
        } sink.propertyNamed("$ColumnLocation", term_2008);
        sink.start(_M__sTextCons);Term term_1493;
        {
          BufferSink buf_1882 = sink.context().makeBuffer();
          buf_1882.start(_M_STRING); buf_1882.literal(1);
          buf_1882.end();
          term_1493 = buf_1882.term();
        } sink.propertyNamed("$LineLocation", term_1493);Term term_988;
        {
          BufferSink buf_1328 = sink.context().makeBuffer();
          buf_1328.start(_M_STRING); buf_1328.literal(1);
          buf_1328.end();
          term_988 = buf_1328.term();
        } sink.propertyNamed("$ColumnLocation", term_988);
        sink.start(_M__sTextEmbed);Term term_2260;
        {
          BufferSink buf_2336 = sink.context().makeBuffer();
          buf_2336.start(_M_STRING); buf_2336.literal(1);
          buf_2336.end();
          term_2260 = buf_2336.term();
        } sink.propertyNamed("$LineLocation", term_2260);Term term_1748;
        {
          BufferSink buf_1161 = sink.context().makeBuffer();
          buf_1161.start(_M_STRING); buf_1161.literal(1);
          buf_1161.end();
          term_1748 = buf_1161.term();
        } sink.propertyNamed("$ColumnLocation", term_1748);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xannotations); sink.copy(sub_355.ref());
        sink.end();
        sink.end();
        sink.end();Term term_2119;
        {
          BufferSink buf_1087 = sink.context().makeBuffer();
          buf_1087.start(_M_STRING); buf_1087.literal(1);
          buf_1087.end();
          term_2119 = buf_1087.term();
        } sink.propertyNamed("$LineLocation", term_2119);Term term_1660;
        {
          BufferSink buf_2068 = sink.context().makeBuffer();
          buf_2068.start(_M_STRING); buf_2068.literal(2);
          buf_2068.end();
          term_1660 = buf_2068.term();
        } sink.propertyNamed("$ColumnLocation", term_1660);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xoption, term_1693);
  } final public static boolean _M_Crsx_xPrint_xruleDeclaration(Sink sink, int shared, int depth, Term term_1102) {
    if (depth < 2000) {
      label_146: {
        if (term_1102.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_146;
        }Term sub_162 = term_1102.sub(0).ref();
        /* #1=sub */Term sub_207 = term_1102.sub(1).ref();
        /* #2=sub */Term sub_147 = term_1102.sub(2).ref();
        /* #3=sub */Term sub_119 = term_1102.sub(3).ref();
        /* #4=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2299;
        {
          BufferSink buf_1482 = sink.context().makeBuffer();
          buf_1482.start(_M_STRING); buf_1482.literal(1);
          buf_1482.end();
          term_2299 = buf_1482.term();
        } sink.propertyNamed("$LineLocation", term_2299);Term term_1614;
        {
          BufferSink buf_1577 = sink.context().makeBuffer();
          buf_1577.start(_M_STRING); buf_1577.literal(1);
          buf_1577.end();
          term_1614 = buf_1577.term();
        } sink.propertyNamed("$ColumnLocation", term_1614);
        sink.start(_M__sTextCons);Term term_1616;
        {
          BufferSink buf_1759 = sink.context().makeBuffer();
          buf_1759.start(_M_STRING); buf_1759.literal(1);
          buf_1759.end();
          term_1616 = buf_1759.term();
        } sink.propertyNamed("$LineLocation", term_1616);Term term_1620;
        {
          BufferSink buf_1656 = sink.context().makeBuffer();
          buf_1656.start(_M_STRING); buf_1656.literal(1);
          buf_1656.end();
          term_1620 = buf_1656.term();
        } sink.propertyNamed("$ColumnLocation", term_1620);
        sink.start(_M__sTextEmbed);Term term_1165;
        {
          BufferSink buf_1483 = sink.context().makeBuffer();
          buf_1483.start(_M_STRING); buf_1483.literal(1);
          buf_1483.end();
          term_1165 = buf_1483.term();
        } sink.propertyNamed("$LineLocation", term_1165);Term term_1599;
        {
          BufferSink buf_1455 = sink.context().makeBuffer();
          buf_1455.start(_M_STRING); buf_1455.literal(1);
          buf_1455.end();
          term_1599 = buf_1455.term();
        } sink.propertyNamed("$ColumnLocation", term_1599);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_64 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_64});
        sink.start(_M_Crsx_xPrint_xoption); sink.use(var_64);
        sink.end(); sink.copy(sub_162.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1968;
        {
          BufferSink buf_1879 = sink.context().makeBuffer();
          buf_1879.start(_M_STRING); buf_1879.literal(1);
          buf_1879.end();
          term_1968 = buf_1879.term();
        } sink.propertyNamed("$LineLocation", term_1968);Term term_1735;
        {
          BufferSink buf_1595 = sink.context().makeBuffer();
          buf_1595.start(_M_STRING); buf_1595.literal(48);
          buf_1595.end();
          term_1735 = buf_1595.term();
        } sink.propertyNamed("$ColumnLocation", term_1735);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1055;
        {
          BufferSink buf_1305 = sink.context().makeBuffer();
          buf_1305.start(_M_STRING); buf_1305.literal(1);
          buf_1305.end();
          term_1055 = buf_1305.term();
        } sink.propertyNamed("$LineLocation", term_1055);Term term_1307;
        {
          BufferSink buf_1966 = sink.context().makeBuffer();
          buf_1966.start(_M_STRING); buf_1966.literal(2);
          buf_1966.end();
          term_1307 = buf_1966.term();
        } sink.propertyNamed("$ColumnLocation", term_1307);
        sink.start(_M__sTextCons);Term term_1416;
        {
          BufferSink buf_938 = sink.context().makeBuffer(); buf_938.start(_M_STRING); buf_938.literal(1); buf_938.end();
          term_1416 = buf_938.term();
        } sink.propertyNamed("$LineLocation", term_1416);Term term_1782;
        {
          BufferSink buf_1544 = sink.context().makeBuffer();
          buf_1544.start(_M_STRING); buf_1544.literal(2);
          buf_1544.end();
          term_1782 = buf_1544.term();
        } sink.propertyNamed("$ColumnLocation", term_1782);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_2070;
        {
          BufferSink buf_1866 = sink.context().makeBuffer();
          buf_1866.start(_M_STRING); buf_1866.literal(1);
          buf_1866.end();
          term_2070 = buf_1866.term();
        } sink.propertyNamed("$LineLocation", term_2070);Term term_1963;
        {
          BufferSink buf_1634 = sink.context().makeBuffer();
          buf_1634.start(_M_STRING); buf_1634.literal(52);
          buf_1634.end();
          term_1963 = buf_1634.term();
        } sink.propertyNamed("$ColumnLocation", term_1963);
        sink.start(_M__sTextCons);Term term_1913;
        {
          BufferSink buf_1938 = sink.context().makeBuffer();
          buf_1938.start(_M_STRING); buf_1938.literal(1);
          buf_1938.end();
          term_1913 = buf_1938.term();
        } sink.propertyNamed("$LineLocation", term_1913);Term term_1267;
        {
          BufferSink buf_1515 = sink.context().makeBuffer();
          buf_1515.start(_M_STRING); buf_1515.literal(52);
          buf_1515.end();
          term_1267 = buf_1515.term();
        } sink.propertyNamed("$ColumnLocation", term_1267);
        sink.start(_M__sTextEmbed);Term term_1615;
        {
          BufferSink buf_1404 = sink.context().makeBuffer();
          buf_1404.start(_M_STRING); buf_1404.literal(1);
          buf_1404.end();
          term_1615 = buf_1404.term();
        } sink.propertyNamed("$LineLocation", term_1615);Term term_1557;
        {
          BufferSink buf_1636 = sink.context().makeBuffer();
          buf_1636.start(_M_STRING); buf_1636.literal(52);
          buf_1636.end();
          term_1557 = buf_1636.term();
        } sink.propertyNamed("$ColumnLocation", term_1557);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xpattern); sink.copy(sub_207.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1572;
        {
          BufferSink buf_1122 = sink.context().makeBuffer();
          buf_1122.start(_M_STRING); buf_1122.literal(1);
          buf_1122.end();
          term_1572 = buf_1122.term();
        } sink.propertyNamed("$LineLocation", term_1572);Term term_1444;
        {
          BufferSink buf_1675 = sink.context().makeBuffer();
          buf_1675.start(_M_STRING); buf_1675.literal(53);
          buf_1675.end();
          term_1444 = buf_1675.term();
        } sink.propertyNamed("$ColumnLocation", term_1444);
        sink.start(_M__sTextCons);Term term_1796;
        {
          BufferSink buf_1425 = sink.context().makeBuffer();
          buf_1425.start(_M_STRING); buf_1425.literal(1);
          buf_1425.end();
          term_1796 = buf_1425.term();
        } sink.propertyNamed("$LineLocation", term_1796);Term term_2199;
        {
          BufferSink buf_1606 = sink.context().makeBuffer();
          buf_1606.start(_M_STRING); buf_1606.literal(53);
          buf_1606.end();
          term_2199 = buf_1606.term();
        } sink.propertyNamed("$ColumnLocation", term_2199);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1345;
        {
          BufferSink buf_1360 = sink.context().makeBuffer();
          buf_1360.start(_M_STRING); buf_1360.literal(1);
          buf_1360.end();
          term_1345 = buf_1360.term();
        } sink.propertyNamed("$LineLocation", term_1345);Term term_2213;
        {
          BufferSink buf_1447 = sink.context().makeBuffer();
          buf_1447.start(_M_STRING); buf_1447.literal(77);
          buf_1447.end();
          term_2213 = buf_1447.term();
        } sink.propertyNamed("$ColumnLocation", term_2213);
        sink.start(_M__sTextCons);Term term_1213;
        {
          BufferSink buf_2397 = sink.context().makeBuffer();
          buf_2397.start(_M_STRING); buf_2397.literal(1);
          buf_2397.end();
          term_1213 = buf_2397.term();
        } sink.propertyNamed("$LineLocation", term_1213);Term term_1942;
        {
          BufferSink buf_1560 = sink.context().makeBuffer();
          buf_1560.start(_M_STRING); buf_1560.literal(78);
          buf_1560.end();
          term_1942 = buf_1560.term();
        } sink.propertyNamed("$ColumnLocation", term_1942);
        sink.start(_M__sTextChars); sink.copy(sub_147.ref());
        sink.end();Term term_1689;
        {
          BufferSink buf_2110 = sink.context().makeBuffer();
          buf_2110.start(_M_STRING); buf_2110.literal(1);
          buf_2110.end();
          term_1689 = buf_2110.term();
        } sink.propertyNamed("$LineLocation", term_1689);Term term_1527;
        {
          BufferSink buf_1824 = sink.context().makeBuffer();
          buf_1824.start(_M_STRING); buf_1824.literal(79);
          buf_1824.end();
          term_1527 = buf_1824.term();
        } sink.propertyNamed("$ColumnLocation", term_1527);
        sink.start(_M__sTextCons);Term term_2187;
        {
          BufferSink buf_1873 = sink.context().makeBuffer();
          buf_1873.start(_M_STRING); buf_1873.literal(1);
          buf_1873.end();
          term_2187 = buf_1873.term();
        } sink.propertyNamed("$LineLocation", term_2187);Term term_2764;
        {
          BufferSink buf_2385 = sink.context().makeBuffer();
          buf_2385.start(_M_STRING); buf_2385.literal(79);
          buf_2385.end();
          term_2764 = buf_2385.term();
        } sink.propertyNamed("$ColumnLocation", term_2764);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1959;
        {
          BufferSink buf_1703 = sink.context().makeBuffer();
          buf_1703.start(_M_STRING); buf_1703.literal(1);
          buf_1703.end();
          term_1959 = buf_1703.term();
        } sink.propertyNamed("$LineLocation", term_1959);Term term_2168;
        {
          BufferSink buf_1829 = sink.context().makeBuffer();
          buf_1829.start(_M_STRING); buf_1829.literal(83);
          buf_1829.end();
          term_2168 = buf_1829.term();
        } sink.propertyNamed("$ColumnLocation", term_2168);
        sink.start(_M__sTextCons);Term term_1688;
        {
          BufferSink buf_1429 = sink.context().makeBuffer();
          buf_1429.start(_M_STRING); buf_1429.literal(1);
          buf_1429.end();
          term_1688 = buf_1429.term();
        } sink.propertyNamed("$LineLocation", term_1688);Term term_1656;
        {
          BufferSink buf_1855 = sink.context().makeBuffer();
          buf_1855.start(_M_STRING); buf_1855.literal(83);
          buf_1855.end();
          term_1656 = buf_1855.term();
        } sink.propertyNamed("$ColumnLocation", term_1656);
        sink.start(_M__sTextEmbed);Term term_2045;
        {
          BufferSink buf_1258 = sink.context().makeBuffer();
          buf_1258.start(_M_STRING); buf_1258.literal(1);
          buf_1258.end();
          term_2045 = buf_1258.term();
        } sink.propertyNamed("$LineLocation", term_2045);Term term_1403;
        {
          BufferSink buf_1326 = sink.context().makeBuffer();
          buf_1326.start(_M_STRING); buf_1326.literal(83);
          buf_1326.end();
          term_1403 = buf_1326.term();
        } sink.propertyNamed("$ColumnLocation", term_1403);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xcontractum); sink.copy(sub_119.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1375;
        {
          BufferSink buf_2009 = sink.context().makeBuffer();
          buf_2009.start(_M_STRING); buf_2009.literal(1);
          buf_2009.end();
          term_1375 = buf_2009.term();
        } sink.propertyNamed("$LineLocation", term_1375);Term term_2402;
        {
          BufferSink buf_1138 = sink.context().makeBuffer();
          buf_1138.start(_M_STRING); buf_1138.literal(84);
          buf_1138.end();
          term_2402 = buf_1138.term();
        } sink.propertyNamed("$ColumnLocation", term_2402);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xruleDeclaration, term_1102);
  } final public static boolean _M_Crsx_xPrint_ximportDeclaration(Sink sink, int shared, int depth, Term term_1340) {
    if (depth < 2000) {
      label_38: {
        if (term_1340.descriptor() != _M_Crsx_ximportDeclaration_xA1)
        {   break label_38;
        }Term sub_187 = term_1340.sub(0).ref();
        /* #1=sub */Term sub_290 = term_1340.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1992;
        {
          BufferSink buf_1469 = sink.context().makeBuffer();
          buf_1469.start(_M_STRING); buf_1469.literal(1);
          buf_1469.end();
          term_1992 = buf_1469.term();
        } sink.propertyNamed("$LineLocation", term_1992);Term term_1645;
        {
          BufferSink buf_2209 = sink.context().makeBuffer();
          buf_2209.start(_M_STRING); buf_2209.literal(1);
          buf_2209.end();
          term_1645 = buf_2209.term();
        } sink.propertyNamed("$ColumnLocation", term_1645);
        sink.start(_M__sTextCons);Term term_1857;
        {
          BufferSink buf_2597 = sink.context().makeBuffer();
          buf_2597.start(_M_STRING); buf_2597.literal(1);
          buf_2597.end();
          term_1857 = buf_2597.term();
        } sink.propertyNamed("$LineLocation", term_1857);Term term_1320;
        {
          BufferSink buf_963 = sink.context().makeBuffer(); buf_963.start(_M_STRING); buf_963.literal(2); buf_963.end();
          term_1320 = buf_963.term();
        } sink.propertyNamed("$ColumnLocation", term_1320);
        sink.start(_M__sTextChars); sink.copy(sub_187.ref());
        sink.end();Term term_1558;
        {
          BufferSink buf_1364 = sink.context().makeBuffer();
          buf_1364.start(_M_STRING); buf_1364.literal(1);
          buf_1364.end();
          term_1558 = buf_1364.term();
        } sink.propertyNamed("$LineLocation", term_1558);Term term_1456;
        {
          BufferSink buf_1941 = sink.context().makeBuffer();
          buf_1941.start(_M_STRING); buf_1941.literal(3);
          buf_1941.end();
          term_1456 = buf_1941.term();
        } sink.propertyNamed("$ColumnLocation", term_1456);
        sink.start(_M__sTextCons);Term term_1261;
        {
          BufferSink buf_2271 = sink.context().makeBuffer();
          buf_2271.start(_M_STRING); buf_2271.literal(1);
          buf_2271.end();
          term_1261 = buf_2271.term();
        } sink.propertyNamed("$LineLocation", term_1261);Term term_1240;
        {
          BufferSink buf_1798 = sink.context().makeBuffer();
          buf_1798.start(_M_STRING); buf_1798.literal(3);
          buf_1798.end();
          term_1240 = buf_1798.term();
        } sink.propertyNamed("$ColumnLocation", term_1240);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1560;
        {
          BufferSink buf_1537 = sink.context().makeBuffer();
          buf_1537.start(_M_STRING); buf_1537.literal(1);
          buf_1537.end();
          term_1560 = buf_1537.term();
        } sink.propertyNamed("$LineLocation", term_1560);Term term_1730;
        {
          BufferSink buf_2044 = sink.context().makeBuffer();
          buf_2044.start(_M_STRING); buf_2044.literal(7);
          buf_2044.end();
          term_1730 = buf_2044.term();
        } sink.propertyNamed("$ColumnLocation", term_1730);
        sink.start(_M__sTextCons);Term term_1380;
        {
          BufferSink buf_2000 = sink.context().makeBuffer();
          buf_2000.start(_M_STRING); buf_2000.literal(1);
          buf_2000.end();
          term_1380 = buf_2000.term();
        } sink.propertyNamed("$LineLocation", term_1380);Term term_1266;
        {
          BufferSink buf_1591 = sink.context().makeBuffer();
          buf_1591.start(_M_STRING); buf_1591.literal(7);
          buf_1591.end();
          term_1266 = buf_1591.term();
        } sink.propertyNamed("$ColumnLocation", term_1266);
        sink.start(_M__sTextEmbed);Term term_2038;
        {
          BufferSink buf_1737 = sink.context().makeBuffer();
          buf_1737.start(_M_STRING); buf_1737.literal(1);
          buf_1737.end();
          term_2038 = buf_1737.term();
        } sink.propertyNamed("$LineLocation", term_2038);Term term_1776;
        {
          BufferSink buf_1913 = sink.context().makeBuffer();
          buf_1913.start(_M_STRING); buf_1913.literal(7);
          buf_1913.end();
          term_1776 = buf_1913.term();
        } sink.propertyNamed("$ColumnLocation", term_1776);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_290.ref());
        sink.end();
        sink.end();
        sink.end();Term term_2249;
        {
          BufferSink buf_2133 = sink.context().makeBuffer();
          buf_2133.start(_M_STRING); buf_2133.literal(1);
          buf_2133.end();
          term_2249 = buf_2133.term();
        } sink.propertyNamed("$LineLocation", term_2249);Term term_1876;
        {
          BufferSink buf_1296 = sink.context().makeBuffer();
          buf_1296.start(_M_STRING); buf_1296.literal(8);
          buf_1296.end();
          term_1876 = buf_1296.term();
        } sink.propertyNamed("$ColumnLocation", term_1876);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_16: {
        if (term_1340.descriptor() != _M_Crsx_ximportDeclaration_xA2)
        {   break label_16;
        }Term sub_196 = term_1340.sub(0).ref();
        /* #1=sub */Term sub_101 = term_1340.sub(1).ref();
        /* #2=sub */Term sub_106 = term_1340.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2023;
        {
          BufferSink buf_1930 = sink.context().makeBuffer();
          buf_1930.start(_M_STRING); buf_1930.literal(1);
          buf_1930.end();
          term_2023 = buf_1930.term();
        } sink.propertyNamed("$LineLocation", term_2023);Term term_2048;
        {
          BufferSink buf_2022 = sink.context().makeBuffer();
          buf_2022.start(_M_STRING); buf_2022.literal(1);
          buf_2022.end();
          term_2048 = buf_2022.term();
        } sink.propertyNamed("$ColumnLocation", term_2048);
        sink.start(_M__sTextCons);Term term_1975;
        {
          BufferSink buf_2306 = sink.context().makeBuffer();
          buf_2306.start(_M_STRING); buf_2306.literal(1);
          buf_2306.end();
          term_1975 = buf_2306.term();
        } sink.propertyNamed("$LineLocation", term_1975);Term term_1697;
        {
          BufferSink buf_1492 = sink.context().makeBuffer();
          buf_1492.start(_M_STRING); buf_1492.literal(2);
          buf_1492.end();
          term_1697 = buf_1492.term();
        } sink.propertyNamed("$ColumnLocation", term_1697);
        sink.start(_M__sTextChars); sink.copy(sub_196.ref());
        sink.end();Term term_1078;
        {
          BufferSink buf_1111 = sink.context().makeBuffer();
          buf_1111.start(_M_STRING); buf_1111.literal(1);
          buf_1111.end();
          term_1078 = buf_1111.term();
        } sink.propertyNamed("$LineLocation", term_1078);Term term_1607;
        {
          BufferSink buf_1589 = sink.context().makeBuffer();
          buf_1589.start(_M_STRING); buf_1589.literal(3);
          buf_1589.end();
          term_1607 = buf_1589.term();
        } sink.propertyNamed("$ColumnLocation", term_1607);
        sink.start(_M__sTextCons);Term term_2253;
        {
          BufferSink buf_1206 = sink.context().makeBuffer();
          buf_1206.start(_M_STRING); buf_1206.literal(1);
          buf_1206.end();
          term_2253 = buf_1206.term();
        } sink.propertyNamed("$LineLocation", term_2253);Term term_1400;
        {
          BufferSink buf_1427 = sink.context().makeBuffer();
          buf_1427.start(_M_STRING); buf_1427.literal(3);
          buf_1427.end();
          term_1400 = buf_1427.term();
        } sink.propertyNamed("$ColumnLocation", term_1400);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1829;
        {
          BufferSink buf_1526 = sink.context().makeBuffer();
          buf_1526.start(_M_STRING); buf_1526.literal(1);
          buf_1526.end();
          term_1829 = buf_1526.term();
        } sink.propertyNamed("$LineLocation", term_1829);Term term_1426;
        {
          BufferSink buf_1616 = sink.context().makeBuffer();
          buf_1616.start(_M_STRING); buf_1616.literal(7);
          buf_1616.end();
          term_1426 = buf_1616.term();
        } sink.propertyNamed("$ColumnLocation", term_1426);
        sink.start(_M__sTextCons);Term term_1687;
        {
          BufferSink buf_2156 = sink.context().makeBuffer();
          buf_2156.start(_M_STRING); buf_2156.literal(1);
          buf_2156.end();
          term_1687 = buf_2156.term();
        } sink.propertyNamed("$LineLocation", term_1687);Term term_1952;
        {
          BufferSink buf_1702 = sink.context().makeBuffer();
          buf_1702.start(_M_STRING); buf_1702.literal(8);
          buf_1702.end();
          term_1952 = buf_1702.term();
        } sink.propertyNamed("$ColumnLocation", term_1952);
        sink.start(_M__sTextChars); sink.copy(sub_101.ref());
        sink.end();Term term_1532;
        {
          BufferSink buf_1546 = sink.context().makeBuffer();
          buf_1546.start(_M_STRING); buf_1546.literal(1);
          buf_1546.end();
          term_1532 = buf_1546.term();
        } sink.propertyNamed("$LineLocation", term_1532);Term term_1728;
        {
          BufferSink buf_1489 = sink.context().makeBuffer();
          buf_1489.start(_M_STRING); buf_1489.literal(9);
          buf_1489.end();
          term_1728 = buf_1489.term();
        } sink.propertyNamed("$ColumnLocation", term_1728);
        sink.start(_M__sTextCons);Term term_1311;
        {
          BufferSink buf_2107 = sink.context().makeBuffer();
          buf_2107.start(_M_STRING); buf_2107.literal(1);
          buf_2107.end();
          term_1311 = buf_2107.term();
        } sink.propertyNamed("$LineLocation", term_1311);Term term_1512;
        {
          BufferSink buf_999 = sink.context().makeBuffer(); buf_999.start(_M_STRING); buf_999.literal(9); buf_999.end();
          term_1512 = buf_999.term();
        } sink.propertyNamed("$ColumnLocation", term_1512);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1971;
        {
          BufferSink buf_1947 = sink.context().makeBuffer();
          buf_1947.start(_M_STRING); buf_1947.literal(1);
          buf_1947.end();
          term_1971 = buf_1947.term();
        } sink.propertyNamed("$LineLocation", term_1971);Term term_1711;
        {
          BufferSink buf_1700 = sink.context().makeBuffer();
          buf_1700.start(_M_STRING); buf_1700.literal(13);
          buf_1700.end();
          term_1711 = buf_1700.term();
        } sink.propertyNamed("$ColumnLocation", term_1711);
        sink.start(_M__sTextCons);Term term_1203;
        {
          BufferSink buf_1762 = sink.context().makeBuffer();
          buf_1762.start(_M_STRING); buf_1762.literal(1);
          buf_1762.end();
          term_1203 = buf_1762.term();
        } sink.propertyNamed("$LineLocation", term_1203);Term term_2498;
        {
          BufferSink buf_2157 = sink.context().makeBuffer();
          buf_2157.start(_M_STRING); buf_2157.literal(13);
          buf_2157.end();
          term_2498 = buf_2157.term();
        } sink.propertyNamed("$ColumnLocation", term_2498);
        sink.start(_M__sTextEmbed);Term term_2398;
        {
          BufferSink buf_1017 = sink.context().makeBuffer();
          buf_1017.start(_M_STRING); buf_1017.literal(1);
          buf_1017.end();
          term_2398 = buf_1017.term();
        } sink.propertyNamed("$LineLocation", term_2398);Term term_2036;
        {
          BufferSink buf_1963 = sink.context().makeBuffer();
          buf_1963.start(_M_STRING); buf_1963.literal(13);
          buf_1963.end();
          term_2036 = buf_1963.term();
        } sink.propertyNamed("$ColumnLocation", term_2036);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_106.ref());
        sink.end();
        sink.end();
        sink.end();Term term_2278;
        {
          BufferSink buf_1536 = sink.context().makeBuffer();
          buf_1536.start(_M_STRING); buf_1536.literal(1);
          buf_1536.end();
          term_2278 = buf_1536.term();
        } sink.propertyNamed("$LineLocation", term_2278);Term term_1813;
        {
          BufferSink buf_1398 = sink.context().makeBuffer();
          buf_1398.start(_M_STRING); buf_1398.literal(14);
          buf_1398.end();
          term_1813 = buf_1398.term();
        } sink.propertyNamed("$ColumnLocation", term_1813);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_190: {
        if (term_1340.descriptor() != _M_Crsx_ximportDeclaration_xA3)
        {   break label_190;
        }Term sub_123 = term_1340.sub(0).ref();
        /* #1=sub */Term sub_297 = term_1340.sub(1).ref();
        /* #2=sub */Term sub_166 = term_1340.sub(2).ref();
        /* #3=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1174;
        {
          BufferSink buf_1807 = sink.context().makeBuffer();
          buf_1807.start(_M_STRING); buf_1807.literal(1);
          buf_1807.end();
          term_1174 = buf_1807.term();
        } sink.propertyNamed("$LineLocation", term_1174);Term term_1500;
        {
          BufferSink buf_1948 = sink.context().makeBuffer();
          buf_1948.start(_M_STRING); buf_1948.literal(1);
          buf_1948.end();
          term_1500 = buf_1948.term();
        } sink.propertyNamed("$ColumnLocation", term_1500);
        sink.start(_M__sTextCons);Term term_1482;
        {
          BufferSink buf_1619 = sink.context().makeBuffer();
          buf_1619.start(_M_STRING); buf_1619.literal(1);
          buf_1619.end();
          term_1482 = buf_1619.term();
        } sink.propertyNamed("$LineLocation", term_1482);Term term_1852;
        {
          BufferSink buf_1805 = sink.context().makeBuffer();
          buf_1805.start(_M_STRING); buf_1805.literal(2);
          buf_1805.end();
          term_1852 = buf_1805.term();
        } sink.propertyNamed("$ColumnLocation", term_1852);
        sink.start(_M__sTextChars); sink.copy(sub_123.ref());
        sink.end();Term term_1775;
        {
          BufferSink buf_1772 = sink.context().makeBuffer();
          buf_1772.start(_M_STRING); buf_1772.literal(1);
          buf_1772.end();
          term_1775 = buf_1772.term();
        } sink.propertyNamed("$LineLocation", term_1775);Term term_2133;
        {
          BufferSink buf_1313 = sink.context().makeBuffer();
          buf_1313.start(_M_STRING); buf_1313.literal(3);
          buf_1313.end();
          term_2133 = buf_1313.term();
        } sink.propertyNamed("$ColumnLocation", term_2133);
        sink.start(_M__sTextCons);Term term_2460;
        {
          BufferSink buf_2171 = sink.context().makeBuffer();
          buf_2171.start(_M_STRING); buf_2171.literal(1);
          buf_2171.end();
          term_2460 = buf_2171.term();
        } sink.propertyNamed("$LineLocation", term_2460);Term term_1881;
        {
          BufferSink buf_1335 = sink.context().makeBuffer();
          buf_1335.start(_M_STRING); buf_1335.literal(3);
          buf_1335.end();
          term_1881 = buf_1335.term();
        } sink.propertyNamed("$ColumnLocation", term_1881);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1953;
        {
          BufferSink buf_1530 = sink.context().makeBuffer();
          buf_1530.start(_M_STRING); buf_1530.literal(1);
          buf_1530.end();
          term_1953 = buf_1530.term();
        } sink.propertyNamed("$LineLocation", term_1953);Term term_1845;
        {
          BufferSink buf_2042 = sink.context().makeBuffer();
          buf_2042.start(_M_STRING); buf_2042.literal(7);
          buf_2042.end();
          term_1845 = buf_2042.term();
        } sink.propertyNamed("$ColumnLocation", term_1845);
        sink.start(_M__sTextCons);Term term_1739;
        {
          BufferSink buf_1211 = sink.context().makeBuffer();
          buf_1211.start(_M_STRING); buf_1211.literal(1);
          buf_1211.end();
          term_1739 = buf_1211.term();
        } sink.propertyNamed("$LineLocation", term_1739);Term term_1790;
        {
          BufferSink buf_1792 = sink.context().makeBuffer();
          buf_1792.start(_M_STRING); buf_1792.literal(8);
          buf_1792.end();
          term_1790 = buf_1792.term();
        } sink.propertyNamed("$ColumnLocation", term_1790);
        sink.start(_M__sTextChars); sink.copy(sub_297.ref());
        sink.end();Term term_1883;
        {
          BufferSink buf_1603 = sink.context().makeBuffer();
          buf_1603.start(_M_STRING); buf_1603.literal(1);
          buf_1603.end();
          term_1883 = buf_1603.term();
        } sink.propertyNamed("$LineLocation", term_1883);Term term_1404;
        {
          BufferSink buf_1415 = sink.context().makeBuffer();
          buf_1415.start(_M_STRING); buf_1415.literal(9);
          buf_1415.end();
          term_1404 = buf_1415.term();
        } sink.propertyNamed("$ColumnLocation", term_1404);
        sink.start(_M__sTextCons);Term term_1637;
        {
          BufferSink buf_1446 = sink.context().makeBuffer();
          buf_1446.start(_M_STRING); buf_1446.literal(1);
          buf_1446.end();
          term_1637 = buf_1446.term();
        } sink.propertyNamed("$LineLocation", term_1637);Term term_1725;
        {
          BufferSink buf_1880 = sink.context().makeBuffer();
          buf_1880.start(_M_STRING); buf_1880.literal(9);
          buf_1880.end();
          term_1725 = buf_1880.term();
        } sink.propertyNamed("$ColumnLocation", term_1725);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_2239;
        {
          BufferSink buf_2031 = sink.context().makeBuffer();
          buf_2031.start(_M_STRING); buf_2031.literal(1);
          buf_2031.end();
          term_2239 = buf_2031.term();
        } sink.propertyNamed("$LineLocation", term_2239);Term term_1938;
        {
          BufferSink buf_1678 = sink.context().makeBuffer();
          buf_1678.start(_M_STRING); buf_1678.literal(13);
          buf_1678.end();
          term_1938 = buf_1678.term();
        } sink.propertyNamed("$ColumnLocation", term_1938);
        sink.start(_M__sTextCons);Term term_2200;
        {
          BufferSink buf_1723 = sink.context().makeBuffer();
          buf_1723.start(_M_STRING); buf_1723.literal(1);
          buf_1723.end();
          term_2200 = buf_1723.term();
        } sink.propertyNamed("$LineLocation", term_2200);Term term_1709;
        {
          BufferSink buf_2164 = sink.context().makeBuffer();
          buf_2164.start(_M_STRING); buf_2164.literal(13);
          buf_2164.end();
          term_1709 = buf_2164.term();
        } sink.propertyNamed("$ColumnLocation", term_1709);
        sink.start(_M__sTextEmbed);Term term_1927;
        {
          BufferSink buf_1654 = sink.context().makeBuffer();
          buf_1654.start(_M_STRING); buf_1654.literal(1);
          buf_1654.end();
          term_1927 = buf_1654.term();
        } sink.propertyNamed("$LineLocation", term_1927);Term term_1923;
        {
          BufferSink buf_2284 = sink.context().makeBuffer();
          buf_2284.start(_M_STRING); buf_2284.literal(13);
          buf_2284.end();
          term_1923 = buf_2284.term();
        } sink.propertyNamed("$ColumnLocation", term_1923);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xconstructor); sink.copy(sub_166.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1928;
        {
          BufferSink buf_2249 = sink.context().makeBuffer();
          buf_2249.start(_M_STRING); buf_2249.literal(1);
          buf_2249.end();
          term_1928 = buf_2249.term();
        } sink.propertyNamed("$LineLocation", term_1928);Term term_2185;
        {
          BufferSink buf_2036 = sink.context().makeBuffer();
          buf_2036.start(_M_STRING); buf_2036.literal(14);
          buf_2036.end();
          term_2185 = buf_2036.term();
        } sink.propertyNamed("$ColumnLocation", term_2185);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_ximportDeclaration, term_1340);
  } final public static boolean _M_Crsx_xPrint_xmoduleDeclaration(Sink sink, int shared, int depth, Term term_1764) {
    if (depth < 2000) {
      label_81: {
        if (term_1764.descriptor() != _M_Crsx_xmoduleDeclaration)
        {   break label_81;
        }Term sub_547 = term_1764.sub(0).ref();
        /* #1=sub */Term sub_244 = term_1764.sub(1).ref();
        /* #2=sub */Term sub_226 = term_1764.sub(2).ref();
        /* #3=sub */Term sub_482 = term_1764.sub(3).ref();
        /* #4=sub */Term sub_130 = term_1764.sub(4).ref();
        /* #5=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2502;
        {
          BufferSink buf_2100 = sink.context().makeBuffer();
          buf_2100.start(_M_STRING); buf_2100.literal(1);
          buf_2100.end();
          term_2502 = buf_2100.term();
        } sink.propertyNamed("$LineLocation", term_2502);Term term_2146;
        {
          BufferSink buf_1442 = sink.context().makeBuffer();
          buf_1442.start(_M_STRING); buf_1442.literal(1);
          buf_1442.end();
          term_2146 = buf_1442.term();
        } sink.propertyNamed("$ColumnLocation", term_2146);
        sink.start(_M__sTextCons);Term term_1747;
        {
          BufferSink buf_1253 = sink.context().makeBuffer();
          buf_1253.start(_M_STRING); buf_1253.literal(1);
          buf_1253.end();
          term_1747 = buf_1253.term();
        } sink.propertyNamed("$LineLocation", term_1747);Term term_1941;
        {
          BufferSink buf_1787 = sink.context().makeBuffer();
          buf_1787.start(_M_STRING); buf_1787.literal(2);
          buf_1787.end();
          term_1941 = buf_1787.term();
        } sink.propertyNamed("$ColumnLocation", term_1941);
        sink.start(_M__sTextChars); sink.copy(sub_547.ref());
        sink.end();Term term_2101;
        {
          BufferSink buf_1331 = sink.context().makeBuffer();
          buf_1331.start(_M_STRING); buf_1331.literal(1);
          buf_1331.end();
          term_2101 = buf_1331.term();
        } sink.propertyNamed("$LineLocation", term_2101);Term term_1946;
        {
          BufferSink buf_2294 = sink.context().makeBuffer();
          buf_2294.start(_M_STRING); buf_2294.literal(3);
          buf_2294.end();
          term_1946 = buf_2294.term();
        } sink.propertyNamed("$ColumnLocation", term_1946);
        sink.start(_M__sTextCons);Term term_1847;
        {
          BufferSink buf_1316 = sink.context().makeBuffer();
          buf_1316.start(_M_STRING); buf_1316.literal(1);
          buf_1316.end();
          term_1847 = buf_1316.term();
        } sink.propertyNamed("$LineLocation", term_1847);Term term_1973;
        {
          BufferSink buf_1627 = sink.context().makeBuffer();
          buf_1627.start(_M_STRING); buf_1627.literal(3);
          buf_1627.end();
          term_1973 = buf_1627.term();
        } sink.propertyNamed("$ColumnLocation", term_1973);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1123;
        {
          BufferSink buf_1951 = sink.context().makeBuffer();
          buf_1951.start(_M_STRING); buf_1951.literal(1);
          buf_1951.end();
          term_1123 = buf_1951.term();
        } sink.propertyNamed("$LineLocation", term_1123);Term term_1206;
        {
          BufferSink buf_1236 = sink.context().makeBuffer();
          buf_1236.start(_M_STRING); buf_1236.literal(7);
          buf_1236.end();
          term_1206 = buf_1236.term();
        } sink.propertyNamed("$ColumnLocation", term_1206);
        sink.start(_M__sTextCons);Term term_1363;
        {
          BufferSink buf_1496 = sink.context().makeBuffer();
          buf_1496.start(_M_STRING); buf_1496.literal(1);
          buf_1496.end();
          term_1363 = buf_1496.term();
        } sink.propertyNamed("$LineLocation", term_1363);Term term_1215;
        {
          BufferSink buf_1817 = sink.context().makeBuffer();
          buf_1817.start(_M_STRING); buf_1817.literal(8);
          buf_1817.end();
          term_1215 = buf_1817.term();
        } sink.propertyNamed("$ColumnLocation", term_1215);
        sink.start(_M__sTextChars); sink.copy(sub_244.ref());
        sink.end();Term term_1132;
        {
          BufferSink buf_1985 = sink.context().makeBuffer();
          buf_1985.start(_M_STRING); buf_1985.literal(1);
          buf_1985.end();
          term_1132 = buf_1985.term();
        } sink.propertyNamed("$LineLocation", term_1132);Term term_1916;
        {
          BufferSink buf_1571 = sink.context().makeBuffer();
          buf_1571.start(_M_STRING); buf_1571.literal(9);
          buf_1571.end();
          term_1916 = buf_1571.term();
        } sink.propertyNamed("$ColumnLocation", term_1916);
        sink.start(_M__sTextCons);Term term_1234;
        {
          BufferSink buf_1500 = sink.context().makeBuffer();
          buf_1500.start(_M_STRING); buf_1500.literal(1);
          buf_1500.end();
          term_1234 = buf_1500.term();
        } sink.propertyNamed("$LineLocation", term_1234);Term term_2077;
        {
          BufferSink buf_1159 = sink.context().makeBuffer();
          buf_1159.start(_M_STRING); buf_1159.literal(9);
          buf_1159.end();
          term_2077 = buf_1159.term();
        } sink.propertyNamed("$ColumnLocation", term_2077);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1984;
        {
          BufferSink buf_1647 = sink.context().makeBuffer();
          buf_1647.start(_M_STRING); buf_1647.literal(1);
          buf_1647.end();
          term_1984 = buf_1647.term();
        } sink.propertyNamed("$LineLocation", term_1984);Term term_2296;
        {
          BufferSink buf_1652 = sink.context().makeBuffer();
          buf_1652.start(_M_STRING); buf_1652.literal(13);
          buf_1652.end();
          term_2296 = buf_1652.term();
        } sink.propertyNamed("$ColumnLocation", term_2296);
        sink.start(_M__sTextCons);Term term_1943;
        {
          BufferSink buf_1896 = sink.context().makeBuffer();
          buf_1896.start(_M_STRING); buf_1896.literal(1);
          buf_1896.end();
          term_1943 = buf_1896.term();
        } sink.propertyNamed("$LineLocation", term_1943);Term term_1668;
        {
          BufferSink buf_1281 = sink.context().makeBuffer();
          buf_1281.start(_M_STRING); buf_1281.literal(14);
          buf_1281.end();
          term_1668 = buf_1281.term();
        } sink.propertyNamed("$ColumnLocation", term_1668);
        sink.start(_M__sTextChars); sink.copy(sub_226.ref());
        sink.end();Term term_1474;
        {
          BufferSink buf_1727 = sink.context().makeBuffer();
          buf_1727.start(_M_STRING); buf_1727.literal(1);
          buf_1727.end();
          term_1474 = buf_1727.term();
        } sink.propertyNamed("$LineLocation", term_1474);Term term_1597;
        {
          BufferSink buf_2365 = sink.context().makeBuffer();
          buf_2365.start(_M_STRING); buf_2365.literal(15);
          buf_2365.end();
          term_1597 = buf_2365.term();
        } sink.propertyNamed("$ColumnLocation", term_1597);
        sink.start(_M__sTextCons);Term term_1789;
        {
          BufferSink buf_2459 = sink.context().makeBuffer();
          buf_2459.start(_M_STRING); buf_2459.literal(1);
          buf_2459.end();
          term_1789 = buf_2459.term();
        } sink.propertyNamed("$LineLocation", term_1789);Term term_2042;
        {
          BufferSink buf_2034 = sink.context().makeBuffer();
          buf_2034.start(_M_STRING); buf_2034.literal(15);
          buf_2034.end();
          term_2042 = buf_2034.term();
        } sink.propertyNamed("$ColumnLocation", term_2042);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_2091;
        {
          BufferSink buf_1958 = sink.context().makeBuffer();
          buf_1958.start(_M_STRING); buf_1958.literal(1);
          buf_1958.end();
          term_2091 = buf_1958.term();
        } sink.propertyNamed("$LineLocation", term_2091);Term term_1090;
        {
          BufferSink buf_1736 = sink.context().makeBuffer();
          buf_1736.start(_M_STRING); buf_1736.literal(19);
          buf_1736.end();
          term_1090 = buf_1736.term();
        } sink.propertyNamed("$ColumnLocation", term_1090);
        sink.start(_M__sTextCons);Term term_2271;
        {
          BufferSink buf_1933 = sink.context().makeBuffer();
          buf_1933.start(_M_STRING); buf_1933.literal(1);
          buf_1933.end();
          term_2271 = buf_1933.term();
        } sink.propertyNamed("$LineLocation", term_2271);Term term_1638;
        {
          BufferSink buf_1622 = sink.context().makeBuffer();
          buf_1622.start(_M_STRING); buf_1622.literal(19);
          buf_1622.end();
          term_1638 = buf_1622.term();
        } sink.propertyNamed("$ColumnLocation", term_1638);
        sink.start(_M__sTextEmbed);Term term_1985;
        {
          BufferSink buf_1660 = sink.context().makeBuffer();
          buf_1660.start(_M_STRING); buf_1660.literal(1);
          buf_1660.end();
          term_1985 = buf_1660.term();
        } sink.propertyNamed("$LineLocation", term_1985);Term term_1935;
        {
          BufferSink buf_1704 = sink.context().makeBuffer();
          buf_1704.start(_M_STRING); buf_1704.literal(19);
          buf_1704.end();
          term_1935 = buf_1704.term();
        } sink.propertyNamed("$ColumnLocation", term_1935);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdeclarations); sink.copy(sub_482.ref());
        sink.end();
        sink.end();
        sink.end();Term term_2629;
        {
          BufferSink buf_1632 = sink.context().makeBuffer();
          buf_1632.start(_M_STRING); buf_1632.literal(1);
          buf_1632.end();
          term_2629 = buf_1632.term();
        } sink.propertyNamed("$LineLocation", term_2629);Term term_1417;
        {
          BufferSink buf_1354 = sink.context().makeBuffer();
          buf_1354.start(_M_STRING); buf_1354.literal(20);
          buf_1354.end();
          term_1417 = buf_1354.term();
        } sink.propertyNamed("$ColumnLocation", term_1417);
        sink.start(_M__sTextCons);Term term_2018;
        {
          BufferSink buf_2054 = sink.context().makeBuffer();
          buf_2054.start(_M_STRING); buf_2054.literal(1);
          buf_2054.end();
          term_2018 = buf_2054.term();
        } sink.propertyNamed("$LineLocation", term_2018);Term term_1422;
        {
          BufferSink buf_1648 = sink.context().makeBuffer();
          buf_1648.start(_M_STRING); buf_1648.literal(20);
          buf_1648.end();
          term_1422 = buf_1648.term();
        } sink.propertyNamed("$ColumnLocation", term_1422);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_2608;
        {
          BufferSink buf_1618 = sink.context().makeBuffer();
          buf_1618.start(_M_STRING); buf_1618.literal(1);
          buf_1618.end();
          term_2608 = buf_1618.term();
        } sink.propertyNamed("$LineLocation", term_2608);Term term_1705;
        {
          BufferSink buf_2043 = sink.context().makeBuffer();
          buf_2043.start(_M_STRING); buf_2043.literal(49);
          buf_2043.end();
          term_1705 = buf_2043.term();
        } sink.propertyNamed("$ColumnLocation", term_1705);
        sink.start(_M__sTextCons);Term term_1719;
        {
          BufferSink buf_1809 = sink.context().makeBuffer();
          buf_1809.start(_M_STRING); buf_1809.literal(1);
          buf_1809.end();
          term_1719 = buf_1809.term();
        } sink.propertyNamed("$LineLocation", term_1719);Term term_1964;
        {
          BufferSink buf_1712 = sink.context().makeBuffer();
          buf_1712.start(_M_STRING); buf_1712.literal(50);
          buf_1712.end();
          term_1964 = buf_1712.term();
        } sink.propertyNamed("$ColumnLocation", term_1964);
        sink.start(_M__sTextChars); sink.copy(sub_130.ref());
        sink.end();Term term_1568;
        {
          BufferSink buf_1813 = sink.context().makeBuffer();
          buf_1813.start(_M_STRING); buf_1813.literal(1);
          buf_1813.end();
          term_1568 = buf_1813.term();
        } sink.propertyNamed("$LineLocation", term_1568);Term term_1531;
        {
          BufferSink buf_2298 = sink.context().makeBuffer();
          buf_2298.start(_M_STRING); buf_2298.literal(51);
          buf_2298.end();
          term_1531 = buf_2298.term();
        } sink.propertyNamed("$ColumnLocation", term_1531);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xmoduleDeclaration, term_1764);
  } final public static boolean _M_Crsx_xPrint_xdeclaration(Sink sink, int shared, int depth, Term term_1962) {
    if (depth < 2000) {
      label_433: {
        if (term_1962.descriptor() != _M_Crsx_xdeclaration_xA1)
        {   break label_433;
        }Term sub_216 = term_1962.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1784;
        {
          BufferSink buf_2453 = sink.context().makeBuffer();
          buf_2453.start(_M_STRING); buf_2453.literal(1);
          buf_2453.end();
          term_1784 = buf_2453.term();
        } sink.propertyNamed("$LineLocation", term_1784);Term term_1552;
        {
          BufferSink buf_1815 = sink.context().makeBuffer();
          buf_1815.start(_M_STRING); buf_1815.literal(1);
          buf_1815.end();
          term_1552 = buf_1815.term();
        } sink.propertyNamed("$ColumnLocation", term_1552);
        sink.start(_M__sTextCons);Term term_2040;
        {
          BufferSink buf_1689 = sink.context().makeBuffer();
          buf_1689.start(_M_STRING); buf_1689.literal(1);
          buf_1689.end();
          term_2040 = buf_1689.term();
        } sink.propertyNamed("$LineLocation", term_2040);Term term_2140;
        {
          BufferSink buf_2038 = sink.context().makeBuffer();
          buf_2038.start(_M_STRING); buf_2038.literal(1);
          buf_2038.end();
          term_2140 = buf_2038.term();
        } sink.propertyNamed("$ColumnLocation", term_2140);
        sink.start(_M__sTextEmbed);Term term_1570;
        {
          BufferSink buf_1561 = sink.context().makeBuffer();
          buf_1561.start(_M_STRING); buf_1561.literal(1);
          buf_1561.end();
          term_1570 = buf_1561.term();
        } sink.propertyNamed("$LineLocation", term_1570);Term term_2135;
        {
          BufferSink buf_1745 = sink.context().makeBuffer();
          buf_1745.start(_M_STRING); buf_1745.literal(1);
          buf_1745.end();
          term_2135 = buf_1745.term();
        } sink.propertyNamed("$ColumnLocation", term_2135);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xmoduleDeclaration); sink.copy(sub_216.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1533;
        {
          BufferSink buf_1872 = sink.context().makeBuffer();
          buf_1872.start(_M_STRING); buf_1872.literal(1);
          buf_1872.end();
          term_1533 = buf_1872.term();
        } sink.propertyNamed("$LineLocation", term_1533);Term term_1855;
        {
          BufferSink buf_1756 = sink.context().makeBuffer();
          buf_1756.start(_M_STRING); buf_1756.literal(2);
          buf_1756.end();
          term_1855 = buf_1756.term();
        } sink.propertyNamed("$ColumnLocation", term_1855);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_147: {
        if (term_1962.descriptor() != _M_Crsx_xdeclaration_xA2)
        {   break label_147;
        }Term sub_262 = term_1962.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1571;
        {
          BufferSink buf_1274 = sink.context().makeBuffer();
          buf_1274.start(_M_STRING); buf_1274.literal(1);
          buf_1274.end();
          term_1571 = buf_1274.term();
        } sink.propertyNamed("$LineLocation", term_1571);Term term_2126;
        {
          BufferSink buf_936 = sink.context().makeBuffer(); buf_936.start(_M_STRING); buf_936.literal(1); buf_936.end();
          term_2126 = buf_936.term();
        } sink.propertyNamed("$ColumnLocation", term_2126);
        sink.start(_M__sTextCons);Term term_1712;
        {
          BufferSink buf_1972 = sink.context().makeBuffer();
          buf_1972.start(_M_STRING); buf_1972.literal(1);
          buf_1972.end();
          term_1712 = buf_1972.term();
        } sink.propertyNamed("$LineLocation", term_1712);Term term_2538;
        {
          BufferSink buf_1617 = sink.context().makeBuffer();
          buf_1617.start(_M_STRING); buf_1617.literal(1);
          buf_1617.end();
          term_2538 = buf_1617.term();
        } sink.propertyNamed("$ColumnLocation", term_2538);
        sink.start(_M__sTextEmbed);Term term_1617;
        {
          BufferSink buf_2361 = sink.context().makeBuffer();
          buf_2361.start(_M_STRING); buf_2361.literal(1);
          buf_2361.end();
          term_1617 = buf_2361.term();
        } sink.propertyNamed("$LineLocation", term_1617);Term term_1960;
        {
          BufferSink buf_1841 = sink.context().makeBuffer();
          buf_1841.start(_M_STRING); buf_1841.literal(1);
          buf_1841.end();
          term_1960 = buf_1841.term();
        } sink.propertyNamed("$ColumnLocation", term_1960);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_ximportDeclaration); sink.copy(sub_262.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1223;
        {
          BufferSink buf_1927 = sink.context().makeBuffer();
          buf_1927.start(_M_STRING); buf_1927.literal(1);
          buf_1927.end();
          term_1223 = buf_1927.term();
        } sink.propertyNamed("$LineLocation", term_1223);Term term_2150;
        {
          BufferSink buf_1488 = sink.context().makeBuffer();
          buf_1488.start(_M_STRING); buf_1488.literal(2);
          buf_1488.end();
          term_2150 = buf_1488.term();
        } sink.propertyNamed("$ColumnLocation", term_2150);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_282: {
        if (term_1962.descriptor() != _M_Crsx_xdeclaration_xA3)
        {   break label_282;
        }Term sub_348 = term_1962.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2134;
        {
          BufferSink buf_1598 = sink.context().makeBuffer();
          buf_1598.start(_M_STRING); buf_1598.literal(1);
          buf_1598.end();
          term_2134 = buf_1598.term();
        } sink.propertyNamed("$LineLocation", term_2134);Term term_1115;
        {
          BufferSink buf_1370 = sink.context().makeBuffer();
          buf_1370.start(_M_STRING); buf_1370.literal(1);
          buf_1370.end();
          term_1115 = buf_1370.term();
        } sink.propertyNamed("$ColumnLocation", term_1115);
        sink.start(_M__sTextCons);Term term_1939;
        {
          BufferSink buf_2032 = sink.context().makeBuffer();
          buf_2032.start(_M_STRING); buf_2032.literal(1);
          buf_2032.end();
          term_1939 = buf_2032.term();
        } sink.propertyNamed("$LineLocation", term_1939);Term term_1539;
        {
          BufferSink buf_1789 = sink.context().makeBuffer();
          buf_1789.start(_M_STRING); buf_1789.literal(1);
          buf_1789.end();
          term_1539 = buf_1789.term();
        } sink.propertyNamed("$ColumnLocation", term_1539);
        sink.start(_M__sTextEmbed);Term term_2290;
        {
          BufferSink buf_1417 = sink.context().makeBuffer();
          buf_1417.start(_M_STRING); buf_1417.literal(1);
          buf_1417.end();
          term_2290 = buf_1417.term();
        } sink.propertyNamed("$LineLocation", term_2290);Term term_1636;
        {
          BufferSink buf_2131 = sink.context().makeBuffer();
          buf_2131.start(_M_STRING); buf_2131.literal(1);
          buf_2131.end();
          term_1636 = buf_2131.term();
        } sink.propertyNamed("$ColumnLocation", term_1636);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xruleDeclaration); sink.copy(sub_348.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1955;
        {
          BufferSink buf_1592 = sink.context().makeBuffer();
          buf_1592.start(_M_STRING); buf_1592.literal(1);
          buf_1592.end();
          term_1955 = buf_1592.term();
        } sink.propertyNamed("$LineLocation", term_1955);Term term_1768;
        {
          BufferSink buf_2390 = sink.context().makeBuffer();
          buf_2390.start(_M_STRING); buf_2390.literal(2);
          buf_2390.end();
          term_1768 = buf_2390.term();
        } sink.propertyNamed("$ColumnLocation", term_1768);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_199: {
        if (term_1962.descriptor() != _M_Crsx_xdeclaration_xA4)
        {   break label_199;
        }Term sub_312 = term_1962.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2066;
        {
          BufferSink buf_1584 = sink.context().makeBuffer();
          buf_1584.start(_M_STRING); buf_1584.literal(1);
          buf_1584.end();
          term_2066 = buf_1584.term();
        } sink.propertyNamed("$LineLocation", term_2066);Term term_1694;
        {
          BufferSink buf_1521 = sink.context().makeBuffer();
          buf_1521.start(_M_STRING); buf_1521.literal(1);
          buf_1521.end();
          term_1694 = buf_1521.term();
        } sink.propertyNamed("$ColumnLocation", term_1694);
        sink.start(_M__sTextCons);Term term_2486;
        {
          BufferSink buf_2053 = sink.context().makeBuffer();
          buf_2053.start(_M_STRING); buf_2053.literal(1);
          buf_2053.end();
          term_2486 = buf_2053.term();
        } sink.propertyNamed("$LineLocation", term_2486);Term term_1663;
        {
          BufferSink buf_1578 = sink.context().makeBuffer();
          buf_1578.start(_M_STRING); buf_1578.literal(1);
          buf_1578.end();
          term_1663 = buf_1578.term();
        } sink.propertyNamed("$ColumnLocation", term_1663);
        sink.start(_M__sTextEmbed);Term term_1542;
        {
          BufferSink buf_1991 = sink.context().makeBuffer();
          buf_1991.start(_M_STRING); buf_1991.literal(1);
          buf_1991.end();
          term_1542 = buf_1991.term();
        } sink.propertyNamed("$LineLocation", term_1542);Term term_1682;
        {
          BufferSink buf_2237 = sink.context().makeBuffer();
          buf_2237.start(_M_STRING); buf_2237.literal(1);
          buf_2237.end();
          term_1682 = buf_2237.term();
        } sink.propertyNamed("$ColumnLocation", term_1682);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xsortDeclaration); sink.copy(sub_312.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1802;
        {
          BufferSink buf_1903 = sink.context().makeBuffer();
          buf_1903.start(_M_STRING); buf_1903.literal(1);
          buf_1903.end();
          term_1802 = buf_1903.term();
        } sink.propertyNamed("$LineLocation", term_1802);Term term_1848;
        {
          BufferSink buf_2020 = sink.context().makeBuffer();
          buf_2020.start(_M_STRING); buf_2020.literal(2);
          buf_2020.end();
          term_1848 = buf_2020.term();
        } sink.propertyNamed("$ColumnLocation", term_1848);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_194: {
        if (term_1962.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_194;
        }Term sub_233 = term_1962.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1455;
        {
          BufferSink buf_2664 = sink.context().makeBuffer();
          buf_2664.start(_M_STRING); buf_2664.literal(1);
          buf_2664.end();
          term_1455 = buf_2664.term();
        } sink.propertyNamed("$LineLocation", term_1455);Term term_1392;
        {
          BufferSink buf_1230 = sink.context().makeBuffer();
          buf_1230.start(_M_STRING); buf_1230.literal(1);
          buf_1230.end();
          term_1392 = buf_1230.term();
        } sink.propertyNamed("$ColumnLocation", term_1392);
        sink.start(_M__sTextCons);Term term_2345;
        {
          BufferSink buf_1978 = sink.context().makeBuffer();
          buf_1978.start(_M_STRING); buf_1978.literal(1);
          buf_1978.end();
          term_2345 = buf_1978.term();
        } sink.propertyNamed("$LineLocation", term_2345);Term term_2211;
        {
          BufferSink buf_1758 = sink.context().makeBuffer();
          buf_1758.start(_M_STRING); buf_1758.literal(1);
          buf_1758.end();
          term_2211 = buf_1758.term();
        } sink.propertyNamed("$ColumnLocation", term_2211);
        sink.start(_M__sTextEmbed);Term term_2505;
        {
          BufferSink buf_1726 = sink.context().makeBuffer();
          buf_1726.start(_M_STRING); buf_1726.literal(1);
          buf_1726.end();
          term_2505 = buf_1726.term();
        } sink.propertyNamed("$LineLocation", term_2505);Term term_1921;
        {
          BufferSink buf_2824 = sink.context().makeBuffer();
          buf_2824.start(_M_STRING); buf_2824.literal(1);
          buf_2824.end();
          term_1921 = buf_2824.term();
        } sink.propertyNamed("$ColumnLocation", term_1921);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdirective); sink.copy(sub_233.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1794;
        {
          BufferSink buf_3130 = sink.context().makeBuffer();
          buf_3130.start(_M_STRING); buf_3130.literal(1);
          buf_3130.end();
          term_1794 = buf_3130.term();
        } sink.propertyNamed("$LineLocation", term_1794);Term term_1982;
        {
          BufferSink buf_1197 = sink.context().makeBuffer();
          buf_1197.start(_M_STRING); buf_1197.literal(2);
          buf_1197.end();
          term_1982 = buf_1197.term();
        } sink.propertyNamed("$ColumnLocation", term_1982);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdeclaration, term_1962);
  } final public static boolean _M_Crsx_xPrint_xdeclarations_xS1(Sink sink, int shared, int depth, Term term_1337) {
    if (depth < 2000) {
      label_29: {
        if (term_1337.descriptor() != _M_Crsx_xdeclarations_xS1)
        {   break label_29;
        }Term sub_326 = term_1337.sub(0).ref();
        /* #1=sub */Term sub_363 = term_1337.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2679;
        {
          BufferSink buf_2118 = sink.context().makeBuffer();
          buf_2118.start(_M_STRING); buf_2118.literal(1);
          buf_2118.end();
          term_2679 = buf_2118.term();
        } sink.propertyNamed("$LineLocation", term_2679);Term term_1904;
        {
          BufferSink buf_1315 = sink.context().makeBuffer();
          buf_1315.start(_M_STRING); buf_1315.literal(1);
          buf_1315.end();
          term_1904 = buf_1315.term();
        } sink.propertyNamed("$ColumnLocation", term_1904);
        sink.start(_M__sTextCons);Term term_1940;
        {
          BufferSink buf_1524 = sink.context().makeBuffer();
          buf_1524.start(_M_STRING); buf_1524.literal(1);
          buf_1524.end();
          term_1940 = buf_1524.term();
        } sink.propertyNamed("$LineLocation", term_1940);Term term_1650;
        {
          BufferSink buf_1755 = sink.context().makeBuffer();
          buf_1755.start(_M_STRING); buf_1755.literal(2);
          buf_1755.end();
          term_1650 = buf_1755.term();
        } sink.propertyNamed("$ColumnLocation", term_1650);
        sink.start(_M__sTextChars); sink.copy(sub_326.ref());
        sink.end();Term term_1661;
        {
          BufferSink buf_1864 = sink.context().makeBuffer();
          buf_1864.start(_M_STRING); buf_1864.literal(1);
          buf_1864.end();
          term_1661 = buf_1864.term();
        } sink.propertyNamed("$LineLocation", term_1661);Term term_2641;
        {
          BufferSink buf_1562 = sink.context().makeBuffer();
          buf_1562.start(_M_STRING); buf_1562.literal(3);
          buf_1562.end();
          term_2641 = buf_1562.term();
        } sink.propertyNamed("$ColumnLocation", term_2641);
        sink.start(_M__sTextCons);Term term_1996;
        {
          BufferSink buf_1875 = sink.context().makeBuffer();
          buf_1875.start(_M_STRING); buf_1875.literal(1);
          buf_1875.end();
          term_1996 = buf_1875.term();
        } sink.propertyNamed("$LineLocation", term_1996);Term term_2499;
        {
          BufferSink buf_1630 = sink.context().makeBuffer();
          buf_1630.start(_M_STRING); buf_1630.literal(3);
          buf_1630.end();
          term_2499 = buf_1630.term();
        } sink.propertyNamed("$ColumnLocation", term_2499);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_2670;
        {
          BufferSink buf_1422 = sink.context().makeBuffer();
          buf_1422.start(_M_STRING); buf_1422.literal(1);
          buf_1422.end();
          term_2670 = buf_1422.term();
        } sink.propertyNamed("$LineLocation", term_2670);Term term_1167;
        {
          BufferSink buf_1657 = sink.context().makeBuffer();
          buf_1657.start(_M_STRING); buf_1657.literal(7);
          buf_1657.end();
          term_1167 = buf_1657.term();
        } sink.propertyNamed("$ColumnLocation", term_1167);
        sink.start(_M__sTextCons);Term term_2288;
        {
          BufferSink buf_2215 = sink.context().makeBuffer();
          buf_2215.start(_M_STRING); buf_2215.literal(1);
          buf_2215.end();
          term_2288 = buf_2215.term();
        } sink.propertyNamed("$LineLocation", term_2288);Term term_1865;
        {
          BufferSink buf_1406 = sink.context().makeBuffer();
          buf_1406.start(_M_STRING); buf_1406.literal(7);
          buf_1406.end();
          term_1865 = buf_1406.term();
        } sink.propertyNamed("$ColumnLocation", term_1865);
        sink.start(_M__sTextEmbed);Term term_2371;
        {
          BufferSink buf_2252 = sink.context().makeBuffer();
          buf_2252.start(_M_STRING); buf_2252.literal(1);
          buf_2252.end();
          term_2371 = buf_2252.term();
        } sink.propertyNamed("$LineLocation", term_2371);Term term_1415;
        {
          BufferSink buf_1484 = sink.context().makeBuffer();
          buf_1484.start(_M_STRING); buf_1484.literal(7);
          buf_1484.end();
          term_1415 = buf_1484.term();
        } sink.propertyNamed("$ColumnLocation", term_1415);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_7 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_7});
        sink.start(_M_Crsx_xPrint_xdeclaration); sink.use(var_7);
        sink.end(); sink.copy(sub_363.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1521;
        {
          BufferSink buf_1545 = sink.context().makeBuffer();
          buf_1545.start(_M_STRING); buf_1545.literal(1);
          buf_1545.end();
          term_1521 = buf_1545.term();
        } sink.propertyNamed("$LineLocation", term_1521);Term term_1717;
        {
          BufferSink buf_1629 = sink.context().makeBuffer();
          buf_1629.start(_M_STRING); buf_1629.literal(59);
          buf_1629.end();
          term_1717 = buf_1629.term();
        } sink.propertyNamed("$ColumnLocation", term_1717);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_1643;
        {
          BufferSink buf_1471 = sink.context().makeBuffer();
          buf_1471.start(_M_STRING); buf_1471.literal(1);
          buf_1471.end();
          term_1643 = buf_1471.term();
        } sink.propertyNamed("$LineLocation", term_1643);Term term_2033;
        {
          BufferSink buf_937 = sink.context().makeBuffer(); buf_937.start(_M_STRING); buf_937.literal(8); buf_937.end();
          term_2033 = buf_937.term();
        } sink.propertyNamed("$ColumnLocation", term_2033);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdeclarations_xS1, term_1337);
  } final public static boolean _M_Crsx_xPrint_xdeclarations(Sink sink, int shared, int depth, Term term_1488) {
    if (depth < 2000) {
      label_95: {
        if (term_1488.descriptor() != _M_Crsx_xdeclarations)
        {   break label_95;
        }Term sub_16 = term_1488.sub(0).ref();
        /* #1=sub */Term sub_164 = term_1488.sub(1).ref();
        /* #2=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1738;
        {
          BufferSink buf_1763 = sink.context().makeBuffer();
          buf_1763.start(_M_STRING); buf_1763.literal(1);
          buf_1763.end();
          term_1738 = buf_1763.term();
        } sink.propertyNamed("$LineLocation", term_1738);Term term_1991;
        {
          BufferSink buf_2300 = sink.context().makeBuffer();
          buf_2300.start(_M_STRING); buf_2300.literal(1);
          buf_2300.end();
          term_1991 = buf_2300.term();
        } sink.propertyNamed("$ColumnLocation", term_1991);
        sink.start(_M__sTextCons);Term term_1791;
        {
          BufferSink buf_2199 = sink.context().makeBuffer();
          buf_2199.start(_M_STRING); buf_2199.literal(1);
          buf_2199.end();
          term_1791 = buf_2199.term();
        } sink.propertyNamed("$LineLocation", term_1791);Term term_1884;
        {
          BufferSink buf_1746 = sink.context().makeBuffer();
          buf_1746.start(_M_STRING); buf_1746.literal(1);
          buf_1746.end();
          term_1884 = buf_1746.term();
        } sink.propertyNamed("$ColumnLocation", term_1884);
        sink.start(_M__sTextEmbed);Term term_1804;
        {
          BufferSink buf_1950 = sink.context().makeBuffer();
          buf_1950.start(_M_STRING); buf_1950.literal(1);
          buf_1950.end();
          term_1804 = buf_1950.term();
        } sink.propertyNamed("$LineLocation", term_1804);Term term_1670;
        {
          BufferSink buf_2256 = sink.context().makeBuffer();
          buf_2256.start(_M_STRING); buf_2256.literal(1);
          buf_2256.end();
          term_1670 = buf_2256.term();
        } sink.propertyNamed("$ColumnLocation", term_1670);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdeclaration); sink.copy(sub_16.ref());
        sink.end();
        sink.end();
        sink.end();Term term_2227;
        {
          BufferSink buf_1760 = sink.context().makeBuffer();
          buf_1760.start(_M_STRING); buf_1760.literal(1);
          buf_1760.end();
          term_2227 = buf_1760.term();
        } sink.propertyNamed("$LineLocation", term_2227);Term term_1626;
        {
          BufferSink buf_2328 = sink.context().makeBuffer();
          buf_2328.start(_M_STRING); buf_2328.literal(2);
          buf_2328.end();
          term_1626 = buf_2328.term();
        } sink.propertyNamed("$ColumnLocation", term_1626);
        sink.start(_M__sTextCons);Term term_1859;
        {
          BufferSink buf_2002 = sink.context().makeBuffer();
          buf_2002.start(_M_STRING); buf_2002.literal(1);
          buf_2002.end();
          term_1859 = buf_2002.term();
        } sink.propertyNamed("$LineLocation", term_1859);Term term_1514;
        {
          BufferSink buf_2310 = sink.context().makeBuffer();
          buf_2310.start(_M_STRING); buf_2310.literal(2);
          buf_2310.end();
          term_1514 = buf_2310.term();
        } sink.propertyNamed("$ColumnLocation", term_1514);
        sink.start(_M__sTextChars); sink.literal(" ");
        sink.end();Term term_1801;
        {
          BufferSink buf_1409 = sink.context().makeBuffer();
          buf_1409.start(_M_STRING); buf_1409.literal(1);
          buf_1409.end();
          term_1801 = buf_1409.term();
        } sink.propertyNamed("$LineLocation", term_1801);Term term_1930;
        {
          BufferSink buf_1670 = sink.context().makeBuffer();
          buf_1670.start(_M_STRING); buf_1670.literal(30);
          buf_1670.end();
          term_1930 = buf_1670.term();
        } sink.propertyNamed("$ColumnLocation", term_1930);
        sink.start(_M__sTextCons);Term term_2523;
        {
          BufferSink buf_1731 = sink.context().makeBuffer();
          buf_1731.start(_M_STRING); buf_1731.literal(1);
          buf_1731.end();
          term_2523 = buf_1731.term();
        } sink.propertyNamed("$LineLocation", term_2523);Term term_1321;
        {
          BufferSink buf_1715 = sink.context().makeBuffer();
          buf_1715.start(_M_STRING); buf_1715.literal(30);
          buf_1715.end();
          term_1321 = buf_1715.term();
        } sink.propertyNamed("$ColumnLocation", term_1321);
        sink.start(_M__sTextEmbed);Term term_2593;
        {
          BufferSink buf_2389 = sink.context().makeBuffer();
          buf_2389.start(_M_STRING); buf_2389.literal(1);
          buf_2389.end();
          term_2593 = buf_2389.term();
        } sink.propertyNamed("$LineLocation", term_2593);Term term_2297;
        {
          BufferSink buf_1564 = sink.context().makeBuffer();
          buf_1564.start(_M_STRING); buf_1564.literal(30);
          buf_1564.end();
          term_2297 = buf_1564.term();
        } sink.propertyNamed("$ColumnLocation", term_2297);
        sink.start(_M_AsText);
        sink.start(_M_TextFold);
        sink.start(_M_Map);
        Variable var_88 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_88});
        sink.start(_M_Crsx_xPrint_xdeclarations_xS1); sink.use(var_88);
        sink.end(); sink.copy(sub_164.ref());
        sink.end();
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_2627;
        {
          BufferSink buf_1509 = sink.context().makeBuffer();
          buf_1509.start(_M_STRING); buf_1509.literal(1);
          buf_1509.end();
          term_2627 = buf_1509.term();
        } sink.propertyNamed("$LineLocation", term_2627);Term term_2863;
        {
          BufferSink buf_1485 = sink.context().makeBuffer();
          buf_1485.start(_M_STRING); buf_1485.literal(86);
          buf_1485.end();
          term_2863 = buf_1485.term();
        } sink.propertyNamed("$ColumnLocation", term_2863);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();Term term_2537;
        {
          BufferSink buf_2321 = sink.context().makeBuffer();
          buf_2321.start(_M_STRING); buf_2321.literal(1);
          buf_2321.end();
          term_2537 = buf_2321.term();
        } sink.propertyNamed("$LineLocation", term_2537);Term term_1740;
        {
          BufferSink buf_1994 = sink.context().makeBuffer();
          buf_1994.start(_M_STRING); buf_1994.literal(31);
          buf_1994.end();
          term_1740 = buf_1994.term();
        } sink.propertyNamed("$ColumnLocation", term_1740);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xdeclarations, term_1488);
  } final public static boolean _M_Crsx_xPrint_xcrsx(Sink sink, int shared, int depth, Term term_2095) {
    if (depth < 2000) {
      label_130: {
        if (term_2095.descriptor() != _M_Crsx_xcrsx)
        {   break label_130;
        }Term sub_373 = term_2095.sub(0).ref();
        /* #1=sub *//*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal(" "); sink.end();Term term_1957;
        {
          BufferSink buf_1692 = sink.context().makeBuffer();
          buf_1692.start(_M_STRING); buf_1692.literal(1);
          buf_1692.end();
          term_1957 = buf_1692.term();
        } sink.propertyNamed("$LineLocation", term_1957);Term term_2386;
        {
          BufferSink buf_1977 = sink.context().makeBuffer();
          buf_1977.start(_M_STRING); buf_1977.literal(1);
          buf_1977.end();
          term_2386 = buf_1977.term();
        } sink.propertyNamed("$ColumnLocation", term_2386);
        sink.start(_M__sTextCons);Term term_1606;
        {
          BufferSink buf_1822 = sink.context().makeBuffer();
          buf_1822.start(_M_STRING); buf_1822.literal(1);
          buf_1822.end();
          term_1606 = buf_1822.term();
        } sink.propertyNamed("$LineLocation", term_1606);Term term_1999;
        {
          BufferSink buf_1015 = sink.context().makeBuffer();
          buf_1015.start(_M_STRING); buf_1015.literal(1);
          buf_1015.end();
          term_1999 = buf_1015.term();
        } sink.propertyNamed("$ColumnLocation", term_1999);
        sink.start(_M__sTextEmbed);Term term_1836;
        {
          BufferSink buf_2148 = sink.context().makeBuffer();
          buf_2148.start(_M_STRING); buf_2148.literal(1);
          buf_2148.end();
          term_1836 = buf_2148.term();
        } sink.propertyNamed("$LineLocation", term_1836);Term term_1648;
        {
          BufferSink buf_1550 = sink.context().makeBuffer();
          buf_1550.start(_M_STRING); buf_1550.literal(1);
          buf_1550.end();
          term_1648 = buf_1550.term();
        } sink.propertyNamed("$ColumnLocation", term_1648);
        sink.start(_M_AsText);
        sink.start(_M_Crsx_xPrint_xdeclarations); sink.copy(sub_373.ref());
        sink.end();
        sink.end();
        sink.end();Term term_1238;
        {
          BufferSink buf_1878 = sink.context().makeBuffer();
          buf_1878.start(_M_STRING); buf_1878.literal(1);
          buf_1878.end();
          term_1238 = buf_1878.term();
        } sink.propertyNamed("$LineLocation", term_1238);Term term_2516;
        {
          BufferSink buf_1690 = sink.context().makeBuffer();
          buf_1690.start(_M_STRING); buf_1690.literal(2);
          buf_1690.end();
          term_2516 = buf_1690.term();
        } sink.propertyNamed("$ColumnLocation", term_2516);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Crsx_xPrint_xcrsx, term_2095);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Text.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.List.init(context); context.register(_M_Crsx_xdirectiveList); context.register(_M_Crsx_xdirectives_xS1); context.register(_M_Crsx_xdirectives); context.register(_M_Crsx_xdirectiveArguments); context.register(_M_Crsx_xdirective_xA1); context.register(_M_Crsx_xdirective_xA2); context.register(_M_Crsx_xdirective_xA3); context.register(_M_Crsx_xdirective_xA4); context.register(_M_Crsx_xreserved_xA1); context.register(_M_Crsx_xreserved_xA2); context.register(_M_Crsx_xqualifier_xA1); context.register(_M_Crsx_xqualifier_xA2); context.register(_M_Crsx_xconstructor_xA1); context.register(_M_Crsx_xconstructor_xA2); context.register(_M_Crsx_xform_xA1); context.register(_M_Crsx_xform_xA2); context.register(_M_Crsx_xforms_xS1); context.register(_M_Crsx_xforms); context.register(_M_Crsx_xsortarguments); context.register(_M_Crsx_xsortname_xA1); context.register(_M_Crsx_xsortname_xA2); context.register(_M_Crsx_xsortnames_xS1); context.register(_M_Crsx_xsortnames); context.register(_M_Crsx_xsortset); context.register(_M_Crsx_xsortparams); context.register(_M_Crsx_xsortDeclaration_xA1); context.register(_M_Crsx_xsortDeclaration_xA2); context.register(_M_Crsx_xexpression); context.register(_M_Crsx_xproperty_xA1); context.register(_M_Crsx_xproperty_xA2); context.register(_M_Crsx_xproperty_xA3); context.register(_M_Crsx_xproperty_xA4); context.register(_M_Crsx_xproperty_xA5); context.register(_M_Crsx_xproperty_xA6); context.register(_M_Crsx_xproperty_xA7); context.register(_M_Crsx_xproperty_xA8); context.register(_M_Crsx_xproperty_xA9); context.register(_M_Crsx_xproperty_xA10); context.register(_M_Crsx_xpropertyList_xS1); context.register(_M_Crsx_xpropertyList); context.register(_M_Crsx_xproperties); context.register(_M_Crsx_xdelayCase); context.register(_M_Crsx_xdispatchCase); context.register(_M_Crsx_xdispatchCases_xS1); context.register(_M_Crsx_xdispatchCases); context.register(_M_Crsx_xdispatchTerm); context.register(_M_Crsx_xdispatch); context.register(_M_Crsx_xconcrete_xA1); context.register(_M_Crsx_xconcrete_xA2); context.register(_M_Crsx_xconcrete_xA3); context.register(_M_Crsx_xconcrete_xA4); context.register(_M_Crsx_xvarsort); context.register(_M_Crsx_xbinder); context.register(_M_Crsx_xliteral_xA1); context.register(_M_Crsx_xliteral_xA2); context.register(_M_Crsx_xfunctional); context.register(_M_Crsx_xlinear); context.register(_M_Crsx_xvariable); context.register(_M_Crsx_xtermList_xS1); context.register(_M_Crsx_xtermList); context.register(_M_Crsx_xlist); context.register(_M_Crsx_xfreeTerms_xS1); context.register(_M_Crsx_xfreeTerms); context.register(_M_Crsx_xfreeArguments); context.register(_M_Crsx_xterms_xS1); context.register(_M_Crsx_xterms); context.register(_M_Crsx_xarguments); context.register(_M_Crsx_xnextBinder_xA1); context.register(_M_Crsx_xnextBinder_xA2); context.register(_M_Crsx_xboundTerm); context.register(_M_Crsx_xfreeTerm_xA1); context.register(_M_Crsx_xfreeTerm_xA2); context.register(_M_Crsx_xfreeTerm_xA3); context.register(_M_Crsx_xfreeTerm_xA4); context.register(_M_Crsx_xfreeTerm_xA5); context.register(_M_Crsx_xfreeTerm_xA6); context.register(_M_Crsx_xfreeTerm_xA7); context.register(_M_Crsx_xfreeTerm_xA8); context.register(_M_Crsx_xfreeTerm_xA9); context.register(_M_Crsx_xterm_xA1); context.register(_M_Crsx_xterm_xA2); context.register(_M_Crsx_xannotation); context.register(_M_Crsx_xannotations); context.register(_M_Crsx_xcontractum); context.register(_M_Crsx_xpattern); context.register(_M_Crsx_xoption_xA1); context.register(_M_Crsx_xoption_xA2); context.register(_M_Crsx_xruleDeclaration); context.register(_M_Crsx_ximportDeclaration_xA1); context.register(_M_Crsx_ximportDeclaration_xA2); context.register(_M_Crsx_ximportDeclaration_xA3); context.register(_M_Crsx_xmoduleDeclaration); context.register(_M_Crsx_xdeclaration_xA1); context.register(_M_Crsx_xdeclaration_xA2); context.register(_M_Crsx_xdeclaration_xA3); context.register(_M_Crsx_xdeclaration_xA4); context.register(_M_Crsx_xdeclaration_xA5); context.register(_M_Crsx_xdeclarations_xS1); context.register(_M_Crsx_xdeclarations); context.register(_M_Crsx_xcrsx); context.register(_M_Crsx_xPrint_xdirectiveList); context.register(_M_Crsx_xPrint_xdirectives_xS1); context.register(_M_Crsx_xPrint_xdirectives); context.register(_M_Crsx_xPrint_xdirectiveArguments); context.register(_M_Crsx_xPrint_xdirective); context.register(_M_Crsx_xPrint_xreserved); context.register(_M_Crsx_xPrint_xqualifier); context.register(_M_Crsx_xPrint_xconstructor); context.register(_M_Crsx_xPrint_xform); context.register(_M_Crsx_xPrint_xforms_xS1); context.register(_M_Crsx_xPrint_xforms); context.register(_M_Crsx_xPrint_xsortarguments); context.register(_M_Crsx_xPrint_xsortname); context.register(_M_Crsx_xPrint_xsortnames_xS1); context.register(_M_Crsx_xPrint_xsortnames); context.register(_M_Crsx_xPrint_xsortset); context.register(_M_Crsx_xPrint_xsortparams); context.register(_M_Crsx_xPrint_xsortDeclaration); context.register(_M_Crsx_xPrint_xexpression); context.register(_M_Crsx_xPrint_xproperty); context.register(_M_Crsx_xPrint_xpropertyList_xS1); context.register(_M_Crsx_xPrint_xpropertyList); context.register(_M_Crsx_xPrint_xproperties); context.register(_M_Crsx_xPrint_xdelayCase); context.register(_M_Crsx_xPrint_xdispatchCase); context.register(_M_Crsx_xPrint_xdispatchCases_xS1); context.register(_M_Crsx_xPrint_xdispatchCases); context.register(_M_Crsx_xPrint_xdispatchTerm); context.register(_M_Crsx_xPrint_xdispatch); context.register(_M_Crsx_xPrint_xconcrete); context.register(_M_Crsx_xPrint_xvarsort); context.register(_M_Crsx_xPrint_xbinder); context.register(_M_Crsx_xPrint_xliteral); context.register(_M_Crsx_xPrint_xfunctional); context.register(_M_Crsx_xPrint_xlinear); context.register(_M_Crsx_xPrint_xvariable); context.register(_M_Crsx_xPrint_xtermList_xS1); context.register(_M_Crsx_xPrint_xtermList); context.register(_M_Crsx_xPrint_xlist); context.register(_M_Crsx_xPrint_xfreeTerms_xS1); context.register(_M_Crsx_xPrint_xfreeTerms); context.register(_M_Crsx_xPrint_xfreeArguments); context.register(_M_Crsx_xPrint_xterms_xS1); context.register(_M_Crsx_xPrint_xterms); context.register(_M_Crsx_xPrint_xarguments); context.register(_M_Crsx_xPrint_xnextBinder); context.register(_M_Crsx_xPrint_xboundTerm); context.register(_M_Crsx_xPrint_xfreeTerm); context.register(_M_Crsx_xPrint_xterm); context.register(_M_Crsx_xPrint_xannotation); context.register(_M_Crsx_xPrint_xannotations); context.register(_M_Crsx_xPrint_xcontractum); context.register(_M_Crsx_xPrint_xpattern); context.register(_M_Crsx_xPrint_xoption); context.register(_M_Crsx_xPrint_xruleDeclaration); context.register(_M_Crsx_xPrint_ximportDeclaration); context.register(_M_Crsx_xPrint_xmoduleDeclaration); context.register(_M_Crsx_xPrint_xdeclaration); context.register(_M_Crsx_xPrint_xdeclarations_xS1); context.register(_M_Crsx_xPrint_xdeclarations); context.register(_M_Crsx_xPrint_xcrsx);
      initialized = true;
    }
  }

/* END MODULE « "parser/Crsx.crs.java" » */
}