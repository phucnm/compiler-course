grammar ulNoActions;		
@members
{
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
}

@rulecatch {
catch (RecognitionException ex) {
        reportError(ex);
        throw ex;
}
}

/*
 * This is a subset of the ulGrammar to show you how
 * to make new production rules.
 * You will need to:
 *  - change type to be compoundType and include appropriate productions
 *  - introduce optional formalParameters
 *  - change functionBody to include variable declarations and statements 
 */

program : function+ EOF
	;

function: functionDecl functionBody
	;

functionDecl
        : compoundType identifier '(' formalParams* ')'
	;

formalParams : 
        compoundType ID moreFormals*
        ;

moreFormals: 
        ', ' compoundType ID
        ;

functionBody: '{' varDecl* statement* '}'
	;

identifier : ID
	;

varDecl : compoundType identifier ';'
        ;

compoundType: type
        | type '[' INTEGERCONSTANT ']'
        ;

type:	TYPE
	;

statement
options { backtrack = true; }	
	: ifStatement
        | whileStatement
        | printStatement
        | returnStatement 
        | assignStatement 
        | expr ';'
        ;
        
 whileStatement 
 	: WHILE '(' expr ')' block
 	;
printStatement:
        PRINT expr ';'
        | PRINTLN expr ';'
        ;
assignStatement:
        ID '=' expr ';'
        | ID '[' expr ']' '=' expr ';'
        ;
ifStatement:
        IF '(' expr ')' block (ELSE block)?
        ;

returnStatement:
        RETURN expr ';'
        | 'return;'
        ;

block : '{' statement* '}'
        ;
        
expr : equalExpr
        ;
equalExpr : lessThanExpr ('==' lessThanExpr)*
        ;
lessThanExpr : addExpr ('<' addExpr)*
        ;
addExpr: multExpr (('+' | '-') multExpr)*
        ;
multExpr: basicExpr ('*' basicExpr)*
        ;

basicExpr :
        | ID '[' expr ']'
        | ID '(' exprList ')'
        | '(' expr ')'
        | ID
        | literal 
        ;

exprList : expr exprMore* ;
exprMore : ',' expr ;

literal 
        : INTEGERCONSTANT //{ System.out.println("parsed Int : " + $INTEGERCONSTANT.text); }
        | FLOATCONSTANT //{ System.out.println("parsed float : " + $FLOATCONSTANT.text); }
        | STRINGCONSTANT //{ System.out.println("parsed string : " + $STRINGCONSTANT.text); }
        | CHARCONSTANT //{ System.out.println("parsed char: " + $CHARCONSTANT.text); }
        | 'true'
        | 'false'
        ;

/* Lexer */
	 
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
PRINT : 'print' ;
PRINTLN : 'println' ;
RETURN : 'return' ;

/* Fixme: add the other types here */
TYPE	: 'int'
        | 'float'
        | 'char'
        | 'string'
        | 'boolean'
        | 'void'
	;

INTEGERCONSTANT : '0'..'9'+ ;
FLOATCONSTANT: ('0'..'9')+ '.' ('0'..'9')+ ;

STRINGCONSTANT: '"' (~('\r' | '\n' | '"')*) '"' ;
CHARCONSTANT: '\'' ('a'..'z' | 'A'..'Z' | '0'..'9' | '!' | ',' | ':' | '_' | '{' | '}' | ' ') '\'' ;

/*
 * FIXME:
 * Change this to match the specification for identifier
 * 
 */ 
ID	: ('A'..'Z' | 'a'..'z' | '_')('A'..'Z' | 'a'..'z' | '_'|'0'..'9')*
	;


/* These two lines match whitespace and comments 
 * and ignore them.
 * You want to leave these as last in the file.  
 * Add new lexical rules above 
 */
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;