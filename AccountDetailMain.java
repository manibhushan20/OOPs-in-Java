class AccountDetail {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public AccountDetail(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Current Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal not processed.");
        }
    }
}

class SavingsAccount extends AccountDetail {

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance limit reached.");
        }
    }
}

public class AccountDetailMain {
    public static void main(String[] args) {
        // Scenario a
        System.out.println("Scenario a:");
        SavingsAccount savingsAccount1 = new SavingsAccount("123456", "John Doe", 0);
        savingsAccount1.deposit(3000);
        savingsAccount1.deposit(2000);
        savingsAccount1.deposit(7000);
        savingsAccount1.withdraw(12000);

        // Scenario b
        System.out.println("\nScenario b:");
        SavingsAccount savingsAccount2 = new SavingsAccount("789012", "Jane Smith", 0);
        savingsAccount2.deposit(3000);
        savingsAccount2.deposit(2000);
        savingsAccount2.deposit(7000);
        savingsAccount2.withdraw(13000);
    }
}
