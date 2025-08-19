# Day 36 - Concurrency Utilities

## 📚 What You'll Learn Today

- Concurrency utilities in `java.util.concurrent`
- Executors, futures, latches, and concurrent collections

## 🎯 Key Concepts

- **ExecutorService**: Manage thread pools
- **Future/Callable**: Async computations
- **CountDownLatch**: Wait for tasks to complete
- **Concurrent Collections**: Thread-safe data structures

## 📁 Files in This Day

1. **ConcurrencyUtilitiesDemo.java** - Mixed examples of concurrency utilities
2. **ExecutorServiceDemo.java** - Fixed thread pool with `Callable` and `Future`
3. **CountDownLatchDemo.java** - Wait for multiple tasks to finish
4. **ConcurrentCollectionsDemo.java** - Use `ConcurrentHashMap` and `CopyOnWriteArrayList`

## 🚀 How to Run

1. Compile: `javac *.java`
2. Run: `java ConcurrencyUtilitiesDemo` (or any of the other classes)

## 💡 Exercises

1. Change pool sizes and observe behavior
2. Replace collections with non-concurrent versions and see issues

---

**Next Day**: Day 37 - Lambda Expressions 