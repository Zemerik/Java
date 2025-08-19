import java.util.concurrent.*; 

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        int n = 3;
        CountDownLatch latch = new CountDownLatch(n);
        for (int i = 0; i < n; i++) {
            int id = i;
            new Thread(() -> {
                System.out.println("Task " + id + " started");
                try { Thread.sleep(200); } catch (InterruptedException ignored) {}
                System.out.println("Task " + id + " finished");
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("All tasks finished");
    }
}