public class InterfaceBasics {
    public static void main(String[] args) {
        // Create objects implementing interfaces
        Drawable circle = new Circle(5);
        Drawable rectangle = new Rectangle(4, 6);
        
        // Call interface methods
        circle.draw();
        rectangle.draw();
        
        // Use interface as type
        Drawable[] shapes = {circle, rectangle};
        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}

// Interface - defines a contract
interface Drawable {
    void draw(); // Abstract method (no body)
    String getColor(); // Another abstract method
}

// Class implementing the interface
class Circle implements Drawable {
    private double radius;
    private String color = "Red";
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
    
    @Override
    public String getColor() {
        return color;
    }
}

// Another class implementing the same interface
class Rectangle implements Drawable {
    private double length;
    private double width;
    private String color = "Blue";
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }
    
    @Override
    public String getColor() {
        return color;
    }
} 