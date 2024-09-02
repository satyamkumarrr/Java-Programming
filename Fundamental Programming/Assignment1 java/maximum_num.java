import java.util.Scanner;

public class maximum_num {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        int a;
        int b;
        int c;
        System.out.println("enter the value of a");
        a = myObj.nextInt();
        System.out.println("entre the value of b");
        b = myObj.nextInt();
        System.out.println("enter the value of c");
        c = myObj.nextInt();

        if(a>b && a>c){
            System.out.println("maximum number is a:" + a);
        } else if (b>a && b>c) {
            System.out.println("maximum number is b:" + b);
        }else {
            System.out.println("maximum number is c:" + c);
        }
    }
}
