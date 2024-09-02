import java.util.Scanner;
public class Palindrome_number {
    public static void main(String[] args) {
        int num;
        int rev = 0, rem;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any number:");
        num = myObj.nextInt();
        int temp = num;

        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("the given number is palindrome");
        } else {
            System.out.println("the given number is not palindrome");
        }
    }
}
