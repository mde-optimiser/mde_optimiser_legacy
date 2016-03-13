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


    // $ANTLR start "entryRuleBasepathSpec"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:88:1: entryRuleBasepathSpec : ruleBasepathSpec EOF ;
    public final void entryRuleBasepathSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:89:1: ( ruleBasepathSpec EOF )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:90:1: ruleBasepathSpec EOF
            {
             before(grammarAccess.getBasepathSpecRule()); 
            pushFollow(FOLLOW_ruleBasepathSpec_in_entryRuleBasepathSpec121);
            ruleBasepathSpec();

            state._fsp--;

             after(grammarAccess.getBasepathSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasepathSpec128); 

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
    // $ANTLR end "entryRuleBasepathSpec"


    // $ANTLR start "ruleBasepathSpec"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:97:1: ruleBasepathSpec : ( ( rule__BasepathSpec__Group__0 ) ) ;
    public final void ruleBasepathSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:101:2: ( ( ( rule__BasepathSpec__Group__0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:102:1: ( ( rule__BasepathSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:102:1: ( ( rule__BasepathSpec__Group__0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:103:1: ( rule__BasepathSpec__Group__0 )
            {
             before(grammarAccess.getBasepathSpecAccess().getGroup()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:104:1: ( rule__BasepathSpec__Group__0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:104:2: rule__BasepathSpec__Group__0
            {
            pushFollow(FOLLOW_rule__BasepathSpec__Group__0_in_ruleBasepathSpec154);
            rule__BasepathSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasepathSpecAccess().getGroup()); 

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
    // $ANTLR end "ruleBasepathSpec"


    // $ANTLR start "entryRuleMetaModelSpec"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:116:1: entryRuleMetaModelSpec : ruleMetaModelSpec EOF ;
    public final void entryRuleMetaModelSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:117:1: ( ruleMetaModelSpec EOF )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:118:1: ruleMetaModelSpec EOF
            {
             before(grammarAccess.getMetaModelSpecRule()); 
            pushFollow(FOLLOW_ruleMetaModelSpec_in_entryRuleMetaModelSpec181);
            ruleMetaModelSpec();

            state._fsp--;

             after(grammarAccess.getMetaModelSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaModelSpec188); 

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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:125:1: ruleMetaModelSpec : ( ( rule__MetaModelSpec__Group__0 ) ) ;
    public final void ruleMetaModelSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:129:2: ( ( ( rule__MetaModelSpec__Group__0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:130:1: ( ( rule__MetaModelSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:130:1: ( ( rule__MetaModelSpec__Group__0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:131:1: ( rule__MetaModelSpec__Group__0 )
            {
             before(grammarAccess.getMetaModelSpecAccess().getGroup()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:132:1: ( rule__MetaModelSpec__Group__0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:132:2: rule__MetaModelSpec__Group__0
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__Group__0_in_ruleMetaModelSpec214);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:144:1: entryRuleFitnessFunctionSpec : ruleFitnessFunctionSpec EOF ;
    public final void entryRuleFitnessFunctionSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:145:1: ( ruleFitnessFunctionSpec EOF )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:146:1: ruleFitnessFunctionSpec EOF
            {
             before(grammarAccess.getFitnessFunctionSpecRule()); 
            pushFollow(FOLLOW_ruleFitnessFunctionSpec_in_entryRuleFitnessFunctionSpec241);
            ruleFitnessFunctionSpec();

            state._fsp--;

             after(grammarAccess.getFitnessFunctionSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFitnessFunctionSpec248); 

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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:153:1: ruleFitnessFunctionSpec : ( ( rule__FitnessFunctionSpec__Group__0 ) ) ;
    public final void ruleFitnessFunctionSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:157:2: ( ( ( rule__FitnessFunctionSpec__Group__0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:158:1: ( ( rule__FitnessFunctionSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:158:1: ( ( rule__FitnessFunctionSpec__Group__0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:159:1: ( rule__FitnessFunctionSpec__Group__0 )
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getGroup()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:160:1: ( rule__FitnessFunctionSpec__Group__0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:160:2: rule__FitnessFunctionSpec__Group__0
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__0_in_ruleFitnessFunctionSpec274);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:172:1: entryRuleEvolverSpec : ruleEvolverSpec EOF ;
    public final void entryRuleEvolverSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:173:1: ( ruleEvolverSpec EOF )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:174:1: ruleEvolverSpec EOF
            {
             before(grammarAccess.getEvolverSpecRule()); 
            pushFollow(FOLLOW_ruleEvolverSpec_in_entryRuleEvolverSpec301);
            ruleEvolverSpec();

            state._fsp--;

             after(grammarAccess.getEvolverSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvolverSpec308); 

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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:181:1: ruleEvolverSpec : ( ( rule__EvolverSpec__Group__0 ) ) ;
    public final void ruleEvolverSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:185:2: ( ( ( rule__EvolverSpec__Group__0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:186:1: ( ( rule__EvolverSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:186:1: ( ( rule__EvolverSpec__Group__0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:187:1: ( rule__EvolverSpec__Group__0 )
            {
             before(grammarAccess.getEvolverSpecAccess().getGroup()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:188:1: ( rule__EvolverSpec__Group__0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:188:2: rule__EvolverSpec__Group__0
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__0_in_ruleEvolverSpec334);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:202:1: rule__Optimisation__Group__0 : rule__Optimisation__Group__0__Impl rule__Optimisation__Group__1 ;
    public final void rule__Optimisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:206:1: ( rule__Optimisation__Group__0__Impl rule__Optimisation__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:207:2: rule__Optimisation__Group__0__Impl rule__Optimisation__Group__1
            {
            pushFollow(FOLLOW_rule__Optimisation__Group__0__Impl_in_rule__Optimisation__Group__0368);
            rule__Optimisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optimisation__Group__1_in_rule__Optimisation__Group__0371);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:214:1: rule__Optimisation__Group__0__Impl : ( ( rule__Optimisation__BasepathAssignment_0 ) ) ;
    public final void rule__Optimisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:218:1: ( ( ( rule__Optimisation__BasepathAssignment_0 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:219:1: ( ( rule__Optimisation__BasepathAssignment_0 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:219:1: ( ( rule__Optimisation__BasepathAssignment_0 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:220:1: ( rule__Optimisation__BasepathAssignment_0 )
            {
             before(grammarAccess.getOptimisationAccess().getBasepathAssignment_0()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:221:1: ( rule__Optimisation__BasepathAssignment_0 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:221:2: rule__Optimisation__BasepathAssignment_0
            {
            pushFollow(FOLLOW_rule__Optimisation__BasepathAssignment_0_in_rule__Optimisation__Group__0__Impl398);
            rule__Optimisation__BasepathAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getBasepathAssignment_0()); 

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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:231:1: rule__Optimisation__Group__1 : rule__Optimisation__Group__1__Impl rule__Optimisation__Group__2 ;
    public final void rule__Optimisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:235:1: ( rule__Optimisation__Group__1__Impl rule__Optimisation__Group__2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:236:2: rule__Optimisation__Group__1__Impl rule__Optimisation__Group__2
            {
            pushFollow(FOLLOW_rule__Optimisation__Group__1__Impl_in_rule__Optimisation__Group__1428);
            rule__Optimisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optimisation__Group__2_in_rule__Optimisation__Group__1431);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:243:1: rule__Optimisation__Group__1__Impl : ( ( rule__Optimisation__MetamodelAssignment_1 ) ) ;
    public final void rule__Optimisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:247:1: ( ( ( rule__Optimisation__MetamodelAssignment_1 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:248:1: ( ( rule__Optimisation__MetamodelAssignment_1 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:248:1: ( ( rule__Optimisation__MetamodelAssignment_1 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:249:1: ( rule__Optimisation__MetamodelAssignment_1 )
            {
             before(grammarAccess.getOptimisationAccess().getMetamodelAssignment_1()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:250:1: ( rule__Optimisation__MetamodelAssignment_1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:250:2: rule__Optimisation__MetamodelAssignment_1
            {
            pushFollow(FOLLOW_rule__Optimisation__MetamodelAssignment_1_in_rule__Optimisation__Group__1__Impl458);
            rule__Optimisation__MetamodelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getMetamodelAssignment_1()); 

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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:260:1: rule__Optimisation__Group__2 : rule__Optimisation__Group__2__Impl rule__Optimisation__Group__3 ;
    public final void rule__Optimisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:264:1: ( rule__Optimisation__Group__2__Impl rule__Optimisation__Group__3 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:265:2: rule__Optimisation__Group__2__Impl rule__Optimisation__Group__3
            {
            pushFollow(FOLLOW_rule__Optimisation__Group__2__Impl_in_rule__Optimisation__Group__2488);
            rule__Optimisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optimisation__Group__3_in_rule__Optimisation__Group__2491);
            rule__Optimisation__Group__3();

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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:272:1: rule__Optimisation__Group__2__Impl : ( ( rule__Optimisation__FitnessAssignment_2 ) ) ;
    public final void rule__Optimisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:276:1: ( ( ( rule__Optimisation__FitnessAssignment_2 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:277:1: ( ( rule__Optimisation__FitnessAssignment_2 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:277:1: ( ( rule__Optimisation__FitnessAssignment_2 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:278:1: ( rule__Optimisation__FitnessAssignment_2 )
            {
             before(grammarAccess.getOptimisationAccess().getFitnessAssignment_2()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:279:1: ( rule__Optimisation__FitnessAssignment_2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:279:2: rule__Optimisation__FitnessAssignment_2
            {
            pushFollow(FOLLOW_rule__Optimisation__FitnessAssignment_2_in_rule__Optimisation__Group__2__Impl518);
            rule__Optimisation__FitnessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getFitnessAssignment_2()); 

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


    // $ANTLR start "rule__Optimisation__Group__3"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:289:1: rule__Optimisation__Group__3 : rule__Optimisation__Group__3__Impl ;
    public final void rule__Optimisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:293:1: ( rule__Optimisation__Group__3__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:294:2: rule__Optimisation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Optimisation__Group__3__Impl_in_rule__Optimisation__Group__3548);
            rule__Optimisation__Group__3__Impl();

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
    // $ANTLR end "rule__Optimisation__Group__3"


    // $ANTLR start "rule__Optimisation__Group__3__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:300:1: rule__Optimisation__Group__3__Impl : ( ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* ) ) ;
    public final void rule__Optimisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:304:1: ( ( ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:305:1: ( ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:305:1: ( ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:306:1: ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:306:1: ( ( rule__Optimisation__EvolversAssignment_3 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:307:1: ( rule__Optimisation__EvolversAssignment_3 )
            {
             before(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:308:1: ( rule__Optimisation__EvolversAssignment_3 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:308:2: rule__Optimisation__EvolversAssignment_3
            {
            pushFollow(FOLLOW_rule__Optimisation__EvolversAssignment_3_in_rule__Optimisation__Group__3__Impl577);
            rule__Optimisation__EvolversAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); 

            }

            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:311:1: ( ( rule__Optimisation__EvolversAssignment_3 )* )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:312:1: ( rule__Optimisation__EvolversAssignment_3 )*
            {
             before(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:313:1: ( rule__Optimisation__EvolversAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:313:2: rule__Optimisation__EvolversAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Optimisation__EvolversAssignment_3_in_rule__Optimisation__Group__3__Impl589);
            	    rule__Optimisation__EvolversAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); 

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
    // $ANTLR end "rule__Optimisation__Group__3__Impl"


    // $ANTLR start "rule__BasepathSpec__Group__0"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:332:1: rule__BasepathSpec__Group__0 : rule__BasepathSpec__Group__0__Impl rule__BasepathSpec__Group__1 ;
    public final void rule__BasepathSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:336:1: ( rule__BasepathSpec__Group__0__Impl rule__BasepathSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:337:2: rule__BasepathSpec__Group__0__Impl rule__BasepathSpec__Group__1
            {
            pushFollow(FOLLOW_rule__BasepathSpec__Group__0__Impl_in_rule__BasepathSpec__Group__0630);
            rule__BasepathSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasepathSpec__Group__1_in_rule__BasepathSpec__Group__0633);
            rule__BasepathSpec__Group__1();

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
    // $ANTLR end "rule__BasepathSpec__Group__0"


    // $ANTLR start "rule__BasepathSpec__Group__0__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:344:1: rule__BasepathSpec__Group__0__Impl : ( 'basepath' ) ;
    public final void rule__BasepathSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:348:1: ( ( 'basepath' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:349:1: ( 'basepath' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:349:1: ( 'basepath' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:350:1: 'basepath'
            {
             before(grammarAccess.getBasepathSpecAccess().getBasepathKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__BasepathSpec__Group__0__Impl661); 
             after(grammarAccess.getBasepathSpecAccess().getBasepathKeyword_0()); 

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
    // $ANTLR end "rule__BasepathSpec__Group__0__Impl"


    // $ANTLR start "rule__BasepathSpec__Group__1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:363:1: rule__BasepathSpec__Group__1 : rule__BasepathSpec__Group__1__Impl ;
    public final void rule__BasepathSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:367:1: ( rule__BasepathSpec__Group__1__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:368:2: rule__BasepathSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BasepathSpec__Group__1__Impl_in_rule__BasepathSpec__Group__1692);
            rule__BasepathSpec__Group__1__Impl();

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
    // $ANTLR end "rule__BasepathSpec__Group__1"


    // $ANTLR start "rule__BasepathSpec__Group__1__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:374:1: rule__BasepathSpec__Group__1__Impl : ( ( rule__BasepathSpec__LocationAssignment_1 ) ) ;
    public final void rule__BasepathSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:378:1: ( ( ( rule__BasepathSpec__LocationAssignment_1 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:379:1: ( ( rule__BasepathSpec__LocationAssignment_1 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:379:1: ( ( rule__BasepathSpec__LocationAssignment_1 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:380:1: ( rule__BasepathSpec__LocationAssignment_1 )
            {
             before(grammarAccess.getBasepathSpecAccess().getLocationAssignment_1()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:381:1: ( rule__BasepathSpec__LocationAssignment_1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:381:2: rule__BasepathSpec__LocationAssignment_1
            {
            pushFollow(FOLLOW_rule__BasepathSpec__LocationAssignment_1_in_rule__BasepathSpec__Group__1__Impl719);
            rule__BasepathSpec__LocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBasepathSpecAccess().getLocationAssignment_1()); 

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
    // $ANTLR end "rule__BasepathSpec__Group__1__Impl"


    // $ANTLR start "rule__MetaModelSpec__Group__0"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:395:1: rule__MetaModelSpec__Group__0 : rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1 ;
    public final void rule__MetaModelSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:399:1: ( rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:400:2: rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__Group__0__Impl_in_rule__MetaModelSpec__Group__0753);
            rule__MetaModelSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModelSpec__Group__1_in_rule__MetaModelSpec__Group__0756);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:407:1: rule__MetaModelSpec__Group__0__Impl : ( 'metamodel' ) ;
    public final void rule__MetaModelSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:411:1: ( ( 'metamodel' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:412:1: ( 'metamodel' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:412:1: ( 'metamodel' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:413:1: 'metamodel'
            {
             before(grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__MetaModelSpec__Group__0__Impl784); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:426:1: rule__MetaModelSpec__Group__1 : rule__MetaModelSpec__Group__1__Impl ;
    public final void rule__MetaModelSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:430:1: ( rule__MetaModelSpec__Group__1__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:431:2: rule__MetaModelSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__Group__1__Impl_in_rule__MetaModelSpec__Group__1815);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:437:1: rule__MetaModelSpec__Group__1__Impl : ( ( rule__MetaModelSpec__LocationAssignment_1 ) ) ;
    public final void rule__MetaModelSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:441:1: ( ( ( rule__MetaModelSpec__LocationAssignment_1 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:442:1: ( ( rule__MetaModelSpec__LocationAssignment_1 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:442:1: ( ( rule__MetaModelSpec__LocationAssignment_1 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:443:1: ( rule__MetaModelSpec__LocationAssignment_1 )
            {
             before(grammarAccess.getMetaModelSpecAccess().getLocationAssignment_1()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:444:1: ( rule__MetaModelSpec__LocationAssignment_1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:444:2: rule__MetaModelSpec__LocationAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaModelSpec__LocationAssignment_1_in_rule__MetaModelSpec__Group__1__Impl842);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:458:1: rule__FitnessFunctionSpec__Group__0 : rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1 ;
    public final void rule__FitnessFunctionSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:462:1: ( rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:463:2: rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__0__Impl_in_rule__FitnessFunctionSpec__Group__0876);
            rule__FitnessFunctionSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__1_in_rule__FitnessFunctionSpec__Group__0879);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:470:1: rule__FitnessFunctionSpec__Group__0__Impl : ( 'fitness' ) ;
    public final void rule__FitnessFunctionSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:474:1: ( ( 'fitness' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:475:1: ( 'fitness' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:475:1: ( 'fitness' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:476:1: 'fitness'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__FitnessFunctionSpec__Group__0__Impl907); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:489:1: rule__FitnessFunctionSpec__Group__1 : rule__FitnessFunctionSpec__Group__1__Impl ;
    public final void rule__FitnessFunctionSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:493:1: ( rule__FitnessFunctionSpec__Group__1__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:494:2: rule__FitnessFunctionSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__Group__1__Impl_in_rule__FitnessFunctionSpec__Group__1938);
            rule__FitnessFunctionSpec__Group__1__Impl();

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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:500:1: rule__FitnessFunctionSpec__Group__1__Impl : ( ( rule__FitnessFunctionSpec__ClassAssignment_1 ) ) ;
    public final void rule__FitnessFunctionSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:504:1: ( ( ( rule__FitnessFunctionSpec__ClassAssignment_1 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:505:1: ( ( rule__FitnessFunctionSpec__ClassAssignment_1 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:505:1: ( ( rule__FitnessFunctionSpec__ClassAssignment_1 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:506:1: ( rule__FitnessFunctionSpec__ClassAssignment_1 )
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassAssignment_1()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:507:1: ( rule__FitnessFunctionSpec__ClassAssignment_1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:507:2: rule__FitnessFunctionSpec__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__FitnessFunctionSpec__ClassAssignment_1_in_rule__FitnessFunctionSpec__Group__1__Impl965);
            rule__FitnessFunctionSpec__ClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFitnessFunctionSpecAccess().getClassAssignment_1()); 

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


    // $ANTLR start "rule__EvolverSpec__Group__0"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:521:1: rule__EvolverSpec__Group__0 : rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1 ;
    public final void rule__EvolverSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:525:1: ( rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:526:2: rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__0__Impl_in_rule__EvolverSpec__Group__0999);
            rule__EvolverSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvolverSpec__Group__1_in_rule__EvolverSpec__Group__01002);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:533:1: rule__EvolverSpec__Group__0__Impl : ( 'evolve' ) ;
    public final void rule__EvolverSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:537:1: ( ( 'evolve' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:538:1: ( 'evolve' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:538:1: ( 'evolve' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:539:1: 'evolve'
            {
             before(grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__EvolverSpec__Group__0__Impl1030); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:552:1: rule__EvolverSpec__Group__1 : rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2 ;
    public final void rule__EvolverSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:556:1: ( rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:557:2: rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__1__Impl_in_rule__EvolverSpec__Group__11061);
            rule__EvolverSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvolverSpec__Group__2_in_rule__EvolverSpec__Group__11064);
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:564:1: rule__EvolverSpec__Group__1__Impl : ( 'using' ) ;
    public final void rule__EvolverSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:568:1: ( ( 'using' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:569:1: ( 'using' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:569:1: ( 'using' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:570:1: 'using'
            {
             before(grammarAccess.getEvolverSpecAccess().getUsingKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__EvolverSpec__Group__1__Impl1092); 
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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:583:1: rule__EvolverSpec__Group__2 : rule__EvolverSpec__Group__2__Impl rule__EvolverSpec__Group__3 ;
    public final void rule__EvolverSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:587:1: ( rule__EvolverSpec__Group__2__Impl rule__EvolverSpec__Group__3 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:588:2: rule__EvolverSpec__Group__2__Impl rule__EvolverSpec__Group__3
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__2__Impl_in_rule__EvolverSpec__Group__21123);
            rule__EvolverSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvolverSpec__Group__3_in_rule__EvolverSpec__Group__21126);
            rule__EvolverSpec__Group__3();

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
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:595:1: rule__EvolverSpec__Group__2__Impl : ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) ) ;
    public final void rule__EvolverSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:599:1: ( ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:600:1: ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:600:1: ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:601:1: ( rule__EvolverSpec__Rule_locationAssignment_2 )
            {
             before(grammarAccess.getEvolverSpecAccess().getRule_locationAssignment_2()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:602:1: ( rule__EvolverSpec__Rule_locationAssignment_2 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:602:2: rule__EvolverSpec__Rule_locationAssignment_2
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Rule_locationAssignment_2_in_rule__EvolverSpec__Group__2__Impl1153);
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


    // $ANTLR start "rule__EvolverSpec__Group__3"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:612:1: rule__EvolverSpec__Group__3 : rule__EvolverSpec__Group__3__Impl rule__EvolverSpec__Group__4 ;
    public final void rule__EvolverSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:616:1: ( rule__EvolverSpec__Group__3__Impl rule__EvolverSpec__Group__4 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:617:2: rule__EvolverSpec__Group__3__Impl rule__EvolverSpec__Group__4
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__3__Impl_in_rule__EvolverSpec__Group__31183);
            rule__EvolverSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EvolverSpec__Group__4_in_rule__EvolverSpec__Group__31186);
            rule__EvolverSpec__Group__4();

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
    // $ANTLR end "rule__EvolverSpec__Group__3"


    // $ANTLR start "rule__EvolverSpec__Group__3__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:624:1: rule__EvolverSpec__Group__3__Impl : ( 'unit' ) ;
    public final void rule__EvolverSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:628:1: ( ( 'unit' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:629:1: ( 'unit' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:629:1: ( 'unit' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:630:1: 'unit'
            {
             before(grammarAccess.getEvolverSpecAccess().getUnitKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__EvolverSpec__Group__3__Impl1214); 
             after(grammarAccess.getEvolverSpecAccess().getUnitKeyword_3()); 

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
    // $ANTLR end "rule__EvolverSpec__Group__3__Impl"


    // $ANTLR start "rule__EvolverSpec__Group__4"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:643:1: rule__EvolverSpec__Group__4 : rule__EvolverSpec__Group__4__Impl ;
    public final void rule__EvolverSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:647:1: ( rule__EvolverSpec__Group__4__Impl )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:648:2: rule__EvolverSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EvolverSpec__Group__4__Impl_in_rule__EvolverSpec__Group__41245);
            rule__EvolverSpec__Group__4__Impl();

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
    // $ANTLR end "rule__EvolverSpec__Group__4"


    // $ANTLR start "rule__EvolverSpec__Group__4__Impl"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:654:1: rule__EvolverSpec__Group__4__Impl : ( ( rule__EvolverSpec__UnitAssignment_4 ) ) ;
    public final void rule__EvolverSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:658:1: ( ( ( rule__EvolverSpec__UnitAssignment_4 ) ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:659:1: ( ( rule__EvolverSpec__UnitAssignment_4 ) )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:659:1: ( ( rule__EvolverSpec__UnitAssignment_4 ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:660:1: ( rule__EvolverSpec__UnitAssignment_4 )
            {
             before(grammarAccess.getEvolverSpecAccess().getUnitAssignment_4()); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:661:1: ( rule__EvolverSpec__UnitAssignment_4 )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:661:2: rule__EvolverSpec__UnitAssignment_4
            {
            pushFollow(FOLLOW_rule__EvolverSpec__UnitAssignment_4_in_rule__EvolverSpec__Group__4__Impl1272);
            rule__EvolverSpec__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEvolverSpecAccess().getUnitAssignment_4()); 

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
    // $ANTLR end "rule__EvolverSpec__Group__4__Impl"


    // $ANTLR start "rule__Optimisation__BasepathAssignment_0"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:682:1: rule__Optimisation__BasepathAssignment_0 : ( ruleBasepathSpec ) ;
    public final void rule__Optimisation__BasepathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:686:1: ( ( ruleBasepathSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:687:1: ( ruleBasepathSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:687:1: ( ruleBasepathSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:688:1: ruleBasepathSpec
            {
             before(grammarAccess.getOptimisationAccess().getBasepathBasepathSpecParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBasepathSpec_in_rule__Optimisation__BasepathAssignment_01317);
            ruleBasepathSpec();

            state._fsp--;

             after(grammarAccess.getOptimisationAccess().getBasepathBasepathSpecParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Optimisation__BasepathAssignment_0"


    // $ANTLR start "rule__Optimisation__MetamodelAssignment_1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:697:1: rule__Optimisation__MetamodelAssignment_1 : ( ruleMetaModelSpec ) ;
    public final void rule__Optimisation__MetamodelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:701:1: ( ( ruleMetaModelSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:702:1: ( ruleMetaModelSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:702:1: ( ruleMetaModelSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:703:1: ruleMetaModelSpec
            {
             before(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMetaModelSpec_in_rule__Optimisation__MetamodelAssignment_11348);
            ruleMetaModelSpec();

            state._fsp--;

             after(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Optimisation__MetamodelAssignment_1"


    // $ANTLR start "rule__Optimisation__FitnessAssignment_2"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:712:1: rule__Optimisation__FitnessAssignment_2 : ( ruleFitnessFunctionSpec ) ;
    public final void rule__Optimisation__FitnessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:716:1: ( ( ruleFitnessFunctionSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:717:1: ( ruleFitnessFunctionSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:717:1: ( ruleFitnessFunctionSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:718:1: ruleFitnessFunctionSpec
            {
             before(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFitnessFunctionSpec_in_rule__Optimisation__FitnessAssignment_21379);
            ruleFitnessFunctionSpec();

            state._fsp--;

             after(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Optimisation__FitnessAssignment_2"


    // $ANTLR start "rule__Optimisation__EvolversAssignment_3"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:727:1: rule__Optimisation__EvolversAssignment_3 : ( ruleEvolverSpec ) ;
    public final void rule__Optimisation__EvolversAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:731:1: ( ( ruleEvolverSpec ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:732:1: ( ruleEvolverSpec )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:732:1: ( ruleEvolverSpec )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:733:1: ruleEvolverSpec
            {
             before(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEvolverSpec_in_rule__Optimisation__EvolversAssignment_31410);
            ruleEvolverSpec();

            state._fsp--;

             after(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Optimisation__EvolversAssignment_3"


    // $ANTLR start "rule__BasepathSpec__LocationAssignment_1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:742:1: rule__BasepathSpec__LocationAssignment_1 : ( RULE_URL ) ;
    public final void rule__BasepathSpec__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:746:1: ( ( RULE_URL ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:747:1: ( RULE_URL )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:747:1: ( RULE_URL )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:748:1: RULE_URL
            {
             before(grammarAccess.getBasepathSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__BasepathSpec__LocationAssignment_11441); 
             after(grammarAccess.getBasepathSpecAccess().getLocationURLTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BasepathSpec__LocationAssignment_1"


    // $ANTLR start "rule__MetaModelSpec__LocationAssignment_1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:757:1: rule__MetaModelSpec__LocationAssignment_1 : ( RULE_URL ) ;
    public final void rule__MetaModelSpec__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:761:1: ( ( RULE_URL ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:762:1: ( RULE_URL )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:762:1: ( RULE_URL )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:763:1: RULE_URL
            {
             before(grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__MetaModelSpec__LocationAssignment_11472); 
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


    // $ANTLR start "rule__FitnessFunctionSpec__ClassAssignment_1"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:772:1: rule__FitnessFunctionSpec__ClassAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FitnessFunctionSpec__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:776:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:777:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:777:1: ( RULE_STRING )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:778:1: RULE_STRING
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__ClassAssignment_11503); 
             after(grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FitnessFunctionSpec__ClassAssignment_1"


    // $ANTLR start "rule__EvolverSpec__Rule_locationAssignment_2"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:787:1: rule__EvolverSpec__Rule_locationAssignment_2 : ( RULE_URL ) ;
    public final void rule__EvolverSpec__Rule_locationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:791:1: ( ( RULE_URL ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:792:1: ( RULE_URL )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:792:1: ( RULE_URL )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:793:1: RULE_URL
            {
             before(grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__EvolverSpec__Rule_locationAssignment_21534); 
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


    // $ANTLR start "rule__EvolverSpec__UnitAssignment_4"
    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:802:1: rule__EvolverSpec__UnitAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EvolverSpec__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:806:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:807:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:807:1: ( RULE_STRING )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:808:1: RULE_STRING
            {
             before(grammarAccess.getEvolverSpecAccess().getUnitSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EvolverSpec__UnitAssignment_41565); 
             after(grammarAccess.getEvolverSpecAccess().getUnitSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__EvolverSpec__UnitAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleOptimisation_in_entryRuleOptimisation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptimisation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__0_in_ruleOptimisation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasepathSpec_in_entryRuleBasepathSpec121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasepathSpec128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasepathSpec__Group__0_in_ruleBasepathSpec154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModelSpec_in_entryRuleMetaModelSpec181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaModelSpec188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__0_in_ruleMetaModelSpec214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFitnessFunctionSpec_in_entryRuleFitnessFunctionSpec241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFitnessFunctionSpec248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__0_in_ruleFitnessFunctionSpec274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvolverSpec_in_entryRuleEvolverSpec301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvolverSpec308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__0_in_ruleEvolverSpec334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__0__Impl_in_rule__Optimisation__Group__0368 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__1_in_rule__Optimisation__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__BasepathAssignment_0_in_rule__Optimisation__Group__0__Impl398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__1__Impl_in_rule__Optimisation__Group__1428 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__2_in_rule__Optimisation__Group__1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__MetamodelAssignment_1_in_rule__Optimisation__Group__1__Impl458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__2__Impl_in_rule__Optimisation__Group__2488 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__3_in_rule__Optimisation__Group__2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__FitnessAssignment_2_in_rule__Optimisation__Group__2__Impl518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__Group__3__Impl_in_rule__Optimisation__Group__3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optimisation__EvolversAssignment_3_in_rule__Optimisation__Group__3__Impl577 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Optimisation__EvolversAssignment_3_in_rule__Optimisation__Group__3__Impl589 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__BasepathSpec__Group__0__Impl_in_rule__BasepathSpec__Group__0630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BasepathSpec__Group__1_in_rule__BasepathSpec__Group__0633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BasepathSpec__Group__0__Impl661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasepathSpec__Group__1__Impl_in_rule__BasepathSpec__Group__1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasepathSpec__LocationAssignment_1_in_rule__BasepathSpec__Group__1__Impl719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__0__Impl_in_rule__MetaModelSpec__Group__0753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__1_in_rule__MetaModelSpec__Group__0756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MetaModelSpec__Group__0__Impl784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__Group__1__Impl_in_rule__MetaModelSpec__Group__1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModelSpec__LocationAssignment_1_in_rule__MetaModelSpec__Group__1__Impl842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__0__Impl_in_rule__FitnessFunctionSpec__Group__0876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__1_in_rule__FitnessFunctionSpec__Group__0879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FitnessFunctionSpec__Group__0__Impl907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__Group__1__Impl_in_rule__FitnessFunctionSpec__Group__1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FitnessFunctionSpec__ClassAssignment_1_in_rule__FitnessFunctionSpec__Group__1__Impl965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__0__Impl_in_rule__EvolverSpec__Group__0999 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__1_in_rule__EvolverSpec__Group__01002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EvolverSpec__Group__0__Impl1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__1__Impl_in_rule__EvolverSpec__Group__11061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__2_in_rule__EvolverSpec__Group__11064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EvolverSpec__Group__1__Impl1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__2__Impl_in_rule__EvolverSpec__Group__21123 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__3_in_rule__EvolverSpec__Group__21126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Rule_locationAssignment_2_in_rule__EvolverSpec__Group__2__Impl1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__3__Impl_in_rule__EvolverSpec__Group__31183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__4_in_rule__EvolverSpec__Group__31186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EvolverSpec__Group__3__Impl1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__Group__4__Impl_in_rule__EvolverSpec__Group__41245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EvolverSpec__UnitAssignment_4_in_rule__EvolverSpec__Group__4__Impl1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasepathSpec_in_rule__Optimisation__BasepathAssignment_01317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModelSpec_in_rule__Optimisation__MetamodelAssignment_11348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFitnessFunctionSpec_in_rule__Optimisation__FitnessAssignment_21379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvolverSpec_in_rule__Optimisation__EvolversAssignment_31410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__BasepathSpec__LocationAssignment_11441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__MetaModelSpec__LocationAssignment_11472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FitnessFunctionSpec__ClassAssignment_11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__EvolverSpec__Rule_locationAssignment_21534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EvolverSpec__UnitAssignment_41565 = new BitSet(new long[]{0x0000000000000002L});

}