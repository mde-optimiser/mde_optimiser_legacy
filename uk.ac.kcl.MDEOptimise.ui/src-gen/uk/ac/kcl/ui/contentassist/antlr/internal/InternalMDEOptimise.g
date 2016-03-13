/*
 * generated by Xtext
 */
grammar InternalMDEOptimise;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package uk.ac.kcl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.kcl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.services.MDEOptimiseGrammarAccess;

}

@parser::members {
 
 	private MDEOptimiseGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(MDEOptimiseGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleOptimisation
entryRuleOptimisation 
:
{ before(grammarAccess.getOptimisationRule()); }
	 ruleOptimisation
{ after(grammarAccess.getOptimisationRule()); } 
	 EOF 
;

// Rule Optimisation
ruleOptimisation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOptimisationAccess().getGroup()); }
(rule__Optimisation__Group__0)
{ after(grammarAccess.getOptimisationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBasepathSpec
entryRuleBasepathSpec 
:
{ before(grammarAccess.getBasepathSpecRule()); }
	 ruleBasepathSpec
{ after(grammarAccess.getBasepathSpecRule()); } 
	 EOF 
;

// Rule BasepathSpec
ruleBasepathSpec
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBasepathSpecAccess().getGroup()); }
(rule__BasepathSpec__Group__0)
{ after(grammarAccess.getBasepathSpecAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMetaModelSpec
entryRuleMetaModelSpec 
:
{ before(grammarAccess.getMetaModelSpecRule()); }
	 ruleMetaModelSpec
{ after(grammarAccess.getMetaModelSpecRule()); } 
	 EOF 
;

// Rule MetaModelSpec
ruleMetaModelSpec
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMetaModelSpecAccess().getGroup()); }
(rule__MetaModelSpec__Group__0)
{ after(grammarAccess.getMetaModelSpecAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFitnessFunctionSpec
entryRuleFitnessFunctionSpec 
:
{ before(grammarAccess.getFitnessFunctionSpecRule()); }
	 ruleFitnessFunctionSpec
{ after(grammarAccess.getFitnessFunctionSpecRule()); } 
	 EOF 
;

// Rule FitnessFunctionSpec
ruleFitnessFunctionSpec
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFitnessFunctionSpecAccess().getGroup()); }
(rule__FitnessFunctionSpec__Group__0)
{ after(grammarAccess.getFitnessFunctionSpecAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEvolverSpec
entryRuleEvolverSpec 
:
{ before(grammarAccess.getEvolverSpecRule()); }
	 ruleEvolverSpec
{ after(grammarAccess.getEvolverSpecRule()); } 
	 EOF 
;

// Rule EvolverSpec
ruleEvolverSpec
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEvolverSpecAccess().getGroup()); }
(rule__EvolverSpec__Group__0)
{ after(grammarAccess.getEvolverSpecAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Optimisation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Optimisation__Group__0__Impl
	rule__Optimisation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Optimisation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptimisationAccess().getBasepathAssignment_0()); }
(rule__Optimisation__BasepathAssignment_0)
{ after(grammarAccess.getOptimisationAccess().getBasepathAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Optimisation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Optimisation__Group__1__Impl
	rule__Optimisation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Optimisation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptimisationAccess().getMetamodelAssignment_1()); }
(rule__Optimisation__MetamodelAssignment_1)
{ after(grammarAccess.getOptimisationAccess().getMetamodelAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Optimisation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Optimisation__Group__2__Impl
	rule__Optimisation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Optimisation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptimisationAccess().getFitnessAssignment_2()); }
(rule__Optimisation__FitnessAssignment_2)
{ after(grammarAccess.getOptimisationAccess().getFitnessAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Optimisation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Optimisation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Optimisation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); }
(rule__Optimisation__EvolversAssignment_3)
{ after(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); }
)
(
{ before(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); }
(rule__Optimisation__EvolversAssignment_3)*
{ after(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}










rule__BasepathSpec__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasepathSpec__Group__0__Impl
	rule__BasepathSpec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BasepathSpec__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasepathSpecAccess().getBasepathKeyword_0()); }

	'basepath' 

