import java.util.Scanner;
public class skip_multiply_of_5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                continue;
            }
                System.out.print(i+",");

        }
    }
}
