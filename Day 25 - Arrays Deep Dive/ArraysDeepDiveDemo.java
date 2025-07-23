/**
 * Day 25 - ArraysDeepDiveDemo.java
 * Demonstrates advanced array operations
 */
import java.util.Arrays;

public class ArraysDeepDiveDemo {
    public static void main(String[] args) {
        // 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("2D Array:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        
        // Array sorting
        int[] numbers = {5, 2, 8, 1, 9};
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
        
        // Array searching
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);
    }
} 