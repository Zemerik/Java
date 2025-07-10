public class InheritanceHierarchyDemo {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.display();
    }
}

class Animal {
    public void display() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void display() {
        super.display();
        System.out.println("I am a dog.");
    }
}

class Puppy extends Dog {
    @Override
    public void display() {
        super.display();
        System.out.println("I am a puppy.");
    }
} 