public abstract class Type
{
   protected Type(String name) {
      assert name != null;
      this.name = name;
   }

   public String name() {
      return name;
   }

   public boolean conformsTo(Type other) {
      return name.equals(other.name());
   }

   public boolean isNumeric() {
      return false;
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

   @Override
   public String toString()
   {
      return name;
   }

   protected final String name;
}
