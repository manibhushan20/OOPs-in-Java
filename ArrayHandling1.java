import java.util.Scanner;

public class ArrayHandling1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];

        try {
            for (int i = 0; i < 6; i++) {
                System.out.print("Enter an integer: ");
                String input = scanner.next();
                array[i] = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {

                        System.out.println("Exception occurred: Please enter integers only.");
            for (int j = array.length; j <6 ; j++) {
                array[j] = 0;
            }
        }

        System.out.println("Array elements:");
        for (int value : array) {
            System.out.println(value);
        }
    }
}
