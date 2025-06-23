/**
 * Day 02 - VariableBasics.java
 * Understanding Variables and Data Types
 * 
 * This program demonstrates how to declare, initialize, and use variables
 * in Java with different data types.
 */
public class VariableBasics {
    
    public static void main(String[] args) {
        System.out.println("=== Variable Basics Demo ===");
        System.out.println();
        
        // Integer variables
        int age = 25;
        int year = 2025;
        int temperature = -5;
        
        System.out.println("Integer Variables:");
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println();
        
        // Floating-point variables
        double height = 1.75;
        double weight = 68.5;
        float pi = 3.14159f; // Note the 'f' suffix for float
        
        System.out.println("Floating-Point Variables:");
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Pi: " + pi);
        System.out.println();
        
        // Character variables
        char grade = 'A';
        char symbol = '$';
        char newline = '\n';
        
        System.out.println("Character Variables:");
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);
        System.out.println("Newline character demonstration:");
        System.out.print("Line 1" + newline + "Line 2");
        System.out.println();
        
        // Boolean variables
        boolean isStudent = true;
        boolean isWorking = false;
        boolean isJavaFun = true;
        
        System.out.println("\nBoolean Variables:");
        System.out.println("Is Student: " + isStudent);
        System.out.println("Is Working: " + isWorking);
        System.out.println("Is Java Fun: " + isJavaFun);
        System.out.println();
        
        // String variables (reference type, not primitive)
        String name = "John Doe";
        String city = "New York";
        String hobby = "Programming";
        
        System.out.println("String Variables:");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Hobby: " + hobby);
        System.out.println();
        
        // Variable operations
        System.out.println("Variable Operations:");
        int x = 10;
        int y = 5;
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        double quotient = (double) x / y; // Type casting for accurate division
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println();
        
        // Variable scope demonstration
        demonstrateScope();
    }
    
    /**
     * Demonstrates variable scope
     */
    public static void demonstrateScope() {
        System.out.println("Variable Scope Demo:");
        
        int localVariable = 42;
        System.out.println("Local variable value: " + localVariable);
        
        // This would cause an error - localVariable is not accessible here
        // System.out.println("Trying to access from outside scope: " + localVariable);
        
        System.out.println("Variables declared inside a method are local to that method.");
    }
} 