/**
 * Day 12 - ClassObjectDemo.java
 * Demonstrates class and object creation
 */
class Car {
    String model;
    void drive() {
        System.out.println(model + " is driving.");
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.drive();
    }
} 