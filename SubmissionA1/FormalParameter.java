public class FormalParameter implements ASTNode {
    Type type;
    Identifier id;

    public FormalParameter(Type type, Identifier id) {
        this.type = type;
        this.id = id;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}