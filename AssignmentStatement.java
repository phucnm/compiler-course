public class AssignmentStatement extends Statement {

    IdentifierValue id;
    Expression e;

    public AssignmentStatement(Identifier id, Expression e) {
        this.id = new IdentifierValue(id);
        this.e = e;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}