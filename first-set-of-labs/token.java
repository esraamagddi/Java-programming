import java.util.StringTokenizer;

public class token {
    public static void main(String[] args) {
        String sentence = "hi hi hi hi hi hi, hi. hi hi hi, hi hi its esraa ";
        String Find = "hi";


        StringTokenizer tokenizer = new StringTokenizer(sentence, " .,'");

        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            if (tokenizer.nextToken().equalsIgnoreCase(Find)) {
                count++;
            }
        }

        System.out.println("Using StringTokenizer - Count: " + count);
    }
}
