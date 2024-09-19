import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for an input value
            System.out.print("Enter a number to calculate its square root: ");
            double number = scanner.nextDouble();

            // Calculate the square root
            double squareRoot = Math.sqrt(number);

            // Display the square root
            System.out.println("Square root of " + number + " is: " + squareRoot);
        } catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException when the input value is negative
            System.out.println("Error: Cannot calculate square root of a negative number.");
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
