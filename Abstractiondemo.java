abstract class BankAccount{
    double balance;

    BankAccount(double balance) {
        this.balance=balance;
    }
    

    void deposit(double amount){
        balance+=amount;
        System.out.println("balance after deposit"+balance);
    }

    abstract void calculateInterest();
}

class SavingsAccount extends BankAccount{

    SavingsAccount(double balance){
        super(balance);
    }
    @Override
    void calculateInterest(){
        double interst;
        interst=super.balance*0.05*2;
        System.out.println("intersest rate"+interst);
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(double balance){
    super(balance);
    }
    @Override
    void calculateInterest(){
        double interst;
        interst=super.balance*0.02*2;
        System.out.println("intersest rate"+interst);
    }


}
class Abstractiondemo{
    public static void main(String[] args) {

        System.out.println("Saving account");
        BankAccount sv=new SavingsAccount(50000);
        sv.deposit(2000);
        sv.calculateInterest();

        System.out.println("current account");
        BankAccount ca= new CurrentAccount(60000);
        ca.deposit(2000);
        ca.calculateInterest();
       
    }
}