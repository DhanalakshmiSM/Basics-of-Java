// 11. Abstract BankAccount
// Problem: Abstract class BankAccount with methods deposit() and withdraw(). Subclasses SavingsAccount, CurrentAccount implement differently.
// Steps:
// 1.	Define abstract class BankAccount with balance.
// 2.	Abstract methods: deposit, withdraw.
// 4.	Test in main().

abstract class BankAccount{

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double balance;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of $" + amount);
        }
    }
}

class CurrentAccount extends BankAccount {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Overdraft limit exceeded for withdrawal of $" + amount);
        }
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount current = new CurrentAccount(500);

        savings.deposit(1000);
        savings.withdraw(200);
        savings.withdraw(900);

        current.deposit(1000);
        current.withdraw(200);
        current.withdraw(700);
    }
}