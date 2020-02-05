public class FunctionDeclaration implements ASTNode {
    Type type;
    Identifier id;
    FormalParameterList params;

    public FunctionDeclaration(Type type, Identifier id, FormalParameterList params) {
        this.type = type;
        this.id = id;
        this.params = params;
    }

    @Override
    public Object accept(Visitor visitor)
    {
        return visitor.visit(this);
    }
}