import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraytoArrayList {
    public static void main(String[] args) {
        String city[]={"Bengaluru","Pune","BBSR","Ranchi"};
       // ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(city));
        //either of ways is correct.
        ArrayList<String> citylist = new ArrayList<String>();
        Collections.addAll(citylist,city);
        citylist.add("Mumbai");
        citylist.add("Chennai");
        for(String str:citylist){
            System.out.println(str);
        }
        System.out.println("**********Copying back to array ***********");
        //converting arraylist to array
        String citynames[]= citylist.toArray(new String[citylist.size()]);
        for(String k:citynames){
            System.out.println(k);
        }
    }
}
