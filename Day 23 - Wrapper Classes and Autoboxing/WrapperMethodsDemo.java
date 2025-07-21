public class WrapperMethodsDemo {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("Parsed int: " + num);
        System.out.println("Integer to binary: " + Integer.toBinaryString(num));
        System.out.println("Double max value: " + Double.MAX_VALUE);
        System.out.println("Boolean value of 'true': " + Boolean.valueOf("true"));
    }
} 