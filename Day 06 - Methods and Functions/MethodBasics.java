public class MethodBasics {
    public static void main(String[] args) {
        // Call instance method
        MethodBasics obj = new MethodBasics();
        obj.greet("Alice");
        
        // Call static method
        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);
        
        // Call void method
        printMessage("Hello from void method!");
    }
    
    // Instance method
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    // Static method with return value
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Void method (no return value)
    public static void printMessage(String message) {
        System.out.println(message);
    }
} 