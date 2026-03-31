import java.util.Arrays;
import java.util.Random;

public class sortingComparison {

    public static void main(String[] args) {
        // setting size to 20,000. 
        int size= 20000; 
        
        int[] dataOriginal= new int[size];
        Random rand= new Random();
        
        // populating the array
        for(int i=0;i<size;i++) {
            dataOriginal[i]= rand.nextInt(100000);
        }

        // creating copies so each algorithm sorts the exact same unsorted data
        int[] arrBubble= Arrays.copyOf(dataOriginal, size);
        int[] arrMerge= Arrays.copyOf(dataOriginal, size);
        int[] arrQuick= Arrays.copyOf(dataOriginal, size);

        System.out.println("Dataset Size: "+ size);
        System.out.println("------------------------------------------------");

        // --- bubble sort execution ---
        long start= System.currentTimeMillis();
        bubbleSort(arrBubble);
        long end= System.currentTimeMillis();
        System.out.println("Bubble Sort Time: "+ (end - start)+ " ms");

        // --- merge sort execution ---
        start= System.currentTimeMillis();
        mergeSort(arrMerge, 0, arrMerge.length - 1);
        end= System.currentTimeMillis();
        System.out.println("Merge Sort Time:  "+ (end - start)+ " ms");

        // --- quick sort execution ---
        start= System.currentTimeMillis();
        quickSort(arrQuick, 0, arrQuick.length - 1);
        end= System.currentTimeMillis();
        System.out.println("Quick Sort Time:  "+ (end - start)+ " ms");
    }

    // bubble sort implementation
    public static void bubbleSort(int[] arr) {
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j]> arr[j+1]){
                    // swap temp and arr[i]
                    int temp= arr[j];
                    arr[j]= arr[j + 1];
                    arr[j + 1]= temp;
                }
            }
        }
    }

    // merge sort implementation
    public static void mergeSort(int[] arr, int left, int right) {
        if(left< right) {
            int mid= (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1= mid - left + 1;
        int n2= right - mid;
        int[] L= new int[n1];
        int[] R= new int[n2];

        for(int i=0;i<n1;++i){
            L[i]= arr[left + i];
        } 
        for(int j=0;j<n2;++j){
            R[j]= arr[mid + 1 + j];
        }

        int i= 0;
        int j= 0;
        int k= left;

        while(i< n1 && j< n2) {
            if(L[i]<= R[j]){
                arr[k]= L[i];
                i++;
            } 
            else{
                arr[k]= R[j];
                j++;
            }

            k++;
        }
        while(i< n1){
            arr[k++]= L[i++];
        }
        while(j< n2){
            arr[k++]= R[j++];
        } 
    }

    // quick sort implementation
    public static void quickSort(int[] arr, int low, int high) {
        if(low< high){
            int pi= partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot= arr[high];
        int i= (low - 1);
        for(int j=low;j<high;j++){
            if(arr[j]< pivot){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }

        int temp= arr[i + 1];
        arr[i + 1]= arr[high];
        arr[high]= temp;
        return i + 1;
    }
}