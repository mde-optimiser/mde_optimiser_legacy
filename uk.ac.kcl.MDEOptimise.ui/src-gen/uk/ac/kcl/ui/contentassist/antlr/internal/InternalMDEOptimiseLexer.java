package uk.ac.kcl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMDEOptimiseLexer extends Lexer {
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

    public InternalMDEOptimiseLexer() {;} 
    public InternalMDEOptimiseLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMDEOptimiseLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:11:7: ( 'metamodel' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:11:9: 'metamodel'
            {
            match("metamodel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:12:7: ( 'fitness' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:12:9: 'fitness'
            {
            match("fitness"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:13:7: ( 'evolve' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:13:9: 'evolve'
            {
            match("evolve"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:14:7: ( 'using' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:14:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:587:10: ( '<' (~ ( '>' ) )* '>' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:587:12: '<' (~ ( '>' ) )* '>'
            {
            match('<'); 
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:587:16: (~ ( '>' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='=')||(LA1_0>='?' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:587:16: ~ ( '>' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_URL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:589:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:589:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:589:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:589:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:589:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:591:10: ( ( '0' .. '9' )+ )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:591:12: ( '0' .. '9' )+
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:591:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:591:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:593:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:595:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:595:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:595:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:595:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:597:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:597:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:597:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:597:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:597:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:597:41: ( '\\r' )? '\\n'
                    {
                    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:597:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:597:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:599:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:599:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:599:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:601:16: ( . )
            // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:601:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:8: ( T__12 | T__13 | T__14 | T__15 | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=12;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:34: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 6 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:43: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:51: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:60: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:72: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:88: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:104: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../uk.ac.kcl.MDEOptimise.ui/src-gen/uk/ac/kcl/ui/contentassist/antlr/internal/InternalMDEOptimise.g:1:112: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\4\17\2\15\2\uffff\3\15\2\uffff\1\17\1\uffff\3\17\6\uffff"+
        "\13\17\1\50\2\17\1\53\1\uffff\1\17\1\55\1\uffff\1\17\1\uffff\1\57"+
        "\1\uffff";
    static final String DFA13_eofS =
        "\60\uffff";
    static final String DFA13_minS =
        "\1\0\1\145\1\151\1\166\1\163\1\0\1\101\2\uffff\2\0\1\52\2\uffff"+
        "\1\164\1\uffff\1\164\1\157\1\151\6\uffff\1\141\1\156\1\154\1\156"+
        "\1\155\1\145\1\166\1\147\1\157\1\163\1\145\1\60\1\144\1\163\1\60"+
        "\1\uffff\1\145\1\60\1\uffff\1\154\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\145\1\151\1\166\1\163\1\uffff\1\172\2\uffff\2\uffff"+
        "\1\57\2\uffff\1\164\1\uffff\1\164\1\157\1\151\6\uffff\1\141\1\156"+
        "\1\154\1\156\1\155\1\145\1\166\1\147\1\157\1\163\1\145\1\172\1\144"+
        "\1\163\1\172\1\uffff\1\145\1\172\1\uffff\1\154\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\7\uffff\1\6\1\7\3\uffff\1\13\1\14\1\uffff\1\6\3\uffff\1\5\1\7"+
        "\1\10\1\11\1\12\1\13\17\uffff\1\4\2\uffff\1\3\1\uffff\1\2\1\uffff"+
        "\1\1";
    static final String DFA13_specialS =
        "\1\0\4\uffff\1\3\3\uffff\1\1\1\2\45\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\15\2\14\2\15\1\14\22\15\1\14\1\15\1\11\4\15\1\12\7\15\1"+
            "\13\12\10\2\15\1\5\4\15\32\7\3\15\1\6\1\7\1\15\4\7\1\3\1\2\6"+
            "\7\1\1\7\7\1\4\5\7\uff85\15",
            "\1\16",
            "\1\20",
            "\1\21",
            "\1\22",
            "\0\23",
            "\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "\0\25",
            "\0\25",
            "\1\26\4\uffff\1\27",
            "",
            "",
            "\1\31",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\51",
            "\1\52",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\54",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\56",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='m') ) {s = 1;}

                        else if ( (LA13_0=='f') ) {s = 2;}

                        else if ( (LA13_0=='e') ) {s = 3;}

                        else if ( (LA13_0=='u') ) {s = 4;}

                        else if ( (LA13_0=='<') ) {s = 5;}

                        else if ( (LA13_0=='^') ) {s = 6;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='d')||(LA13_0>='g' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='t')||(LA13_0>='v' && LA13_0<='z')) ) {s = 7;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 8;}

                        else if ( (LA13_0=='\"') ) {s = 9;}

                        else if ( (LA13_0=='\'') ) {s = 10;}

                        else if ( (LA13_0=='/') ) {s = 11;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 12;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>=':' && LA13_0<=';')||(LA13_0>='=' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_9 = input.LA(1);

                        s = -1;
                        if ( ((LA13_9>='\u0000' && LA13_9<='\uFFFF')) ) {s = 21;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_10 = input.LA(1);

                        s = -1;
                        if ( ((LA13_10>='\u0000' && LA13_10<='\uFFFF')) ) {s = 21;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_5 = input.LA(1);

                        s = -1;
                        if ( ((LA13_5>='\u0000' && LA13_5<='\uFFFF')) ) {s = 19;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}