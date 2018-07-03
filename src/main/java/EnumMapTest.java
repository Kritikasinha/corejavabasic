import java.util.*;
public class EnumMapTest {
    public enum days{Sunday, Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}

    public static void main(String[] args) {
        Map<days,Integer> hm = new EnumMap<days,Integer>(days.class);
        hm.put(days.Monday,1);
        hm.put(days.Tuesday ,2);
        hm.put(days.Wednesday,3);
        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
