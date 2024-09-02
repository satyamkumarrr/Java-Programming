import java.util.Scanner;
public class fibonacci_using_recursion {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter number:");
        int num = myObj.nextInt();
        int result = fibonacci(num);
        System.out.println("fibonaci series " + num + " is: " + result);
    }
}
