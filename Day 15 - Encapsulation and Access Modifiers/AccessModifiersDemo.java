public class AccessModifiersDemo {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        // example.privateMethod(); // Not accessible
    }
}

class AccessExample {
    public void publicMethod() {
        System.out.println("Public method called");
    }
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }
    void defaultMethod() {
        System.out.println("Default (package-private) method called");
    }
    private void privateMethod() {
        System.out.println("Private method called");
    }
} 