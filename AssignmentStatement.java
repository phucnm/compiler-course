public class AssignmentStatement extends Statement {

    Identifier id;
    Expression e;

    public AssignmentStatement(Identifier id, Expression e) {
        this.id = id;
        this.e = e;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}