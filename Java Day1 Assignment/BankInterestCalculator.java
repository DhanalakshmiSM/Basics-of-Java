class BankAccount {
    static double rateOfInterest = 5.0; // Common for all accounts
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * rateOfInterest) / 100;
    }
}

public class BankInterestCalculator {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);
        System.out.println("Interest for account1: " + account1.calculateInterest());
        System.out.println("Interest for account2: " + account2.calculateInterest());
    }
}
