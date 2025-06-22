/**
 * Day 01 - BasicStructure.java
 * Understanding Java Program Structure
 * 
 * This program demonstrates the essential components of a Java program
 * and explains each part in detail.
 */

// Import statements (we'll learn more about these later)
import java.util.Date;

/**
 * This class demonstrates the basic structure of a Java program
 * Class names should start with a capital letter and use CamelCase
 */
public class BasicStructure {
    
    // Class-level variables (we'll learn about these in detail later)
    private static final String PROGRAM_NAME = "Basic Structure Demo";
    
    /**
     * Main method - the entry point of the program
     * This method must be public, static, and void
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Method calls and program logic go here
        printProgramInfo();
        demonstrateStructure();
        showCurrentTime();
    }
    
    /**
     * This method prints information about the program
     * Methods should have descriptive names and do one thing well
     */
    public static void printProgramInfo() {
        System.out.println("=== " + PROGRAM_NAME + " ===");
        System.out.println("This program demonstrates Java structure.");
        System.out.println();
    }
    
    /**
     * Demonstrates different parts of Java structure
     */
    public static void demonstrateStructure() {
        System.out.println("Java Program Structure:");
        System.out.println("1. Package declaration (optional)");
        System.out.println("2. Import statements");
        System.out.println("3. Class declaration");
        System.out.println("4. Class variables and methods");
        System.out.println("5. Main method (entry point)");
        System.out.println();
    }
    
    /**
     * Shows how to use imported classes
     */
    public static void showCurrentTime() {
        Date currentTime = new Date();
        System.out.println("Current time: " + currentTime);
        System.out.println("Program completed successfully!");
    }
} 