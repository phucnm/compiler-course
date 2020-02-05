public class ArrayAssignment extends Statement {

    Identifier id;
    Expression e1;
    Expression e2;

    public ArrayAssignment(Identifier id, Expression e1, Expression e2) {
        this.id = id;
        this.e1 = e1;
        this.e2 = e2;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}