public class IRIfInstruction implements IRInstruction {
    TempVar t;
    Integer labelNumber;

    public IRIfInstruction(TempVar t, Integer labelNumber) {
        this.t = t;
        this.labelNumber = labelNumber;
    }

    public String toString() {
        return String.format("IF %s GOTO L%s;", t.toString(), labelNumber.toString());
    }

    @Override
    public String toBytecodeString() {
        String lb = "L" + labelNumber.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("iload %d", t.number));
        sb.append(String.format("\n    ifne %s", lb));
        return sb.toString();
    }
}