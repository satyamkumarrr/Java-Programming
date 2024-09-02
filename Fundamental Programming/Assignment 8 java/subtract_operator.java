import java.util.Scanner;
public class subtract_operator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any number");
        int num = myObj.nextInt();
        int sub = 3;
        sub -= num;
        System.out.println("total="+sub);
}
}
