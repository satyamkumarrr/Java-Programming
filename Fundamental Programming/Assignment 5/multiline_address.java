import java.util.Scanner;
public class multiline_address {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the street: ");
        String street = myObj.nextLine();
        System.out.print("Enter the city: ");
        String city = myObj.nextLine();
        System.out.print("Enter the zip code: ");
        String zipCode = myObj.nextLine();

        String formattedAddress = street + "\n" + city + ", " + zipCode;

        System.out.println("\nFormatted Address:");
        System.out.println(formattedAddress);
    }
}