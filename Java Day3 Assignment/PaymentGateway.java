// 8. Payment Gateway
// Problem: Base class Payment with pay(). Subclasses CreditCard, DebitCard, UPI override it.
// Steps:
// 1.	Define class Payment with void pay(double amount).
// 2.	Override in subclasses → print method used.
// 3.	In main(), test with amount.

class Payment {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed.");
    }
}

class CreditCard extends Payment {

    public void pay(double amount) {
        System.out.println("Credit Card payment of $" + amount + " processed.");
    }
}

class DebitCard extends Payment {
    
    public void pay(double amount) {
        System.out.println("Debit Card payment of $" + amount + " processed.");
    }
}

class UPI extends Payment {
    
    public void pay(double amount) {
        System.out.println("UPI payment of $" + amount + " processed.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        Payment payment2 = new DebitCard();
        Payment payment3 = new UPI();

        payment1.pay(100.0);
        payment2.pay(200.0);
        payment3.pay(300.0);
    }
}
