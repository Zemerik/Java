public class PolymorphismMethodDemo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal anotherAnimal = new Cat();
        
        // Pass different subclasses to the same method
        printAnimalSound(animal);
        printAnimalSound(anotherAnimal);
        
        // Return type polymorphism
        Animal created = createAnimal("dog");
        created.makeSound();
    }
    
    public static void printAnimalSound(Animal animal) {
        animal.makeSound();
    }
    
    public static Animal createAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else {
            return new Cat();
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
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
} 