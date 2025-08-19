class Device {
    String model;
    double price;

    Device(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}

class Smartphone extends Device {
    String osType;

    Smartphone(String model, double price, String osType) {
        super(model, price);
        this.osType = osType;
    }

    void display() {
        super.display();
        System.out.println("OS Type: " + osType);
    }

    public static void main(String[] args) {
        Smartphone sp = new Smartphone("iPhone 14", 79999, "iOS");
        sp.display();
    }
}
