/**
 * Day 17 - OverridingDemo.java
 * Demonstrates method overriding
 */
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
} 