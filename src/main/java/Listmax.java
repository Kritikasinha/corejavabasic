import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listmax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(18);
        list.add(56);
        list.add(100);
        list.add(1);
        list.add(58);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
//example of collection class