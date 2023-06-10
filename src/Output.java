import java.util.*;

public class Output {
    public class Table extends AbstractTable {
      List<Double> n1 = new ArrayList<>();
      List<Double> n2 = new ArrayList<>();

      Table(){
         headersMap.put("n1","");
         headersMap.put("n2","");
      }

       List<Double> average = new ArrayList<>();

      private double average(double n1 , double n2){
         double v3 = n1;
         double v4 = n2;
         double v2 = v3 + v4;
         int v5 = 2;
         double v1 = v2 / v5;
         return v1;
      }

      public void checkSizes(){
            List<Integer> t = Arrays.asList(n1.size(),n2.size());
            int tableSize = Collections.max(t);
            while(n1.size() < tableSize){
               n1.add(null);
            }
            while(n2.size() < tableSize){
               n2.add(null);
            }
         }

      @Override
      public String toString() {
         checkSizes();
         List<String> format = new ArrayList<>();
         System.out.println(headerTable);
         int n1MaxSize = headersMap.get("n1").length();
         for (Object string : n1) {
             String result = string!=null ? string.toString() : "";
             if(result.length() > n1MaxSize) n1MaxSize = result.length();
         }
         format.add("| %"+n1MaxSize+"s ");
         int n2MaxSize = headersMap.get("n2").length();
         for (Object string : n2) {
             String result = string!=null ? string.toString() : "";
             if(result.length() > n2MaxSize) n2MaxSize = result.length();
         }
         format.add("| %"+n2MaxSize+"s ");
         String s = "";
         for (String string : format) {
            s += string;
         }
         s+= "|%n";
         System.out.printf(s, headersMap.get("n1"),headersMap.get("n2"));
         for (int i = 0; i < n1.size(); i++) {
            System.out.printf(s, n1.get(i),n2.get(i));
         }
         return "\n";
      }
   }
   public static void main(String[] args) {
      Output o = new Output();
      Table t;
      t = o.new Table(); 
      double c;
      double v6 = 1.0;
      c = v6;
      double v7 = 1.0;
      t.n1.add(v7);
      double v8 = c;
      t.n2.add(v8);
      t.average.add(t.average(v7,v8));
      t.n1.add(null);
      t.n2.add(null);
      t.average.add(null);
      double v10 = c;
      int v11 = 1;
      double v9 = v10 + v11;
      c = v9;
      double v12 = 2.0;
      t.n1.add(v12);
      double v13 = c;
      t.n2.add(v13);
      t.average.add(t.average(v12,v13));
      t.n1.add(null);
      t.n2.add(null);
      t.average.add(null);
      double v15 = c;
      int v16 = 1;
      double v14 = v15 + v16;
      c = v14;
      double v17 = 3.0;
      t.n1.add(v17);
      double v18 = c;
      t.n2.add(v18);
      t.average.add(t.average(v17,v18));
      t.n1.add(null);
      t.n2.add(null);
      t.average.add(null);
      Table v19 = t;
      System.out.println(v19);
   }
   public static String centerString (int width, String s){
      return String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
   }
}
