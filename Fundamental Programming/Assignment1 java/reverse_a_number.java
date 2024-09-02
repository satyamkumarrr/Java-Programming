import java.util.Scanner;
public class reverse_a_number {
    public static void main(String[] args) {
        int num;
        int rev=0,rem;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any number:");
        num = myObj.nextInt();

        while (num!=0){
            rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println("reverse of a number is:" + rev);
    }
}
