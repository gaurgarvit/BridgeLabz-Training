import java.util.Arrays;
import java.util.Random;

public class searchingComparison {

    public static void main(String[] args) {
        // defined dataset size (1 million elements as per prompt comparison)
        int size= 1000000;
        int[] dataset= new int[size];
        
        // filling dataset with random numbers
        Random rand= new Random();
        for(int i=0;i<size;i++){
            dataset[i]= rand.nextInt(size * 10);
        }

        // picking a target that definitely exists (last element) to test worst-case linear search
        int target= dataset[size - 1]; 

        System.out.println("Dataset Size: "+ size);
        System.out.println("------------------------------------------------");

        // --- linear search execution ---
        long startTime= System.nanoTime();
        int linearResult= linearSearch(dataset, target);
        long endTime= System.nanoTime();
        
        double linearDuration= (endTime - startTime) / 1_000_000.0; // converting to ms
        System.out.println("Linear Search Time: "+ linearDuration + " ms");

        // --- binary search execution ---

        // binary search requires sorted data
        Arrays.sort(dataset); 
        
        startTime= System.nanoTime();
        int binaryResult= binarySearch(dataset, target);
        endTime= System.nanoTime();
        
        double binaryDuration= (endTime - startTime) / 1_000_000.0; // converting to ms
        System.out.println("Binary Search Time: "+ binaryDuration+ " ms");
        
        System.out.println("------------------------------------------------");
        System.out.println("Observation: Binary Search is faster for large and sorted datasets");
    }

    // linear search logic: scan one by one
    public static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            if (arr[i]== target) {
                return i;
            }
        }
        return -1;
    }

    // binary search logic: divide and conquer
    public static int binarySearch(int[] arr, int target) {
        int left= 0;
        int right= arr.length - 1;
        
        while(left<= right){
            int mid= left + (right - left)/ 2;
            
            if(arr[mid]== target){
                return mid;
            }
            if(arr[mid]< target){
                left= mid + 1;
            }
            else{
                right= mid - 1;
            }
        }
        
        return -1;
    }
}