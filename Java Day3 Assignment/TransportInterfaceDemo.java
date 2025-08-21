// TransportInterfaceDemo.java
// 25. Transport Interface
// Problem: Interface Transport with deliver(). Implement in Truck and Ship.
// Steps:
// 1.	Define interface.
// 2.	Implement in classes.
// 3.	Print delivery method.


interface Transport {
    void deliver();
}

class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering goods by Truck via road transport.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering goods by Ship via sea transport.");
    }
}

public class TransportInterfaceDemo {
    public static void main(String[] args) {
        Transport truck = new Truck();
        Transport ship = new Ship();

        // Print delivery methods
        truck.deliver();
        ship.deliver();
    }
}
