public class Armstrong {
    public static void main(String[] args) {
        int num = 143;
        int dig, cube, sum = 0;
        int n = num;
        while (num > 0) {
            dig = num % 10;
            cube = dig * dig * dig;
            sum = sum + cube;
            num = num / 10;
        }
        if (n == sum)
            System.out.println(n + " is Armstrong number");
        else
            System.out.println(n + " is not a Armstrong number");
    }
}