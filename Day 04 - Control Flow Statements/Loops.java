public class Loops {
    public static void main(String[] args) {
        // For loop: print numbers 1 to 5
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop: print numbers 1 to 5
        System.out.println("While loop:");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // Do-while loop: print numbers 1 to 5
        System.out.println("Do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
        System.out.println();
    }
} 