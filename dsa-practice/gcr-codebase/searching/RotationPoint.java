public class RotationPoint {
    public static void main(String[] args) {
        // taking array
        int[] rotatedArray= {4,5,6,7,0,1,2};
        
        // method to find minimum element in a rotated array
        int minElement= findMin(rotatedArray);
        System.out.println("The rotation point (smallest element) is: "+ minElement);
    }

    public static int findMin(int[] arr) {
        // defining left and right index
        int left= 0;
        int right= arr.length - 1;

        // binary search logic
        while(left< right){
            int mid= (left + right)/ 2;

            if(arr[mid]> arr[right]){
                left= mid + 1;
            } 
            else{
                right= mid;
            }
        }

        // returning rotation point
        return arr[left];
    }
}