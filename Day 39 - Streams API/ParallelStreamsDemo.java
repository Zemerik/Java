import java.util.*; 

public class ParallelStreamsDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) nums.add(i);
        nums.parallelStream().map(n -> {
            System.out.println(Thread.currentThread().getName() + " handling " + n);
            return n * n;
        }).forEach(x -> {});
    }
}