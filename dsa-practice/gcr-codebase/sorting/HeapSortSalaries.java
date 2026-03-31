import java.util.Arrays;

public class HeapSortSalaries {

    // sorting function
    public static void sort(int[] salaries) {
        int n= salaries.length;

        // building max heap
        for(int i=n/2-1;i>=0;i--){
            heapify(salaries, n, i);
        }
            
        // extracting elements one by one
        for(int i=n-1;i>0;i--){

            // moving current root to end
            int temp= salaries[0];
            salaries[0]= salaries[i];
            salaries[i]= temp;

            // calling max heapify on reduced heap
            heapify(salaries, i, 0);
        }
    }

    // heapifying a subtree
    static void heapify(int[] arr, int n, int i) {
        int largest= i; 
        int left= 2 * i + 1; 
        int right= 2 * i + 2; 

        // checking if left child is larger than root
        if(left< n && arr[left]> arr[largest]){
            largest= left;
        }

        // checking if right child is larger
        if(right< n && arr[right]> arr[largest]){
            largest= right;
        }
            
        // swapping and continuing if root is not largest
        if(largest!= i){
            int swap= arr[i];
            arr[i]= arr[largest];
            arr[largest]= swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        // taking salaries as array input
        int[] salaries = {50000, 120000, 75000, 45000, 90000};
        System.out.println("Original Salaries: " + Arrays.toString(salaries));

        // sorting using heap sort
        sort(salaries);
        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
}