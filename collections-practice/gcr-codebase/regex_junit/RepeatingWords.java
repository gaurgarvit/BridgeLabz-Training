import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a test test string string";

        // regular Expression for finding repeating words
        String regex = "\\b(\\w+)\\s+\\1\\b";

        // finding repeating words
        Matcher m = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(text);

        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
    
}