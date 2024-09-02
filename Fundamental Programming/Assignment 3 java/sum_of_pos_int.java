import java.util.Scanner;
public class sum_of_pos_int {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number;
        int sum=0;

        while (true) {
            System.out.print("Enter the zero to exit):");
            number = myObj.nextInt();

            switch (number) {
                case 0:
                    System.out.println("program ended!");
                    break;
                default:
                    if (number > 0) {
                        sum += number;
                    }
                    break;
            }
            if (number == 0) {
                break;
            }
        }
        System.out.println("Sum of positive integers: " + sum);
    }
}