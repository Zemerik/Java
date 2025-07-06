public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 21);
        s1.display();
        s2.display();
        s3.display();
    }
}

class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    public Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student: " + name + ", Age: " + age);
    }
} 