import java.util.List; 
import java.util.Map;
import java.util.concurrent.*;

public class ConcurrentCollectionsDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        List<String> list = new CopyOnWriteArrayList<>();
        Runnable writer = () -> {
            for (int i = 0; i < 100; i++) {
                map.put("k" + i, i);
                list.add("v" + i);
            }
        };
        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(writer);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Map size: " + map.size());
        System.out.println("List size: " + list.size());
    }
}