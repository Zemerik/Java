public class DefaultMethods {
    public static void main(String[] args) {
        // Create objects implementing interfaces with default methods
        Payable employee = new Employee("John", 50000);
        Payable contractor = new Contractor("Jane", 75, 40);
        
        // Call interface methods
        System.out.println("Employee:");
        employee.displayInfo();
        System.out.println("Salary: $" + employee.calculateSalary());
        System.out.println("Tax: $" + employee.calculateTax());
        
        System.out.println("\nContractor:");
        contractor.displayInfo();
        System.out.println("Salary: $" + contractor.calculateSalary());
        System.out.println("Tax: $" + contractor.calculateTax());
    }
}

// Interface with default method
interface Payable {
    double calculateSalary();
    
    // Default method - provides implementation
    default double calculateTax() {
        return calculateSalary() * 0.15; // 15% tax
    }
    
    // Another default method
    default void displayInfo() {
        System.out.println("This is a payable entity");
    }
}

// Class implementing the interface
class Employee implements Payable {
    private String name;
    private double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public double calculateSalary() {
        return salary;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Employee: " + name);
    }
    
    // Can override default method if needed
    @Override
    public double calculateTax() {
        return salary * 0.20; // 20% tax for employees
    }
}

// Another class implementing the same interface
class Contractor implements Payable {
    private String name;
    private double hourlyRate;
    private int hoursWorked;
    
    public Contractor(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Contractor: " + name + " (Rate: $" + hourlyRate + "/hr)");
    }
    
    // Uses default tax calculation (15%)
} 