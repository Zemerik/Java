public class DeadlockDemo {
    public static void main(String[] args) throws InterruptedException {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                sleep(100);
                synchronized (lock2) {
                    System.out.println("T1 acquired both locks");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                sleep(100);
                synchronized (lock1) {
                    System.out.println("T2 acquired both locks");
                }
            }
        });

        t1.start();
        t2.start();
        t1.join(500);
        t2.join(500);
        System.out.println("Potential deadlock demonstrated (threads may still be blocked)");
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }
}