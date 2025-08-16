/**
 * Day 33 - SerializationDemo.java
 * Demonstrates object serialization
 */
import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    private transient String password; // Won't be serialized
    
    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "secret123");
        
        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Object serialized successfully!");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
        
        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Deserialized object: " + deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
} 