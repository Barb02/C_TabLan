import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class ReadFileVisit extends ReadCsvFileBaseVisitor<String> {
    Map<String, List<String>> data = new HashMap<>();  // Map of all values
    ArrayList<String> headers = new ArrayList<String>(); // List of all columns
   
    @Override
    public String visitProgram(ReadCsvFileParser.ProgramContext ctx) {
        if (ctx.header() != null) {
            visit(ctx.header());
        }
      
        if (ctx.line() != null) {
            for (ReadCsvFileParser.LineContext sc : ctx.line())
                visit(sc);
        }
      
        // print map of all values
        // for (Map.Entry<String, List<String>> entry : data.entrySet()) {
        //     System.out.println(entry.getKey() + " = " + entry.getValue());
        // }
      
        return null;
    }
   
    @Override
    public String visitHeader(ReadCsvFileParser.HeaderContext ctx) {
        String[] headerParts = ctx.getText().split("[,;\\n\\r]+");
        for (int i = 0; i < headerParts.length; i++) {
            headers.add(headerParts[i]);
        }
        return null;
    }
   
    @Override
    public String visitLine(ReadCsvFileParser.LineContext ctx) {
        LinkedHashMap<String, String> valores = new LinkedHashMap<String, String>();
      
        int i = 0;
        String headerPlaceholder = "placeholder";
        for (ReadCsvFileParser.FieldContext sc : ctx.field()) {
            try {
                valores.put(headers.get(i), visit(sc));
            } catch (IndexOutOfBoundsException e) {
               String iString = Integer.toString(i);
                valores.put(headerPlaceholder + iString, visit(sc));
            }
            i++;
        }
      
        for (String header : headers) {
            if (!valores.containsKey(header)) {
                valores.put(header, null);
            }
        }
      
        for (Map.Entry<String, String> entry : valores.entrySet()) {
            String header = entry.getKey();
            String valor = entry.getValue();
            data.computeIfAbsent(header, k -> new ArrayList<String>()).add(valor);
        }
      
        return null;
    }
   
    @Override
    public String visitField(ReadCsvFileParser.FieldContext ctx) {
        return ctx.getText();   // Return the value of field (number or text)
    }
}
