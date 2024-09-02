import java.util.Scanner;
public class vowel_cont_count_in_string {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int vowel=0;
        int constant=0;
        System.out.println("enter any string:");
        String word = myObj.nextLine();
        int num = word.length();
        for (int i = 0; i < num; i++){
            char s=word.charAt(i);
            if (Character.isLetter(s)){
                if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                    vowel++;
                } else {
                    constant++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + constant);
    }
}
