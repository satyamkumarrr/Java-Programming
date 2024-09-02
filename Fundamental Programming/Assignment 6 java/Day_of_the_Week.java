import java.util.Scanner;
public class Day_of_the_Week {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the number(1-7)");
        int num = myObj.nextInt();

        String DayName;
        switch (num){
            case 1:
                DayName = "Monday";
                break;
            case 2:
                DayName = "Tuesday";
                break;
            case 3:
                DayName = "Wednesday";
                break;
            case 4:
                DayName = "Thursday";
                break;
            case 5:
                DayName = "Friday";
                break;
            case 6:
                DayName = "Saturday";
                break;
            case 7:
                DayName = "Sunday";
                break;
            default:
                DayName = "Invalid input. Please enter a number between 1 and 7.";
                break;
        }
        System.out.println(DayName);
        }
}
