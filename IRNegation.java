public class IRNegation implements IRInstruction {
    TempVar lhs, rhs;

    public IRNegation(TempVar lhs, TempVar rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public String toString() {
        return String.format("%s := Z! %s;", lhs.toString(), rhs.toString());
    }

    @Override
    public String toBytecodeString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("iload %d", rhs.number));
        sb.append("\n    ldc 1");
        sb.append("\n    ixor");
        sb.append(String.format("\n    istore %d", lhs.number));
        return sb.toString();
    }
}