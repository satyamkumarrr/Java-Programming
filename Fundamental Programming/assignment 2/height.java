import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        int height;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the height of a person");
        height = myObj.nextInt();

        if(height<150){
            System.out.println("the person is dwarf");
        } else if (height>=150 && height<=165) {
            System.out.println("the person is average");
        }else {
            System.out.println("the person is tall");
        }
    }
}
