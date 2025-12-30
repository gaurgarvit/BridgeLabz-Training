import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// pair class to store starting and ending index
class Pair{
    int start, end;
    Pair(int s, int e) {
        this.start= s;
        this.end= e;
    }

    @Override
    public String toString() { 
        return "("+ start+ ", "+ end+ ")";
    }
}

public class ZeroSumSubarrays {

    // finding all zero sum subarrays
    public static List<Pair> findSubarrays(int[] arr) {
        List<Pair> result= new ArrayList<>();

        // mapping cumulative sum to list of indices
        Map<Integer, List<Integer>> map= new HashMap<>();
        
        int sum = 0;

        // handling case where subarray starts from index 0
        List<Integer> init= new ArrayList<>();
        init.add(-1);
        map.put(0, init);

        for(int i=0;i<arr.length;i++) {
            sum+= arr[i];

            // checking if sum seen before
            if(map.containsKey(sum)){
                List<Integer> list= map.get(sum);
                // creating subarrays for all previous occurrences

                for(int index: list){
                    result.add(new Pair(index + 1, i));
                }
            }
            
            // adding current index to map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // array storing integers
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};

        // method to find subarrays
        List<Pair> out = findSubarrays(arr);
        System.out.println("Subarrays with 0 sum (start, end indices): " + out);
    }
}