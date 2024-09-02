import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        int year;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the year");
        year = myObj.nextInt();

        if(year%4==0){
            System.out.println("leap year");
        } else if(year%100==0){
            System.out.println("not leap year");
        } else if (year%400==0) {
            System.out.println("leap_year");
        }

    }
}
