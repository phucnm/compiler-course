public class IRArrayCreation implements IRInstruction {
    TempVar t;

    public IRArrayCreation(TempVar t) {
        this.t = t;
    }

    public String toString() {
        ArrayType aType = (ArrayType)t.type;
        return String.format("%s := NEWARRAY %s %s;", t.toString(), aType.type.toString(), aType.size.val.toString());
    }

    @Override
    public String toBytecodeString() {
        ArrayType aType = (ArrayType)t.type;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ldc %d", aType.size.val));
        // This is super tedious
        String arrayStringPrefix = (aType.type instanceof StringType) ? "a" : "";
        String arrayElementType = aType.type.toStringInArrayCreation();
        sb.append(String.format("\n    %snewarray %s", arrayStringPrefix, arrayElementType));
        sb.append(String.format("\n    astore %d", t.number));
        return sb.toString();
    }
}