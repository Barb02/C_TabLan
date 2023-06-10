public class RealType extends Type {
   public RealType() {
      super("double");
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
}

