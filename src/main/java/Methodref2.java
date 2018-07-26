public class Methodref2 {
    public static void Threadstatus(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread t = new Thread((Methodref2::Threadstatus));
        t.start();
    }
}
