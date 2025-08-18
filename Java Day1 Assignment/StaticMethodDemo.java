class MathUtils {
    static int square(int x) {
        return x * x;
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        int result = MathUtils.square(5);
        System.out.println("Square: " + result);
    }
}
