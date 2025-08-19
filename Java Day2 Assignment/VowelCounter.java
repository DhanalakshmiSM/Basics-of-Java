import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert input to lowercase to make comparison case-insensitive
        input = input.toLowerCase();

        // Initialize vowel count
        int vowelCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Print the result
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}
