import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersistEx {
    public static void main(String[] args) throws Exception{
        Stud s1= new Stud(1,"KS",27);
        FileOutputStream f = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        f.close();
    System.out.println("SUCCESS");
    }
}
