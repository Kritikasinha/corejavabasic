import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FinalVariable {
    public static void main(String[] args)throws FileNotFoundException {
        FileOutputStream fileStream = new FileOutputStream(("kritika.txt"));
        try(fileStream){
            String greeting ="Welcome friends";
            byte[] b=greeting.getBytes();
            fileStream.write(b);
            System.out.println("Success");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
