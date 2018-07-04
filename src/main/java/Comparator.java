import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<Student> al= new ArrayList<Student>();
        al.add(new Student(1,"Kritika",27));
        al.add(new Student(2,"Vibha",24));
        al.add(new Student(6,"Poulomee",30));
        al.add(new Student(3,"Abc",29));
        Collections.sort(al,new NameComp());
        System.out.println("Calling name comparator");
        for(Student st:al)
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        Collections.sort(al,new AgeComp());
        System.out.println("Calling age Comparator");
        for(Student s:al){
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }
    }
}
