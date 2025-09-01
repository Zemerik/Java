import java.util.Optional; 

public class OptionalBasicsDemo {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("hello");
        Optional<String> opt2 = Optional.ofNullable(null);
        System.out.println(opt1.orElse("default"));
        System.out.println(opt2.orElse("default"));
        opt1.ifPresent(v -> System.out.println("Present: " + v));
    }
}