import java.util.Scanner;
public class star_pattern {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        for (int i = 1; i <=5; i++) {
            System.out.println("");
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        }
    }
}
