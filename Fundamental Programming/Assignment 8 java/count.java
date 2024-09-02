import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the number");
        int num = myObj.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i >= 1 && i <= 7) {
                continue;
            }
                System.out.println(i);
        }
    }
}
