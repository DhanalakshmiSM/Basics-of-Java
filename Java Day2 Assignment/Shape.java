class Shape {
    int length, breadth;
}
class Rectangle extends Shape {
    int area() { return length * breadth; }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 5; r.breadth = 10;
        System.out.println("Area: " + r.area());
    }
}
