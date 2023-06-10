public class IntegerType extends Type {
   public IntegerType() {
      super("int");
   }

   public boolean isNumeric() {
      return true;
   }

   public boolean isBoolean() {
      return false;
   }

   public boolean isText() {
      return false;
   }

   public boolean isTextOnlyNumbers() {
      return false;
   }

   @Override public boolean conformsTo(Type other) {
      return super.conformsTo(other) || other.name().equals("real");
   }

}

