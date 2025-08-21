// PaymentInterfaceDemo.java
// 22. Payment Interface
// Problem: Interface Payment with pay(). Implement in CreditCard, DebitCard.
// Steps:
// 1.	Create interface.
// 2.	Implement in two classes.
// 3.	Test with amounts.


interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class DebitCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card.");
    }
}

public class PaymentInterfaceDemo {
    public static void main(String[] args) {
        Payment credit = new CreditCard();
        Payment debit = new DebitCard();

        // Test payments
        credit.pay(1500.50);
        debit.pay(750.25);
    }
}
