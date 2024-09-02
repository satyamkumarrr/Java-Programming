import java.util.Scanner;
public class double_to_integer {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("enter any decimal number");
        double num = myObj.nextDouble();

        int integer_num = (int) num;

        System.out.println("integer number is:" + integer_num);
    }
}
