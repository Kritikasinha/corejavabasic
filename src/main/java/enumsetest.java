import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

enum days{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
public class enumsetest {
    public static void main(String[] args) {
        Set<days> set= EnumSet.allOf(days.class);
        System.out.println("Week days"+set);
        Set<days> set1=EnumSet.noneOf(days.class);
        System.out.println("Week Days"+set1);
    }
}
