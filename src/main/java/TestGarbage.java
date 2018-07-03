public class TestGarbage {
    protected void finalize(){
        System.out.println("Object is garbage collected");
    }


    public static void main(String[] args) {
        TestGarbage s1= new TestGarbage();
        TestGarbage s2 = new TestGarbage();
        s1=s2;
        s2=null;
        System.gc();
    }
}
