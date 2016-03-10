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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:243:1: rule__Optimisation__Group__2__Impl : ( ( ( rule__Optimisation__EvolversAssignment_2 ) ) ( ( rule__Optimisation__EvolversAssignment_2 )* ) ) ;
    public final void rule__Optimisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:247:1: ( ( ( ( rule__Optimisation__EvolversAssignment_2 ) ) ( ( rule__Optimisation__EvolversAssignment_2 )* ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:248:1: ( ( ( rule__Optimisation__EvolversAssignment_2 ) ) ( ( rule__Optimisation__EvolversAssignment_2 )* ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:248:1: ( ( ( rule__Optimisation__EvolversAssignment_2 ) ) ( ( rule__Optimisation__EvolversAssignment_2 )* ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:249:1: ( ( rule__Optimisation__EvolversAssignment_2 ) ) ( ( rule__Optimisation__EvolversAssignment_2 )* )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:249:1: ( ( rule__Optimisation__EvolversAssignment_2 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:250:1: ( rule__Optimisation__EvolversAssignment_2 )
            {
             before(grammarAccess.getOptimisationAccess().getEvolversAssignment_2()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:251:1: ( rule__Optimisation__EvolversAssignment_2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:251:2: rule__Optimisation__EvolversAssignment_2
            {
            pushFollow(FOLLOW_rule__Optimisation__EvolversAssignment_2_in_rule__Optimisation__Group__2__Impl457);
            rule__Optimisation__EvolversAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getEvolversAssignment_2()); 

            }

            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:254:1: ( ( rule__Optimisation__EvolversAssignment_2 )* )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:255:1: ( rule__Optimisation__EvolversAssignment_2 )*
            {
             before(grammarAccess.getOptimisationAccess().getEvolversAssignment_2()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:256:1: ( rule__Optimisation__EvolversAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:256:2: rule__Optimisation__EvolversAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Optimisation__EvolversAssignment_2_in_rule__Optimisation__Group__2__Impl469);
            	    rule__Optimisation__EvolversAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOptimisationAccess().getEvolversAssignment_2()); 

            }


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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:273:1: rule__MetaModelSpec__Group__0 : rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1 ;
    public final void rule__MetaModelSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:277:1: ( rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:278:2: rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__Group__0__Impl_in_rule__MetaModelSpec__Group__0508);
            rule__MetaModelSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModelSpec__Group__1_in_rule__MetaModelSpec__Group__0511);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:285:1: rule__MetaModelSpec__Group__0__Impl : ( 'metamodel' ) ;
    public final void rule__MetaModelSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:289:1: ( ( 'metamodel' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:290:1: ( 'metamodel' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:290:1: ( 'metamodel' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:291:1: 'metamodel'
            {
             before(grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__MetaModelSpec__Group__0__Impl539); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:304:1: rule__MetaModelSpec__Group__1 : rule__MetaModelSpec__Group__1__Impl ;
    public final void rule__MetaModelSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:308:1: ( rule__MetaModelSpec__Group__1__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:309:2: rule__MetaModelSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__Group__1__Impl_in_rule__MetaModelSpec__Group__1570);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:315:1: rule__MetaModelSpec__Group__1__Impl : ( ( rule__MetaModelSpec__LocationAssignment_1 ) ) ;
    public final void rule__MetaModelSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:319:1: ( ( ( rule__MetaModelSpec__LocationAssignment_1 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:320:1: ( ( rule__MetaModelSpec__LocationAssignment_1 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:320:1: ( ( rule__MetaModelSpec__LocationAssignment_1 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:321:1: ( rule__MetaModelSpec__LocationAssignment_1 )
            {
             before(grammarAccess.getMetaModelSpecAccess().getLocationAssignment_1()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:322:1: ( rule__MetaModelSpec__LocationAssignment_1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:322:2: rule__MetaModelSpec__LocationAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__LocationAssignment_1_in_rule__MetaModelSpec__Group__1__Impl597);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:336:1: rule__FitnessFunctionSpec__Group__0 : rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1 ;
    public final void rule__FitnessFunctionSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:340:1: ( rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:341:2: rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__0__Impl_in_rule__FitnessFunctionSpec__Group__0631);
            rule__FitnessFunctionSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__1_in_rule__FitnessFunctionSpec__Group__0634);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:348:1: rule__FitnessFunctionSpec__Group__0__Impl : ( 'fitness' ) ;
    public final void rule__FitnessFunctionSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:352:1: ( ( 'fitness' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:353:1: ( 'fitness' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:353:1: ( 'fitness' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:354:1: 'fitness'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__FitnessFunctionSpec__Group__0__Impl662); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:367:1: rule__FitnessFunctionSpec__Group__1 : rule__FitnessFunctionSpec__Group__1__Impl rule__FitnessFunctionSpec__Group__2 ;
    public final void rule__FitnessFunctionSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:371:1: ( rule__FitnessFunctionSpec__Group__1__Impl rule__FitnessFunctionSpec__Group__2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:372:2: rule__FitnessFunctionSpec__Group__1__Impl rule__FitnessFunctionSpec__Group__2
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__1__Impl_in_rule__FitnessFunctionSpec__Group__1693);
            rule__FitnessFunctionSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__2_in_rule__FitnessFunctionSpec__Group__1696);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:379:1: rule__FitnessFunctionSpec__Group__1__Impl : ( '{' ) ;
    public final void rule__FitnessFunctionSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:383:1: ( ( '{' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:384:1: ( '{' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:384:1: ( '{' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:385:1: '{'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__FitnessFunctionSpec__Group__1__Impl724); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:398:1: rule__FitnessFunctionSpec__Group__2 : rule__FitnessFunctionSpec__Group__2__Impl rule__FitnessFunctionSpec__Group__3 ;
    public final void rule__FitnessFunctionSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:402:1: ( rule__FitnessFunctionSpec__Group__2__Impl rule__FitnessFunctionSpec__Group__3 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:403:2: rule__FitnessFunctionSpec__Group__2__Impl rule__FitnessFunctionSpec__Group__3
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__2__Impl_in_rule__FitnessFunctionSpec__Group__2755);
            rule__FitnessFunctionSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__3_in_rule__FitnessFunctionSpec__Group__2758);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:410:1: rule__FitnessFunctionSpec__Group__2__Impl : ( 'class' ) ;
    public final void rule__FitnessFunctionSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:414:1: ( ( 'class' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:415:1: ( 'class' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:415:1: ( 'class' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:416:1: 'class'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__FitnessFunctionSpec__Group__2__Impl786); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:429:1: rule__FitnessFunctionSpec__Group__3 : rule__FitnessFunctionSpec__Group__3__Impl rule__FitnessFunctionSpec__Group__4 ;
    public final void rule__FitnessFunctionSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:433:1: ( rule__FitnessFunctionSpec__Group__3__Impl rule__FitnessFunctionSpec__Group__4 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:434:2: rule__FitnessFunctionSpec__Group__3__Impl rule__FitnessFunctionSpec__Group__4
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__3__Impl_in_rule__FitnessFunctionSpec__Group__3817);
            rule__FitnessFunctionSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__4_in_rule__FitnessFunctionSpec__Group__3820);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:441:1: rule__FitnessFunctionSpec__Group__3__Impl : ( ( rule__FitnessFunctionSpec__ClassAssignment_3 ) ) ;
    public final void rule__FitnessFunctionSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:445:1: ( ( ( rule__FitnessFunctionSpec__ClassAssignment_3 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:446:1: ( ( rule__FitnessFunctionSpec__ClassAssignment_3 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:446:1: ( ( rule__FitnessFunctionSpec__ClassAssignment_3 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:447:1: ( rule__FitnessFunctionSpec__ClassAssignment_3 )
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassAssignment_3()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:448:1: ( rule__FitnessFunctionSpec__ClassAssignment_3 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:448:2: rule__FitnessFunctionSpec__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__ClassAssignment_3_in_rule__FitnessFunctionSpec__Group__3__Impl847);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:458:1: rule__FitnessFunctionSpec__Group__4 : rule__FitnessFunctionSpec__Group__4__Impl rule__FitnessFunctionSpec__Group__5 ;
    public final void rule__FitnessFunctionSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:462:1: ( rule__FitnessFunctionSpec__Group__4__Impl rule__FitnessFunctionSpec__Group__5 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:463:2: rule__FitnessFunctionSpec__Group__4__Impl rule__FitnessFunctionSpec__Group__5
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__4__Impl_in_rule__FitnessFunctionSpec__Group__4877);
            rule__FitnessFunctionSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__5_in_rule__FitnessFunctionSpec__Group__4880);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:470:1: rule__FitnessFunctionSpec__Group__4__Impl : ( 'method' ) ;
    public final void rule__FitnessFunctionSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:474:1: ( ( 'method' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:475:1: ( 'method' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:475:1: ( 'method' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:476:1: 'method'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getMethodKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__FitnessFunctionSpec__Group__4__Impl908); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:489:1: rule__FitnessFunctionSpec__Group__5 : rule__FitnessFunctionSpec__Group__5__Impl rule__FitnessFunctionSpec__Group__6 ;
    public final void rule__FitnessFunctionSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:493:1: ( rule__FitnessFunctionSpec__Group__5__Impl rule__FitnessFunctionSpec__Group__6 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:494:2: rule__FitnessFunctionSpec__Group__5__Impl rule__FitnessFunctionSpec__Group__6
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__5__Impl_in_rule__FitnessFunctionSpec__Group__5939);
            rule__FitnessFunctionSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__6_in_rule__FitnessFunctionSpec__Group__5942);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:501:1: rule__FitnessFunctionSpec__Group__5__Impl : ( ( rule__FitnessFunctionSpec__MethodAssignment_5 ) ) ;
    public final void rule__FitnessFunctionSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:505:1: ( ( ( rule__FitnessFunctionSpec__MethodAssignment_5 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:506:1: ( ( rule__FitnessFunctionSpec__MethodAssignment_5 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:506:1: ( ( rule__FitnessFunctionSpec__MethodAssignment_5 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:507:1: ( rule__FitnessFunctionSpec__MethodAssignment_5 )
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getMethodAssignment_5()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:508:1: ( rule__FitnessFunctionSpec__MethodAssignment_5 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:508:2: rule__FitnessFunctionSpec__MethodAssignment_5
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__MethodAssignment_5_in_rule__FitnessFunctionSpec__Group__5__Impl969);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:518:1: rule__FitnessFunctionSpec__Group__6 : rule__FitnessFunctionSpec__Group__6__Impl ;
    public final void rule__FitnessFunctionSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:522:1: ( rule__FitnessFunctionSpec__Group__6__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:523:2: rule__FitnessFunctionSpec__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__6__Impl_in_rule__FitnessFunctionSpec__Group__6999);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:529:1: rule__FitnessFunctionSpec__Group__6__Impl : ( '}' ) ;
    public final void rule__FitnessFunctionSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:533:1: ( ( '}' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:534:1: ( '}' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:534:1: ( '}' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:535:1: '}'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__FitnessFunctionSpec__Group__6__Impl1027); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:562:1: rule__EvolverSpec__Group__0 : rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1 ;
    public final void rule__EvolverSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:566:1: ( rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:567:2: rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__0__Impl_in_rule__EvolverSpec__Group__01072);
            rule__EvolverSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvolverSpec__Group__1_in_rule__EvolverSpec__Group__01075);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:574:1: rule__EvolverSpec__Group__0__Impl : ( 'evolve' ) ;
    public final void rule__EvolverSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:578:1: ( ( 'evolve' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:579:1: ( 'evolve' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:579:1: ( 'evolve' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:580:1: 'evolve'
            {
             before(grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__EvolverSpec__Group__0__Impl1103); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:1: rule__EvolverSpec__Group__1 : rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2 ;
    public final void rule__EvolverSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:597:1: ( rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:598:2: rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__1__Impl_in_rule__EvolverSpec__Group__11134);
            rule__EvolverSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvolverSpec__Group__2_in_rule__EvolverSpec__Group__11137);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:605:1: rule__EvolverSpec__Group__1__Impl : ( 'using' ) ;
    public final void rule__EvolverSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:609:1: ( ( 'using' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:610:1: ( 'using' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:610:1: ( 'using' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:611:1: 'using'
            {
             before(grammarAccess.getEvolverSpecAccess().getUsingKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__EvolverSpec__Group__1__Impl1165); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:624:1: rule__EvolverSpec__Group__2 : rule__EvolverSpec__Group__2__Impl ;
    public final void rule__EvolverSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:628:1: ( rule__EvolverSpec__Group__2__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:629:2: rule__EvolverSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__2__Impl_in_rule__EvolverSpec__Group__21196);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:635:1: rule__EvolverSpec__Group__2__Impl : ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) ) ;
    public final void rule__EvolverSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:639:1: ( ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:640:1: ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:640:1: ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:641:1: ( rule__EvolverSpec__Rule_locationAssignment_2 )
            {
             before(grammarAccess.getEvolverSpecAccess().getRule_locationAssignment_2()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:642:1: ( rule__EvolverSpec__Rule_locationAssignment_2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:642:2: rule__EvolverSpec__Rule_locationAssignment_2
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Rule_locationAssignment_2_in_rule__EvolverSpec__Group__2__Impl1223);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:659:1: rule__Optimisation__MetamodelAssignment_0 : ( ruleMetaModelSpec ) ;
    public final void rule__Optimisation__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:663:1: ( ( ruleMetaModelSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:664:1: ( ruleMetaModelSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:664:1: ( ruleMetaModelSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:665:1: ruleMetaModelSpec
            {
             before(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMetaModelSpec_in_rule__Optimisation__MetamodelAssignment_01264);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:674:1: rule__Optimisation__FitnessAssignment_1 : ( ruleFitnessFunctionSpec ) ;
    public final void rule__Optimisation__FitnessAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:678:1: ( ( ruleFitnessFunctionSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:679:1: ( ruleFitnessFunctionSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:679:1: ( ruleFitnessFunctionSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:680:1: ruleFitnessFunctionSpec
            {
             before(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFitnessFunctionSpec_in_rule__Optimisation__FitnessAssignment_11295);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:689:1: rule__Optimisation__EvolversAssignment_2 : ( ruleEvolverSpec ) ;
    public final void rule__Optimisation__EvolversAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:693:1: ( ( ruleEvolverSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:694:1: ( ruleEvolverSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:694:1: ( ruleEvolverSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:695:1: ruleEvolverSpec
            {
             before(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEvolverSpec_in_rule__Optimisation__EvolversAssignment_21326);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:704:1: rule__MetaModelSpec__LocationAssignment_1 : ( RULE_URL ) ;
    public final void rule__MetaModelSpec__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:708:1: ( ( RULE_URL ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:709:1: ( RULE_URL )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:709:1: ( RULE_URL )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:710:1: RULE_URL
            {
             before(grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__MetaModelSpec__LocationAssignment_11357); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:719:1: rule__FitnessFunctionSpec__ClassAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FitnessFunctionSpec__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:723:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:724:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:724:1: ( RULE_STRING )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:725:1: RULE_STRING
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__ClassAssignment_31388); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:734:1: rule__FitnessFunctionSpec__MethodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__FitnessFunctionSpec__MethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:738:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:739:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:739:1: ( RULE_STRING )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:740:1: RULE_STRING
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getMethodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__MethodAssignment_51419); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:749:1: rule__EvolverSpec__Rule_locationAssignment_2 : ( RULE_URL ) ;
    public final void rule__EvolverSpec__Rule_locationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:753:1: ( ( RULE_URL ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:754:1: ( RULE_URL )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:754:1: ( RULE_URL )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:755:1: RULE_URL
            {
             before(grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__EvolverSpec__Rule_locationAssignment_21450); 
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
    public static final BitSet FOLLOW_rule__Optimisation__EvolversAssignment_2_in_rule__Optimisation__Group__2__Impl457 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Optimisation__EvolversAssignment_2_in_rule__Optimisation__Group__2__Impl469 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__0__Impl_in_rule__MetaModelSpec__Group__0508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__1_in_rule__MetaModelSpec__Group__0511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MetaModelSpec__Group__0__Impl539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__1__Impl_in_rule__MetaModelSpec__Group__1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__LocationAssignment_1_in_rule__MetaModelSpec__Group__1__Impl597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__0__Impl_in_rule__FitnessFunctionSpec__Group__0631 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__1_in_rule__FitnessFunctionSpec__Group__0634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FitnessFunctionSpec__Group__0__Impl662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__1__Impl_in_rule__FitnessFunctionSpec__Group__1693 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__2_in_rule__FitnessFunctionSpec__Group__1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FitnessFunctionSpec__Group__1__Impl724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__2__Impl_in_rule__FitnessFunctionSpec__Group__2755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__3_in_rule__FitnessFunctionSpec__Group__2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FitnessFunctionSpec__Group__2__Impl786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__3__Impl_in_rule__FitnessFunctionSpec__Group__3817 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__4_in_rule__FitnessFunctionSpec__Group__3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__ClassAssignment_3_in_rule__FitnessFunctionSpec__Group__3__Impl847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__4__Impl_in_rule__FitnessFunctionSpec__Group__4877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__5_in_rule__FitnessFunctionSpec__Group__4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FitnessFunctionSpec__Group__4__Impl908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__5__Impl_in_rule__FitnessFunctionSpec__Group__5939 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__6_in_rule__FitnessFunctionSpec__Group__5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__MethodAssignment_5_in_rule__FitnessFunctionSpec__Group__5__Impl969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__6__Impl_in_rule__FitnessFunctionSpec__Group__6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FitnessFunctionSpec__Group__6__Impl1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__0__Impl_in_rule__EvolverSpec__Group__01072 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__1_in_rule__EvolverSpec__Group__01075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EvolverSpec__Group__0__Impl1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__1__Impl_in_rule__EvolverSpec__Group__11134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__2_in_rule__EvolverSpec__Group__11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EvolverSpec__Group__1__Impl1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__2__Impl_in_rule__EvolverSpec__Group__21196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Rule_locationAssignment_2_in_rule__EvolverSpec__Group__2__Impl1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModelSpec_in_rule__Optimisation__MetamodelAssignment_01264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFitnessFunctionSpec_in_rule__Optimisation__FitnessAssignment_11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvolverSpec_in_rule__Optimisation__EvolversAssignment_21326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__MetaModelSpec__LocationAssignment_11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__ClassAssignment_31388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__MethodAssignment_51419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__EvolverSpec__Rule_locationAssignment_21450 = new BitSet(new long[]{0x0000000000000002L});

}