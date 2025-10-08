/**
 * Day 50 - StudentManagementSystem.java
 * Capstone Project: Student Management System
 * Main application class
 */
import java.util.*;
import java.io.*;

public class StudentManagementSystem {
    private static StudentManager manager = new StudentManager();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== Student Management System ===");
        System.out.println("Welcome to the Java Learning Capstone Project!");
        
        // Load existing data
        FileHandler.loadStudents(manager);
        
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    FileHandler.saveStudents(manager);
                    System.out.println("Data saved successfully!");
                    break;
                case 7:
                    running = false;
                    System.out.println("Thank you for using the Student Management System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Save Data");
        System.out.println("7. Exit");
    }
    
    private static void addStudent() {
        System.out.println("\n--- Add Student ---");
        String name = getStringInput("Enter student name: ");
        int age = getIntInput("Enter student age: ");
        String course = getStringInput("Enter student course: ");
        
        Student student = new Student(name, age, course);
        manager.addStudent(student);
        System.out.println("Student added successfully!");
    }
    
    private static void viewAllStudents() {
        System.out.println("\n--- All Students ---");
        List<Student> students = manager.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            students.forEach(System.out::println);
        }
    }
    
    private static void searchStudent() {
        System.out.println("\n--- Search Student ---");
        String name = getStringInput("Enter student name to search: ");
        Optional<Student> student = manager.findStudentByName(name);
        
        if (student.isPresent()) {
            System.out.println("Found: " + student.get());
        } else {
            System.out.println("Student not found.");
        }
    }
    
    private static void updateStudent() {
        System.out.println("\n--- Update Student ---");
        String name = getStringInput("Enter student name to update: ");
        Optional<Student> existingStudent = manager.findStudentByName(name);
        
        if (existingStudent.isPresent()) {
            int newAge = getIntInput("Enter new age: ");
            String newCourse = getStringInput("Enter new course: ");
            
            Student updatedStudent = new Student(name, newAge, newCourse);
            manager.updateStudent(name, updatedStudent);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
    
    private static void deleteStudent() {
        System.out.println("\n--- Delete Student ---");
        String name = getStringInput("Enter student name to delete: ");
        
        if (manager.deleteStudent(name)) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
    
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
} 