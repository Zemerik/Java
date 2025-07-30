import java.util.HashMap;
import java.util.Map;

public class HashMapIterationDemo {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");

        System.out.println("Iterate using keySet():");
        for (String country : capitals.keySet()) {
            System.out.println(country + " -> " + capitals.get(country));
        }

        System.out.println("\nIterate using entrySet():");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
} 