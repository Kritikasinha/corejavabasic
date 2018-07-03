import java.util.Iterator;
import java.util.PriorityQueue;

public class TestQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Kritika");
        queue.add("Vibha");
        queue.add("Jagrity");
        queue.add("Ruby");
        queue.add("sukku");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println("iterating the queue elements");
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two element");
       Iterator<String> itr2 = queue.iterator();
       while(itr2.hasNext()){
           System.out.println(itr2.next());

        }

    }
}