{ after(grammarAccess.getBasepathSpecAccess().getBasepathKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BasepathSpec__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BasepathSpec__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BasepathSpec__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasepathSpecAccess().getLocationAssignment_1()); }
(rule__BasepathSpec__LocationAssignment_1)
{ after(grammarAccess.getBasepathSpecAccess().getLocationAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MetaModelSpec__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MetaModelSpec__Group__0__Impl
	rule__MetaModelSpec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MetaModelSpec__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0()); }

	'metamodel' 

{ after(grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MetaModelSpec__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MetaModelSpec__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MetaModelSpec__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMetaModelSpecAccess().getLocationAssignment_1()); }
(rule__MetaModelSpec__LocationAssignment_1)
{ after(grammarAccess.getMetaModelSpecAccess().getLocationAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FitnessFunctionSpec__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FitnessFunctionSpec__Group__0__Impl
	rule__FitnessFunctionSpec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FitnessFunctionSpec__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0()); }

	'fitness' 

{ after(grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FitnessFunctionSpec__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FitnessFunctionSpec__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FitnessFunctionSpec__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFitnessFunctionSpecAccess().getClassAssignment_1()); }
(rule__FitnessFunctionSpec__ClassAssignment_1)
{ after(grammarAccess.getFitnessFunctionSpecAccess().getClassAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EvolverSpec__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EvolverSpec__Group__0__Impl
	rule__EvolverSpec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvolverSpec__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0()); }

	'evolve' 

{ after(grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EvolverSpec__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EvolverSpec__Group__1__Impl
	rule__EvolverSpec__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EvolverSpec__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEvolverSpecAccess().getUsingKeyword_1()); }

	'using' 

{ after(grammarAccess.getEvolverSpecAccess().getUsingKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EvolverSpec__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EvolverSpec__Group__2__Impl
	rule__EvolverSpec__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EvolverSpec__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEvolverSpecAccess().getRule_locationAssignment_2()); }
(rule__EvolverSpec__Rule_locationAssignment_2)
{ after(grammarAccess.getEvolverSpecAccess().getRule_locationAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EvolverSpec__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EvolverSpec__Group__3__Impl
	rule__EvolverSpec__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EvolverSpec__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEvolverSpecAccess().getUnitKeyword_3()); }

	'unit' 

{ after(grammarAccess.getEvolverSpecAccess().getUnitKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EvolverSpec__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EvolverSpec__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvolverSpec__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEvolverSpecAccess().getUnitAssignment_4()); }
(rule__EvolverSpec__UnitAssignment_4)
{ after(grammarAccess.getEvolverSpecAccess().getUnitAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}













rule__Optimisation__BasepathAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptimisationAccess().getBasepathBasepathSpecParserRuleCall_0_0()); }
	ruleBasepathSpec{ after(grammarAccess.getOptimisationAccess().getBasepathBasepathSpecParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Optimisation__MetamodelAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_1_0()); }
	ruleMetaModelSpec{ after(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Optimisation__FitnessAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_2_0()); }
	ruleFitnessFunctionSpec{ after(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Optimisation__EvolversAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_3_0()); }
	ruleEvolverSpec{ after(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BasepathSpec__LocationAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBasepathSpecAccess().getLocationURLTerminalRuleCall_1_0()); }
	RULE_URL{ after(grammarAccess.getBasepathSpecAccess().getLocationURLTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MetaModelSpec__LocationAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); }
	RULE_URL{ after(grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FitnessFunctionSpec__ClassAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EvolverSpec__Rule_locationAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); }
	RULE_URL{ after(grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EvolverSpec__UnitAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEvolverSpecAccess().getUnitSTRINGTerminalRuleCall_4_0()); }
	RULE_STRING{ after(grammarAccess.getEvolverSpecAccess().getUnitSTRINGTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_URL : '<' ~('>')* '>';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


