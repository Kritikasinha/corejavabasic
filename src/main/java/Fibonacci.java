public class Fibonacci {
    public static void main(String args[]){
        int a=0;
        int b=1;
        System.out.println("Fibonacci Series");
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<=9;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
