public class CharacterLiteral extends Expression {

    Character val;

    public CharacterLiteral(String val) {
        this.val = val.charAt(1);
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}