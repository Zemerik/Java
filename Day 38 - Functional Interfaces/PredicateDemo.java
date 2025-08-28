import java.util.function.Predicate; 

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> nonEmpty = s -> s != null && !s.isEmpty();
        Predicate<String> longStr = s -> s.length() > 5;
        Predicate<String> combined = nonEmpty.and(longStr);
        System.out.println(combined.test("hello")); // false
        System.out.println(combined.test("helloooo")); // true
        System.out.println(nonEmpty.negate().test("")); // true
    }
}