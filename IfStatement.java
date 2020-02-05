public class IfStatement extends Statement {
    Expression e;
    Block ifBlock;
    Block elseBlock;

    public IfStatement(Expression e, Block ifBlock, Block elseBlock) {
        this.e = e;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}