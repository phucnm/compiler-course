public class IRLessthanOperation implements IRInstruction {
    TempVar var;
    TempVar lhs;
    TempVar rhs;
    String op;
    Integer lbNum;

    public IRLessthanOperation(TempVar var, TempVar lhs, TempVar rhs, Integer lbNum) {
        this.var = var;
        this.lhs = lhs;
        this.rhs = rhs;
        this.lbNum = lbNum;
    }

    public String toString() {
        return String.format("%s := %s %s%s %s;", var.toString(), lhs.toString(), lhs.type.toString(), "<", rhs.toString());
    }

    @Override
    public String toBytecodeString() {
        String l0 = String.format("L_%d", lbNum * 2);
        String l1 = String.format("L_%d", lbNum * 2 + 1);
        StringBuilder sb = new StringBuilder();
        if (lhs.type instanceof FloatType) {
            sb.append(String.format("%sload %d", lhs.type.toString().toLowerCase(), lhs.number));
            sb.append(String.format("\n    %sload %d", rhs.type.toString().toLowerCase(), rhs.number));
            sb.append("\n    fcmpg");
        } else if (lhs.type instanceof StringType) {
            sb.append(String.format("\n    aload %d", lhs.type.toString().toLowerCase(), lhs.number));
            sb.append(String.format("\n    aload %d", rhs.type.toString().toLowerCase(), rhs.number));
            sb.append("\n    invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I");
        }
        //Int and char
        sb.append(String.format("\n    %sload %d", lhs.type.toString().toLowerCase(), lhs.number));
        sb.append(String.format("\n    %sload %d", rhs.type.toString().toLowerCase(), rhs.number));
        sb.append("\n    isub");

        sb.append(String.format("\n    iflt %s", l0));
        sb.append(String.format("\n    ldc 0", l0));
        sb.append(String.format("\n    goto %s", l1));
        sb.append(String.format("\n%s:", l0));
        sb.append(String.format("\n    ldc 1", l1));
        sb.append(String.format("\n%s:", l1));
        sb.append(String.format("\n    istore %d", var.number));
        return sb.toString();
    }
}