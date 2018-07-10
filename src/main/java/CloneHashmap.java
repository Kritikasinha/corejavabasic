import java.util.HashMap;
public class CloneHashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1,"val1");
        hm.put(2,"val2");
        hm.put(2,"val3");
        hm.put(3,"val4");
        hm.put(4,"Val5");
        System.out.println("Hashmap Contains"+hm);
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
        hm2 = (HashMap) hm.clone();
        System.out.println("Cloned map" +hm2);
    }
}
