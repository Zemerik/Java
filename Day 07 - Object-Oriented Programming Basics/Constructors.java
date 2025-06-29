public class Constructors {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle rect1 = new Rectangle();
        rect1.display();
        
        // Using parameterized constructor
        Rectangle rect2 = new Rectangle(5, 3);
        rect2.display();
        
        // Using copy constructor
        Rectangle rect3 = new Rectangle(rect2);
        rect3.display();
    }
}

class Rectangle {
    private double length;
    private double width;
    
    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
        System.out.println("Default constructor called");
    }
    
    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Parameterized constructor called");
    }
    
    // Copy constructor
    public Rectangle(Rectangle other) {
        this.length = other.length;
        this.width = other.width;
        System.out.println("Copy constructor called");
    }
    
    public void display() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
    
    public double calculateArea() {
        return length * width;
    }
} 