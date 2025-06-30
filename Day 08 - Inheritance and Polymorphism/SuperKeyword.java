public class SuperKeyword {
    public static void main(String[] args) {
        // Create child class object
        Car car = new Car("Toyota", "Camry", 2020, "Gasoline");
        
        // Call methods
        car.displayInfo();
        car.startEngine();
    }
}

// Parent class
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println("Vehicle constructor called");
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
    
    public void startEngine() {
        System.out.println("Vehicle engine starting...");
    }
}

// Child class using super keyword
class Car extends Vehicle {
    private String fuelType;
    
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call parent constructor
        this.fuelType = fuelType;
        System.out.println("Car constructor called");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Fuel Type: " + fuelType);
    }
    
    @Override
    public void startEngine() {
        super.startEngine(); // Call parent method
        System.out.println("Car engine started with " + fuelType + " fuel");
    }
    
    // Method using super to access parent field
    public void showParentInfo() {
        System.out.println("Parent brand: " + super.brand);
        System.out.println("Parent model: " + super.model);
    }
} 