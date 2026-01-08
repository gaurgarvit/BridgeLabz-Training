import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "text_data.txt"; // ensure this file exists
        Map<String, Integer> wordCounts= new HashMap<>();

        // reading the file using buffered reader
        try (BufferedReader br= new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // processing the file line by line
            while((line= br.readLine()) != null){
                // splitting line into words by removing non-alphanumeric chars
                String[] words= line.toLowerCase().split("\\W+");
                
                for(String word: words){
                    if(word.isEmpty()){
                        continue;
                    }
                    
                    // updating the count in the hashmap
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        } 
        catch(IOException e){
            e.printStackTrace();
        }

        // sorting the map by values (frequency)
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCounts.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue())); // descending order

        // displaying the top 5 frequent words
        System.out.println("Top 5 Most Frequent Words:");
        int count= 0;

        for(Map.Entry<String, Integer> entry: list) {
            System.out.println(entry.getKey()+ ": "+ entry.getValue());
            count++;
            if (count >= 5){
                break;
            }
        }
    }
}