public class SynchronizedBlockDemo {
    public static void main(String[] args) throws InterruptedException {
        Balance balance = new Balance();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) balance.deposit(1);
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final balance: " + balance.getAmount());
    }
}

class Balance {
    private int amount;
    private final Object lock = new Object();
    public void deposit(int v) {
        synchronized (lock) {
            amount += v;
        }
    }
    public int getAmount() { return amount; }
}