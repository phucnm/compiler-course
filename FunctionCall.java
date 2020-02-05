public class FunctionCall extends Expression {
    //TODO: add exprlist
    Identifier id;
    ExpressionList exprList;

    public FunctionCall(Identifier id, ExpressionList exprList) {
        this.id = id;
        this.exprList = exprList;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}