import java.util.Scanner;
public class Simple_Calculator_Using_Switch {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = myObj.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = myObj.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = myObj.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }
        System.out.printf("The result of %.2f %c %.2f is %.2f%n", num1, operator, num2, result);
    }
}
