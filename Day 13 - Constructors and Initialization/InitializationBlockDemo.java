public class InitializationBlockDemo {
    public static void main(String[] args) {
        System.out.println("Creating first object:");
        Example ex1 = new Example();
        System.out.println("Creating second object:");
        Example ex2 = new Example();
    }
}

class Example {
    static {
        System.out.println("Static block: Runs once when class is loaded");
    }

    {
        System.out.println("Instance block: Runs before constructor for every object");
    }

    public Example() {
        System.out.println("Constructor: Runs after instance block");
    }
} 