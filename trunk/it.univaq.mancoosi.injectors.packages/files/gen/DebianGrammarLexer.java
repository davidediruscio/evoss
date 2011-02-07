// $ANTLR 3.2 Sep 23, 2009 12:02:23 DebianGrammar.g 2011-02-07 21:12:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DebianGrammarLexer extends Lexer {
    public static final int LESSAND=50;
    public static final int ANDGREAT=53;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int PATHDOCID=44;
    public static final int T__160=160;
    public static final int DQUOTE=7;
    public static final int EXCL=5;
    public static final int DSEMI=55;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int VAREXCL=64;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int VBAR=25;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int PATHEMACSINST=17;
    public static final int T__149=149;
    public static final int PATHP=37;
    public static final int LGRAF=30;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int PATHEMACSREM=18;
    public static final int NUMBER=13;
    public static final int UNDERSCORE=22;
    public static final int GREATAND=14;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__140=140;
    public static final int T__89=89;
    public static final int T__145=145;
    public static final int T__88=88;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int VARQMARK=62;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=77;
    public static final int PATHKVERS=46;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int VARPATH=68;
    public static final int T__131=131;
    public static final int PSINGLE=26;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int GREAT=11;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int RSBRACK=9;
    public static final int BLANKLINE=75;
    public static final int T__202=202;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int LESSGREAT=52;
    public static final int T__206=206;
    public static final int SLASH=28;
    public static final int T__207=207;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int DLESS=40;
    public static final int T__112=112;
    public static final int AP=23;
    public static final int PATHNULL=12;
    public static final int DMINUS=19;
    public static final int AMPERSAND=57;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int MINUS=15;
    public static final int COLON=34;
    public static final int PATHPACK=45;
    public static final int RGRAF=31;
    public static final int DGREAT=49;
    public static final int VARDOLLAR=63;
    public static final int PATHOLDSCHEMA=21;
    public static final int LPAR=38;
    public static final int PATH=59;
    public static final int LESS=48;
    public static final int PATHREL=58;
    public static final int VAR=60;
    public static final int COMMENT=74;
    public static final int VARPS=69;
    public static final int DDOT=73;
    public static final int SHARP=4;
    public static final int VARSTAR=65;
    public static final int CLOBBER=54;
    public static final int PATHMIME=32;
    public static final int VARAT=66;
    public static final int PATHXMANAGER=42;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int OR=16;
    public static final int QMARK=72;
    public static final int PATHGCONFSCH=20;
    public static final int PATHSCRIPT=47;
    public static final int ID=70;
    public static final int AND=10;
    public static final int PATHSUID=33;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int TILDE=27;
    public static final int PATHCONFMOD=43;
    public static final int DIGIT=71;
    public static final int DOT=36;
    public static final int PATHXWINDOW=41;
    public static final int PATHSS=35;
    public static final int NOTEQU=56;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int T__189=189;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int VARINPUT=61;
    public static final int VARHOME=67;
    public static final int LSBRACK=6;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int DLESSDASH=51;
    public static final int PATHCOMPYTH=24;
    public static final int T__176=176;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int EQU=8;
    public static final int NOTNEWLINE=76;
    public static final int RPAR=39;
    public static final int T__169=169;
    public static final int BSLASH=29;

    // delegates
    // delegators

    public DebianGrammarLexer() {;} 
    public DebianGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DebianGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "DebianGrammar.g"; }

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:3:7: ( '\\n' )
            // DebianGrammar.g:3:9: '\\n'
            {
            match('\n'); 

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
            // DebianGrammar.g:4:7: ( 'if' )
            // DebianGrammar.g:4:9: 'if'
            {
            match("if"); 


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
            // DebianGrammar.g:5:7: ( 'configure' )
            // DebianGrammar.g:5:9: 'configure'
            {
            match("configure"); 


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
            // DebianGrammar.g:6:7: ( 'which' )
            // DebianGrammar.g:6:9: 'which'
            {
            match("which"); 


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
            // DebianGrammar.g:7:7: ( 'update-desktop-database' )
            // DebianGrammar.g:7:9: 'update-desktop-database'
            {
            match("update-desktop-database"); 


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
            // DebianGrammar.g:8:7: ( ';' )
            // DebianGrammar.g:8:9: ';'
            {
            match(';'); 

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
            // DebianGrammar.g:9:7: ( 'then' )
            // DebianGrammar.g:9:9: 'then'
            {
            match("then"); 


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
            // DebianGrammar.g:10:7: ( 'q' )
            // DebianGrammar.g:10:9: 'q'
            {
            match('q'); 

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
            // DebianGrammar.g:11:7: ( 'fi' )
            // DebianGrammar.g:11:9: 'fi'
            {
            match("fi"); 


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
            // DebianGrammar.g:12:7: ( 'remove' )
            // DebianGrammar.g:12:9: 'remove'
            {
            match("remove"); 


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
            // DebianGrammar.g:13:7: ( 'install-docs' )
            // DebianGrammar.g:13:9: 'install-docs'
            {
            match("install-docs"); 


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
            // DebianGrammar.g:14:7: ( 'i' )
            // DebianGrammar.g:14:9: 'i'
            {
            match('i'); 

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
            // DebianGrammar.g:15:7: ( 'upgrade' )
            // DebianGrammar.g:15:9: 'upgrade'
            {
            match("upgrade"); 


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
            // DebianGrammar.g:16:7: ( 'r' )
            // DebianGrammar.g:16:9: 'r'
            {
            match('r'); 

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
            // DebianGrammar.g:17:7: ( 'x' )
            // DebianGrammar.g:17:9: 'x'
            {
            match('x'); 

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
            // DebianGrammar.g:18:7: ( 'update-gconf-defaults' )
            // DebianGrammar.g:18:9: 'update-gconf-defaults'
            {
            match("update-gconf-defaults"); 


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
            // DebianGrammar.g:19:7: ( 'gconf-schemas' )
            // DebianGrammar.g:19:9: 'gconf-schemas'
            {
            match("gconf-schemas"); 


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
            // DebianGrammar.g:20:7: ( 'register' )
            // DebianGrammar.g:20:9: 'register'
            {
            match("register"); 


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
            // DebianGrammar.g:21:7: ( 'unregister' )
            // DebianGrammar.g:21:9: 'unregister'
            {
            match("unregister"); 


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
            // DebianGrammar.g:22:7: ( 'purge' )
            // DebianGrammar.g:22:9: 'purge'
            {
            match("purge"); 


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
            // DebianGrammar.g:23:7: ( 'OLD_DIR' )
            // DebianGrammar.g:23:9: 'OLD_DIR'
            {
            match("OLD_DIR"); 


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
            // DebianGrammar.g:24:7: ( 'SCHEMA_FILES' )
            // DebianGrammar.g:24:9: 'SCHEMA_FILES'
            {
            match("SCHEMA_FILES"); 


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
            // DebianGrammar.g:25:8: ( 'd' )
            // DebianGrammar.g:25:10: 'd'
            {
            match('d'); 

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
            // DebianGrammar.g:26:8: ( '$OLD_DIR' )
            // DebianGrammar.g:26:10: '$OLD_DIR'
            {
            match("$OLD_DIR"); 


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
            // DebianGrammar.g:27:8: ( 'for' )
            // DebianGrammar.g:27:10: 'for'
            {
            match("for"); 


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
            // DebianGrammar.g:28:8: ( 'SCHEMA' )
            // DebianGrammar.g:28:10: 'SCHEMA'
            {
            match("SCHEMA"); 


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
            // DebianGrammar.g:29:8: ( 'in' )
            // DebianGrammar.g:29:10: 'in'
            {
            match("in"); 


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
            // DebianGrammar.g:30:8: ( '$SCHEMA_FILES' )
            // DebianGrammar.g:30:10: '$SCHEMA_FILES'
            {
            match("$SCHEMA_FILES"); 


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
            // DebianGrammar.g:31:8: ( 'do' )
            // DebianGrammar.g:31:10: 'do'
            {
            match("do"); 


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
            // DebianGrammar.g:32:8: ( 'rm' )
            // DebianGrammar.g:32:10: 'rm'
            {
            match("rm"); 


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
            // DebianGrammar.g:33:8: ( 'f' )
            // DebianGrammar.g:33:10: 'f'
            {
            match('f'); 

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
            // DebianGrammar.g:34:8: ( 'done' )
            // DebianGrammar.g:34:10: 'done'
            {
            match("done"); 


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
            // DebianGrammar.g:35:8: ( 'rmdir' )
            // DebianGrammar.g:35:10: 'rmdir'
            {
            match("rmdir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:36:8: ( 'p' )
            // DebianGrammar.g:36:10: 'p'
            {
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:37:8: ( 'ignore-fail-on-non-empty' )
            // DebianGrammar.g:37:10: 'ignore-fail-on-non-empty'
            {
            match("ignore-fail-on-non-empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:38:8: ( 'update-icon-caches' )
            // DebianGrammar.g:38:10: 'update-icon-caches'
            {
            match("update-icon-caches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:39:8: ( 'install-info' )
            // DebianGrammar.g:39:10: 'install-info'
            {
            match("install-info"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:40:8: ( 'quiet' )
            // DebianGrammar.g:40:10: 'quiet'
            {
            match("quiet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:41:8: ( 'update-rc.d' )
            // DebianGrammar.g:41:10: 'update-rc.d'
            {
            match("update-rc.d"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:42:8: ( 'n' )
            // DebianGrammar.g:42:10: 'n'
            {
            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:43:8: ( 'dh_action' )
            // DebianGrammar.g:43:10: 'dh_action'
            {
            match("dh_action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:44:8: ( 'restart' )
            // DebianGrammar.g:44:10: 'restart'
            {
            match("restart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:45:8: ( 'else' )
            // DebianGrammar.g:45:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:46:8: ( 'start' )
            // DebianGrammar.g:46:10: 'start'
            {
            match("start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:47:8: ( 'invoke-rc.d' )
            // DebianGrammar.g:47:10: 'invoke-rc.d'
            {
            match("invoke-rc.d"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:48:8: ( '$_dh_action' )
            // DebianGrammar.g:48:10: '$_dh_action'
            {
            match("$_dh_action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:49:8: ( 'stop' )
            // DebianGrammar.g:49:10: 'stop'
            {
            match("stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:50:8: ( 'ldconfig' )
            // DebianGrammar.g:50:10: 'ldconfig'
            {
            match("ldconfig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:51:8: ( 'inst' )
            // DebianGrammar.g:51:10: 'inst'
            {
            match("inst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:52:8: ( '$inst' )
            // DebianGrammar.g:52:10: '$inst'
            {
            match("$inst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:53:8: ( 'chmod' )
            // DebianGrammar.g:53:10: 'chmod'
            {
            match("chmod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:54:8: ( 'a+x' )
            // DebianGrammar.g:54:10: 'a+x'
            {
            match("a+x"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:55:8: ( 'update-menus' )
            // DebianGrammar.g:55:10: 'update-menus'
            {
            match("update-menus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:56:8: ( 'a-x' )
            // DebianGrammar.g:56:10: 'a-x'
            {
            match("a-x"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:57:8: ( 'e' )
            // DebianGrammar.g:57:10: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:58:8: ( 'depmod' )
            // DebianGrammar.g:58:10: 'depmod'
            {
            match("depmod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:59:8: ( 'a' )
            // DebianGrammar.g:59:10: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:60:8: ( 'F' )
            // DebianGrammar.g:60:10: 'F'
            {
            match('F'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:61:8: ( 'true' )
            // DebianGrammar.g:61:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:62:8: ( 'PYTHON' )
            // DebianGrammar.g:62:10: 'PYTHON'
            {
            match("PYTHON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:63:8: ( '$PYTHON' )
            // DebianGrammar.g:63:10: '$PYTHON'
            {
            match("$PYTHON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:64:8: ( 'DIRLIST' )
            // DebianGrammar.g:64:10: 'DIRLIST'
            {
            match("DIRLIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:65:8: ( '$DIRLIST' )
            // DebianGrammar.g:65:10: '$DIRLIST'
            {
            match("$DIRLIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:66:8: ( '$i' )
            // DebianGrammar.g:66:10: '$i'
            {
            match("$i"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:67:8: ( 'dpkg' )
            // DebianGrammar.g:67:10: 'dpkg'
            {
            match("dpkg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:68:8: ( 'L' )
            // DebianGrammar.g:68:10: 'L'
            {
            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:69:8: ( 'awk' )
            // DebianGrammar.g:69:10: 'awk'
            {
            match("awk"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:70:8: ( '.py' )
            // DebianGrammar.g:70:10: '.py'
            {
            match(".py"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:71:8: ( '$' )
            // DebianGrammar.g:71:10: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:72:8: ( 'print' )
            // DebianGrammar.g:72:10: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:73:8: ( 'c' )
            // DebianGrammar.g:73:10: 'c'
            {
            match('c'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:74:8: ( 'o' )
            // DebianGrammar.g:74:10: 'o'
            {
            match('o'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:75:8: ( 'xargs' )
            // DebianGrammar.g:75:10: 'xargs'
            {
            match("xargs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:76:8: ( 'scrollkeeper-update' )
            // DebianGrammar.g:76:10: 'scrollkeeper-update'
            {
            match("scrollkeeper-update"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:77:8: ( 'ordcat' )
            // DebianGrammar.g:77:10: 'ordcat'
            {
            match("ordcat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:78:8: ( 'update-catalog' )
            // DebianGrammar.g:78:10: 'update-catalog'
            {
            match("update-catalog"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:79:8: ( 'add' )
            // DebianGrammar.g:79:10: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:80:8: ( 'super' )
            // DebianGrammar.g:80:10: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:81:8: ( 'update-mime-database' )
            // DebianGrammar.g:81:10: 'update-mime-database'
            {
            match("update-mime-database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:82:8: ( 'update-mime' )
            // DebianGrammar.g:82:10: 'update-mime'
            {
            match("update-mime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:83:8: ( 'suidregister' )
            // DebianGrammar.g:83:10: 'suidregister'
            {
            match("suidregister"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:84:8: ( 's' )
            // DebianGrammar.g:84:10: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:85:8: ( 'elif' )
            // DebianGrammar.g:85:10: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:86:8: ( 'chown' )
            // DebianGrammar.g:86:10: 'chown'
            {
            match("chown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:87:8: ( 'suidunregister' )
            // DebianGrammar.g:87:10: 'suidunregister'
            {
            match("suidunregister"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:88:8: ( 'install' )
            // DebianGrammar.g:88:10: 'install'
            {
            match("install"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:89:8: ( 'md5sum' )
            // DebianGrammar.g:89:10: 'md5sum'
            {
            match("md5sum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:90:8: ( 'sed' )
            // DebianGrammar.g:90:10: 'sed'
            {
            match("sed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:91:8: ( '*' )
            // DebianGrammar.g:91:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:92:8: ( 'dpkg-query' )
            // DebianGrammar.g:92:10: 'dpkg-query'
            {
            match("dpkg-query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:93:8: ( 'W' )
            // DebianGrammar.g:93:10: 'W'
            {
            match('W'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:94:8: ( 'Conffiles' )
            // DebianGrammar.g:94:10: 'Conffiles'
            {
            match("Conffiles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:95:8: ( 'echo' )
            // DebianGrammar.g:95:10: 'echo'
            {
            match("echo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:96:8: ( 'Preserving' )
            // DebianGrammar.g:96:10: 'Preserving'
            {
            match("Preserving"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:97:8: ( 'user' )
            // DebianGrammar.g:97:10: 'user'
            {
            match("user"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:98:8: ( 'changes' )
            // DebianGrammar.g:98:10: 'changes'
            {
            match("changes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:99:8: ( 'to' )
            // DebianGrammar.g:99:10: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:100:8: ( 'mv' )
            // DebianGrammar.g:100:10: 'mv'
            {
            match("mv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:101:8: ( 'while' )
            // DebianGrammar.g:101:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:102:8: ( 'read' )
            // DebianGrammar.g:102:10: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:103:8: ( 'line' )
            // DebianGrammar.g:103:10: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:104:8: ( 'set' )
            // DebianGrammar.g:104:10: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:105:8: ( '$line' )
            // DebianGrammar.g:105:10: '$line'
            {
            match("$line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:106:8: ( 'dir' )
            // DebianGrammar.g:106:10: 'dir'
            {
            match("dir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:107:8: ( 'mode' )
            // DebianGrammar.g:107:10: 'mode'
            {
            match("mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:108:8: ( 'group' )
            // DebianGrammar.g:108:10: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:109:8: ( '$dir' )
            // DebianGrammar.g:109:10: '$dir'
            {
            match("$dir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:110:8: ( 'mkdir' )
            // DebianGrammar.g:110:10: 'mkdir'
            {
            match("mkdir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:111:8: ( '$user' )
            // DebianGrammar.g:111:10: '$user'
            {
            match("$user"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:112:8: ( '$group' )
            // DebianGrammar.g:112:10: '$group'
            {
            match("$group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:113:8: ( '$mode' )
            // DebianGrammar.g:113:10: '$mode'
            {
            match("$mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:114:8: ( 'DATA' )
            // DebianGrammar.g:114:10: 'DATA'
            {
            match("DATA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:115:8: ( 'update-alternatives' )
            // DebianGrammar.g:115:10: 'update-alternatives'
            {
            match("update-alternatives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:116:8: ( 'x-window-manager' )
            // DebianGrammar.g:116:10: 'x-window-manager'
            {
            match("x-window-manager"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:117:8: ( 'slave' )
            // DebianGrammar.g:117:10: 'slave'
            {
            match("slave"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "T__193"
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:118:8: ( 'x-window-manager.1.gz' )
            // DebianGrammar.g:118:10: 'x-window-manager.1.gz'
            {
            match("x-window-manager.1.gz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__193"

    // $ANTLR start "T__194"
    public final void mT__194() throws RecognitionException {
        try {
            int _type = T__194;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:119:8: ( 'update-fonts-dir' )
            // DebianGrammar.g:119:10: 'update-fonts-dir'
            {
            match("update-fonts-dir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__194"

    // $ANTLR start "T__195"
    public final void mT__195() throws RecognitionException {
        try {
            int _type = T__195;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:120:8: ( 'db_purge' )
            // DebianGrammar.g:120:10: 'db_purge'
            {
            match("db_purge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__195"

    // $ANTLR start "T__196"
    public final void mT__196() throws RecognitionException {
        try {
            int _type = T__196;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:121:8: ( 'function' )
            // DebianGrammar.g:121:10: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__196"

    // $ANTLR start "T__197"
    public final void mT__197() throws RecognitionException {
        try {
            int _type = T__197;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:122:8: ( 'until' )
            // DebianGrammar.g:122:10: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__197"

    // $ANTLR start "T__198"
    public final void mT__198() throws RecognitionException {
        try {
            int _type = T__198;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:123:8: ( 'case' )
            // DebianGrammar.g:123:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__198"

    // $ANTLR start "T__199"
    public final void mT__199() throws RecognitionException {
        try {
            int _type = T__199;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:124:8: ( 'esac' )
            // DebianGrammar.g:124:10: 'esac'
            {
            match("esac"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__199"

    // $ANTLR start "T__200"
    public final void mT__200() throws RecognitionException {
        try {
            int _type = T__200;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:125:8: ( 'time' )
            // DebianGrammar.g:125:10: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__200"

    // $ANTLR start "T__201"
    public final void mT__201() throws RecognitionException {
        try {
            int _type = T__201;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:126:8: ( 'HOME' )
            // DebianGrammar.g:126:10: 'HOME'
            {
            match("HOME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__201"

    // $ANTLR start "T__202"
    public final void mT__202() throws RecognitionException {
        try {
            int _type = T__202;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:127:8: ( 'PATH' )
            // DebianGrammar.g:127:10: 'PATH'
            {
            match("PATH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__202"

    // $ANTLR start "T__203"
    public final void mT__203() throws RecognitionException {
        try {
            int _type = T__203;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:128:8: ( 'PS' )
            // DebianGrammar.g:128:10: 'PS'
            {
            match("PS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__203"

    // $ANTLR start "T__204"
    public final void mT__204() throws RecognitionException {
        try {
            int _type = T__204;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:129:8: ( 'update-icon-cache' )
            // DebianGrammar.g:129:10: 'update-icon-cache'
            {
            match("update-icon-cache"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__204"

    // $ANTLR start "T__205"
    public final void mT__205() throws RecognitionException {
        try {
            int _type = T__205;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:130:8: ( 'catalog' )
            // DebianGrammar.g:130:10: 'catalog'
            {
            match("catalog"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__205"

    // $ANTLR start "T__206"
    public final void mT__206() throws RecognitionException {
        try {
            int _type = T__206;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:131:8: ( 'old' )
            // DebianGrammar.g:131:10: 'old'
            {
            match("old"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__206"

    // $ANTLR start "T__207"
    public final void mT__207() throws RecognitionException {
        try {
            int _type = T__207;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:132:8: ( 'py' )
            // DebianGrammar.g:132:10: 'py'
            {
            match("py"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__207"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17838:8: ( DIGIT ( 'a' .. 'z' | 'A' .. 'Z' | UNDERSCORE | MINUS | DOT | '+' | DIGIT )* )
            // DebianGrammar.g:17838:10: DIGIT ( 'a' .. 'z' | 'A' .. 'Z' | UNDERSCORE | MINUS | DOT | '+' | DIGIT )*
            {
            mDIGIT(); 
            // DebianGrammar.g:17838:16: ( 'a' .. 'z' | 'A' .. 'Z' | UNDERSCORE | MINUS | DOT | '+' | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='+'||(LA1_0>='-' && LA1_0<='.')||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // DebianGrammar.g:
            	    {
            	    if ( input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // DebianGrammar.g:17840:16: ( '0' .. '9' )
            // DebianGrammar.g:17840:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "VARQMARK"
    public final void mVARQMARK() throws RecognitionException {
        try {
            int _type = VARQMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17842:10: ( '$' QMARK )
            // DebianGrammar.g:17842:12: '$' QMARK
            {
            match('$'); 
            mQMARK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARQMARK"

    // $ANTLR start "VARDOLLAR"
    public final void mVARDOLLAR() throws RecognitionException {
        try {
            int _type = VARDOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17844:11: ( '$' '$' )
            // DebianGrammar.g:17844:13: '$' '$'
            {
            match('$'); 
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARDOLLAR"

    // $ANTLR start "VARSTAR"
    public final void mVARSTAR() throws RecognitionException {
        try {
            int _type = VARSTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17847:9: ( '$' '*' )
            // DebianGrammar.g:17847:11: '$' '*'
            {
            match('$'); 
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARSTAR"

    // $ANTLR start "VARAT"
    public final void mVARAT() throws RecognitionException {
        try {
            int _type = VARAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17850:7: ( '$' '@' )
            // DebianGrammar.g:17850:8: '$' '@'
            {
            match('$'); 
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARAT"

    // $ANTLR start "VAREXCL"
    public final void mVAREXCL() throws RecognitionException {
        try {
            int _type = VAREXCL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17853:9: ( '$' EXCL )
            // DebianGrammar.g:17853:11: '$' EXCL
            {
            match('$'); 
            mEXCL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAREXCL"

    // $ANTLR start "VARHOME"
    public final void mVARHOME() throws RecognitionException {
        try {
            int _type = VARHOME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17856:9: ( '$' 'HOME' )
            // DebianGrammar.g:17856:11: '$' 'HOME'
            {
            match('$'); 
            match("HOME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARHOME"

    // $ANTLR start "VARPATH"
    public final void mVARPATH() throws RecognitionException {
        try {
            int _type = VARPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17859:9: ( '$' 'PATH' )
            // DebianGrammar.g:17859:11: '$' 'PATH'
            {
            match('$'); 
            match("PATH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARPATH"

    // $ANTLR start "VARPS"
    public final void mVARPS() throws RecognitionException {
        try {
            int _type = VARPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17862:7: ( '$' 'PS' NUMBER )
            // DebianGrammar.g:17862:9: '$' 'PS' NUMBER
            {
            match('$'); 
            match("PS"); 

            mNUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARPS"

    // $ANTLR start "VARINPUT"
    public final void mVARINPUT() throws RecognitionException {
        try {
            int _type = VARINPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17865:10: ( '$' NUMBER )
            // DebianGrammar.g:17865:12: '$' NUMBER
            {
            match('$'); 
            mNUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARINPUT"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17868:5: ( '$' ( 'a' .. 'z' | 'A' .. 'Z' | MINUS | QMARK | DOT | '+' | LSBRACK | RSBRACK ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | MINUS | QMARK | UNDERSCORE | DOT | '+' | LSBRACK | RSBRACK )* )
            // DebianGrammar.g:17868:7: '$' ( 'a' .. 'z' | 'A' .. 'Z' | MINUS | QMARK | DOT | '+' | LSBRACK | RSBRACK ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | MINUS | QMARK | UNDERSCORE | DOT | '+' | LSBRACK | RSBRACK )*
            {
            match('$'); 
            if ( input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='.')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // DebianGrammar.g:17868:85: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | MINUS | QMARK | UNDERSCORE | DOT | '+' | LSBRACK | RSBRACK )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='+'||(LA2_0>='-' && LA2_0<='.')||(LA2_0>='0' && LA2_0<='9')||LA2_0=='?'||(LA2_0>='A' && LA2_0<='[')||LA2_0==']'||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // DebianGrammar.g:
            	    {
            	    if ( input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "VAR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17871:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '+' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | UNDERSCORE | MINUS | QMARK | DOT | '+' | '*' | LSBRACK | RSBRACK )* )
            // DebianGrammar.g:17871:6: ( 'a' .. 'z' | 'A' .. 'Z' | '+' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | UNDERSCORE | MINUS | QMARK | DOT | '+' | '*' | LSBRACK | RSBRACK )*
            {
            if ( input.LA(1)=='+'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // DebianGrammar.g:17871:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | UNDERSCORE | MINUS | QMARK | DOT | '+' | '*' | LSBRACK | RSBRACK )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='*' && LA3_0<='+')||(LA3_0>='-' && LA3_0<='.')||(LA3_0>='0' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='[')||LA3_0==']'||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // DebianGrammar.g:
            	    {
            	    if ( (input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "ID"

    // $ANTLR start "PATHP"
    public final void mPATHP() throws RecognitionException {
        try {
            int _type = PATHP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17874:7: ( SLASH 'p' )
            // DebianGrammar.g:17874:9: SLASH 'p'
            {
            mSLASH(); 
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHP"

    // $ANTLR start "PATHSS"
    public final void mPATHSS() throws RecognitionException {
        try {
            int _type = PATHSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17877:8: ( 's' SLASH )
            // DebianGrammar.g:17877:10: 's' SLASH
            {
            match('s'); 
            mSLASH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHSS"

    // $ANTLR start "PATHKVERS"
    public final void mPATHKVERS() throws RecognitionException {
        try {
            int _type = PATHKVERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17880:11: ( '/boot/System.map-' NUMBER )
            // DebianGrammar.g:17880:13: '/boot/System.map-' NUMBER
            {
            match("/boot/System.map-"); 

            mNUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHKVERS"

    // $ANTLR start "PATHSCRIPT"
    public final void mPATHSCRIPT() throws RecognitionException {
        try {
            int _type = PATHSCRIPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17883:12: ( '/etc/init.d/' ID )
            // DebianGrammar.g:17883:14: '/etc/init.d/' ID
            {
            match("/etc/init.d/"); 

            mID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHSCRIPT"

    // $ANTLR start "PATHPACK"
    public final void mPATHPACK() throws RecognitionException {
        try {
            int _type = PATHPACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17886:10: ( '/etc/menu-methods/' ID )
            // DebianGrammar.g:17886:12: '/etc/menu-methods/' ID
            {
            match("/etc/menu-methods/"); 

            mID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHPACK"

    // $ANTLR start "PATHOLDSCHEMA"
    public final void mPATHOLDSCHEMA() throws RecognitionException {
        try {
            int _type = PATHOLDSCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17890:2: ( '$OLD_DIR/$SCHEMA' )
            // DebianGrammar.g:17890:4: '$OLD_DIR/$SCHEMA'
            {
            match("$OLD_DIR/$SCHEMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHOLDSCHEMA"

    // $ANTLR start "PATHGCONFSCH"
    public final void mPATHGCONFSCH() throws RecognitionException {
        try {
            int _type = PATHGCONFSCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17894:2: ( '/etc/gconf/schemas' )
            // DebianGrammar.g:17894:4: '/etc/gconf/schemas'
            {
            match("/etc/gconf/schemas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHGCONFSCH"

    // $ANTLR start "PATHSUID"
    public final void mPATHSUID() throws RecognitionException {
        try {
            int _type = PATHSUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17898:2: ( '/etc/suid.conf' )
            // DebianGrammar.g:17898:4: '/etc/suid.conf'
            {
            match("/etc/suid.conf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHSUID"

    // $ANTLR start "PATHXWINDOW"
    public final void mPATHXWINDOW() throws RecognitionException {
        try {
            int _type = PATHXWINDOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17902:2: ( '/usr/bin/x-window-manager' )
            // DebianGrammar.g:17902:4: '/usr/bin/x-window-manager'
            {
            match("/usr/bin/x-window-manager"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHXWINDOW"

    // $ANTLR start "PATHEMACSINST"
    public final void mPATHEMACSINST() throws RecognitionException {
        try {
            int _type = PATHEMACSINST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17906:2: ( '/usr/lib/emacsen-common/emacs-package-install' )
            // DebianGrammar.g:17906:4: '/usr/lib/emacsen-common/emacs-package-install'
            {
            match("/usr/lib/emacsen-common/emacs-package-install"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHEMACSINST"

    // $ANTLR start "PATHEMACSREM"
    public final void mPATHEMACSREM() throws RecognitionException {
        try {
            int _type = PATHEMACSREM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17910:2: ( '/usr/lib/emacsen-common/emacs-package-remove' )
            // DebianGrammar.g:17910:4: '/usr/lib/emacsen-common/emacs-package-remove'
            {
            match("/usr/lib/emacsen-common/emacs-package-remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHEMACSREM"

    // $ANTLR start "PATHCOMPYTH"
    public final void mPATHCOMPYTH() throws RecognitionException {
        try {
            int _type = PATHCOMPYTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17914:2: ( '/usr/lib/$PYTHON/compileall.py' )
            // DebianGrammar.g:17914:4: '/usr/lib/$PYTHON/compileall.py'
            {
            match("/usr/lib/$PYTHON/compileall.py"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHCOMPYTH"

    // $ANTLR start "PATHXMANAGER"
    public final void mPATHXMANAGER() throws RecognitionException {
        try {
            int _type = PATHXMANAGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17918:2: ( '/usr/share/man/man1/x-window-manager.1.gz' )
            // DebianGrammar.g:17918:4: '/usr/share/man/man1/x-window-manager.1.gz'
            {
            match("/usr/share/man/man1/x-window-manager.1.gz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHXMANAGER"

    // $ANTLR start "PATHCONFMOD"
    public final void mPATHCONFMOD() throws RecognitionException {
        try {
            int _type = PATHCONFMOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17922:2: ( '/usr/share/debconf/confmodule' )
            // DebianGrammar.g:17922:4: '/usr/share/debconf/confmodule'
            {
            match("/usr/share/debconf/confmodule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHCONFMOD"

    // $ANTLR start "PATHMIME"
    public final void mPATHMIME() throws RecognitionException {
        try {
            int _type = PATHMIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17926:2: ( '/usr/share/mime' )
            // DebianGrammar.g:17926:4: '/usr/share/mime'
            {
            match("/usr/share/mime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHMIME"

    // $ANTLR start "PATHDOCID"
    public final void mPATHDOCID() throws RecognitionException {
        try {
            int _type = PATHDOCID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17929:11: ( '/usr/share/doc-base/' ID )
            // DebianGrammar.g:17929:13: '/usr/share/doc-base/' ID
            {
            match("/usr/share/doc-base/"); 

            mID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHDOCID"

    // $ANTLR start "PATHNULL"
    public final void mPATHNULL() throws RecognitionException {
        try {
            int _type = PATHNULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17932:10: ( '/dev/null' )
            // DebianGrammar.g:17932:12: '/dev/null'
            {
            match("/dev/null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHNULL"

    // $ANTLR start "PATHREL"
    public final void mPATHREL() throws RecognitionException {
        try {
            int _type = PATHREL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17935:9: ( ( ( ID | VAR ) SLASH )+ )
            // DebianGrammar.g:17935:11: ( ( ID | VAR ) SLASH )+
            {
            // DebianGrammar.g:17935:11: ( ( ID | VAR ) SLASH )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='$'||LA5_0=='+'||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // DebianGrammar.g:17935:12: ( ID | VAR ) SLASH
            	    {
            	    // DebianGrammar.g:17935:12: ( ID | VAR )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0=='+'||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0=='$') ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // DebianGrammar.g:17935:13: ID
            	            {
            	            mID(); 

            	            }
            	            break;
            	        case 2 :
            	            // DebianGrammar.g:17935:18: VAR
            	            {
            	            mVAR(); 

            	            }
            	            break;

            	    }

            	    mSLASH(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATHREL"

    // $ANTLR start "PATH"
    public final void mPATH() throws RecognitionException {
        try {
            int _type = PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17938:6: ( ( ID | VAR | DDOT | DOT )? ( SLASH ( ID | VAR ) )+ ( SLASH )? )
            // DebianGrammar.g:17938:8: ( ID | VAR | DDOT | DOT )? ( SLASH ( ID | VAR ) )+ ( SLASH )?
            {
            // DebianGrammar.g:17938:8: ( ID | VAR | DDOT | DOT )?
            int alt6=5;
            switch ( input.LA(1) ) {
                case '+':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt6=1;
                    }
                    break;
                case '$':
                    {
                    alt6=2;
                    }
                    break;
                case '.':
                    {
                    int LA6_3 = input.LA(2);

                    if ( (LA6_3=='.') ) {
                        alt6=3;
                    }
                    else if ( (LA6_3=='/') ) {
                        alt6=4;
                    }
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // DebianGrammar.g:17938:9: ID
                    {
                    mID(); 

                    }
                    break;
                case 2 :
                    // DebianGrammar.g:17938:14: VAR
                    {
                    mVAR(); 

                    }
                    break;
                case 3 :
                    // DebianGrammar.g:17938:20: DDOT
                    {
                    mDDOT(); 

                    }
                    break;
                case 4 :
                    // DebianGrammar.g:17938:27: DOT
                    {
                    mDOT(); 

                    }
                    break;

            }

            // DebianGrammar.g:17938:34: ( SLASH ( ID | VAR ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='/') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='$'||LA8_1=='+'||(LA8_1>='A' && LA8_1<='Z')||(LA8_1>='a' && LA8_1<='z')) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // DebianGrammar.g:17938:35: SLASH ( ID | VAR )
            	    {
            	    mSLASH(); 
            	    // DebianGrammar.g:17938:41: ( ID | VAR )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0=='+'||(LA7_0>='A' && LA7_0<='Z')||(LA7_0>='a' && LA7_0<='z')) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0=='$') ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // DebianGrammar.g:17938:42: ID
            	            {
            	            mID(); 

            	            }
            	            break;
            	        case 2 :
            	            // DebianGrammar.g:17938:47: VAR
            	            {
            	            mVAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // DebianGrammar.g:17938:54: ( SLASH )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='/') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // DebianGrammar.g:17938:54: SLASH
                    {
                    mSLASH(); 

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
    // $ANTLR end "PATH"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17941:12: ( '&' )
            // DebianGrammar.g:17941:14: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17943:7: ( ':' )
            // DebianGrammar.g:17943:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "VBAR"
    public final void mVBAR() throws RecognitionException {
        try {
            int _type = VBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17945:6: ( '|' )
            // DebianGrammar.g:17945:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VBAR"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17947:12: ( '_' )
            // DebianGrammar.g:17947:14: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "QMARK"
    public final void mQMARK() throws RecognitionException {
        try {
            int _type = QMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17949:8: ( '?' )
            // DebianGrammar.g:17949:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QMARK"

    // $ANTLR start "SHARP"
    public final void mSHARP() throws RecognitionException {
        try {
            int _type = SHARP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17951:7: ( '#' )
            // DebianGrammar.g:17951:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHARP"

    // $ANTLR start "EXCL"
    public final void mEXCL() throws RecognitionException {
        try {
            int _type = EXCL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17953:6: ( '!' )
            // DebianGrammar.g:17953:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCL"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17955:7: ( '-' )
            // DebianGrammar.g:17955:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17957:7: ( '/' )
            // DebianGrammar.g:17957:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "BSLASH"
    public final void mBSLASH() throws RecognitionException {
        try {
            int _type = BSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17959:8: ( '\\\\' )
            // DebianGrammar.g:17959:10: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSLASH"

    // $ANTLR start "DMINUS"
    public final void mDMINUS() throws RecognitionException {
        try {
            int _type = DMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17961:8: ( '--' )
            // DebianGrammar.g:17961:10: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DMINUS"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17963:5: ( '&&' )
            // DebianGrammar.g:17963:7: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17965:4: ( '||' )
            // DebianGrammar.g:17965:6: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "LSBRACK"
    public final void mLSBRACK() throws RecognitionException {
        try {
            int _type = LSBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17967:9: ( '[' )
            // DebianGrammar.g:17967:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSBRACK"

    // $ANTLR start "RSBRACK"
    public final void mRSBRACK() throws RecognitionException {
        try {
            int _type = RSBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17969:9: ( ']' )
            // DebianGrammar.g:17969:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSBRACK"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
        try {
            int _type = LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17971:6: ( '(' )
            // DebianGrammar.g:17971:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
        try {
            int _type = RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17973:6: ( ')' )
            // DebianGrammar.g:17973:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAR"

    // $ANTLR start "LGRAF"
    public final void mLGRAF() throws RecognitionException {
        try {
            int _type = LGRAF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17975:7: ( '{' )
            // DebianGrammar.g:17975:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LGRAF"

    // $ANTLR start "RGRAF"
    public final void mRGRAF() throws RecognitionException {
        try {
            int _type = RGRAF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17977:7: ( '}' )
            // DebianGrammar.g:17977:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RGRAF"

    // $ANTLR start "DQUOTE"
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17979:8: ( '\"' )
            // DebianGrammar.g:17979:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DQUOTE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17981:5: ( '.' )
            // DebianGrammar.g:17981:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "DDOT"
    public final void mDDOT() throws RecognitionException {
        try {
            int _type = DDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17983:6: ( '..' )
            // DebianGrammar.g:17983:7: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DDOT"

    // $ANTLR start "AP"
    public final void mAP() throws RecognitionException {
        try {
            int _type = AP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17985:10: ( '\\u0060' )
            // DebianGrammar.g:17985:12: '\\u0060'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AP"

    // $ANTLR start "PSINGLE"
    public final void mPSINGLE() throws RecognitionException {
        try {
            int _type = PSINGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17987:9: ( '\\u0027' )
            // DebianGrammar.g:17987:11: '\\u0027'
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PSINGLE"

    // $ANTLR start "EQU"
    public final void mEQU() throws RecognitionException {
        try {
            int _type = EQU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17989:5: ( '=' )
            // DebianGrammar.g:17989:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQU"

    // $ANTLR start "NOTEQU"
    public final void mNOTEQU() throws RecognitionException {
        try {
            int _type = NOTEQU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17991:8: ( '!=' )
            // DebianGrammar.g:17991:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQU"

    // $ANTLR start "DLESS"
    public final void mDLESS() throws RecognitionException {
        try {
            int _type = DLESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17993:7: ( '<<' )
            // DebianGrammar.g:17993:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DLESS"

    // $ANTLR start "DGREAT"
    public final void mDGREAT() throws RecognitionException {
        try {
            int _type = DGREAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17995:8: ( '>>' )
            // DebianGrammar.g:17995:10: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DGREAT"

    // $ANTLR start "LESSAND"
    public final void mLESSAND() throws RecognitionException {
        try {
            int _type = LESSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17997:9: ( '<&' )
            // DebianGrammar.g:17997:11: '<&'
            {
            match("<&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSAND"

    // $ANTLR start "GREATAND"
    public final void mGREATAND() throws RecognitionException {
        try {
            int _type = GREATAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:17999:10: ( '>&' )
            // DebianGrammar.g:17999:12: '>&'
            {
            match(">&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATAND"

    // $ANTLR start "LESSGREAT"
    public final void mLESSGREAT() throws RecognitionException {
        try {
            int _type = LESSGREAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18001:11: ( '<>' )
            // DebianGrammar.g:18001:13: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSGREAT"

    // $ANTLR start "DLESSDASH"
    public final void mDLESSDASH() throws RecognitionException {
        try {
            int _type = DLESSDASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18003:11: ( '<<-' )
            // DebianGrammar.g:18003:13: '<<-'
            {
            match("<<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DLESSDASH"

    // $ANTLR start "CLOBBER"
    public final void mCLOBBER() throws RecognitionException {
        try {
            int _type = CLOBBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18005:9: ( '>|' )
            // DebianGrammar.g:18005:11: '>|'
            {
            match(">|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOBBER"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18007:6: ( '<' )
            // DebianGrammar.g:18007:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREAT"
    public final void mGREAT() throws RecognitionException {
        try {
            int _type = GREAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18009:7: ( '>' )
            // DebianGrammar.g:18009:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREAT"

    // $ANTLR start "ANDGREAT"
    public final void mANDGREAT() throws RecognitionException {
        try {
            int _type = ANDGREAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18011:10: ( '&>' )
            // DebianGrammar.g:18011:12: '&>'
            {
            match("&>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANDGREAT"

    // $ANTLR start "DSEMI"
    public final void mDSEMI() throws RecognitionException {
        try {
            int _type = DSEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18013:7: ( ';;' )
            // DebianGrammar.g:18013:9: ';;'
            {
            match(";;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DSEMI"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18015:7: ( '\\u007E' )
            // DebianGrammar.g:18015:9: '\\u007E'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                skip();

            // DebianGrammar.g:18021:2: ({...}? => ( ' ' | '\\t' )+ SHARP ~ ( EXCL ) (~ ( '\\n' | '\\r' | DQUOTE ) )* ( '\\r' )? | {...}? => ( ' ' | '\\t' )* SHARP ~ ( EXCL | '\\n' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | {...}? => ( ' ' | '\\t' )* SHARP ( '\\r' )? '\\n' )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // DebianGrammar.g:18021:4: {...}? => ( ' ' | '\\t' )+ SHARP ~ ( EXCL ) (~ ( '\\n' | '\\r' | DQUOTE ) )* ( '\\r' )?
                    {
                    if ( !((getCharPositionInLine()>0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "getCharPositionInLine()>0");
                    }
                    // DebianGrammar.g:18021:37: ( ' ' | '\\t' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\t'||LA10_0==' ') ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // DebianGrammar.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    mSHARP(); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<=' ')||(input.LA(1)>='\"' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // DebianGrammar.g:18021:66: (~ ( '\\n' | '\\r' | DQUOTE ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // DebianGrammar.g:18021:67: ~ ( '\\n' | '\\r' | DQUOTE )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // DebianGrammar.g:18021:93: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // DebianGrammar.g:18021:93: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DebianGrammar.g:18022:4: {...}? => ( ' ' | '\\t' )* SHARP ~ ( EXCL | '\\n' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    if ( !((getCharPositionInLine()==0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "getCharPositionInLine()==0");
                    }
                    // DebianGrammar.g:18022:37: ( ' ' | '\\t' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\t'||LA13_0==' ') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // DebianGrammar.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    mSHARP(); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<=' ')||(input.LA(1)>='\"' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // DebianGrammar.g:18022:74: (~ ( '\\n' | '\\r' ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // DebianGrammar.g:18022:75: ~ ( '\\n' | '\\r' )
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
                    	    break loop14;
                        }
                    } while (true);

                    // DebianGrammar.g:18022:92: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // DebianGrammar.g:18022:92: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 3 :
                    // DebianGrammar.g:18023:4: {...}? => ( ' ' | '\\t' )* SHARP ( '\\r' )? '\\n'
                    {
                    if ( !((getCharPositionInLine()==0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "getCharPositionInLine()==0");
                    }
                    // DebianGrammar.g:18023:37: ( ' ' | '\\t' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\t'||LA16_0==' ') ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // DebianGrammar.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    mSHARP(); 
                    // DebianGrammar.g:18023:60: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // DebianGrammar.g:18023:60: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "BLANKLINE"
    public final void mBLANKLINE() throws RecognitionException {
        try {
            int _type = BLANKLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18027:2: ({...}? => ( ' ' | '\\t' )* '\\n' )
            // DebianGrammar.g:18027:5: {...}? => ( ' ' | '\\t' )* '\\n'
            {
            if ( !((getCharPositionInLine()==0)) ) {
                throw new FailedPredicateException(input, "BLANKLINE", "getCharPositionInLine()==0");
            }
            // DebianGrammar.g:18027:38: ( ' ' | '\\t' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\t'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // DebianGrammar.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match('\n'); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANKLINE"

    // $ANTLR start "NOTNEWLINE"
    public final void mNOTNEWLINE() throws RecognitionException {
        try {
            int _type = NOTNEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18029:12: ( ( BSLASH '\\n' ) )
            // DebianGrammar.g:18029:14: ( BSLASH '\\n' )
            {
            // DebianGrammar.g:18029:14: ( BSLASH '\\n' )
            // DebianGrammar.g:18029:15: BSLASH '\\n'
            {
            mBSLASH(); 
            match('\n'); 

            }

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTNEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DebianGrammar.g:18031:5: ( ( ' ' | '\\t' )+ )
            // DebianGrammar.g:18031:7: ( ' ' | '\\t' )+
            {
            // DebianGrammar.g:18031:7: ( ' ' | '\\t' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\t'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // DebianGrammar.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // DebianGrammar.g:1:8: ( T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | NUMBER | VARQMARK | VARDOLLAR | VARSTAR | VARAT | VAREXCL | VARHOME | VARPATH | VARPS | VARINPUT | VAR | ID | PATHP | PATHSS | PATHKVERS | PATHSCRIPT | PATHPACK | PATHOLDSCHEMA | PATHGCONFSCH | PATHSUID | PATHXWINDOW | PATHEMACSINST | PATHEMACSREM | PATHCOMPYTH | PATHXMANAGER | PATHCONFMOD | PATHMIME | PATHDOCID | PATHNULL | PATHREL | PATH | AMPERSAND | COLON | VBAR | UNDERSCORE | QMARK | SHARP | EXCL | MINUS | SLASH | BSLASH | DMINUS | AND | OR | LSBRACK | RSBRACK | LPAR | RPAR | LGRAF | RGRAF | DQUOTE | DOT | DDOT | AP | PSINGLE | EQU | NOTEQU | DLESS | DGREAT | LESSAND | GREATAND | LESSGREAT | DLESSDASH | CLOBBER | LESS | GREAT | ANDGREAT | DSEMI | TILDE | COMMENT | BLANKLINE | NOTNEWLINE | WS )
        int alt21=203;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // DebianGrammar.g:1:10: T__78
                {
                mT__78(); 

                }
                break;
            case 2 :
                // DebianGrammar.g:1:16: T__79
                {
                mT__79(); 

                }
                break;
            case 3 :
                // DebianGrammar.g:1:22: T__80
                {
                mT__80(); 

                }
                break;
            case 4 :
                // DebianGrammar.g:1:28: T__81
                {
                mT__81(); 

                }
                break;
            case 5 :
                // DebianGrammar.g:1:34: T__82
                {
                mT__82(); 

                }
                break;
            case 6 :
                // DebianGrammar.g:1:40: T__83
                {
                mT__83(); 

                }
                break;
            case 7 :
                // DebianGrammar.g:1:46: T__84
                {
                mT__84(); 

                }
                break;
            case 8 :
                // DebianGrammar.g:1:52: T__85
                {
                mT__85(); 

                }
                break;
            case 9 :
                // DebianGrammar.g:1:58: T__86
                {
                mT__86(); 

                }
                break;
            case 10 :
                // DebianGrammar.g:1:64: T__87
                {
                mT__87(); 

                }
                break;
            case 11 :
                // DebianGrammar.g:1:70: T__88
                {
                mT__88(); 

                }
                break;
            case 12 :
                // DebianGrammar.g:1:76: T__89
                {
                mT__89(); 

                }
                break;
            case 13 :
                // DebianGrammar.g:1:82: T__90
                {
                mT__90(); 

                }
                break;
            case 14 :
                // DebianGrammar.g:1:88: T__91
                {
                mT__91(); 

                }
                break;
            case 15 :
                // DebianGrammar.g:1:94: T__92
                {
                mT__92(); 

                }
                break;
            case 16 :
                // DebianGrammar.g:1:100: T__93
                {
                mT__93(); 

                }
                break;
            case 17 :
                // DebianGrammar.g:1:106: T__94
                {
                mT__94(); 

                }
                break;
            case 18 :
                // DebianGrammar.g:1:112: T__95
                {
                mT__95(); 

                }
                break;
            case 19 :
                // DebianGrammar.g:1:118: T__96
                {
                mT__96(); 

                }
                break;
            case 20 :
                // DebianGrammar.g:1:124: T__97
                {
                mT__97(); 

                }
                break;
            case 21 :
                // DebianGrammar.g:1:130: T__98
                {
                mT__98(); 

                }
                break;
            case 22 :
                // DebianGrammar.g:1:136: T__99
                {
                mT__99(); 

                }
                break;
            case 23 :
                // DebianGrammar.g:1:142: T__100
                {
                mT__100(); 

                }
                break;
            case 24 :
                // DebianGrammar.g:1:149: T__101
                {
                mT__101(); 

                }
                break;
            case 25 :
                // DebianGrammar.g:1:156: T__102
                {
                mT__102(); 

                }
                break;
            case 26 :
                // DebianGrammar.g:1:163: T__103
                {
                mT__103(); 

                }
                break;
            case 27 :
                // DebianGrammar.g:1:170: T__104
                {
                mT__104(); 

                }
                break;
            case 28 :
                // DebianGrammar.g:1:177: T__105
                {
                mT__105(); 

                }
                break;
            case 29 :
                // DebianGrammar.g:1:184: T__106
                {
                mT__106(); 

                }
                break;
            case 30 :
                // DebianGrammar.g:1:191: T__107
                {
                mT__107(); 

                }
                break;
            case 31 :
                // DebianGrammar.g:1:198: T__108
                {
                mT__108(); 

                }
                break;
            case 32 :
                // DebianGrammar.g:1:205: T__109
                {
                mT__109(); 

                }
                break;
            case 33 :
                // DebianGrammar.g:1:212: T__110
                {
                mT__110(); 

                }
                break;
            case 34 :
                // DebianGrammar.g:1:219: T__111
                {
                mT__111(); 

                }
                break;
            case 35 :
                // DebianGrammar.g:1:226: T__112
                {
                mT__112(); 

                }
                break;
            case 36 :
                // DebianGrammar.g:1:233: T__113
                {
                mT__113(); 

                }
                break;
            case 37 :
                // DebianGrammar.g:1:240: T__114
                {
                mT__114(); 

                }
                break;
            case 38 :
                // DebianGrammar.g:1:247: T__115
                {
                mT__115(); 

                }
                break;
            case 39 :
                // DebianGrammar.g:1:254: T__116
                {
                mT__116(); 

                }
                break;
            case 40 :
                // DebianGrammar.g:1:261: T__117
                {
                mT__117(); 

                }
                break;
            case 41 :
                // DebianGrammar.g:1:268: T__118
                {
                mT__118(); 

                }
                break;
            case 42 :
                // DebianGrammar.g:1:275: T__119
                {
                mT__119(); 

                }
                break;
            case 43 :
                // DebianGrammar.g:1:282: T__120
                {
                mT__120(); 

                }
                break;
            case 44 :
                // DebianGrammar.g:1:289: T__121
                {
                mT__121(); 

                }
                break;
            case 45 :
                // DebianGrammar.g:1:296: T__122
                {
                mT__122(); 

                }
                break;
            case 46 :
                // DebianGrammar.g:1:303: T__123
                {
                mT__123(); 

                }
                break;
            case 47 :
                // DebianGrammar.g:1:310: T__124
                {
                mT__124(); 

                }
                break;
            case 48 :
                // DebianGrammar.g:1:317: T__125
                {
                mT__125(); 

                }
                break;
            case 49 :
                // DebianGrammar.g:1:324: T__126
                {
                mT__126(); 

                }
                break;
            case 50 :
                // DebianGrammar.g:1:331: T__127
                {
                mT__127(); 

                }
                break;
            case 51 :
                // DebianGrammar.g:1:338: T__128
                {
                mT__128(); 

                }
                break;
            case 52 :
                // DebianGrammar.g:1:345: T__129
                {
                mT__129(); 

                }
                break;
            case 53 :
                // DebianGrammar.g:1:352: T__130
                {
                mT__130(); 

                }
                break;
            case 54 :
                // DebianGrammar.g:1:359: T__131
                {
                mT__131(); 

                }
                break;
            case 55 :
                // DebianGrammar.g:1:366: T__132
                {
                mT__132(); 

                }
                break;
            case 56 :
                // DebianGrammar.g:1:373: T__133
                {
                mT__133(); 

                }
                break;
            case 57 :
                // DebianGrammar.g:1:380: T__134
                {
                mT__134(); 

                }
                break;
            case 58 :
                // DebianGrammar.g:1:387: T__135
                {
                mT__135(); 

                }
                break;
            case 59 :
                // DebianGrammar.g:1:394: T__136
                {
                mT__136(); 

                }
                break;
            case 60 :
                // DebianGrammar.g:1:401: T__137
                {
                mT__137(); 

                }
                break;
            case 61 :
                // DebianGrammar.g:1:408: T__138
                {
                mT__138(); 

                }
                break;
            case 62 :
                // DebianGrammar.g:1:415: T__139
                {
                mT__139(); 

                }
                break;
            case 63 :
                // DebianGrammar.g:1:422: T__140
                {
                mT__140(); 

                }
                break;
            case 64 :
                // DebianGrammar.g:1:429: T__141
                {
                mT__141(); 

                }
                break;
            case 65 :
                // DebianGrammar.g:1:436: T__142
                {
                mT__142(); 

                }
                break;
            case 66 :
                // DebianGrammar.g:1:443: T__143
                {
                mT__143(); 

                }
                break;
            case 67 :
                // DebianGrammar.g:1:450: T__144
                {
                mT__144(); 

                }
                break;
            case 68 :
                // DebianGrammar.g:1:457: T__145
                {
                mT__145(); 

                }
                break;
            case 69 :
                // DebianGrammar.g:1:464: T__146
                {
                mT__146(); 

                }
                break;
            case 70 :
                // DebianGrammar.g:1:471: T__147
                {
                mT__147(); 

                }
                break;
            case 71 :
                // DebianGrammar.g:1:478: T__148
                {
                mT__148(); 

                }
                break;
            case 72 :
                // DebianGrammar.g:1:485: T__149
                {
                mT__149(); 

                }
                break;
            case 73 :
                // DebianGrammar.g:1:492: T__150
                {
                mT__150(); 

                }
                break;
            case 74 :
                // DebianGrammar.g:1:499: T__151
                {
                mT__151(); 

                }
                break;
            case 75 :
                // DebianGrammar.g:1:506: T__152
                {
                mT__152(); 

                }
                break;
            case 76 :
                // DebianGrammar.g:1:513: T__153
                {
                mT__153(); 

                }
                break;
            case 77 :
                // DebianGrammar.g:1:520: T__154
                {
                mT__154(); 

                }
                break;
            case 78 :
                // DebianGrammar.g:1:527: T__155
                {
                mT__155(); 

                }
                break;
            case 79 :
                // DebianGrammar.g:1:534: T__156
                {
                mT__156(); 

                }
                break;
            case 80 :
                // DebianGrammar.g:1:541: T__157
                {
                mT__157(); 

                }
                break;
            case 81 :
                // DebianGrammar.g:1:548: T__158
                {
                mT__158(); 

                }
                break;
            case 82 :
                // DebianGrammar.g:1:555: T__159
                {
                mT__159(); 

                }
                break;
            case 83 :
                // DebianGrammar.g:1:562: T__160
                {
                mT__160(); 

                }
                break;
            case 84 :
                // DebianGrammar.g:1:569: T__161
                {
                mT__161(); 

                }
                break;
            case 85 :
                // DebianGrammar.g:1:576: T__162
                {
                mT__162(); 

                }
                break;
            case 86 :
                // DebianGrammar.g:1:583: T__163
                {
                mT__163(); 

                }
                break;
            case 87 :
                // DebianGrammar.g:1:590: T__164
                {
                mT__164(); 

                }
                break;
            case 88 :
                // DebianGrammar.g:1:597: T__165
                {
                mT__165(); 

                }
                break;
            case 89 :
                // DebianGrammar.g:1:604: T__166
                {
                mT__166(); 

                }
                break;
            case 90 :
                // DebianGrammar.g:1:611: T__167
                {
                mT__167(); 

                }
                break;
            case 91 :
                // DebianGrammar.g:1:618: T__168
                {
                mT__168(); 

                }
                break;
            case 92 :
                // DebianGrammar.g:1:625: T__169
                {
                mT__169(); 

                }
                break;
            case 93 :
                // DebianGrammar.g:1:632: T__170
                {
                mT__170(); 

                }
                break;
            case 94 :
                // DebianGrammar.g:1:639: T__171
                {
                mT__171(); 

                }
                break;
            case 95 :
                // DebianGrammar.g:1:646: T__172
                {
                mT__172(); 

                }
                break;
            case 96 :
                // DebianGrammar.g:1:653: T__173
                {
                mT__173(); 

                }
                break;
            case 97 :
                // DebianGrammar.g:1:660: T__174
                {
                mT__174(); 

                }
                break;
            case 98 :
                // DebianGrammar.g:1:667: T__175
                {
                mT__175(); 

                }
                break;
            case 99 :
                // DebianGrammar.g:1:674: T__176
                {
                mT__176(); 

                }
                break;
            case 100 :
                // DebianGrammar.g:1:681: T__177
                {
                mT__177(); 

                }
                break;
            case 101 :
                // DebianGrammar.g:1:688: T__178
                {
                mT__178(); 

                }
                break;
            case 102 :
                // DebianGrammar.g:1:695: T__179
                {
                mT__179(); 

                }
                break;
            case 103 :
                // DebianGrammar.g:1:702: T__180
                {
                mT__180(); 

                }
                break;
            case 104 :
                // DebianGrammar.g:1:709: T__181
                {
                mT__181(); 

                }
                break;
            case 105 :
                // DebianGrammar.g:1:716: T__182
                {
                mT__182(); 

                }
                break;
            case 106 :
                // DebianGrammar.g:1:723: T__183
                {
                mT__183(); 

                }
                break;
            case 107 :
                // DebianGrammar.g:1:730: T__184
                {
                mT__184(); 

                }
                break;
            case 108 :
                // DebianGrammar.g:1:737: T__185
                {
                mT__185(); 

                }
                break;
            case 109 :
                // DebianGrammar.g:1:744: T__186
                {
                mT__186(); 

                }
                break;
            case 110 :
                // DebianGrammar.g:1:751: T__187
                {
                mT__187(); 

                }
                break;
            case 111 :
                // DebianGrammar.g:1:758: T__188
                {
                mT__188(); 

                }
                break;
            case 112 :
                // DebianGrammar.g:1:765: T__189
                {
                mT__189(); 

                }
                break;
            case 113 :
                // DebianGrammar.g:1:772: T__190
                {
                mT__190(); 

                }
                break;
            case 114 :
                // DebianGrammar.g:1:779: T__191
                {
                mT__191(); 

                }
                break;
            case 115 :
                // DebianGrammar.g:1:786: T__192
                {
                mT__192(); 

                }
                break;
            case 116 :
                // DebianGrammar.g:1:793: T__193
                {
                mT__193(); 

                }
                break;
            case 117 :
                // DebianGrammar.g:1:800: T__194
                {
                mT__194(); 

                }
                break;
            case 118 :
                // DebianGrammar.g:1:807: T__195
                {
                mT__195(); 

                }
                break;
            case 119 :
                // DebianGrammar.g:1:814: T__196
                {
                mT__196(); 

                }
                break;
            case 120 :
                // DebianGrammar.g:1:821: T__197
                {
                mT__197(); 

                }
                break;
            case 121 :
                // DebianGrammar.g:1:828: T__198
                {
                mT__198(); 

                }
                break;
            case 122 :
                // DebianGrammar.g:1:835: T__199
                {
                mT__199(); 

                }
                break;
            case 123 :
                // DebianGrammar.g:1:842: T__200
                {
                mT__200(); 

                }
                break;
            case 124 :
                // DebianGrammar.g:1:849: T__201
                {
                mT__201(); 

                }
                break;
            case 125 :
                // DebianGrammar.g:1:856: T__202
                {
                mT__202(); 

                }
                break;
            case 126 :
                // DebianGrammar.g:1:863: T__203
                {
                mT__203(); 

                }
                break;
            case 127 :
                // DebianGrammar.g:1:870: T__204
                {
                mT__204(); 

                }
                break;
            case 128 :
                // DebianGrammar.g:1:877: T__205
                {
                mT__205(); 

                }
                break;
            case 129 :
                // DebianGrammar.g:1:884: T__206
                {
                mT__206(); 

                }
                break;
            case 130 :
                // DebianGrammar.g:1:891: T__207
                {
                mT__207(); 

                }
                break;
            case 131 :
                // DebianGrammar.g:1:898: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 132 :
                // DebianGrammar.g:1:905: VARQMARK
                {
                mVARQMARK(); 

                }
                break;
            case 133 :
                // DebianGrammar.g:1:914: VARDOLLAR
                {
                mVARDOLLAR(); 

                }
                break;
            case 134 :
                // DebianGrammar.g:1:924: VARSTAR
                {
                mVARSTAR(); 

                }
                break;
            case 135 :
                // DebianGrammar.g:1:932: VARAT
                {
                mVARAT(); 

                }
                break;
            case 136 :
                // DebianGrammar.g:1:938: VAREXCL
                {
                mVAREXCL(); 

                }
                break;
            case 137 :
                // DebianGrammar.g:1:946: VARHOME
                {
                mVARHOME(); 

                }
                break;
            case 138 :
                // DebianGrammar.g:1:954: VARPATH
                {
                mVARPATH(); 

                }
                break;
            case 139 :
                // DebianGrammar.g:1:962: VARPS
                {
                mVARPS(); 

                }
                break;
            case 140 :
                // DebianGrammar.g:1:968: VARINPUT
                {
                mVARINPUT(); 

                }
                break;
            case 141 :
                // DebianGrammar.g:1:977: VAR
                {
                mVAR(); 

                }
                break;
            case 142 :
                // DebianGrammar.g:1:981: ID
                {
                mID(); 

                }
                break;
            case 143 :
                // DebianGrammar.g:1:984: PATHP
                {
                mPATHP(); 

                }
                break;
            case 144 :
                // DebianGrammar.g:1:990: PATHSS
                {
                mPATHSS(); 

                }
                break;
            case 145 :
                // DebianGrammar.g:1:997: PATHKVERS
                {
                mPATHKVERS(); 

                }
                break;
            case 146 :
                // DebianGrammar.g:1:1007: PATHSCRIPT
                {
                mPATHSCRIPT(); 

                }
                break;
            case 147 :
                // DebianGrammar.g:1:1018: PATHPACK
                {
                mPATHPACK(); 

                }
                break;
            case 148 :
                // DebianGrammar.g:1:1027: PATHOLDSCHEMA
                {
                mPATHOLDSCHEMA(); 

                }
                break;
            case 149 :
                // DebianGrammar.g:1:1041: PATHGCONFSCH
                {
                mPATHGCONFSCH(); 

                }
                break;
            case 150 :
                // DebianGrammar.g:1:1054: PATHSUID
                {
                mPATHSUID(); 

                }
                break;
            case 151 :
                // DebianGrammar.g:1:1063: PATHXWINDOW
                {
                mPATHXWINDOW(); 

                }
                break;
            case 152 :
                // DebianGrammar.g:1:1075: PATHEMACSINST
                {
                mPATHEMACSINST(); 

                }
                break;
            case 153 :
                // DebianGrammar.g:1:1089: PATHEMACSREM
                {
                mPATHEMACSREM(); 

                }
                break;
            case 154 :
                // DebianGrammar.g:1:1102: PATHCOMPYTH
                {
                mPATHCOMPYTH(); 

                }
                break;
            case 155 :
                // DebianGrammar.g:1:1114: PATHXMANAGER
                {
                mPATHXMANAGER(); 

                }
                break;
            case 156 :
                // DebianGrammar.g:1:1127: PATHCONFMOD
                {
                mPATHCONFMOD(); 

                }
                break;
            case 157 :
                // DebianGrammar.g:1:1139: PATHMIME
                {
                mPATHMIME(); 

                }
                break;
            case 158 :
                // DebianGrammar.g:1:1148: PATHDOCID
                {
                mPATHDOCID(); 

                }
                break;
            case 159 :
                // DebianGrammar.g:1:1158: PATHNULL
                {
                mPATHNULL(); 

                }
                break;
            case 160 :
                // DebianGrammar.g:1:1167: PATHREL
                {
                mPATHREL(); 

                }
                break;
            case 161 :
                // DebianGrammar.g:1:1175: PATH
                {
                mPATH(); 

                }
                break;
            case 162 :
                // DebianGrammar.g:1:1180: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 163 :
                // DebianGrammar.g:1:1190: COLON
                {
                mCOLON(); 

                }
                break;
            case 164 :
                // DebianGrammar.g:1:1196: VBAR
                {
                mVBAR(); 

                }
                break;
            case 165 :
                // DebianGrammar.g:1:1201: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;
            case 166 :
                // DebianGrammar.g:1:1212: QMARK
                {
                mQMARK(); 

                }
                break;
            case 167 :
                // DebianGrammar.g:1:1218: SHARP
                {
                mSHARP(); 

                }
                break;
            case 168 :
                // DebianGrammar.g:1:1224: EXCL
                {
                mEXCL(); 

                }
                break;
            case 169 :
                // DebianGrammar.g:1:1229: MINUS
                {
                mMINUS(); 

                }
                break;
            case 170 :
                // DebianGrammar.g:1:1235: SLASH
                {
                mSLASH(); 

                }
                break;
            case 171 :
                // DebianGrammar.g:1:1241: BSLASH
                {
                mBSLASH(); 

                }
                break;
            case 172 :
                // DebianGrammar.g:1:1248: DMINUS
                {
                mDMINUS(); 

                }
                break;
            case 173 :
                // DebianGrammar.g:1:1255: AND
                {
                mAND(); 

                }
                break;
            case 174 :
                // DebianGrammar.g:1:1259: OR
                {
                mOR(); 

                }
                break;
            case 175 :
                // DebianGrammar.g:1:1262: LSBRACK
                {
                mLSBRACK(); 

                }
                break;
            case 176 :
                // DebianGrammar.g:1:1270: RSBRACK
                {
                mRSBRACK(); 

                }
                break;
            case 177 :
                // DebianGrammar.g:1:1278: LPAR
                {
                mLPAR(); 

                }
                break;
            case 178 :
                // DebianGrammar.g:1:1283: RPAR
                {
                mRPAR(); 

                }
                break;
            case 179 :
                // DebianGrammar.g:1:1288: LGRAF
                {
                mLGRAF(); 

                }
                break;
            case 180 :
                // DebianGrammar.g:1:1294: RGRAF
                {
                mRGRAF(); 

                }
                break;
            case 181 :
                // DebianGrammar.g:1:1300: DQUOTE
                {
                mDQUOTE(); 

                }
                break;
            case 182 :
                // DebianGrammar.g:1:1307: DOT
                {
                mDOT(); 

                }
                break;
            case 183 :
                // DebianGrammar.g:1:1311: DDOT
                {
                mDDOT(); 

                }
                break;
            case 184 :
                // DebianGrammar.g:1:1316: AP
                {
                mAP(); 

                }
                break;
            case 185 :
                // DebianGrammar.g:1:1319: PSINGLE
                {
                mPSINGLE(); 

                }
                break;
            case 186 :
                // DebianGrammar.g:1:1327: EQU
                {
                mEQU(); 

                }
                break;
            case 187 :
                // DebianGrammar.g:1:1331: NOTEQU
                {
                mNOTEQU(); 

                }
                break;
            case 188 :
                // DebianGrammar.g:1:1338: DLESS
                {
                mDLESS(); 

                }
                break;
            case 189 :
                // DebianGrammar.g:1:1344: DGREAT
                {
                mDGREAT(); 

                }
                break;
            case 190 :
                // DebianGrammar.g:1:1351: LESSAND
                {
                mLESSAND(); 

                }
                break;
            case 191 :
                // DebianGrammar.g:1:1359: GREATAND
                {
                mGREATAND(); 

                }
                break;
            case 192 :
                // DebianGrammar.g:1:1368: LESSGREAT
                {
                mLESSGREAT(); 

                }
                break;
            case 193 :
                // DebianGrammar.g:1:1378: DLESSDASH
                {
                mDLESSDASH(); 

                }
                break;
            case 194 :
                // DebianGrammar.g:1:1388: CLOBBER
                {
                mCLOBBER(); 

                }
                break;
            case 195 :
                // DebianGrammar.g:1:1396: LESS
                {
                mLESS(); 

                }
                break;
            case 196 :
                // DebianGrammar.g:1:1401: GREAT
                {
                mGREAT(); 

                }
                break;
            case 197 :
                // DebianGrammar.g:1:1407: ANDGREAT
                {
                mANDGREAT(); 

                }
                break;
            case 198 :
                // DebianGrammar.g:1:1416: DSEMI
                {
                mDSEMI(); 

                }
                break;
            case 199 :
                // DebianGrammar.g:1:1422: TILDE
                {
                mTILDE(); 

                }
                break;
            case 200 :
                // DebianGrammar.g:1:1428: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 201 :
                // DebianGrammar.g:1:1436: BLANKLINE
                {
                mBLANKLINE(); 

                }
                break;
            case 202 :
                // DebianGrammar.g:1:1446: NOTNEWLINE
                {
                mNOTNEWLINE(); 

                }
                break;
            case 203 :
                // DebianGrammar.g:1:1457: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA18_eotS =
        "\7\uffff\1\15\1\uffff\1\15\1\uffff\2\15\1\uffff";
    static final String DFA18_eofS =
        "\16\uffff";
    static final String DFA18_minS =
        "\2\11\3\0\2\uffff\5\0\1\12\1\uffff";
    static final String DFA18_maxS =
        "\2\43\3\uffff\2\uffff\1\uffff\1\0\1\uffff\1\0\1\uffff\1\12\1\uffff";
    static final String DFA18_acceptS =
        "\5\uffff\1\3\1\2\6\uffff\1\1";
    static final String DFA18_specialS =
        "\1\5\1\1\1\7\1\0\1\11\2\uffff\1\12\1\4\1\10\1\6\1\3\1\2\1\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\26\uffff\1\1\2\uffff\1\2",
            "\1\1\26\uffff\1\1\2\uffff\1\3",
            "\12\6\1\5\2\6\1\4\23\6\1\uffff\uffde\6",
            "\12\11\1\10\2\11\1\7\23\11\1\uffff\uffde\11",
            "\12\6\1\12\ufff5\6",
            "",
            "",
            "\12\13\1\12\2\13\1\14\24\13\1\6\uffdd\13",
            "\1\uffff",
            "\12\13\1\6\2\13\1\14\24\13\1\6\uffdd\13",
            "\1\uffff",
            "\12\13\1\6\2\13\1\14\24\13\1\6\uffdd\13",
            "\1\6",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "18017:1: COMMENT : ({...}? => ( ' ' | '\\t' )+ SHARP ~ ( EXCL ) (~ ( '\\n' | '\\r' | DQUOTE ) )* ( '\\r' )? | {...}? => ( ' ' | '\\t' )* SHARP ~ ( EXCL | '\\n' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | {...}? => ( ' ' | '\\t' )* SHARP ( '\\r' )? '\\n' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_3=='\r') && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 7;}

                        else if ( (LA18_3=='\n') && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 8;}

                        else if ( ((LA18_3>='\u0000' && LA18_3<='\t')||(LA18_3>='\u000B' && LA18_3<='\f')||(LA18_3>='\u000E' && LA18_3<=' ')||(LA18_3>='\"' && LA18_3<='\uFFFF')) && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 9;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_1=='#') && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 3;}

                        else if ( (LA18_1=='\t'||LA18_1==' ') && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 1;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_12=='\n') && ((getCharPositionInLine()==0))) {s = 6;}

                        else s = 13;

                         
                        input.seek(index18_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_11=='\r') && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 12;}

                        else if ( (LA18_11=='\n'||LA18_11=='\"') && ((getCharPositionInLine()==0))) {s = 6;}

                        else if ( ((LA18_11>='\u0000' && LA18_11<='\t')||(LA18_11>='\u000B' && LA18_11<='\f')||(LA18_11>='\u000E' && LA18_11<='!')||(LA18_11>='#' && LA18_11<='\uFFFF')) && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 11;}

                        else s = 13;

                         
                        input.seek(index18_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((getCharPositionInLine()>0)) ) {s = 13;}

                        else if ( ((getCharPositionInLine()==0)) ) {s = 5;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0=='\t'||LA18_0==' ') && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 1;}

                        else if ( (LA18_0=='#') && ((getCharPositionInLine()==0))) {s = 2;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((getCharPositionInLine()==0)) ) {s = 6;}

                        else if ( ((getCharPositionInLine()==0)) ) {s = 5;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_2=='\r') && ((getCharPositionInLine()==0))) {s = 4;}

                        else if ( (LA18_2=='\n') && ((getCharPositionInLine()==0))) {s = 5;}

                        else if ( ((LA18_2>='\u0000' && LA18_2<='\t')||(LA18_2>='\u000B' && LA18_2<='\f')||(LA18_2>='\u000E' && LA18_2<=' ')||(LA18_2>='\"' && LA18_2<='\uFFFF')) && ((getCharPositionInLine()==0))) {s = 6;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_9>='\u0000' && LA18_9<='\t')||(LA18_9>='\u000B' && LA18_9<='\f')||(LA18_9>='\u000E' && LA18_9<='!')||(LA18_9>='#' && LA18_9<='\uFFFF')) && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 11;}

                        else if ( (LA18_9=='\r') && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 12;}

                        else if ( (LA18_9=='\n'||LA18_9=='\"') && ((getCharPositionInLine()==0))) {s = 6;}

                        else s = 13;

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_4=='\n') && ((getCharPositionInLine()==0))) {s = 10;}

                        else if ( ((LA18_4>='\u0000' && LA18_4<='\t')||(LA18_4>='\u000B' && LA18_4<='\uFFFF')) && ((getCharPositionInLine()==0))) {s = 6;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_7>='\u0000' && LA18_7<='\t')||(LA18_7>='\u000B' && LA18_7<='\f')||(LA18_7>='\u000E' && LA18_7<='!')||(LA18_7>='#' && LA18_7<='\uFFFF')) && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 11;}

                        else if ( (LA18_7=='\r') && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 12;}

                        else if ( (LA18_7=='\n') && ((getCharPositionInLine()==0))) {s = 10;}

                        else if ( (LA18_7=='\"') && ((getCharPositionInLine()==0))) {s = 6;}

                        else s = 13;

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\74\1\101\1\106\2\110\1\115\1\110\1\123\1\127\1\132\1"+
        "\135\1\110\1\143\2\110\1\154\1\177\1\u0081\1\u0085\1\u008c\1\110"+
        "\1\u0093\1\u0094\2\110\1\u009b\1\u009e\1\u00a2\1\110\1\uffff\1\u00a7"+
        "\2\110\1\uffff\1\110\1\u00ae\1\u00b2\1\uffff\1\u00b4\2\uffff\1\u00b5"+
        "\1\u00b8\1\u00ba\1\u00bb\12\uffff\1\u00c0\1\u00c4\1\uffff\1\u00c5"+
        "\1\uffff\1\u00c9\1\u00cc\2\110\1\uffff\1\u00ce\3\110\1\uffff\1\110"+
        "\1\uffff\3\110\2\uffff\2\110\1\u00df\2\110\1\uffff\1\u00e2\2\110"+
        "\1\uffff\1\110\1\u00ea\1\uffff\2\110\1\uffff\4\110\1\u00f1\1\uffff"+
        "\2\110\1\u00f5\5\110\1\uffff\2\u00fd\1\uffff\1\u0100\7\u00fd\3\uffff"+
        "\1\u00fd\1\u010b\1\u00fd\4\uffff\3\110\1\uffff\5\110\1\u0118\1\uffff"+
        "\6\110\2\uffff\3\110\1\u0122\2\110\2\uffff\1\u0125\2\uffff\2\110"+
        "\1\uffff\1\110\1\u0129\2\110\1\uffff\2\110\4\u009f\1\uffff\1\u0132"+
        "\15\uffff\1\u0134\14\uffff\2\110\1\uffff\1\110\1\uffff\1\u009f\1"+
        "\uffff\16\110\1\uffff\2\110\1\uffff\1\u014c\6\110\1\uffff\6\110"+
        "\1\uffff\3\110\1\uffff\3\110\1\u015f\1\110\2\u00fd\1\uffff\2\u00fd"+
        "\1\uffff\12\u00fd\1\uffff\11\110\1\u0177\1\u0178\1\110\1\uffff\2"+
        "\110\1\u017c\1\u017d\1\u017e\1\u017f\3\110\1\uffff\2\110\1\uffff"+
        "\1\110\1\u0186\1\110\1\uffff\4\110\4\u009f\3\uffff\1\u0191\2\110"+
        "\1\u009f\1\u00ce\1\u009f\4\110\1\u0199\7\110\1\u01a1\1\u01a2\1\u01a3"+
        "\1\u01a4\1\110\1\uffff\4\110\1\u01aa\11\110\1\u01b4\2\110\1\u01b8"+
        "\1\uffff\1\110\5\u00fd\1\u01bf\2\u00fd\1\u01c3\4\u00fd\1\u01c8\1"+
        "\u01c9\1\u01ca\1\u01cb\1\110\1\u01cd\3\110\2\uffff\2\110\1\u01d4"+
        "\4\uffff\2\110\1\u01d7\1\110\1\u01d9\1\110\1\uffff\1\110\1\u01dc"+
        "\2\110\1\u01df\4\u009f\1\110\1\uffff\2\110\1\u009f\1\110\1\u01e8"+
        "\1\u01e9\1\110\1\uffff\1\110\1\u01ec\1\u01ed\3\110\1\u01f1\4\uffff"+
        "\1\u01f2\4\110\1\uffff\1\u01f7\1\u01f8\2\110\1\u01fb\1\u01fc\1\u01fd"+
        "\2\110\1\uffff\3\110\1\uffff\1\110\2\u00fd\1\u0206\1\u00fd\1\u0208"+
        "\1\uffff\1\u01bf\1\u00fd\1\u020a\1\uffff\1\u020b\1\u00fd\1\u020d"+
        "\1\u020e\4\uffff\1\u020f\1\uffff\1\110\1\u0211\2\110\1\u0214\1\110"+
        "\1\uffff\2\110\1\uffff\1\110\1\uffff\2\110\1\uffff\1\u021b\1\110"+
        "\1\uffff\4\u009f\4\110\2\uffff\2\110\2\uffff\3\110\2\uffff\1\110"+
        "\1\u0230\2\110\2\uffff\2\110\3\uffff\1\110\1\u0237\1\110\1\u0239"+
        "\2\110\2\u00fd\1\uffff\1\u00fd\1\uffff\1\u00fd\2\uffff\1\u0240\3"+
        "\uffff\1\110\1\uffff\2\110\1\uffff\1\110\1\u0245\2\110\1\u0248\1"+
        "\u0249\1\uffff\1\110\11\u009f\1\u0255\3\110\1\u0259\1\u025a\1\110"+
        "\1\u0263\2\110\1\uffff\1\110\1\u0267\2\110\1\u026a\1\110\1\uffff"+
        "\1\110\1\uffff\2\110\2\u00fd\1\u0271\1\u00fd\1\uffff\4\110\1\uffff"+
        "\1\110\1\u0278\2\uffff\1\110\11\u009f\1\110\1\uffff\3\110\2\uffff"+
        "\10\110\1\uffff\1\110\1\u0292\1\u0293\1\uffff\2\110\1\uffff\3\110"+
        "\1\u0299\1\u029b\1\u00fd\1\uffff\1\u029d\3\110\1\u02a1\1\110\1\uffff"+
        "\1\110\11\u009f\4\110\1\u02b1\12\110\2\uffff\3\110\1\u02bf\1\110"+
        "\1\uffff\1\u00ce\1\uffff\1\u00fd\1\uffff\3\110\1\uffff\1\110\1\u02c7"+
        "\10\u009f\1\u02d1\4\110\1\uffff\11\110\1\u02df\3\110\1\uffff\1\u02e3"+
        "\1\uffff\1\u00fd\3\110\1\u02e9\1\uffff\7\u009f\1\uffff\1\u009f\1"+
        "\uffff\2\110\1\u02f5\4\110\1\u02fa\1\110\1\u02fd\3\110\1\uffff\3"+
        "\110\1\uffff\1\u009f\1\u00fd\3\110\1\uffff\11\u009f\1\u0313\1\u0314"+
        "\1\uffff\4\110\1\uffff\1\u0319\1\110\1\uffff\5\110\1\u0320\1\u009f"+
        "\1\u00fd\1\110\1\u0324\1\110\12\u009f\2\uffff\4\110\1\uffff\5\110"+
        "\1\u033b\1\uffff\1\u009f\1\u033d\1\110\1\uffff\1\110\1\u009f\1\u0342"+
        "\12\u009f\5\110\1\u0352\3\110\1\uffff\1\u009f\1\uffff\1\110\1\u0358"+
        "\1\u009f\1\u0342\1\uffff\2\u009f\1\u035c\7\u009f\5\110\1\uffff\3"+
        "\110\1\u009f\1\110\1\uffff\3\u009f\1\uffff\4\u009f\1\u0375\2\u009f"+
        "\6\110\1\u037e\1\u0380\1\u0381\1\110\7\u009f\1\uffff\2\u009f\3\110"+
        "\1\u0390\2\110\1\uffff\1\110\2\uffff\1\110\11\u009f\3\110\1\u03a1"+
        "\1\uffff\4\110\1\u03a6\1\u009f\1\u03a9\6\u009f\3\110\1\uffff\1\110"+
        "\1\u03b4\1\110\1\u03b6\1\uffff\1\u03a6\1\u03b8\1\uffff\6\u009f\3"+
        "\110\1\u03c2\1\uffff\1\110\1\uffff\1\u03b8\1\uffff\6\u009f\2\110"+
        "\1\u03cc\1\uffff\1\u03cd\5\u009f\1\u03d4\2\110\2\uffff\5\u009f\1"+
        "\u03d4\1\uffff\1\110\1\u03dd\5\u009f\1\u03e3\1\uffff\5\u009f\1\uffff"+
        "\1\u03e9\4\u009f\1\uffff\17\u009f\1\u03fd\1\u009f\1\u03ff\1\u009f"+
        "\1\uffff\1\u009f\1\uffff\27\u009f\1\u041a\2\u009f\1\uffff\3\u009f"+
        "\1\u0420\1\u0421\2\uffff";
    static final String DFA21_eofS =
        "\u0422\uffff";
    static final String DFA21_minS =
        "\1\11\1\0\4\52\1\73\12\52\1\41\11\52\1\56\2\52\1\uffff\3\52\1\uffff"+
        "\1\52\1\44\1\46\1\uffff\1\174\2\uffff\1\0\1\75\1\55\1\12\12\uffff"+
        "\2\46\1\uffff\1\11\1\0\4\52\1\uffff\1\44\3\52\1\uffff\1\52\1\uffff"+
        "\3\52\2\uffff\5\52\1\uffff\3\52\1\uffff\2\52\1\uffff\2\52\1\uffff"+
        "\5\52\1\uffff\10\52\1\uffff\2\53\1\uffff\10\53\3\uffff\3\53\4\uffff"+
        "\3\52\1\uffff\5\52\1\44\1\uffff\6\52\2\uffff\6\52\2\uffff\1\57\2"+
        "\uffff\2\52\1\uffff\4\52\1\uffff\2\52\1\157\1\164\1\163\1\145\1"+
        "\uffff\1\52\15\uffff\1\55\14\uffff\2\52\1\uffff\1\52\1\uffff\1\52"+
        "\1\53\16\52\1\uffff\2\52\1\uffff\7\52\1\uffff\6\52\1\uffff\3\52"+
        "\1\uffff\5\52\2\53\1\uffff\2\53\1\uffff\12\53\1\uffff\14\52\1\uffff"+
        "\11\52\1\uffff\2\52\1\uffff\3\52\1\uffff\4\52\1\157\1\143\1\162"+
        "\1\166\3\uffff\4\52\1\44\1\53\21\52\1\uffff\22\52\1\uffff\1\52\15"+
        "\53\11\52\2\uffff\3\52\4\uffff\6\52\1\uffff\5\52\1\164\3\57\1\52"+
        "\1\uffff\2\52\1\53\4\52\1\uffff\7\52\4\uffff\5\52\1\uffff\11\52"+
        "\1\uffff\3\52\1\uffff\1\52\5\53\1\uffff\3\53\1\uffff\4\53\4\uffff"+
        "\1\52\1\uffff\6\52\1\uffff\2\52\1\uffff\1\52\1\uffff\2\52\1\uffff"+
        "\2\52\1\uffff\1\57\1\147\1\142\1\156\4\52\2\uffff\2\52\2\uffff\3"+
        "\52\2\uffff\4\52\2\uffff\2\52\3\uffff\6\52\2\53\1\uffff\1\53\1\uffff"+
        "\1\53\2\uffff\1\53\3\uffff\1\52\1\uffff\2\52\1\uffff\6\52\1\uffff"+
        "\1\52\1\123\1\156\1\145\1\143\1\165\2\151\1\150\1\165\12\52\1\uffff"+
        "\6\52\1\uffff\1\52\1\uffff\2\52\4\53\1\uffff\4\52\1\uffff\2\52\2"+
        "\uffff\1\52\1\171\1\151\1\156\1\157\1\151\1\156\1\142\1\141\1\154"+
        "\1\52\1\uffff\3\52\2\uffff\10\52\1\uffff\3\52\1\uffff\2\52\1\uffff"+
        "\4\52\2\53\1\uffff\1\53\5\52\1\uffff\1\52\1\163\1\164\1\165\1\156"+
        "\1\144\2\57\1\162\1\154\17\52\2\uffff\5\52\1\uffff\1\44\1\uffff"+
        "\1\53\1\uffff\3\52\1\uffff\2\52\1\164\1\56\1\55\1\146\1\56\1\170"+
        "\1\44\1\145\5\52\1\uffff\15\52\1\uffff\1\52\2\53\4\52\1\uffff\1"+
        "\145\1\144\1\155\1\57\1\143\1\55\1\155\1\53\1\57\1\uffff\15\52\1"+
        "\uffff\3\52\1\uffff\2\53\3\52\1\uffff\1\155\1\57\1\145\1\163\1\157"+
        "\1\167\1\141\1\131\1\144\2\52\1\uffff\4\52\1\uffff\2\52\1\uffff"+
        "\6\52\2\53\3\52\1\56\1\53\1\164\1\143\1\156\1\151\1\143\1\124\1"+
        "\141\1\145\2\uffff\4\52\1\uffff\6\52\1\uffff\2\53\1\52\1\uffff\1"+
        "\52\1\155\1\52\2\150\1\146\1\156\1\163\1\110\1\156\1\155\1\142\1"+
        "\143\11\52\1\uffff\1\53\1\uffff\2\52\1\141\1\52\1\uffff\1\157\1"+
        "\145\1\52\1\144\1\145\1\117\1\57\1\145\1\143\1\55\5\52\1\uffff\3"+
        "\52\1\53\1\52\1\uffff\1\160\1\144\1\155\1\uffff\1\157\1\156\1\116"+
        "\1\155\1\52\1\157\1\142\10\52\1\53\1\52\1\55\1\163\1\141\1\167\1"+
        "\55\1\57\1\141\1\uffff\1\156\1\141\6\52\1\uffff\1\52\2\uffff\1\52"+
        "\1\60\1\57\1\163\1\55\2\143\1\156\1\146\1\163\4\52\1\uffff\5\52"+
        "\1\53\1\52\1\155\2\157\1\61\1\57\1\145\3\52\1\uffff\4\52\1\uffff"+
        "\2\52\1\uffff\1\141\2\155\1\57\1\143\1\57\4\52\1\uffff\1\52\1\uffff"+
        "\1\52\1\uffff\1\156\1\155\1\160\1\170\1\157\1\53\3\52\1\uffff\1"+
        "\52\1\141\1\157\1\151\1\55\1\156\3\52\2\uffff\1\147\1\156\1\154"+
        "\1\167\1\146\1\52\1\uffff\2\52\1\145\1\57\1\145\1\151\1\155\1\52"+
        "\1\uffff\1\162\1\145\1\141\1\156\1\157\1\uffff\1\52\1\155\1\154"+
        "\2\144\1\uffff\1\141\1\154\1\157\1\165\1\143\1\56\1\167\1\154\1"+
        "\163\1\160\1\55\1\145\1\55\1\171\1\155\1\52\1\160\1\52\1\141\1\uffff"+
        "\1\141\1\uffff\1\156\1\143\1\141\1\153\1\147\1\141\1\145\1\147\1"+
        "\162\1\145\1\56\1\55\1\61\1\151\1\56\1\156\1\145\1\147\1\163\1\155"+
        "\1\172\1\164\1\157\1\52\1\141\1\166\1\uffff\1\154\1\145\1\154\2"+
        "\52\2\uffff";
    static final String DFA21_maxS =
        "\1\176\1\0\4\172\1\73\24\172\1\160\2\172\1\uffff\3\172\1\uffff\2"+
        "\172\1\76\1\uffff\1\174\2\uffff\1\uffff\1\75\1\55\1\12\12\uffff"+
        "\1\76\1\174\1\uffff\1\43\1\0\4\172\1\uffff\4\172\1\uffff\1\172\1"+
        "\uffff\3\172\2\uffff\5\172\1\uffff\3\172\1\uffff\2\172\1\uffff\2"+
        "\172\1\uffff\5\172\1\uffff\10\172\1\uffff\2\172\1\uffff\10\172\3"+
        "\uffff\3\172\4\uffff\3\172\1\uffff\6\172\1\uffff\6\172\2\uffff\6"+
        "\172\2\uffff\1\57\2\uffff\2\172\1\uffff\4\172\1\uffff\2\172\1\157"+
        "\1\164\1\163\1\145\1\uffff\1\172\15\uffff\1\55\14\uffff\2\172\1"+
        "\uffff\1\172\1\uffff\20\172\1\uffff\2\172\1\uffff\7\172\1\uffff"+
        "\6\172\1\uffff\3\172\1\uffff\7\172\1\uffff\2\172\1\uffff\12\172"+
        "\1\uffff\14\172\1\uffff\11\172\1\uffff\2\172\1\uffff\3\172\1\uffff"+
        "\4\172\1\157\1\143\1\162\1\166\3\uffff\27\172\1\uffff\22\172\1\uffff"+
        "\27\172\2\uffff\3\172\4\uffff\6\172\1\uffff\5\172\1\164\3\57\1\172"+
        "\1\uffff\7\172\1\uffff\7\172\4\uffff\5\172\1\uffff\11\172\1\uffff"+
        "\3\172\1\uffff\6\172\1\uffff\3\172\1\uffff\4\172\4\uffff\1\172\1"+
        "\uffff\6\172\1\uffff\2\172\1\uffff\1\172\1\uffff\2\172\1\uffff\2"+
        "\172\1\uffff\1\57\2\163\1\156\4\172\2\uffff\2\172\2\uffff\3\172"+
        "\2\uffff\4\172\2\uffff\2\172\3\uffff\10\172\1\uffff\1\172\1\uffff"+
        "\1\172\2\uffff\1\172\3\uffff\1\172\1\uffff\2\172\1\uffff\6\172\1"+
        "\uffff\1\172\1\123\1\156\1\145\1\143\1\165\2\151\1\150\1\165\12"+
        "\172\1\uffff\6\172\1\uffff\1\172\1\uffff\6\172\1\uffff\4\172\1\uffff"+
        "\2\172\2\uffff\1\172\1\171\1\151\1\156\1\157\1\151\1\156\1\142\1"+
        "\141\1\154\1\172\1\uffff\3\172\2\uffff\10\172\1\uffff\3\172\1\uffff"+
        "\2\172\1\uffff\6\172\1\uffff\6\172\1\uffff\1\172\1\163\1\164\1\165"+
        "\1\156\1\144\2\57\1\162\1\154\17\172\2\uffff\5\172\1\uffff\1\172"+
        "\1\uffff\1\172\1\uffff\3\172\1\uffff\2\172\1\164\1\56\1\55\1\146"+
        "\1\56\1\170\2\145\5\172\1\uffff\15\172\1\uffff\7\172\1\uffff\1\145"+
        "\1\144\1\155\1\57\1\143\1\55\1\155\1\172\1\57\1\uffff\15\172\1\uffff"+
        "\3\172\1\uffff\5\172\1\uffff\1\155\1\57\1\145\1\163\1\157\1\167"+
        "\1\141\1\131\1\155\2\172\1\uffff\4\172\1\uffff\2\172\1\uffff\13"+
        "\172\1\56\1\172\1\164\1\143\1\156\1\151\1\143\1\124\1\151\1\157"+
        "\2\uffff\4\172\1\uffff\6\172\1\uffff\3\172\1\uffff\1\172\1\155\1"+
        "\172\2\150\1\146\1\156\1\163\1\110\1\156\1\155\1\142\1\143\11\172"+
        "\1\uffff\1\172\1\uffff\2\172\1\141\1\172\1\uffff\1\157\1\145\1\172"+
        "\1\144\1\145\1\117\1\57\1\145\1\143\1\55\5\172\1\uffff\5\172\1\uffff"+
        "\1\160\1\144\1\155\1\uffff\1\157\1\156\1\116\1\155\1\172\1\157\1"+
        "\142\12\172\1\55\1\163\1\141\1\167\1\55\1\57\1\141\1\uffff\1\156"+
        "\1\141\6\172\1\uffff\1\172\2\uffff\1\172\1\71\1\57\1\163\1\55\2"+
        "\143\1\156\1\146\1\163\4\172\1\uffff\7\172\1\155\2\157\1\61\1\57"+
        "\1\145\3\172\1\uffff\4\172\1\uffff\2\172\1\uffff\1\141\2\155\1\57"+
        "\1\143\1\57\4\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\156\1\155"+
        "\1\160\1\170\1\157\4\172\1\uffff\1\172\1\141\1\157\1\151\1\55\1"+
        "\156\3\172\2\uffff\1\147\1\156\1\154\1\167\1\146\1\172\1\uffff\2"+
        "\172\1\145\1\57\1\145\1\151\1\155\1\172\1\uffff\1\162\1\145\1\141"+
        "\1\156\1\157\1\uffff\1\172\1\155\1\154\2\144\1\uffff\1\141\1\154"+
        "\1\157\1\165\1\143\1\56\1\167\1\154\1\163\1\160\1\55\1\145\1\55"+
        "\1\171\1\155\1\172\1\160\1\172\1\141\1\uffff\1\141\1\uffff\1\156"+
        "\1\143\1\141\1\153\1\147\1\141\1\145\1\147\1\162\1\145\1\56\1\55"+
        "\1\61\1\162\1\56\1\156\1\145\1\147\1\163\1\155\1\172\1\164\1\157"+
        "\1\172\1\141\1\166\1\uffff\1\154\1\145\1\154\2\172\2\uffff";
    static final String DFA21_acceptS =
        "\36\uffff\1\131\3\uffff\1\u0083\3\uffff\1\u00a3\1\uffff\1\u00a5"+
        "\1\u00a6\4\uffff\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
        "\1\u00b5\1\u00b8\1\u00b9\1\u00ba\2\uffff\1\u00c7\6\uffff\1\14\4"+
        "\uffff\1\107\1\uffff\1\u008e\3\uffff\1\u00c6\1\6\5\uffff\1\10\3"+
        "\uffff\1\37\2\uffff\1\16\2\uffff\1\17\5\uffff\1\42\10\uffff\1\27"+
        "\2\uffff\1\56\10\uffff\1\u0085\1\u0086\1\u0087\3\uffff\1\u008c\1"+
        "\105\1\u0088\1\50\3\uffff\1\67\6\uffff\1\122\6\uffff\1\71\1\72\6"+
        "\uffff\1\102\1\104\1\uffff\1\u00b6\1\u00a1\2\uffff\1\110\4\uffff"+
        "\1\133\6\uffff\1\u00aa\1\uffff\1\u00ad\1\u00c5\1\u00a2\1\u00ae\1"+
        "\u00a4\1\u00a7\1\u00c8\1\u00bb\1\u00a8\1\u00ac\1\u00a9\1\u00ab\1"+
        "\u00ca\1\uffff\1\u00be\1\u00c0\1\u00c3\1\u00bd\1\u00bf\1\u00c2\1"+
        "\u00c4\1\u00cb\1\u00c9\1\u00c8\1\1\1\2\2\uffff\1\33\1\uffff\1\u00a0"+
        "\20\uffff\1\141\2\uffff\1\11\7\uffff\1\36\6\uffff\1\u0082\3\uffff"+
        "\1\35\7\uffff\1\u008d\2\uffff\1\100\12\uffff\1\u0084\14\uffff\1"+
        "\u0090\11\uffff\1\176\2\uffff\1\u00b7\3\uffff\1\142\10\uffff\1\u008f"+
        "\1\u00c1\1\u00bc\27\uffff\1\31\22\uffff\1\150\27\uffff\1\130\1\146"+
        "\3\uffff\1\64\1\66\1\103\1\115\6\uffff\1\u0081\12\uffff\1\61\7\uffff"+
        "\1\171\7\uffff\1\137\1\7\1\73\1\173\5\uffff\1\144\11\uffff\1\40"+
        "\3\uffff\1\101\6\uffff\1\u008b\3\uffff\1\153\4\uffff\1\53\1\123"+
        "\1\135\1\172\1\uffff\1\57\6\uffff\1\145\2\uffff\1\175\1\uffff\1"+
        "\160\2\uffff\1\151\2\uffff\1\174\10\uffff\1\63\1\124\2\uffff\1\4"+
        "\1\143\3\uffff\1\170\1\46\4\uffff\1\41\1\111\2\uffff\1\152\1\24"+
        "\1\106\10\uffff\1\62\1\uffff\1\u008a\1\uffff\1\147\1\155\1\uffff"+
        "\1\157\1\u0089\1\54\1\uffff\1\116\2\uffff\1\163\6\uffff\1\154\24"+
        "\uffff\1\12\6\uffff\1\32\1\uffff\1\70\6\uffff\1\156\4\uffff\1\74"+
        "\2\uffff\1\113\1\127\13\uffff\1\126\3\uffff\1\140\1\u0080\10\uffff"+
        "\1\15\3\uffff\1\52\2\uffff\1\25\6\uffff\1\75\6\uffff\1\76\31\uffff"+
        "\1\167\1\22\5\uffff\1\166\1\uffff\1\30\1\uffff\1\77\3\uffff\1\60"+
        "\17\uffff\1\3\15\uffff\1\51\7\uffff\1\134\11\uffff\1\u009f\15\uffff"+
        "\1\23\3\uffff\1\132\5\uffff\1\136\13\uffff\1\55\4\uffff\1\47\2\uffff"+
        "\1\120\25\uffff\1\13\1\45\4\uffff\1\65\6\uffff\1\26\3\uffff\1\121"+
        "\26\uffff\1\21\1\uffff\1\34\4\uffff\1\u0092\17\uffff\1\114\5\uffff"+
        "\1\125\3\uffff\1\u0096\30\uffff\1\u009d\10\uffff\1\165\1\uffff\1"+
        "\162\1\u0094\16\uffff\1\177\20\uffff\1\44\4\uffff\1\u0091\2\uffff"+
        "\1\u0095\12\uffff\1\161\1\uffff\1\112\1\uffff\1\u0093\11\uffff\1"+
        "\117\11\uffff\1\20\1\164\6\uffff\1\u009e\10\uffff\1\5\5\uffff\1"+
        "\43\5\uffff\1\u0097\23\uffff\1\u009c\1\uffff\1\u009a\32\uffff\1"+
        "\u009b\5\uffff\1\u0099\1\u0098";
    static final String DFA21_specialS =
        "\52\uffff\1\2\20\uffff\1\0\1\1\u03e5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\73\1\1\25\uffff\1\73\1\53\1\64\1\52\1\21\1\uffff\1\45\1\66"+
            "\1\60\1\61\1\36\1\43\1\uffff\1\54\1\33\1\44\12\42\1\46\1\6\1"+
            "\70\1\67\1\71\1\51\1\uffff\2\43\1\40\1\31\1\43\1\27\1\43\1\41"+
            "\3\43\1\32\2\43\1\16\1\30\2\43\1\17\3\43\1\37\3\43\1\56\1\55"+
            "\1\57\1\uffff\1\50\1\65\1\26\1\43\1\3\1\20\1\23\1\11\1\14\1"+
            "\43\1\2\2\43\1\25\1\35\1\22\1\34\1\15\1\10\1\12\1\24\1\7\1\5"+
            "\1\43\1\4\1\13\2\43\1\62\1\47\1\63\1\72",
            "\1\uffff",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\75\1\77\6\100"+
            "\1\76\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\105\6\100\1\104\6"+
            "\100\1\103\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\7\100\1\107\22\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\112\1\100"+
            "\1\111\2\100\1\113\7\100",
            "\1\114",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\7\100\1\116\1\121\5"+
            "\100\1\120\2\100\1\117\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\122\5\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\124\5\100"+
            "\1\125\5\100\1\126\5\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\130\7\100\1"+
            "\131\15\100",
            "\2\100\1\uffff\1\134\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\133\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\136\16\100"+
            "\1\137\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\141\2\100"+
            "\1\140\3\100\1\142\1\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\13"+
            "\100\1\144\17\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\2\100"+
            "\1\145\30\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\100\1\153\2\100\1"+
            "\150\2\100\1\147\1\152\5\100\1\146\1\151\12\100",
            "\1\u0080\2\uffff\1\170\5\uffff\1\171\1\175\1\uffff\2\175\1"+
            "\uffff\12\176\5\uffff\1\174\1\172\3\175\1\162\3\175\1\173\6"+
            "\175\1\155\1\161\2\175\1\156\10\175\1\uffff\1\175\1\uffff\1"+
            "\157\1\uffff\3\175\1\164\2\175\1\166\1\175\1\160\2\175\1\163"+
            "\1\167\7\175\1\165\5\175",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0083\10\100"+
            "\1\u0082\6\100\1\u0084\7\100",
            "\2\100\1\uffff\2\100\1\u008b\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0087\1\100"+
            "\1\u0089\6\100\1\u008a\7\100\1\u0086\1\u0088\5\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u008d\4\100"+
            "\1\u008e\21\100",
            "\1\100\1\u008f\1\uffff\1\u0090\1\100\1\102\12\100\5\uffff\1"+
            "\100\1\uffff\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100"+
            "\1\u0092\22\100\1\u0091\3\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\1\u0097"+
            "\21\100\1\u0098\5\100\1\u0095\2\100\1\uffff\1\100\1\uffff\1"+
            "\100\1\uffff\21\100\1\u0096\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\1\u009a"+
            "\7\100\1\u0099\22\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32"+
            "\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u009d\1\u009f\100\uffff\1\u009c",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u00a1\5\100"+
            "\1\u00a0\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u00a3\6\100"+
            "\1\u00a6\3\100\1\u00a5\6\100\1\u00a4\4\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u00a8\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\16"+
            "\100\1\u00a9\14\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u009f\6\uffff\1\u009f\25\uffff\32\u009f\6\uffff\1\u009f"+
            "\1\u00aa\1\u009f\1\u00ad\1\u00ab\12\u009f\1\u00af\4\u009f\1"+
            "\u00ac\5\u009f",
            "\1\u00b0\27\uffff\1\u00b1",
            "",
            "\1\u00b3",
            "",
            "",
            "\41\u00b6\1\uffff\uffde\u00b6",
            "\1\u00b7",
            "\1\u00b9",
            "\1\u00bc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be\25\uffff\1\u00bd\1\uffff\1\u00bf",
            "\1\u00c2\27\uffff\1\u00c1\75\uffff\1\u00c3",
            "",
            "\1\73\1\u00c6\25\uffff\1\73\2\uffff\1\u00c7",
            "\1\uffff",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u00ca\2\100"+
            "\1\u00cb\4\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u00cd\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u00d0\6\uffff\1\u00cf\25\uffff\32\u00cf\6\uffff\32\u00cf",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u00d1\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u00d4\13\100\1\u00d2"+
            "\1\100\1\u00d3\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u00d5\1\u00d6"+
            "\6\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u00d7\21\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u00d8\2\100"+
            "\1\u00d9\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u00da\1\100"+
            "\1\u00db\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u00dc\25\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u00dd\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\u00de\5\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\14\100\1\u00e0\15\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u00e1\21\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u00e3\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u00e4\14\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u00e8\5\100\1\u00e6"+
            "\5\100\1\u00e5\5\100\1\u00e7\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u00e9\26\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u00eb\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\26\100\1\u00ec\3\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u00ed\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u00ee\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u00ef\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u00f0\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\3\100"+
            "\1\u00f2\27\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\7\100"+
            "\1\u00f3\23\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u00f4\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\u00f6\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\17\100\1\u00f7\12\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\12\100\1\u00f8\17\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u00f9\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\u00fa\1\uffff\32\100",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\13\u00fc\1\u00fb\17\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\2\u00fc\1\u00fe\30\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\15\u00fc\1"+
            "\u00ff\14\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\1\u0102\21\u00fc\1\u0103\5\u00fc\1\u0101\2\u00fc\1\uffff\1"+
            "\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\10\u00fc\1\u0104\22\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\10\u00fc\1"+
            "\u0105\21\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\10\u00fc\1"+
            "\u0106\21\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\22\u00fc\1"+
            "\u0107\7\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\21\u00fc\1"+
            "\u0108\10\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\16\u00fc\1"+
            "\u0109\13\u00fc",
            "",
            "",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\16\u00fc\1\u010a\14\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "",
            "",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u010d\11\100"+
            "\1\u010c\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\7\100\1\u010e\22\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u010f\31\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0110\15\100\1\u0111"+
            "\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0112\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0114\6\100"+
            "\1\u0113\12\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0115\17\100"+
            "\1\u0116\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0117\31\100",
            "\1\u00d0\6\uffff\1\u00cf\25\uffff\32\u00cf\6\uffff\32\u00cf",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0119\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u011a\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\27\100\1\u011b\2\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\27\100\1\u011c\2\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\12\100\1\u011d\17\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u011e\26\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\23"+
            "\100\1\u011f\7\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0120\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\23"+
            "\100\1\u0121\7\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\21"+
            "\100\1\u0123\11\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\23"+
            "\100\1\u0124\7\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "\1\u009f",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0126\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0127\26\100",
            "",
            "\2\100\1\uffff\2\100\1\102\5\100\1\u0128\4\100\5\uffff\1\100"+
            "\1\uffff\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u012a\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u012b\26\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u012c\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\14"+
            "\100\1\u012d\16\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0135\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u0136\13\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u0137\13\100",
            "",
            "\2\u0138\1\uffff\2\u0138\1\u0139\12\u0138\5\uffff\1\u0138\1"+
            "\uffff\33\u0138\1\uffff\1\u0138\1\uffff\1\u0138\1\uffff\32\u0138",
            "\1\u013a\1\uffff\2\u013a\20\uffff\1\u013a\1\uffff\33\u013a"+
            "\1\uffff\1\u013a\3\uffff\32\u013a",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u013b\24\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u013c\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\26\100\1\u013d\3\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u013e\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u013f\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0140\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0141\10\100"+
            "\1\u0142\16\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0143\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0144\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0145\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0146\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0147\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0148\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0149\25\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u014a\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u014b\25\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u014d\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u014e\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u014f\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0150\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0151\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0152\21\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u0153\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0154\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0155\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\u0156\5\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u0157\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0158\14\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\u0159\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\4\100"+
            "\1\u015a\26\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u015b\25\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u015c\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\14\100\1\u015d\15\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u015e\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\17\100\1\u0160\12\100",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\3\u00fc\1\u0161\27\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\7\u00fc\1\u0162\23\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\22\u00fc\1"+
            "\u0163\7\u00fc",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\23\u00fc\1\u0164\7\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\23\u00fc\1\u0165\7\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u0166\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\21\u00fc\1\u0167\11\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\15\u00fc\1"+
            "\u0168\14\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\21\u00fc\1"+
            "\u0169\10\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\4\u00fc\1"+
            "\u016a\25\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\16\u00fc\1"+
            "\u016b\13\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\3\u00fc\1"+
            "\u016c\26\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\14\u00fc\1\u016d\16\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u016e\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u016f\24\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u0170\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0171\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0172\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\17\100\1\u0173\12\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u0174\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0175\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0176\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\25\100\1\u0179\4\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u017a\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u017b\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\7\100"+
            "\1\u0180\23\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u0181\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\7\100"+
            "\1\u0182\23\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\13"+
            "\100\1\u0183\17\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\1\u0184"+
            "\32\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0185\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u0187\7\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0188\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0189\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u018a\24\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\4\100"+
            "\1\u018b\26\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0190\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\12\100\1\u0192\17\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0193\10\100",
            "\2\u0138\1\uffff\2\u0138\1\u0139\12\u0138\5\uffff\1\u0138\1"+
            "\uffff\33\u0138\1\uffff\1\u0138\1\uffff\1\u0138\1\uffff\32\u0138",
            "\1\u00d0\6\uffff\1\u00cf\25\uffff\32\u00cf\6\uffff\32\u00cf",
            "\1\u0194\1\uffff\2\u0194\1\u0139\12\u0194\5\uffff\1\u0194\1"+
            "\uffff\33\u0194\1\uffff\1\u0194\1\uffff\1\u0194\1\uffff\32\u0194",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0195\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0196\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0197\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u0198\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u019a\16\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\7\100\1\u019b\22\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u019c\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u019d\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u019e\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u019f\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u01a0\16\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u01a5\6\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u01a6\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\25\100\1\u01a7\4\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u01a8\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u01a9\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u01ab\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u01ac\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u01ad\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u01ae\24\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\17\100\1\u01af\12\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u01b0\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u01b1\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\3\100"+
            "\1\u01b2\27\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\14"+
            "\100\1\u01b3\16\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u01b5\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u01b6\13\100",
            "\2\100\1\uffff\1\u01b7\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\u01b9\5\100",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u01ba\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\4\u00fc\1\u01bb\26\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\23\u00fc\1"+
            "\u01bc\6\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\7\u00fc\1\u01bd\23\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\7\u00fc\1\u01be\23\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u01c0\1\uffff\2\u01c0\1\102\12\u01c0\5\uffff\1\u00fc\1\uffff"+
            "\32\u01c0\1\u00fc\1\uffff\1\u00fc\1\uffff\1\u01c0\1\uffff\32"+
            "\u01c0",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\13\u00fc\1\u01c1\17\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\4\u00fc\1"+
            "\u01c2\25\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\21\u00fc\1"+
            "\u01c4\10\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\24\u00fc\1"+
            "\u01c5\5\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\4\u00fc\1"+
            "\u01c6\25\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\4\u00fc\1\u01c7\26\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u01cc\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u01ce\16\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u01cf\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u01d0\2\100"+
            "\1\u01d1\5\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u01d2\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u01d3\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\16"+
            "\100\1\u01d5\14\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u01d6\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\10"+
            "\100\1\u01d8\22\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u01da\31\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\u01db\5\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u01dd\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u01de\24\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u01e4\16\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u01e5\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u01e6\25\100",
            "\1\u0194\1\uffff\2\u0194\1\u0139\12\u0194\5\uffff\1\u0194\1"+
            "\uffff\33\u0194\1\uffff\1\u0194\1\uffff\1\u0194\1\uffff\32\u0194",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u01e7\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u01ea\25\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u01eb\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u01ee\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u01ef\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u01f0\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u01f3\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u01f4\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u01f5\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u01f6\10\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u01f9\26\100",
            "\2\100\1\uffff\1\u01fa\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\10"+
            "\100\1\u01fe\22\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\1\u01ff"+
            "\32\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0200\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0201\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\20\100\1\u0202\11\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0203\10\100",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\3\u00fc\1\u0204\27\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\14\u00fc\1\u0205\16\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\16\u00fc\1\u0207\14\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "",
            "\1\u01c0\1\uffff\2\u01c0\1\102\12\u01c0\5\uffff\1\u00fc\1\uffff"+
            "\32\u01c0\1\u00fc\1\uffff\1\u00fc\1\uffff\1\u01c0\1\uffff\32"+
            "\u01c0",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\10\u00fc\1\u0209\22\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\17\u00fc\1"+
            "\u020c\12\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "",
            "",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u0210\16\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0212\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0213\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u0215\24\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\15"+
            "\100\1\u0216\15\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0217\10\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\22"+
            "\100\1\u0218\10\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0219\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\14\100\1\u021a\15\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u021c\21\100",
            "",
            "\1\u021d",
            "\1\u0220\1\uffff\1\u021e\3\uffff\1\u021f\5\uffff\1\u0221",
            "\1\u0222\11\uffff\1\u0223\6\uffff\1\u0224",
            "\1\u0225",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u0226\16\100",
            "\2\100\1\uffff\1\u0227\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\1\u0228\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\u0229\5\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u022a\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u022b\23\100",
            "",
            "",
            "\2\100\1\uffff\1\u022c\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u022d\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u022e\7\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u022f\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0231\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0232\6\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u0233\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u0234\7\100",
            "",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\21"+
            "\100\1\u0235\11\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\u0236\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0238\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\u023a\5\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u023b\23\100",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\10\u00fc\1\u023c\22\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\1\u023d\32\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32"+
            "\u00fc",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\15\u00fc\1\u023e\15\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\22\u00fc\1\u023f\10\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\12\100\1\u0241\17\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u0242\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0243\10\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0244\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\25\100\1\u0246\4\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\23"+
            "\100\1\u0247\7\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u024a\16\100",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\2\100\1\uffff\1\u0254\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0256\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u0257\24\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0258\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0261\1\100\1\u0260"+
            "\1\u025b\1\100\1\u0262\1\u025c\1\100\1\u025d\3\100\1\u025f\4"+
            "\100\1\u025e\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0264\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0265\14\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0266\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\26\100\1\u0268\3\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0269\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\5\100"+
            "\1\u026b\25\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u026c\13\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u026d\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u026e\25\100",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\21\u00fc\1\u026f\11\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u0270\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\23\u00fc\1\u0272\7\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0273\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0274\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0275\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u0276\23\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0277\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0279\25\100",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0283\4\100"+
            "\1\u0284\21\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0285\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0286\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0287\25\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0288\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0289\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u028a\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u028b\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u028c\3\100"+
            "\1\u028d\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u028e\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u028f\16\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u0290\13\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0291\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\1\u0294\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\7\100\1\u0295\22\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\10"+
            "\100\1\u0296\22\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0297\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0298\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u00fc\1\uffff\2\u00fc\1\u029a\12\u00fc\5\uffff\1\u00fc\1"+
            "\uffff\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\5\u00fc\1\u029c\25\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u029e\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u029f\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u02a0\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u02a2\14\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u02a3\7\100",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u02ad\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u02ae\14\100",
            "\2\100\1\uffff\1\100\1\u02af\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u02b0\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u02b2\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u02b3\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u02b4\13\100",
            "\2\100\1\uffff\1\100\1\u02b5\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u02b6\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\14\100\1\u02b7\15\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u02b8\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u02b9\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u02ba\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u02bb\10\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\14\100\1\u02bc\15\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u02bd\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\13"+
            "\100\1\u02be\17\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\30\100\1\u02c0\1\100",
            "",
            "\1\u02c1\6\uffff\1\u00cf\25\uffff\32\u00cf\6\uffff\32\u00cf",
            "",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\10\u00fc\1\u02c2\22\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\17\100\1\u02c3\12\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u02c4\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u02c5\21\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u02c6\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02cf\100\uffff\1\u02ce",
            "\1\u02d0",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u02d2\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u02d3\24\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u02d4\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u02d5\16\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\12\100\1\u02d6\17\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u02d7\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u02d8\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u02d9\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\u02da\5\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u02db\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u02dc\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u02dd\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u02de\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u02e0\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\14\100\1\u02e1\15\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\4\100"+
            "\1\u02e2\26\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u013a\1\uffff\2\u013a\20\uffff\1\u013a\1\uffff\22\u013a"+
            "\1\u02e4\10\u013a\1\uffff\1\u013a\3\uffff\32\u013a",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\13\u00fc\1\u02e5\17\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u02e6\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u02e7\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u02e8\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u009f\1\uffff\2\u009f\20\uffff\1\u009f\1\uffff\17\u009f"+
            "\1\u02f1\13\u009f\1\uffff\1\u009f\3\uffff\32\u009f",
            "\1\u02f2",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u02f3\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u02f4\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\1\u02f6\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u02f7\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u02f8\24\100",
            "\2\100\1\uffff\1\u02f9\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u02fb\7\100",
            "\2\100\1\uffff\1\u02fc\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u02fe\16\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u02ff\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u0300\7\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0301\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0302\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\22"+
            "\100\1\u0303\10\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u0194\1\uffff\2\u0194\1\u0139\12\u0194\5\uffff\1\u0194\1"+
            "\uffff\2\u0194\1\u0304\30\u0194\1\uffff\1\u0194\1\uffff\1\u0194"+
            "\1\uffff\32\u0194",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\4\u00fc\1\u0305\26\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0306\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u0307\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0308\6\100",
            "",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0312\10\uffff\1\u0311",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u0315\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u0316\13\100",
            "\2\100\1\uffff\1\u0317\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0318\27\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u031a\26\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u031b\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u031c\14\100",
            "\2\100\1\uffff\1\u031d\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u031e\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u031f\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u0194\1\uffff\2\u0194\1\u0139\12\u0194\5\uffff\1\u0194\1"+
            "\uffff\7\u0194\1\u0321\23\u0194\1\uffff\1\u0194\1\uffff\1\u0194"+
            "\1\uffff\32\u0194",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\22\u00fc\1\u0322\10\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1"+
            "\uffff\32\u00fc",
            "\2\100\1\uffff\1\u0323\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0325\25\100",
            "\1\u0326",
            "\1\u0327\25\uffff\32\u0327\6\uffff\32\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e\7\uffff\1\u032f",
            "\1\u0330\11\uffff\1\u0331",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0332\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\17\100\1\u0333\12\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0334\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0335\31\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0336\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u0337\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0338\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0339\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u033a\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u0194\1\uffff\2\u0194\1\u0139\12\u0194\5\uffff\1\u0194\1"+
            "\uffff\4\u0194\1\u033c\26\u0194\1\uffff\1\u0194\1\uffff\1\u0194"+
            "\1\uffff\32\u0194",
            "\1\u00fc\1\uffff\2\u00fc\1\102\12\u00fc\5\uffff\1\u00fc\1\uffff"+
            "\33\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\32\u00fc",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\u033e\5\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u033f\10\100",
            "\1\u0340",
            "\2\u0341\1\uffff\2\u0341\1\u009f\12\u0341\5\uffff\1\u0341\1"+
            "\uffff\33\u0341\1\uffff\1\u0341\1\uffff\1\u0341\1\uffff\32\u0341",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "\2\100\1\uffff\1\u034d\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\1\u034e\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u034f\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\2\100\1\u0350\27\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0351\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0353\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0354\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0355\25\100",
            "",
            "\1\u0194\1\uffff\2\u0194\1\u0139\12\u0194\5\uffff\1\u0194\1"+
            "\uffff\14\u0194\1\u0356\16\u0194\1\uffff\1\u0194\1\uffff\1\u0194"+
            "\1\uffff\32\u0194",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\17\100\1\u0357\12\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u0359",
            "\2\u0341\1\uffff\2\u0341\1\u009f\12\u0341\5\uffff\1\u0341\1"+
            "\uffff\33\u0341\1\uffff\1\u0341\1\uffff\1\u0341\1\uffff\32\u0341",
            "",
            "\1\u035a",
            "\1\u035b",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u0364\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u0365\26\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\5\100\1\u0366\24\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\7\100\1\u0367\22\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0368\31\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\10\100\1\u0369\21\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u036a\10\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\21\100\1\u036b\10\100",
            "\1\u0194\1\uffff\2\u0194\1\u0139\12\u0194\5\uffff\1\u0194\1"+
            "\uffff\1\u036c\32\u0194\1\uffff\1\u0194\1\uffff\1\u0194\1\uffff"+
            "\32\u0194",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1\u036d\26\100",
            "",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "\1\u0376",
            "\1\u0377",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\16\100\1\u0378\13\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0379\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u037a\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u037b\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\100\1\u037c\30\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\25\100\1\u037d\4\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\1\100\1\u037f\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u0194\1\uffff\2\u0194\1\u0139\12\u0194\5\uffff\1\u0194\1"+
            "\uffff\33\u0194\1\uffff\1\u0194\1\uffff\1\u0194\1\uffff\32\u0194",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0382\31\100",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "",
            "\1\u038a",
            "\1\u038b",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\15\100\1\u038c\14\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u038d\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\24\100\1\u038e\5\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u038f\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0391\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u0392\25\100",
            "",
            "\2\100\1\uffff\2\100\1\102\1\100\1\u0393\10\100\5\uffff\1\100"+
            "\1\uffff\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u0394\6\100",
            "\12\u0395",
            "\1\u0396",
            "\1\u0397",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\1\u039c",
            "\1\u039d",
            "\2\100\1\uffff\1\u039e\1\100\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u039f\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\13\100\1\u03a0\16\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u03a2\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u03a3\7\100",
            "\2\100\1\uffff\1\100\1\u03a4\1\102\12\100\5\uffff\1\100\1\uffff"+
            "\33\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u03a5\25\100",
            "\1\u009f\1\u03a7\1\uffff\2\u03a7\1\u009f\12\u03a7\5\uffff\1"+
            "\u009f\1\uffff\32\u03a7\1\u009f\1\uffff\1\u009f\1\uffff\1\u03a7"+
            "\1\uffff\32\u03a7",
            "\1\u03a8\25\uffff\32\u03a8\6\uffff\32\u03a8",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "\1\u03aa",
            "\1\u03ab",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u03b0\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\100\1\u03b1\30\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u03b2\6\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u03b3\25\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\6\100\1\u03b5\23\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u009f\1\u03a7\1\uffff\2\u03a7\1\u009f\12\u03a7\5\uffff\1"+
            "\u009f\1\uffff\32\u03a7\1\u009f\1\uffff\1\u009f\1\uffff\1\u03a7"+
            "\1\uffff\32\u03a7",
            "\2\u03b7\1\uffff\2\u03b7\1\u009f\12\u03b7\5\uffff\1\u03b7\1"+
            "\uffff\33\u03b7\1\uffff\1\u03b7\1\uffff\1\u03b7\1\uffff\32\u03b7",
            "",
            "\1\u03b9",
            "\1\u03ba",
            "\1\u03bb",
            "\1\u03bc",
            "\1\u03bd",
            "\1\u03be",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\14\100\1\u03bf\15\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u03c0\31\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u03c1\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\31\100\1\u03c3",
            "",
            "\2\u03b7\1\uffff\2\u03b7\1\u009f\12\u03b7\5\uffff\1\u03b7\1"+
            "\uffff\33\u03b7\1\uffff\1\u03b7\1\uffff\1\u03b7\1\uffff\32\u03b7",
            "",
            "\1\u03c4",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c7",
            "\1\u03c8",
            "\1\u03c9\25\uffff\32\u03c9\6\uffff\32\u03c9",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\17\100\1\u03ca\12\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\22\100\1\u03cb\7\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u03ce",
            "\1\u03cf",
            "\1\u03d0",
            "\1\u03d1",
            "\1\u03d2",
            "\2\u03d3\1\uffff\2\u03d3\1\u009f\12\u03d3\5\uffff\1\u03d3\1"+
            "\uffff\33\u03d3\1\uffff\1\u03d3\1\uffff\1\u03d3\1\uffff\32\u03d3",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\23\100\1\u03d5\6\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\4\100\1\u03d6\25\100",
            "",
            "",
            "\1\u03d7",
            "\1\u03d8",
            "\1\u03d9",
            "\1\u03da",
            "\1\u03db",
            "\2\u03d3\1\uffff\2\u03d3\1\u009f\12\u03d3\5\uffff\1\u03d3\1"+
            "\uffff\33\u03d3\1\uffff\1\u03d3\1\uffff\1\u03d3\1\uffff\32\u03d3",
            "",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\30\100\1\u03dc\1\100",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "\1\u03de",
            "\1\u03df",
            "\1\u03e0",
            "\1\u03e1",
            "\1\u03e2",
            "\2\100\1\uffff\2\100\1\102\12\100\5\uffff\1\100\1\uffff\33"+
            "\100\1\uffff\1\100\1\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u03e4",
            "\1\u03e5",
            "\1\u03e6",
            "\1\u03e7",
            "\1\u03e8",
            "",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "\1\u03ea",
            "\1\u03eb",
            "\1\u03ec",
            "\1\u03ed",
            "",
            "\1\u03ee",
            "\1\u03ef",
            "\1\u03f0",
            "\1\u03f1",
            "\1\u03f2",
            "\1\u03f3",
            "\1\u03f4",
            "\1\u03f5",
            "\1\u03f6",
            "\1\u03f7",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "\1\u03fc",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "\1\u03fe",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "\1\u0400",
            "",
            "\1\u0401",
            "",
            "\1\u0402",
            "\1\u0403",
            "\1\u0404",
            "\1\u0405",
            "\1\u0406",
            "\1\u0407",
            "\1\u0408",
            "\1\u0409",
            "\1\u040a",
            "\1\u040b",
            "\1\u040c",
            "\1\u040d",
            "\1\u040e",
            "\1\u040f\10\uffff\1\u0410",
            "\1\u0411",
            "\1\u0412",
            "\1\u0413",
            "\1\u0414",
            "\1\u0415",
            "\1\u0416",
            "\1\u0417",
            "\1\u0418",
            "\1\u0419",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "\1\u041b",
            "\1\u041c",
            "",
            "\1\u041d",
            "\1\u041e",
            "\1\u041f",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "\2\u009f\1\uffff\15\u009f\5\uffff\1\u009f\1\uffff\33\u009f"+
            "\1\uffff\1\u009f\1\uffff\1\u009f\1\uffff\32\u009f",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | NUMBER | VARQMARK | VARDOLLAR | VARSTAR | VARAT | VAREXCL | VARHOME | VARPATH | VARPS | VARINPUT | VAR | ID | PATHP | PATHSS | PATHKVERS | PATHSCRIPT | PATHPACK | PATHOLDSCHEMA | PATHGCONFSCH | PATHSUID | PATHXWINDOW | PATHEMACSINST | PATHEMACSREM | PATHCOMPYTH | PATHXMANAGER | PATHCONFMOD | PATHMIME | PATHDOCID | PATHNULL | PATHREL | PATH | AMPERSAND | COLON | VBAR | UNDERSCORE | QMARK | SHARP | EXCL | MINUS | SLASH | BSLASH | DMINUS | AND | OR | LSBRACK | RSBRACK | LPAR | RPAR | LGRAF | RGRAF | DQUOTE | DOT | DDOT | AP | PSINGLE | EQU | NOTEQU | DLESS | DGREAT | LESSAND | GREATAND | LESSGREAT | DLESSDASH | CLOBBER | LESS | GREAT | ANDGREAT | DSEMI | TILDE | COMMENT | BLANKLINE | NOTNEWLINE | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_59 = input.LA(1);

                         
                        int index21_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_59=='\t'||LA21_59==' ') ) {s = 59;}

                        else if ( (LA21_59=='\n') && ((getCharPositionInLine()==0))) {s = 198;}

                        else if ( (LA21_59=='#') && (((getCharPositionInLine()>0)||(getCharPositionInLine()==0)))) {s = 199;}

                        else s = 197;

                         
                        input.seek(index21_59);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_60 = input.LA(1);

                         
                        int index21_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((getCharPositionInLine()==0)))) ) {s = 200;}

                        else if ( ((getCharPositionInLine()==0)) ) {s = 198;}

                         
                        input.seek(index21_60);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_42 = input.LA(1);

                         
                        int index21_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA21_42>='\u0000' && LA21_42<=' ')||(LA21_42>='\"' && LA21_42<='\uFFFF')) && ((getCharPositionInLine()==0))) {s = 182;}

                        else s = 181;

                         
                        input.seek(index21_42);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}