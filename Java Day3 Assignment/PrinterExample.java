// 9. Printer Example
// Problem: Base class Printer with method print(). Subclasses InkjetPrinter, LaserPrinter, DotMatrixPrinter override it.
// Steps:
// 1.	Create base class Printer.
// 2.	Override to display printing type.
// 3.	In main(), test all.

class Printer{
    public void print(){
        System.out.println("Printing Started..");
    }
}

class InkjetPrinter extends Printer {
    public void print() {
        System.out.println("Inkjet Printer is printing...");
    }
}

class LaserPrinter extends Printer {
    public void print() {
        System.out.println("Laser Printer is printing...");
    }
}

class DotMatrixPrinter extends Printer {
    public void print() {
        System.out.println("Dot Matrix Printer is printing...");
    }
}

public class PrinterExample {
    public static void main(String[] args) {
        Printer printer1 = new InkjetPrinter();
        Printer printer2 = new LaserPrinter();
        Printer printer3 = new DotMatrixPrinter();

        printer1.print();
        printer2.print();
        printer3.print();
    }
}
