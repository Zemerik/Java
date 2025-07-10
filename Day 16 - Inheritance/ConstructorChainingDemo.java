public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

class Parent {
    public Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    public Child() {
        super();
        System.out.println("Child constructor called");
    }
} 