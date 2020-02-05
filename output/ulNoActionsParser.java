// $ANTLR 3.5.1 /Users/tony/antlrtestings/ulNoActions.g 2020-01-15 23:43:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class ulNoActionsParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHARCONSTANT", "COMMENT", "ELSE", 
		"FLOATCONSTANT", "ID", "IF", "INTEGERCONSTANT", "PRINT", "PRINTLN", "RETURN", 
		"STRINGCONSTANT", "TYPE", "WHILE", "WS", "'('", "')'", "'*'", "'+'", "', '", 
		"','", "'-'", "';'", "'<'", "'='", "'=='", "'['", "']'", "'false'", "'return;'", 
		"'true'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred3_ulNoActions", "compoundType", "moreFormals", 
		"synpred1_ulNoActions", "varDecl", "expr", "type", "whileStatement", "basicExpr", 
		"exprList", "assignStatement", "functionDecl", "multExpr", "identifier", 
		"functionBody", "ifStatement", "block", "literal", "addExpr", "program", 
		"returnStatement", "statement", "exprMore", "synpred2_ulNoActions", "formalParams", 
		"function", "synpred4_ulNoActions", "synpred5_ulNoActions", "equalExpr", 
		"printStatement", "lessThanExpr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, true, false, false, false, false, 
		    false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public ulNoActionsParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public ulNoActionsParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public ulNoActionsParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return ulNoActionsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/tony/antlrtestings/ulNoActions.g"; }


	protected void mismatch (IntStream input, int ttype, BitSet follow)
	        throws RecognitionException
	{
	        throw new MismatchedTokenException(ttype, input);
	}
	public Object recoverFromMismatchedSet (IntStream input,
	                                      RecognitionException e,
	                                      BitSet follow)
	        throws RecognitionException
	{
	        reportError(e);
	        throw e;
	}



	// $ANTLR start "program"
	// /Users/tony/antlrtestings/ulNoActions.g:39:1: program : ( function )+ EOF ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:39:9: ( ( function )+ EOF )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:39:11: ( function )+ EOF
			{
			dbg.location(39,11);
			// /Users/tony/antlrtestings/ulNoActions.g:39:11: ( function )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==TYPE) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:39:11: function
					{
					dbg.location(39,11);
					pushFollow(FOLLOW_function_in_program26);
					function();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(39,21);
			match(input,EOF,FOLLOW_EOF_in_program29); if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(40, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "function"
	// /Users/tony/antlrtestings/ulNoActions.g:42:1: function : functionDecl functionBody ;
	public final void function() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:42:9: ( functionDecl functionBody )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:42:11: functionDecl functionBody
			{
			dbg.location(42,11);
			pushFollow(FOLLOW_functionDecl_in_function38);
			functionDecl();
			state._fsp--;
			if (state.failed) return;dbg.location(42,24);
			pushFollow(FOLLOW_functionBody_in_function40);
			functionBody();
			state._fsp--;
			if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(43, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function"



	// $ANTLR start "functionDecl"
	// /Users/tony/antlrtestings/ulNoActions.g:45:1: functionDecl : compoundType identifier '(' ( formalParams )* ')' ;
	public final void functionDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:45:13: ( compoundType identifier '(' ( formalParams )* ')' )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:45:15: compoundType identifier '(' ( formalParams )* ')'
			{
			dbg.location(45,15);
			pushFollow(FOLLOW_compoundType_in_functionDecl49);
			compoundType();
			state._fsp--;
			if (state.failed) return;dbg.location(45,28);
			pushFollow(FOLLOW_identifier_in_functionDecl51);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(45,39);
			match(input,18,FOLLOW_18_in_functionDecl53); if (state.failed) return;dbg.location(45,43);
			// /Users/tony/antlrtestings/ulNoActions.g:45:43: ( formalParams )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==TYPE) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:45:43: formalParams
					{
					dbg.location(45,43);
					pushFollow(FOLLOW_formalParams_in_functionDecl55);
					formalParams();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(45,57);
			match(input,19,FOLLOW_19_in_functionDecl58); if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(46, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionDecl"



	// $ANTLR start "formalParams"
	// /Users/tony/antlrtestings/ulNoActions.g:48:1: formalParams : compoundType ID ( moreFormals )* ;
	public final void formalParams() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "formalParams");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:48:14: ( compoundType ID ( moreFormals )* )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:49:9: compoundType ID ( moreFormals )*
			{
			dbg.location(49,9);
			pushFollow(FOLLOW_compoundType_in_formalParams77);
			compoundType();
			state._fsp--;
			if (state.failed) return;dbg.location(49,22);
			match(input,ID,FOLLOW_ID_in_formalParams79); if (state.failed) return;dbg.location(49,25);
			// /Users/tony/antlrtestings/ulNoActions.g:49:25: ( moreFormals )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==22) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:49:25: moreFormals
					{
					dbg.location(49,25);
					pushFollow(FOLLOW_moreFormals_in_formalParams81);
					moreFormals();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(50, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "formalParams");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "formalParams"



	// $ANTLR start "moreFormals"
	// /Users/tony/antlrtestings/ulNoActions.g:52:1: moreFormals : ', ' compoundType ID ;
	public final void moreFormals() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "moreFormals");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:52:12: ( ', ' compoundType ID )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:53:9: ', ' compoundType ID
			{
			dbg.location(53,9);
			match(input,22,FOLLOW_22_in_moreFormals107); if (state.failed) return;dbg.location(53,14);
			pushFollow(FOLLOW_compoundType_in_moreFormals109);
			compoundType();
			state._fsp--;
			if (state.failed) return;dbg.location(53,27);
			match(input,ID,FOLLOW_ID_in_moreFormals111); if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(54, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "moreFormals");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "moreFormals"



	// $ANTLR start "functionBody"
	// /Users/tony/antlrtestings/ulNoActions.g:56:1: functionBody : '{' ( varDecl )* ( statement )* '}' ;
	public final void functionBody() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionBody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:56:13: ( '{' ( varDecl )* ( statement )* '}' )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:56:15: '{' ( varDecl )* ( statement )* '}'
			{
			dbg.location(56,15);
			match(input,34,FOLLOW_34_in_functionBody127); if (state.failed) return;dbg.location(56,19);
			// /Users/tony/antlrtestings/ulNoActions.g:56:19: ( varDecl )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==TYPE) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:56:19: varDecl
					{
					dbg.location(56,19);
					pushFollow(FOLLOW_varDecl_in_functionBody129);
					varDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(56,28);
			// /Users/tony/antlrtestings/ulNoActions.g:56:28: ( statement )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==CHARCONSTANT||(LA5_0 >= FLOATCONSTANT && LA5_0 <= STRINGCONSTANT)||LA5_0==WHILE||(LA5_0 >= 18 && LA5_0 <= 21)||(LA5_0 >= 23 && LA5_0 <= 26)||LA5_0==28||(LA5_0 >= 30 && LA5_0 <= 33)) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:56:28: statement
					{
					dbg.location(56,28);
					pushFollow(FOLLOW_statement_in_functionBody132);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(56,39);
			match(input,35,FOLLOW_35_in_functionBody135); if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(57, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionBody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionBody"



	// $ANTLR start "identifier"
	// /Users/tony/antlrtestings/ulNoActions.g:59:1: identifier : ID ;
	public final void identifier() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "identifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:59:12: ( ID )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:59:14: ID
			{
			dbg.location(59,14);
			match(input,ID,FOLLOW_ID_in_identifier145); if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(60, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "identifier"



	// $ANTLR start "varDecl"
	// /Users/tony/antlrtestings/ulNoActions.g:62:1: varDecl : compoundType identifier ';' ;
	public final void varDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "varDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:62:9: ( compoundType identifier ';' )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:62:11: compoundType identifier ';'
			{
			dbg.location(62,11);
			pushFollow(FOLLOW_compoundType_in_varDecl155);
			compoundType();
			state._fsp--;
			if (state.failed) return;dbg.location(62,24);
			pushFollow(FOLLOW_identifier_in_varDecl157);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(62,35);
			match(input,25,FOLLOW_25_in_varDecl159); if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(63, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "varDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "varDecl"



	// $ANTLR start "compoundType"
	// /Users/tony/antlrtestings/ulNoActions.g:65:1: compoundType : ( type | type '[' INTEGERCONSTANT ']' );
	public final void compoundType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "compoundType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:65:13: ( type | type '[' INTEGERCONSTANT ']' )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==TYPE) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==ID) ) {
					alt6=1;
				}
				else if ( (LA6_1==29) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:65:15: type
					{
					dbg.location(65,15);
					pushFollow(FOLLOW_type_in_compoundType175);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/tony/antlrtestings/ulNoActions.g:66:11: type '[' INTEGERCONSTANT ']'
					{
					dbg.location(66,11);
					pushFollow(FOLLOW_type_in_compoundType187);
					type();
					state._fsp--;
					if (state.failed) return;dbg.location(66,16);
					match(input,29,FOLLOW_29_in_compoundType189); if (state.failed) return;dbg.location(66,20);
					match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_compoundType191); if (state.failed) return;dbg.location(66,36);
					match(input,30,FOLLOW_30_in_compoundType193); if (state.failed) return;
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(67, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compoundType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compoundType"



	// $ANTLR start "type"
	// /Users/tony/antlrtestings/ulNoActions.g:69:1: type : TYPE ;
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:69:5: ( TYPE )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:69:7: TYPE
			{
			dbg.location(69,7);
			match(input,TYPE,FOLLOW_TYPE_in_type209); if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(70, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "statement"
	// /Users/tony/antlrtestings/ulNoActions.g:72:1: statement options {backtrack=true; } : ( ifStatement | whileStatement | printStatement | returnStatement | assignStatement | expr ';' );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:74:2: ( ifStatement | whileStatement | printStatement | returnStatement | assignStatement | expr ';' )
			int alt7=6;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

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
			case 32:
				{
				alt7=4;
				}
				break;
			case ID:
				{
				int LA7_7 = input.LA(2);
				if ( (synpred5_ulNoActions()) ) {
					alt7=5;
				}
				else if ( (true) ) {
					alt7=6;
				}

				}
				break;
			case CHARCONSTANT:
			case FLOATCONSTANT:
			case INTEGERCONSTANT:
			case STRINGCONSTANT:
			case 18:
			case 20:
			case 21:
			case 24:
			case 25:
			case 26:
			case 28:
			case 31:
			case 33:
				{
				alt7=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:74:4: ifStatement
					{
					dbg.location(74,4);
					pushFollow(FOLLOW_ifStatement_in_statement232);
					ifStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/tony/antlrtestings/ulNoActions.g:75:11: whileStatement
					{
					dbg.location(75,11);
					pushFollow(FOLLOW_whileStatement_in_statement244);
					whileStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/tony/antlrtestings/ulNoActions.g:76:11: printStatement
					{
					dbg.location(76,11);
					pushFollow(FOLLOW_printStatement_in_statement256);
					printStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/tony/antlrtestings/ulNoActions.g:77:11: returnStatement
					{
					dbg.location(77,11);
					pushFollow(FOLLOW_returnStatement_in_statement268);
					returnStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/tony/antlrtestings/ulNoActions.g:78:11: assignStatement
					{
					dbg.location(78,11);
					pushFollow(FOLLOW_assignStatement_in_statement281);
					assignStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/tony/antlrtestings/ulNoActions.g:79:11: expr ';'
					{
					dbg.location(79,11);
					pushFollow(FOLLOW_expr_in_statement294);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(79,16);
					match(input,25,FOLLOW_25_in_statement296); if (state.failed) return;
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(80, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "whileStatement"
	// /Users/tony/antlrtestings/ulNoActions.g:82:2: whileStatement : WHILE '(' expr ')' block ;
	public final void whileStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "whileStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 1);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:83:3: ( WHILE '(' expr ')' block )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:83:5: WHILE '(' expr ')' block
			{
			dbg.location(83,5);
			match(input,WHILE,FOLLOW_WHILE_in_whileStatement326); if (state.failed) return;dbg.location(83,11);
			match(input,18,FOLLOW_18_in_whileStatement328); if (state.failed) return;dbg.location(83,15);
			pushFollow(FOLLOW_expr_in_whileStatement330);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(83,20);
			match(input,19,FOLLOW_19_in_whileStatement332); if (state.failed) return;dbg.location(83,24);
			pushFollow(FOLLOW_block_in_whileStatement334);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(84, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "whileStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "printStatement"
	// /Users/tony/antlrtestings/ulNoActions.g:85:1: printStatement : ( PRINT expr ';' | PRINTLN expr ';' );
	public final void printStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "printStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:85:15: ( PRINT expr ';' | PRINTLN expr ';' )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:86:9: PRINT expr ';'
					{
					dbg.location(86,9);
					match(input,PRINT,FOLLOW_PRINT_in_printStatement351); if (state.failed) return;dbg.location(86,15);
					pushFollow(FOLLOW_expr_in_printStatement353);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(86,20);
					match(input,25,FOLLOW_25_in_printStatement355); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/tony/antlrtestings/ulNoActions.g:87:11: PRINTLN expr ';'
					{
					dbg.location(87,11);
					match(input,PRINTLN,FOLLOW_PRINTLN_in_printStatement367); if (state.failed) return;dbg.location(87,19);
					pushFollow(FOLLOW_expr_in_printStatement369);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(87,24);
					match(input,25,FOLLOW_25_in_printStatement371); if (state.failed) return;
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(88, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printStatement"



	// $ANTLR start "assignStatement"
	// /Users/tony/antlrtestings/ulNoActions.g:89:1: assignStatement : ( ID '=' expr ';' | ID '[' expr ']' '=' expr ';' );
	public final void assignStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assignStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:89:16: ( ID '=' expr ';' | ID '[' expr ']' '=' expr ';' )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==27) ) {
					alt9=1;
				}
				else if ( (LA9_1==29) ) {
					alt9=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:90:9: ID '=' expr ';'
					{
					dbg.location(90,9);
					match(input,ID,FOLLOW_ID_in_assignStatement394); if (state.failed) return;dbg.location(90,12);
					match(input,27,FOLLOW_27_in_assignStatement396); if (state.failed) return;dbg.location(90,16);
					pushFollow(FOLLOW_expr_in_assignStatement398);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(90,21);
					match(input,25,FOLLOW_25_in_assignStatement400); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/tony/antlrtestings/ulNoActions.g:91:11: ID '[' expr ']' '=' expr ';'
					{
					dbg.location(91,11);
					match(input,ID,FOLLOW_ID_in_assignStatement412); if (state.failed) return;dbg.location(91,14);
					match(input,29,FOLLOW_29_in_assignStatement414); if (state.failed) return;dbg.location(91,18);
					pushFollow(FOLLOW_expr_in_assignStatement416);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(91,23);
					match(input,30,FOLLOW_30_in_assignStatement418); if (state.failed) return;dbg.location(91,27);
					match(input,27,FOLLOW_27_in_assignStatement420); if (state.failed) return;dbg.location(91,31);
					pushFollow(FOLLOW_expr_in_assignStatement422);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(91,36);
					match(input,25,FOLLOW_25_in_assignStatement424); if (state.failed) return;
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(92, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assignStatement"



	// $ANTLR start "ifStatement"
	// /Users/tony/antlrtestings/ulNoActions.g:93:1: ifStatement : IF '(' expr ')' block ( ELSE block )? ;
	public final void ifStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:93:12: ( IF '(' expr ')' block ( ELSE block )? )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:94:9: IF '(' expr ')' block ( ELSE block )?
			{
			dbg.location(94,9);
			match(input,IF,FOLLOW_IF_in_ifStatement447); if (state.failed) return;dbg.location(94,12);
			match(input,18,FOLLOW_18_in_ifStatement449); if (state.failed) return;dbg.location(94,16);
			pushFollow(FOLLOW_expr_in_ifStatement451);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(94,21);
			match(input,19,FOLLOW_19_in_ifStatement453); if (state.failed) return;dbg.location(94,25);
			pushFollow(FOLLOW_block_in_ifStatement455);
			block();
			state._fsp--;
			if (state.failed) return;dbg.location(94,31);
			// /Users/tony/antlrtestings/ulNoActions.g:94:31: ( ELSE block )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==ELSE) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:94:32: ELSE block
					{
					dbg.location(94,32);
					match(input,ELSE,FOLLOW_ELSE_in_ifStatement458); if (state.failed) return;dbg.location(94,37);
					pushFollow(FOLLOW_block_in_ifStatement460);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(95, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "returnStatement"
	// /Users/tony/antlrtestings/ulNoActions.g:97:1: returnStatement : ( RETURN expr ';' | 'return;' );
	public final void returnStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "returnStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:97:16: ( RETURN expr ';' | 'return;' )
			int alt11=2;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==RETURN) ) {
				alt11=1;
			}
			else if ( (LA11_0==32) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:98:9: RETURN expr ';'
					{
					dbg.location(98,9);
					match(input,RETURN,FOLLOW_RETURN_in_returnStatement486); if (state.failed) return;dbg.location(98,16);
					pushFollow(FOLLOW_expr_in_returnStatement488);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(98,21);
					match(input,25,FOLLOW_25_in_returnStatement490); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/tony/antlrtestings/ulNoActions.g:99:11: 'return;'
					{
					dbg.location(99,11);
					match(input,32,FOLLOW_32_in_returnStatement502); if (state.failed) return;
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(100, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returnStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "returnStatement"



	// $ANTLR start "block"
	// /Users/tony/antlrtestings/ulNoActions.g:102:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:102:7: ( '{' ( statement )* '}' )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:102:9: '{' ( statement )* '}'
			{
			dbg.location(102,9);
			match(input,34,FOLLOW_34_in_block519); if (state.failed) return;dbg.location(102,13);
			// /Users/tony/antlrtestings/ulNoActions.g:102:13: ( statement )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==CHARCONSTANT||(LA12_0 >= FLOATCONSTANT && LA12_0 <= STRINGCONSTANT)||LA12_0==WHILE||(LA12_0 >= 18 && LA12_0 <= 21)||(LA12_0 >= 23 && LA12_0 <= 26)||LA12_0==28||(LA12_0 >= 30 && LA12_0 <= 33)) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:102:13: statement
					{
					dbg.location(102,13);
					pushFollow(FOLLOW_statement_in_block521);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(102,24);
			match(input,35,FOLLOW_35_in_block524); if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(103, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "expr"
	// /Users/tony/antlrtestings/ulNoActions.g:106:1: expr : equalExpr ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:106:6: ( equalExpr )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:106:8: equalExpr
			{
			dbg.location(106,8);
			pushFollow(FOLLOW_equalExpr_in_expr550);
			equalExpr();
			state._fsp--;
			if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(107, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "equalExpr"
	// /Users/tony/antlrtestings/ulNoActions.g:108:1: equalExpr : lessThanExpr ( '==' lessThanExpr )* ;
	public final void equalExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "equalExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:108:11: ( lessThanExpr ( '==' lessThanExpr )* )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:108:13: lessThanExpr ( '==' lessThanExpr )*
			{
			dbg.location(108,13);
			pushFollow(FOLLOW_lessThanExpr_in_equalExpr566);
			lessThanExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(108,26);
			// /Users/tony/antlrtestings/ulNoActions.g:108:26: ( '==' lessThanExpr )*
			try { dbg.enterSubRule(13);

			loop13:
			while (true) {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				int LA13_0 = input.LA(1);
				if ( (LA13_0==28) ) {
					alt13=1;
				}

				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:108:27: '==' lessThanExpr
					{
					dbg.location(108,27);
					match(input,28,FOLLOW_28_in_equalExpr569); if (state.failed) return;dbg.location(108,32);
					pushFollow(FOLLOW_lessThanExpr_in_equalExpr571);
					lessThanExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop13;
				}
			}
			} finally {dbg.exitSubRule(13);}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(109, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "equalExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "equalExpr"



	// $ANTLR start "lessThanExpr"
	// /Users/tony/antlrtestings/ulNoActions.g:110:1: lessThanExpr : addExpr ( '<' addExpr )* ;
	public final void lessThanExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lessThanExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(110, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:110:14: ( addExpr ( '<' addExpr )* )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:110:16: addExpr ( '<' addExpr )*
			{
			dbg.location(110,16);
			pushFollow(FOLLOW_addExpr_in_lessThanExpr589);
			addExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(110,24);
			// /Users/tony/antlrtestings/ulNoActions.g:110:24: ( '<' addExpr )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==26) ) {
					alt14=1;
				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:110:25: '<' addExpr
					{
					dbg.location(110,25);
					match(input,26,FOLLOW_26_in_lessThanExpr592); if (state.failed) return;dbg.location(110,29);
					pushFollow(FOLLOW_addExpr_in_lessThanExpr594);
					addExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(111, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lessThanExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lessThanExpr"



	// $ANTLR start "addExpr"
	// /Users/tony/antlrtestings/ulNoActions.g:112:1: addExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final void addExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "addExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:112:8: ( multExpr ( ( '+' | '-' ) multExpr )* )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:112:10: multExpr ( ( '+' | '-' ) multExpr )*
			{
			dbg.location(112,10);
			pushFollow(FOLLOW_multExpr_in_addExpr611);
			multExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(112,19);
			// /Users/tony/antlrtestings/ulNoActions.g:112:19: ( ( '+' | '-' ) multExpr )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==21||LA15_0==24) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:112:20: ( '+' | '-' ) multExpr
					{
					dbg.location(112,20);
					if ( input.LA(1)==21||input.LA(1)==24 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(112,32);
					pushFollow(FOLLOW_multExpr_in_addExpr622);
					multExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(113, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "addExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "addExpr"



	// $ANTLR start "multExpr"
	// /Users/tony/antlrtestings/ulNoActions.g:114:1: multExpr : basicExpr ( '*' basicExpr )* ;
	public final void multExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(114, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:114:9: ( basicExpr ( '*' basicExpr )* )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:114:11: basicExpr ( '*' basicExpr )*
			{
			dbg.location(114,11);
			pushFollow(FOLLOW_basicExpr_in_multExpr639);
			basicExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(114,21);
			// /Users/tony/antlrtestings/ulNoActions.g:114:21: ( '*' basicExpr )*
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==20) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:114:22: '*' basicExpr
					{
					dbg.location(114,22);
					match(input,20,FOLLOW_20_in_multExpr642); if (state.failed) return;dbg.location(114,26);
					pushFollow(FOLLOW_basicExpr_in_multExpr644);
					basicExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop16;
				}
			}
			} finally {dbg.exitSubRule(16);}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(115, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multExpr"



	// $ANTLR start "basicExpr"
	// /Users/tony/antlrtestings/ulNoActions.g:117:1: basicExpr : (| ID '[' expr ']' | ID '(' exprList ')' | '(' expr ')' | ID | literal );
	public final void basicExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "basicExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:117:11: (| ID '[' expr ']' | ID '(' exprList ')' | '(' expr ')' | ID | literal )
			int alt17=6;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			switch ( input.LA(1) ) {
			case 19:
			case 20:
			case 21:
			case 23:
			case 24:
			case 25:
			case 26:
			case 28:
			case 30:
				{
				alt17=1;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case 29:
					{
					alt17=2;
					}
					break;
				case 18:
					{
					alt17=3;
					}
					break;
				case 19:
				case 20:
				case 21:
				case 23:
				case 24:
				case 25:
				case 26:
				case 28:
				case 30:
					{
					alt17=5;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 18:
				{
				alt17=4;
				}
				break;
			case CHARCONSTANT:
			case FLOATCONSTANT:
			case INTEGERCONSTANT:
			case STRINGCONSTANT:
			case 31:
			case 33:
				{
				alt17=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:118:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/tony/antlrtestings/ulNoActions.g:118:11: ID '[' expr ']'
					{
					dbg.location(118,11);
					match(input,ID,FOLLOW_ID_in_basicExpr673); if (state.failed) return;dbg.location(118,14);
					match(input,29,FOLLOW_29_in_basicExpr675); if (state.failed) return;dbg.location(118,18);
					pushFollow(FOLLOW_expr_in_basicExpr677);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(118,23);
					match(input,30,FOLLOW_30_in_basicExpr679); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/tony/antlrtestings/ulNoActions.g:119:11: ID '(' exprList ')'
					{
					dbg.location(119,11);
					match(input,ID,FOLLOW_ID_in_basicExpr691); if (state.failed) return;dbg.location(119,14);
					match(input,18,FOLLOW_18_in_basicExpr693); if (state.failed) return;dbg.location(119,18);
					pushFollow(FOLLOW_exprList_in_basicExpr695);
					exprList();
					state._fsp--;
					if (state.failed) return;dbg.location(119,27);
					match(input,19,FOLLOW_19_in_basicExpr697); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/tony/antlrtestings/ulNoActions.g:120:11: '(' expr ')'
					{
					dbg.location(120,11);
					match(input,18,FOLLOW_18_in_basicExpr709); if (state.failed) return;dbg.location(120,15);
					pushFollow(FOLLOW_expr_in_basicExpr711);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(120,20);
					match(input,19,FOLLOW_19_in_basicExpr713); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/tony/antlrtestings/ulNoActions.g:121:11: ID
					{
					dbg.location(121,11);
					match(input,ID,FOLLOW_ID_in_basicExpr725); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/tony/antlrtestings/ulNoActions.g:122:11: literal
					{
					dbg.location(122,11);
					pushFollow(FOLLOW_literal_in_basicExpr737);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(123, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "basicExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "basicExpr"



	// $ANTLR start "exprList"
	// /Users/tony/antlrtestings/ulNoActions.g:125:1: exprList : expr ( exprMore )* ;
	public final void exprList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:125:10: ( expr ( exprMore )* )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:125:12: expr ( exprMore )*
			{
			dbg.location(125,12);
			pushFollow(FOLLOW_expr_in_exprList755);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(125,17);
			// /Users/tony/antlrtestings/ulNoActions.g:125:17: ( exprMore )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==23) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tony/antlrtestings/ulNoActions.g:125:17: exprMore
					{
					dbg.location(125,17);
					pushFollow(FOLLOW_exprMore_in_exprList757);
					exprMore();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(125, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprList"



	// $ANTLR start "exprMore"
	// /Users/tony/antlrtestings/ulNoActions.g:126:1: exprMore : ',' expr ;
	public final void exprMore() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprMore");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:126:10: ( ',' expr )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:126:12: ',' expr
			{
			dbg.location(126,12);
			match(input,23,FOLLOW_23_in_exprMore766); if (state.failed) return;dbg.location(126,16);
			pushFollow(FOLLOW_expr_in_exprMore768);
			expr();
			state._fsp--;
			if (state.failed) return;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(126, 20);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprMore");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprMore"



	// $ANTLR start "literal"
	// /Users/tony/antlrtestings/ulNoActions.g:128:1: literal : ( INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | 'true' | 'false' );
	public final void literal() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "literal");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			// /Users/tony/antlrtestings/ulNoActions.g:129:9: ( INTEGERCONSTANT | FLOATCONSTANT | STRINGCONSTANT | CHARCONSTANT | 'true' | 'false' )
			dbg.enterAlt(1);

			// /Users/tony/antlrtestings/ulNoActions.g:
			{
			dbg.location(129,9);
			if ( input.LA(1)==CHARCONSTANT||input.LA(1)==FLOATCONSTANT||input.LA(1)==INTEGERCONSTANT||input.LA(1)==STRINGCONSTANT||input.LA(1)==31||input.LA(1)==33 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}
		catch (Exception ex) {
		        // reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		dbg.location(135, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "literal");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "literal"

	// $ANTLR start synpred5_ulNoActions
	public final void synpred5_ulNoActions_fragment() throws RecognitionException {
		// /Users/tony/antlrtestings/ulNoActions.g:78:11: ( assignStatement )
		dbg.enterAlt(1);

		// /Users/tony/antlrtestings/ulNoActions.g:78:11: assignStatement
		{
		dbg.location(78,11);
		pushFollow(FOLLOW_assignStatement_in_synpred5_ulNoActions281);
		assignStatement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_ulNoActions

	// Delegated rules

	public final boolean synpred5_ulNoActions() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred5_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_function_in_program26 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EOF_in_program29 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDecl_in_function38 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_functionBody_in_function40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_functionDecl49 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_functionDecl51 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_functionDecl53 = new BitSet(new long[]{0x0000000000088000L});
	public static final BitSet FOLLOW_formalParams_in_functionDecl55 = new BitSet(new long[]{0x0000000000088000L});
	public static final BitSet FOLLOW_19_in_functionDecl58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_formalParams77 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_formalParams79 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_moreFormals_in_formalParams81 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_moreFormals107 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_compoundType_in_moreFormals109 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_moreFormals111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_functionBody127 = new BitSet(new long[]{0x0000000B8015FF90L});
	public static final BitSet FOLLOW_varDecl_in_functionBody129 = new BitSet(new long[]{0x0000000B8015FF90L});
	public static final BitSet FOLLOW_statement_in_functionBody132 = new BitSet(new long[]{0x0000000B80157F90L});
	public static final BitSet FOLLOW_35_in_functionBody135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_varDecl155 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_varDecl157 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_varDecl159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType187 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_compoundType189 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_compoundType191 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_compoundType193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStatement_in_statement256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStatement_in_statement268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStatement_in_statement281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement294 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_statement296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement326 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_whileStatement328 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_whileStatement330 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_whileStatement332 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_block_in_whileStatement334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printStatement351 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_printStatement353 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStatement355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTLN_in_printStatement367 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_printStatement369 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStatement371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignStatement394 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_assignStatement396 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_assignStatement398 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_assignStatement400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignStatement412 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assignStatement414 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_assignStatement416 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_assignStatement418 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_assignStatement420 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_assignStatement422 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_assignStatement424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement447 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ifStatement449 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_ifStatement451 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifStatement453 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_block_in_ifStatement455 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ELSE_in_ifStatement458 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_block_in_ifStatement460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStatement486 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_returnStatement488 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_returnStatement490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_returnStatement502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_block519 = new BitSet(new long[]{0x0000000B80157F90L});
	public static final BitSet FOLLOW_statement_in_block521 = new BitSet(new long[]{0x0000000B80157F90L});
	public static final BitSet FOLLOW_35_in_block524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equalExpr_in_expr550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lessThanExpr_in_equalExpr566 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_equalExpr569 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_lessThanExpr_in_equalExpr571 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_addExpr_in_lessThanExpr589 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_lessThanExpr592 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_addExpr_in_lessThanExpr594 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_multExpr_in_addExpr611 = new BitSet(new long[]{0x0000000001200002L});
	public static final BitSet FOLLOW_set_in_addExpr614 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_multExpr_in_addExpr622 = new BitSet(new long[]{0x0000000001200002L});
	public static final BitSet FOLLOW_basicExpr_in_multExpr639 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_multExpr642 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_basicExpr_in_multExpr644 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ID_in_basicExpr673 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_basicExpr675 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_basicExpr677 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_basicExpr679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_basicExpr691 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_basicExpr693 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_exprList_in_basicExpr695 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_basicExpr697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_basicExpr709 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_basicExpr711 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_basicExpr713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_basicExpr725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_basicExpr737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList755 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_exprMore_in_exprList757 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_exprMore766 = new BitSet(new long[]{0x0000000280144590L});
	public static final BitSet FOLLOW_expr_in_exprMore768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStatement_in_synpred5_ulNoActions281 = new BitSet(new long[]{0x0000000000000002L});
}
