import java.util.Map;

public class MapFactoryMethods {
    public static void main(String[] args) {
     Map<Integer,String> map = Map.of(101,"Spring",102,"Hibernate",103,"SpringBoot");
        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        Map.Entry<Integer,String> e1=Map.entry(101,"Java");
        Map.Entry<Integer,String> e2=Map.entry(102,"Jsp");
        Map<Integer,String> mp=Map.ofEntries(e1,e2);
        for(Map.Entry<Integer,String> m : mp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
