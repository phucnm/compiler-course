public class IRArrayReference implements IRInstruction {
    TempVar t, var, index;

    public IRArrayReference(TempVar t, TempVar var, TempVar index) {
        this.t = t;
        this.var = var;
        this.index = index;
    }

    public String toString() {
        return String.format("%s := %s[%s];", t.toString(), var.toString(), index.toString());
    }
}