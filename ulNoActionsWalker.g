tree grammar ulNoActionsWalker;
options {
    tokenVocab=ulNoActions;
    ASTLabelType=CommonTree;
}

program : function+
	;

function: ^(FUNC functionDecl functionBody)
	;

functionDecl
        : ^(FUNCDECL compoundType identifier formalParams*)
	;

formalParams : 
        ^(FUNCPARAMS varDef+)
        ;

moreFormals:
        compoundType ID
        ;

functionBody: ^(FUNCBODY varDecl* statement*)
	;

identifier : ID
	;

varDef: ^(VARDECL compoundType identifier)
    ;

varDecl : varDef
        ;

compoundType: type
    | ^(ARRAY type INTEGERCONSTANT)
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
        | expr
        ;
        
whileStatement
 	: ^(WHILE block)
 	;
printStatement:
        ^(PRINT expr)
        | ^(PRINTLN expr)
        ;
assignStatement:
        ^(ASSIGN ID expr)
        | ^(ASSIGNARR ID expr expr)
        ;
ifStatement:
        ^(IF expr block block)
        ;

returnStatement:
        ^(RETURN expr?)
        //| RETURN
        ;

block : statement
        ;
        
expr : ^('==' expr expr)
    | ^('<' expr expr)
    | ^('+' expr expr)
    | ^('=' expr expr)
    | ^('*' expr expr)
    | ^(ACCESSARR ID expr)
    | ^(FUNCCALL ID exprList)
    | ID
    | literal
    ;

exprList : ^(PARAMS expr+)
    ;

literal 
        : INTEGERCONSTANT //{ System.out.println("parsed Int : " + $INTEGERCONSTANT.text); }
        | FLOATCONSTANT //{ System.out.println("parsed float : " + $FLOATCONSTANT.text); }
        | STRINGCONSTANT //{ System.out.println("parsed string : " + $STRINGCONSTANT.text); }
        | CHARCONSTANT //{ System.out.println("parsed char: " + $CHARCONSTANT.text); }
        | FALSE
        | TRUE
        ;