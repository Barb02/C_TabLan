package java_Examples.example1;
import java.util.*;

public class ATable extends Table {
        List<String> name = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        List<Double> average = new ArrayList<>();

        private int formula(int n1, int n2){
            int v5 = n1;
            int v6 = n2;
            int v4 = v5 + v6;
            int v7 = 2;
            int v3 = v4 / v7;
            return v3;
        }

        ATable(){
            headersMap.put("name","Name:");
        }

        @Override
        public String toString() {
            List<String> format = new ArrayList<>();
            System.out.println(headersMap.get("header"));
            int nameMaxSize = headersMap.get("name").length();
            for (Object string : name) {
                if(string.toString().length() > nameMaxSize) nameMaxSize = string.toString().length();
            }
            format.add("| %"+nameMaxSize+"s ");
            int numberMaxSize = headersMap.get("number").length();
            for (Object string : number) {
                if(string.toString().length() > numberMaxSize) numberMaxSize = string.toString().length();
            }
            format.add("| %"+numberMaxSize+"s ");
            String s = "";
            for (String string : format) {
                s += string;
            }
            s+= "|%n";
            System.out.printf(s, headersMap.get("name"),headersMap.get("number"));
            for (int i = 0; i < name.size(); i++) {
                System.out.printf(s, name.get(i),number.get(i));
            }
            return "\n";
        }
    }