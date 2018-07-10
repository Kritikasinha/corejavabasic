import java.util.*;

public class HashMapSynchronizeExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1, "val1");
        hm.put(2, "val2");
        hm.put(3, "val3");
        hm.put(4,"val4");
        Map map = Collections.synchronizedMap(hm);
        Set set = map.entrySet();
        //converted into set to use iterator to traverse the map
        synchronized (map){
            Iterator i = set.iterator();
            while(i.hasNext()){
                Map.Entry pair = (Map.Entry)i.next();
                System.out.println(pair.getKey()+":"+pair.getValue());
            }
        }
    }
}
