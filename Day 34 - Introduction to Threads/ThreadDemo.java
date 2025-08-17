/**
 * Day 34 - ThreadDemo.java
 * Demonstrates thread creation and execution
 */
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Creating thread by extending Thread class
        MyThread thread1 = new MyThread();
        
        // Creating thread by implementing Runnable
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        
        // Starting threads
        thread1.start();
        thread2.start();
        
        System.out.println("Main thread finished");
    }
} 