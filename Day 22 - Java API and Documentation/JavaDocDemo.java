/**
 * JavaDocDemo.java
 * Demonstrates JavaDoc comments and documentation generation
 * @author Your Name
 * @version 1.0
 */
public class JavaDocDemo {
    /**
     * Adds two integers.
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Main method to run the demo.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        JavaDocDemo demo = new JavaDocDemo();
        System.out.println("2 + 3 = " + demo.add(2, 3));
    }
} 