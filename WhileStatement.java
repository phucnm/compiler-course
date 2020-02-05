public class WhileStatement extends Statement {
    Expression expr;
    Block block;

    public WhileStatement(Expression expr, Block block) {
        this.expr = expr;
        this.block = block;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}