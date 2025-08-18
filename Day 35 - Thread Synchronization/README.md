# Day 35 - Thread Synchronization

## 📚 What You'll Learn Today

- Synchronization mechanisms
- Race conditions
- Deadlocks

## 🎯 Key Concepts

- **synchronized**: Intrinsic locking
- **Race Condition**: Uncontrolled access to shared state
- **Deadlock**: Circular waiting on locks

## 📁 Files in This Day

1. **SynchronizationDemo.java** - Basic synchronization examples
2. **SynchronizedMethodDemo.java** - Protect shared state with synchronized methods
3. **SynchronizedBlockDemo.java** - Fine-grained locking with synchronized blocks
4. **DeadlockDemo.java** - Demonstrates a potential deadlock scenario

## 🚀 How to Run

1. Compile: `javac *.java`
2. Run: `java SynchronizationDemo` (or any of the other classes)

## 💡 Exercises

1. Remove synchronization and observe race conditions
2. Refactor to use synchronized blocks
3. Fix the deadlock by ordering lock acquisition

---

**Next Day**: Day 36 - Concurrency Utilities 