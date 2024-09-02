import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        int num;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any number:");
        num = myObj.nextInt();

        if(num%2==0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
    }
}
