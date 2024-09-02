import java.util.Scanner;
public class fibonacci_num {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num;
        int i=0;
        int second =1;
        int first=0 ,next;
        System.out.println("entre the number");
        num = myObj.nextInt();
        System.out.println(first +" " );
        System.out.println(second + " ");

        while (i<= num){
            next=first+second;
            System.out.println(next + " ");
            first=second;
            second=next;
            i=i+1;
        }
    }
}
