public class InstanceMethodReference {
    public void saysomething(){
        System.out.println("This is a non static method");
    }
    public void Printmsg(){
        System.out.println("Hello , thread instance method");
    }

    public static void main(String[] args) {
        InstanceMethodReference ir = new InstanceMethodReference();
        newMethodref nm = ir::saysomething;
        nm.say();
        Thread t2 = new Thread(new InstanceMethodReference()::Printmsg);
        t2.start();
    }
}
