public class ExtractDigits {
    public static void main(String[] args) {
        String str = "Java123Code456";
        String digits = str.replaceAll("\\D", "");
        System.out.println("Extracted Digits: " + digits);
    }
}
