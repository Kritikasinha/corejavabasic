public interface Sayable {
     default void say(){
        saySomething();
        sayPolitely();
    }
private  void saySomething(){
    System.out.println("Hello, I am private Method in Interface");
}
private static void sayPolitely(){
    System.out.println("I am private static method");
}
}
