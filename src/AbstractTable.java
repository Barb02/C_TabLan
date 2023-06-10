
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public abstract class AbstractTable {
    Map<String,String> headersMap = new HashMap<>();
    String headerTable = "";

    public void setHeaderColum(String header, String name){
        headersMap.replace(header, name);
    }

    public void setHeaderTable(String header){
        this.headerTable = header;
    }

    public static int columnSize(String header,List<Object> cenas){
        int size = header.length();
         for (Object string : cenas) {
             String result = string!=null ? string.toString() : " ";
             if(result.length() > size) size = result.length();
         }
         return size;
    }

    public abstract String toString();
}
