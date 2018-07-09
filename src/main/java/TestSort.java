import java.util.ArrayList;
import java.util.Collections;


public class TestSort {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(9,"abc","Sales"));
        al.add(new Employee(5,"xyz","HR"));
        al.add(new Employee(2,"mnp","Management"));
        al.add(new Employee(7,"sap","Development"));
        Collections.sort(al,Collections.reverseOrder());
       for(Employee e:al){
           System.out.println(e.id+" "+e.name+" "+e.dept);
        }
    }
}
