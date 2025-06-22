/**
 * Day 01 - Comments.java
 * Understanding Comments in Java
 * 
 * This program demonstrates the three types of comments in Java:
 * 1. Single-line comments
 * 2. Multi-line comments
 * 3. Documentation comments (JavaDoc)
 */

/**
 * This is a documentation comment (JavaDoc)
 * It's used to generate documentation for your code
 * 
 * @author Your Name
 * @version 1.0
 * @since 2025
 */
public class Comments {
    
    // This is a single-line comment
    // It starts with // and continues to the end of the line
    
    /*
     * This is a multi-line comment
     * It starts with /* and ends with */
    /*
     * You can write multiple lines
     * of comments like this
     */
    
    /**
     * Main method - demonstrates different comment types
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Print information about comments
        System.out.println("=== Java Comments Demo ===");
        System.out.println();
        
        // Demonstrate single-line comments
        System.out.println("1. Single-line comments:");
        System.out.println("   // This is a single-line comment");
        System.out.println();
        
        // Demonstrate multi-line comments
        System.out.println("2. Multi-line comments:");
        System.out.println("   /* This is a multi-line comment */");
        System.out.println();
        
        // Demonstrate documentation comments
        System.out.println("3. Documentation comments:");
        System.out.println("   /** This is JavaDoc comment */");
        System.out.println();
        
        // Show best practices
        System.out.println("Best Practices:");
        System.out.println("- Use comments to explain WHY, not WHAT");
        System.out.println("- Keep comments up to date with code changes");
        System.out.println("- Use meaningful variable and method names");
        System.out.println("- Write self-documenting code when possible");
        
        // Calculate and display a simple example
        int number = 42; // This is the answer to everything
        System.out.println("\nExample: The number is " + number);
    }
    
    /**
     * This method demonstrates how to use JavaDoc comments
     * for documenting methods
     * 
     * @param name the name to greet
     * @return a greeting message
     */
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
} 