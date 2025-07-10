/**
 * Day 16 - InheritanceDemo.java
 * Demonstrates inheritance
 */
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
} 