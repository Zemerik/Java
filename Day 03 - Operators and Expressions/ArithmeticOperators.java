/**
 * Day 03 - ArithmeticOperators.java
 * Understanding Arithmetic Operators
 * 
 * This program demonstrates all arithmetic operators in Java
 * and their usage with different data types.
 */
public class ArithmeticOperators {
    
    public static void main(String[] args) {
        System.out.println("=== Arithmetic Operators Demo ===");
        System.out.println();
        
        // Basic arithmetic operations
        int a = 10;
        int b = 3;
        
        System.out.println("Basic Arithmetic Operations:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
        System.out.println("Division: " + a + " / " + b + " = " + (a / b));
        System.out.println("Modulo: " + a + " % " + b + " = " + (a % b));
        System.out.println();
        
        // Integer division vs floating-point division
        System.out.println("Integer vs Floating-Point Division:");
        int intResult = 7 / 2;
        double doubleResult = 7.0 / 2.0;
        System.out.println("Integer division (7 / 2): " + intResult);
        System.out.println("Floating-point division (7.0 / 2.0): " + doubleResult);
        System.out.println();
        
        // Increment and decrement operators
        System.out.println("Increment and Decrement Operators:");
        int x = 5;
        System.out.println("Original value: x = " + x);
        
        // Post-increment
        System.out.println("Post-increment (x++): " + x++);
        System.out.println("After post-increment: x = " + x);
        
        // Pre-increment
        System.out.println("Pre-increment (++x): " + ++x);
        System.out.println("After pre-increment: x = " + x);
        
        // Post-decrement
        System.out.println("Post-decrement (x--): " + x--);
        System.out.println("After post-decrement: x = " + x);
        
        // Pre-decrement
        System.out.println("Pre-decrement (--x): " + --x);
        System.out.println("After pre-decrement: x = " + x);
        System.out.println();
        
        // Assignment operators
        System.out.println("Assignment Operators:");
        int num = 10;
        System.out.println("Original value: num = " + num);
        
        num += 5; // Same as num = num + 5
        System.out.println("After num += 5: " + num);
        
        num -= 3; // Same as num = num - 3
        System.out.println("After num -= 3: " + num);
        
        num *= 2; // Same as num = num * 2
        System.out.println("After num *= 2: " + num);
        
        num /= 4; // Same as num = num / 4
        System.out.println("After num /= 4: " + num);
        
        num %= 3; // Same as num = num % 3
        System.out.println("After num %= 3: " + num);
        System.out.println();
        
        // Working with different data types
        System.out.println("Mixed Data Types:");
        int intValue = 10;
        double doubleValue = 3.5;
        
        double result1 = intValue + doubleValue; // int promoted to double
        int result2 = intValue + (int) doubleValue; // double cast to int
        
        System.out.println("int + double = " + result1);
        System.out.println("int + (int)double = " + result2);
        System.out.println();
        
        // Practical examples
        System.out.println("Practical Examples:");
        
        // Calculate area of a circle
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + ": " + area);
        
        // Calculate percentage
        int total = 85;
        int obtained = 68;
        double percentage = (double) obtained / total * 100;
        System.out.println("Percentage: " + percentage + "%");
        
        // Check if number is even or odd
        int number = 17;
        boolean isEven = (number % 2 == 0);
        System.out.println(number + " is " + (isEven ? "even" : "odd"));
    }
} 