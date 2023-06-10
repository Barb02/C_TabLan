package java_Examples.example1;

public class Main {
    public static void main(String[] args) {

        ATable t;
        t = new ATable();

        t.setHeaderTable("");
        t.headersMap.put("name", "Name:");
        t.headersMap.put("number", "");

        t.setHeaderColum("header", "Table:"); 
        t.setHeaderColum("number", "Number:");

        Integer c;
        c = 1;

        t.name.add("One");
        t.number.add(c);
        c = c+1;
        t.name.add("two");
        t.number.add(c);
        c = c+1;
        t.name.add("three");
        t.number.add(c);

        t.toString();

        String s = "t.name";
        String y[] = s.split("\\.");
        System.out.println(y[1]);

        ATable tt;
        tt.name = t.name;
    }
}
