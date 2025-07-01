public class AbstractClassBasics {
    public static void main(String[] args) {
        // Cannot create instance of abstract class
        // Shape shape = new Shape(); // This would cause error
        
        // Create instances of concrete subclasses
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        // Call methods
        circle.displayInfo();
        circle.calculateArea();
        
        rectangle.displayInfo();
        rectangle.calculateArea();
        
        // Use abstract class as type
        Shape[] shapes = {circle, rectangle};
        for (Shape shape : shapes) {
            shape.displayInfo();
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}

// Abstract class - cannot be instantiated
abstract class Shape {
    protected String color;
    
    public Shape() {
        this.color = "Black";
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract double calculateArea();
    
    // Concrete method - has implementation
    public void displayInfo() {
        System.out.println("This is a " + color + " shape");
    }
    
    // Another concrete method
    public void setColor(String color) {
        this.color = color;
    }
}

// Concrete class extending abstract class
class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        super(); // Call parent constructor
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Circle with radius: " + radius);
    }
}

// Another concrete class
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Rectangle with length: " + length + " and width: " + width);
    }
} 