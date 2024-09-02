import java.util.Scanner;
public class largest_to_smallest {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("enter the larger value");
        long large_value = myObj.nextLong();

        byte small_value = (byte) large_value;

        System.out.println("small value is:" + small_value);

    }
}
