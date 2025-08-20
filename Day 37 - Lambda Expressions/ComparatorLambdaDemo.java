import java.util.*; 

public class ComparatorLambdaDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Bob","Alice","Charlie"));
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Ascending: " + names);
        names.sort((a, b) -> b.compareToIgnoreCase(a));
        System.out.println("Descending: " + names);
    }
}