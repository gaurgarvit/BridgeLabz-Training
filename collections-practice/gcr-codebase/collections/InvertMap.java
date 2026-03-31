import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> input= new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> output= new HashMap<>();

        // iterating entry set to swap key and value
        for (Map.Entry<String, Integer> entry: input.entrySet()) {
            output.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println("Inverted Map: "+ output);
    }
}