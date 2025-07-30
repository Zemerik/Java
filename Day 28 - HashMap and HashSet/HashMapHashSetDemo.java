/**
 * Day 28 - HashMapHashSetDemo.java
 * Demonstrates HashMap and HashSet
 */
import java.util.HashMap;
import java.util.HashSet;

public class HashMapHashSetDemo {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 95);
        grades.put("Bob", 87);
        grades.put("Charlie", 92);
        
        System.out.println("Grades: " + grades);
        System.out.println("Alice's grade: " + grades.get("Alice"));
        
        // HashSet
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate
        uniqueNames.add("Charlie");
        
        System.out.println("Unique names: " + uniqueNames);
    }
} 