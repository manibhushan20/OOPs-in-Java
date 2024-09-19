import java.util.Arrays;

public class ATM {
    private int[] notes; // Stores the count of notes for each denomination

    public ATM() {
        notes = new int[6];
    }

    public void deposit(int[] denomination) {
        for (int i = 0; i < 6; i++) {
            notes[i] += denomination[i]; // Add deposited notes to the ATM
        }
    }

    public int[] withdraw(int amount) {
        int[] result = new int[6];
        Arrays.fill(result, 0); // Initialize the result array with zeros

        // Calculate the number of notes to withdraw for each denomination
        for (int i = 5; i >= 0; i--) {
            result[i] = Math.min(amount / (i + 1), notes[i]); // Withdraw maximum available notes
            amount -= result[i] * (i + 1);
        }

        // If the amount is not completely withdrawn, return [-1]
        if (amount > 0) {
            return new int[]{-1};
        }

        // Update the count of notes in the ATM after withdrawing
        for (int i = 0; i < 6; i++) {
            notes[i] -= result[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        // Deposit notes of denominations [10, 20, 50, 100, 200, 500]
        atm.deposit(new int[]{10, 5, 3, 2, 1, 1});

        // Withdraw 300 rupees
        int[] withdrawResult = atm.withdraw(300);
        if (withdrawResult[0] == -1) {
            System.out.println("Cannot withdraw 300 rupees.");
        } else {
            System.out.println("Withdrawal successful:");
            System.out.print("Denominations: [");
            for (int i = 0; i < 6; i++) {
                System.out.print(withdrawResult[i]);
                if (i < 5) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
