package com.company;// $ANTLR 3.5.2 ulNoActions.g 2020-01-21 18:04:58

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class ulNoActionsLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int ACCESSARR=4;
	public static final int ARRAY=5;
	public static final int ASSIGN=6;
	public static final int ASSIGNARR=7;
	public static final int CHARCONSTANT=8;
	public static final int COMMENT=9;
	public static final int ELSE=10;
	public static final int FALSE=11;
	public static final int FLOATCONSTANT=12;
	public static final int FUNC=13;
	public static final int FUNCBODY=14;
	public static final int FUNCCALL=15;
	public static final int FUNCDECL=16;
	public static final int FUNCPARAMS=17;
	public static final int ID=18;
	public static final int IF=19;
	public static final int INTEGERCONSTANT=20;
	public static final int PARAMS=21;
	public static final int PRINT=22;
	public static final int PRINTLN=23;
	public static final int RETURN=24;
	public static final int STRINGCONSTANT=25;
	public static final int TRUE=26;
	public static final int TYPE=27;
	public static final int VARDECL=28;
	public static final int WHILE=29;
	public static final int WS=30;

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

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:14:7: ( '{' )
			// ulNoActions.g:14:9: '{'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:15:7: ( '}' )
			// ulNoActions.g:15:9: '}'
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
	// $ANTLR end "T__44"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:150:4: ( 'if' )
			// ulNoActions.g:150:6: 'if'
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
			// ulNoActions.g:151:6: ( 'else' )
			// ulNoActions.g:151:8: 'else'
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
			// ulNoActions.g:152:7: ( 'while' )
			// ulNoActions.g:152:9: 'while'
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
			// ulNoActions.g:153:7: ( 'print' )
			// ulNoActions.g:153:9: 'print'
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
			// ulNoActions.g:154:9: ( 'println' )
			// ulNoActions.g:154:11: 'println'
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
			// ulNoActions.g:155:8: ( 'return' )
			// ulNoActions.g:155:10: 'return'
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
			// ulNoActions.g:156:5: ( 'true' )
			// ulNoActions.g:156:7: 'true'
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
			// ulNoActions.g:157:6: ( 'false' )
			// ulNoActions.g:157:8: 'false'
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

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ulNoActions.g:159:6: ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' )
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
					// ulNoActions.g:159:8: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// ulNoActions.g:160:11: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// ulNoActions.g:161:11: 'char'
					{
					match("char"); 

					}
					break;
				case 4 :
					// ulNoActions.g:162:11: 'string'
					{
					match("string"); 

					}
					break;
				case 5 :
					// ulNoActions.g:163:11: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 6 :
					// ulNoActions.g:164:11: 'void'
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
			// ulNoActions.g:167:17: ( ( '0' .. '9' )+ )
			// ulNoActions.g:167:19: ( '0' .. '9' )+
			{
			// ulNoActions.g:167:19: ( '0' .. '9' )+
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
			// ulNoActions.g:168:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// ulNoActions.g:168:16: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// ulNoActions.g:168:16: ( '0' .. '9' )+
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

			match('.'); 
			// ulNoActions.g:168:32: ( '0' .. '9' )+
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
			// ulNoActions.g:170:15: ( '\"' ( (~ ( '\\r' | '\\n' | '\"' ) )* ) '\"' )
			// ulNoActions.g:170:17: '\"' ( (~ ( '\\r' | '\\n' | '\"' ) )* ) '\"'
			{
			match('\"'); 
			// ulNoActions.g:170:21: ( (~ ( '\\r' | '\\n' | '\"' ) )* )
			// ulNoActions.g:170:22: (~ ( '\\r' | '\\n' | '\"' ) )*
			{
			// ulNoActions.g:170:22: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
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
			// ulNoActions.g:171:13: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '!' | ',' | ':' | '_' | '{' | '}' | ' ' ) '\\'' )
			// ulNoActions.g:171:15: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '!' | ',' | ':' | '_' | '{' | '}' | ' ' ) '\\''
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
			// ulNoActions.g:178:4: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )* )
			// ulNoActions.g:178:6: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// ulNoActions.g:178:33: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
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
			// ulNoActions.g:187:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
			// ulNoActions.g:187:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
			{
			// ulNoActions.g:187:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
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
			// ulNoActions.g:190:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
			// ulNoActions.g:190:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
			{
			match("//"); 

			// ulNoActions.g:190:16: (~ ( '\\r' | '\\n' ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
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
		// ulNoActions.g:1:8: ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | TRUE | FALSE | TYPE | INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | ID | WS | COMMENT )
		int alt9=30;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// ulNoActions.g:1:10: T__31
				{
				mT__31(); 

				}
				break;
			case 2 :
				// ulNoActions.g:1:16: T__32
				{
				mT__32(); 

				}
				break;
			case 3 :
				// ulNoActions.g:1:22: T__33
				{
				mT__33(); 

				}
				break;
			case 4 :
				// ulNoActions.g:1:28: T__34
				{
				mT__34(); 

				}
				break;
			case 5 :
				// ulNoActions.g:1:34: T__35
				{
				mT__35(); 

				}
				break;
			case 6 :
				// ulNoActions.g:1:40: T__36
				{
				mT__36(); 

				}
				break;
			case 7 :
				// ulNoActions.g:1:46: T__37
				{
				mT__37(); 

				}
				break;
			case 8 :
				// ulNoActions.g:1:52: T__38
				{
				mT__38(); 

				}
				break;
			case 9 :
				// ulNoActions.g:1:58: T__39
				{
				mT__39(); 

				}
				break;
			case 10 :
				// ulNoActions.g:1:64: T__40
				{
				mT__40(); 

				}
				break;
			case 11 :
				// ulNoActions.g:1:70: T__41
				{
				mT__41(); 

				}
				break;
			case 12 :
				// ulNoActions.g:1:76: T__42
				{
				mT__42(); 

				}
				break;
			case 13 :
				// ulNoActions.g:1:82: T__43
				{
				mT__43(); 

				}
				break;
			case 14 :
				// ulNoActions.g:1:88: T__44
				{
				mT__44(); 

				}
				break;
			case 15 :
				// ulNoActions.g:1:94: IF
				{
				mIF(); 

				}
				break;
			case 16 :
				// ulNoActions.g:1:97: ELSE
				{
				mELSE(); 

				}
				break;
			case 17 :
				// ulNoActions.g:1:102: WHILE
				{
				mWHILE(); 

				}
				break;
			case 18 :
				// ulNoActions.g:1:108: PRINT
				{
				mPRINT(); 

				}
				break;
			case 19 :
				// ulNoActions.g:1:114: PRINTLN
				{
				mPRINTLN(); 

				}
				break;
			case 20 :
				// ulNoActions.g:1:122: RETURN
				{
				mRETURN(); 

				}
				break;
			case 21 :
				// ulNoActions.g:1:129: TRUE
				{
				mTRUE(); 

				}
				break;
			case 22 :
				// ulNoActions.g:1:134: FALSE
				{
				mFALSE(); 

				}
				break;
			case 23 :
				// ulNoActions.g:1:140: TYPE
				{
				mTYPE(); 

				}
				break;
			case 24 :
				// ulNoActions.g:1:145: INTEGERCONSTANT
				{
				mINTEGERCONSTANT(); 

				}
				break;
			case 25 :
				// ulNoActions.g:1:161: FLOATCONSTANT
				{
				mFLOATCONSTANT(); 

				}
				break;
			case 26 :
				// ulNoActions.g:1:175: STRINGCONSTANT
				{
				mSTRINGCONSTANT(); 

				}
				break;
			case 27 :
				// ulNoActions.g:1:190: CHARCONSTANT
				{
				mCHARCONSTANT(); 

				}
				break;
			case 28 :
				// ulNoActions.g:1:203: ID
				{
				mID(); 

				}
				break;
			case 29 :
				// ulNoActions.g:1:206: WS
				{
				mWS(); 

				}
				break;
			case 30 :
				// ulNoActions.g:1:209: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\11\uffff\1\40\4\uffff\13\34\1\56\7\uffff\1\60\14\34\3\uffff\1\75\13\34"+
		"\1\uffff\1\111\3\34\1\115\2\34\1\75\2\34\1\75\1\uffff\1\122\1\124\1\34"+
		"\1\uffff\1\126\1\75\2\34\1\uffff\1\34\1\uffff\1\132\1\uffff\1\75\1\34"+
		"\1\134\1\uffff\1\75\1\uffff";
	static final String DFA9_eofS =
		"\135\uffff";
	static final String DFA9_minS =
		"\1\11\10\uffff\1\75\4\uffff\1\146\1\154\1\150\1\162\1\145\1\162\1\141"+
		"\1\150\1\164\2\157\1\56\7\uffff\1\60\1\164\1\163\2\151\1\164\1\165\1\154"+
		"\1\157\1\141\1\162\1\157\1\151\3\uffff\1\60\1\145\1\154\1\156\1\165\1"+
		"\145\1\163\1\141\1\162\1\151\1\154\1\144\1\uffff\1\60\1\145\1\164\1\162"+
		"\1\60\1\145\1\164\1\60\1\156\1\145\1\60\1\uffff\2\60\1\156\1\uffff\2\60"+
		"\1\147\1\141\1\uffff\1\156\1\uffff\1\60\1\uffff\1\60\1\156\1\60\1\uffff"+
		"\1\60\1\uffff";
	static final String DFA9_maxS =
		"\1\175\10\uffff\1\75\4\uffff\1\156\1\154\1\150\1\162\1\145\1\162\1\154"+
		"\1\150\1\164\2\157\1\71\7\uffff\1\172\1\164\1\163\2\151\1\164\1\165\1"+
		"\154\1\157\1\141\1\162\1\157\1\151\3\uffff\1\172\1\145\1\154\1\156\1\165"+
		"\1\145\1\163\1\141\1\162\1\151\1\154\1\144\1\uffff\1\172\1\145\1\164\1"+
		"\162\1\172\1\145\1\164\1\172\1\156\1\145\1\172\1\uffff\2\172\1\156\1\uffff"+
		"\2\172\1\147\1\141\1\uffff\1\156\1\uffff\1\172\1\uffff\1\172\1\156\1\172"+
		"\1\uffff\1\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\16"+
		"\14\uffff\1\32\1\33\1\34\1\35\1\36\1\12\1\11\15\uffff\1\30\1\31\1\17\14"+
		"\uffff\1\27\13\uffff\1\20\3\uffff\1\25\4\uffff\1\21\1\uffff\1\22\1\uffff"+
		"\1\26\3\uffff\1\24\1\uffff\1\23";
	static final String DFA9_specialS =
		"\135\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\32\4\uffff\1\33\1\1\1\2\1"+
			"\3\1\4\1\5\1\6\1\uffff\1\36\12\31\1\uffff\1\7\1\10\1\11\3\uffff\32\34"+
			"\1\12\1\uffff\1\13\1\uffff\1\34\1\uffff\1\34\1\27\1\25\1\34\1\17\1\24"+
			"\2\34\1\16\6\34\1\21\1\34\1\22\1\26\1\23\1\34\1\30\1\20\3\34\1\14\1\uffff"+
			"\1\15",
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
			"",
			"",
			"\1\41\7\uffff\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50\12\uffff\1\51",
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
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\112",
			"\1\113",
			"\1\114",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\116",
			"\1\117",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\120",
			"\1\121",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\123\16\34",
			"\1\125",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\127",
			"\1\130",
			"",
			"\1\131",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\133",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
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
			return "1:1: Tokens : ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | TRUE | FALSE | TYPE | INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | ID | WS | COMMENT );";
		}
	}

}
