import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        // initializing the two sets
        Set<Integer> set1= new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2= new HashSet<>(Arrays.asList(1, 2, 3, 4));
        
        // checking if set2 contains all elements of set1
        boolean isSubset= set2.containsAll(set1);
        
        System.out.println("Is Subset: "+ isSubset);
    }
}