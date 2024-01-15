package dictionary;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleWordDictionary dictionary = new SimpleWordDictionary();

        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Insert words");
            System.out.println("2. Remove word");
            System.out.println("3. Remove all words for a letter");
            System.out.println("4. Search for words");
            System.out.println("5. Display entire dictionary");
            System.out.println("6. Display words for a specific letter");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter words (comma-separated):");
                    String[] words = scanner.nextLine().split(",");
                    dictionary.addWords(words);
                    break;
                case 2:
                    System.out.println("Enter word to remove:");
                    String wordToRemove = scanner.nextLine();
                    dictionary.removeWord(wordToRemove);
                    break;
                case 3:
                    System.out.println("Enter letter to remove all words:");
                    char letterToRemove = scanner.nextLine().charAt(0);
                    dictionary.removeAll(letterToRemove);
                    break;
                case 4:
                    System.out.println("Enter search string:");
                    String searchString = scanner.nextLine();
                    dictionary.search(searchString);
                    break;
                case 5:
                    dictionary.printAllLettersAndWords();
                    break;
                case 6:
                    System.out.println("Enter letter to display:");
                    char letterToDisplay = scanner.nextLine().charAt(0);
                    dictionary.printWordsOfGivenLetter(letterToDisplay);
                    break;
                case 7:
                    System.out.println("Exiting program. Thanks for using our dictionary!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}