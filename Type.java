public abstract class Type {
    public abstract Object accept(Visitor v);
    public abstract String toString();
    public int pos;
    public int line;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    public boolean isSubType(Type t) {
        //Subtyping relationship
        if (this instanceof IntegerType && t instanceof FloatType) {
            return true;
        }
        return this.equals(t);
    }
}