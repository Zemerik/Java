import java.util.function.Function; 

public class ComposeAndThenDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> times2 = x -> x * 2;
        Function<Integer, Integer> plus3 = x -> x + 3;
        Function<Integer, Integer> composed = times2.compose(plus3); // (x+3)*2
        Function<Integer, Integer> chained = times2.andThen(plus3); // x*2+3
        System.out.println("compose: " + composed.apply(5)); // 16
        System.out.println("andThen: " + chained.apply(5)); // 13
    }
}