public class IntegerLiteral extends Expression {

    Integer val;

    public IntegerLiteral(Integer val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) { 
        if (o == this) { 
            return true; 
        } 
  
        if (!(o instanceof IntegerLiteral)) { 
            return false; 
        } 
          
        IntegerLiteral intLit = (IntegerLiteral) o; 
        return intLit.val == val;
    } 

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}