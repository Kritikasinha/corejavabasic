import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(100,"Kritika");
        hm.put(101,"Vibha");
        hm.put(102,"Ruby");
        hm.put(103,"sukku");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
