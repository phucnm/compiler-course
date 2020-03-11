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
}