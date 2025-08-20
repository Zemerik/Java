/**
 * Day 37 - LambdaDemo.java
 * Demonstrates lambda expressions
 */
import java.util.List;
import java.util.Arrays;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Lambda expressions
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;
        
        System.out.println("Addition: " + add.operate(5, 3));
        System.out.println("Multiplication: " + multiply.operate(5, 3));
        
        // Lambda with collections
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Using lambda for iteration
        names.forEach(name -> System.out.println("Hello, " + name));
        
        // Method reference
        names.forEach(System.out::println);
        
        // Lambda with filtering
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
} 