import java.util.Scanner;
public class add_operator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any number");
        int num = myObj.nextInt();
        int sum = 5;
        sum += num;
        System.out.println("total="+sum);
    }
}
