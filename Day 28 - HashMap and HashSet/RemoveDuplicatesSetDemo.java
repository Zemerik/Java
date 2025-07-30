import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesSetDemo {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Unique: " + uniqueNumbers);
    }
} 