/**
 * Day 22 - APIDemo.java
 * Demonstrates Java API usage
 */
import java.util.Random;
import java.util.Arrays;

public class APIDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        
        System.out.println("Original: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
} 