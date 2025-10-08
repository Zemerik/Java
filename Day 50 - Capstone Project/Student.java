/**
 * Day 50 - Student.java
 * Capstone Project: Student model class
 */
import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String course;
    private static final long serialVersionUID = 1L;
    
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    @Override
    public String toString() {
        return String.format("Student{name='%s', age=%d, course='%s'}", name, age, course);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.name);
    }
    
    @Override
    public int hashCode() {
        return name.hashCode();
    }
} 