import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String word;
        int i;
        System.out.println("entre any word:");
        word = myObj.nextLine();
        int num=word.length();
        System.out.println("reverse string:");
        for(i=num-1;i>=0;i=i-1){
            char result=word.charAt(i);
            System.out.print(result);
        }
    }
}
