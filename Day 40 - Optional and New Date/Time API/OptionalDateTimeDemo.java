/**
 * Day 40 - OptionalDateTimeDemo.java
 * Demonstrates Optional and Date/Time API
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class OptionalDateTimeDemo {
    public static void main(String[] args) {
        // Optional examples
        Optional<String> optionalName = Optional.of("Alice");
        Optional<String> emptyOptional = Optional.empty();
        
        System.out.println("Name: " + optionalName.orElse("Unknown"));
        System.out.println("Empty: " + emptyOptional.orElse("Default"));
        
        // Date/Time API examples
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        
        System.out.println("Today: " + today);
        System.out.println("Now: " + now);
        System.out.println("DateTime: " + dateTime);
        
        // Date formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = dateTime.format(formatter);
        System.out.println("Formatted: " + formatted);
        
        // Date arithmetic
        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextWeek = today.plusWeeks(1);
        
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Next week: " + nextWeek);
        
        // Duration
        Duration duration = Duration.ofHours(2);
        System.out.println("Duration: " + duration.toMinutes() + " minutes");
    }
} 