import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to calculate the determinant of a matrix
    public static int determinant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int det = 0;
        for (int k = 0; k < n; k++) {
            int[][] minor = new int[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int colIndex = 0;
                for (int j = 0; j < n; j++) {
                    if (j == k) continue;
                    minor[i - 1][colIndex++] = matrix[i][j];
                }
            }
            det += Math.pow(-1, k) * matrix[0][k] * determinant(minor);
        }
        return det;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows for matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns for matrices: ");
        int cols = scanner.nextInt();

        // Create two random matrices
        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Perform operations
        System.out.println("\nAddition of Matrices:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("\nSubtraction of Matrices:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("\nTranspose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        if (rows == cols) {
            System.out.println("\nDeterminant of Matrix A: " + determinant(matrixA));
        } else {
            System.out.println("\nMatrix A is not square; determinant not applicable.");
        }

        if (cols == matrixB.length) {
            System.out.println("\nMultiplication of Matrices A and B:");
            displayMatrix(multiplyMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nMatrix multiplication not possible with given dimensions.");
        }

        scanner.close();
    }
}
