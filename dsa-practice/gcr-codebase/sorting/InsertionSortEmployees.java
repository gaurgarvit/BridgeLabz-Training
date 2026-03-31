import java.util.Arrays;

public class InsertionSortEmployees {

    // sorting array using insertion sort
    public static void sortEmployeeIds(int[] ids) {
        int n= ids.length;
        for(int i=1;i<n;i++){
            int key= ids[i];
            int j= i - 1;

            // moving elements greater than key to one position ahead
            while(j>= 0 && ids[j]> key){
                ids[j + 1]= ids[j];
                j= j - 1;
            }

            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // taking employees IDs as array input
        int[] employeeIds= {105, 102, 108, 101, 109};
        System.out.println("Original IDs: "+ Arrays.toString(employeeIds));

        // method to sort the employees IDs
        sortEmployeeIds(employeeIds);
        System.out.println("Sorted IDs: " + Arrays.toString(employeeIds));
    }
}