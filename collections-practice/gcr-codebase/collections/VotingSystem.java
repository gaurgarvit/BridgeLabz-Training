import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        String[] votes = {"Alice", "Bob", "Alice", "Charlie", "Bob"};
        Map<String, Integer> countMap= new HashMap<>();

        // counting votes using hashmap
        for(String v: votes){
            countMap.put(v, countMap.getOrDefault(v, 0)+ 1);
        }

        // sorting results using treemap
        Map<String, Integer> sortedResults= new TreeMap<>(countMap);

        // preserving order using linkedhashmap (simulated)
        Map<String, Integer> linkedResults= new LinkedHashMap<>(countMap);

        System.out.println("Sorted Results: "+ sortedResults);
        System.out.println("Linked Results: "+ linkedResults);
    }
}