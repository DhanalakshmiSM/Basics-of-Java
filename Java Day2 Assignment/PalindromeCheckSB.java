import java.util.Scanner;

public class PalindromeCheckSB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Clean the string
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse using StringBuilder
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare
        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
