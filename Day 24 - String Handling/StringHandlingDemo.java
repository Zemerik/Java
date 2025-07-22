/**
 * Day 24 - StringHandlingDemo.java
 * Demonstrates string handling
 */
public class StringHandlingDemo {
    public static void main(String[] args) {
        String text = "Hello World";
        
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring: " + text.substring(0, 5));
        System.out.println("Contains 'World': " + text.contains("World"));
        
        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");
        System.out.println("StringBuilder: " + sb.toString());
    }
} 