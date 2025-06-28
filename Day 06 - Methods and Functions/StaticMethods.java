public class StaticMethods {
    private String instanceVariable = "Instance Variable";
    private static String staticVariable = "Static Variable";
    
    public static void main(String[] args) {
        // Call static methods directly
        staticMethod();
        System.out.println("Static variable: " + staticVariable);
        
        // Create object to call instance methods
        StaticMethods obj = new StaticMethods();
        obj.instanceMethod();
        System.out.println("Instance variable: " + obj.instanceVariable);
        
        // Static method can call other static methods
        staticMethod2();
    }
    
    // Static method - belongs to class
    public static void staticMethod() {
        System.out.println("This is a static method");
        // Can access static variables
        System.out.println("Accessing static variable: " + staticVariable);
        // Cannot access instance variables directly
        // System.out.println(instanceVariable); // This would cause error
    }
    
    public static void staticMethod2() {
        System.out.println("Another static method");
        staticMethod(); // Can call other static methods
    }
    
    // Instance method - belongs to object
    public void instanceMethod() {
        System.out.println("This is an instance method");
        // Can access both static and instance variables
        System.out.println("Accessing instance variable: " + instanceVariable);
        System.out.println("Accessing static variable: " + staticVariable);
        // Can call static methods
        staticMethod();
    }
} 