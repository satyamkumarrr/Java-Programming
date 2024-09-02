import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any number");
        int num = myObj.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }
}
