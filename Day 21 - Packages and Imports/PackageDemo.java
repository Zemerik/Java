/**
 * Day 21 - PackageDemo.java
 * Demonstrates packages and imports
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class PackageDemo {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Today: " + sdf.format(now));
    }
} 