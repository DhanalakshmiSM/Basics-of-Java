import java.io.*;
import java.util.*;

// ================= Custom Exceptions =================
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String msg) {
        super(msg);
    }
}

// ================= Account Base Class =================
class Account {
    protected int accountId;
    protected String holderName;
    protected double balance;

    public Account(int accountId, String holderName, double balance) {
        this.accountId = accountId;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getHolderName() {
        return holderName;
    }

    @Override
    public String toString() {
        return accountId + ", " + holderName + ", " + balance;
    }
}

// ================= Savings Account =================
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int id, String name, double balance, double interestRate) {
        super(id, name, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
    }
}

// ================= Current Account =================
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int id, String name, double balance, double overdraftLimit) {
        super(id, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientBalanceException("Overdraft limit exceeded!");
        }
    }
}

// ================= ATM Manager =================
class ATM {
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private static final String ACCOUNTS_FILE = "accounts.txt";
    private static final String TRANSACTIONS_FILE = "transactions.txt";

    public ATM() {
        loadAccounts();
    }

    public void createAccount(String name, double balance, String type) {
        int id = generateAccountId();
        Account acc;
        if (type.equalsIgnoreCase("savings")) {
            acc = new SavingsAccount(id, name, balance, 3.5); // 3.5% interest
        } else {
            acc = new CurrentAccount(id, name, balance, 5000); // overdraft 5000
        }
        accounts.put(id, acc);
        saveAccounts();
        logTransaction("Account " + id + " created with balance " + balance);
        System.out.println("Account created successfully! ID: " + id);
    }

    public void depositMoney(int id, double amount) throws Exception {
        Account acc = findAccount(id);
        acc.deposit(amount);
        saveAccounts();
        logTransaction("Account " + id + " deposited " + amount);
        System.out.println("Deposit successful!");
    }

    public void withdrawMoney(int id, double amount) throws Exception {
        Account acc = findAccount(id);
        acc.withdraw(amount);
        saveAccounts();
        logTransaction("Account " + id + " withdrew " + amount);
        System.out.println("Withdrawal successful!");
    }

    public void checkBalance(int id) throws Exception {
        Account acc = findAccount(id);
        System.out.println("Balance: " + acc.getBalance());
    }

    public void viewAccounts() {
        for (Account acc : accounts.values()) {
            System.out.println(acc);
        }
    }

    // 🔹 Helper Methods
    private Account findAccount(int id) throws Exception {
        if (!accounts.containsKey(id))
            throw new AccountNotFoundException("Account not found!");
        return accounts.get(id);
    }

    private int generateAccountId() {
        return accounts.size() + 101;
    }

    private void saveAccounts() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ACCOUNTS_FILE))) {
            for (Account acc : accounts.values()) {
                pw.println(acc);
            }
        } catch (IOException e) {
            System.out.println("Error saving accounts!");
        }
    }

    private void loadAccounts() {
        try (BufferedReader br = new BufferedReader(new FileReader(ACCOUNTS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double balance = Double.parseDouble(parts[2]);
                accounts.put(id, new Account(id, name, balance));
            }
        } catch (IOException e) {
            System.out.println("No existing accounts found. Starting fresh.");
        }
    }

    private void logTransaction(String msg) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(TRANSACTIONS_FILE, true))) {
            pw.println(msg);
        } catch (IOException e) {
            System.out.println("Error logging transaction!");
        }
    }
}

// ================= Main Class =================
public class ATMSystem {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        double bal = sc.nextDouble();
                        System.out.print("Enter Account Type (savings/current): ");
                        sc.nextLine();
                        String type = sc.nextLine();
                        atm.createAccount(name, bal, type);
                        break;

                    case 2:
                        System.out.print("Enter Account ID: ");
                        int depId = sc.nextInt();
                        System.out.print("Enter Amount: ");
                        double depAmt = sc.nextDouble();
                        atm.depositMoney(depId, depAmt);
                        break;

                    case 3:
                        System.out.print("Enter Account ID: ");
                        int wId = sc.nextInt();
                        System.out.print("Enter Amount: ");
                        double wAmt = sc.nextDouble();
                        atm.withdrawMoney(wId, wAmt);
                        break;

                    case 4:
                        System.out.print("Enter Account ID: ");
                        int bId = sc.nextInt();
                        atm.checkBalance(bId);
                        break;

                    case 5:
                        atm.viewAccounts();
                        break;

                    case 6:
                        System.out.println("Thank you for using ATM!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
