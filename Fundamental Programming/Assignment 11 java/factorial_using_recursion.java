import java.util.Scanner;
public class factorial_using_recursion {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = myObj.nextInt();
        if (num>0){
            int result = factorial(num);
            System.out.println(" factorial of " + num+ " is " + result );

        }else {
            System.out.println("invalid");
        }
    }
}
