import java.util.Scanner;

public class NameArrayAccess {
    public static void main(String[] args) {
        // Declare an array of 10 names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Ivy", "Jack"};

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for an integer
            System.out.print("Enter a number to access the name in that position (0-9): ");
            int index = scanner.nextInt();

            // Display the name in the requested position
            System.out.println("Name at position " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block to handle ArrayIndexOutOfBoundsException
            System.out.println("Error: Index out of range. Please enter a number between 0 and 9.");
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
