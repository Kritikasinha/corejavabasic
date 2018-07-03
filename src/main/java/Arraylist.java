import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist   {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Kritika");
        al.add("Kriti");
        al.add("tul");
        al.add("tultuli");
        al.add("dj");

       /* Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
for(String s:al){
    System.out.println(s);
}
    }
}
