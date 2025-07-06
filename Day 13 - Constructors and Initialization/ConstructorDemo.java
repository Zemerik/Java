/**
 * Day 13 - ConstructorDemo.java
 * Demonstrates constructors and initialization
 */
class Person {
    String name;
    int age;
    
    // Default constructor
    Person() {
        name = "Unknown";
        age = 0;
    }
    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice", 30);
        System.out.println(p1.name + ", " + p1.age);
        System.out.println(p2.name + ", " + p2.age);
    }
} 
 