import java.util.concurrent.*; 

public class ExecutorServiceDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Callable<String> task = () -> { Thread.sleep(200); return "done"; };
        Future<String> f1 = pool.submit(task);
        Future<String> f2 = pool.submit(task);
        System.out.println(f1.get());
        System.out.println(f2.get());
        pool.shutdown();
    }
}