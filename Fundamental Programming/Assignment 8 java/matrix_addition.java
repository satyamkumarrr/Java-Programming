import java.util.Scanner;
public class matrix_addition {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("enter the size of matrix");
            int size = myObj.nextInt();

            int [][] matrix1 = new int[size][size];
            int [][] matrix2 = new int[size][size];
            int [][] resultMatrix = new int[size][size];
            System.out.println("entre the elements of the matrix1:");

            for (int i=0; i<size; i++){
                for (int j=0; j<size; j++){
                    System.out.println("["+i+"]["+j+"]");
                    matrix1[i][j] = myObj.nextInt();
                }
            }
            System.out.println("entre the elements of the matrix2:");

            for (int i=0; i<size; i++){
                for (int j=0; j<size; j++){
                    System.out.println(" Element ["+i+"]["+j+"]");
                    matrix2[i][j] = myObj.nextInt();
                }
            }
            for (int i=0; i<size; i++){
                for (int j=0; j<size; j++){
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("result:");
            for (int i=0; i<size; i++){
                for (int j=0; j<size; j++){
                    System.out.print(resultMatrix[i][j]+" ");
                }
                System.out.println();
            }
    }
}
