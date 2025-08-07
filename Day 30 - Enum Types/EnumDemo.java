/**
 * Day 30 - EnumDemo.java
 * Demonstrates enum types
 */
enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumDemo {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.MONDAY;
        System.out.println("Today is: " + today);
        
        // Switch with enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of work week");
                break;
            case FRIDAY:
                System.out.println("TGIF!");
                break;
            default:
                System.out.println("Regular day");
        }
        
        // Enum values
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
} 