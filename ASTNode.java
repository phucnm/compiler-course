public interface ASTNode {
    public Object accept(Visitor visitor);
}