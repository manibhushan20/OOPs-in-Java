import java.util.Scanner;

public class TryandCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();

        try {
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by 0");
            }
            double result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
