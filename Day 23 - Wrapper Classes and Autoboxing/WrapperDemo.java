/**
 * Day 23 - WrapperDemo.java
 * Demonstrates wrapper classes and autoboxing
 */
public class WrapperDemo {
    public static void main(String[] args) {
        // Autoboxing
        Integer num = 42;
        Double price = 19.99;
        
        // Unboxing
        int value = num;
        double cost = price;
        
        // Wrapper class methods
        String str = Integer.toString(123);
        int parsed = Integer.parseInt("456");
        
        System.out.println("Autoboxed: " + num + ", " + price);
        System.out.println("Unboxed: " + value + ", " + cost);
        System.out.println("String: " + str + ", Parsed: " + parsed);
    }
} 