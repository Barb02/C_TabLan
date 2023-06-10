public class BooleanType extends Type {
   public BooleanType() {
      super("boolean");
   }

   public boolean isBoolean() {
      return true;
   }

   public boolean isNumeric() {
      return false;
   }

   public boolean isText() {
      return false;
   }

   public boolean isTextOnlyNumbers() {
      return false;
   }
}

