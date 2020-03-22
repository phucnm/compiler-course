public class IRLessthanOperation extends IREqualityOperation {
    public IRLessthanOperation(TempVar var, TempVar lhs, TempVar rhs, Integer lbNum) {
        super(var, lhs, rhs, lbNum);
        this.opcode = "iflt";
        this.op = "<";
    }
}