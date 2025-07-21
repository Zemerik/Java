import java.util.Arrays;

public class PrimitiveToWrapperArrayDemo {
    public static void main(String[] args) {
        int[] primitives = {1, 2, 3, 4};
        Integer[] wrappers = new Integer[primitives.length];
        for (int i = 0; i < primitives.length; i++) {
            wrappers[i] = primitives[i]; // autoboxing
        }
        System.out.println("Wrapper array: " + Arrays.toString(wrappers));

        // Convert back to primitive array
        int[] backToPrimitives = new int[wrappers.length];
        for (int i = 0; i < wrappers.length; i++) {
            backToPrimitives[i] = wrappers[i]; // unboxing
        }
        System.out.println("Primitive array: " + Arrays.toString(backToPrimitives));
    }
} 