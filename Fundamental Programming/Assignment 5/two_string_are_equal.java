import java.util.Scanner;
public class two_string_are_equal {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter first string");
        String first = myObj.nextLine();
        System.out.println("please enter second string");
        String second = myObj.nextLine();

        boolean are_equal = first.equals(second);

        System.out.println("Are both are equal:" + are_equal);
    }
}
