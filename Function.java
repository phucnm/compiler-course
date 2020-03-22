public class Function implements ASTNode {
    FunctionDeclaration decl;
    FunctionBody body;

    public Function(FunctionDeclaration decl, FunctionBody body) {
        this.decl = decl;
        this.body = body;
    }

    /// Returns the function signature to distinguish from 
    /// methods with same name but different params.
    /// E.g. foo(int, string, boolean) -> foo$i$s$b
    public String functionNameSignature() {
        StringBuilder sb = new StringBuilder();
        sb.append(decl.id.name);
        if (decl.params == null) {
            return sb.toString();
        }
        int paramCount = decl.params.getFormalParameterCount();
        for (int i=0; i < paramCount; i++)
        {
            FormalParameter p = decl.params.getFormalParameter(i);
            sb.append("$");
            sb.append(p.type.toString().toLowerCase().charAt(0));
        }
        return sb.toString();
    }

    /// Format name(parms)returnType
    /// e.g. foo(II)V
    /// bar(Ljava/lang/String;Ljava/lang/String;)I
    public String functionSignature() {
        StringBuilder sb = new StringBuilder();
        if (decl.id.name.equals("main")) {
            sb.append("__main");
        } else {
            sb.append(decl.id.name);
        }
        sb.append("(");
        if (decl.params != null) {
            for (FormalParameter p: decl.params.params) {
                sb.append(p.type.toSignString());
            }
        }
        sb.append(")");
        sb.append(decl.type.toSignString());
        return sb.toString();
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}