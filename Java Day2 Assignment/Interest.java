class Interest {
    double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    double compoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }

    public static void main(String[] args) {
        Interest obj = new Interest();
        System.out.println("Simple Interest: " + obj.simpleInterest(1000, 5, 2));
        System.out.println("Compound Interest: " + obj.compoundInterest(1000, 5, 2));
    }
}
