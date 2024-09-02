import java.util.Scanner;
public class sum_of_cube_of_even_num {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int i=2;
        int num;
        int sum=0;
        System.out.println("enter the number");
        num = myObj.nextInt();

        while (i<=num){
                int cube = i*i*i;
                sum = sum + cube;
                i=i+2;
        }
        System.out.println(sum);
    }
}
