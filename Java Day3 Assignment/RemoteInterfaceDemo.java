// RemoteInterfaceDemo.java
// 27. Remote Interface
// Problem: Interface Remote with turnOn() and turnOff(). Implement in TVRemote and ACRemote.
// Steps:
// 1.	Define interface.
// 2.	Implement in two classes.
// 3.	Test remote functionality.


interface Remote {
    void turnOn();
    void turnOff();
}

class TVRemote implements Remote {
    @Override
    public void turnOn() {
        System.out.println("TV is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now OFF.");
    }
}

class ACRemote implements Remote {
    @Override
    public void turnOn() {
        System.out.println("AC is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is now OFF.");
    }
}

public class RemoteInterfaceDemo {
    public static void main(String[] args) {
        Remote tv = new TVRemote();
        Remote ac = new ACRemote();

        // Test TV Remote
        tv.turnOn();
        tv.turnOff();

        System.out.println("---------------");

        // Test AC Remote
        ac.turnOn();
        ac.turnOff();
    }
}
