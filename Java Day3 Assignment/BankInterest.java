// 4. Bank Interest
// Problem: Base class Bank has method getInterestRate(). Subclasses SBI, ICICI, HDFC override it.
// Steps:
// 1.	Create class Bank with double getInterestRate().
// 2.	Override in subclasses: SBI (6%), ICICI (7%), HDFC (7.5%).
// 3.	In main(), create objects and print rates.

class Bank {
    public double getInterestRate() {
        return 0; 
    }
}
class SBI extends Bank {
    public double getInterestRate() {
        return 6.0;
    }
}

class ICICI extends Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class HDFC extends Bank {
    public double getInterestRate() {
        return 7.5;
    }
}
public class BankInterest {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}