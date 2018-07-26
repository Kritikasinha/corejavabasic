import java.util.*;

public class Lambdaloop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("xyz");
        list.add("mnp");
        list.add("efg");
        list.forEach(
                (n)-> System.out.println(n)
        );
    }
}
