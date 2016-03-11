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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMDEOptimiseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'fitness'", "'evolve'", "'using'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int RULE_INT=7;
    public static final int RULE_URL=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMDEOptimiseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMDEOptimiseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMDEOptimiseParser.tokenNames; }
    public String getGrammarFileName() { return "../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g"; }



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



    // $ANTLR start "entryRuleOptimisation"
    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:67:1: entryRuleOptimisation returns [EObject current=null] : iv_ruleOptimisation= ruleOptimisation EOF ;
    public final EObject entryRuleOptimisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptimisation = null;


        try {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:68:2: (iv_ruleOptimisation= ruleOptimisation EOF )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:69:2: iv_ruleOptimisation= ruleOptimisation EOF
            {
             newCompositeNode(grammarAccess.getOptimisationRule()); 
            pushFollow(FOLLOW_ruleOptimisation_in_entryRuleOptimisation75);
            iv_ruleOptimisation=ruleOptimisation();

            state._fsp--;

             current =iv_ruleOptimisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptimisation85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptimisation"


    // $ANTLR start "ruleOptimisation"
    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:76:1: ruleOptimisation returns [EObject current=null] : ( ( (lv_metamodel_0_0= ruleMetaModelSpec ) ) ( (lv_fitness_1_0= ruleFitnessFunctionSpec ) ) ( (lv_evolvers_2_0= ruleEvolverSpec ) )+ ) ;
    public final EObject ruleOptimisation() throws RecognitionException {
        EObject current = null;

        EObject lv_metamodel_0_0 = null;

        EObject lv_fitness_1_0 = null;

        EObject lv_evolvers_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:79:28: ( ( ( (lv_metamodel_0_0= ruleMetaModelSpec ) ) ( (lv_fitness_1_0= ruleFitnessFunctionSpec ) ) ( (lv_evolvers_2_0= ruleEvolverSpec ) )+ ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:80:1: ( ( (lv_metamodel_0_0= ruleMetaModelSpec ) ) ( (lv_fitness_1_0= ruleFitnessFunctionSpec ) ) ( (lv_evolvers_2_0= ruleEvolverSpec ) )+ )
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:80:1: ( ( (lv_metamodel_0_0= ruleMetaModelSpec ) ) ( (lv_fitness_1_0= ruleFitnessFunctionSpec ) ) ( (lv_evolvers_2_0= ruleEvolverSpec ) )+ )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:80:2: ( (lv_metamodel_0_0= ruleMetaModelSpec ) ) ( (lv_fitness_1_0= ruleFitnessFunctionSpec ) ) ( (lv_evolvers_2_0= ruleEvolverSpec ) )+
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:80:2: ( (lv_metamodel_0_0= ruleMetaModelSpec ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:81:1: (lv_metamodel_0_0= ruleMetaModelSpec )
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:81:1: (lv_metamodel_0_0= ruleMetaModelSpec )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:82:3: lv_metamodel_0_0= ruleMetaModelSpec
            {
             
            	        newCompositeNode(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMetaModelSpec_in_ruleOptimisation131);
            lv_metamodel_0_0=ruleMetaModelSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptimisationRule());
            	        }
                   		set(
                   			current, 
                   			"metamodel",
                    		lv_metamodel_0_0, 
                    		"MetaModelSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:98:2: ( (lv_fitness_1_0= ruleFitnessFunctionSpec ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:99:1: (lv_fitness_1_0= ruleFitnessFunctionSpec )
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:99:1: (lv_fitness_1_0= ruleFitnessFunctionSpec )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:100:3: lv_fitness_1_0= ruleFitnessFunctionSpec
            {
             
            	        newCompositeNode(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFitnessFunctionSpec_in_ruleOptimisation152);
            lv_fitness_1_0=ruleFitnessFunctionSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptimisationRule());
            	        }
                   		set(
                   			current, 
                   			"fitness",
                    		lv_fitness_1_0, 
                    		"FitnessFunctionSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:116:2: ( (lv_evolvers_2_0= ruleEvolverSpec ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:117:1: (lv_evolvers_2_0= ruleEvolverSpec )
            	    {
            	    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:117:1: (lv_evolvers_2_0= ruleEvolverSpec )
            	    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:118:3: lv_evolvers_2_0= ruleEvolverSpec
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvolverSpec_in_ruleOptimisation173);
            	    lv_evolvers_2_0=ruleEvolverSpec();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptimisationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"evolvers",
            	            		lv_evolvers_2_0, 
            	            		"EvolverSpec");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptimisation"


    // $ANTLR start "entryRuleMetaModelSpec"
    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:142:1: entryRuleMetaModelSpec returns [EObject current=null] : iv_ruleMetaModelSpec= ruleMetaModelSpec EOF ;
    public final EObject entryRuleMetaModelSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModelSpec = null;


        try {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:143:2: (iv_ruleMetaModelSpec= ruleMetaModelSpec EOF )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:144:2: iv_ruleMetaModelSpec= ruleMetaModelSpec EOF
            {
             newCompositeNode(grammarAccess.getMetaModelSpecRule()); 
            pushFollow(FOLLOW_ruleMetaModelSpec_in_entryRuleMetaModelSpec210);
            iv_ruleMetaModelSpec=ruleMetaModelSpec();

            state._fsp--;

             current =iv_ruleMetaModelSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaModelSpec220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaModelSpec"


    // $ANTLR start "ruleMetaModelSpec"
    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:151:1: ruleMetaModelSpec returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) ) ) ;
    public final EObject ruleMetaModelSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:154:28: ( (otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) ) ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:155:1: (otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) ) )
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:155:1: (otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:155:3: otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleMetaModelSpec257); 

                	newLeafNode(otherlv_0, grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0());
                
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:159:1: ( (lv_location_1_0= RULE_URL ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:160:1: (lv_location_1_0= RULE_URL )
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:160:1: (lv_location_1_0= RULE_URL )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:161:3: lv_location_1_0= RULE_URL
            {
            lv_location_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleMetaModelSpec274); 

            			newLeafNode(lv_location_1_0, grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetaModelSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location",
                    		lv_location_1_0, 
                    		"URL");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaModelSpec"


    // $ANTLR start "entryRuleFitnessFunctionSpec"
    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:185:1: entryRuleFitnessFunctionSpec returns [EObject current=null] : iv_ruleFitnessFunctionSpec= ruleFitnessFunctionSpec EOF ;
    public final EObject entryRuleFitnessFunctionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFitnessFunctionSpec = null;


        try {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:186:2: (iv_ruleFitnessFunctionSpec= ruleFitnessFunctionSpec EOF )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:187:2: iv_ruleFitnessFunctionSpec= ruleFitnessFunctionSpec EOF
            {
             newCompositeNode(grammarAccess.getFitnessFunctionSpecRule()); 
            pushFollow(FOLLOW_ruleFitnessFunctionSpec_in_entryRuleFitnessFunctionSpec315);
            iv_ruleFitnessFunctionSpec=ruleFitnessFunctionSpec();

            state._fsp--;

             current =iv_ruleFitnessFunctionSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFitnessFunctionSpec325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFitnessFunctionSpec"


    // $ANTLR start "ruleFitnessFunctionSpec"
    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:194:1: ruleFitnessFunctionSpec returns [EObject current=null] : (otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFitnessFunctionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_class_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:197:28: ( (otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) ) ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:198:1: (otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) ) )
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:198:1: (otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:198:3: otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFitnessFunctionSpec362); 

                	newLeafNode(otherlv_0, grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0());
                
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:202:1: ( (lv_class_1_0= RULE_STRING ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:203:1: (lv_class_1_0= RULE_STRING )
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:203:1: (lv_class_1_0= RULE_STRING )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:204:3: lv_class_1_0= RULE_STRING
            {
            lv_class_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFitnessFunctionSpec379); 

            			newLeafNode(lv_class_1_0, grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFitnessFunctionSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFitnessFunctionSpec"


    // $ANTLR start "entryRuleEvolverSpec"
    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:228:1: entryRuleEvolverSpec returns [EObject current=null] : iv_ruleEvolverSpec= ruleEvolverSpec EOF ;
    public final EObject entryRuleEvolverSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvolverSpec = null;


        try {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:229:2: (iv_ruleEvolverSpec= ruleEvolverSpec EOF )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:230:2: iv_ruleEvolverSpec= ruleEvolverSpec EOF
            {
             newCompositeNode(grammarAccess.getEvolverSpecRule()); 
            pushFollow(FOLLOW_ruleEvolverSpec_in_entryRuleEvolverSpec420);
            iv_ruleEvolverSpec=ruleEvolverSpec();

            state._fsp--;

             current =iv_ruleEvolverSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvolverSpec430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvolverSpec"


    // $ANTLR start "ruleEvolverSpec"
    // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:237:1: ruleEvolverSpec returns [EObject current=null] : (otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) ) ) ;
    public final EObject ruleEvolverSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_rule_location_2_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:240:28: ( (otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) ) ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:241:1: (otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) ) )
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:241:1: (otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:241:3: otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEvolverSpec467); 

                	newLeafNode(otherlv_0, grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEvolverSpec479); 

                	newLeafNode(otherlv_1, grammarAccess.getEvolverSpecAccess().getUsingKeyword_1());
                
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:249:1: ( (lv_rule_location_2_0= RULE_URL ) )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:250:1: (lv_rule_location_2_0= RULE_URL )
            {
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:250:1: (lv_rule_location_2_0= RULE_URL )
            // ../uk.ac.kcl.MDEOptimise/src-gen/uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.g:251:3: lv_rule_location_2_0= RULE_URL
            {
            lv_rule_location_2_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleEvolverSpec496); 

            			newLeafNode(lv_rule_location_2_0, grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvolverSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rule_location",
                    		lv_rule_location_2_0, 
                    		"URL");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvolverSpec"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleOptimisation_in_entryRuleOptimisation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptimisation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModelSpec_in_ruleOptimisation131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleFitnessFunctionSpec_in_ruleOptimisation152 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleEvolverSpec_in_ruleOptimisation173 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleMetaModelSpec_in_entryRuleMetaModelSpec210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaModelSpec220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMetaModelSpec257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleMetaModelSpec274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFitnessFunctionSpec_in_entryRuleFitnessFunctionSpec315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFitnessFunctionSpec325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFitnessFunctionSpec362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFitnessFunctionSpec379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvolverSpec_in_entryRuleEvolverSpec420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvolverSpec430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEvolverSpec467 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvolverSpec479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleEvolverSpec496 = new BitSet(new long[]{0x0000000000000002L});

}