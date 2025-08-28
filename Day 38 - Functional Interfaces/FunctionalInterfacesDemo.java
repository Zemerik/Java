import java.util.function.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        // Predicate - tests a condition
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        System.out.println("Is 'Hello' longer than 5? " + isLongerThan5.test("Hello"));
        System.out.println("Is 'Hello World' longer than 5? " + isLongerThan5.test("Hello World"));
        
        // Function - transforms input to output
        Function<String, Integer> getLength = String::length;
        System.out.println("Length of 'Java': " + getLength.apply("Java"));
        
        // Consumer - consumes input, no output
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello world");
        
        // Supplier - provides output, no input
        Supplier<Double> randomNumber = Math::random;
        System.out.println("Random number: " + randomNumber.get());
        
        // BiFunction - takes two inputs, produces output
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + " " + str2;
        System.out.println("Concatenated: " + concatenate.apply("Hello", "Java"));
        
        // UnaryOperator - same type input and output
        UnaryOperator<String> reverse = str -> new StringBuilder(str).reverse().toString();
        System.out.println("Reversed 'Java': " + reverse.apply("Java"));
        
        // BinaryOperator - same type inputs and output
        BinaryOperator<Integer> max = Integer::max;
        System.out.println("Max of 10 and 20: " + max.apply(10, 20));
        
        // Custom functional interface
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        
        System.out.println("5 + 3 = " + add.calculate(5, 3));
        System.out.println("5 * 3 = " + multiply.calculate(5, 3));
        
        // Method references
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println("Uppercase: " + toUpperCase.apply("hello"));
        
        // Constructor reference
        Supplier<StringBuilder> newStringBuilder = StringBuilder::new;
        StringBuilder sb = newStringBuilder.get();
        sb.append("Hello");
        System.out.println("New StringBuilder: " + sb.toString());
    }
}

// Custom functional interface
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
} 