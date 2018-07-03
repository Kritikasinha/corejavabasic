public class Counter2 {

    static int count=0;
    public void increment()
    {
       System.out.println(count++);
    }
    public static void main(String args[])
    {
        Counter2 obj1=new Counter2();
        Counter2 obj2=new Counter2();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is="+count);
        System.out.println("Obj2: count is="+obj2.count);
    }
    }

