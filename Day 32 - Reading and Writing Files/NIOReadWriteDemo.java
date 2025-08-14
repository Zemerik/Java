import java.nio.file.*; 
import java.io.IOException;
import java.util.*;

public class NIOReadWriteDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("nio-io.txt");
        List<String> lines = Arrays.asList("A", "B", "C");
        Files.write(path, lines);
        List<String> read = Files.readAllLines(path);
        System.out.println("Read lines: " + read);
        Files.deleteIfExists(path);
    }
}