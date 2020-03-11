public class IRNegation implements IRInstruction {
    TempVar t;

    public IRNegation(TempVar t) {
        this.t = t;
    }

    public String toString() {
        return String.format("%s := Z! %s;", t.toString(), t.toString());
    }
}