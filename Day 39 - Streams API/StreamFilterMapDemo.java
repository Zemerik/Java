import java.util.*; 
import java.util.stream.Collectors;

public class StreamFilterMapDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java","stream","api","demo");
        List<Integer> lengths = words.stream()
            .filter(w -> w.length() > 3)
            .map(String::length)
            .collect(Collectors.toList());
        System.out.println(lengths);
    }
}