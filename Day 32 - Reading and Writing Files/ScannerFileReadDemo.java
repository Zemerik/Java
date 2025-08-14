import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileReadDemo {
    public static void main(String[] args) throws IOException {
        String filename = "scanner-demo.txt";
        // Prepare a file
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write("apple\nbanana\ncarrot\n");
        }
        // Read using Scanner
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        new File(filename).delete();
    }
}