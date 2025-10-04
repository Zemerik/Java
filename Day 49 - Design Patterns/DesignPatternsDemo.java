/**
 * Day 49 - DesignPatternsDemo.java
 * Demonstrates design patterns
 */

// Singleton Pattern
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void doSomething() {
        System.out.println("Singleton instance working!");
    }
}

// Factory Pattern
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return null;
    }
}

// Observer Pattern
interface Observer {
    void update(String message);
}

class Subject {
    private java.util.List<Observer> observers = new java.util.ArrayList<>();
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

class ConcreteObserver implements Observer {
    private String name;
    
    public ConcreteObserver(String name) {
        this.name = name;
    }
    
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

public class DesignPatternsDemo {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Same instance: " + (singleton1 == singleton2));
        singleton1.doSomething();
        
        // Factory
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");
        dog.makeSound();
        cat.makeSound();
        
        // Observer
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        
        subject.attach(observer1);
        subject.attach(observer2);
        subject.notifyObservers("Hello Observers!");
    }
} 