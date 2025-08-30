/**
 * Day 39 - StreamsAPIDemo.java
 * Demonstrates Streams API usage
 */
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsAPIDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                          .filter(n -> n % 2 == 0)
                                          .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        
        // Map to squares
        List<Integer> squares = numbers.stream()
                                      .map(n -> n * n)
                                      .collect(Collectors.toList());
        System.out.println("Squares: " + squares);
        
        // Reduce to sum
        int sum = numbers.stream()
                        .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        
        // Complex pipeline
        int result = numbers.stream()
                           .filter(n -> n > 5)
                           .map(n -> n * 2)
                           .reduce(0, Integer::sum);
        System.out.println("Complex result: " + result);
        
        // String operations
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        List<String> upperCaseWords = words.stream()
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());
        System.out.println("Uppercase words: " + upperCaseWords);
    }
} 