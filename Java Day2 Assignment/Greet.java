class Greet {
    void greet(String firstName) {
        System.out.println("Hello, " + firstName);
    }
    void greet(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greet("Deeksha");
        obj.greet("Deeksha", "Patel");
    }
}
