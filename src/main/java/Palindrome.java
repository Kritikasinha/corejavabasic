public class Palindrome {
    public static void main(String[] args) {
      int num = 329;
        //  int num=12321;
        int sum=0, rem=0,dig=0;
        dig=num;
        while(num>0){
            rem=num%10;
            //System.out.println(rem+"rem");
            sum=(sum*10)+rem;
            num=num/10;
        }
    if(sum == dig){
            System.out.println(dig +" is a palindrome number");
    }
    else
        System.out.println(dig+" is not a palindrome Number");
    }

}
