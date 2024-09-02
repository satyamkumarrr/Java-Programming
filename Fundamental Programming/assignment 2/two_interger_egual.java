import java.util.Scanner;
public class two_interger_egual {
    public static void main(String[] args) {
        int a, b;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = myObj.nextInt();
        System.out.println("entre the value of b");
        b = myObj.nextInt();

        if (a == b) {
            System.out.println("both integers are equal");
        } else {
            System.out.println("not equal");
        }
    }
}
