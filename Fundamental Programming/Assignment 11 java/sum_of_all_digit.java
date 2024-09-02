import java.util.Scanner;
public class sum_of_all_digit {
    public static int sum_of_digit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum_of_digit(n / 10);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = myObj.nextInt();
        int result = sum_of_digit(num);
        System.out.println(" sum of the digits of a number " + num + " is: " + result);
    }
}