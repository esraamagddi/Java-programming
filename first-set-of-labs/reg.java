import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reg {
    public static void main(String[] args) {
        String sentence = "hi hi hi hi hi hi hi hi, hi hi hi ?hi its esraa ";
        String Find = "hi";

        Pattern pattern = Pattern.compile("\\b" + Find + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("Using Regular Expressions - Count: " + count);
    }
}
