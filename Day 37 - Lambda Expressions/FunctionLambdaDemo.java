import java.util.function.*; 

public class FunctionLambdaDemo {
    public static void main(String[] args) {
        Function<String, Integer> lengthFn = String::length;
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        System.out.println("Length of 'hello': " + lengthFn.apply("hello"));
        System.out.println("2 + 3 = " + add.apply(2, 3));
    }
}