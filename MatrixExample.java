abstract class MatrixOperation {
    abstract int[][] add(int[][] A, int[][] B);
    abstract int[][] subtract(int[][] A, int[][] B);
    abstract int[][] multiply(int[][] A, int[][] B);
}

class BasicMatOperation extends MatrixOperation {

    @Override
    int[][] add(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    @Override
    int[][] subtract(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    @Override
    int[][] multiply(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
}

public class MatrixExample {

    // Method to display the matrix
    public static void printMatrix(int[][] matrix) {
        // Iterate through each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Iterate through each column of the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Print the value at the current row and column
                System.out.print(matrix[i][j] + " ");
            }
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {{3, 4, 7}, {5, -2, 8}, {3, 5, 9}};
        int[][] B = {{14, 8, 17}, {12, 9, 7}, {10, -13, 15}};

        BasicMatOperation basicMatOperation = new BasicMatOperation();

        System.out.println("Matrix Addition:");
        int[][] additionResult = basicMatOperation.add(A, B);
        printMatrix(additionResult);

        System.out.println("Matrix Subtraction:");
        int[][] subtractionResult = basicMatOperation.subtract(A, B);
        printMatrix(subtractionResult);

        System.out.println("Matrix Multiplication:");
        int[][] multiplicationResult = basicMatOperation.multiply(A, B);
        printMatrix(multiplicationResult);
    }
}
