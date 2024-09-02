import java.util.Locale;
import java.util.Scanner;
public class palindrome_string {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String word;
        String rev="";
        System.out.println("enter any word:");
        word = myObj.nextLine().toLowerCase();
        int num = word.length();
        System.out.println("palindrome:");
        for (int i=num-1; i>=0; i=i-1) {
            char result = word.charAt(i);
            rev = rev + result;
        }
        if (word.equals(rev)) {
            System.out.println("this is palindrome");
        } else {
            System.out.println("this is not palindrome");
        }

    }
}
