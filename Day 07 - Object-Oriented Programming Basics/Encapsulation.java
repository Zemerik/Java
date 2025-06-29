public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        // Using public methods to access private fields
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSalary(50000);
        
        // Display employee information
        emp.displayInfo();
        
        // Try to set invalid age
        emp.setAge(-5); // This will be ignored due to validation
        
        // Try to set invalid salary
        emp.setSalary(-1000); // This will be ignored due to validation
        
        emp.displayInfo();
    }
}

class Employee {
    // Private fields - data hiding
    private String name;
    private int age;
    private double salary;
    
    // Public getter and setter methods - controlled access
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age + ". Age must be between 0 and 150.");
        }
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary: " + salary + ". Salary must be positive.");
        }
    }
    
    // Public method to display information
    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }
} 