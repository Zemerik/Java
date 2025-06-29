public class ClassAndObject {
    public static void main(String[] args) {
        // Create objects of Student class
        Student student1 = new Student("Alice", 20, "Computer Science");
        Student student2 = new Student("Bob", 22, "Mathematics");
        
        // Call methods on objects
        student1.displayInfo();
        student2.displayInfo();
        
        // Modify object state
        student1.setAge(21);
        student1.displayInfo();
    }
}

// Student class - blueprint for creating student objects
class Student {
    // Instance variables (state)
    private String name;
    private int age;
    private String major;
    
    // Constructor
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    // Instance methods (behavior)
    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", Major: " + major);
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getMajor() {
        return major;
    }
} 