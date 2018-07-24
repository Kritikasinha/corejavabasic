
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Kriti");
        set.add("KRITI");
        set.add("Kriti");
        set.add("Kritika");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
