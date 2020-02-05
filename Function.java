public class Function implements ASTNode {
    FunctionDeclaration decl;
    FunctionBody body;

    public Function(FunctionDeclaration decl, FunctionBody body) {
        this.decl = decl;
        this.body = body;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}