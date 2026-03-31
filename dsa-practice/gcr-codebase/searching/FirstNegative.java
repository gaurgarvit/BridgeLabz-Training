public class FirstNegative {
    public static void main(String[] args) {
        // taking numbers as array input
        int[] numbers= {10, 5, 20, -4, 8, -2};
        int index= findNegativeIndex(numbers);
        
        if(index!= -1){
            System.out.println("First negative number found at index: "+ index);
        } 
        else{
            System.out.println("No negative number found");
        }
    }

    public static int findNegativeIndex(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]< 0) {
                return i;
            }
        }

        return -1;
    }
}