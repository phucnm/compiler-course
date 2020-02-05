public interface Visitor {
    Object visit(Program p);
    Object visit(Function f);
    Object visit(FunctionDeclaration d);
    Object visit(FormalParameterList l);
    Object visit(FormalParameter p);
    Object visit(FunctionBody f);
    Object visit(VariableDeclaration v);

    Object visit(Block b);
    Object visit(IfStatement i);
    Object visit(WhileStatement w);
    Object visit(PrintStatement p);
    Object visit(PrintLnStatement p);
    Object visit(AssignmentStatement a);
    Object visit(ArrayAssignment a);
    Object visit(ExpressionStatement e);
    Object visit(ReturnStatement r);
    Object visit(EmptyStatement s);

    Object visit(PlusExpression p);
    Object visit(SubtractExpression p);
    Object visit(MultExpression m);
    Object visit(EqualityExpression e);
    Object visit(LessThanExpression l);
    Object visit(ArrayReference a);
    Object visit(FunctionCall f);
    Object visit(ExpressionList l);
    Object visit(IdentifierValue iv);
    Object visit(IntegerLiteral il);
    Object visit(FloatLiteral fl);
    Object visit(StringLiteral sl);
    Object visit(CharacterLiteral cl);
    Object visit(BooleanLiteral bl);
    Object visit(ParenExpression p);

    Object visit(IntegerType type);
    Object visit(FloatType type);
    Object visit(StringType type);
    Object visit(CharType type);
    Object visit(VoidType type);
    Object visit(ArrayType type);
    Object visit(BooleanType type);

    Object visit(Identifier id);
}