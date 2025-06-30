public class Polymorphism {
    public static void main(String[] args) {
        // Runtime polymorphism - method overriding
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        
        // Same method call, different behavior
        animal1.makeSound(); // Animal sound
        animal2.makeSound(); // Dog sound
        animal3.makeSound(); // Cat sound
        
        // Compile-time polymorphism - method overloading
        Calculator calc = new Calculator();
        System.out.println("add(5, 3): " + calc.add(5, 3));
        System.out.println("add(5.5, 3.2): " + calc.add(5.5, 3.2));
        System.out.println("add(5, 3, 2): " + calc.add(5, 3, 2));
    }
}

// Base class
class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

// Derived class
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Another derived class
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Class demonstrating compile-time polymorphism (method overloading)
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
} 