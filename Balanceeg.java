package encapsulation;

public class Balanceeg {
    private double balance;

    public double getBalance() {
        return balance;
    }

    // Initialize the account
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    public void setDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void setWithdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds! Current balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        }
    }
}