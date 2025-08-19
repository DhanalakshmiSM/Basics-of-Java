class Appliance {
    String brand;
    int power; // in watts

    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Power: " + power + "W");
    }
}

class WashingMachine extends Appliance {
    int capacity; // in kg

    WashingMachine(String brand, int power, int capacity) {
        super(brand, power);
        this.capacity = capacity;
    }

    void display() {
        super.display();
        System.out.println("Capacity: " + capacity + " Kg");
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("Samsung", 1500, 7);
        wm.display();
    }
}
