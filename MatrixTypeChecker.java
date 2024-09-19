import java.util.Scanner;

public class MatrixTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // Taking input for the matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix
        System.out.println("The entered matrix is:");
        displayMatrix(matrix);

        // Checking if the matrix is symmetric, skew-symmetric, or neither
        if (isSymmetric(matrix)) {
            System.out.println("The matrix is symmetric.");
        } else if (isSkewSymmetric(matrix)) {
            System.out.println("The matrix is skew-symmetric.");
        } else {
            System.out.println("The matrix is neither symmetric nor skew-symmetric.");
        }
    }

    // Method to display the matrix
    public static void displayMatrix(int[][] matrix) {
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


    // Method to check if the matrix is symmetric
    public static boolean isSymmetric(int[][] matrix) {
        // Check if the transpose of the matrix is equal to the matrix itself
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to check if the matrix is skew-symmetric
    public static boolean isSkewSymmetric(int[][] matrix) {
        // Check if the transpose of the matrix is equal to the negative of the matrix itself
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != -matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
