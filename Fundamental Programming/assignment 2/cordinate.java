import java.util.Scanner;
public class cordinate {
    public static void main(String[] args) {
        int x, y;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the value of coordinate  x");
        x = myObj.nextInt();
        System.out.println("entre the value of coordinate y");
        y = myObj.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("this coordinate  lies in the first quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("this coordinates lies in the second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("this coordinate is lies in the third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("this coordinate is lies in the fourth coordinate");
        } else if (x == 0 && (y < 0 || y > 0)) {
            System.out.println("this coordinate is lies on the y-axis");
        } else if (y == 0 && (x < 0 || x > 0)){
            System.out.println("this coordinate is lies on the x-axis");
        }else {
            System.out.println("invalid");
        }
    }
}
