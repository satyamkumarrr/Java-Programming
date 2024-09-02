import java.util.Scanner;
public class longest_word_in_the_sentence {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("entre a sentence");
        String sen = myObj.nextLine();
        String[] words = sen.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
    }
}
