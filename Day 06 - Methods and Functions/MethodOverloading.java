public class MethodOverloading {
    public static void main(String[] args) {
        // Different number of parameters
        System.out.println("add(5, 3): " + add(5, 3));
        System.out.println("add(5, 3, 2): " + add(5, 3, 2));
        
        // Different parameter types
        System.out.println("add(5.5, 3.2): " + add(5.5, 3.2));
        System.out.println("add(5, 3.2): " + add(5, 3.2));
        
        // Different parameter order
        System.out.println("printInfo(\"John\", 25): ");
        printInfo("John", 25);
        System.out.println("printInfo(30, \"Jane\"): ");
        printInfo(30, "Jane");
    }
    
    // Method overloading with different number of parameters
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method overloading with different parameter types
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double add(int a, double b) {
        return a + b;
    }
    
    // Method overloading with different parameter order
    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void printInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
} 