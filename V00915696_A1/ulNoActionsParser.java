// $ANTLR 3.5.2 ulNoActions.g 2020-01-27 23:21:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class ulNoActionsParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHARCONSTANT", "COMMENT", "ELSE", 
		"FALSE", "FLOATCONSTANT", "ID", "IF", "INTEGERCONSTANT", "PRINT", "PRINTLN", 
		"RETURN", "STRINGCONSTANT", "TRUE", "WHILE", "WS", "'('", "')'", "'*'", 
		"'+'", "','", "'-'", "';'", "'<'", "'='", "'=='", "'['", "']'", "'boolean'", 
		"'char'", "'float'", "'int'", "'string'", "'void'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ulNoActionsParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ulNoActionsParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ulNoActionsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "ulNoActions.g"; }


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
	protected Object recoverFromMismatchedToken(
	        IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    throw new MismatchedTokenException(ttype, input);
	  }



	// $ANTLR start "program"
	// ulNoActions.g:40:1: program returns [Program p] : (f= function )+ EOF ;
	public final Program program() throws RecognitionException {
		Program p = null;


		Function f =null;


		    p = new Program();

		try {
			// ulNoActions.g:44:5: ( (f= function )+ EOF )
			// ulNoActions.g:44:7: (f= function )+ EOF
			{
			// ulNoActions.g:44:7: (f= function )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 31 && LA1_0 <= 36)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ulNoActions.g:44:8: f= function
					{
					pushFollow(FOLLOW_function_in_program41);
					f=function();
					state._fsp--;
					if (state.failed) return p;
					if ( state.backtracking==0 ) { p.addFunction(f); }
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return p;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,EOF,FOLLOW_EOF_in_program47); if (state.failed) return p;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "program"



	// $ANTLR start "function"
	// ulNoActions.g:47:1: function returns [Function f] : d= functionDecl b= functionBody ;
	public final Function function() throws RecognitionException {
		Function f = null;


		FunctionDeclaration d =null;
		FunctionBody b =null;

		try {
			// ulNoActions.g:48:5: (d= functionDecl b= functionBody )
			// ulNoActions.g:48:7: d= functionDecl b= functionBody
			{
			pushFollow(FOLLOW_functionDecl_in_function67);
			d=functionDecl();
			state._fsp--;
			if (state.failed) return f;
			pushFollow(FOLLOW_functionBody_in_function71);
			b=functionBody();
			state._fsp--;
			if (state.failed) return f;
			if ( state.backtracking==0 ) { f = new Function(d, b); }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return f;
	}
	// $ANTLR end "function"



	// $ANTLR start "functionDecl"
	// ulNoActions.g:51:1: functionDecl returns [FunctionDeclaration fd] : t= compoundType id= identifier '(' (p= formalParams )? ')' ;
	public final FunctionDeclaration functionDecl() throws RecognitionException {
		FunctionDeclaration fd = null;


		Type t =null;
		Identifier id =null;
		FormalParameterList p =null;

		try {
			// ulNoActions.g:52:5: (t= compoundType id= identifier '(' (p= formalParams )? ')' )
			// ulNoActions.g:52:7: t= compoundType id= identifier '(' (p= formalParams )? ')'
			{
			pushFollow(FOLLOW_compoundType_in_functionDecl93);
			t=compoundType();
			state._fsp--;
			if (state.failed) return fd;
			pushFollow(FOLLOW_identifier_in_functionDecl97);
			id=identifier();
			state._fsp--;
			if (state.failed) return fd;
			match(input,19,FOLLOW_19_in_functionDecl99); if (state.failed) return fd;
			// ulNoActions.g:52:41: (p= formalParams )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= 31 && LA2_0 <= 36)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ulNoActions.g:52:41: p= formalParams
					{
					pushFollow(FOLLOW_formalParams_in_functionDecl103);
					p=formalParams();
					state._fsp--;
					if (state.failed) return fd;
					}
					break;

			}

			match(input,20,FOLLOW_20_in_functionDecl106); if (state.failed) return fd;
			if ( state.backtracking==0 ) { fd = new FunctionDeclaration(t, id, p); }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return fd;
	}
	// $ANTLR end "functionDecl"



	// $ANTLR start "formalParams"
	// ulNoActions.g:55:1: formalParams returns [FormalParameterList pl] : p= formalParam ( ',' (p= formalParam ) )* ;
	public final FormalParameterList formalParams() throws RecognitionException {
		FormalParameterList pl = null;


		FormalParameter p =null;


		    pl = new FormalParameterList();

		try {
			// ulNoActions.g:59:5: (p= formalParam ( ',' (p= formalParam ) )* )
			// ulNoActions.g:59:7: p= formalParam ( ',' (p= formalParam ) )*
			{
			pushFollow(FOLLOW_formalParam_in_formalParams133);
			p=formalParam();
			state._fsp--;
			if (state.failed) return pl;
			if ( state.backtracking==0 ) { pl.addFormalParameter(p);}
			// ulNoActions.g:59:49: ( ',' (p= formalParam ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==23) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ulNoActions.g:59:50: ',' (p= formalParam )
					{
					match(input,23,FOLLOW_23_in_formalParams137); if (state.failed) return pl;
					// ulNoActions.g:59:54: (p= formalParam )
					// ulNoActions.g:59:55: p= formalParam
					{
					pushFollow(FOLLOW_formalParam_in_formalParams142);
					p=formalParam();
					state._fsp--;
					if (state.failed) return pl;
					if ( state.backtracking==0 ) { pl.addFormalParameter(p);}
					}

					}
					break;

				default :
					break loop3;
				}
			}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return pl;
	}
	// $ANTLR end "formalParams"



	// $ANTLR start "formalParam"
	// ulNoActions.g:61:1: formalParam returns [FormalParameter p] : t= compoundType id= identifier ;
	public final FormalParameter formalParam() throws RecognitionException {
		FormalParameter p = null;


		Type t =null;
		Identifier id =null;

		try {
			// ulNoActions.g:62:5: (t= compoundType id= identifier )
			// ulNoActions.g:62:7: t= compoundType id= identifier
			{
			pushFollow(FOLLOW_compoundType_in_formalParam168);
			t=compoundType();
			state._fsp--;
			if (state.failed) return p;
			pushFollow(FOLLOW_identifier_in_formalParam172);
			id=identifier();
			state._fsp--;
			if (state.failed) return p;
			if ( state.backtracking==0 ) { p = new FormalParameter(t, id); }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "formalParam"



	// $ANTLR start "functionBody"
	// ulNoActions.g:65:1: functionBody returns [FunctionBody body] : '{' (v= varDecl )* (s= statement )* '}' ;
	public final FunctionBody functionBody() throws RecognitionException {
		FunctionBody body = null;


		VariableDeclaration v =null;
		Statement s =null;


		    body = new FunctionBody();

		try {
			// ulNoActions.g:69:5: ( '{' (v= varDecl )* (s= statement )* '}' )
			// ulNoActions.g:69:7: '{' (v= varDecl )* (s= statement )* '}'
			{
			match(input,37,FOLLOW_37_in_functionBody200); if (state.failed) return body;
			// ulNoActions.g:69:11: (v= varDecl )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 31 && LA4_0 <= 36)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ulNoActions.g:69:12: v= varDecl
					{
					pushFollow(FOLLOW_varDecl_in_functionBody205);
					v=varDecl();
					state._fsp--;
					if (state.failed) return body;
					if ( state.backtracking==0 ) {body.addVariableDeclaration(v);}
					}
					break;

				default :
					break loop4;
				}
			}

			// ulNoActions.g:69:57: (s= statement )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CHARCONSTANT||(LA5_0 >= FALSE && LA5_0 <= WHILE)||LA5_0==19) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ulNoActions.g:69:58: s= statement
					{
					pushFollow(FOLLOW_statement_in_functionBody213);
					s=statement();
					state._fsp--;
					if (state.failed) return body;
					if ( state.backtracking==0 ) {body.addStatement(s);}
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,38,FOLLOW_38_in_functionBody218); if (state.failed) return body;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return body;
	}
	// $ANTLR end "functionBody"



	// $ANTLR start "identifier"
	// ulNoActions.g:72:1: identifier returns [Identifier id] : i= ID ;
	public final Identifier identifier() throws RecognitionException {
		Identifier id = null;


		Token i=null;

		try {
			// ulNoActions.g:73:5: (i= ID )
			// ulNoActions.g:73:7: i= ID
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_identifier238); if (state.failed) return id;
			if ( state.backtracking==0 ) { id = new Identifier(i.getText()); }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "identifier"



	// $ANTLR start "varDecl"
	// ulNoActions.g:76:1: varDecl returns [VariableDeclaration v] : t= compoundType id= identifier ';' ;
	public final VariableDeclaration varDecl() throws RecognitionException {
		VariableDeclaration v = null;


		Type t =null;
		Identifier id =null;

		try {
			// ulNoActions.g:77:5: (t= compoundType id= identifier ';' )
			// ulNoActions.g:77:7: t= compoundType id= identifier ';'
			{
			pushFollow(FOLLOW_compoundType_in_varDecl260);
			t=compoundType();
			state._fsp--;
			if (state.failed) return v;
			pushFollow(FOLLOW_identifier_in_varDecl264);
			id=identifier();
			state._fsp--;
			if (state.failed) return v;
			match(input,25,FOLLOW_25_in_varDecl266); if (state.failed) return v;
			if ( state.backtracking==0 ) { v = new VariableDeclaration(t, id); }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "varDecl"



	// $ANTLR start "compoundType"
	// ulNoActions.g:80:1: compoundType returns [Type t] : (t1= type |t2= type '[' size= intlit ']' );
	public final Type compoundType() throws RecognitionException {
		Type t = null;


		Type t1 =null;
		Type t2 =null;
		IntegerLiteral size =null;

		try {
			// ulNoActions.g:81:5: (t1= type |t2= type '[' size= intlit ']' )
			int alt6=2;
			switch ( input.LA(1) ) {
			case 34:
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1==ID) ) {
					alt6=1;
				}
				else if ( (LA6_1==29) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return t;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 33:
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2==ID) ) {
					alt6=1;
				}
				else if ( (LA6_2==29) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return t;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 32:
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3==ID) ) {
					alt6=1;
				}
				else if ( (LA6_3==29) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return t;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 35:
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4==ID) ) {
					alt6=1;
				}
				else if ( (LA6_4==29) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return t;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 31:
				{
				int LA6_5 = input.LA(2);
				if ( (LA6_5==ID) ) {
					alt6=1;
				}
				else if ( (LA6_5==29) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return t;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 36:
				{
				int LA6_6 = input.LA(2);
				if ( (LA6_6==ID) ) {
					alt6=1;
				}
				else if ( (LA6_6==29) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return t;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return t;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// ulNoActions.g:81:7: t1= type
					{
					pushFollow(FOLLOW_type_in_compoundType291);
					t1=type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = t1; }
					}
					break;
				case 2 :
					// ulNoActions.g:82:7: t2= type '[' size= intlit ']'
					{
					pushFollow(FOLLOW_type_in_compoundType303);
					t2=type();
					state._fsp--;
					if (state.failed) return t;
					match(input,29,FOLLOW_29_in_compoundType305); if (state.failed) return t;
					pushFollow(FOLLOW_intlit_in_compoundType309);
					size=intlit();
					state._fsp--;
					if (state.failed) return t;
					match(input,30,FOLLOW_30_in_compoundType311); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new ArrayType(t2, size); }
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "compoundType"



	// $ANTLR start "type"
	// ulNoActions.g:85:1: type returns [Type t] : ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' );
	public final Type type() throws RecognitionException {
		Type t = null;


		try {
			// ulNoActions.g:86:5: ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' )
			int alt7=6;
			switch ( input.LA(1) ) {
			case 34:
				{
				alt7=1;
				}
				break;
			case 33:
				{
				alt7=2;
				}
				break;
			case 32:
				{
				alt7=3;
				}
				break;
			case 35:
				{
				alt7=4;
				}
				break;
			case 31:
				{
				alt7=5;
				}
				break;
			case 36:
				{
				alt7=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return t;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ulNoActions.g:86:7: 'int'
					{
					match(input,34,FOLLOW_34_in_type334); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new IntegerType(); }
					}
					break;
				case 2 :
					// ulNoActions.g:87:7: 'float'
					{
					match(input,33,FOLLOW_33_in_type344); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new FloatType(); }
					}
					break;
				case 3 :
					// ulNoActions.g:88:7: 'char'
					{
					match(input,32,FOLLOW_32_in_type354); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new CharType(); }
					}
					break;
				case 4 :
					// ulNoActions.g:89:7: 'string'
					{
					match(input,35,FOLLOW_35_in_type364); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new StringType(); }
					}
					break;
				case 5 :
					// ulNoActions.g:90:7: 'boolean'
					{
					match(input,31,FOLLOW_31_in_type374); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new BooleanType(); }
					}
					break;
				case 6 :
					// ulNoActions.g:91:7: 'void'
					{
					match(input,36,FOLLOW_36_in_type384); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new VoidType(); }
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "type"



	// $ANTLR start "statement"
	// ulNoActions.g:94:1: statement returns [Statement s] options {backtrack=true; } : (s1= ifStatement |s1= whileStatement |s1= printStatement |s1= returnStatement |s1= assignStatement |e= expr ';' );
	public final Statement statement() throws RecognitionException {
		Statement s = null;


		Statement s1 =null;
		Expression e =null;

		try {
			// ulNoActions.g:96:2: (s1= ifStatement |s1= whileStatement |s1= printStatement |s1= returnStatement |s1= assignStatement |e= expr ';' )
			int alt8=6;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt8=1;
				}
				break;
			case WHILE:
				{
				alt8=2;
				}
				break;
			case PRINT:
			case PRINTLN:
				{
				alt8=3;
				}
				break;
			case RETURN:
				{
				alt8=4;
				}
				break;
			case ID:
				{
				int LA8_6 = input.LA(2);
				if ( (synpred5_ulNoActions()) ) {
					alt8=5;
				}
				else if ( (true) ) {
					alt8=6;
				}

				}
				break;
			case CHARCONSTANT:
			case FALSE:
			case FLOATCONSTANT:
			case INTEGERCONSTANT:
			case STRINGCONSTANT:
			case TRUE:
			case 19:
				{
				alt8=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// ulNoActions.g:96:4: s1= ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement415);
					s1=ifStatement();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = s1; }
					}
					break;
				case 2 :
					// ulNoActions.g:97:7: s1= whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement427);
					s1=whileStatement();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = s1; }
					}
					break;
				case 3 :
					// ulNoActions.g:98:7: s1= printStatement
					{
					pushFollow(FOLLOW_printStatement_in_statement439);
					s1=printStatement();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = s1; }
					}
					break;
				case 4 :
					// ulNoActions.g:99:7: s1= returnStatement
					{
					pushFollow(FOLLOW_returnStatement_in_statement451);
					s1=returnStatement();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = s1; }
					}
					break;
				case 5 :
					// ulNoActions.g:100:7: s1= assignStatement
					{
					pushFollow(FOLLOW_assignStatement_in_statement463);
					s1=assignStatement();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = s1; }
					}
					break;
				case 6 :
					// ulNoActions.g:101:7: e= expr ';'
					{
					pushFollow(FOLLOW_expr_in_statement475);
					e=expr();
					state._fsp--;
					if (state.failed) return s;
					match(input,25,FOLLOW_25_in_statement477); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new ExpressionStatement(e); }
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "statement"



	// $ANTLR start "whileStatement"
	// ulNoActions.g:104:1: whileStatement returns [Statement s] : WHILE '(' e= expr ')' bl= block ;
	public final Statement whileStatement() throws RecognitionException {
		Statement s = null;


		Expression e =null;
		Block bl =null;

		try {
			// ulNoActions.g:105:3: ( WHILE '(' e= expr ')' bl= block )
			// ulNoActions.g:105:5: WHILE '(' e= expr ')' bl= block
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStatement506); if (state.failed) return s;
			match(input,19,FOLLOW_19_in_whileStatement508); if (state.failed) return s;
			pushFollow(FOLLOW_expr_in_whileStatement512);
			e=expr();
			state._fsp--;
			if (state.failed) return s;
			match(input,20,FOLLOW_20_in_whileStatement514); if (state.failed) return s;
			pushFollow(FOLLOW_block_in_whileStatement518);
			bl=block();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = new WhileStatement(e, bl); }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "printStatement"
	// ulNoActions.g:107:1: printStatement returns [Statement s] : ( PRINT e1= expr ';' | PRINTLN e2= expr ';' );
	public final Statement printStatement() throws RecognitionException {
		Statement s = null;


		Expression e1 =null;
		Expression e2 =null;

		try {
			// ulNoActions.g:108:5: ( PRINT e1= expr ';' | PRINTLN e2= expr ';' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PRINT) ) {
				alt9=1;
			}
			else if ( (LA9_0==PRINTLN) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// ulNoActions.g:108:7: PRINT e1= expr ';'
					{
					match(input,PRINT,FOLLOW_PRINT_in_printStatement538); if (state.failed) return s;
					pushFollow(FOLLOW_expr_in_printStatement542);
					e1=expr();
					state._fsp--;
					if (state.failed) return s;
					match(input,25,FOLLOW_25_in_printStatement544); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new PrintStatement(e1); }
					}
					break;
				case 2 :
					// ulNoActions.g:109:7: PRINTLN e2= expr ';'
					{
					match(input,PRINTLN,FOLLOW_PRINTLN_in_printStatement554); if (state.failed) return s;
					pushFollow(FOLLOW_expr_in_printStatement558);
					e2=expr();
					state._fsp--;
					if (state.failed) return s;
					match(input,25,FOLLOW_25_in_printStatement560); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new PrintLnStatement(e2); }
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "printStatement"



	// $ANTLR start "assignStatement"
	// ulNoActions.g:111:1: assignStatement returns [Statement s] : (id= identifier '=' e1= expr ';' |id= identifier '[' e2= expr ']' '=' e3= expr ';' );
	public final Statement assignStatement() throws RecognitionException {
		Statement s = null;


		Identifier id =null;
		Expression e1 =null;
		Expression e2 =null;
		Expression e3 =null;

		try {
			// ulNoActions.g:112:5: (id= identifier '=' e1= expr ';' |id= identifier '[' e2= expr ']' '=' e3= expr ';' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==27) ) {
					alt10=1;
				}
				else if ( (LA10_1==29) ) {
					alt10=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return s;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// ulNoActions.g:112:7: id= identifier '=' e1= expr ';'
					{
					pushFollow(FOLLOW_identifier_in_assignStatement584);
					id=identifier();
					state._fsp--;
					if (state.failed) return s;
					match(input,27,FOLLOW_27_in_assignStatement586); if (state.failed) return s;
					pushFollow(FOLLOW_expr_in_assignStatement590);
					e1=expr();
					state._fsp--;
					if (state.failed) return s;
					match(input,25,FOLLOW_25_in_assignStatement592); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new AssignmentStatement(id, e1); }
					}
					break;
				case 2 :
					// ulNoActions.g:113:7: id= identifier '[' e2= expr ']' '=' e3= expr ';'
					{
					pushFollow(FOLLOW_identifier_in_assignStatement604);
					id=identifier();
					state._fsp--;
					if (state.failed) return s;
					match(input,29,FOLLOW_29_in_assignStatement606); if (state.failed) return s;
					pushFollow(FOLLOW_expr_in_assignStatement610);
					e2=expr();
					state._fsp--;
					if (state.failed) return s;
					match(input,30,FOLLOW_30_in_assignStatement612); if (state.failed) return s;
					match(input,27,FOLLOW_27_in_assignStatement614); if (state.failed) return s;
					pushFollow(FOLLOW_expr_in_assignStatement618);
					e3=expr();
					state._fsp--;
					if (state.failed) return s;
					match(input,25,FOLLOW_25_in_assignStatement620); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new ArrayAssignment(id, e2, e3); }
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "assignStatement"



	// $ANTLR start "ifStatement"
	// ulNoActions.g:115:1: ifStatement returns [Statement s] : IF '(' e= expr ')' b1= block ( ELSE b2= block )? ;
	public final Statement ifStatement() throws RecognitionException {
		Statement s = null;


		Expression e =null;
		Block b1 =null;
		Block b2 =null;

		try {
			// ulNoActions.g:116:5: ( IF '(' e= expr ')' b1= block ( ELSE b2= block )? )
			// ulNoActions.g:116:7: IF '(' e= expr ')' b1= block ( ELSE b2= block )?
			{
			match(input,IF,FOLLOW_IF_in_ifStatement642); if (state.failed) return s;
			match(input,19,FOLLOW_19_in_ifStatement644); if (state.failed) return s;
			pushFollow(FOLLOW_expr_in_ifStatement648);
			e=expr();
			state._fsp--;
			if (state.failed) return s;
			match(input,20,FOLLOW_20_in_ifStatement650); if (state.failed) return s;
			pushFollow(FOLLOW_block_in_ifStatement654);
			b1=block();
			state._fsp--;
			if (state.failed) return s;
			// ulNoActions.g:116:34: ( ELSE b2= block )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ELSE) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// ulNoActions.g:116:35: ELSE b2= block
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStatement657); if (state.failed) return s;
					pushFollow(FOLLOW_block_in_ifStatement661);
					b2=block();
					state._fsp--;
					if (state.failed) return s;
					}
					break;

			}

			if ( state.backtracking==0 ) { s = new IfStatement(e, b1, b2); }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "returnStatement"
	// ulNoActions.g:119:1: returnStatement returns [Statement s] : RETURN (e= expr )? ';' ;
	public final Statement returnStatement() throws RecognitionException {
		Statement s = null;


		Expression e =null;

		try {
			// ulNoActions.g:120:5: ( RETURN (e= expr )? ';' )
			// ulNoActions.g:120:7: RETURN (e= expr )? ';'
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnStatement686); if (state.failed) return s;
			// ulNoActions.g:120:15: (e= expr )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==CHARCONSTANT||(LA12_0 >= FALSE && LA12_0 <= ID)||LA12_0==INTEGERCONSTANT||(LA12_0 >= STRINGCONSTANT && LA12_0 <= TRUE)||LA12_0==19) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// ulNoActions.g:120:15: e= expr
					{
					pushFollow(FOLLOW_expr_in_returnStatement690);
					e=expr();
					state._fsp--;
					if (state.failed) return s;
					}
					break;

			}

			match(input,25,FOLLOW_25_in_returnStatement693); if (state.failed) return s;
			if ( state.backtracking==0 ) { s = new ReturnStatement(e); }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "returnStatement"



	// $ANTLR start "block"
	// ulNoActions.g:123:1: block returns [Block b] : '{' (s= statement )* '}' ;
	public final Block block() throws RecognitionException {
		Block b = null;


		Statement s =null;


		    b = new Block();

		try {
			// ulNoActions.g:127:5: ( '{' (s= statement )* '}' )
			// ulNoActions.g:127:7: '{' (s= statement )* '}'
			{
			match(input,37,FOLLOW_37_in_block721); if (state.failed) return b;
			// ulNoActions.g:127:11: (s= statement )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CHARCONSTANT||(LA13_0 >= FALSE && LA13_0 <= WHILE)||LA13_0==19) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ulNoActions.g:127:12: s= statement
					{
					pushFollow(FOLLOW_statement_in_block726);
					s=statement();
					state._fsp--;
					if (state.failed) return b;
					if ( state.backtracking==0 ) { b.addStatement(s); }
					}
					break;

				default :
					break loop13;
				}
			}

			match(input,38,FOLLOW_38_in_block733); if (state.failed) return b;
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return b;
	}
	// $ANTLR end "block"



	// $ANTLR start "expr"
	// ulNoActions.g:130:1: expr returns [Expression e] : e1= equalExpr ;
	public final Expression expr() throws RecognitionException {
		Expression e = null;


		Expression e1 =null;

		try {
			// ulNoActions.g:131:5: (e1= equalExpr )
			// ulNoActions.g:131:7: e1= equalExpr
			{
			pushFollow(FOLLOW_equalExpr_in_expr766);
			e1=equalExpr();
			state._fsp--;
			if (state.failed) return e;
			if ( state.backtracking==0 ) { e = e1; }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "expr"



	// $ANTLR start "equalExpr"
	// ulNoActions.g:133:1: equalExpr returns [Expression e] : e1= lessThanExpr ( '==' e2= lessThanExpr )* ;
	public final Expression equalExpr() throws RecognitionException {
		Expression e = null;


		Expression e1 =null;
		Expression e2 =null;

		try {
			// ulNoActions.g:134:5: (e1= lessThanExpr ( '==' e2= lessThanExpr )* )
			// ulNoActions.g:134:7: e1= lessThanExpr ( '==' e2= lessThanExpr )*
			{
			pushFollow(FOLLOW_lessThanExpr_in_equalExpr794);
			e1=lessThanExpr();
			state._fsp--;
			if (state.failed) return e;
			if ( state.backtracking==0 ) { e = e1; }
			// ulNoActions.g:134:35: ( '==' e2= lessThanExpr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==28) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ulNoActions.g:134:36: '==' e2= lessThanExpr
					{
					match(input,28,FOLLOW_28_in_equalExpr799); if (state.failed) return e;
					pushFollow(FOLLOW_lessThanExpr_in_equalExpr803);
					e2=lessThanExpr();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = new EqualityExpression(e1, e2); }
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "equalExpr"



	// $ANTLR start "lessThanExpr"
	// ulNoActions.g:136:1: lessThanExpr returns [Expression e] : e1= addExpr ( '<' e2= addExpr )* ;
	public final Expression lessThanExpr() throws RecognitionException {
		Expression e = null;


		Expression e1 =null;
		Expression e2 =null;

		try {
			// ulNoActions.g:137:5: (e1= addExpr ( '<' e2= addExpr )* )
			// ulNoActions.g:137:7: e1= addExpr ( '<' e2= addExpr )*
			{
			pushFollow(FOLLOW_addExpr_in_lessThanExpr833);
			e1=addExpr();
			state._fsp--;
			if (state.failed) return e;
			if ( state.backtracking==0 ) { e = e1; }
			// ulNoActions.g:137:30: ( '<' e2= addExpr )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==26) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ulNoActions.g:137:31: '<' e2= addExpr
					{
					match(input,26,FOLLOW_26_in_lessThanExpr838); if (state.failed) return e;
					pushFollow(FOLLOW_addExpr_in_lessThanExpr842);
					e2=addExpr();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = new LessThanExpression(e1, e2); }
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "lessThanExpr"



	// $ANTLR start "addExpr"
	// ulNoActions.g:139:1: addExpr returns [Expression e] : e1= multExpr (op= ( '+' | '-' ) e2= multExpr )* ;
	public final Expression addExpr() throws RecognitionException {
		Expression e = null;


		Token op=null;
		Expression e1 =null;
		Expression e2 =null;

		try {
			// ulNoActions.g:140:5: (e1= multExpr (op= ( '+' | '-' ) e2= multExpr )* )
			// ulNoActions.g:140:7: e1= multExpr (op= ( '+' | '-' ) e2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_addExpr872);
			e1=multExpr();
			state._fsp--;
			if (state.failed) return e;
			if ( state.backtracking==0 ) { e = e1; }
			// ulNoActions.g:140:31: (op= ( '+' | '-' ) e2= multExpr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==22||LA16_0==24) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ulNoActions.g:140:32: op= ( '+' | '-' ) e2= multExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==22||input.LA(1)==24 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return e;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_addExpr887);
					e2=multExpr();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) {
					        if (op.equals('+')) {
					            e = new PlusExpression(e1, e2);
					        } else {
					            e = new SubtractExpression(e1, e2);
					        }
					    }
					}
					break;

				default :
					break loop16;
				}
			}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "addExpr"



	// $ANTLR start "multExpr"
	// ulNoActions.g:148:1: multExpr returns [Expression e] : e1= atom ( '*' e2= atom )* ;
	public final Expression multExpr() throws RecognitionException {
		Expression e = null;


		Expression e1 =null;
		Expression e2 =null;

		try {
			// ulNoActions.g:149:5: (e1= atom ( '*' e2= atom )* )
			// ulNoActions.g:149:7: e1= atom ( '*' e2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr917);
			e1=atom();
			state._fsp--;
			if (state.failed) return e;
			if ( state.backtracking==0 ) { e = e1; }
			// ulNoActions.g:149:27: ( '*' e2= atom )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==21) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// ulNoActions.g:149:28: '*' e2= atom
					{
					match(input,21,FOLLOW_21_in_multExpr922); if (state.failed) return e;
					pushFollow(FOLLOW_atom_in_multExpr926);
					e2=atom();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = new MultExpression(e1, e2); }
					}
					break;

				default :
					break loop17;
				}
			}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// ulNoActions.g:152:1: atom returns [Expression e] : (id= identifier '[' e1= expr ']' |id= identifier '(' (el= exprList )? ')' | '(' e1= expr ')' |id= identifier |l1= intlit |l2= floatlit |l3= stringlit |l4= charlit |l5= boollit );
	public final Expression atom() throws RecognitionException {
		Expression e = null;


		Identifier id =null;
		Expression e1 =null;
		ExpressionList el =null;
		IntegerLiteral l1 =null;
		FloatLiteral l2 =null;
		StringLiteral l3 =null;
		CharacterLiteral l4 =null;
		BooleanLiteral l5 =null;

		try {
			// ulNoActions.g:153:5: (id= identifier '[' e1= expr ']' |id= identifier '(' (el= exprList )? ')' | '(' e1= expr ')' |id= identifier |l1= intlit |l2= floatlit |l3= stringlit |l4= charlit |l5= boollit )
			int alt19=9;
			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case 29:
					{
					alt19=1;
					}
					break;
				case 19:
					{
					alt19=2;
					}
					break;
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 28:
				case 30:
					{
					alt19=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return e;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 19:
				{
				alt19=3;
				}
				break;
			case INTEGERCONSTANT:
				{
				alt19=5;
				}
				break;
			case FLOATCONSTANT:
				{
				alt19=6;
				}
				break;
			case STRINGCONSTANT:
				{
				alt19=7;
				}
				break;
			case CHARCONSTANT:
				{
				alt19=8;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt19=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return e;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// ulNoActions.g:153:7: id= identifier '[' e1= expr ']'
					{
					pushFollow(FOLLOW_identifier_in_atom957);
					id=identifier();
					state._fsp--;
					if (state.failed) return e;
					match(input,29,FOLLOW_29_in_atom959); if (state.failed) return e;
					pushFollow(FOLLOW_expr_in_atom963);
					e1=expr();
					state._fsp--;
					if (state.failed) return e;
					match(input,30,FOLLOW_30_in_atom965); if (state.failed) return e;
					if ( state.backtracking==0 ) { e = new ArrayReference(id, e1); }
					}
					break;
				case 2 :
					// ulNoActions.g:154:7: id= identifier '(' (el= exprList )? ')'
					{
					pushFollow(FOLLOW_identifier_in_atom977);
					id=identifier();
					state._fsp--;
					if (state.failed) return e;
					match(input,19,FOLLOW_19_in_atom979); if (state.failed) return e;
					// ulNoActions.g:154:27: (el= exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==CHARCONSTANT||(LA18_0 >= FALSE && LA18_0 <= ID)||LA18_0==INTEGERCONSTANT||(LA18_0 >= STRINGCONSTANT && LA18_0 <= TRUE)||LA18_0==19) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// ulNoActions.g:154:27: el= exprList
							{
							pushFollow(FOLLOW_exprList_in_atom983);
							el=exprList();
							state._fsp--;
							if (state.failed) return e;
							}
							break;

					}

					match(input,20,FOLLOW_20_in_atom986); if (state.failed) return e;
					if ( state.backtracking==0 ) { e = new FunctionCall(id, el); }
					}
					break;
				case 3 :
					// ulNoActions.g:155:7: '(' e1= expr ')'
					{
					match(input,19,FOLLOW_19_in_atom996); if (state.failed) return e;
					pushFollow(FOLLOW_expr_in_atom1000);
					e1=expr();
					state._fsp--;
					if (state.failed) return e;
					match(input,20,FOLLOW_20_in_atom1002); if (state.failed) return e;
					if ( state.backtracking==0 ) { e = new ParenExpression(e1); }
					}
					break;
				case 4 :
					// ulNoActions.g:156:7: id= identifier
					{
					pushFollow(FOLLOW_identifier_in_atom1014);
					id=identifier();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = new IdentifierValue(id); }
					}
					break;
				case 5 :
					// ulNoActions.g:157:7: l1= intlit
					{
					pushFollow(FOLLOW_intlit_in_atom1026);
					l1=intlit();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = l1; }
					}
					break;
				case 6 :
					// ulNoActions.g:158:7: l2= floatlit
					{
					pushFollow(FOLLOW_floatlit_in_atom1038);
					l2=floatlit();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = l2; }
					}
					break;
				case 7 :
					// ulNoActions.g:159:7: l3= stringlit
					{
					pushFollow(FOLLOW_stringlit_in_atom1050);
					l3=stringlit();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = l3; }
					}
					break;
				case 8 :
					// ulNoActions.g:160:7: l4= charlit
					{
					pushFollow(FOLLOW_charlit_in_atom1062);
					l4=charlit();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = l4; }
					}
					break;
				case 9 :
					// ulNoActions.g:161:7: l5= boollit
					{
					pushFollow(FOLLOW_boollit_in_atom1074);
					l5=boollit();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = l5; }
					}
					break;

			}
		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "atom"



	// $ANTLR start "exprList"
	// ulNoActions.g:164:1: exprList returns [ExpressionList el] : e= expr ( ',' (e= expr ) )* ;
	public final ExpressionList exprList() throws RecognitionException {
		ExpressionList el = null;


		Expression e =null;


		    el = new ExpressionList();

		try {
			// ulNoActions.g:168:5: (e= expr ( ',' (e= expr ) )* )
			// ulNoActions.g:168:7: e= expr ( ',' (e= expr ) )*
			{
			pushFollow(FOLLOW_expr_in_exprList1104);
			e=expr();
			state._fsp--;
			if (state.failed) return el;
			if ( state.backtracking==0 ) { el.addExpression(e);}
			// ulNoActions.g:168:37: ( ',' (e= expr ) )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==23) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// ulNoActions.g:168:38: ',' (e= expr )
					{
					match(input,23,FOLLOW_23_in_exprList1108); if (state.failed) return el;
					// ulNoActions.g:168:42: (e= expr )
					// ulNoActions.g:168:43: e= expr
					{
					pushFollow(FOLLOW_expr_in_exprList1113);
					e=expr();
					state._fsp--;
					if (state.failed) return el;
					if ( state.backtracking==0 ) { el.addExpression(e);}
					}

					}
					break;

				default :
					break loop20;
				}
			}

			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return el;
	}
	// $ANTLR end "exprList"



	// $ANTLR start "intlit"
	// ulNoActions.g:171:1: intlit returns [IntegerLiteral il] : l= INTEGERCONSTANT ;
	public final IntegerLiteral intlit() throws RecognitionException {
		IntegerLiteral il = null;


		Token l=null;

		try {
			// ulNoActions.g:172:5: (l= INTEGERCONSTANT )
			// ulNoActions.g:172:7: l= INTEGERCONSTANT
			{
			l=(Token)match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_intlit1142); if (state.failed) return il;
			if ( state.backtracking==0 ) { il = new IntegerLiteral(Integer.parseInt(l.getText()));}
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return il;
	}
	// $ANTLR end "intlit"



	// $ANTLR start "floatlit"
	// ulNoActions.g:174:1: floatlit returns [FloatLiteral fl] : l= FLOATCONSTANT ;
	public final FloatLiteral floatlit() throws RecognitionException {
		FloatLiteral fl = null;


		Token l=null;

		try {
			// ulNoActions.g:175:5: (l= FLOATCONSTANT )
			// ulNoActions.g:175:7: l= FLOATCONSTANT
			{
			l=(Token)match(input,FLOATCONSTANT,FOLLOW_FLOATCONSTANT_in_floatlit1168); if (state.failed) return fl;
			if ( state.backtracking==0 ) { fl = new FloatLiteral(Float.parseFloat(l.getText()));}
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return fl;
	}
	// $ANTLR end "floatlit"



	// $ANTLR start "stringlit"
	// ulNoActions.g:177:1: stringlit returns [StringLiteral sl] : l= STRINGCONSTANT ;
	public final StringLiteral stringlit() throws RecognitionException {
		StringLiteral sl = null;


		Token l=null;

		try {
			// ulNoActions.g:178:5: (l= STRINGCONSTANT )
			// ulNoActions.g:178:7: l= STRINGCONSTANT
			{
			l=(Token)match(input,STRINGCONSTANT,FOLLOW_STRINGCONSTANT_in_stringlit1194); if (state.failed) return sl;
			if ( state.backtracking==0 ) { sl = new StringLiteral(l.getText());}
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return sl;
	}
	// $ANTLR end "stringlit"



	// $ANTLR start "charlit"
	// ulNoActions.g:180:1: charlit returns [CharacterLiteral cl] : l= CHARCONSTANT ;
	public final CharacterLiteral charlit() throws RecognitionException {
		CharacterLiteral cl = null;


		Token l=null;

		try {
			// ulNoActions.g:181:5: (l= CHARCONSTANT )
			// ulNoActions.g:181:7: l= CHARCONSTANT
			{
			l=(Token)match(input,CHARCONSTANT,FOLLOW_CHARCONSTANT_in_charlit1220); if (state.failed) return cl;
			if ( state.backtracking==0 ) { cl = new CharacterLiteral(l.getText());}
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return cl;
	}
	// $ANTLR end "charlit"



	// $ANTLR start "boollit"
	// ulNoActions.g:183:1: boollit returns [BooleanLiteral bl] : l= ( TRUE | FALSE ) ;
	public final BooleanLiteral boollit() throws RecognitionException {
		BooleanLiteral bl = null;


		Token l=null;

		try {
			// ulNoActions.g:184:5: (l= ( TRUE | FALSE ) )
			// ulNoActions.g:184:7: l= ( TRUE | FALSE )
			{
			l=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return bl;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { bl = new BooleanLiteral(l.getText().equals("true")); }
			}

		}

		catch (RecognitionException ex) {
		        reportError(ex);
		        throw ex;
		}

		finally {
			// do for sure before leaving
		}
		return bl;
	}
	// $ANTLR end "boollit"

	// $ANTLR start synpred5_ulNoActions
	public final void synpred5_ulNoActions_fragment() throws RecognitionException {
		Statement s1 =null;

		// ulNoActions.g:100:7: (s1= assignStatement )
		// ulNoActions.g:100:7: s1= assignStatement
		{
		pushFollow(FOLLOW_assignStatement_in_synpred5_ulNoActions463);
		s1=assignStatement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_ulNoActions

	// Delegated rules

	public final boolean synpred5_ulNoActions() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_function_in_program41 = new BitSet(new long[]{0x0000001F80000000L});
	public static final BitSet FOLLOW_EOF_in_program47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDecl_in_function67 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_functionBody_in_function71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_functionDecl93 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_functionDecl97 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionDecl99 = new BitSet(new long[]{0x0000001F80100000L});
	public static final BitSet FOLLOW_formalParams_in_functionDecl103 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionDecl106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParam_in_formalParams133 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_formalParams137 = new BitSet(new long[]{0x0000001F80000000L});
	public static final BitSet FOLLOW_formalParam_in_formalParams142 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_compoundType_in_formalParam168 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_formalParam172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_functionBody200 = new BitSet(new long[]{0x0000005F800BFF90L});
	public static final BitSet FOLLOW_varDecl_in_functionBody205 = new BitSet(new long[]{0x0000005F800BFF90L});
	public static final BitSet FOLLOW_statement_in_functionBody213 = new BitSet(new long[]{0x00000040000BFF90L});
	public static final BitSet FOLLOW_38_in_functionBody218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_varDecl260 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_varDecl264 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_varDecl266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType303 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_compoundType305 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_intlit_in_compoundType309 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_compoundType311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_type334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_type344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_type354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_type364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_type374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_type384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStatement_in_statement439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStatement_in_statement451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStatement_in_statement463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement475 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_statement477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement506 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_whileStatement508 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_whileStatement512 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_whileStatement514 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_block_in_whileStatement518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printStatement538 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_printStatement542 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStatement544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTLN_in_printStatement554 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_printStatement558 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStatement560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_assignStatement584 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_assignStatement586 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_assignStatement590 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_assignStatement592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_assignStatement604 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assignStatement606 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_assignStatement610 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_assignStatement612 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_assignStatement614 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_assignStatement618 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_assignStatement620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement642 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifStatement644 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_ifStatement648 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifStatement650 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_block_in_ifStatement654 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ELSE_in_ifStatement657 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_block_in_ifStatement661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStatement686 = new BitSet(new long[]{0x0000000002098B90L});
	public static final BitSet FOLLOW_expr_in_returnStatement690 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_returnStatement693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_block721 = new BitSet(new long[]{0x00000040000BFF90L});
	public static final BitSet FOLLOW_statement_in_block726 = new BitSet(new long[]{0x00000040000BFF90L});
	public static final BitSet FOLLOW_38_in_block733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equalExpr_in_expr766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lessThanExpr_in_equalExpr794 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_equalExpr799 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_lessThanExpr_in_equalExpr803 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_addExpr_in_lessThanExpr833 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_lessThanExpr838 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_addExpr_in_lessThanExpr842 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_multExpr_in_addExpr872 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_set_in_addExpr879 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_multExpr_in_addExpr887 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_atom_in_multExpr917 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr922 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_atom_in_multExpr926 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_identifier_in_atom957 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_atom959 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_atom963 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_atom965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom977 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_atom979 = new BitSet(new long[]{0x0000000000198B90L});
	public static final BitSet FOLLOW_exprList_in_atom983 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_atom986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_atom996 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_atom1000 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_atom1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intlit_in_atom1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_floatlit_in_atom1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringlit_in_atom1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_charlit_in_atom1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boollit_in_atom1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList1104 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_exprList1108 = new BitSet(new long[]{0x0000000000098B90L});
	public static final BitSet FOLLOW_expr_in_exprList1113 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_intlit1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONSTANT_in_floatlit1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONSTANT_in_stringlit1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARCONSTANT_in_charlit1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_boollit1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStatement_in_synpred5_ulNoActions463 = new BitSet(new long[]{0x0000000000000002L});
}
