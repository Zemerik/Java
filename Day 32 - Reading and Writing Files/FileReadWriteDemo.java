/**
 * Day 32 - FileReadWriteDemo.java
 * Demonstrates file reading and writing
 */
import java.io.*;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        // Writing to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, this is a test file!");
            writer.newLine();
            writer.write("This is the second line.");
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        
        // Reading from file
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
} 