import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize an empty string for the reversed version
        String reversed = "";

        // Loop through the original string from end to start
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append each character
        }

        // Output the result
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
