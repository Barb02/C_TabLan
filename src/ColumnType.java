public class ColumnType extends Type{

    ColumnType(){
        super("column");
    }

    ColumnType(String name){
        super(name);
    }

    public boolean isNumeric() {
        return false;
     }
  
     public boolean isBoolean() {
        return false;
     }
}