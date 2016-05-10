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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'basepath'", "'metamodel'", "'fitness'", "'evolve'", "'using'", "'unit'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public String getGrammarFileName() { return "InternalMDEOptimise.g"; }



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
    // InternalMDEOptimise.g:67:1: entryRuleOptimisation returns [EObject current=null] : iv_ruleOptimisation= ruleOptimisation EOF ;
    public final EObject entryRuleOptimisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptimisation = null;


        try {
            // InternalMDEOptimise.g:68:2: (iv_ruleOptimisation= ruleOptimisation EOF )
            // InternalMDEOptimise.g:69:2: iv_ruleOptimisation= ruleOptimisation EOF
            {
             newCompositeNode(grammarAccess.getOptimisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptimisation=ruleOptimisation();

            state._fsp--;

             current =iv_ruleOptimisation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMDEOptimise.g:76:1: ruleOptimisation returns [EObject current=null] : ( ( (lv_basepath_0_0= ruleBasepathSpec ) ) ( (lv_metamodel_1_0= ruleMetaModelSpec ) ) ( (lv_fitness_2_0= ruleFitnessFunctionSpec ) )+ ( (lv_evolvers_3_0= ruleEvolverSpec ) )+ ) ;
    public final EObject ruleOptimisation() throws RecognitionException {
        EObject current = null;

        EObject lv_basepath_0_0 = null;

        EObject lv_metamodel_1_0 = null;

        EObject lv_fitness_2_0 = null;

        EObject lv_evolvers_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMDEOptimise.g:79:28: ( ( ( (lv_basepath_0_0= ruleBasepathSpec ) ) ( (lv_metamodel_1_0= ruleMetaModelSpec ) ) ( (lv_fitness_2_0= ruleFitnessFunctionSpec ) )+ ( (lv_evolvers_3_0= ruleEvolverSpec ) )+ ) )
            // InternalMDEOptimise.g:80:1: ( ( (lv_basepath_0_0= ruleBasepathSpec ) ) ( (lv_metamodel_1_0= ruleMetaModelSpec ) ) ( (lv_fitness_2_0= ruleFitnessFunctionSpec ) )+ ( (lv_evolvers_3_0= ruleEvolverSpec ) )+ )
            {
            // InternalMDEOptimise.g:80:1: ( ( (lv_basepath_0_0= ruleBasepathSpec ) ) ( (lv_metamodel_1_0= ruleMetaModelSpec ) ) ( (lv_fitness_2_0= ruleFitnessFunctionSpec ) )+ ( (lv_evolvers_3_0= ruleEvolverSpec ) )+ )
            // InternalMDEOptimise.g:80:2: ( (lv_basepath_0_0= ruleBasepathSpec ) ) ( (lv_metamodel_1_0= ruleMetaModelSpec ) ) ( (lv_fitness_2_0= ruleFitnessFunctionSpec ) )+ ( (lv_evolvers_3_0= ruleEvolverSpec ) )+
            {
            // InternalMDEOptimise.g:80:2: ( (lv_basepath_0_0= ruleBasepathSpec ) )
            // InternalMDEOptimise.g:81:1: (lv_basepath_0_0= ruleBasepathSpec )
            {
            // InternalMDEOptimise.g:81:1: (lv_basepath_0_0= ruleBasepathSpec )
            // InternalMDEOptimise.g:82:3: lv_basepath_0_0= ruleBasepathSpec
            {
             
            	        newCompositeNode(grammarAccess.getOptimisationAccess().getBasepathBasepathSpecParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_basepath_0_0=ruleBasepathSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptimisationRule());
            	        }
                   		set(
                   			current, 
                   			"basepath",
                    		lv_basepath_0_0, 
                    		"uk.ac.kcl.MDEOptimise.BasepathSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalMDEOptimise.g:98:2: ( (lv_metamodel_1_0= ruleMetaModelSpec ) )
            // InternalMDEOptimise.g:99:1: (lv_metamodel_1_0= ruleMetaModelSpec )
            {
            // InternalMDEOptimise.g:99:1: (lv_metamodel_1_0= ruleMetaModelSpec )
            // InternalMDEOptimise.g:100:3: lv_metamodel_1_0= ruleMetaModelSpec
            {
             
            	        newCompositeNode(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_metamodel_1_0=ruleMetaModelSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptimisationRule());
            	        }
                   		set(
                   			current, 
                   			"metamodel",
                    		lv_metamodel_1_0, 
                    		"uk.ac.kcl.MDEOptimise.MetaModelSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalMDEOptimise.g:116:2: ( (lv_fitness_2_0= ruleFitnessFunctionSpec ) )+
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
            	    // InternalMDEOptimise.g:117:1: (lv_fitness_2_0= ruleFitnessFunctionSpec )
            	    {
            	    // InternalMDEOptimise.g:117:1: (lv_fitness_2_0= ruleFitnessFunctionSpec )
            	    // InternalMDEOptimise.g:118:3: lv_fitness_2_0= ruleFitnessFunctionSpec
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_fitness_2_0=ruleFitnessFunctionSpec();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptimisationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fitness",
            	            		lv_fitness_2_0, 
            	            		"uk.ac.kcl.MDEOptimise.FitnessFunctionSpec");
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

            // InternalMDEOptimise.g:134:3: ( (lv_evolvers_3_0= ruleEvolverSpec ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMDEOptimise.g:135:1: (lv_evolvers_3_0= ruleEvolverSpec )
            	    {
            	    // InternalMDEOptimise.g:135:1: (lv_evolvers_3_0= ruleEvolverSpec )
            	    // InternalMDEOptimise.g:136:3: lv_evolvers_3_0= ruleEvolverSpec
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_evolvers_3_0=ruleEvolverSpec();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptimisationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"evolvers",
            	            		lv_evolvers_3_0, 
            	            		"uk.ac.kcl.MDEOptimise.EvolverSpec");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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


    // $ANTLR start "entryRuleBasepathSpec"
    // InternalMDEOptimise.g:160:1: entryRuleBasepathSpec returns [EObject current=null] : iv_ruleBasepathSpec= ruleBasepathSpec EOF ;
    public final EObject entryRuleBasepathSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasepathSpec = null;


        try {
            // InternalMDEOptimise.g:161:2: (iv_ruleBasepathSpec= ruleBasepathSpec EOF )
            // InternalMDEOptimise.g:162:2: iv_ruleBasepathSpec= ruleBasepathSpec EOF
            {
             newCompositeNode(grammarAccess.getBasepathSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasepathSpec=ruleBasepathSpec();

            state._fsp--;

             current =iv_ruleBasepathSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBasepathSpec"


    // $ANTLR start "ruleBasepathSpec"
    // InternalMDEOptimise.g:169:1: ruleBasepathSpec returns [EObject current=null] : (otherlv_0= 'basepath' ( (lv_location_1_0= RULE_URL ) ) ) ;
    public final EObject ruleBasepathSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;

         enterRule(); 
            
        try {
            // InternalMDEOptimise.g:172:28: ( (otherlv_0= 'basepath' ( (lv_location_1_0= RULE_URL ) ) ) )
            // InternalMDEOptimise.g:173:1: (otherlv_0= 'basepath' ( (lv_location_1_0= RULE_URL ) ) )
            {
            // InternalMDEOptimise.g:173:1: (otherlv_0= 'basepath' ( (lv_location_1_0= RULE_URL ) ) )
            // InternalMDEOptimise.g:173:3: otherlv_0= 'basepath' ( (lv_location_1_0= RULE_URL ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getBasepathSpecAccess().getBasepathKeyword_0());
                
            // InternalMDEOptimise.g:177:1: ( (lv_location_1_0= RULE_URL ) )
            // InternalMDEOptimise.g:178:1: (lv_location_1_0= RULE_URL )
            {
            // InternalMDEOptimise.g:178:1: (lv_location_1_0= RULE_URL )
            // InternalMDEOptimise.g:179:3: lv_location_1_0= RULE_URL
            {
            lv_location_1_0=(Token)match(input,RULE_URL,FOLLOW_2); 

            			newLeafNode(lv_location_1_0, grammarAccess.getBasepathSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBasepathSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location",
                    		lv_location_1_0, 
                    		"uk.ac.kcl.MDEOptimise.URL");
            	    

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
    // $ANTLR end "ruleBasepathSpec"


    // $ANTLR start "entryRuleMetaModelSpec"
    // InternalMDEOptimise.g:203:1: entryRuleMetaModelSpec returns [EObject current=null] : iv_ruleMetaModelSpec= ruleMetaModelSpec EOF ;
    public final EObject entryRuleMetaModelSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModelSpec = null;


        try {
            // InternalMDEOptimise.g:204:2: (iv_ruleMetaModelSpec= ruleMetaModelSpec EOF )
            // InternalMDEOptimise.g:205:2: iv_ruleMetaModelSpec= ruleMetaModelSpec EOF
            {
             newCompositeNode(grammarAccess.getMetaModelSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaModelSpec=ruleMetaModelSpec();

            state._fsp--;

             current =iv_ruleMetaModelSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMDEOptimise.g:212:1: ruleMetaModelSpec returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) ) ) ;
    public final EObject ruleMetaModelSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;

         enterRule(); 
            
        try {
            // InternalMDEOptimise.g:215:28: ( (otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) ) ) )
            // InternalMDEOptimise.g:216:1: (otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) ) )
            {
            // InternalMDEOptimise.g:216:1: (otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) ) )
            // InternalMDEOptimise.g:216:3: otherlv_0= 'metamodel' ( (lv_location_1_0= RULE_URL ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0());
                
            // InternalMDEOptimise.g:220:1: ( (lv_location_1_0= RULE_URL ) )
            // InternalMDEOptimise.g:221:1: (lv_location_1_0= RULE_URL )
            {
            // InternalMDEOptimise.g:221:1: (lv_location_1_0= RULE_URL )
            // InternalMDEOptimise.g:222:3: lv_location_1_0= RULE_URL
            {
            lv_location_1_0=(Token)match(input,RULE_URL,FOLLOW_2); 

            			newLeafNode(lv_location_1_0, grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetaModelSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location",
                    		lv_location_1_0, 
                    		"uk.ac.kcl.MDEOptimise.URL");
            	    

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
    // InternalMDEOptimise.g:246:1: entryRuleFitnessFunctionSpec returns [EObject current=null] : iv_ruleFitnessFunctionSpec= ruleFitnessFunctionSpec EOF ;
    public final EObject entryRuleFitnessFunctionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFitnessFunctionSpec = null;


        try {
            // InternalMDEOptimise.g:247:2: (iv_ruleFitnessFunctionSpec= ruleFitnessFunctionSpec EOF )
            // InternalMDEOptimise.g:248:2: iv_ruleFitnessFunctionSpec= ruleFitnessFunctionSpec EOF
            {
             newCompositeNode(grammarAccess.getFitnessFunctionSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFitnessFunctionSpec=ruleFitnessFunctionSpec();

            state._fsp--;

             current =iv_ruleFitnessFunctionSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMDEOptimise.g:255:1: ruleFitnessFunctionSpec returns [EObject current=null] : (otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFitnessFunctionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_class_1_0=null;

         enterRule(); 
            
        try {
            // InternalMDEOptimise.g:258:28: ( (otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) ) ) )
            // InternalMDEOptimise.g:259:1: (otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) ) )
            {
            // InternalMDEOptimise.g:259:1: (otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) ) )
            // InternalMDEOptimise.g:259:3: otherlv_0= 'fitness' ( (lv_class_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0());
                
            // InternalMDEOptimise.g:263:1: ( (lv_class_1_0= RULE_STRING ) )
            // InternalMDEOptimise.g:264:1: (lv_class_1_0= RULE_STRING )
            {
            // InternalMDEOptimise.g:264:1: (lv_class_1_0= RULE_STRING )
            // InternalMDEOptimise.g:265:3: lv_class_1_0= RULE_STRING
            {
            lv_class_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_class_1_0, grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFitnessFunctionSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalMDEOptimise.g:289:1: entryRuleEvolverSpec returns [EObject current=null] : iv_ruleEvolverSpec= ruleEvolverSpec EOF ;
    public final EObject entryRuleEvolverSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvolverSpec = null;


        try {
            // InternalMDEOptimise.g:290:2: (iv_ruleEvolverSpec= ruleEvolverSpec EOF )
            // InternalMDEOptimise.g:291:2: iv_ruleEvolverSpec= ruleEvolverSpec EOF
            {
             newCompositeNode(grammarAccess.getEvolverSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvolverSpec=ruleEvolverSpec();

            state._fsp--;

             current =iv_ruleEvolverSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMDEOptimise.g:298:1: ruleEvolverSpec returns [EObject current=null] : (otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) ) otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvolverSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_rule_location_2_0=null;
        Token otherlv_3=null;
        Token lv_unit_4_0=null;

         enterRule(); 
            
        try {
            // InternalMDEOptimise.g:301:28: ( (otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) ) otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) ) ) )
            // InternalMDEOptimise.g:302:1: (otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) ) otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) ) )
            {
            // InternalMDEOptimise.g:302:1: (otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) ) otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) ) )
            // InternalMDEOptimise.g:302:3: otherlv_0= 'evolve' otherlv_1= 'using' ( (lv_rule_location_2_0= RULE_URL ) ) otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getEvolverSpecAccess().getUsingKeyword_1());
                
            // InternalMDEOptimise.g:310:1: ( (lv_rule_location_2_0= RULE_URL ) )
            // InternalMDEOptimise.g:311:1: (lv_rule_location_2_0= RULE_URL )
            {
            // InternalMDEOptimise.g:311:1: (lv_rule_location_2_0= RULE_URL )
            // InternalMDEOptimise.g:312:3: lv_rule_location_2_0= RULE_URL
            {
            lv_rule_location_2_0=(Token)match(input,RULE_URL,FOLLOW_10); 

            			newLeafNode(lv_rule_location_2_0, grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvolverSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rule_location",
                    		lv_rule_location_2_0, 
                    		"uk.ac.kcl.MDEOptimise.URL");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

                	newLeafNode(otherlv_3, grammarAccess.getEvolverSpecAccess().getUnitKeyword_3());
                
            // InternalMDEOptimise.g:332:1: ( (lv_unit_4_0= RULE_STRING ) )
            // InternalMDEOptimise.g:333:1: (lv_unit_4_0= RULE_STRING )
            {
            // InternalMDEOptimise.g:333:1: (lv_unit_4_0= RULE_STRING )
            // InternalMDEOptimise.g:334:3: lv_unit_4_0= RULE_STRING
            {
            lv_unit_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_unit_4_0, grammarAccess.getEvolverSpecAccess().getUnitSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvolverSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"unit",
                    		lv_unit_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});

}