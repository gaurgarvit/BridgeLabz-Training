import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "java is fun java is powerful";
        List<String> words = Arrays.asList(paragraph.split(" "));

        // analyzing paragraph for word occurrence
        Map<String, Integer> frequencyMap = words.stream()
            .collect(Collectors.toMap(
                word -> word, // mapping word as key
                word -> 1, // mapping initial count as value
                Integer::sum // merging counts for duplicate words
            ));

        System.out.println(frequencyMap);
    }
}