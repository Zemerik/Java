public class AutoboxingDemo {
    public static void main(String[] args) {
        int primitive = 10;
        Integer wrapper = primitive; // autoboxing
        int unboxed = wrapper; // unboxing
        System.out.println("Primitive: " + primitive);
        System.out.println("Wrapper: " + wrapper);
        System.out.println("Unboxed: " + unboxed);
    }
} 