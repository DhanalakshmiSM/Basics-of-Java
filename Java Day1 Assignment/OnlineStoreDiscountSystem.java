class Product {
    String name;
    double price;
    static double festivalDiscount = 10.0; // 10% discount

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double calculateDiscountedPrice() {
        return price - (price * festivalDiscount / 100);
    }
}

public class OnlineStoreDiscountSystem {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);
        System.out.println("Discounted price of " + product1.name + ": " + product1.calculateDiscountedPrice());
    }
}
