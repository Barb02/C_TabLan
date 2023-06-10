public class TextType extends Type {

   public boolean onlyNumbers = false;

   public TextType() {
      super("String");
   }

   public TextType(boolean onlyNumbers) {
      super("String");
      this.onlyNumbers = onlyNumbers;
   }

   public boolean isBoolean() {
      return false;
   }

   public boolean isNumeric() {
      return false;
   }

   public boolean isText() {
      return true;
   }

   public boolean isTextOnlyNumbers() {
      return this.onlyNumbers;
   }
}

