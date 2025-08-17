public class RunnableThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Runnable running " + i);
            }
        };
        Thread t = new Thread(task);
        t.start();
        t.join();
    }
}