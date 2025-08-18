/**
 * Day 35 - SynchronizationDemo.java
 * Demonstrates thread synchronization
 */
class Counter {
    private int count = 0;
    
    // Synchronized method
    public synchronized void increment() {
        count++;
    }
    
    // Synchronized block
    public void decrement() {
        synchronized (this) {
            count--;
        }
    }
    
    public int getCount() {
        return count;
    }
}

class Worker implements Runnable {
    private Counter counter;
    
    public Worker(Counter counter) {
        this.counter = counter;
    }
    
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        
        Thread thread1 = new Thread(new Worker(counter));
        Thread thread2 = new Thread(new Worker(counter));
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        
        System.out.println("Final count: " + counter.getCount());
    }
} 