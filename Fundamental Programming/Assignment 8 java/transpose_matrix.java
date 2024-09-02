import java.util.Scanner;
public class transpose_matrix {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int size = myObj.nextInt();

        int [][] matrix1 = new int[size][size];
        int [][] transpose = new int[size][size];
        System.out.println("entre the elements of the matrix1:");

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                System.out.print(" Element ["+i+"]["+j+"]");
                matrix1[i][j] = myObj.nextInt();
            }
        }
        System.out.println("entre the elements of the matrix2:");

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                transpose[i][j]=matrix1[j][i];
            }
        }

        System.out.println("transpose:");
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}

