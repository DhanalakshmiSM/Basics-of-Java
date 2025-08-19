public class CharacterAnalysis {
    public static void main(String[] args) {
        String text = "Hello123";
        int upper = 0, lower = 0, digit = 0;
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
            else if (Character.isDigit(c)) digit++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower + ", Digits: " + digit);
    }
}
