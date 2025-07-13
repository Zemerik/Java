public class UpcastingDowncastingDemo {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog(); // Dog is upcasted to Animal
        animal.makeSound(); // Calls Dog's makeSound (runtime polymorphism)

        // Downcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcast back to Dog
            dog.fetch();
        }

        // Unsafe downcasting
        Animal anotherAnimal = new Cat();
        if (anotherAnimal instanceof Dog) {
            Dog notADog = (Dog) anotherAnimal; // This block won't run
        } else {
            System.out.println("Cannot cast Cat to Dog");
        }
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    public void fetch() {
        System.out.println("Dog is fetching a ball!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
} 