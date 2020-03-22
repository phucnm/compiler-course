public class IRLabel implements IRInstruction {
    Integer labelNumber;

    public IRLabel(Integer labelNumber) {
        this.labelNumber = labelNumber;
    }

    public String toString() {
        return String.format("L%s:;", labelNumber.toString());
    }

    @Override
    public String toBytecodeString() {
        return String.format("L%d:", labelNumber);
    }
}