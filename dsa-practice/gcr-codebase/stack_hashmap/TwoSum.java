import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // finding indices for two sum
    public static int[] findTwoSum(int[] nums, int target) {
        // mapping value to index
        Map<Integer, Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement= target - nums[i];
            
            // checking if complement exists in map
            if (map.containsKey(complement)) {
                return new int[] { 
                    map.get(complement), i
                };
            }
            
            // adding current number to map
            map.put(nums[i], i);
        }

        // returning default indicator if not found
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        // taking numbers and target as input
        int[] nums= {2, 7, 11, 15};
        int target= 9;
        
        // to calculate two sum
        int[] result= findTwoSum(nums, target);
        
        // checking result
        if(result[0]!= -1){
            System.out.println("Indices: "+ Arrays.toString(result));
        } 
        else{
            System.out.println("No solution found");
        }
    }
}