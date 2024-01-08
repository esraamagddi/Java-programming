public class str {
    public static void main(String[] args) {
        String sentence = "hi hi hi hi hi hi hi hi hi hi hi hi its esraa ";
        String find = "hi";

        int count1 = 0;
        int index1 = -1;

        while ((index1 = sentence.indexOf(find, index1 + 1)) != -1) {
            count1++;
        }

        String[] words = sentence.split(" ");
        int count2 = 0;

        for (String word : words) {
            if (word.equals(find)) {
                count2++;
            }
        }

        // Method three
        int count3 = replace(sentence, find);

        System.out.println("With index - Count: " + count1);
        System.out.println("With split - Count: " + count2);
        System.out.println("With replace - Count: " + count3);
    }

    private static int replace(String sentence, String find) {
        int originalLength = sentence.length();
        int replacedLength = sentence.replace(find, "").length();

        int count3 = (originalLength - replacedLength) / find.length();
        return count3;
    }
}
