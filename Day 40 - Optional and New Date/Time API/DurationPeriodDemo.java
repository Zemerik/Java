import java.time.*; 

public class DurationPeriodDemo {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 6, 15);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");

        LocalTime startTime = LocalTime.of(9, 30);
        LocalTime endTime = LocalTime.of(17, 45);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration hours: " + duration.toHours() + ", minutes: " + duration.toMinutesPart());
    }
}