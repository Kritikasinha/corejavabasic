import java.io.Serializable;

public class Stud implements Serializable {
    int id;
    String name;
    transient int age;
    public Stud(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
