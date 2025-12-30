import java.util.Arrays;

public class QuickSortProducts {

    // partitioning the array
    public static int partition(double[] prices, int low, int high) {
        // pivot
        double pivot= prices[high];
        int i= (low - 1);

        for(int j=low;j<high;j++){
            // checking if current element is smaller than pivot
            if (prices[j]< pivot) {
                i++;

                // swapping elements
                double temp= prices[i];
                prices[i]= prices[j];
                prices[j]= temp;
            }
        }

        // swapping pivot to correct position
        double temp= prices[i + 1];
        prices[i + 1]= prices[high];
        prices[high]= temp;

        return i + 1;
    }

    // sorting recursively
    public static void quickSort(double[] prices, int low, int high) {
        if(low< high){
            // finding pivot
            int pi= partition(prices, low, high);

            // sorting left and right partitions
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        // taking the price of the products
        double[] prices = {299.99, 49.50, 99.99, 150.00, 10.99};
        System.out.println("Original Prices: " + Arrays.toString(prices));

        // sorting using quick sort
        quickSort(prices, 0, prices.length - 1);
        System.out.println("Sorted Prices: " + Arrays.toString(prices));
    }
}