class StaticVariabaleDemo {
    static String college = "Kalpataru Institute of Technology";
    String name;

    StaticVariabaleDemo(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name + ", College: " + college);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        StaticVariabaleDemo s1 = new StaticVariabaleDemo("Dhanu");
        StaticVariabaleDemo s2 = new StaticVariabaleDemo("Sahana");
        s1.display();
        s2.display();
    }
}
