public class BreakContinue {
    public static void main(String[] args) {
        // Using break
        System.out.println("Break example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Using continue
        System.out.println("Continue example:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
} 