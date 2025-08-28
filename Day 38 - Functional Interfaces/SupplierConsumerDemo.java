import java.util.function.*; 

public class SupplierConsumerDemo {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = Math::random;
        Consumer<Double> printer = d -> System.out.println("Value: " + d);
        Double value = randomSupplier.get();
        printer.accept(value);
    }
}