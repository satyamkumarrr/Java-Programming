import java.util.Scanner;
public class check_pos_neg {
    public static void main(String[] args) {
        int num;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the value of a");
        num = myObj.nextInt();

        if (num > 0) {
            System.out.println("positive number");
        } else if (num < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("number is zero");
        }
    }
}
