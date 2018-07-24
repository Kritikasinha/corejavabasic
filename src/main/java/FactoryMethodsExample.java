import java.util.*;
public class FactoryMethodsExample {
    public static void main(String[] args) {
        List<String> list = List.of("Java","SpringBoot","Spring","Hibernate","JSP");
        for(String l:list) {
            System.out.println(l);
        }
        Set<String> set = Set.of("Java","SpringBoot","Spring","Hibernate","JSP");
      // duplicate element** Set<String> set = Set.of("Java","SpringBoot","Spring","Hibernate","JSP","Java");
        for(String s:set){
            System.out.println(s);
        }
    }
}