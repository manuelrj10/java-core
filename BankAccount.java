
class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()
                || accountHolder == null || accountHolder.isEmpty()
                || balance < 0) {
            throw new IllegalArgumentException("Invalid account creation");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);

    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "is succesfully deposited");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "is succesfully withdrawn");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
