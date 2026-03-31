import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        // creating a list of integers
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int distance= 2;
        
        System.out.println("Original: "+ list);
        
        // rotating the elements by the given distance
        Collections.rotate(list, distance);
        
        System.out.println("Rotated: "+ list);
    }
}