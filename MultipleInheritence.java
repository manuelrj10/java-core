interface AccountOperations{
    void deposit(double amount);
}
interface LoanOperations{
    void applyLoan(double amount);
    void calculateInterest();
}

class  BankCustomer implements AccountOperations,LoanOperations{
    String name;
    double balance;
    double loanAmount;
    BankCustomer(String name,double balance){
        this.name=name;
        this.balance=balance;  
    }

    public void  deposit(double amount){
        balance+=amount;
        System.out.println("Account name"+name);
        System.out.println(" balance after deposit"+balance);
    }

    public void applyLoan(double amount){
         this.loanAmount=amount;
         if(balance>10000){
            System.out.println("loan of"+amount+"is approved");
         }
         else{
            System.out.println("loan of"+amount+"is rejected");
         }
    }
    public void calculateInterest(){
        double interst;
        interst=loanAmount*0.05*2;
        System.out.println("intersest rate"+interst);
    }
}

class MultipleInheritence{
    public static void main(String[] args) {
        BankCustomer bc=new BankCustomer("manuel",20000);
        bc.deposit(20000);
        bc.applyLoan(54000);
        bc.calculateInterest();

        
    }
}