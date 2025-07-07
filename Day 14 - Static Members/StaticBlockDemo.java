public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Main method started");
        Example.display();
    }
}

class Example {
    static int value;
    static {
        System.out.println("Static block executed");
        value = 42;
    }
    public static void display() {
        System.out.println("Value: " + value);
    }
} 