import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSettoArrayList {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Banana");
        hs.add("WaterMelon");
        System.out.println("Hashset Contains:"+hs);
        List<String> list= new ArrayList<String>(hs);
        System.out.println("ArrayList Contains:"+list);
    }
}
