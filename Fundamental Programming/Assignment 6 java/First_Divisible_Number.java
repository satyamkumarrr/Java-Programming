import java.util.Scanner;
public class First_Divisible_Number {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("first number divisible by 3 and 7 is:" + i);
                break;
            }
        }
    }
}
