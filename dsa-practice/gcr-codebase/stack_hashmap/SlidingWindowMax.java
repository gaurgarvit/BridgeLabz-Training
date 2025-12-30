import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {

    // finding max in sliding window
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // returning empty array
        if (nums== null || k<= 0){
            return new int[0];
        } 
        
        int n= nums.length;
        int[] result= new int[n - k + 1];
        int ri= 0; // result index
        
        // using deque to store indices
        Deque<Integer> deque= new LinkedList<>();

        for(int i=0;i<nums.length;i++){
            // removing indices out of current window
            while(!deque.isEmpty() && deque.peek()< i - k + 1) {
                deque.poll();
            }

            // removing smaller elements from back as they are useless
            while(!deque.isEmpty() && nums[deque.peekLast()]< nums[i]){
                deque.pollLast();
            }

            // adding current element index
            deque.offer(i);

            // adding max to result array
            if(i>= k - 1){
                result[ri++]= nums[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // array of numbers
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k= 3;
        int[] result= maxSlidingWindow(nums, k);
        
        System.out.println("Input: "+ Arrays.toString(nums));
        System.out.println("Window Max: "+ Arrays.toString(result));
    }
}