import java.util.Scanner;
public class add_num_string {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter the first number");
        String first = myObj.nextLine();
        System.out.println("please enter the second number");
        String second = myObj.nextLine();

        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);

        int sum = num1 + num2;

        System.out.println(sum);
    }
}
