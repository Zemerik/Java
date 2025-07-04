/**
 * Day 11 - OOPIntro.java
 * Simple demonstration of OOP concepts
 */
class Animal {
    void speak() {
        System.out.println("The animal makes a sound.");
    }
}

public class OOPIntro {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
    }
} 