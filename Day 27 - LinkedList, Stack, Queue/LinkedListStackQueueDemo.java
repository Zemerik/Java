/**
 * Day 27 - LinkedListStackQueueDemo.java
 * Demonstrates LinkedList, Stack, and Queue
 */
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class LinkedListStackQueueDemo {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("LinkedList: " + list);
        
        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack pop: " + stack.pop());
        
        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.offer("X");
        queue.offer("Y");
        queue.offer("Z");
        System.out.println("Queue poll: " + queue.poll());
    }
} 