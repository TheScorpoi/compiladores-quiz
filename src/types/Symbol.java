package types;

public abstract class Symbol {

    protected final String name;
    protected final Type type;
    protected Value value;
    protected boolean valueDefined;
    protected String varName;
    protected Type subType;

    public Symbol(String name, Type type) {
        assert name != null;
        assert type != null;

        this.name = name;
        this.type = type;
    }

    public void setValue(Value value) {
        assert value != null;

        this.value = value;
    }

    public String name() {
        return name;
    }

    public void setVarName(String varName) {
        System.out.println(varName);
        assert varName != null;
        this.varName = varName;
    }

    public String varName() {
        return varName;
    }

    public Type type() {
        return type;
    }

    public void setValueDefined() {
        valueDefined = true;
    }

    public boolean valueDefined() {
        return valueDefined;
    }

    public Value value() {
        assert valueDefined();

        return value;
    }

    public void setsubType(Type subType) {
        this.subType = subType;
    }

    public Type getsubType() {
        return subType;
    }

    @Override
    public String toString() {
        return "Symbol [name=" + name + ", subType=" + subType + ", type=" + type + ", value=" + value
                + ", valueDefined=" + valueDefined + ", varName=" + varName + "]";
    }
    
}