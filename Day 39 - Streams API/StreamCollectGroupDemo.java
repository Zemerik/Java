import java.util.*; 
import java.util.stream.*;

public class StreamCollectGroupDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ann","Bob","Alice","Brian");
        Map<Character, List<String>> byFirstLetter = names.stream()
            .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(byFirstLetter);
        String joined = names.stream().collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);
    }
}