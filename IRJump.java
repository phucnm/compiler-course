public class IRJump implements IRInstruction {
    Integer labelNumber;

    public IRJump(Integer labelNumber) {
        this.labelNumber = labelNumber;
    }

    public String toString() {
        return String.format("GOTO L%s;", labelNumber.toString());
    }

    @Override
    public String toBytecodeString() {
        return String.format("goto L%s", labelNumber.toString());
    }
}