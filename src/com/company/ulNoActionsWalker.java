package com.company;// $ANTLR 3.5.2 ulNoActionsWalker.g 2020-01-20 21:28:42

import org.antlr.runtime.*;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

@SuppressWarnings("all")
public class ulNoActionsWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESSARR", "ARRAY", "ASSIGN", 
		"ASSIGNARR", "CHARCONSTANT", "COMMENT", "ELSE", "FALSE", "FLOATCONSTANT", 
		"FUNC", "FUNCBODY", "FUNCCALL", "FUNCDECL", "FUNCPARAMS", "ID", "IF", 
		"INTEGERCONSTANT", "PARAMS", "PRINT", "PRINTLN", "RETURN", "STRINGCONSTANT", 
		"TRUE", "TYPE", "VARDECL", "WHILE", "WS", "'('", "')'", "'*'", "'+'", 
		"', '", "','", "'-'", "';'", "'<'", "'='", "'=='", "'['", "']'", "'{'", 
		"'}'"
	};
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
	public static final int T__45=45;
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ulNoActionsWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ulNoActionsWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ulNoActionsWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "ulNoActionsWalker.g"; }



	// $ANTLR start "program"
	// ulNoActionsWalker.g:7:1: program : ( function )+ ;
	public final void program() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:7:9: ( ( function )+ )
			// ulNoActionsWalker.g:7:11: ( function )+
			{
			// ulNoActionsWalker.g:7:11: ( function )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ulNoActionsWalker.g:7:11: function
					{
					pushFollow(FOLLOW_function_in_program34);
					function();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "function"
	// ulNoActionsWalker.g:10:1: function : ^( FUNC functionDecl functionBody ) ;
	public final void function() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:10:9: ( ^( FUNC functionDecl functionBody ) )
			// ulNoActionsWalker.g:10:11: ^( FUNC functionDecl functionBody )
			{
			match(input,FUNC,FOLLOW_FUNC_in_function45); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_functionDecl_in_function47);
			functionDecl();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_functionBody_in_function49);
			functionBody();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "functionDecl"
	// ulNoActionsWalker.g:13:1: functionDecl : ^( FUNCDECL compoundType identifier ( formalParams )* ) ;
	public final void functionDecl() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:14:9: ( ^( FUNCDECL compoundType identifier ( formalParams )* ) )
			// ulNoActionsWalker.g:14:11: ^( FUNCDECL compoundType identifier ( formalParams )* )
			{
			match(input,FUNCDECL,FOLLOW_FUNCDECL_in_functionDecl69); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_compoundType_in_functionDecl71);
			compoundType();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_functionDecl73);
			identifier();
			state._fsp--;
			if (state.failed) return;
			// ulNoActionsWalker.g:14:46: ( formalParams )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==FUNCPARAMS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ulNoActionsWalker.g:14:46: formalParams
					{
					pushFollow(FOLLOW_formalParams_in_functionDecl75);
					formalParams();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop2;
				}
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionDecl"



	// $ANTLR start "formalParams"
	// ulNoActionsWalker.g:17:1: formalParams : ^( FUNCPARAMS ( varDef )+ ) ;
	public final void formalParams() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:17:14: ( ^( FUNCPARAMS ( varDef )+ ) )
			// ulNoActionsWalker.g:18:9: ^( FUNCPARAMS ( varDef )+ )
			{
			match(input,FUNCPARAMS,FOLLOW_FUNCPARAMS_in_formalParams97); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// ulNoActionsWalker.g:18:22: ( varDef )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==VARDECL) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ulNoActionsWalker.g:18:22: varDef
					{
					pushFollow(FOLLOW_varDef_in_formalParams99);
					varDef();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formalParams"



	// $ANTLR start "moreFormals"
	// ulNoActionsWalker.g:21:1: moreFormals : compoundType ID ;
	public final void moreFormals() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:21:12: ( compoundType ID )
			// ulNoActionsWalker.g:22:9: compoundType ID
			{
			pushFollow(FOLLOW_compoundType_in_moreFormals125);
			compoundType();
			state._fsp--;
			if (state.failed) return;
			match(input,ID,FOLLOW_ID_in_moreFormals127); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "moreFormals"



	// $ANTLR start "functionBody"
	// ulNoActionsWalker.g:25:1: functionBody : ^( FUNCBODY ( varDecl )* ( statement )* ) ;
	public final void functionBody() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:25:13: ( ^( FUNCBODY ( varDecl )* ( statement )* ) )
			// ulNoActionsWalker.g:25:15: ^( FUNCBODY ( varDecl )* ( statement )* )
			{
			match(input,FUNCBODY,FOLLOW_FUNCBODY_in_functionBody144); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// ulNoActionsWalker.g:25:26: ( varDecl )*
				loop4:
				while (true) {
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==VARDECL) ) {
						alt4=1;
					}

					switch (alt4) {
					case 1 :
						// ulNoActionsWalker.g:25:26: varDecl
						{
						pushFollow(FOLLOW_varDecl_in_functionBody146);
						varDecl();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop4;
					}
				}

				// ulNoActionsWalker.g:25:35: ( statement )*
				loop5:
				while (true) {
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ACCESSARR||(LA5_0 >= ASSIGN && LA5_0 <= CHARCONSTANT)||(LA5_0 >= FALSE && LA5_0 <= FLOATCONSTANT)||LA5_0==FUNCCALL||(LA5_0 >= ID && LA5_0 <= INTEGERCONSTANT)||(LA5_0 >= PRINT && LA5_0 <= TRUE)||LA5_0==WHILE||(LA5_0 >= 33 && LA5_0 <= 34)||(LA5_0 >= 39 && LA5_0 <= 41)) ) {
						alt5=1;
					}

					switch (alt5) {
					case 1 :
						// ulNoActionsWalker.g:25:35: statement
						{
						pushFollow(FOLLOW_statement_in_functionBody149);
						statement();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop5;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionBody"



	// $ANTLR start "identifier"
	// ulNoActionsWalker.g:28:1: identifier : ID ;
	public final void identifier() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:28:12: ( ID )
			// ulNoActionsWalker.g:28:14: ID
			{
			match(input,ID,FOLLOW_ID_in_identifier161); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "identifier"



	// $ANTLR start "varDef"
	// ulNoActionsWalker.g:31:1: varDef : ^( VARDECL compoundType identifier ) ;
	public final void varDef() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:31:7: ( ^( VARDECL compoundType identifier ) )
			// ulNoActionsWalker.g:31:9: ^( VARDECL compoundType identifier )
			{
			match(input,VARDECL,FOLLOW_VARDECL_in_varDef171); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_compoundType_in_varDef173);
			compoundType();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_varDef175);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varDef"



	// $ANTLR start "varDecl"
	// ulNoActionsWalker.g:34:1: varDecl : varDef ;
	public final void varDecl() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:34:9: ( varDef )
			// ulNoActionsWalker.g:34:11: varDef
			{
			pushFollow(FOLLOW_varDef_in_varDecl189);
			varDef();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varDecl"



	// $ANTLR start "compoundType"
	// ulNoActionsWalker.g:37:1: compoundType : ( type | ^( ARRAY type INTEGERCONSTANT ) );
	public final void compoundType() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:37:13: ( type | ^( ARRAY type INTEGERCONSTANT ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TYPE) ) {
				alt6=1;
			}
			else if ( (LA6_0==ARRAY) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ulNoActionsWalker.g:37:15: type
					{
					pushFollow(FOLLOW_type_in_compoundType205);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// ulNoActionsWalker.g:38:7: ^( ARRAY type INTEGERCONSTANT )
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_compoundType214); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_type_in_compoundType216);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_compoundType218); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compoundType"



	// $ANTLR start "type"
	// ulNoActionsWalker.g:41:1: type : TYPE ;
	public final void type() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:41:5: ( TYPE )
			// ulNoActionsWalker.g:41:7: TYPE
			{
			match(input,TYPE,FOLLOW_TYPE_in_type231); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "statement"
	// ulNoActionsWalker.g:44:1: statement options {backtrack=true; } : ( ifStatement | whileStatement | printStatement | returnStatement | assignStatement | expr );
	public final void statement() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:46:2: ( ifStatement | whileStatement | printStatement | returnStatement | assignStatement | expr )
			int alt7=6;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt7=1;
				}
				break;
			case WHILE:
				{
				alt7=2;
				}
				break;
			case PRINT:
			case PRINTLN:
				{
				alt7=3;
				}
				break;
			case RETURN:
				{
				alt7=4;
				}
				break;
			case ASSIGN:
			case ASSIGNARR:
				{
				alt7=5;
				}
				break;
			case ACCESSARR:
			case CHARCONSTANT:
			case FALSE:
			case FLOATCONSTANT:
			case FUNCCALL:
			case ID:
			case INTEGERCONSTANT:
			case STRINGCONSTANT:
			case TRUE:
			case 33:
			case 34:
			case 39:
			case 40:
			case 41:
				{
				alt7=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ulNoActionsWalker.g:46:4: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement254);
					ifStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// ulNoActionsWalker.g:47:11: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement266);
					whileStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// ulNoActionsWalker.g:48:11: printStatement
					{
					pushFollow(FOLLOW_printStatement_in_statement278);
					printStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// ulNoActionsWalker.g:49:11: returnStatement
					{
					pushFollow(FOLLOW_returnStatement_in_statement290);
					returnStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// ulNoActionsWalker.g:50:11: assignStatement
					{
					pushFollow(FOLLOW_assignStatement_in_statement303);
					assignStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// ulNoActionsWalker.g:51:11: expr
					{
					pushFollow(FOLLOW_expr_in_statement316);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "whileStatement"
	// ulNoActionsWalker.g:54:1: whileStatement : ^( WHILE block ) ;
	public final void whileStatement() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:55:3: ( ^( WHILE block ) )
			// ulNoActionsWalker.g:55:5: ^( WHILE block )
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStatement344); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_block_in_whileStatement346);
			block();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "printStatement"
	// ulNoActionsWalker.g:57:1: printStatement : ( ^( PRINT expr ) | ^( PRINTLN expr ) );
	public final void printStatement() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:57:15: ( ^( PRINT expr ) | ^( PRINTLN expr ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==PRINT) ) {
				alt8=1;
			}
			else if ( (LA8_0==PRINTLN) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// ulNoActionsWalker.g:58:9: ^( PRINT expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_printStatement365); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_printStatement367);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// ulNoActionsWalker.g:59:11: ^( PRINTLN expr )
					{
					match(input,PRINTLN,FOLLOW_PRINTLN_in_printStatement381); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_printStatement383);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printStatement"



	// $ANTLR start "assignStatement"
	// ulNoActionsWalker.g:61:1: assignStatement : ( ^( ASSIGN ID expr ) | ^( ASSIGNARR ID expr expr ) );
	public final void assignStatement() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:61:16: ( ^( ASSIGN ID expr ) | ^( ASSIGNARR ID expr expr ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ASSIGN) ) {
				alt9=1;
			}
			else if ( (LA9_0==ASSIGNARR) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// ulNoActionsWalker.g:62:9: ^( ASSIGN ID expr )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_assignStatement408); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_assignStatement410); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_assignStatement412);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// ulNoActionsWalker.g:63:11: ^( ASSIGNARR ID expr expr )
					{
					match(input,ASSIGNARR,FOLLOW_ASSIGNARR_in_assignStatement426); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_assignStatement428); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_assignStatement430);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_assignStatement432);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignStatement"



	// $ANTLR start "ifStatement"
	// ulNoActionsWalker.g:65:1: ifStatement : ^( IF expr block block ) ;
	public final void ifStatement() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:65:12: ( ^( IF expr block block ) )
			// ulNoActionsWalker.g:66:9: ^( IF expr block block )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement457); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_ifStatement459);
			expr();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_block_in_ifStatement461);
			block();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_block_in_ifStatement463);
			block();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "returnStatement"
	// ulNoActionsWalker.g:69:1: returnStatement : ^( RETURN ( expr )? ) ;
	public final void returnStatement() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:69:16: ( ^( RETURN ( expr )? ) )
			// ulNoActionsWalker.g:70:9: ^( RETURN ( expr )? )
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnStatement489); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// ulNoActionsWalker.g:70:18: ( expr )?
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==ACCESSARR||LA10_0==CHARCONSTANT||(LA10_0 >= FALSE && LA10_0 <= FLOATCONSTANT)||LA10_0==FUNCCALL||LA10_0==ID||LA10_0==INTEGERCONSTANT||(LA10_0 >= STRINGCONSTANT && LA10_0 <= TRUE)||(LA10_0 >= 33 && LA10_0 <= 34)||(LA10_0 >= 39 && LA10_0 <= 41)) ) {
					alt10=1;
				}
				switch (alt10) {
					case 1 :
						// ulNoActionsWalker.g:70:18: expr
						{
						pushFollow(FOLLOW_expr_in_returnStatement491);
						expr();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "returnStatement"



	// $ANTLR start "block"
	// ulNoActionsWalker.g:74:1: block : statement ;
	public final void block() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:74:7: ( statement )
			// ulNoActionsWalker.g:74:9: statement
			{
			pushFollow(FOLLOW_statement_in_block519);
			statement();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block"



	// $ANTLR start "expr"
	// ulNoActionsWalker.g:77:1: expr : ( ^( '==' expr expr ) | ^( '<' expr expr ) | ^( '+' expr expr ) | ^( '=' expr expr ) | ^( '*' expr expr ) | ^( ACCESSARR ID expr ) | ^( FUNCCALL ID exprList ) | ID | literal );
	public final void expr() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:77:6: ( ^( '==' expr expr ) | ^( '<' expr expr ) | ^( '+' expr expr ) | ^( '=' expr expr ) | ^( '*' expr expr ) | ^( ACCESSARR ID expr ) | ^( FUNCCALL ID exprList ) | ID | literal )
			int alt11=9;
			switch ( input.LA(1) ) {
			case 41:
				{
				alt11=1;
				}
				break;
			case 39:
				{
				alt11=2;
				}
				break;
			case 34:
				{
				alt11=3;
				}
				break;
			case 40:
				{
				alt11=4;
				}
				break;
			case 33:
				{
				alt11=5;
				}
				break;
			case ACCESSARR:
				{
				alt11=6;
				}
				break;
			case FUNCCALL:
				{
				alt11=7;
				}
				break;
			case ID:
				{
				alt11=8;
				}
				break;
			case CHARCONSTANT:
			case FALSE:
			case FLOATCONSTANT:
			case INTEGERCONSTANT:
			case STRINGCONSTANT:
			case TRUE:
				{
				alt11=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// ulNoActionsWalker.g:77:8: ^( '==' expr expr )
					{
					match(input,41,FOLLOW_41_in_expr545); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr547);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr549);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// ulNoActionsWalker.g:78:7: ^( '<' expr expr )
					{
					match(input,39,FOLLOW_39_in_expr559); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr561);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr563);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 3 :
					// ulNoActionsWalker.g:79:7: ^( '+' expr expr )
					{
					match(input,34,FOLLOW_34_in_expr573); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr575);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr577);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 4 :
					// ulNoActionsWalker.g:80:7: ^( '=' expr expr )
					{
					match(input,40,FOLLOW_40_in_expr587); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr589);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr591);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 5 :
					// ulNoActionsWalker.g:81:7: ^( '*' expr expr )
					{
					match(input,33,FOLLOW_33_in_expr601); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr603);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr605);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 6 :
					// ulNoActionsWalker.g:82:7: ^( ACCESSARR ID expr )
					{
					match(input,ACCESSARR,FOLLOW_ACCESSARR_in_expr615); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_expr617); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr619);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 7 :
					// ulNoActionsWalker.g:83:7: ^( FUNCCALL ID exprList )
					{
					match(input,FUNCCALL,FOLLOW_FUNCCALL_in_expr629); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_expr631); if (state.failed) return;
					pushFollow(FOLLOW_exprList_in_expr633);
					exprList();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 8 :
					// ulNoActionsWalker.g:84:7: ID
					{
					match(input,ID,FOLLOW_ID_in_expr642); if (state.failed) return;
					}
					break;
				case 9 :
					// ulNoActionsWalker.g:85:7: literal
					{
					pushFollow(FOLLOW_literal_in_expr650);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "exprList"
	// ulNoActionsWalker.g:88:1: exprList : ^( PARAMS ( expr )+ ) ;
	public final void exprList() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:88:10: ( ^( PARAMS ( expr )+ ) )
			// ulNoActionsWalker.g:88:12: ^( PARAMS ( expr )+ )
			{
			match(input,PARAMS,FOLLOW_PARAMS_in_exprList664); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// ulNoActionsWalker.g:88:21: ( expr )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ACCESSARR||LA12_0==CHARCONSTANT||(LA12_0 >= FALSE && LA12_0 <= FLOATCONSTANT)||LA12_0==FUNCCALL||LA12_0==ID||LA12_0==INTEGERCONSTANT||(LA12_0 >= STRINGCONSTANT && LA12_0 <= TRUE)||(LA12_0 >= 33 && LA12_0 <= 34)||(LA12_0 >= 39 && LA12_0 <= 41)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ulNoActionsWalker.g:88:21: expr
					{
					pushFollow(FOLLOW_expr_in_exprList666);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exprList"



	// $ANTLR start "literal"
	// ulNoActionsWalker.g:91:1: literal : ( INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | FALSE | TRUE );
	public final void literal() throws RecognitionException {
		try {
			// ulNoActionsWalker.g:92:9: ( INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | FALSE | TRUE )
			// ulNoActionsWalker.g:
			{
			if ( input.LA(1)==CHARCONSTANT||(input.LA(1) >= FALSE && input.LA(1) <= FLOATCONSTANT)||input.LA(1)==INTEGERCONSTANT||(input.LA(1) >= STRINGCONSTANT && input.LA(1) <= TRUE) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "literal"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program34 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNC_in_function45 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionDecl_in_function47 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_functionBody_in_function49 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCDECL_in_functionDecl69 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_compoundType_in_functionDecl71 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_functionDecl73 = new BitSet(new long[]{0x0000000000020008L});
	public static final BitSet FOLLOW_formalParams_in_functionDecl75 = new BitSet(new long[]{0x0000000000020008L});
	public static final BitSet FOLLOW_FUNCPARAMS_in_formalParams97 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varDef_in_formalParams99 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_compoundType_in_moreFormals125 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_moreFormals127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCBODY_in_functionBody144 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varDecl_in_functionBody146 = new BitSet(new long[]{0x0000038637DC99D8L});
	public static final BitSet FOLLOW_statement_in_functionBody149 = new BitSet(new long[]{0x0000038627DC99D8L});
	public static final BitSet FOLLOW_ID_in_identifier161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARDECL_in_varDef171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_compoundType_in_varDef173 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_varDef175 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_varDef_in_varDecl189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_compoundType214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_compoundType216 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_compoundType218 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_type231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStatement_in_statement278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStatement_in_statement290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStatement_in_statement303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement344 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_whileStatement346 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_printStatement365 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_printStatement367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINTLN_in_printStatement381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_printStatement383 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignStatement408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignStatement410 = new BitSet(new long[]{0x0000038606149910L});
	public static final BitSet FOLLOW_expr_in_assignStatement412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGNARR_in_assignStatement426 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignStatement428 = new BitSet(new long[]{0x0000038606149910L});
	public static final BitSet FOLLOW_expr_in_assignStatement430 = new BitSet(new long[]{0x0000038606149910L});
	public static final BitSet FOLLOW_expr_in_assignStatement432 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement457 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_ifStatement459 = new BitSet(new long[]{0x0000038627DC99D0L});
	public static final BitSet FOLLOW_block_in_ifStatement461 = new BitSet(new long[]{0x0000038627DC99D0L});
	public static final BitSet FOLLOW_block_in_ifStatement463 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_in_returnStatement489 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_returnStatement491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statement_in_block519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_expr545 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr547 = new BitSet(new long[]{0x0000038606149910L});
	public static final BitSet FOLLOW_expr_in_expr549 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_39_in_expr559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr561 = new BitSet(new long[]{0x0000038606149910L});
	public static final BitSet FOLLOW_expr_in_expr563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_34_in_expr573 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr575 = new BitSet(new long[]{0x0000038606149910L});
	public static final BitSet FOLLOW_expr_in_expr577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_40_in_expr587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr589 = new BitSet(new long[]{0x0000038606149910L});
	public static final BitSet FOLLOW_expr_in_expr591 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_33_in_expr601 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr603 = new BitSet(new long[]{0x0000038606149910L});
	public static final BitSet FOLLOW_expr_in_expr605 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACCESSARR_in_expr615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr617 = new BitSet(new long[]{0x0000038606149910L});
	public static final BitSet FOLLOW_expr_in_expr619 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCCALL_in_expr629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr631 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_exprList_in_expr633 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_expr642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_expr650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMS_in_exprList664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_exprList666 = new BitSet(new long[]{0x0000038606149918L});
}
