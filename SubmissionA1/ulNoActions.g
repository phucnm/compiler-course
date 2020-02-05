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

program returns [Program p]
@init {
    p = new Program();
}
    : (f=function { p.addFunction(f); })+ EOF
	;

function returns [Function f]
    : d=functionDecl b=functionBody { f = new Function(d, b); }
	;

functionDecl returns [FunctionDeclaration fd]
    : t=compoundType id=identifier '(' p=formalParams? ')' { fd = new FunctionDeclaration(t, id, p); }
	;

formalParams returns [FormalParameterList pl]
@init {
    pl = new FormalParameterList();
}
    : p=formalParam{ pl.addFormalParameter(p);} (',' (p=formalParam{ pl.addFormalParameter(p);}))*
    ;
formalParam returns [FormalParameter p]
    : t=compoundType id=identifier { p = new FormalParameter(t, id); }
    ;

functionBody returns [FunctionBody body]
@init {
    body = new FunctionBody();
}
    : '{' (v=varDecl{body.addVariableDeclaration(v);})* (s=statement{body.addStatement(s);})* '}'
	;

identifier returns [Identifier id]
    : i=ID { id = new Identifier(i.getText()); }
	;

varDecl returns [VariableDeclaration v]
    : t=compoundType id=identifier ';' { v = new VariableDeclaration(t, id); }
    ;

compoundType returns [Type t]
    : t1=type { t = t1; }
    | t2=type '[' size=intlit ']' { t = new ArrayType(t2, size); }
    ;

type returns [Type t]
    : 'int' { t = new IntegerType(); }
    | 'float' { t = new FloatType(); }
    | 'char' { t = new CharType(); }
    | 'string' { t = new StringType(); }
    | 'boolean' { t = new BooleanType(); }
    | 'void' { t = new VoidType(); }
	;

statement returns [Statement s]
options { backtrack = true; }	
	: s1=ifStatement { s = s1; }
    | s1=whileStatement { s = s1; }
    | s1=printStatement { s = s1; }
    | s1=returnStatement { s = s1; }
    | s1=assignStatement { s = s1; }
    | e=expr ';' { s = new ExpressionStatement(e); }
    ;
        
whileStatement returns [Statement s]
 	: WHILE '(' e=expr ')' bl=block { s = new WhileStatement(e, bl); }
 	;
printStatement returns [Statement s]
    : PRINT e1=expr ';' { s = new PrintStatement(e1); }
    | PRINTLN e2=expr ';' { s = new PrintLnStatement(e2); }
    ;
assignStatement returns [Statement s]
    : id=identifier '=' e1=expr ';' { s = new AssignmentStatement(id, e1); }
    | id=identifier '[' e2=expr ']' '=' e3=expr ';' { s = new ArrayAssignment(id, e2, e3); }
    ;
ifStatement returns [Statement s]
    : IF '(' e=expr ')' b1=block (ELSE b2=block)? { s = new IfStatement(e, b1, b2); }
    ;

returnStatement returns [Statement s]
    : RETURN e=expr? ';' { s = new ReturnStatement(e); }
    ;

block returns [Block b]
@init {
    b = new Block();
}
    : '{' (s=statement { b.addStatement(s); } )* '}'
    ;
        
expr returns [Expression e]
    : e1 = equalExpr { e = e1; }
        ;
equalExpr returns [Expression e]
    : e1=lessThanExpr { e = e1; } ('==' e2=lessThanExpr { e = new EqualityExpression(e1, e2); })*
        ;
lessThanExpr returns [Expression e]
    : e1=addExpr { e = e1; } ('<' e2=addExpr { e = new LessThanExpression(e1, e2); })*
        ;
addExpr returns [Expression e]
    : e1=multExpr { e = e1; } (op=('+'|'-') e2=multExpr {
        if (op.getText().equals("+")) {
            e = new PlusExpression(e1, e2);
        } else {
            e = new SubtractExpression(e1, e2);
        }
    })*
        ;
multExpr returns [Expression e]
    : e1=atom { e = e1; } ('*' e2=atom { e = new MultExpression(e1, e2); })*
        ;

atom returns [Expression e]
    : id=identifier '[' e1=expr ']' { e = new ArrayReference(id, e1); }
    | id=identifier '(' el=exprList? ')' { e = new FunctionCall(id, el); }
    | '(' e1=expr ')' { e = new ParenExpression(e1); }
    | id=identifier { e = new IdentifierValue(id); }
    | l1=intlit { e = l1; }
    | l2=floatlit { e = l2; }
    | l3=stringlit { e = l3; }
    | l4=charlit { e = l4; }
    | l5=boollit { e = l5; }
    ;

exprList returns [ExpressionList el]
@init {
    el = new ExpressionList();
}
    : e=expr{ el.addExpression(e);} (',' (e=expr{ el.addExpression(e);}))*
    ;

intlit returns [IntegerLiteral il]
    : l = INTEGERCONSTANT { il = new IntegerLiteral(Integer.parseInt(l.getText()));}
    ;
floatlit returns [FloatLiteral fl]
    : l = FLOATCONSTANT { fl = new FloatLiteral(Float.parseFloat(l.getText()));}
    ;
stringlit returns [StringLiteral sl]
    : l = STRINGCONSTANT { sl = new StringLiteral(l.getText());}
    ;
charlit returns [CharacterLiteral cl]
    : l = CHARCONSTANT { cl = new CharacterLiteral(l.getText());}
    ;
boollit returns [BooleanLiteral bl]
    : l = (TRUE|FALSE) { bl = new BooleanLiteral(l.getText().equals("true")); }
    ;

/* Lexer */
	 
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
PRINT : 'print' ;
PRINTLN : 'println' ;
RETURN : 'return' ;
TRUE: 'true';
FALSE: 'false';
/* Fixme: add the other types here */

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