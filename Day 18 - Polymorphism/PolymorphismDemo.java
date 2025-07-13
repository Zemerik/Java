/**
 * Day 18 - PolymorphismDemo.java
 * Demonstrates polymorphism
 */
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();
    }
} 