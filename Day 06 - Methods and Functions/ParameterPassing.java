public class ParameterPassing {
    public static void main(String[] args) {
        // Pass by value for primitives
        int number = 10;
        System.out.println("Before method call: " + number);
        modifyPrimitive(number);
        System.out.println("After method call: " + number);
        
        // Pass by reference for objects
        int[] array = {1, 2, 3};
        System.out.println("Before method call: " + java.util.Arrays.toString(array));
        modifyArray(array);
        System.out.println("After method call: " + java.util.Arrays.toString(array));
        
        // Varargs example
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(10, 20);
        printNumbers();
    }
    
    // Pass by value - primitive types are copied
    public static void modifyPrimitive(int num) {
        num = 100;
        System.out.println("Inside method: " + num);
    }
    
    // Pass by reference - objects are passed by reference
    public static void modifyArray(int[] arr) {
        arr[0] = 100;
        System.out.println("Inside method: " + java.util.Arrays.toString(arr));
    }
    
    // Varargs - variable number of arguments
    public static void printNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 