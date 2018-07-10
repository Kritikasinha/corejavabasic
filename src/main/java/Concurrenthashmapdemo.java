import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthashmapdemo {
    public static void main(String[] args) {
        ConcurrentHashMap m = new ConcurrentHashMap();
        m.put(100,"Hello");
        m.put(101,"Kritika");
        m.put(102,"be urself, u r gud!");

m.remove(101,"Kritika");
        m.putIfAbsent(101,"dj");
m.putIfAbsent(103,"Hey");
m.replace(101,"Hello","Hi");
        System.out.println(m.values());
    }
}
