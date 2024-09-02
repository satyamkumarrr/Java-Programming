import java.util.Scanner;
public class concatenate_num_as_string {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter the first number");
        String first = myObj.nextLine();
        System.out.println("please enter the second number");
        String second = myObj.nextLine();

        String total = first + second;

        System.out.println(total);
    }
}
