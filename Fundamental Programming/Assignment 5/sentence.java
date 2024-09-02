import java.util.Scanner;
public class sentence {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter first string");
        String first = myObj.nextLine();
        System.out.println("please enter your second string");
        String second = myObj.nextLine();
        System.out.println("please enter the last string");
        String last = myObj.nextLine();

        System.out.println(first + " " + second + " " + last);
    }
}
