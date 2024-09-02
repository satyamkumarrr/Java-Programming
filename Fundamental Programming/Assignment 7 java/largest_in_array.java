import java.util.Scanner;
public class largest_in_array {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = myObj.nextInt();
        System.out.println("enter the element of the array");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = myObj.nextInt();
        }
        int largest = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("largest in array is:" + largest);
    }
}
