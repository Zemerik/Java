public class MethodOverriding {
    public static void main(String[] args) {
        // Create objects of different classes
        Shape shape = new Shape();
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        // Demonstrate method overriding
        System.out.println("Shape area: " + shape.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        
        // Polymorphic behavior
        Shape[] shapes = {shape, circle, rectangle};
        for (Shape s : shapes) {
            System.out.println("Area: " + s.calculateArea());
        }
    }
}

// Parent class
class Shape {
    public double calculateArea() {
        return 0.0;
    }
    
    public void displayInfo() {
        System.out.println("This is a shape");
    }
}

// Child class with method overriding
class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("This is a circle with radius: " + radius);
    }
}

// Another child class with method overriding
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("This is a rectangle with length: " + length + " and width: " + width);
    }
} 