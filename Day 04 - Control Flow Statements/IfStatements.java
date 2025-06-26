public class IfStatements {
    public static void main(String[] args) {
        int number = 42;

        // Simple if statement
        if (number > 0) {
            System.out.println(number + " is positive.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // if-else-if ladder
        if (number < 0) {
            System.out.println("Negative number");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive number");
        }

        // Nested if
        if (number > 0) {
            if (number < 100) {
                System.out.println(number + " is positive and less than 100.");
            }
        }
    }
} 