import java.util.Scanner;
public class greater_than {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any number");
        double num = myObj.nextInt();

        boolean greater_than = num > 100;

        System.out.println("number is greater than 100=" + greater_than);
    }
}
