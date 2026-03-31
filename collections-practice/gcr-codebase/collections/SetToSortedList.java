import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        // initializing a hashset with unordered numbers
        Set<Integer> set= new HashSet<>(Arrays.asList(5, 3, 9, 1));
        
        // converting set to arraylist
        List<Integer> sortedList= new ArrayList<>(set);
        
        // sorting the list in ascending order
        Collections.sort(sortedList);
        
        System.out.println("Sorted List: "+ sortedList);
    }
}