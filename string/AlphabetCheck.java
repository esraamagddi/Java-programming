package string;

import java.util.Scanner;

public class AlphabetCheck {

    public static boolean containsOnlyAlphabets(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String testString = scanner.nextLine();

        if (containsOnlyAlphabets(testString)) {
            System.out.println("The string contains only alphabets.");
        } else {
            System.out.println("The string contains non-alphabetic characters.");
        }

        scanner.close();
    }
}