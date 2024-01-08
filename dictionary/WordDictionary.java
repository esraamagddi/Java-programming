package dictionary;
 
import java.util.*;

public class WordDictionary {
    private static TreeMap<Character, TreeSet<String>> wordMap = new TreeMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n----- Dictionary Menu -----");
            System.out.println("1. Print Dictionary");
            System.out.println("2. Get Words for a Key");
            System.out.println("3. Insert Words");
            System.out.println("4. Remove Word");
            System.out.println("5. Remove All Words for a Key");
            System.out.println("6. Search using Regular Expression");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printDictionary();
                    break;
                case 2:
                    System.out.print("Enter the key (letter): ");
                    char key = scanner.next().charAt(0);
                    getWords(key);
                    break;
                case 3:
                    System.out.print("Enter words (comma-separated): ");
                    scanner.nextLine();  // consume newline
                    String wordsInput = scanner.nextLine();
                    String[] wordsArray = wordsInput.split(",\\s*");
                    insert(Arrays.asList(wordsArray));
                    break;
                case 4:
                    System.out.print("Enter the word to remove: ");
                    String wordToRemove = scanner.next();
                    removeWord(wordToRemove);
                    break;
                case 5:
                    System.out.print("Enter the key (letter) to remove all words: ");
                    char keyToRemove = scanner.next().charAt(0);
                    removeAllKey(keyToRemove);
                    break;
                case 6:
                    System.out.print("Enter the regular expression pattern: ");
                    scanner.nextLine();  // consume newline
                    String regexPattern = scanner.nextLine();
                    search(regexPattern);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 0);
    }

    public static void printDictionary() {
        for (Map.Entry<Character, TreeSet<String>> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void getWords(char key) {
        key = Character.toUpperCase(key);
        if (wordMap.containsKey(key)) {
            System.out.println(key + ": " + wordMap.get(key));
        } else {
            System.out.println("No words found for key " + key);
        }
    }

    public static void insert(Collection<String> words) {
        for (String word : words) {
            char key = Character.toUpperCase(word.charAt(0));
            wordMap.computeIfAbsent(key, k -> new TreeSet<>()).add(word);
        }
        System.out.println("Words inserted successfully.");
    }

    public static void removeWord(String word) {
        char key = Character.toUpperCase(word.charAt(0));
        if (wordMap.containsKey(key)) {
            wordMap.get(key).remove(word);
            System.out.println("Word '" + word + "' removed successfully.");
        } else {
            System.out.println("No words found for key " + key);
        }
    }

    public static void removeAllKey(char key) {
        key = Character.toUpperCase(key);
        if (wordMap.containsKey(key)) {
            wordMap.remove(key);
            System.out.println("All words for key " + key + " removed successfully.");
        } else {
            System.out.println("No words found for key " + key);
        }
    }

    public static void search(String searchString) {
        System.out.println("Matching words:");
    
        for (TreeSet<String> wordSet : wordMap.values()) {
            for (String word : wordSet) {
                if (word.toLowerCase().contains(searchString.toLowerCase())) {
                    System.out.println(word);
                }
            }
        }
    }
    
}
