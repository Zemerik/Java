public class SynchronizedMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable inc = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };
        Thread t1 = new Thread(inc);
        Thread t2 = new Thread(inc);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final count: " + counter.get());
    }
}

class Counter {
    private int value;
    public synchronized void increment() { value++; }
    public synchronized int get() { return value; }
}