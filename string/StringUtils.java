package string;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class StringUtils {

    public static String betterString(String string1, String string2, BiPredicate<String, String> betterPredicate) {
        return betterPredicate.test(string1, string2) ? string1 : string2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        String longer = betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("Longer String: " + longer);

        String first = betterString(string1, string2, (s1, s2) -> true);
        System.out.println("First String: " + first);

        scanner.close();
    }
}