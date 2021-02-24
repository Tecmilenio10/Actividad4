import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example {

    public static void main(String[] args) {
        HashMap<String, Object> myMap = new HashMap<>();

        myMap.put("An integer", 20);
        myMap.put("A double", 3.5);
        myMap.put("Other integer", Integer.valueOf(10));
        myMap.put("A string", "Hello");
        myMap.put("A boolean", false);
        myMap.put("An undefined object", null);

        System.out.println(myMap.containsKey("An integer"));
        System.out.println(myMap.containsValue(5.5));
        System.out.println(myMap.get("A string"));
        System.out.println(myMap.put("New element", "John Doe"));
        System.out.println(myMap.remove("An undefined object"));

        System.out.println("\n=== HASHMAP ELEMENTS ===");
        for (Map.Entry<String, Object> entry : myMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String output = String.format("{%s} , {%s}", key, value);
            System.out.println(output);
        }

    }

}