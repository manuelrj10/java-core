package encapsulation;

public class Balanceog {
    public static void main(String[] args) {
        Balanceeg bl = new Balanceeg();

        // 1. Set Initial Balance
        bl.setBalance(10000);
        System.out.println("Starting Balance: " + bl.getBalance());

        // 2. Withdraw
        bl.setWithdraw(1000);
        System.out.println("Balance after withdrawal: " + bl.getBalance());

        // 3. Deposit
        bl.setDeposit(5000);
        System.out.println("Final Balance: " + bl.getBalance());
        
        // 4. Test Insufficient Funds
        bl.setWithdraw(20000); 
    }
}