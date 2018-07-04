import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortWrapperList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(Integer.valueOf(101));
        al.add(Integer.valueOf(50));
        al.add(Integer.valueOf(201));
        Collections.sort(al);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
