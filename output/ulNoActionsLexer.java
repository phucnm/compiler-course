// $ANTLR 3.5.1 /Users/tony/antlrtestings/ulNoActions.g 2020-01-15 23:43:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ulNoActionsLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__18=18;
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
	public static final int CHARCONSTANT=4;
	public static final int COMMENT=5;
	public static final int ELSE=6;
	public static final int FLOATCONSTANT=7;
	public static final int ID=8;
	public static final int IF=9;
	public static final int INTEGERCONSTANT=10;
	public static final int PRINT=11;
	public static final int PRINTLN=12;
	public static final int RETURN=13;
	public static final int STRINGCONSTANT=14;
	public static final int TYPE=15;
	public static final int WHILE=16;
	public static final int WS=17;

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
	@Override public String getGrammarFileName() { return "/Users/tony/antlrtestings/ulNoActions.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:2:7: ( '(' )
			// /Users/tony/antlrtestings/ulNoActions.g:2:9: '('
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:3:7: ( ')' )
			// /Users/tony/antlrtestings/ulNoActions.g:3:9: ')'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:4:7: ( '*' )
			// /Users/tony/antlrtestings/ulNoActions.g:4:9: '*'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:5:7: ( '+' )
			// /Users/tony/antlrtestings/ulNoActions.g:5:9: '+'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:6:7: ( ', ' )
			// /Users/tony/antlrtestings/ulNoActions.g:6:9: ', '
			{
			match(", "); 

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
			// /Users/tony/antlrtestings/ulNoActions.g:7:7: ( ',' )
			// /Users/tony/antlrtestings/ulNoActions.g:7:9: ','
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
			// /Users/tony/antlrtestings/ulNoActions.g:8:7: ( '-' )
			// /Users/tony/antlrtestings/ulNoActions.g:8:9: '-'
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
			// /Users/tony/antlrtestings/ulNoActions.g:9:7: ( ';' )
			// /Users/tony/antlrtestings/ulNoActions.g:9:9: ';'
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
			// /Users/tony/antlrtestings/ulNoActions.g:10:7: ( '<' )
			// /Users/tony/antlrtestings/ulNoActions.g:10:9: '<'
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
			// /Users/tony/antlrtestings/ulNoActions.g:11:7: ( '=' )
			// /Users/tony/antlrtestings/ulNoActions.g:11:9: '='
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
			// /Users/tony/antlrtestings/ulNoActions.g:12:7: ( '==' )
			// /Users/tony/antlrtestings/ulNoActions.g:12:9: '=='
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
			// /Users/tony/antlrtestings/ulNoActions.g:13:7: ( '[' )
			// /Users/tony/antlrtestings/ulNoActions.g:13:9: '['
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
			// /Users/tony/antlrtestings/ulNoActions.g:14:7: ( ']' )
			// /Users/tony/antlrtestings/ulNoActions.g:14:9: ']'
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
			// /Users/tony/antlrtestings/ulNoActions.g:15:7: ( 'false' )
			// /Users/tony/antlrtestings/ulNoActions.g:15:9: 'false'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:16:7: ( 'return;' )
			// /Users/tony/antlrtestings/ulNoActions.g:16:9: 'return;'
			{
			match("return;"); 

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
			// /Users/tony/antlrtestings/ulNoActions.g:17:7: ( 'true' )
			// /Users/tony/antlrtestings/ulNoActions.g:17:9: 'true'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:18:7: ( '{' )
			// /Users/tony/antlrtestings/ulNoActions.g:18:9: '{'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:19:7: ( '}' )
			// /Users/tony/antlrtestings/ulNoActions.g:19:9: '}'
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
	// $ANTLR end "T__35"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:139:4: ( 'if' )
			// /Users/tony/antlrtestings/ulNoActions.g:139:6: 'if'
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
			// /Users/tony/antlrtestings/ulNoActions.g:140:6: ( 'else' )
			// /Users/tony/antlrtestings/ulNoActions.g:140:8: 'else'
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
			// /Users/tony/antlrtestings/ulNoActions.g:141:7: ( 'while' )
			// /Users/tony/antlrtestings/ulNoActions.g:141:9: 'while'
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
			// /Users/tony/antlrtestings/ulNoActions.g:142:7: ( 'print' )
			// /Users/tony/antlrtestings/ulNoActions.g:142:9: 'print'
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
			// /Users/tony/antlrtestings/ulNoActions.g:143:9: ( 'println' )
			// /Users/tony/antlrtestings/ulNoActions.g:143:11: 'println'
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
			// /Users/tony/antlrtestings/ulNoActions.g:144:8: ( 'return' )
			// /Users/tony/antlrtestings/ulNoActions.g:144:10: 'return'
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

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:147:6: ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt1=1;
				}
				break;
			case 'f':
				{
				alt1=2;
				}
				break;
			case 'c':
				{
				alt1=3;
				}
				break;
			case 's':
				{
				alt1=4;
				}
				break;
			case 'b':
				{
				alt1=5;
				}
				break;
			case 'v':
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/tony/antlrtestings/ulNoActions.g:147:8: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// /Users/tony/antlrtestings/ulNoActions.g:148:11: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// /Users/tony/antlrtestings/ulNoActions.g:149:11: 'char'
					{
					match("char"); 

					}
					break;
				case 4 :
					// /Users/tony/antlrtestings/ulNoActions.g:150:11: 'string'
					{
					match("string"); 

					}
					break;
				case 5 :
					// /Users/tony/antlrtestings/ulNoActions.g:151:11: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 6 :
					// /Users/tony/antlrtestings/ulNoActions.g:152:11: 'void'
					{
					match("void"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "INTEGERCONSTANT"
	public final void mINTEGERCONSTANT() throws RecognitionException {
		try {
			int _type = INTEGERCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tony/antlrtestings/ulNoActions.g:155:17: ( ( '0' .. '9' )+ )
			// /Users/tony/antlrtestings/ulNoActions.g:155:19: ( '0' .. '9' )+
			{
			// /Users/tony/antlrtestings/ulNoActions.g:155:19: ( '0' .. '9' )+
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
					// /Users/tony/antlrtestings/ulNoActions.g:
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
			// /Users/tony/antlrtestings/ulNoActions.g:156:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// /Users/tony/antlrtestings/ulNoActions.g:156:16: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// /Users/tony/antlrtestings/ulNoActions.g:156:16: ( '0' .. '9' )+
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
					// /Users/tony/antlrtestings/ulNoActions.g:
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

			match('.'); 
			// /Users/tony/antlrtestings/ulNoActions.g:156:32: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/tony/antlrtestings/ulNoActions.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
			// /Users/tony/antlrtestings/ulNoActions.g:159:15: ( '\"' ( (~ ( '\\r' | '\\n' | '\"' ) )* ) '\"' )
			// /Users/tony/antlrtestings/ulNoActions.g:159:17: '\"' ( (~ ( '\\r' | '\\n' | '\"' ) )* ) '\"'
			{
			match('\"'); 
			// /Users/tony/antlrtestings/ulNoActions.g:159:21: ( (~ ( '\\r' | '\\n' | '\"' ) )* )
			// /Users/tony/antlrtestings/ulNoActions.g:159:22: (~ ( '\\r' | '\\n' | '\"' ) )*
			{
			// /Users/tony/antlrtestings/ulNoActions.g:159:22: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/tony/antlrtestings/ulNoActions.g:
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
					break loop5;
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
			// /Users/tony/antlrtestings/ulNoActions.g:161:13: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '!' | ',' | ':' | '_' | '{' | '}' ) '\\'' )
			// /Users/tony/antlrtestings/ulNoActions.g:161:15: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '!' | ',' | ':' | '_' | '{' | '}' ) '\\''
			{
			match('\''); 
			if ( input.LA(1)=='!'||input.LA(1)==','||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= '{')||input.LA(1)=='}' ) {
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
			// /Users/tony/antlrtestings/ulNoActions.g:168:4: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )* )
			// /Users/tony/antlrtestings/ulNoActions.g:168:6: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/tony/antlrtestings/ulNoActions.g:168:33: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/tony/antlrtestings/ulNoActions.g:
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
					break loop6;
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
			// /Users/tony/antlrtestings/ulNoActions.g:177:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
			// /Users/tony/antlrtestings/ulNoActions.g:177:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
			{
			// /Users/tony/antlrtestings/ulNoActions.g:177:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/tony/antlrtestings/ulNoActions.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
			// /Users/tony/antlrtestings/ulNoActions.g:180:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
			// /Users/tony/antlrtestings/ulNoActions.g:180:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
			{
			match("//"); 

			// /Users/tony/antlrtestings/ulNoActions.g:180:16: (~ ( '\\r' | '\\n' ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/tony/antlrtestings/ulNoActions.g:
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
					break loop8;
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
		// /Users/tony/antlrtestings/ulNoActions.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | TYPE | INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | ID | WS | COMMENT )
		int alt9=32;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:10: T__18
				{
				mT__18(); 

				}
				break;
			case 2 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:16: T__19
				{
				mT__19(); 

				}
				break;
			case 3 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:22: T__20
				{
				mT__20(); 

				}
				break;
			case 4 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:28: T__21
				{
				mT__21(); 

				}
				break;
			case 5 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:34: T__22
				{
				mT__22(); 

				}
				break;
			case 6 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:40: T__23
				{
				mT__23(); 

				}
				break;
			case 7 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:46: T__24
				{
				mT__24(); 

				}
				break;
			case 8 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:52: T__25
				{
				mT__25(); 

				}
				break;
			case 9 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:58: T__26
				{
				mT__26(); 

				}
				break;
			case 10 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:64: T__27
				{
				mT__27(); 

				}
				break;
			case 11 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:70: T__28
				{
				mT__28(); 

				}
				break;
			case 12 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:76: T__29
				{
				mT__29(); 

				}
				break;
			case 13 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:82: T__30
				{
				mT__30(); 

				}
				break;
			case 14 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:88: T__31
				{
				mT__31(); 

				}
				break;
			case 15 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:94: T__32
				{
				mT__32(); 

				}
				break;
			case 16 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:100: T__33
				{
				mT__33(); 

				}
				break;
			case 17 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:106: T__34
				{
				mT__34(); 

				}
				break;
			case 18 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:112: T__35
				{
				mT__35(); 

				}
				break;
			case 19 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:118: IF
				{
				mIF(); 

				}
				break;
			case 20 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:121: ELSE
				{
				mELSE(); 

				}
				break;
			case 21 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:126: WHILE
				{
				mWHILE(); 

				}
				break;
			case 22 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:132: PRINT
				{
				mPRINT(); 

				}
				break;
			case 23 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:138: PRINTLN
				{
				mPRINTLN(); 

				}
				break;
			case 24 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:146: RETURN
				{
				mRETURN(); 

				}
				break;
			case 25 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:153: TYPE
				{
				mTYPE(); 

				}
				break;
			case 26 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:158: INTEGERCONSTANT
				{
				mINTEGERCONSTANT(); 

				}
				break;
			case 27 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:174: FLOATCONSTANT
				{
				mFLOATCONSTANT(); 

				}
				break;
			case 28 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:188: STRINGCONSTANT
				{
				mSTRINGCONSTANT(); 

				}
				break;
			case 29 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:203: CHARCONSTANT
				{
				mCHARCONSTANT(); 

				}
				break;
			case 30 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:216: ID
				{
				mID(); 

				}
				break;
			case 31 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:219: WS
				{
				mWS(); 

				}
				break;
			case 32 :
				// /Users/tony/antlrtestings/ulNoActions.g:1:222: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\5\uffff\1\40\3\uffff\1\42\2\uffff\3\34\2\uffff\10\34\1\60\11\uffff\4"+
		"\34\1\66\10\34\2\uffff\4\34\1\uffff\1\103\12\34\1\116\1\uffff\1\117\2"+
		"\34\1\103\2\34\1\103\1\124\1\103\1\34\2\uffff\1\126\1\130\2\34\1\uffff"+
		"\1\134\1\uffff\1\34\1\uffff\1\103\1\34\2\uffff\1\137\1\103\1\uffff";
	static final String DFA9_eofS =
		"\140\uffff";
	static final String DFA9_minS =
		"\1\11\4\uffff\1\40\3\uffff\1\75\2\uffff\1\141\1\145\1\162\2\uffff\1\146"+
		"\1\154\1\150\1\162\1\150\1\164\2\157\1\56\11\uffff\1\154\1\157\1\164\1"+
		"\165\1\60\1\164\1\163\2\151\1\141\1\162\1\157\1\151\2\uffff\1\163\1\141"+
		"\1\165\1\145\1\uffff\1\60\1\145\1\154\1\156\1\162\1\151\1\154\1\144\1"+
		"\145\1\164\1\162\1\60\1\uffff\1\60\1\145\1\164\1\60\1\156\1\145\3\60\1"+
		"\156\2\uffff\2\60\1\147\1\141\1\uffff\1\60\1\uffff\1\156\1\uffff\1\60"+
		"\1\156\2\uffff\2\60\1\uffff";
	static final String DFA9_maxS =
		"\1\175\4\uffff\1\40\3\uffff\1\75\2\uffff\1\154\1\145\1\162\2\uffff\1\156"+
		"\1\154\1\150\1\162\1\150\1\164\2\157\1\71\11\uffff\1\154\1\157\1\164\1"+
		"\165\1\172\1\164\1\163\2\151\1\141\1\162\1\157\1\151\2\uffff\1\163\1\141"+
		"\1\165\1\145\1\uffff\1\172\1\145\1\154\1\156\1\162\1\151\1\154\1\144\1"+
		"\145\1\164\1\162\1\172\1\uffff\1\172\1\145\1\164\1\172\1\156\1\145\3\172"+
		"\1\156\2\uffff\2\172\1\147\1\141\1\uffff\1\172\1\uffff\1\156\1\uffff\1"+
		"\172\1\156\2\uffff\2\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\11\1\uffff\1\14\1\15\3\uffff"+
		"\1\21\1\22\11\uffff\1\34\1\35\1\36\1\37\1\40\1\5\1\6\1\13\1\12\15\uffff"+
		"\1\32\1\33\4\uffff\1\23\14\uffff\1\31\12\uffff\1\20\1\24\4\uffff\1\16"+
		"\1\uffff\1\25\1\uffff\1\26\2\uffff\1\17\1\30\2\uffff\1\27";
	static final String DFA9_specialS =
		"\140\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\32\4\uffff\1\33\1\1\1\2\1"+
			"\3\1\4\1\5\1\6\1\uffff\1\36\12\31\1\uffff\1\7\1\10\1\11\3\uffff\32\34"+
			"\1\12\1\uffff\1\13\1\uffff\1\34\1\uffff\1\34\1\27\1\25\1\34\1\22\1\14"+
			"\2\34\1\21\6\34\1\24\1\34\1\15\1\26\1\16\1\34\1\30\1\23\3\34\1\17\1\uffff"+
			"\1\20",
			"",
			"",
			"",
			"",
			"\1\37",
			"",
			"",
			"",
			"\1\41",
			"",
			"",
			"\1\43\12\uffff\1\44",
			"\1\45",
			"\1\46",
			"",
			"",
			"\1\47\7\uffff\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\61\1\uffff\12\31",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"",
			"",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\120",
			"\1\121",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\122",
			"\1\123",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\125",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\127\16\34",
			"\1\131",
			"\1\132",
			"",
			"\12\34\1\uffff\1\133\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\135",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\136",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | TYPE | INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | ID | WS | COMMENT );";
		}
	}

}
