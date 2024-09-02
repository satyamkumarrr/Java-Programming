import java.util.Scanner;
public class admission {
    public static void main(String[] args) {
        int phy, chem, math;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the marks of the phy:");
        phy = myObj.nextInt();
        System.out.println("entre the marks of the chem:");
        chem = myObj.nextInt();
        System.out.println("enter the marks of the maths:");
        math = myObj.nextInt();

        int total = phy + chem + math;
        System.out.println("total marks of phy,chem,math is:" + total);

        int total_math_phy = phy + math;
        System.out.println("total marks of math and phy is:" + total_math_phy);

        if (math >= 65 && phy >= 55 && chem >= 50) {
            if (total >= 190 || total_math_phy >= 140) {
                System.out.println("the candidate is eligible for admission");
            } else {
                System.out.println("the candidate is not eligible for admission");
            }
        } else {
            System.out.println("the candidate is not eligible for admission");
        }
    }
}
