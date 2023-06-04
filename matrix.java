import java.util.Scanner;

public class matrix {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input the size of the matrices
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();
        
        // Input the first matrix
        int[][] matrix1 = new int[rows][cols];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        
        // Input the second matrix
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        
        // Perform matrix addition
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Perform matrix subtraction
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        // Perform matrix multiplication
        int[][] product = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        input.close();
        
        // Print the matrices and their results
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        System.out.println("Matrix Sum:");
        printMatrix(sum);
        System.out.println("Matrix Difference:");
        printMatrix(diff);
        System.out.println("Matrix Product:");
        printMatrix(product);
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    
}

