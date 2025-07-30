import java.util.HashMap;
import java.util.Map;

public class StudentGradesMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 90);
        grades.put("Bob", 85);
        grades.put("Charlie", 92);
        grades.put("Alice", 95); // Overwrites previous value
        for (String name : grades.keySet()) {
            System.out.println(name + " -> " + grades.get(name));
        }
    }
} 