import java.util.Scanner;
public class sum_of_each_rows_and_column {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("enter the size of matrix");
        int size = myObj.nextInt();

        int [][] matrix1 = new int[size][size];
        System.out.println("entre the elements of the matrix1:");

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                System.out.print(" Element ["+i+"]["+j+"]");
                matrix1[i][j] = myObj.nextInt();
            }
        }
        System.out.println("entre the elements of the matrix2:");

        for (int i=0; i<size; i++){
            int row=0;
            for (int j=0; j<size; j++){
                row+=matrix1[i][j];
            }
            System.out.println("Sum of row :  "+ row);
        }
        for (int i=0; i<size; i++){
            int column=0;
            for (int j=0; j<size; j++){
                column+=matrix1[j][i];
            }
            System.out.println("Sum of column :  "+ column);
        }

        }
}
