import java.util.Arrays;

public class CountingSortAges {

    // sorting logic
    public static void countingSort(int[] ages) {
        int n = ages.length;
        if (n== 0){
            return;
        }

        // finding the max age to determine range
        int max= ages[0];

        int min= 10; // knowing the range is 10-18 from problem

        for(int age: ages){
            if (age> max){
                max = age;
            } 
        }

        // initializing count array
        // size based on range (max - min + 1)
        int range= max - min + 1;
        int[] count= new int[range];
        int[] output= new int[n];

        // storing count of each character
        for(int i=0;i<n;i++){
            count[ages[i] - min]++;
        }

        // storing cumulative count
        for(int i=1;i<range;i++){
            count[i]+= count[i - 1];
        }

        // building the output array
        for(int i=n-1;i>=0;i--){
            output[count[ages[i] - min] - 1]= ages[i];
            count[ages[i] - min]--;
        }

        // copying sorted elements back
        System.arraycopy(output, 0, ages, 0, n);
    }

    public static void main(String[] args) {
        // taking ages as array input
        int[] ages = {14, 12, 18, 11, 14, 15, 12};
        System.out.println("Original Ages: "+ Arrays.toString(ages));

        // sorting using counting sort
        countingSort(ages);
        System.out.println("Sorted Ages: "+ Arrays.toString(ages));
    }
}