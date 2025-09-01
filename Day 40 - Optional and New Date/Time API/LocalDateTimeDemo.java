import java.time.*; 
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formatted = dateTime.format(fmt);
        System.out.println("Formatted: " + formatted);
        LocalDate parsedDate = LocalDate.parse("2024-01-15");
        System.out.println("Parsed date: " + parsedDate);
    }
}