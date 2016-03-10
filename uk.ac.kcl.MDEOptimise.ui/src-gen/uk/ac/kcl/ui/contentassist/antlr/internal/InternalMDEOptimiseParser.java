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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMDEOptimiseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'fitness'", "'{'", "'class'", "'method'", "'}'", "'evolve'", "'using'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_URL=4;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalMDEOptimiseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMDEOptimiseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMDEOptimiseParser.tokenNames; }
    public String getGrammarFileName() { return "../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g"; }


     
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




    // $ANTLR start "entryRuleOptimisation"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:60:1: entryRuleOptimisation : ruleOptimisation EOF ;
    public final void entryRuleOptimisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:61:1: ( ruleOptimisation EOF )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:62:1: ruleOptimisation EOF
            {
             before(grammarAccess.getOptimisationRule()); 
            pushFollow(FOLLOW_ruleOptimisation_in_entryRuleOptimisation61);
            ruleOptimisation();

            state._fsp--;

             after(grammarAccess.getOptimisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptimisation68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptimisation"


    // $ANTLR start "ruleOptimisation"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:69:1: ruleOptimisation : ( ( rule__Optimisation__Group__0 ) ) ;
    public final void ruleOptimisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:73:2: ( ( ( rule__Optimisation__Group__0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:74:1: ( ( rule__Optimisation__Group__0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:74:1: ( ( rule__Optimisation__Group__0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:75:1: ( rule__Optimisation__Group__0 )
            {
             before(grammarAccess.getOptimisationAccess().getGroup()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:76:1: ( rule__Optimisation__Group__0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:76:2: rule__Optimisation__Group__0
            {
            pushFollow(FOLLOW_rule__Optimisation__Group__0_in_ruleOptimisation94);
            rule__Optimisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptimisation"


    // $ANTLR start "entryRuleMetaModelSpec"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:88:1: entryRuleMetaModelSpec : ruleMetaModelSpec EOF ;
    public final void entryRuleMetaModelSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:89:1: ( ruleMetaModelSpec EOF )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:90:1: ruleMetaModelSpec EOF
            {
             before(grammarAccess.getMetaModelSpecRule()); 
            pushFollow(FOLLOW_ruleMetaModelSpec_in_entryRuleMetaModelSpec121);
            ruleMetaModelSpec();

            state._fsp--;

             after(grammarAccess.getMetaModelSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaModelSpec128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetaModelSpec"


    // $ANTLR start "ruleMetaModelSpec"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:97:1: ruleMetaModelSpec : ( ( rule__MetaModelSpec__Group__0 ) ) ;
    public final void ruleMetaModelSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:101:2: ( ( ( rule__MetaModelSpec__Group__0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:102:1: ( ( rule__MetaModelSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:102:1: ( ( rule__MetaModelSpec__Group__0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:103:1: ( rule__MetaModelSpec__Group__0 )
            {
             before(grammarAccess.getMetaModelSpecAccess().getGroup()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:104:1: ( rule__MetaModelSpec__Group__0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:104:2: rule__MetaModelSpec__Group__0
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__Group__0_in_ruleMetaModelSpec154);
            rule__MetaModelSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaModelSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaModelSpec"


    // $ANTLR start "entryRuleFitnessFunctionSpec"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:116:1: entryRuleFitnessFunctionSpec : ruleFitnessFunctionSpec EOF ;
    public final void entryRuleFitnessFunctionSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:117:1: ( ruleFitnessFunctionSpec EOF )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:118:1: ruleFitnessFunctionSpec EOF
            {
             before(grammarAccess.getFitnessFunctionSpecRule()); 
            pushFollow(FOLLOW_ruleFitnessFunctionSpec_in_entryRuleFitnessFunctionSpec181);
            ruleFitnessFunctionSpec();

            state._fsp--;

             after(grammarAccess.getFitnessFunctionSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFitnessFunctionSpec188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFitnessFunctionSpec"


    // $ANTLR start "ruleFitnessFunctionSpec"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:125:1: ruleFitnessFunctionSpec : ( ( rule__FitnessFunctionSpec__Group__0 ) ) ;
    public final void ruleFitnessFunctionSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:129:2: ( ( ( rule__FitnessFunctionSpec__Group__0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:130:1: ( ( rule__FitnessFunctionSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:130:1: ( ( rule__FitnessFunctionSpec__Group__0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:131:1: ( rule__FitnessFunctionSpec__Group__0 )
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getGroup()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:132:1: ( rule__FitnessFunctionSpec__Group__0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:132:2: rule__FitnessFunctionSpec__Group__0
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__0_in_ruleFitnessFunctionSpec214);
            rule__FitnessFunctionSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFitnessFunctionSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFitnessFunctionSpec"


    // $ANTLR start "entryRuleEvolverSpec"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:144:1: entryRuleEvolverSpec : ruleEvolverSpec EOF ;
    public final void entryRuleEvolverSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:145:1: ( ruleEvolverSpec EOF )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:146:1: ruleEvolverSpec EOF
            {
             before(grammarAccess.getEvolverSpecRule()); 
            pushFollow(FOLLOW_ruleEvolverSpec_in_entryRuleEvolverSpec241);
            ruleEvolverSpec();

            state._fsp--;

             after(grammarAccess.getEvolverSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvolverSpec248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvolverSpec"


    // $ANTLR start "ruleEvolverSpec"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:153:1: ruleEvolverSpec : ( ( rule__EvolverSpec__Group__0 ) ) ;
    public final void ruleEvolverSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:157:2: ( ( ( rule__EvolverSpec__Group__0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:158:1: ( ( rule__EvolverSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:158:1: ( ( rule__EvolverSpec__Group__0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:159:1: ( rule__EvolverSpec__Group__0 )
            {
             before(grammarAccess.getEvolverSpecAccess().getGroup()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:160:1: ( rule__EvolverSpec__Group__0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:160:2: rule__EvolverSpec__Group__0
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__0_in_ruleEvolverSpec274);
            rule__EvolverSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvolverSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvolverSpec"


    // $ANTLR start "rule__Optimisation__Group__0"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:174:1: rule__Optimisation__Group__0 : rule__Optimisation__Group__0__Impl rule__Optimisation__Group__1 ;
    public final void rule__Optimisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:178:1: ( rule__Optimisation__Group__0__Impl rule__Optimisation__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:179:2: rule__Optimisation__Group__0__Impl rule__Optimisation__Group__1
            {
            pushFollow(FOLLOW_rule__Optimisation__Group__0__Impl_in_rule__Optimisation__Group__0308);
            rule__Optimisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optimisation__Group__1_in_rule__Optimisation__Group__0311);
            rule__Optimisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optimisation__Group__0"


    // $ANTLR start "rule__Optimisation__Group__0__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:186:1: rule__Optimisation__Group__0__Impl : ( ( rule__Optimisation__MetamodelAssignment_0 ) ) ;
    public final void rule__Optimisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:190:1: ( ( ( rule__Optimisation__MetamodelAssignment_0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:191:1: ( ( rule__Optimisation__MetamodelAssignment_0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:191:1: ( ( rule__Optimisation__MetamodelAssignment_0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:192:1: ( rule__Optimisation__MetamodelAssignment_0 )
            {
             before(grammarAccess.getOptimisationAccess().getMetamodelAssignment_0()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:193:1: ( rule__Optimisation__MetamodelAssignment_0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:193:2: rule__Optimisation__MetamodelAssignment_0
            {
            pushFollow(FOLLOW_rule__Optimisation__MetamodelAssignment_0_in_rule__Optimisation__Group__0__Impl338);
            rule__Optimisation__MetamodelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getMetamodelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optimisation__Group__0__Impl"


    // $ANTLR start "rule__Optimisation__Group__1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:203:1: rule__Optimisation__Group__1 : rule__Optimisation__Group__1__Impl rule__Optimisation__Group__2 ;
    public final void rule__Optimisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:207:1: ( rule__Optimisation__Group__1__Impl rule__Optimisation__Group__2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:208:2: rule__Optimisation__Group__1__Impl rule__Optimisation__Group__2
            {
            pushFollow(FOLLOW_rule__Optimisation__Group__1__Impl_in_rule__Optimisation__Group__1368);
            rule__Optimisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optimisation__Group__2_in_rule__Optimisation__Group__1371);
            rule__Optimisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optimisation__Group__1"


    // $ANTLR start "rule__Optimisation__Group__1__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:215:1: rule__Optimisation__Group__1__Impl : ( ( rule__Optimisation__FitnessAssignment_1 ) ) ;
    public final void rule__Optimisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:219:1: ( ( ( rule__Optimisation__FitnessAssignment_1 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:220:1: ( ( rule__Optimisation__FitnessAssignment_1 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:220:1: ( ( rule__Optimisation__FitnessAssignment_1 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:221:1: ( rule__Optimisation__FitnessAssignment_1 )
            {
             before(grammarAccess.getOptimisationAccess().getFitnessAssignment_1()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:222:1: ( rule__Optimisation__FitnessAssignment_1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:222:2: rule__Optimisation__FitnessAssignment_1
            {
            pushFollow(FOLLOW_rule__Optimisation__FitnessAssignment_1_in_rule__Optimisation__Group__1__Impl398);
            rule__Optimisation__FitnessAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getFitnessAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optimisation__Group__1__Impl"


    // $ANTLR start "rule__Optimisation__Group__2"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:232:1: rule__Optimisation__Group__2 : rule__Optimisation__Group__2__Impl ;
    public final void rule__Optimisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:236:1: ( rule__Optimisation__Group__2__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:237:2: rule__Optimisation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Optimisation__Group__2__Impl_in_rule__Optimisation__Group__2428);
            rule__Optimisation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optimisation__Group__2"


    // $ANTLR start "rule__Optimisation__Group__2__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:243:1: rule__Optimisation__Group__2__Impl : ( ( rule__Optimisation__EvolversAssignment_2 ) ) ;
    public final void rule__Optimisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:247:1: ( ( ( rule__Optimisation__EvolversAssignment_2 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:248:1: ( ( rule__Optimisation__EvolversAssignment_2 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:248:1: ( ( rule__Optimisation__EvolversAssignment_2 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:249:1: ( rule__Optimisation__EvolversAssignment_2 )
            {
             before(grammarAccess.getOptimisationAccess().getEvolversAssignment_2()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:250:1: ( rule__Optimisation__EvolversAssignment_2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:250:2: rule__Optimisation__EvolversAssignment_2
            {
            pushFollow(FOLLOW_rule__Optimisation__EvolversAssignment_2_in_rule__Optimisation__Group__2__Impl455);
            rule__Optimisation__EvolversAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getEvolversAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optimisation__Group__2__Impl"


    // $ANTLR start "rule__MetaModelSpec__Group__0"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:266:1: rule__MetaModelSpec__Group__0 : rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1 ;
    public final void rule__MetaModelSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:270:1: ( rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:271:2: rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__Group__0__Impl_in_rule__MetaModelSpec__Group__0491);
            rule__MetaModelSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModelSpec__Group__1_in_rule__MetaModelSpec__Group__0494);
            rule__MetaModelSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModelSpec__Group__0"


    // $ANTLR start "rule__MetaModelSpec__Group__0__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:278:1: rule__MetaModelSpec__Group__0__Impl : ( 'metamodel' ) ;
    public final void rule__MetaModelSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:282:1: ( ( 'metamodel' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:283:1: ( 'metamodel' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:283:1: ( 'metamodel' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:284:1: 'metamodel'
            {
             before(grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__MetaModelSpec__Group__0__Impl522); 
             after(grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModelSpec__Group__0__Impl"


    // $ANTLR start "rule__MetaModelSpec__Group__1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:297:1: rule__MetaModelSpec__Group__1 : rule__MetaModelSpec__Group__1__Impl ;
    public final void rule__MetaModelSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:301:1: ( rule__MetaModelSpec__Group__1__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:302:2: rule__MetaModelSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__Group__1__Impl_in_rule__MetaModelSpec__Group__1553);
            rule__MetaModelSpec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModelSpec__Group__1"


    // $ANTLR start "rule__MetaModelSpec__Group__1__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:308:1: rule__MetaModelSpec__Group__1__Impl : ( ( rule__MetaModelSpec__LocationAssignment_1 ) ) ;
    public final void rule__MetaModelSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:312:1: ( ( ( rule__MetaModelSpec__LocationAssignment_1 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:313:1: ( ( rule__MetaModelSpec__LocationAssignment_1 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:313:1: ( ( rule__MetaModelSpec__LocationAssignment_1 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:314:1: ( rule__MetaModelSpec__LocationAssignment_1 )
            {
             before(grammarAccess.getMetaModelSpecAccess().getLocationAssignment_1()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:315:1: ( rule__MetaModelSpec__LocationAssignment_1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:315:2: rule__MetaModelSpec__LocationAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__LocationAssignment_1_in_rule__MetaModelSpec__Group__1__Impl580);
            rule__MetaModelSpec__LocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaModelSpecAccess().getLocationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModelSpec__Group__1__Impl"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__0"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:329:1: rule__FitnessFunctionSpec__Group__0 : rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1 ;
    public final void rule__FitnessFunctionSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:333:1: ( rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:334:2: rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__0__Impl_in_rule__FitnessFunctionSpec__Group__0614);
            rule__FitnessFunctionSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__1_in_rule__FitnessFunctionSpec__Group__0617);
            rule__FitnessFunctionSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__0"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__0__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:341:1: rule__FitnessFunctionSpec__Group__0__Impl : ( 'fitness' ) ;
    public final void rule__FitnessFunctionSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:345:1: ( ( 'fitness' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:346:1: ( 'fitness' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:346:1: ( 'fitness' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:347:1: 'fitness'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__FitnessFunctionSpec__Group__0__Impl645); 
             after(grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__0__Impl"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:360:1: rule__FitnessFunctionSpec__Group__1 : rule__FitnessFunctionSpec__Group__1__Impl rule__FitnessFunctionSpec__Group__2 ;
    public final void rule__FitnessFunctionSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:364:1: ( rule__FitnessFunctionSpec__Group__1__Impl rule__FitnessFunctionSpec__Group__2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:365:2: rule__FitnessFunctionSpec__Group__1__Impl rule__FitnessFunctionSpec__Group__2
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__1__Impl_in_rule__FitnessFunctionSpec__Group__1676);
            rule__FitnessFunctionSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__2_in_rule__FitnessFunctionSpec__Group__1679);
            rule__FitnessFunctionSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__1"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__1__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:372:1: rule__FitnessFunctionSpec__Group__1__Impl : ( '{' ) ;
    public final void rule__FitnessFunctionSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:376:1: ( ( '{' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:377:1: ( '{' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:377:1: ( '{' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:378:1: '{'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__FitnessFunctionSpec__Group__1__Impl707); 
             after(grammarAccess.getFitnessFunctionSpecAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__1__Impl"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__2"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:391:1: rule__FitnessFunctionSpec__Group__2 : rule__FitnessFunctionSpec__Group__2__Impl rule__FitnessFunctionSpec__Group__3 ;
    public final void rule__FitnessFunctionSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:395:1: ( rule__FitnessFunctionSpec__Group__2__Impl rule__FitnessFunctionSpec__Group__3 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:396:2: rule__FitnessFunctionSpec__Group__2__Impl rule__FitnessFunctionSpec__Group__3
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__2__Impl_in_rule__FitnessFunctionSpec__Group__2738);
            rule__FitnessFunctionSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__3_in_rule__FitnessFunctionSpec__Group__2741);
            rule__FitnessFunctionSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__2"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__2__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:403:1: rule__FitnessFunctionSpec__Group__2__Impl : ( 'class' ) ;
    public final void rule__FitnessFunctionSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:407:1: ( ( 'class' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:408:1: ( 'class' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:408:1: ( 'class' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:409:1: 'class'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__FitnessFunctionSpec__Group__2__Impl769); 
             after(grammarAccess.getFitnessFunctionSpecAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__2__Impl"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__3"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:422:1: rule__FitnessFunctionSpec__Group__3 : rule__FitnessFunctionSpec__Group__3__Impl rule__FitnessFunctionSpec__Group__4 ;
    public final void rule__FitnessFunctionSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:426:1: ( rule__FitnessFunctionSpec__Group__3__Impl rule__FitnessFunctionSpec__Group__4 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:427:2: rule__FitnessFunctionSpec__Group__3__Impl rule__FitnessFunctionSpec__Group__4
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__3__Impl_in_rule__FitnessFunctionSpec__Group__3800);
            rule__FitnessFunctionSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__4_in_rule__FitnessFunctionSpec__Group__3803);
            rule__FitnessFunctionSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__3"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__3__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:434:1: rule__FitnessFunctionSpec__Group__3__Impl : ( ( rule__FitnessFunctionSpec__ClassAssignment_3 ) ) ;
    public final void rule__FitnessFunctionSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:438:1: ( ( ( rule__FitnessFunctionSpec__ClassAssignment_3 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:439:1: ( ( rule__FitnessFunctionSpec__ClassAssignment_3 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:439:1: ( ( rule__FitnessFunctionSpec__ClassAssignment_3 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:440:1: ( rule__FitnessFunctionSpec__ClassAssignment_3 )
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassAssignment_3()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:441:1: ( rule__FitnessFunctionSpec__ClassAssignment_3 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:441:2: rule__FitnessFunctionSpec__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__ClassAssignment_3_in_rule__FitnessFunctionSpec__Group__3__Impl830);
            rule__FitnessFunctionSpec__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFitnessFunctionSpecAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__3__Impl"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__4"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:451:1: rule__FitnessFunctionSpec__Group__4 : rule__FitnessFunctionSpec__Group__4__Impl rule__FitnessFunctionSpec__Group__5 ;
    public final void rule__FitnessFunctionSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:455:1: ( rule__FitnessFunctionSpec__Group__4__Impl rule__FitnessFunctionSpec__Group__5 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:456:2: rule__FitnessFunctionSpec__Group__4__Impl rule__FitnessFunctionSpec__Group__5
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__4__Impl_in_rule__FitnessFunctionSpec__Group__4860);
            rule__FitnessFunctionSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__5_in_rule__FitnessFunctionSpec__Group__4863);
            rule__FitnessFunctionSpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__4"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__4__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:463:1: rule__FitnessFunctionSpec__Group__4__Impl : ( 'method' ) ;
    public final void rule__FitnessFunctionSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:467:1: ( ( 'method' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:468:1: ( 'method' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:468:1: ( 'method' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:469:1: 'method'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getMethodKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__FitnessFunctionSpec__Group__4__Impl891); 
             after(grammarAccess.getFitnessFunctionSpecAccess().getMethodKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__4__Impl"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__5"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:482:1: rule__FitnessFunctionSpec__Group__5 : rule__FitnessFunctionSpec__Group__5__Impl rule__FitnessFunctionSpec__Group__6 ;
    public final void rule__FitnessFunctionSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:486:1: ( rule__FitnessFunctionSpec__Group__5__Impl rule__FitnessFunctionSpec__Group__6 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:487:2: rule__FitnessFunctionSpec__Group__5__Impl rule__FitnessFunctionSpec__Group__6
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__5__Impl_in_rule__FitnessFunctionSpec__Group__5922);
            rule__FitnessFunctionSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__6_in_rule__FitnessFunctionSpec__Group__5925);
            rule__FitnessFunctionSpec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__5"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__5__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:494:1: rule__FitnessFunctionSpec__Group__5__Impl : ( ( rule__FitnessFunctionSpec__MethodAssignment_5 ) ) ;
    public final void rule__FitnessFunctionSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:498:1: ( ( ( rule__FitnessFunctionSpec__MethodAssignment_5 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:499:1: ( ( rule__FitnessFunctionSpec__MethodAssignment_5 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:499:1: ( ( rule__FitnessFunctionSpec__MethodAssignment_5 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:500:1: ( rule__FitnessFunctionSpec__MethodAssignment_5 )
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getMethodAssignment_5()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:501:1: ( rule__FitnessFunctionSpec__MethodAssignment_5 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:501:2: rule__FitnessFunctionSpec__MethodAssignment_5
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__MethodAssignment_5_in_rule__FitnessFunctionSpec__Group__5__Impl952);
            rule__FitnessFunctionSpec__MethodAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFitnessFunctionSpecAccess().getMethodAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__5__Impl"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__6"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:511:1: rule__FitnessFunctionSpec__Group__6 : rule__FitnessFunctionSpec__Group__6__Impl ;
    public final void rule__FitnessFunctionSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:515:1: ( rule__FitnessFunctionSpec__Group__6__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:516:2: rule__FitnessFunctionSpec__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__6__Impl_in_rule__FitnessFunctionSpec__Group__6982);
            rule__FitnessFunctionSpec__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__6"


    // $ANTLR start "rule__FitnessFunctionSpec__Group__6__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:522:1: rule__FitnessFunctionSpec__Group__6__Impl : ( '}' ) ;
    public final void rule__FitnessFunctionSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:526:1: ( ( '}' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:527:1: ( '}' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:527:1: ( '}' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:528:1: '}'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__FitnessFunctionSpec__Group__6__Impl1010); 
             after(grammarAccess.getFitnessFunctionSpecAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__Group__6__Impl"


    // $ANTLR start "rule__EvolverSpec__Group__0"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:555:1: rule__EvolverSpec__Group__0 : rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1 ;
    public final void rule__EvolverSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:559:1: ( rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:560:2: rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__0__Impl_in_rule__EvolverSpec__Group__01055);
            rule__EvolverSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvolverSpec__Group__1_in_rule__EvolverSpec__Group__01058);
            rule__EvolverSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolverSpec__Group__0"


    // $ANTLR start "rule__EvolverSpec__Group__0__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:567:1: rule__EvolverSpec__Group__0__Impl : ( 'evolve' ) ;
    public final void rule__EvolverSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:571:1: ( ( 'evolve' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:572:1: ( 'evolve' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:572:1: ( 'evolve' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:573:1: 'evolve'
            {
             before(grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__EvolverSpec__Group__0__Impl1086); 
             after(grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolverSpec__Group__0__Impl"


    // $ANTLR start "rule__EvolverSpec__Group__1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:586:1: rule__EvolverSpec__Group__1 : rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2 ;
    public final void rule__EvolverSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:590:1: ( rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:591:2: rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__1__Impl_in_rule__EvolverSpec__Group__11117);
            rule__EvolverSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvolverSpec__Group__2_in_rule__EvolverSpec__Group__11120);
            rule__EvolverSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolverSpec__Group__1"


    // $ANTLR start "rule__EvolverSpec__Group__1__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:598:1: rule__EvolverSpec__Group__1__Impl : ( 'using' ) ;
    public final void rule__EvolverSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:602:1: ( ( 'using' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:603:1: ( 'using' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:603:1: ( 'using' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:604:1: 'using'
            {
             before(grammarAccess.getEvolverSpecAccess().getUsingKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__EvolverSpec__Group__1__Impl1148); 
             after(grammarAccess.getEvolverSpecAccess().getUsingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolverSpec__Group__1__Impl"


    // $ANTLR start "rule__EvolverSpec__Group__2"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:617:1: rule__EvolverSpec__Group__2 : rule__EvolverSpec__Group__2__Impl ;
    public final void rule__EvolverSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:621:1: ( rule__EvolverSpec__Group__2__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:622:2: rule__EvolverSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__2__Impl_in_rule__EvolverSpec__Group__21179);
            rule__EvolverSpec__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolverSpec__Group__2"


    // $ANTLR start "rule__EvolverSpec__Group__2__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:628:1: rule__EvolverSpec__Group__2__Impl : ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) ) ;
    public final void rule__EvolverSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:632:1: ( ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:633:1: ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:633:1: ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:634:1: ( rule__EvolverSpec__Rule_locationAssignment_2 )
            {
             before(grammarAccess.getEvolverSpecAccess().getRule_locationAssignment_2()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:635:1: ( rule__EvolverSpec__Rule_locationAssignment_2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:635:2: rule__EvolverSpec__Rule_locationAssignment_2
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Rule_locationAssignment_2_in_rule__EvolverSpec__Group__2__Impl1206);
            rule__EvolverSpec__Rule_locationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvolverSpecAccess().getRule_locationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolverSpec__Group__2__Impl"


    // $ANTLR start "rule__Optimisation__MetamodelAssignment_0"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:652:1: rule__Optimisation__MetamodelAssignment_0 : ( ruleMetaModelSpec ) ;
    public final void rule__Optimisation__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:656:1: ( ( ruleMetaModelSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:657:1: ( ruleMetaModelSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:657:1: ( ruleMetaModelSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:658:1: ruleMetaModelSpec
            {
             before(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMetaModelSpec_in_rule__Optimisation__MetamodelAssignment_01247);
            ruleMetaModelSpec();

            state._fsp--;

             after(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optimisation__MetamodelAssignment_0"


    // $ANTLR start "rule__Optimisation__FitnessAssignment_1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:667:1: rule__Optimisation__FitnessAssignment_1 : ( ruleFitnessFunctionSpec ) ;
    public final void rule__Optimisation__FitnessAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:671:1: ( ( ruleFitnessFunctionSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:672:1: ( ruleFitnessFunctionSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:672:1: ( ruleFitnessFunctionSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:673:1: ruleFitnessFunctionSpec
            {
             before(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFitnessFunctionSpec_in_rule__Optimisation__FitnessAssignment_11278);
            ruleFitnessFunctionSpec();

            state._fsp--;

             after(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optimisation__FitnessAssignment_1"


    // $ANTLR start "rule__Optimisation__EvolversAssignment_2"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:682:1: rule__Optimisation__EvolversAssignment_2 : ( ruleEvolverSpec ) ;
    public final void rule__Optimisation__EvolversAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:686:1: ( ( ruleEvolverSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:687:1: ( ruleEvolverSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:687:1: ( ruleEvolverSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:688:1: ruleEvolverSpec
            {
             before(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEvolverSpec_in_rule__Optimisation__EvolversAssignment_21309);
            ruleEvolverSpec();

            state._fsp--;

             after(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optimisation__EvolversAssignment_2"


    // $ANTLR start "rule__MetaModelSpec__LocationAssignment_1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:697:1: rule__MetaModelSpec__LocationAssignment_1 : ( RULE_URL ) ;
    public final void rule__MetaModelSpec__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:701:1: ( ( RULE_URL ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:702:1: ( RULE_URL )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:702:1: ( RULE_URL )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:703:1: RULE_URL
            {
             before(grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__MetaModelSpec__LocationAssignment_11340); 
             after(grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModelSpec__LocationAssignment_1"


    // $ANTLR start "rule__FitnessFunctionSpec__ClassAssignment_3"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:712:1: rule__FitnessFunctionSpec__ClassAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FitnessFunctionSpec__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:716:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:717:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:717:1: ( RULE_STRING )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:718:1: RULE_STRING
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__ClassAssignment_31371); 
             after(grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__ClassAssignment_3"


    // $ANTLR start "rule__FitnessFunctionSpec__MethodAssignment_5"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:727:1: rule__FitnessFunctionSpec__MethodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__FitnessFunctionSpec__MethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:731:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:732:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:732:1: ( RULE_STRING )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:733:1: RULE_STRING
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getMethodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__MethodAssignment_51402); 
             after(grammarAccess.getFitnessFunctionSpecAccess().getMethodSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FitnessFunctionSpec__MethodAssignment_5"


    // $ANTLR start "rule__EvolverSpec__Rule_locationAssignment_2"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:742:1: rule__EvolverSpec__Rule_locationAssignment_2 : ( RULE_URL ) ;
    public final void rule__EvolverSpec__Rule_locationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:746:1: ( ( RULE_URL ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:747:1: ( RULE_URL )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:747:1: ( RULE_URL )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:748:1: RULE_URL
            {
             before(grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__EvolverSpec__Rule_locationAssignment_21433); 
             after(grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvolverSpec__Rule_locationAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleOptimisation_in_entryRuleOptimisation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptimisation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__0_in_ruleOptimisation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModelSpec_in_entryRuleMetaModelSpec121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaModelSpec128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__0_in_ruleMetaModelSpec154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFitnessFunctionSpec_in_entryRuleFitnessFunctionSpec181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFitnessFunctionSpec188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__0_in_ruleFitnessFunctionSpec214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvolverSpec_in_entryRuleEvolverSpec241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvolverSpec248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__0_in_ruleEvolverSpec274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__0__Impl_in_rule__Optimisation__Group__0308 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__1_in_rule__Optimisation__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__MetamodelAssignment_0_in_rule__Optimisation__Group__0__Impl338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__1__Impl_in_rule__Optimisation__Group__1368 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__2_in_rule__Optimisation__Group__1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__FitnessAssignment_1_in_rule__Optimisation__Group__1__Impl398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__2__Impl_in_rule__Optimisation__Group__2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__EvolversAssignment_2_in_rule__Optimisation__Group__2__Impl455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__0__Impl_in_rule__MetaModelSpec__Group__0491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__1_in_rule__MetaModelSpec__Group__0494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MetaModelSpec__Group__0__Impl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__1__Impl_in_rule__MetaModelSpec__Group__1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__LocationAssignment_1_in_rule__MetaModelSpec__Group__1__Impl580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__0__Impl_in_rule__FitnessFunctionSpec__Group__0614 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__1_in_rule__FitnessFunctionSpec__Group__0617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FitnessFunctionSpec__Group__0__Impl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__1__Impl_in_rule__FitnessFunctionSpec__Group__1676 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__2_in_rule__FitnessFunctionSpec__Group__1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FitnessFunctionSpec__Group__1__Impl707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__2__Impl_in_rule__FitnessFunctionSpec__Group__2738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__3_in_rule__FitnessFunctionSpec__Group__2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FitnessFunctionSpec__Group__2__Impl769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__3__Impl_in_rule__FitnessFunctionSpec__Group__3800 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__4_in_rule__FitnessFunctionSpec__Group__3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__ClassAssignment_3_in_rule__FitnessFunctionSpec__Group__3__Impl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__4__Impl_in_rule__FitnessFunctionSpec__Group__4860 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__5_in_rule__FitnessFunctionSpec__Group__4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FitnessFunctionSpec__Group__4__Impl891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__5__Impl_in_rule__FitnessFunctionSpec__Group__5922 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__6_in_rule__FitnessFunctionSpec__Group__5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__MethodAssignment_5_in_rule__FitnessFunctionSpec__Group__5__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__6__Impl_in_rule__FitnessFunctionSpec__Group__6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FitnessFunctionSpec__Group__6__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__0__Impl_in_rule__EvolverSpec__Group__01055 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__1_in_rule__EvolverSpec__Group__01058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EvolverSpec__Group__0__Impl1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__1__Impl_in_rule__EvolverSpec__Group__11117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__2_in_rule__EvolverSpec__Group__11120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EvolverSpec__Group__1__Impl1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__2__Impl_in_rule__EvolverSpec__Group__21179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Rule_locationAssignment_2_in_rule__EvolverSpec__Group__2__Impl1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModelSpec_in_rule__Optimisation__MetamodelAssignment_01247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFitnessFunctionSpec_in_rule__Optimisation__FitnessAssignment_11278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvolverSpec_in_rule__Optimisation__EvolversAssignment_21309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__MetaModelSpec__LocationAssignment_11340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__ClassAssignment_31371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__MethodAssignment_51402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__EvolverSpec__Rule_locationAssignment_21433 = new BitSet(new long[]{0x0000000000000002L});

}