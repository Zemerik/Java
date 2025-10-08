/**
 * Day 50 - FileHandler.java
 * Capstone Project: File operations for student data
 */
import java.io.*;
import java.util.List;

public class FileHandler {
    private static final String FILE_NAME = "students.dat";
    
    public static void saveStudents(StudentManager manager) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(manager.getAllStudents());
            System.out.println("Students saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public static void loadStudents(StudentManager manager) {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No existing data file found. Starting with empty database.");
            return;
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Student> students = (List<Student>) ois.readObject();
            for (Student student : students) {
                manager.addStudent(student);
            }
            System.out.println("Students loaded from file successfully!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading students: " + e.getMessage());
        }
    }
    
    public static void exportToTextFile(StudentManager manager, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Student Management System - Data Export");
            writer.println("======================================");
            writer.println();
            
            List<Student> students = manager.getAllStudents();
            for (Student student : students) {
                writer.println("Name: " + student.getName());
                writer.println("Age: " + student.getAge());
                writer.println("Course: " + student.getCourse());
                writer.println("---");
            }
            
            System.out.println("Data exported to " + filename + " successfully!");
        } catch (IOException e) {
            System.out.println("Error exporting data: " + e.getMessage());
        }
    }
    
    public static void backupData(StudentManager manager) {
        String backupFileName = "students_backup_" + System.currentTimeMillis() + ".dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(backupFileName))) {
            oos.writeObject(manager.getAllStudents());
            System.out.println("Backup created: " + backupFileName);
        } catch (IOException e) {
            System.out.println("Error creating backup: " + e.getMessage());
        }
    }
} 