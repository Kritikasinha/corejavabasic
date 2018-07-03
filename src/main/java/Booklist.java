import java.util.Iterator;
import java.util.LinkedList;

public class Booklist {
    public static void main(String[] args) {

        LinkedList<Book> lb = new LinkedList<Book>();
        lb.add(new Book(1,"abc",1));
        lb.add(new Book(2,"xyz",5));
        lb.add(new Book(3,"mnp",7));
        lb.add(new Book(4,"uuh",8));
       // Iterator itr = lb.iterator();
        //while (itr.hasNext()){
         //   System.out.println(itr.next());
    for(Book b:lb){
        System.out.println(b.id+" "+b.Book_name+" "+b.quantity);
    }

    }
}
