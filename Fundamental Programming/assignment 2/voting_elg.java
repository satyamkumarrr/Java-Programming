import java.util.Scanner;
public class voting_elg {
    public static void main(String[] args) {
        int age;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the age");
        age = myObj.nextInt();

        if(age>=18){
            System.out.println("you are eligible for vote");
        }else {
            System.out.println("you are not eligible for vote");
        }
    }
}
