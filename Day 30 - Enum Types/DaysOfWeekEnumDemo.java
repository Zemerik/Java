public class DaysOfWeekEnumDemo {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek day");
        }
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
} 