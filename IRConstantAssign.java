public class IRConstantAssign implements IRInstruction {
    TempVar t; 
    Value val;

    public IRConstantAssign(TempVar t, Value val) {
        this.t = t;
        this.val = val;
    }

    public String toString() {
        return t.toString() + " := " + val.toString() + ";";
    }
}