import java.util.Scanner;
public class Print_All_Characters_Except_Vowels {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter any string:");
        String input = myObj.nextLine();
        String Vowels = "AEIOUaeiou";
        for (int i=0; i<input.length(); i++){
            char currentchar = input.charAt(i);
            if (Vowels.indexOf(currentchar) != -1){
                continue;
            }
            System.out.print(currentchar);

        }

    }
}
