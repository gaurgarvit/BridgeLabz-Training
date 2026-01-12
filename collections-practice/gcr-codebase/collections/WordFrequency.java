import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        // cleaning input and splitting by whitespace
        String[] words= input.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
        
        Map<String, Integer> freqMap= new HashMap<>();
        
        // counting occurrences of each word
        for (String word: words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0)+ 1);
        }
        
        System.out.println("Frequencies: "+ freqMap);
    }
}