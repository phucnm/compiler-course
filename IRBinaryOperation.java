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
        return String.format("%s := %s %s%s %s;", var.toString(), lhs.toString(), lhs.type.toString(), op, rhs.toString());
    }

    @Override
    public String toBytecodeString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%sload %d", lhs.type.toString().toLowerCase(), lhs.number));
        sb.append(String.format("\n    %sload %d", rhs.type.toString().toLowerCase(), rhs.number));
        sb.append(String.format("\n    %s%s", var.type.toString().toLowerCase(), op));
        sb.append(String.format("\n    %sstore %d", var.type.toString().toLowerCase(), var.number));
        return sb.toString();
    }
}