import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a password that contains at least two uppercase letters, two lowercase letters, and two digits:");
            String password = input.nextLine();

            int uppercaseCount = 0;
            int lowercaseCount = 0;
            int digitCount = 0;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    uppercaseCount++;
                } else if (ch >= 'a' && ch <= 'z') { 
                    lowercaseCount++;
                } else if (ch >= '0' && ch <= '9') { 
                    digitCount++;
                }
            }

            if (uppercaseCount < 2 || lowercaseCount < 2 || digitCount < 2) {
                System.out.println("Invalid password. Please ensure you have at least two uppercase letters, two lowercase letters, and two digits.");
            } else {
                System.out.println("Valid password. Congratulations!");
                break;
            }
        }
        input.close();
    }
}
