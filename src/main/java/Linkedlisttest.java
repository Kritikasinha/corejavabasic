import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlisttest{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("5");
        list.add("9");
        list.add("7");
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("*********************");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}