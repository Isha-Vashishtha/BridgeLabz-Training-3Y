import java.util.Random;

public class MatrixOperations {

    // Create random matrix
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // 0-9 random
        return matrix;
    }

    // Add matrices
    public static int[][] add(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    // Subtract matrices
    public static int[][] subtract(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    // Multiply matrices
    public static int[][] multiply(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, n = B.length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < n; k++)
                    C[i][j] += A[i][k] * B[k][j];
        return C;
    }

    // Display matrix
    public static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.printf("%4d", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = createMatrix(2, 2);
        int[][] B = createMatrix(2, 2);

        System.out.println("Matrix A:");
        display(A);
        System.out.println("Matrix B:");
        display(B);

        System.out.println("\nA + B:");
        display(add(A, B));
        System.out.println("\nA - B:");
        display(subtract(A, B));
        System.out.println("\nA * B:");
        display(multiply(A, B));
    }
}
