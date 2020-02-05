// $ANTLR 3.5.2 ulNoActions.g 2020-01-27 23:21:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ulNoActionsLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int CHARCONSTANT=4;
	public static final int COMMENT=5;
	public static final int ELSE=6;
	public static final int FALSE=7;
	public static final int FLOATCONSTANT=8;
	public static final int ID=9;
	public static final int IF=10;
	public static final int INTEGERCONSTANT=11;
	public static final int PRINT=12;
	public static final int PRINTLN=13;
	public static final int RETURN=14;
	public static final int STRINGCONSTANT=15;
	public static final int TRUE=16;
	public static final int WHILE=17;
	public static final int WS=18;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ulNoActionsLexer() {} 
	public ulNoActionsLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ulNoActionsLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "ulNoActions.g"; }

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:2:7: ( '(' )
			// ulNoActions.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:3:7: ( ')' )
			// ulNoActions.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:4:7: ( '*' )
			// ulNoActions.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:5:7: ( '+' )
			// ulNoActions.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:6:7: ( ',' )
			// ulNoActions.g:6:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:7:7: ( '-' )
			// ulNoActions.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:8:7: ( ';' )
			// ulNoActions.g:8:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:9:7: ( '<' )
			// ulNoActions.g:9:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:10:7: ( '=' )
			// ulNoActions.g:10:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:11:7: ( '==' )
			// ulNoActions.g:11:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:12:7: ( '[' )
			// ulNoActions.g:12:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:13:7: ( ']' )
			// ulNoActions.g:13:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:14:7: ( 'boolean' )
			// ulNoActions.g:14:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:15:7: ( 'char' )
			// ulNoActions.g:15:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:16:7: ( 'float' )
			// ulNoActions.g:16:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:17:7: ( 'int' )
			// ulNoActions.g:17:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:18:7: ( 'string' )
			// ulNoActions.g:18:9: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:19:7: ( 'void' )
			// ulNoActions.g:19:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:20:7: ( '{' )
			// ulNoActions.g:20:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:21:7: ( '}' )
			// ulNoActions.g:21:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:189:4: ( 'if' )
			// ulNoActions.g:189:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:190:6: ( 'else' )
			// ulNoActions.g:190:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:191:7: ( 'while' )
			// ulNoActions.g:191:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:192:7: ( 'print' )
			// ulNoActions.g:192:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "PRINTLN"
	public final void mPRINTLN() throws RecognitionException {
		try {
			int _type = PRINTLN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:193:9: ( 'println' )
			// ulNoActions.g:193:11: 'println'
			{
			match("println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTLN"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:194:8: ( 'return' )
			// ulNoActions.g:194:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:195:5: ( 'true' )
			// ulNoActions.g:195:7: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:196:6: ( 'false' )
			// ulNoActions.g:196:8: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "INTEGERCONSTANT"
	public final void mINTEGERCONSTANT() throws RecognitionException {
		try {
			int _type = INTEGERCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:199:17: ( ( '0' .. '9' )+ )
			// ulNoActions.g:199:19: ( '0' .. '9' )+
			{
			// ulNoActions.g:199:19: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ulNoActions.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGERCONSTANT"

	// $ANTLR start "FLOATCONSTANT"
	public final void mFLOATCONSTANT() throws RecognitionException {
		try {
			int _type = FLOATCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:200:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// ulNoActions.g:200:16: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// ulNoActions.g:200:16: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ulNoActions.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match('.'); 
			// ulNoActions.g:200:32: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ulNoActions.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATCONSTANT"

	// $ANTLR start "STRINGCONSTANT"
	public final void mSTRINGCONSTANT() throws RecognitionException {
		try {
			int _type = STRINGCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:202:15: ( '\"' ( (~ ( '\\r' | '\\n' | '\"' ) )* ) '\"' )
			// ulNoActions.g:202:17: '\"' ( (~ ( '\\r' | '\\n' | '\"' ) )* ) '\"'
			{
			match('\"'); 
			// ulNoActions.g:202:21: ( (~ ( '\\r' | '\\n' | '\"' ) )* )
			// ulNoActions.g:202:22: (~ ( '\\r' | '\\n' | '\"' ) )*
			{
			// ulNoActions.g:202:22: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ulNoActions.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGCONSTANT"

	// $ANTLR start "CHARCONSTANT"
	public final void mCHARCONSTANT() throws RecognitionException {
		try {
			int _type = CHARCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:203:13: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '!' | ',' | ':' | '_' | '{' | '}' | ' ' ) '\\'' )
			// ulNoActions.g:203:15: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '!' | ',' | ':' | '_' | '{' | '}' | ' ' ) '\\''
			{
			match('\''); 
			if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||input.LA(1)==','||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= '{')||input.LA(1)=='}' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARCONSTANT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:210:4: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )* )
			// ulNoActions.g:210:6: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// ulNoActions.g:210:33: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ulNoActions.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:219:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
			// ulNoActions.g:219:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
			{
			// ulNoActions.g:219:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ulNoActions.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			 _channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:222:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
			// ulNoActions.g:222:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
			{
			match("//"); 

			// ulNoActions.g:222:16: (~ ( '\\r' | '\\n' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ulNoActions.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// ulNoActions.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | TRUE | FALSE | INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | ID | WS | COMMENT )
		int alt8=35;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// ulNoActions.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// ulNoActions.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// ulNoActions.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// ulNoActions.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// ulNoActions.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// ulNoActions.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// ulNoActions.g:1:46: T__25
				{
				mT__25(); 

				}
				break;
			case 8 :
				// ulNoActions.g:1:52: T__26
				{
				mT__26(); 

				}
				break;
			case 9 :
				// ulNoActions.g:1:58: T__27
				{
				mT__27(); 

				}
				break;
			case 10 :
				// ulNoActions.g:1:64: T__28
				{
				mT__28(); 

				}
				break;
			case 11 :
				// ulNoActions.g:1:70: T__29
				{
				mT__29(); 

				}
				break;
			case 12 :
				// ulNoActions.g:1:76: T__30
				{
				mT__30(); 

				}
				break;
			case 13 :
				// ulNoActions.g:1:82: T__31
				{
				mT__31(); 

				}
				break;
			case 14 :
				// ulNoActions.g:1:88: T__32
				{
				mT__32(); 

				}
				break;
			case 15 :
				// ulNoActions.g:1:94: T__33
				{
				mT__33(); 

				}
				break;
			case 16 :
				// ulNoActions.g:1:100: T__34
				{
				mT__34(); 

				}
				break;
			case 17 :
				// ulNoActions.g:1:106: T__35
				{
				mT__35(); 

				}
				break;
			case 18 :
				// ulNoActions.g:1:112: T__36
				{
				mT__36(); 

				}
				break;
			case 19 :
				// ulNoActions.g:1:118: T__37
				{
				mT__37(); 

				}
				break;
			case 20 :
				// ulNoActions.g:1:124: T__38
				{
				mT__38(); 

				}
				break;
			case 21 :
				// ulNoActions.g:1:130: IF
				{
				mIF(); 

				}
				break;
			case 22 :
				// ulNoActions.g:1:133: ELSE
				{
				mELSE(); 

				}
				break;
			case 23 :
				// ulNoActions.g:1:138: WHILE
				{
				mWHILE(); 

				}
				break;
			case 24 :
				// ulNoActions.g:1:144: PRINT
				{
				mPRINT(); 

				}
				break;
			case 25 :
				// ulNoActions.g:1:150: PRINTLN
				{
				mPRINTLN(); 

				}
				break;
			case 26 :
				// ulNoActions.g:1:158: RETURN
				{
				mRETURN(); 

				}
				break;
			case 27 :
				// ulNoActions.g:1:165: TRUE
				{
				mTRUE(); 

				}
				break;
			case 28 :
				// ulNoActions.g:1:170: FALSE
				{
				mFALSE(); 

				}
				break;
			case 29 :
				// ulNoActions.g:1:176: INTEGERCONSTANT
				{
				mINTEGERCONSTANT(); 

				}
				break;
			case 30 :
				// ulNoActions.g:1:192: FLOATCONSTANT
				{
				mFLOATCONSTANT(); 

				}
				break;
			case 31 :
				// ulNoActions.g:1:206: STRINGCONSTANT
				{
				mSTRINGCONSTANT(); 

				}
				break;
			case 32 :
				// ulNoActions.g:1:221: CHARCONSTANT
				{
				mCHARCONSTANT(); 

				}
				break;
			case 33 :
				// ulNoActions.g:1:234: ID
				{
				mID(); 

				}
				break;
			case 34 :
				// ulNoActions.g:1:237: WS
				{
				mWS(); 

				}
				break;
			case 35 :
				// ulNoActions.g:1:240: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\11\uffff\1\40\2\uffff\6\34\2\uffff\5\34\1\56\7\uffff\5\34\1\65\7\34\2"+
		"\uffff\4\34\1\101\1\uffff\10\34\1\112\2\34\1\uffff\1\34\1\116\1\117\3"+
		"\34\1\123\1\34\1\uffff\1\125\1\126\1\34\2\uffff\1\130\1\132\1\34\1\uffff"+
		"\1\34\2\uffff\1\135\1\uffff\1\34\1\uffff\1\137\1\140\1\uffff\1\141\3\uffff";
	static final String DFA8_eofS =
		"\142\uffff";
	static final String DFA8_minS =
		"\1\11\10\uffff\1\75\2\uffff\1\157\1\150\1\141\1\146\1\164\1\157\2\uffff"+
		"\1\154\1\150\1\162\1\145\1\162\1\56\7\uffff\1\157\1\141\1\157\1\154\1"+
		"\164\1\60\1\162\1\151\1\163\2\151\1\164\1\165\2\uffff\1\154\1\162\1\141"+
		"\1\163\1\60\1\uffff\1\151\1\144\1\145\1\154\1\156\1\165\2\145\1\60\1\164"+
		"\1\145\1\uffff\1\156\2\60\1\145\1\164\1\162\1\60\1\141\1\uffff\2\60\1"+
		"\147\2\uffff\2\60\1\156\1\uffff\1\156\2\uffff\1\60\1\uffff\1\156\1\uffff"+
		"\2\60\1\uffff\1\60\3\uffff";
	static final String DFA8_maxS =
		"\1\175\10\uffff\1\75\2\uffff\1\157\1\150\1\154\1\156\1\164\1\157\2\uffff"+
		"\1\154\1\150\1\162\1\145\1\162\1\71\7\uffff\1\157\1\141\1\157\1\154\1"+
		"\164\1\172\1\162\1\151\1\163\2\151\1\164\1\165\2\uffff\1\154\1\162\1\141"+
		"\1\163\1\172\1\uffff\1\151\1\144\1\145\1\154\1\156\1\165\2\145\1\172\1"+
		"\164\1\145\1\uffff\1\156\2\172\1\145\1\164\1\162\1\172\1\141\1\uffff\2"+
		"\172\1\147\2\uffff\2\172\1\156\1\uffff\1\156\2\uffff\1\172\1\uffff\1\156"+
		"\1\uffff\2\172\1\uffff\1\172\3\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\6\uffff\1"+
		"\23\1\24\6\uffff\1\37\1\40\1\41\1\42\1\43\1\12\1\11\15\uffff\1\35\1\36"+
		"\5\uffff\1\25\13\uffff\1\20\10\uffff\1\16\3\uffff\1\22\1\26\3\uffff\1"+
		"\33\1\uffff\1\17\1\34\1\uffff\1\27\1\uffff\1\30\2\uffff\1\21\1\uffff\1"+
		"\32\1\15\1\31";
	static final String DFA8_specialS =
		"\142\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\32\4\uffff\1\33\1\1\1\2\1"+
			"\3\1\4\1\5\1\6\1\uffff\1\36\12\31\1\uffff\1\7\1\10\1\11\3\uffff\32\34"+
			"\1\12\1\uffff\1\13\1\uffff\1\34\1\uffff\1\34\1\14\1\15\1\34\1\24\1\16"+
			"\2\34\1\17\6\34\1\26\1\34\1\27\1\20\1\30\1\34\1\21\1\25\3\34\1\22\1\uffff"+
			"\1\23",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37",
			"",
			"",
			"\1\41",
			"\1\42",
			"\1\44\12\uffff\1\43",
			"\1\46\7\uffff\1\45",
			"\1\47",
			"\1\50",
			"",
			"",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\57\1\uffff\12\31",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"",
			"",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\113",
			"\1\114",
			"",
			"\1\115",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\120",
			"\1\121",
			"\1\122",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\124",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\127",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\131\16\34",
			"\1\133",
			"",
			"\1\134",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\136",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | TRUE | FALSE | INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | ID | WS | COMMENT );";
		}
	}

}
