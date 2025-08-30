import java.util.Random;

public class MatrixAdvanced {

    // Create random matrix
    public static double[][] createMatrix(int n) {
        Random rand = new Random();
        double[][] M = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                M[i][j] = rand.nextInt(10);
        return M;
    }

    // Transpose
    public static double[][] transpose(double[][] M) {
        int n = M.length;
        double[][] T = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                T[j][i] = M[i][j];
        return T;
    }

    // Determinant of 2x2
    public static double determinant2x2(double[][] M) {
        return M[0][0] * M[1][1] - M[0][1] * M[1][0];
    }

    // Determinant of 3x3
    public static double determinant3x3(double[][] M) {
        return M[0][0] * (M[1][1] * M[2][2] - M[1][2] * M[2][1])
             - M[0][1] * (M[1][0] * M[2][2] - M[1][2] * M[2][0])
             + M[0][2] * (M[1][0] * M[2][1] - M[1][1] * M[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(double[][] M) {
        double det = determinant2x2(M);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");
        double[][] inv = new double[2][2];
        inv[0][0] = M[1][1] / det;
        inv[0][1] = -M[0][1] / det;
        inv[1][0] = -M[1][0] / det;
        inv[1][1] = M[0][0] / det;
        return inv;
    }

    // Display matrix
    public static void display(double[][] M) {
        for (double[] row : M) {
            for (double val : row) System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] M = createMatrix(2);

        System.out.println("Matrix:");
        display(M);

        System.out.println("\nTranspose:");
        display(transpose(M));

        System.out.println("\nDeterminant: " + determinant2x2(M));

        try {
            System.out.println("\nInverse:");
            display(inverse2x2(M));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
