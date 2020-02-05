public class VariableDeclaration implements ASTNode {
    Type type;
    Identifier id;

    public VariableDeclaration(Type t, Identifier id) {
        this.type = t;
        this.id = id;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}