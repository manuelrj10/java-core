class Bank{
    public static void main(String args[]){
        BankAccount acc = new BankAccount("A101","Rahul",5000);
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.withdraw(10000);
        acc.displayAccount();
    }
}