package org.atlanmod.analysis.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlgaeLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalAlgaeLexer() {;} 
    public InternalAlgaeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAlgaeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAlgae.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:11:7: ( 'true' )
            // InternalAlgae.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:12:7: ( 'false' )
            // InternalAlgae.g:12:9: 'false'
            {
            match("false"); 


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
            // InternalAlgae.g:13:7: ( 'duration' )
            // InternalAlgae.g:13:9: 'duration'
            {
            match("duration"); 


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
            // InternalAlgae.g:14:7: ( 'frequency' )
            // InternalAlgae.g:14:9: 'frequency'
            {
            match("frequency"); 


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
            // InternalAlgae.g:15:7: ( 'scalar' )
            // InternalAlgae.g:15:9: 'scalar'
            {
            match("scalar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:16:7: ( 'LOCAL' )
            // InternalAlgae.g:16:9: 'LOCAL'
            {
            match("LOCAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:17:7: ( 'GLOBAL' )
            // InternalAlgae.g:17:9: 'GLOBAL'
            {
            match("GLOBAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:18:7: ( 'Platform' )
            // InternalAlgae.g:18:9: 'Platform'
            {
            match("Platform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:19:7: ( '{' )
            // InternalAlgae.g:19:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:20:7: ( '}' )
            // InternalAlgae.g:20:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:21:7: ( ',' )
            // InternalAlgae.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:22:7: ( '.' )
            // InternalAlgae.g:22:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:23:7: ( '=' )
            // InternalAlgae.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:24:7: ( 'ocl:' )
            // InternalAlgae.g:24:9: 'ocl:'
            {
            match("ocl:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:25:7: ( 'attribute:' )
            // InternalAlgae.g:25:9: 'attribute:'
            {
            match("attribute:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:26:7: ( 'as' )
            // InternalAlgae.g:26:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:27:7: ( '.absoluteTime' )
            // InternalAlgae.g:27:9: '.absoluteTime'
            {
            match(".absoluteTime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:28:7: ( '(' )
            // InternalAlgae.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:29:7: ( ')' )
            // InternalAlgae.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:30:7: ( '+' )
            // InternalAlgae.g:30:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:31:7: ( '-' )
            // InternalAlgae.g:31:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:32:7: ( '*' )
            // InternalAlgae.g:32:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:33:7: ( '/' )
            // InternalAlgae.g:33:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:34:7: ( 'exp' )
            // InternalAlgae.g:34:9: 'exp'
            {
            match("exp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:35:7: ( 'logistic' )
            // InternalAlgae.g:35:9: 'logistic'
            {
            match("logistic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:36:7: ( 'integral' )
            // InternalAlgae.g:36:9: 'integral'
            {
            match("integral"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:37:7: ( '[' )
            // InternalAlgae.g:37:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:38:7: ( ';' )
            // InternalAlgae.g:38:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:39:7: ( ']' )
            // InternalAlgae.g:39:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:40:7: ( 'NormalDistribution' )
            // InternalAlgae.g:40:9: 'NormalDistribution'
            {
            match("NormalDistribution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:41:7: ( 'Interval' )
            // InternalAlgae.g:41:9: 'Interval'
            {
            match("Interval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:42:7: ( 'lowerEndpoint' )
            // InternalAlgae.g:42:9: 'lowerEndpoint'
            {
            match("lowerEndpoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:43:7: ( 'upperEndpoint' )
            // InternalAlgae.g:43:9: 'upperEndpoint'
            {
            match("upperEndpoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:44:7: ( 'Sampling' )
            // InternalAlgae.g:44:9: 'Sampling'
            {
            match("Sampling"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:45:7: ( 'measurementProcedure' )
            // InternalAlgae.g:45:9: 'measurementProcedure'
            {
            match("measurementProcedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:46:7: ( 'samples' )
            // InternalAlgae.g:46:9: 'samples'
            {
            match("samples"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:47:7: ( 'Integral' )
            // InternalAlgae.g:47:9: 'Integral'
            {
            match("Integral"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:48:7: ( 'interval' )
            // InternalAlgae.g:48:9: 'interval'
            {
            match("interval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:49:7: ( 'function' )
            // InternalAlgae.g:49:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:50:7: ( 'Sample' )
            // InternalAlgae.g:50:9: 'Sample'
            {
            match("Sample"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:51:7: ( 'quantity' )
            // InternalAlgae.g:51:9: 'quantity'
            {
            match("quantity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:52:7: ( 'EClass' )
            // InternalAlgae.g:52:9: 'EClass'
            {
            match("EClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:53:7: ( 'instanceClassName' )
            // InternalAlgae.g:53:9: 'instanceClassName'
            {
            match("instanceClassName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:54:7: ( 'instanceTypeName' )
            // InternalAlgae.g:54:9: 'instanceTypeName'
            {
            match("instanceTypeName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:55:7: ( 'eSuperTypes' )
            // InternalAlgae.g:55:9: 'eSuperTypes'
            {
            match("eSuperTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:56:7: ( 'eAnnotations' )
            // InternalAlgae.g:56:9: 'eAnnotations'
            {
            match("eAnnotations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:57:7: ( 'eTypeParameters' )
            // InternalAlgae.g:57:9: 'eTypeParameters'
            {
            match("eTypeParameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:58:7: ( 'eOperations' )
            // InternalAlgae.g:58:9: 'eOperations'
            {
            match("eOperations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:59:7: ( 'eStructuralFeatures' )
            // InternalAlgae.g:59:9: 'eStructuralFeatures'
            {
            match("eStructuralFeatures"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:60:7: ( 'eGenericSuperTypes' )
            // InternalAlgae.g:60:9: 'eGenericSuperTypes'
            {
            match("eGenericSuperTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:61:7: ( 'EOperation' )
            // InternalAlgae.g:61:9: 'EOperation'
            {
            match("EOperation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:62:7: ( 'ordered' )
            // InternalAlgae.g:62:9: 'ordered'
            {
            match("ordered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:63:7: ( 'unique' )
            // InternalAlgae.g:63:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:64:7: ( 'lowerBound' )
            // InternalAlgae.g:64:9: 'lowerBound'
            {
            match("lowerBound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:65:7: ( 'upperBound' )
            // InternalAlgae.g:65:9: 'upperBound'
            {
            match("upperBound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:66:7: ( 'eType' )
            // InternalAlgae.g:66:9: 'eType'
            {
            match("eType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:67:7: ( 'eExceptions' )
            // InternalAlgae.g:67:9: 'eExceptions'
            {
            match("eExceptions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:68:7: ( 'eGenericType' )
            // InternalAlgae.g:68:9: 'eGenericType'
            {
            match("eGenericType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:69:7: ( 'eParameters' )
            // InternalAlgae.g:69:9: 'eParameters'
            {
            match("eParameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:70:7: ( 'eGenericExceptions' )
            // InternalAlgae.g:70:9: 'eGenericExceptions'
            {
            match("eGenericExceptions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:71:7: ( 'EAnnotation' )
            // InternalAlgae.g:71:9: 'EAnnotation'
            {
            match("EAnnotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:72:7: ( 'source' )
            // InternalAlgae.g:72:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:73:7: ( 'references' )
            // InternalAlgae.g:73:9: 'references'
            {
            match("references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:74:7: ( 'details' )
            // InternalAlgae.g:74:9: 'details'
            {
            match("details"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:75:7: ( 'contents' )
            // InternalAlgae.g:75:9: 'contents'
            {
            match("contents"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:76:7: ( 'ETypeParameter' )
            // InternalAlgae.g:76:9: 'ETypeParameter'
            {
            match("ETypeParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:77:7: ( 'eBounds' )
            // InternalAlgae.g:77:9: 'eBounds'
            {
            match("eBounds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:78:7: ( 'EGenericType' )
            // InternalAlgae.g:78:9: 'EGenericType'
            {
            match("EGenericType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:79:7: ( 'eTypeParameter' )
            // InternalAlgae.g:79:9: 'eTypeParameter'
            {
            match("eTypeParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:80:7: ( 'eClassifier' )
            // InternalAlgae.g:80:9: 'eClassifier'
            {
            match("eClassifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:81:7: ( 'eUpperBound' )
            // InternalAlgae.g:81:9: 'eUpperBound'
            {
            match("eUpperBound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:82:7: ( 'eTypeArguments' )
            // InternalAlgae.g:82:9: 'eTypeArguments'
            {
            match("eTypeArguments"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:83:7: ( 'eLowerBound' )
            // InternalAlgae.g:83:9: 'eLowerBound'
            {
            match("eLowerBound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:84:7: ( 'EStringToStringMapEntry' )
            // InternalAlgae.g:84:9: 'EStringToStringMapEntry'
            {
            match("EStringToStringMapEntry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:85:7: ( 'key' )
            // InternalAlgae.g:85:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:86:7: ( 'value' )
            // InternalAlgae.g:86:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:87:7: ( 'EObject' )
            // InternalAlgae.g:87:9: 'EObject'
            {
            match("EObject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:88:7: ( 'EAttribute' )
            // InternalAlgae.g:88:9: 'EAttribute'
            {
            match("EAttribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:89:7: ( 'changeable' )
            // InternalAlgae.g:89:9: 'changeable'
            {
            match("changeable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:90:7: ( 'defaultValueLiteral' )
            // InternalAlgae.g:90:9: 'defaultValueLiteral'
            {
            match("defaultValueLiteral"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:91:7: ( 'EReference' )
            // InternalAlgae.g:91:9: 'EReference'
            {
            match("EReference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:92:7: ( 'resolveProxies' )
            // InternalAlgae.g:92:9: 'resolveProxies'
            {
            match("resolveProxies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:93:7: ( 'eOpposite' )
            // InternalAlgae.g:93:9: 'eOpposite'
            {
            match("eOpposite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:94:7: ( 'eKeys' )
            // InternalAlgae.g:94:9: 'eKeys'
            {
            match("eKeys"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:95:7: ( 'EDataType' )
            // InternalAlgae.g:95:9: 'EDataType'
            {
            match("EDataType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:96:7: ( 'serializable' )
            // InternalAlgae.g:96:9: 'serializable'
            {
            match("serializable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:97:7: ( 'EEnum' )
            // InternalAlgae.g:97:9: 'EEnum'
            {
            match("EEnum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:98:7: ( 'eLiterals' )
            // InternalAlgae.g:98:9: 'eLiterals'
            {
            match("eLiterals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:99:7: ( 'EEnumLiteral' )
            // InternalAlgae.g:99:9: 'EEnumLiteral'
            {
            match("EEnumLiteral"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:100:8: ( 'literal' )
            // InternalAlgae.g:100:10: 'literal'
            {
            match("literal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:101:8: ( 'EParameter' )
            // InternalAlgae.g:101:10: 'EParameter'
            {
            match("EParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:102:8: ( 'post' )
            // InternalAlgae.g:102:10: 'post'
            {
            match("post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:103:8: ( 'abstract' )
            // InternalAlgae.g:103:10: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:104:8: ( 'interface' )
            // InternalAlgae.g:104:10: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:105:8: ( 'volatile' )
            // InternalAlgae.g:105:10: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:106:8: ( 'transient' )
            // InternalAlgae.g:106:10: 'transient'
            {
            match("transient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:107:8: ( 'unsettable' )
            // InternalAlgae.g:107:10: 'unsettable'
            {
            match("unsettable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:108:8: ( 'derived' )
            // InternalAlgae.g:108:10: 'derived'
            {
            match("derived"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:109:8: ( 'iD' )
            // InternalAlgae.g:109:10: 'iD'
            {
            match("iD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:110:8: ( 'containment' )
            // InternalAlgae.g:110:10: 'containment'
            {
            match("containment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlgae.g:22693:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAlgae.g:22693:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAlgae.g:22693:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlgae.g:22693:11: '^'
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

            // InternalAlgae.g:22693:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlgae.g:
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
            	    break loop2;
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
            // InternalAlgae.g:22695:10: ( ( '0' .. '9' )+ )
            // InternalAlgae.g:22695:12: ( '0' .. '9' )+
            {
            // InternalAlgae.g:22695:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlgae.g:22695:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalAlgae.g:22697:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAlgae.g:22697:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAlgae.g:22697:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlgae.g:22697:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAlgae.g:22697:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAlgae.g:22697:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlgae.g:22697:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAlgae.g:22697:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAlgae.g:22697:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAlgae.g:22697:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlgae.g:22697:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalAlgae.g:22699:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAlgae.g:22699:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAlgae.g:22699:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAlgae.g:22699:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalAlgae.g:22701:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAlgae.g:22701:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAlgae.g:22701:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAlgae.g:22701:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalAlgae.g:22701:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlgae.g:22701:41: ( '\\r' )? '\\n'
                    {
                    // InternalAlgae.g:22701:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAlgae.g:22701:41: '\\r'
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
            // InternalAlgae.g:22703:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAlgae.g:22703:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAlgae.g:22703:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAlgae.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalAlgae.g:22705:16: ( . )
            // InternalAlgae.g:22705:18: .
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
        // InternalAlgae.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=107;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalAlgae.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalAlgae.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalAlgae.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalAlgae.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalAlgae.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalAlgae.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalAlgae.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalAlgae.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalAlgae.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalAlgae.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalAlgae.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalAlgae.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalAlgae.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalAlgae.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalAlgae.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalAlgae.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalAlgae.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalAlgae.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalAlgae.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalAlgae.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalAlgae.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalAlgae.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalAlgae.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalAlgae.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalAlgae.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalAlgae.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalAlgae.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalAlgae.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalAlgae.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalAlgae.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalAlgae.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalAlgae.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalAlgae.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalAlgae.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalAlgae.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalAlgae.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalAlgae.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalAlgae.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalAlgae.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalAlgae.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalAlgae.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalAlgae.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalAlgae.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalAlgae.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalAlgae.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalAlgae.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalAlgae.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalAlgae.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalAlgae.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalAlgae.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalAlgae.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalAlgae.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalAlgae.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalAlgae.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalAlgae.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalAlgae.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalAlgae.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalAlgae.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalAlgae.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalAlgae.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalAlgae.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalAlgae.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalAlgae.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalAlgae.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalAlgae.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalAlgae.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalAlgae.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalAlgae.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalAlgae.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalAlgae.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalAlgae.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalAlgae.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalAlgae.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalAlgae.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalAlgae.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalAlgae.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalAlgae.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalAlgae.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalAlgae.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // InternalAlgae.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // InternalAlgae.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // InternalAlgae.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // InternalAlgae.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // InternalAlgae.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // InternalAlgae.g:1:514: T__95
                {
                mT__95(); 

                }
                break;
            case 86 :
                // InternalAlgae.g:1:520: T__96
                {
                mT__96(); 

                }
                break;
            case 87 :
                // InternalAlgae.g:1:526: T__97
                {
                mT__97(); 

                }
                break;
            case 88 :
                // InternalAlgae.g:1:532: T__98
                {
                mT__98(); 

                }
                break;
            case 89 :
                // InternalAlgae.g:1:538: T__99
                {
                mT__99(); 

                }
                break;
            case 90 :
                // InternalAlgae.g:1:544: T__100
                {
                mT__100(); 

                }
                break;
            case 91 :
                // InternalAlgae.g:1:551: T__101
                {
                mT__101(); 

                }
                break;
            case 92 :
                // InternalAlgae.g:1:558: T__102
                {
                mT__102(); 

                }
                break;
            case 93 :
                // InternalAlgae.g:1:565: T__103
                {
                mT__103(); 

                }
                break;
            case 94 :
                // InternalAlgae.g:1:572: T__104
                {
                mT__104(); 

                }
                break;
            case 95 :
                // InternalAlgae.g:1:579: T__105
                {
                mT__105(); 

                }
                break;
            case 96 :
                // InternalAlgae.g:1:586: T__106
                {
                mT__106(); 

                }
                break;
            case 97 :
                // InternalAlgae.g:1:593: T__107
                {
                mT__107(); 

                }
                break;
            case 98 :
                // InternalAlgae.g:1:600: T__108
                {
                mT__108(); 

                }
                break;
            case 99 :
                // InternalAlgae.g:1:607: T__109
                {
                mT__109(); 

                }
                break;
            case 100 :
                // InternalAlgae.g:1:614: T__110
                {
                mT__110(); 

                }
                break;
            case 101 :
                // InternalAlgae.g:1:621: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 102 :
                // InternalAlgae.g:1:629: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 103 :
                // InternalAlgae.g:1:638: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 104 :
                // InternalAlgae.g:1:650: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 105 :
                // InternalAlgae.g:1:666: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 106 :
                // InternalAlgae.g:1:682: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 107 :
                // InternalAlgae.g:1:690: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\7\57\3\uffff\1\100\1\uffff\2\57\5\uffff\1\116\3\57\3\uffff\14\57\1\55\2\uffff\2\55\2\uffff\1\57\1\uffff\14\57\6\uffff\3\57\1\u0091\1\57\10\uffff\20\57\1\u00a7\3\uffff\30\57\3\uffff\23\57\1\uffff\1\57\1\u00d8\23\57\1\uffff\30\57\1\u0105\3\57\1\u0109\17\57\1\uffff\3\57\1\uffff\54\57\1\uffff\2\57\1\u014d\1\uffff\1\57\1\u014f\12\57\1\u015a\10\57\1\u0165\12\57\1\u0170\31\57\1\u018f\6\57\1\u0196\1\57\1\uffff\1\57\1\uffff\6\57\1\u019f\1\57\1\u01a1\1\57\1\uffff\1\u01a3\11\57\1\uffff\12\57\1\uffff\15\57\1\u01c4\2\57\1\u01c7\2\57\1\u01ca\12\57\1\uffff\6\57\1\uffff\5\57\1\u01e0\1\57\1\u01e2\1\uffff\1\u01e3\1\uffff\1\57\1\uffff\1\57\1\u01e6\14\57\1\u01f3\7\57\1\u01fb\11\57\1\uffff\2\57\1\uffff\2\57\1\uffff\1\57\1\u020a\21\57\1\u021c\1\u021d\1\uffff\1\57\2\uffff\1\57\1\u0220\1\uffff\1\57\1\u0222\12\57\1\uffff\4\57\1\u0233\2\57\1\uffff\1\u0236\1\u0237\3\57\1\u023c\1\u023d\3\57\1\u0241\1\57\1\u0243\1\57\1\uffff\13\57\1\u0250\2\57\1\u0253\1\u0254\1\u0255\2\uffff\2\57\1\uffff\1\57\1\uffff\6\57\1\u025f\10\57\1\u0268\1\uffff\2\57\2\uffff\1\u026b\3\57\2\uffff\3\57\1\uffff\1\57\1\uffff\7\57\1\u027a\4\57\1\uffff\2\57\3\uffff\2\57\1\uffff\6\57\1\uffff\10\57\1\uffff\1\57\1\u0292\1\uffff\4\57\1\u0297\1\u0298\1\57\1\u029a\1\57\1\u029c\3\57\1\u02a0\1\uffff\1\57\1\u02a2\1\u02a3\2\57\1\u02a6\2\57\1\u02a9\4\57\1\u02ae\3\57\1\u02b2\1\u02b3\1\u02b4\1\u02b5\1\u02b6\1\57\1\uffff\4\57\2\uffff\1\57\1\uffff\1\u02bd\1\uffff\3\57\1\uffff\1\57\2\uffff\1\57\1\u02c3\1\uffff\1\57\1\u02c5\1\uffff\1\57\1\u02c7\2\57\1\uffff\1\57\1\u02cb\1\57\5\uffff\6\57\1\uffff\1\57\1\u02d4\1\57\1\u02d6\1\57\1\uffff\1\57\1\uffff\1\57\1\uffff\3\57\1\uffff\1\57\1\u02de\3\57\1\u02e2\2\57\1\uffff\1\57\1\uffff\3\57\1\u02ea\1\u02eb\2\57\1\uffff\3\57\1\uffff\1\57\1\u02f2\1\57\1\u02f4\2\57\1\u02f7\2\uffff\6\57\1\uffff\1\57\1\uffff\2\57\1\uffff\3\57\1\u0304\7\57\1\u030c\1\uffff\5\57\1\u0312\1\u0313\1\uffff\1\u0314\2\57\1\u0317\1\u0318\3\uffff\2\57\2\uffff\1\u031b\1\57\1\uffff\2\57\1\u031f\1\uffff";
    static final String DFA12_eofS =
        "\u0320\uffff";
    static final String DFA12_minS =
        "\1\0\1\162\1\141\1\145\1\141\1\117\1\114\1\154\3\uffff\1\141\1\uffff\1\143\1\142\5\uffff\1\52\1\101\1\151\1\104\3\uffff\1\157\2\156\1\141\1\145\1\165\1\101\1\145\1\150\1\145\1\141\1\157\1\101\2\uffff\2\0\2\uffff\1\141\1\uffff\1\154\1\145\1\156\1\162\1\146\1\141\1\155\1\165\1\162\1\103\1\117\1\141\6\uffff\1\154\1\144\1\164\1\60\1\163\10\uffff\1\160\1\164\1\156\1\171\1\160\1\145\1\170\1\141\1\157\1\154\1\160\1\151\1\145\1\147\1\164\1\163\1\60\3\uffff\1\162\1\164\1\160\1\151\1\155\2\141\1\154\1\142\1\156\1\171\1\145\1\164\1\145\1\141\1\156\1\141\1\146\1\156\1\141\1\171\2\154\1\163\3\uffff\1\145\1\156\1\163\1\161\1\143\3\141\1\151\1\154\1\160\1\162\1\151\1\101\1\102\1\164\1\72\1\145\1\162\1\uffff\1\164\1\60\1\160\1\162\1\156\1\160\1\145\1\156\1\143\1\162\1\165\1\141\1\160\1\167\1\164\1\171\1\151\3\145\1\164\1\uffff\1\155\2\145\1\161\1\145\1\160\1\163\1\156\1\141\1\145\1\152\1\156\1\164\1\160\1\156\1\162\1\146\1\164\1\165\1\162\1\145\1\157\1\164\1\156\1\60\1\165\1\141\1\164\1\60\1\163\1\145\1\165\2\164\1\151\1\165\1\166\1\141\1\154\1\143\1\141\1\114\1\101\1\146\1\uffff\1\162\1\151\1\162\1\uffff\1\145\1\165\1\157\1\145\1\162\1\157\2\145\1\141\1\156\1\163\3\145\2\163\2\162\1\147\2\141\1\147\1\162\1\165\1\164\1\154\1\165\1\164\1\163\1\162\1\145\1\157\1\162\2\145\1\151\1\145\1\141\1\155\1\141\1\162\1\154\1\141\1\147\1\uffff\1\145\1\164\1\60\1\uffff\1\151\1\60\1\145\2\151\2\154\1\145\1\162\2\145\1\154\1\60\1\114\1\157\1\145\1\142\1\141\1\162\1\143\1\164\1\60\1\141\1\163\1\162\1\160\1\155\1\144\1\163\3\162\1\60\1\164\1\102\1\141\1\162\1\146\1\156\1\154\1\166\1\162\1\102\1\145\1\164\1\145\1\162\1\151\1\163\1\141\1\143\1\164\1\151\1\120\1\162\1\156\1\162\1\124\1\60\1\155\1\145\1\166\1\156\1\151\1\145\1\60\1\151\1\uffff\1\145\1\uffff\1\156\2\157\1\163\1\164\1\144\1\60\1\163\1\60\1\151\1\uffff\1\60\1\162\1\144\1\165\1\143\1\124\1\164\2\141\1\162\1\uffff\1\164\2\151\1\164\1\145\1\163\1\151\2\102\1\141\1\uffff\1\151\1\156\1\157\1\154\3\141\1\143\1\104\2\141\1\156\1\157\1\60\1\141\1\156\1\60\1\145\1\164\1\60\2\164\1\141\1\142\1\141\1\151\1\147\1\145\1\171\1\151\1\uffff\1\145\1\156\1\145\1\164\1\156\1\141\1\uffff\1\154\1\156\1\143\2\156\1\60\1\126\1\60\1\uffff\1\60\1\uffff\1\172\1\uffff\1\155\1\60\2\164\1\171\1\165\1\164\1\162\1\147\1\151\1\164\1\143\1\151\1\164\1\60\1\146\2\157\1\154\1\143\1\144\1\165\1\60\2\154\1\143\1\145\1\151\2\154\1\144\1\165\1\uffff\1\142\1\147\1\uffff\1\155\1\171\1\uffff\1\151\1\60\1\164\1\165\1\162\1\143\1\124\1\156\1\160\2\164\1\143\1\120\1\163\1\155\1\142\1\145\1\164\1\171\2\60\1\uffff\1\141\2\uffff\1\141\1\60\1\uffff\1\145\1\60\1\160\1\162\1\151\1\141\1\165\1\157\1\145\1\105\1\157\1\145\1\uffff\1\151\2\165\1\163\1\60\1\160\1\156\1\uffff\2\60\1\145\1\103\1\163\2\60\1\160\1\156\1\154\1\60\1\145\1\60\1\157\1\uffff\1\151\1\164\1\141\1\124\1\157\1\143\4\145\1\162\1\60\1\145\1\154\3\60\2\uffff\1\154\1\142\1\uffff\1\72\1\uffff\1\145\1\141\1\157\2\155\1\156\1\60\1\165\1\171\1\170\1\156\1\162\1\145\2\156\1\60\1\uffff\1\157\1\144\2\uffff\1\60\1\154\1\171\1\164\2\uffff\1\157\1\144\1\145\1\uffff\1\156\1\uffff\1\156\1\157\1\145\1\155\1\171\1\123\1\145\1\60\2\162\1\163\1\157\1\uffff\1\156\1\145\3\uffff\1\165\1\154\1\uffff\1\163\1\154\1\156\2\145\1\163\1\uffff\2\160\1\143\2\163\1\162\2\144\1\uffff\1\151\1\60\1\uffff\1\141\1\160\1\162\1\151\2\60\1\164\1\60\1\156\1\60\1\145\1\160\1\164\1\60\1\uffff\1\141\2\60\1\170\1\164\1\60\2\145\1\60\1\106\1\163\1\164\1\156\1\60\3\145\5\60\1\156\1\uffff\1\163\1\145\1\151\1\156\2\uffff\1\120\1\uffff\1\60\1\uffff\1\164\1\145\1\162\1\uffff\1\154\2\uffff\1\151\1\60\1\uffff\1\114\1\60\1\uffff\1\145\1\60\1\145\1\164\1\uffff\1\162\1\60\1\160\5\uffff\1\164\1\163\1\116\1\142\1\164\1\162\1\uffff\1\145\1\60\1\151\1\60\1\145\1\uffff\1\151\1\uffff\1\141\1\uffff\1\162\1\163\1\124\1\uffff\1\164\1\60\1\116\1\141\1\165\1\60\1\157\1\162\1\uffff\1\156\1\uffff\1\163\2\164\2\60\1\171\1\151\1\uffff\1\141\1\155\1\164\1\uffff\1\143\1\60\1\147\1\60\1\145\1\165\1\60\2\uffff\1\160\1\157\1\155\1\145\1\151\1\145\1\uffff\1\115\1\uffff\2\162\1\uffff\1\145\1\156\1\145\1\60\1\157\1\144\2\141\1\145\2\163\1\60\1\uffff\1\156\1\165\1\160\1\154\1\163\2\60\1\uffff\1\60\1\162\1\105\2\60\3\uffff\1\145\1\156\2\uffff\1\60\1\164\1\uffff\1\162\1\171\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\2\165\1\157\1\117\1\114\1\154\3\uffff\1\141\1\uffff\1\162\1\164\5\uffff\1\57\1\170\1\157\1\156\3\uffff\1\157\1\156\1\160\1\141\1\145\1\165\1\124\1\145\1\157\1\145\2\157\1\172\2\uffff\2\uffff\2\uffff\1\165\1\uffff\1\154\1\145\1\156\1\162\1\164\1\141\1\155\1\165\1\162\1\103\1\117\1\141\6\uffff\1\154\1\144\1\164\1\172\1\163\10\uffff\1\160\1\165\1\156\1\171\1\160\1\145\1\170\1\141\1\157\1\154\1\160\1\157\1\145\1\167\2\164\1\172\3\uffff\1\162\1\164\1\160\1\163\1\155\2\141\1\154\1\160\1\164\1\171\1\145\1\164\1\145\1\141\1\156\1\141\1\163\1\156\1\141\1\171\2\154\1\163\3\uffff\1\145\1\156\1\163\1\161\1\143\3\141\1\151\1\154\1\160\1\162\1\151\1\101\1\102\1\164\1\72\1\145\1\162\1\uffff\1\164\1\172\1\160\1\162\1\156\2\160\1\156\1\143\1\162\1\165\1\141\1\160\1\167\1\164\1\171\1\151\3\145\1\164\1\uffff\1\155\2\145\1\161\1\145\1\160\1\163\1\156\1\141\1\145\1\152\1\156\1\164\1\160\1\156\1\162\1\146\1\164\1\165\1\162\1\145\1\157\1\164\1\156\1\172\1\165\1\141\1\164\1\172\1\163\1\145\1\165\2\164\1\151\1\165\1\166\1\141\1\154\1\143\1\141\1\114\1\101\1\146\1\uffff\1\162\1\151\1\162\1\uffff\1\145\1\165\1\157\1\145\1\162\1\157\2\145\1\141\1\156\1\163\3\145\2\163\3\162\2\141\2\162\1\165\1\164\1\154\1\165\1\164\1\163\1\162\1\145\1\157\1\162\2\145\1\151\1\145\1\141\1\155\1\141\1\162\1\154\1\145\1\147\1\uffff\1\145\1\164\1\172\1\uffff\1\151\1\172\1\145\2\151\2\154\1\145\1\162\2\145\1\154\1\172\1\114\1\157\1\145\1\142\1\141\1\162\1\143\1\164\1\172\1\141\1\163\1\162\1\160\1\155\1\144\1\163\3\162\1\172\1\164\1\105\1\141\1\162\1\166\1\156\1\154\1\166\1\162\1\105\1\145\1\164\1\151\1\162\1\151\1\163\1\141\1\143\1\164\1\151\1\120\1\162\1\156\1\162\1\124\1\172\1\155\1\145\1\166\1\156\1\151\1\145\1\172\1\151\1\uffff\1\145\1\uffff\1\156\2\157\1\163\1\164\1\144\1\172\1\163\1\172\1\151\1\uffff\1\172\1\162\1\144\1\165\1\143\1\124\1\164\2\141\1\162\1\uffff\1\164\2\151\1\164\1\145\1\163\1\151\2\102\1\141\1\uffff\1\151\1\156\1\157\1\154\3\141\1\143\1\104\2\141\1\156\1\157\1\172\1\141\1\156\1\172\1\145\1\164\1\172\2\164\1\141\1\142\1\141\1\151\1\147\1\145\1\171\1\151\1\uffff\1\145\1\156\1\145\1\164\1\156\1\141\1\uffff\1\154\1\156\1\143\2\156\1\172\1\126\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\155\1\172\2\164\1\171\1\165\1\164\1\162\1\147\1\151\1\164\1\143\1\151\1\164\1\172\1\146\2\157\1\154\1\143\1\144\1\165\1\172\2\154\1\143\1\145\1\151\2\154\1\144\1\165\1\uffff\1\142\1\147\1\uffff\1\155\1\171\1\uffff\1\151\1\172\1\164\1\165\1\162\1\143\1\124\1\156\1\160\2\164\1\143\1\120\1\163\1\155\1\142\1\145\1\164\1\171\2\172\1\uffff\1\141\2\uffff\1\141\1\172\1\uffff\1\145\1\172\1\160\1\162\1\151\1\141\1\165\1\157\1\145\1\124\1\157\1\145\1\uffff\1\151\2\165\1\163\1\172\1\160\1\156\1\uffff\2\172\1\145\1\124\1\163\2\172\1\160\1\156\1\154\1\172\1\145\1\172\1\157\1\uffff\1\151\1\164\1\141\1\124\1\157\1\143\4\145\1\162\1\172\1\145\1\154\3\172\2\uffff\1\154\1\142\1\uffff\1\72\1\uffff\1\145\1\141\1\157\2\155\1\156\1\172\1\165\1\171\1\170\1\156\1\162\1\145\2\156\1\172\1\uffff\1\157\1\144\2\uffff\1\172\1\154\1\171\1\164\2\uffff\1\157\1\144\1\145\1\uffff\1\156\1\uffff\1\156\1\157\1\145\1\155\1\171\1\123\1\145\1\172\2\162\1\163\1\157\1\uffff\1\156\1\145\3\uffff\1\165\1\154\1\uffff\1\163\1\154\1\156\2\145\1\163\1\uffff\2\160\1\143\2\163\1\162\2\144\1\uffff\1\151\1\172\1\uffff\1\141\1\160\1\162\1\151\2\172\1\164\1\172\1\156\1\172\1\145\1\160\1\164\1\172\1\uffff\1\141\2\172\1\170\1\164\1\172\2\145\1\172\1\106\1\163\1\164\1\156\1\172\3\145\5\172\1\156\1\uffff\1\163\1\145\1\151\1\156\2\uffff\1\120\1\uffff\1\172\1\uffff\1\164\1\145\1\162\1\uffff\1\154\2\uffff\1\151\1\172\1\uffff\1\114\1\172\1\uffff\1\145\1\172\1\145\1\164\1\uffff\1\162\1\172\1\160\5\uffff\1\164\1\163\1\116\1\142\1\164\1\162\1\uffff\1\145\1\172\1\151\1\172\1\145\1\uffff\1\151\1\uffff\1\141\1\uffff\1\162\1\163\1\124\1\uffff\1\164\1\172\1\116\1\141\1\165\1\172\1\157\1\162\1\uffff\1\156\1\uffff\1\163\2\164\2\172\1\171\1\151\1\uffff\1\141\1\155\1\164\1\uffff\1\143\1\172\1\147\1\172\1\145\1\165\1\172\2\uffff\1\160\1\157\1\155\1\145\1\151\1\145\1\uffff\1\115\1\uffff\2\162\1\uffff\1\145\1\156\1\145\1\172\1\157\1\144\2\141\1\145\2\163\1\172\1\uffff\1\156\1\165\1\160\1\154\1\163\2\172\1\uffff\1\172\1\162\1\105\2\172\3\uffff\1\145\1\156\2\uffff\1\172\1\164\1\uffff\1\162\1\171\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\11\1\12\1\13\1\uffff\1\15\2\uffff\1\22\1\23\1\24\1\25\1\26\4\uffff\1\33\1\34\1\35\15\uffff\1\145\1\146\2\uffff\1\152\1\153\1\uffff\1\145\14\uffff\1\11\1\12\1\13\1\21\1\14\1\15\5\uffff\1\22\1\23\1\24\1\25\1\26\1\150\1\151\1\27\21\uffff\1\33\1\34\1\35\30\uffff\1\146\1\147\1\152\23\uffff\1\20\25\uffff\1\143\54\uffff\1\16\3\uffff\1\30\54\uffff\1\113\3\uffff\1\1\103\uffff\1\134\1\uffff\1\2\12\uffff\1\6\12\uffff\1\70\12\uffff\1\124\36\uffff\1\127\6\uffff\1\114\10\uffff\1\5\1\uffff\1\76\1\uffff\1\7\40\uffff\1\65\2\uffff\1\50\2\uffff\1\52\25\uffff\1\100\1\uffff\1\142\1\44\2\uffff\1\64\14\uffff\1\103\7\uffff\1\132\16\uffff\1\115\21\uffff\1\47\1\3\2\uffff\1\10\1\uffff\1\135\20\uffff\1\31\2\uffff\1\32\1\46\4\uffff\1\37\1\45\3\uffff\1\42\1\uffff\1\51\14\uffff\1\101\2\uffff\1\137\1\140\1\4\2\uffff\1\17\6\uffff\1\123\10\uffff\1\130\2\uffff\1\136\16\uffff\1\125\27\uffff\1\66\4\uffff\1\67\1\141\1\uffff\1\63\1\uffff\1\116\3\uffff\1\121\1\uffff\1\133\1\77\2\uffff\1\117\2\uffff\1\55\4\uffff\1\60\3\uffff\1\71\1\73\1\106\1\107\1\111\6\uffff\1\75\5\uffff\1\144\1\uffff\1\126\1\uffff\1\56\3\uffff\1\72\10\uffff\1\104\1\uffff\1\131\7\uffff\1\40\3\uffff\1\41\7\uffff\1\105\1\110\6\uffff\1\102\1\uffff\1\122\2\uffff\1\57\14\uffff\1\54\7\uffff\1\53\5\uffff\1\62\1\74\1\36\2\uffff\1\120\1\61\2\uffff\1\43\3\uffff\1\112";
    static final String DFA12_specialS =
        "\1\2\51\uffff\1\0\1\1\u02f4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\55\1\52\4\55\1\53\1\17\1\20\1\23\1\21\1\12\1\22\1\13\1\24\12\51\1\55\1\31\1\55\1\14\3\55\4\50\1\41\1\50\1\6\1\50\1\34\2\50\1\5\1\50\1\33\1\50\1\7\2\50\1\36\7\50\1\30\1\55\1\32\1\47\1\50\1\55\1\16\1\50\1\43\1\3\1\25\1\2\2\50\1\27\1\50\1\44\1\26\1\37\1\50\1\15\1\46\1\40\1\42\1\4\1\1\1\35\1\45\4\50\1\10\1\55\1\11\uff82\55",
            "\1\56",
            "\1\60\20\uffff\1\61\2\uffff\1\62",
            "\1\64\17\uffff\1\63",
            "\1\66\1\uffff\1\65\1\uffff\1\70\11\uffff\1\67",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "\1\77",
            "",
            "\1\102\16\uffff\1\103",
            "\1\106\20\uffff\1\105\1\104",
            "",
            "",
            "",
            "",
            "",
            "\1\114\4\uffff\1\115",
            "\1\121\1\127\1\130\1\uffff\1\125\1\uffff\1\124\3\uffff\1\133\1\132\2\uffff\1\123\1\126\2\uffff\1\120\1\122\1\131\42\uffff\1\117",
            "\1\135\5\uffff\1\134",
            "\1\137\51\uffff\1\136",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\146\1\uffff\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\154\1\uffff\1\152\1\161\1\162\1\uffff\1\156\7\uffff\1\153\1\163\1\uffff\1\160\1\157\1\155",
            "\1\164",
            "\1\166\6\uffff\1\165",
            "\1\167",
            "\1\170\15\uffff\1\171",
            "\1\172",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\0\174",
            "\0\174",
            "",
            "",
            "\1\177\23\uffff\1\176",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\13\uffff\1\u0086\1\uffff\1\u0084",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0093",
            "\1\u0095\1\u0094",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u00a0\5\uffff\1\u009f",
            "\1\u00a1",
            "\1\u00a2\17\uffff\1\u00a3",
            "\1\u00a4",
            "\1\u00a6\1\u00a5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\11\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b2\15\uffff\1\u00b1",
            "\1\u00b3\5\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc\14\uffff\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd\12\uffff\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e\12\uffff\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0133\12\uffff\1\u0132",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0149\3\uffff\1\u0148",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u014e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\12\57\7\uffff\1\u0164\16\57\1\u0163\12\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0171",
            "\1\u0173\2\uffff\1\u0172",
            "\1\u0174",
            "\1\u0175",
            "\1\u0177\17\uffff\1\u0176",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017d\2\uffff\1\u017c",
            "\1\u017e",
            "\1\u017f",
            "\1\u0181\3\uffff\1\u0180",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\12\57\7\uffff\13\57\1\u018e\16\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0197",
            "",
            "\1\u0198",
            "",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01a0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01a2",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01c5",
            "\1\u01c6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01c8",
            "\1\u01c9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01e1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u01e4",
            "",
            "\1\u01e5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "",
            "\1\u0205",
            "\1\u0206",
            "",
            "\1\u0207",
            "\1\u0208",
            "",
            "\1\u0209",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u021e",
            "",
            "",
            "\1\u021f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0221",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022c\15\uffff\1\u022a\1\u022b",
            "\1\u022d",
            "\1\u022e",
            "",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0234",
            "\1\u0235",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0238",
            "\1\u0239\20\uffff\1\u023a",
            "\1\u023b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0242",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0244",
            "",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0251",
            "\1\u0252",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0256",
            "\1\u0257",
            "",
            "\1\u0258",
            "",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0269",
            "\1\u026a",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "",
            "",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "",
            "\1\u0272",
            "",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "",
            "\1\u027f",
            "\1\u0280",
            "",
            "",
            "",
            "\1\u0281",
            "\1\u0282",
            "",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "",
            "\1\u0291",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0299",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u029b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u02a1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02a4",
            "\1\u02a5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02a7",
            "\1\u02a8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02b7",
            "",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "",
            "",
            "\1\u02bc",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "",
            "\1\u02c1",
            "",
            "",
            "\1\u02c2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u02c4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u02c6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02c8",
            "\1\u02c9",
            "",
            "\1\u02ca",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02cc",
            "",
            "",
            "",
            "",
            "",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "",
            "\1\u02d3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02d5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02d7",
            "",
            "\1\u02d8",
            "",
            "\1\u02d9",
            "",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "",
            "\1\u02dd",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02e3",
            "\1\u02e4",
            "",
            "\1\u02e5",
            "",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u02e9\7\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02ec",
            "\1\u02ed",
            "",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "",
            "\1\u02f1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02f3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u02f5",
            "\1\u02f6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "",
            "\1\u02fe",
            "",
            "\1\u02ff",
            "\1\u0300",
            "",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0315",
            "\1\u0316",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u0319",
            "\1\u031a",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u031c",
            "",
            "\1\u031d",
            "\1\u031e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( ((LA12_42>='\u0000' && LA12_42<='\uFFFF')) ) {s = 124;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( ((LA12_43>='\u0000' && LA12_43<='\uFFFF')) ) {s = 124;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='t') ) {s = 1;}

                        else if ( (LA12_0=='f') ) {s = 2;}

                        else if ( (LA12_0=='d') ) {s = 3;}

                        else if ( (LA12_0=='s') ) {s = 4;}

                        else if ( (LA12_0=='L') ) {s = 5;}

                        else if ( (LA12_0=='G') ) {s = 6;}

                        else if ( (LA12_0=='P') ) {s = 7;}

                        else if ( (LA12_0=='{') ) {s = 8;}

                        else if ( (LA12_0=='}') ) {s = 9;}

                        else if ( (LA12_0==',') ) {s = 10;}

                        else if ( (LA12_0=='.') ) {s = 11;}

                        else if ( (LA12_0=='=') ) {s = 12;}

                        else if ( (LA12_0=='o') ) {s = 13;}

                        else if ( (LA12_0=='a') ) {s = 14;}

                        else if ( (LA12_0=='(') ) {s = 15;}

                        else if ( (LA12_0==')') ) {s = 16;}

                        else if ( (LA12_0=='+') ) {s = 17;}

                        else if ( (LA12_0=='-') ) {s = 18;}

                        else if ( (LA12_0=='*') ) {s = 19;}

                        else if ( (LA12_0=='/') ) {s = 20;}

                        else if ( (LA12_0=='e') ) {s = 21;}

                        else if ( (LA12_0=='l') ) {s = 22;}

                        else if ( (LA12_0=='i') ) {s = 23;}

                        else if ( (LA12_0=='[') ) {s = 24;}

                        else if ( (LA12_0==';') ) {s = 25;}

                        else if ( (LA12_0==']') ) {s = 26;}

                        else if ( (LA12_0=='N') ) {s = 27;}

                        else if ( (LA12_0=='I') ) {s = 28;}

                        else if ( (LA12_0=='u') ) {s = 29;}

                        else if ( (LA12_0=='S') ) {s = 30;}

                        else if ( (LA12_0=='m') ) {s = 31;}

                        else if ( (LA12_0=='q') ) {s = 32;}

                        else if ( (LA12_0=='E') ) {s = 33;}

                        else if ( (LA12_0=='r') ) {s = 34;}

                        else if ( (LA12_0=='c') ) {s = 35;}

                        else if ( (LA12_0=='k') ) {s = 36;}

                        else if ( (LA12_0=='v') ) {s = 37;}

                        else if ( (LA12_0=='p') ) {s = 38;}

                        else if ( (LA12_0=='^') ) {s = 39;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||LA12_0=='F'||LA12_0=='H'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='M'||LA12_0=='O'||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||LA12_0=='j'||LA12_0=='n'||(LA12_0>='w' && LA12_0<='z')) ) {s = 40;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 41;}

                        else if ( (LA12_0=='\"') ) {s = 42;}

                        else if ( (LA12_0=='\'') ) {s = 43;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 44;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0==':'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}