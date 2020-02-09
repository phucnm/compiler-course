public class FunctionCall extends Expression {
    IdentifierValue id;
    ExpressionList exprList;

    public FunctionCall(Identifier id, ExpressionList exprList) {
        this.id = new IdentifierValue(id);
        this.exprList = exprList;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}