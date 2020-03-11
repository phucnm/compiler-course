public class IRBinaryOperation implements IRInstruction {
    TempVar var;
    TempVar lhs;
    TempVar rhs;
    String op;

    public IRBinaryOperation(TempVar var, TempVar lhs, TempVar rhs, String op) {
        this.var = var;
        this.lhs = lhs;
        this.rhs = rhs;
        this.op = op;
    }

    public String toString() {
        return String.format("%s := %s %s%s %s;", var.toString(), lhs.toString(), var.type.toString(), op, rhs.toString());
    }
}