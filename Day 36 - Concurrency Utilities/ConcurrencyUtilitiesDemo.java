import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrencyUtilitiesDemo {
    public static void main(String[] args) {
        // ExecutorService example
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Submit tasks
        Future<String> future1 = executor.submit(() -> {
            Thread.sleep(1000);
            return "Task 1 completed";
        });
        
        Future<String> future2 = executor.submit(() -> {
            Thread.sleep(500);
            return "Task 2 completed";
        });
        
        // Get results
        try {
            System.out.println(future2.get()); // Shorter task completes first
            System.out.println(future1.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
        executor.shutdown();
        
        // CountDownLatch example
        CountDownLatch latch = new CountDownLatch(3);
        
        for (int i = 0; i < 3; i++) {
            final int taskId = i;
            new Thread(() -> {
                System.out.println("Task " + taskId + " started");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " completed");
                latch.countDown();
            }).start();
        }
        
        try {
            latch.await();
            System.out.println("All tasks completed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // AtomicInteger example
        AtomicInteger counter = new AtomicInteger(0);
        
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.incrementAndGet();
                }
            }).start();
        }
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final counter value: " + counter.get());
    }
} 