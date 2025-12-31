import java.util.Arrays;
import java.util.HashSet;

public class ChallengeProblem2 {
    public static void main(String[] args) {
        // taking numbers array and target element
        int[] nums= {3, 4, -1, 1};
        int target= 4;

        // method to find missing positive number
        int missing= findMissing(nums);
        System.out.println("First missing positive integer: "+ missing);

        // sorting the numbers array
        Arrays.sort(nums);
        int targetIdx= binarySearch(nums, target);
        
        if(targetIdx!= -1) {
            System.out.println("Target "+ target+ " found at index: "+ targetIdx);
        } 
        else{
            System.out.println("Target not found");
        }
    }

    // logic to find the mising positive number
    public static int findMissing(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int i= 1;
        while(true){
            if(!set.contains(i)){
                return i;
            }

            i++;
        }
    }

    // binary search logic
    public static int binarySearch(int[] arr, int target) {
        int left= 0;
        int right= arr.length- 1;

        while(left<= right){
            int mid= left + (right - left)/ 2;

            if(arr[mid]== target){
                return mid;
            }
            if(arr[mid]< target) {
                left= mid + 1;
            } 
            else{
                right= mid - 1;
            }
        }

        return -1;
    }
}