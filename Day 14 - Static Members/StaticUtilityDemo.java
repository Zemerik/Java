public class StaticUtilityDemo {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("Sum: " + MathUtil.add(a, b));
        System.out.println("Product: " + MathUtil.multiply(a, b));
        System.out.println("Max: " + MathUtil.max(a, b));
    }
}

class MathUtil {
    public static int add(int x, int y) {
        return x + y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }
} 