import java.util.Scanner;

class Matrix {
    private int[][] matrix;

    // Constructor to initialize the matrix
    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
    }

    // Input method to fill the matrix with user input
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Display method to print the matrix
    public void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Static method for matrix addition
    public static Matrix add(Matrix m1, Matrix m2) {
        int rows = m1.matrix.length;
        int columns = m1.matrix[0].length;
        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
        }

        return result;
    }
}

public class MatrixDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for matrix 1
        System.out.println("Enter dimensions of matrix 1 (rows columns):");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();
        Matrix matrix1 = new Matrix(rows1, columns1);
        matrix1.input();

        // Input for matrix 2
        System.out.println("Enter dimensions of matrix 2 (rows columns):");
        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();
        Matrix matrix2 = new Matrix(rows2, columns2);
        matrix2.input();

        // Display matrices
        System.out.println("Matrix 1:");
        matrix1.display();
        System.out.println("Matrix 2:");
        matrix2.display();

        // Addition
        if (rows1 == rows2 && columns1 == columns2) {
            Matrix sumMatrix = Matrix.add(matrix1, matrix2);
            System.out.println("Sum of matrices:");
            sumMatrix.display();
        } else {
            System.out.println("Matrices cannot be added. Dimensions are not compatible.");
        }
    }
}
