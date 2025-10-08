/**
 * Day 50 - StudentManager.java
 * Capstone Project: Business logic for student management
 */
import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> students;
    
    public StudentManager() {
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        if (student != null && !findStudentByName(student.getName()).isPresent()) {
            students.add(student);
        }
    }
    
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
    
    public Optional<Student> findStudentByName(String name) {
        return students.stream()
                      .filter(student -> student.getName().equalsIgnoreCase(name))
                      .findFirst();
    }
    
    public boolean updateStudent(String name, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                students.set(i, updatedStudent);
                return true;
            }
        }
        return false;
    }
    
    public boolean deleteStudent(String name) {
        return students.removeIf(student -> student.getName().equalsIgnoreCase(name));
    }
    
    public List<Student> getStudentsByCourse(String course) {
        return students.stream()
                      .filter(student -> student.getCourse().equalsIgnoreCase(course))
                      .collect(Collectors.toList());
    }
    
    public List<Student> getStudentsByAgeRange(int minAge, int maxAge) {
        return students.stream()
                      .filter(student -> student.getAge() >= minAge && student.getAge() <= maxAge)
                      .collect(Collectors.toList());
    }
    
    public double getAverageAge() {
        return students.stream()
                      .mapToInt(Student::getAge)
                      .average()
                      .orElse(0.0);
    }
    
    public Map<String, Long> getCourseStatistics() {
        return students.stream()
                      .collect(Collectors.groupingBy(
                          Student::getCourse,
                          Collectors.counting()
                      ));
    }
    
    public int getTotalStudents() {
        return students.size();
    }
    
    public void clearAllStudents() {
        students.clear();
    }
} 