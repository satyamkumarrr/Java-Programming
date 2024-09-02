import java.util.Scanner;
public class sum_digit {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int sum = 0, rem, num;
        System.out.println("enter any number to add:");
        num = myObj.nextInt();
        while (num!=0){
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println("sum of all the digits of a number is:" + sum);
    }
}
