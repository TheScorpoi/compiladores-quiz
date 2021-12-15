package types;

public class NumberType extends Type {

    public NumberType() {
        super("number");
    }

    public boolean isNumeric() {
        return true;
    }

    @Override
    public boolean conformsTo(Type other) {
        return super.conformsTo(other) || other.getName().equals("number");
    }
}
