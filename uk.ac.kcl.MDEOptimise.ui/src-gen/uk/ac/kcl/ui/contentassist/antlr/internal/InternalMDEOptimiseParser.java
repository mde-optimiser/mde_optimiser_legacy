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
    public String getGrammarFileName() { return "InternalMDEOptimise.g"; }


     
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
    // InternalMDEOptimise.g:60:1: entryRuleOptimisation : ruleOptimisation EOF ;
    public final void entryRuleOptimisation() throws RecognitionException {
        try {
            // InternalMDEOptimise.g:61:1: ( ruleOptimisation EOF )
            // InternalMDEOptimise.g:62:1: ruleOptimisation EOF
            {
             before(grammarAccess.getOptimisationRule()); 
            pushFollow(FOLLOW_1);
            ruleOptimisation();

            state._fsp--;

             after(grammarAccess.getOptimisationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMDEOptimise.g:69:1: ruleOptimisation : ( ( rule__Optimisation__Group__0 ) ) ;
    public final void ruleOptimisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:73:2: ( ( ( rule__Optimisation__Group__0 ) ) )
            // InternalMDEOptimise.g:74:1: ( ( rule__Optimisation__Group__0 ) )
            {
            // InternalMDEOptimise.g:74:1: ( ( rule__Optimisation__Group__0 ) )
            // InternalMDEOptimise.g:75:1: ( rule__Optimisation__Group__0 )
            {
             before(grammarAccess.getOptimisationAccess().getGroup()); 
            // InternalMDEOptimise.g:76:1: ( rule__Optimisation__Group__0 )
            // InternalMDEOptimise.g:76:2: rule__Optimisation__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:88:1: entryRuleBasepathSpec : ruleBasepathSpec EOF ;
    public final void entryRuleBasepathSpec() throws RecognitionException {
        try {
            // InternalMDEOptimise.g:89:1: ( ruleBasepathSpec EOF )
            // InternalMDEOptimise.g:90:1: ruleBasepathSpec EOF
            {
             before(grammarAccess.getBasepathSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleBasepathSpec();

            state._fsp--;

             after(grammarAccess.getBasepathSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMDEOptimise.g:97:1: ruleBasepathSpec : ( ( rule__BasepathSpec__Group__0 ) ) ;
    public final void ruleBasepathSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:101:2: ( ( ( rule__BasepathSpec__Group__0 ) ) )
            // InternalMDEOptimise.g:102:1: ( ( rule__BasepathSpec__Group__0 ) )
            {
            // InternalMDEOptimise.g:102:1: ( ( rule__BasepathSpec__Group__0 ) )
            // InternalMDEOptimise.g:103:1: ( rule__BasepathSpec__Group__0 )
            {
             before(grammarAccess.getBasepathSpecAccess().getGroup()); 
            // InternalMDEOptimise.g:104:1: ( rule__BasepathSpec__Group__0 )
            // InternalMDEOptimise.g:104:2: rule__BasepathSpec__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:116:1: entryRuleMetaModelSpec : ruleMetaModelSpec EOF ;
    public final void entryRuleMetaModelSpec() throws RecognitionException {
        try {
            // InternalMDEOptimise.g:117:1: ( ruleMetaModelSpec EOF )
            // InternalMDEOptimise.g:118:1: ruleMetaModelSpec EOF
            {
             before(grammarAccess.getMetaModelSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaModelSpec();

            state._fsp--;

             after(grammarAccess.getMetaModelSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMDEOptimise.g:125:1: ruleMetaModelSpec : ( ( rule__MetaModelSpec__Group__0 ) ) ;
    public final void ruleMetaModelSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:129:2: ( ( ( rule__MetaModelSpec__Group__0 ) ) )
            // InternalMDEOptimise.g:130:1: ( ( rule__MetaModelSpec__Group__0 ) )
            {
            // InternalMDEOptimise.g:130:1: ( ( rule__MetaModelSpec__Group__0 ) )
            // InternalMDEOptimise.g:131:1: ( rule__MetaModelSpec__Group__0 )
            {
             before(grammarAccess.getMetaModelSpecAccess().getGroup()); 
            // InternalMDEOptimise.g:132:1: ( rule__MetaModelSpec__Group__0 )
            // InternalMDEOptimise.g:132:2: rule__MetaModelSpec__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:144:1: entryRuleFitnessFunctionSpec : ruleFitnessFunctionSpec EOF ;
    public final void entryRuleFitnessFunctionSpec() throws RecognitionException {
        try {
            // InternalMDEOptimise.g:145:1: ( ruleFitnessFunctionSpec EOF )
            // InternalMDEOptimise.g:146:1: ruleFitnessFunctionSpec EOF
            {
             before(grammarAccess.getFitnessFunctionSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleFitnessFunctionSpec();

            state._fsp--;

             after(grammarAccess.getFitnessFunctionSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMDEOptimise.g:153:1: ruleFitnessFunctionSpec : ( ( rule__FitnessFunctionSpec__Group__0 ) ) ;
    public final void ruleFitnessFunctionSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:157:2: ( ( ( rule__FitnessFunctionSpec__Group__0 ) ) )
            // InternalMDEOptimise.g:158:1: ( ( rule__FitnessFunctionSpec__Group__0 ) )
            {
            // InternalMDEOptimise.g:158:1: ( ( rule__FitnessFunctionSpec__Group__0 ) )
            // InternalMDEOptimise.g:159:1: ( rule__FitnessFunctionSpec__Group__0 )
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getGroup()); 
            // InternalMDEOptimise.g:160:1: ( rule__FitnessFunctionSpec__Group__0 )
            // InternalMDEOptimise.g:160:2: rule__FitnessFunctionSpec__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:172:1: entryRuleEvolverSpec : ruleEvolverSpec EOF ;
    public final void entryRuleEvolverSpec() throws RecognitionException {
        try {
            // InternalMDEOptimise.g:173:1: ( ruleEvolverSpec EOF )
            // InternalMDEOptimise.g:174:1: ruleEvolverSpec EOF
            {
             before(grammarAccess.getEvolverSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleEvolverSpec();

            state._fsp--;

             after(grammarAccess.getEvolverSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMDEOptimise.g:181:1: ruleEvolverSpec : ( ( rule__EvolverSpec__Group__0 ) ) ;
    public final void ruleEvolverSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:185:2: ( ( ( rule__EvolverSpec__Group__0 ) ) )
            // InternalMDEOptimise.g:186:1: ( ( rule__EvolverSpec__Group__0 ) )
            {
            // InternalMDEOptimise.g:186:1: ( ( rule__EvolverSpec__Group__0 ) )
            // InternalMDEOptimise.g:187:1: ( rule__EvolverSpec__Group__0 )
            {
             before(grammarAccess.getEvolverSpecAccess().getGroup()); 
            // InternalMDEOptimise.g:188:1: ( rule__EvolverSpec__Group__0 )
            // InternalMDEOptimise.g:188:2: rule__EvolverSpec__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:202:1: rule__Optimisation__Group__0 : rule__Optimisation__Group__0__Impl rule__Optimisation__Group__1 ;
    public final void rule__Optimisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:206:1: ( rule__Optimisation__Group__0__Impl rule__Optimisation__Group__1 )
            // InternalMDEOptimise.g:207:2: rule__Optimisation__Group__0__Impl rule__Optimisation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Optimisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:214:1: rule__Optimisation__Group__0__Impl : ( ( rule__Optimisation__BasepathAssignment_0 ) ) ;
    public final void rule__Optimisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:218:1: ( ( ( rule__Optimisation__BasepathAssignment_0 ) ) )
            // InternalMDEOptimise.g:219:1: ( ( rule__Optimisation__BasepathAssignment_0 ) )
            {
            // InternalMDEOptimise.g:219:1: ( ( rule__Optimisation__BasepathAssignment_0 ) )
            // InternalMDEOptimise.g:220:1: ( rule__Optimisation__BasepathAssignment_0 )
            {
             before(grammarAccess.getOptimisationAccess().getBasepathAssignment_0()); 
            // InternalMDEOptimise.g:221:1: ( rule__Optimisation__BasepathAssignment_0 )
            // InternalMDEOptimise.g:221:2: rule__Optimisation__BasepathAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:231:1: rule__Optimisation__Group__1 : rule__Optimisation__Group__1__Impl rule__Optimisation__Group__2 ;
    public final void rule__Optimisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:235:1: ( rule__Optimisation__Group__1__Impl rule__Optimisation__Group__2 )
            // InternalMDEOptimise.g:236:2: rule__Optimisation__Group__1__Impl rule__Optimisation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Optimisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:243:1: rule__Optimisation__Group__1__Impl : ( ( rule__Optimisation__MetamodelAssignment_1 ) ) ;
    public final void rule__Optimisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:247:1: ( ( ( rule__Optimisation__MetamodelAssignment_1 ) ) )
            // InternalMDEOptimise.g:248:1: ( ( rule__Optimisation__MetamodelAssignment_1 ) )
            {
            // InternalMDEOptimise.g:248:1: ( ( rule__Optimisation__MetamodelAssignment_1 ) )
            // InternalMDEOptimise.g:249:1: ( rule__Optimisation__MetamodelAssignment_1 )
            {
             before(grammarAccess.getOptimisationAccess().getMetamodelAssignment_1()); 
            // InternalMDEOptimise.g:250:1: ( rule__Optimisation__MetamodelAssignment_1 )
            // InternalMDEOptimise.g:250:2: rule__Optimisation__MetamodelAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:260:1: rule__Optimisation__Group__2 : rule__Optimisation__Group__2__Impl rule__Optimisation__Group__3 ;
    public final void rule__Optimisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:264:1: ( rule__Optimisation__Group__2__Impl rule__Optimisation__Group__3 )
            // InternalMDEOptimise.g:265:2: rule__Optimisation__Group__2__Impl rule__Optimisation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Optimisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:272:1: rule__Optimisation__Group__2__Impl : ( ( ( rule__Optimisation__FitnessAssignment_2 ) ) ( ( rule__Optimisation__FitnessAssignment_2 )* ) ) ;
    public final void rule__Optimisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:276:1: ( ( ( ( rule__Optimisation__FitnessAssignment_2 ) ) ( ( rule__Optimisation__FitnessAssignment_2 )* ) ) )
            // InternalMDEOptimise.g:277:1: ( ( ( rule__Optimisation__FitnessAssignment_2 ) ) ( ( rule__Optimisation__FitnessAssignment_2 )* ) )
            {
            // InternalMDEOptimise.g:277:1: ( ( ( rule__Optimisation__FitnessAssignment_2 ) ) ( ( rule__Optimisation__FitnessAssignment_2 )* ) )
            // InternalMDEOptimise.g:278:1: ( ( rule__Optimisation__FitnessAssignment_2 ) ) ( ( rule__Optimisation__FitnessAssignment_2 )* )
            {
            // InternalMDEOptimise.g:278:1: ( ( rule__Optimisation__FitnessAssignment_2 ) )
            // InternalMDEOptimise.g:279:1: ( rule__Optimisation__FitnessAssignment_2 )
            {
             before(grammarAccess.getOptimisationAccess().getFitnessAssignment_2()); 
            // InternalMDEOptimise.g:280:1: ( rule__Optimisation__FitnessAssignment_2 )
            // InternalMDEOptimise.g:280:2: rule__Optimisation__FitnessAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Optimisation__FitnessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getFitnessAssignment_2()); 

            }

            // InternalMDEOptimise.g:283:1: ( ( rule__Optimisation__FitnessAssignment_2 )* )
            // InternalMDEOptimise.g:284:1: ( rule__Optimisation__FitnessAssignment_2 )*
            {
             before(grammarAccess.getOptimisationAccess().getFitnessAssignment_2()); 
            // InternalMDEOptimise.g:285:1: ( rule__Optimisation__FitnessAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMDEOptimise.g:285:2: rule__Optimisation__FitnessAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Optimisation__FitnessAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOptimisationAccess().getFitnessAssignment_2()); 

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


    // $ANTLR start "rule__Optimisation__Group__3"
    // InternalMDEOptimise.g:296:1: rule__Optimisation__Group__3 : rule__Optimisation__Group__3__Impl ;
    public final void rule__Optimisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:300:1: ( rule__Optimisation__Group__3__Impl )
            // InternalMDEOptimise.g:301:2: rule__Optimisation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:307:1: rule__Optimisation__Group__3__Impl : ( ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* ) ) ;
    public final void rule__Optimisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:311:1: ( ( ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* ) ) )
            // InternalMDEOptimise.g:312:1: ( ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* ) )
            {
            // InternalMDEOptimise.g:312:1: ( ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* ) )
            // InternalMDEOptimise.g:313:1: ( ( rule__Optimisation__EvolversAssignment_3 ) ) ( ( rule__Optimisation__EvolversAssignment_3 )* )
            {
            // InternalMDEOptimise.g:313:1: ( ( rule__Optimisation__EvolversAssignment_3 ) )
            // InternalMDEOptimise.g:314:1: ( rule__Optimisation__EvolversAssignment_3 )
            {
             before(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); 
            // InternalMDEOptimise.g:315:1: ( rule__Optimisation__EvolversAssignment_3 )
            // InternalMDEOptimise.g:315:2: rule__Optimisation__EvolversAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Optimisation__EvolversAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); 

            }

            // InternalMDEOptimise.g:318:1: ( ( rule__Optimisation__EvolversAssignment_3 )* )
            // InternalMDEOptimise.g:319:1: ( rule__Optimisation__EvolversAssignment_3 )*
            {
             before(grammarAccess.getOptimisationAccess().getEvolversAssignment_3()); 
            // InternalMDEOptimise.g:320:1: ( rule__Optimisation__EvolversAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMDEOptimise.g:320:2: rule__Optimisation__EvolversAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Optimisation__EvolversAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalMDEOptimise.g:339:1: rule__BasepathSpec__Group__0 : rule__BasepathSpec__Group__0__Impl rule__BasepathSpec__Group__1 ;
    public final void rule__BasepathSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:343:1: ( rule__BasepathSpec__Group__0__Impl rule__BasepathSpec__Group__1 )
            // InternalMDEOptimise.g:344:2: rule__BasepathSpec__Group__0__Impl rule__BasepathSpec__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BasepathSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:351:1: rule__BasepathSpec__Group__0__Impl : ( 'basepath' ) ;
    public final void rule__BasepathSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:355:1: ( ( 'basepath' ) )
            // InternalMDEOptimise.g:356:1: ( 'basepath' )
            {
            // InternalMDEOptimise.g:356:1: ( 'basepath' )
            // InternalMDEOptimise.g:357:1: 'basepath'
            {
             before(grammarAccess.getBasepathSpecAccess().getBasepathKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMDEOptimise.g:370:1: rule__BasepathSpec__Group__1 : rule__BasepathSpec__Group__1__Impl ;
    public final void rule__BasepathSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:374:1: ( rule__BasepathSpec__Group__1__Impl )
            // InternalMDEOptimise.g:375:2: rule__BasepathSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:381:1: rule__BasepathSpec__Group__1__Impl : ( ( rule__BasepathSpec__LocationAssignment_1 ) ) ;
    public final void rule__BasepathSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:385:1: ( ( ( rule__BasepathSpec__LocationAssignment_1 ) ) )
            // InternalMDEOptimise.g:386:1: ( ( rule__BasepathSpec__LocationAssignment_1 ) )
            {
            // InternalMDEOptimise.g:386:1: ( ( rule__BasepathSpec__LocationAssignment_1 ) )
            // InternalMDEOptimise.g:387:1: ( rule__BasepathSpec__LocationAssignment_1 )
            {
             before(grammarAccess.getBasepathSpecAccess().getLocationAssignment_1()); 
            // InternalMDEOptimise.g:388:1: ( rule__BasepathSpec__LocationAssignment_1 )
            // InternalMDEOptimise.g:388:2: rule__BasepathSpec__LocationAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:402:1: rule__MetaModelSpec__Group__0 : rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1 ;
    public final void rule__MetaModelSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:406:1: ( rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1 )
            // InternalMDEOptimise.g:407:2: rule__MetaModelSpec__Group__0__Impl rule__MetaModelSpec__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MetaModelSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:414:1: rule__MetaModelSpec__Group__0__Impl : ( 'metamodel' ) ;
    public final void rule__MetaModelSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:418:1: ( ( 'metamodel' ) )
            // InternalMDEOptimise.g:419:1: ( 'metamodel' )
            {
            // InternalMDEOptimise.g:419:1: ( 'metamodel' )
            // InternalMDEOptimise.g:420:1: 'metamodel'
            {
             before(grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMDEOptimise.g:433:1: rule__MetaModelSpec__Group__1 : rule__MetaModelSpec__Group__1__Impl ;
    public final void rule__MetaModelSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:437:1: ( rule__MetaModelSpec__Group__1__Impl )
            // InternalMDEOptimise.g:438:2: rule__MetaModelSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:444:1: rule__MetaModelSpec__Group__1__Impl : ( ( rule__MetaModelSpec__LocationAssignment_1 ) ) ;
    public final void rule__MetaModelSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:448:1: ( ( ( rule__MetaModelSpec__LocationAssignment_1 ) ) )
            // InternalMDEOptimise.g:449:1: ( ( rule__MetaModelSpec__LocationAssignment_1 ) )
            {
            // InternalMDEOptimise.g:449:1: ( ( rule__MetaModelSpec__LocationAssignment_1 ) )
            // InternalMDEOptimise.g:450:1: ( rule__MetaModelSpec__LocationAssignment_1 )
            {
             before(grammarAccess.getMetaModelSpecAccess().getLocationAssignment_1()); 
            // InternalMDEOptimise.g:451:1: ( rule__MetaModelSpec__LocationAssignment_1 )
            // InternalMDEOptimise.g:451:2: rule__MetaModelSpec__LocationAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:465:1: rule__FitnessFunctionSpec__Group__0 : rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1 ;
    public final void rule__FitnessFunctionSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:469:1: ( rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1 )
            // InternalMDEOptimise.g:470:2: rule__FitnessFunctionSpec__Group__0__Impl rule__FitnessFunctionSpec__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FitnessFunctionSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:477:1: rule__FitnessFunctionSpec__Group__0__Impl : ( 'fitness' ) ;
    public final void rule__FitnessFunctionSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:481:1: ( ( 'fitness' ) )
            // InternalMDEOptimise.g:482:1: ( 'fitness' )
            {
            // InternalMDEOptimise.g:482:1: ( 'fitness' )
            // InternalMDEOptimise.g:483:1: 'fitness'
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getFitnessKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMDEOptimise.g:496:1: rule__FitnessFunctionSpec__Group__1 : rule__FitnessFunctionSpec__Group__1__Impl ;
    public final void rule__FitnessFunctionSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:500:1: ( rule__FitnessFunctionSpec__Group__1__Impl )
            // InternalMDEOptimise.g:501:2: rule__FitnessFunctionSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:507:1: rule__FitnessFunctionSpec__Group__1__Impl : ( ( rule__FitnessFunctionSpec__ClassAssignment_1 ) ) ;
    public final void rule__FitnessFunctionSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:511:1: ( ( ( rule__FitnessFunctionSpec__ClassAssignment_1 ) ) )
            // InternalMDEOptimise.g:512:1: ( ( rule__FitnessFunctionSpec__ClassAssignment_1 ) )
            {
            // InternalMDEOptimise.g:512:1: ( ( rule__FitnessFunctionSpec__ClassAssignment_1 ) )
            // InternalMDEOptimise.g:513:1: ( rule__FitnessFunctionSpec__ClassAssignment_1 )
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassAssignment_1()); 
            // InternalMDEOptimise.g:514:1: ( rule__FitnessFunctionSpec__ClassAssignment_1 )
            // InternalMDEOptimise.g:514:2: rule__FitnessFunctionSpec__ClassAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:528:1: rule__EvolverSpec__Group__0 : rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1 ;
    public final void rule__EvolverSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:532:1: ( rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1 )
            // InternalMDEOptimise.g:533:2: rule__EvolverSpec__Group__0__Impl rule__EvolverSpec__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EvolverSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:540:1: rule__EvolverSpec__Group__0__Impl : ( 'evolve' ) ;
    public final void rule__EvolverSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:544:1: ( ( 'evolve' ) )
            // InternalMDEOptimise.g:545:1: ( 'evolve' )
            {
            // InternalMDEOptimise.g:545:1: ( 'evolve' )
            // InternalMDEOptimise.g:546:1: 'evolve'
            {
             before(grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMDEOptimise.g:559:1: rule__EvolverSpec__Group__1 : rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2 ;
    public final void rule__EvolverSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:563:1: ( rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2 )
            // InternalMDEOptimise.g:564:2: rule__EvolverSpec__Group__1__Impl rule__EvolverSpec__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EvolverSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:571:1: rule__EvolverSpec__Group__1__Impl : ( 'using' ) ;
    public final void rule__EvolverSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:575:1: ( ( 'using' ) )
            // InternalMDEOptimise.g:576:1: ( 'using' )
            {
            // InternalMDEOptimise.g:576:1: ( 'using' )
            // InternalMDEOptimise.g:577:1: 'using'
            {
             before(grammarAccess.getEvolverSpecAccess().getUsingKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMDEOptimise.g:590:1: rule__EvolverSpec__Group__2 : rule__EvolverSpec__Group__2__Impl rule__EvolverSpec__Group__3 ;
    public final void rule__EvolverSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:594:1: ( rule__EvolverSpec__Group__2__Impl rule__EvolverSpec__Group__3 )
            // InternalMDEOptimise.g:595:2: rule__EvolverSpec__Group__2__Impl rule__EvolverSpec__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EvolverSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:602:1: rule__EvolverSpec__Group__2__Impl : ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) ) ;
    public final void rule__EvolverSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:606:1: ( ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) ) )
            // InternalMDEOptimise.g:607:1: ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) )
            {
            // InternalMDEOptimise.g:607:1: ( ( rule__EvolverSpec__Rule_locationAssignment_2 ) )
            // InternalMDEOptimise.g:608:1: ( rule__EvolverSpec__Rule_locationAssignment_2 )
            {
             before(grammarAccess.getEvolverSpecAccess().getRule_locationAssignment_2()); 
            // InternalMDEOptimise.g:609:1: ( rule__EvolverSpec__Rule_locationAssignment_2 )
            // InternalMDEOptimise.g:609:2: rule__EvolverSpec__Rule_locationAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:619:1: rule__EvolverSpec__Group__3 : rule__EvolverSpec__Group__3__Impl rule__EvolverSpec__Group__4 ;
    public final void rule__EvolverSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:623:1: ( rule__EvolverSpec__Group__3__Impl rule__EvolverSpec__Group__4 )
            // InternalMDEOptimise.g:624:2: rule__EvolverSpec__Group__3__Impl rule__EvolverSpec__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__EvolverSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:631:1: rule__EvolverSpec__Group__3__Impl : ( 'unit' ) ;
    public final void rule__EvolverSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:635:1: ( ( 'unit' ) )
            // InternalMDEOptimise.g:636:1: ( 'unit' )
            {
            // InternalMDEOptimise.g:636:1: ( 'unit' )
            // InternalMDEOptimise.g:637:1: 'unit'
            {
             before(grammarAccess.getEvolverSpecAccess().getUnitKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMDEOptimise.g:650:1: rule__EvolverSpec__Group__4 : rule__EvolverSpec__Group__4__Impl ;
    public final void rule__EvolverSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:654:1: ( rule__EvolverSpec__Group__4__Impl )
            // InternalMDEOptimise.g:655:2: rule__EvolverSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:661:1: rule__EvolverSpec__Group__4__Impl : ( ( rule__EvolverSpec__UnitAssignment_4 ) ) ;
    public final void rule__EvolverSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:665:1: ( ( ( rule__EvolverSpec__UnitAssignment_4 ) ) )
            // InternalMDEOptimise.g:666:1: ( ( rule__EvolverSpec__UnitAssignment_4 ) )
            {
            // InternalMDEOptimise.g:666:1: ( ( rule__EvolverSpec__UnitAssignment_4 ) )
            // InternalMDEOptimise.g:667:1: ( rule__EvolverSpec__UnitAssignment_4 )
            {
             before(grammarAccess.getEvolverSpecAccess().getUnitAssignment_4()); 
            // InternalMDEOptimise.g:668:1: ( rule__EvolverSpec__UnitAssignment_4 )
            // InternalMDEOptimise.g:668:2: rule__EvolverSpec__UnitAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:689:1: rule__Optimisation__BasepathAssignment_0 : ( ruleBasepathSpec ) ;
    public final void rule__Optimisation__BasepathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:693:1: ( ( ruleBasepathSpec ) )
            // InternalMDEOptimise.g:694:1: ( ruleBasepathSpec )
            {
            // InternalMDEOptimise.g:694:1: ( ruleBasepathSpec )
            // InternalMDEOptimise.g:695:1: ruleBasepathSpec
            {
             before(grammarAccess.getOptimisationAccess().getBasepathBasepathSpecParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:704:1: rule__Optimisation__MetamodelAssignment_1 : ( ruleMetaModelSpec ) ;
    public final void rule__Optimisation__MetamodelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:708:1: ( ( ruleMetaModelSpec ) )
            // InternalMDEOptimise.g:709:1: ( ruleMetaModelSpec )
            {
            // InternalMDEOptimise.g:709:1: ( ruleMetaModelSpec )
            // InternalMDEOptimise.g:710:1: ruleMetaModelSpec
            {
             before(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:719:1: rule__Optimisation__FitnessAssignment_2 : ( ruleFitnessFunctionSpec ) ;
    public final void rule__Optimisation__FitnessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:723:1: ( ( ruleFitnessFunctionSpec ) )
            // InternalMDEOptimise.g:724:1: ( ruleFitnessFunctionSpec )
            {
            // InternalMDEOptimise.g:724:1: ( ruleFitnessFunctionSpec )
            // InternalMDEOptimise.g:725:1: ruleFitnessFunctionSpec
            {
             before(grammarAccess.getOptimisationAccess().getFitnessFitnessFunctionSpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:734:1: rule__Optimisation__EvolversAssignment_3 : ( ruleEvolverSpec ) ;
    public final void rule__Optimisation__EvolversAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:738:1: ( ( ruleEvolverSpec ) )
            // InternalMDEOptimise.g:739:1: ( ruleEvolverSpec )
            {
            // InternalMDEOptimise.g:739:1: ( ruleEvolverSpec )
            // InternalMDEOptimise.g:740:1: ruleEvolverSpec
            {
             before(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalMDEOptimise.g:749:1: rule__BasepathSpec__LocationAssignment_1 : ( RULE_URL ) ;
    public final void rule__BasepathSpec__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:753:1: ( ( RULE_URL ) )
            // InternalMDEOptimise.g:754:1: ( RULE_URL )
            {
            // InternalMDEOptimise.g:754:1: ( RULE_URL )
            // InternalMDEOptimise.g:755:1: RULE_URL
            {
             before(grammarAccess.getBasepathSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_2); 
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
    // InternalMDEOptimise.g:764:1: rule__MetaModelSpec__LocationAssignment_1 : ( RULE_URL ) ;
    public final void rule__MetaModelSpec__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:768:1: ( ( RULE_URL ) )
            // InternalMDEOptimise.g:769:1: ( RULE_URL )
            {
            // InternalMDEOptimise.g:769:1: ( RULE_URL )
            // InternalMDEOptimise.g:770:1: RULE_URL
            {
             before(grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_2); 
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
    // InternalMDEOptimise.g:779:1: rule__FitnessFunctionSpec__ClassAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FitnessFunctionSpec__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:783:1: ( ( RULE_STRING ) )
            // InternalMDEOptimise.g:784:1: ( RULE_STRING )
            {
            // InternalMDEOptimise.g:784:1: ( RULE_STRING )
            // InternalMDEOptimise.g:785:1: RULE_STRING
            {
             before(grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalMDEOptimise.g:794:1: rule__EvolverSpec__Rule_locationAssignment_2 : ( RULE_URL ) ;
    public final void rule__EvolverSpec__Rule_locationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:798:1: ( ( RULE_URL ) )
            // InternalMDEOptimise.g:799:1: ( RULE_URL )
            {
            // InternalMDEOptimise.g:799:1: ( RULE_URL )
            // InternalMDEOptimise.g:800:1: RULE_URL
            {
             before(grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0()); 
            match(input,RULE_URL,FOLLOW_2); 
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
    // InternalMDEOptimise.g:809:1: rule__EvolverSpec__UnitAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EvolverSpec__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMDEOptimise.g:813:1: ( ( RULE_STRING ) )
            // InternalMDEOptimise.g:814:1: ( RULE_STRING )
            {
            // InternalMDEOptimise.g:814:1: ( RULE_STRING )
            // InternalMDEOptimise.g:815:1: RULE_STRING
            {
             before(grammarAccess.getEvolverSpecAccess().getUnitSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});

}