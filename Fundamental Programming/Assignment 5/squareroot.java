import java.util.Scanner;
public class squareroot {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("enter any number");
        double num = myObj.nextInt();

        double squareroot = Math.sqrt(num);

        System.out.println("SquareRoot=" + squareroot);
    }
}
