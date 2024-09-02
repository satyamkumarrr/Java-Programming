import java.util.Scanner;
public class Block_Scope_and_Shadowing {
        public static void calculate() {

            System.out.println("Value of x outside the loop: ");
            for (int i = 0; i < 1; i++) {
                int x = 20;
                System.out.println("Value of x inside the loop: " + x);
            }
            System.out.println("Value of x after the loop: ");
        }
        public static void main(String[] args) {
            calculate();
        }
    }
