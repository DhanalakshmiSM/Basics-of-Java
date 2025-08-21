// 17. Abstract Appliance
// Problem: Abstract class Appliance with turnOn() and turnOff(). Implement in WashingMachine and TV.
// Steps:
// 1.	Create abstract Appliance.
// 2.	Implement in subclasses.
// 3.	Test in main().

abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

class WashingMachine extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Washing Machine is now ON");
    }

    @Override
    void turnOff() {
        System.out.println("Washing Machine is now OFF");
    }
}

class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is now ON");
    }

    @Override
    void turnOff() {
        System.out.println("TV is now OFF");
    }
}
public class AbstractAppliance {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine();
        Appliance tv = new TV();

        washingMachine.turnOn();
        washingMachine.turnOff();

        tv.turnOn();
        tv.turnOff();
    }
}

