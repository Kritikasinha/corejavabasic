import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<String>();
        list.add("Myntra");
        list.add("Amazon");
        list.add("Flipkart");
        list.add("Jabong");
        list.add("Shopclues");
        System.out.println("Arraylist before reversing" +list);
        Collections.reverse(list);
        System.out.println("ArrayList after reversing" +list);
    }
}
