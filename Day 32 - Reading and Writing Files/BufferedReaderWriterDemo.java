import java.io.*; 

public class BufferedReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        String filename = "buffered-demo.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Line 1\n");
            writer.write("Line 2\n");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        new File(filename).delete();
    }
}