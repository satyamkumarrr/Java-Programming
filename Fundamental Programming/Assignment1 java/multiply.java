import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
        int a,b,c;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = myObj.nextInt();
        System.out.println("entre the value of b");
        b = myObj.nextInt();
        c = a*b;
        System.out.println("multiplication is:" + c);
    }
}
