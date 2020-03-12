public class IRArrayCreation implements IRInstruction {
    TempVar t;

    public IRArrayCreation(TempVar t) {
        this.t = t;
    }

    public String toString() {
        ArrayType aType = (ArrayType)t.type;
        return String.format("%s := NEWARRAY %s %s;", t.toString(), aType.type.toString(), aType.size.val.toString());
    }
}