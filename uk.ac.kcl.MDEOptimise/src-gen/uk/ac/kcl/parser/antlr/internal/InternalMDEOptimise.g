/*
 * generated by Xtext
 */
grammar InternalMDEOptimise;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package uk.ac.kcl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.kcl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.services.MDEOptimiseGrammarAccess;

}

@parser::members {

 	private MDEOptimiseGrammarAccess grammarAccess;
 	
    public InternalMDEOptimiseParser(TokenStream input, MDEOptimiseGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Optimisation";	
   	}
   	
   	@Override
   	protected MDEOptimiseGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleOptimisation
entryRuleOptimisation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOptimisationRule()); }
	 iv_ruleOptimisation=ruleOptimisation 
	 { $current=$iv_ruleOptimisation.current; } 
	 EOF 
;

// Rule Optimisation
ruleOptimisation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_0_0()); 
	    }
		lv_metamodel_0_0=ruleMetaModelSpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptimisationRule());
	        }
       		set(
       			$current, 
       			"metamodel",
        		lv_metamodel_0_0, 
        		"MetaModelSpec");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_1_0()); 
	    }
		lv_fitness_1_0=ruleFitnessFunctionSpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptimisationRule());
	        }
       		set(
       			$current, 
       			"fitness",
        		lv_fitness_1_0, 
        		"FitnessFunctionSpec");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_2_0()); 
	    }
		lv_evolvers_2_0=ruleEvolverSpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptimisationRule());
	        }
       		add(
       			$current, 
       			"evolvers",
        		lv_evolvers_2_0, 
        		"EvolverSpec");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleMetaModelSpec
entryRuleMetaModelSpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMetaModelSpecRule()); }
	 iv_ruleMetaModelSpec=ruleMetaModelSpec 
	 { $current=$iv_ruleMetaModelSpec.current; } 
	 EOF 
;

// Rule MetaModelSpec
ruleMetaModelSpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='metamodel' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0());
    }
(
(
		lv_location_1_0=RULE_URL
		{
			newLeafNode(lv_location_1_0, grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetaModelSpecRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"location",
        		lv_location_1_0, 
        		"URL");
	    }

)
))
;





// Entry rule entryRuleFitnessFunctionSpec
entryRuleFitnessFunctionSpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFitnessFunctionSpecRule()); }
	 iv_ruleFitnessFunctionSpec=ruleFitnessFunctionSpec 
	 { $current=$iv_ruleFitnessFunctionSpec.current; } 
	 EOF 
;

// Rule FitnessFunctionSpec
ruleFitnessFunctionSpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='fitness' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0());
    }
(
(
		lv_class_1_0=RULE_STRING
		{
			newLeafNode(lv_class_1_0, grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFitnessFunctionSpecRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"class",
        		lv_class_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleEvolverSpec
entryRuleEvolverSpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEvolverSpecRule()); }
	 iv_ruleEvolverSpec=ruleEvolverSpec 
	 { $current=$iv_ruleEvolverSpec.current; } 
	 EOF 
;

// Rule EvolverSpec
ruleEvolverSpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='evolve' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0());
    }
	otherlv_1='using' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEvolverSpecAccess().getUsingKeyword_1());
    }
(
(
		lv_rule_location_2_0=RULE_URL
		{
			newLeafNode(lv_rule_location_2_0, grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEvolverSpecRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"rule_location",
        		lv_rule_location_2_0, 
        		"URL");
	    }

)
))
;





RULE_URL : '<' ~('>')* '>';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


