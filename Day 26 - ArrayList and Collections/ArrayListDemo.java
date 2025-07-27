/**
 * Day 26 - ArrayListDemo.java
 * Demonstrates ArrayList and collections
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println("Names: " + names);
        System.out.println("Size: " + names.size());
        System.out.println("Contains Bob: " + names.contains("Bob"));
        
        names.remove("Bob");
        System.out.println("After removal: " + names);
    }
} 