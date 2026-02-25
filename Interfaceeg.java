
interface PaymentMethod {

    void pay(double amount);

}

class CreditCard implements PaymentMethod {

    double balance;

    CreditCard(double balance) {
        this.balance = balance;
    }

    public void pay(double amount) {
        if (balance > 0 && amount <= balance) {
            System.out.println("payment succesful");
            balance -= amount;
            System.out.println("balance after payemnt" + balance);
        } else {
            System.out.println("payment unsucceful");
        }

    }
}

class UPI implements PaymentMethod {

    double balance;

    UPI(double balance) {
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if (balance > 0 && amount <= balance) {
            System.out.println("payment succesful");
            balance -= amount;
            System.out.println("balance after payemnt" + balance);

        } else {
            System.out.println("payment unsucceful");
        }

    }
}

class Cash implements PaymentMethod {

    double balance;

    Cash(double balance) {
        this.balance = balance;
    }

    public void pay(double amount) {
        if (balance > 0 && amount <= balance) {
            System.out.println("payment succesful");
            balance -= amount;
            System.out.println("balance after payemnt" + balance);
        } else {
            System.out.println("payment unsucceful");
        }

    }
}

class Interfaceeg {

    public static void main(String[] args) {
        PaymentMethod p = new UPI(5000);
        p.pay(6000);

        PaymentMethod c = new Cash(15000);
        c.pay(1500);

        PaymentMethod cc = new CreditCard(15000);
        cc.pay(2500);

    }
}
