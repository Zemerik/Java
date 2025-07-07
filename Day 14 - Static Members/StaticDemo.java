/**
 * Day 14 - StaticDemo.java
 * Demonstrates static variables and methods
 */
class Counter {
    static int count = 0;
    Counter() {
        count++;
    }
    static void showCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.showCount();
    }
} 