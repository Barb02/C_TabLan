package java_Examples.example1;
import org.stringtemplate.v4.*;

public class testeStg {
    public static void main(String[] args) {
        STGroup templates = new STGroupFile("java_Examples/example1/teste.stg");

        ST d = templates.getInstanceOf("defineClassTable");
        d.add("classname","Atable");
        d.add("var","name");
        d.add("varType","String");
        d.add("var","number");
        d.add("varType","Integer");
        System.out.println(d.render());
    }
}
