import java.util.Scanner;

public class ArrayHandling2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        int i = 0; 

        while (i < 6) {
            try {
                System.out.print("Enter an integer: ");
                String input = scanner.next();
                array[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Exception occurred: Please enter integers only.");
                 array[i]=0;
             
                scanner.nextLine(); 
            }
            i++; 
        }

        System.out.println("Array elements:");
        for (int value : array) {
            System.out.println(value);
        }
    }
}
