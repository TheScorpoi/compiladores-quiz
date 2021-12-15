package types;

public class Real extends Type {
    
    public Real() {
       super("real");
    }
 
    public boolean isNumeric() {
       return true;
    }
 }
 