public class findprime {
  public static void checkPrime(int num) {
        //  int num = 5;
        int n = 0;
        n = num / 2;
        int flag = 0;
        if ((n == 0) || (n == 1)) {
            System.out.println("Number is not prime");
        }
        for (int i = 2; i <= n; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println(num + " is a Prime Number");
    }
}

