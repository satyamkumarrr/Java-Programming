import java.util.Scanner;
public class concatenate {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter your first name");
        String first_name = myObj.nextLine();
        System.out.println("please enter your last name");
        String last_name = myObj.nextLine();

        System.out.println(first_name + " " + last_name);
    }
}
