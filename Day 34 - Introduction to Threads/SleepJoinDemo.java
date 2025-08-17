public class SleepJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Task 1 start");
                Thread.sleep(500);
                System.out.println("Task 1 end");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        Thread t2 = new Thread(() -> System.out.println("Task 2"));
        t1.start();
        t2.start();
        t1.join();
        System.out.println("Main finished");
    }
}