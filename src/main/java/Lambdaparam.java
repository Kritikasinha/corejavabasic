public class Lambdaparam {
    public static void main(String[] args) {
        Addable ad = (a,b)->(a+b);
        System.out.println(ad.add(4,5));
        Addable ad1 = (int a,int b)->{return(a+b);};
        System.out.println(ad1.add(10,20));
    }
}
