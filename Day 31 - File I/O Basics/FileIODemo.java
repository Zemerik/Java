/**
 * Day 31 - FileIODemo.java
 * Demonstrates file I/O basics
 */
import java.io.File;

public class FileIODemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 