public class IRNegation implements IRInstruction {
    TempVar lhs, rhs;

    public IRNegation(TempVar lhs, TempVar rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public String toString() {
        return String.format("%s := Z! %s;", lhs.toString(), rhs.toString());
    }
}