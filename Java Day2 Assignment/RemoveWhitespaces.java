public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        String result = str.replaceAll(" ", "");
        System.out.println("Without spaces: " + result);
    }
}
