public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayInfo();
    }
}

class Animal {
    String name = "Animal";
    public void displayInfo() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    String name = "Dog";
    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Parent name: " + super.name);
        super.displayInfo();
        System.out.println("This is a dog.");
    }
} 