public class TableType extends Type{
    TableType(){
        super("table");
    }

    TableType(String name){
        super(name);
    }

    public boolean isNumeric() {
        return false;
     }
  
     public boolean isBoolean() {
        return false;
     }
}