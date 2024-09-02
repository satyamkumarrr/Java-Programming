import java.util.Scanner;
public class value_n_bade_m {
    public static void main(String[] args) {
        int m;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the value of m");
        m = myObj.nextInt();

        if(m>0){
            System.out.println("the value of m is n = 1");
        } else if (m==0) {
            System.out.println("the value of m is n = 0");
        }else if (m<0){
            System.out.println("the value of m is n = -1");
        }else {
            System.out.println("invalid");
        }
        }
    }