import java.util.Scanner;
public class area_of_circle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        double r = myObj.nextInt();
        double area = 3.14 * r * r;
        System.out.println("area of circle:" + area);
    }
}
