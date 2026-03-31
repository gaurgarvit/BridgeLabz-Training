import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

    // calculating span values
    public static int[] calculateSpan(int[] prices) {
        int n= prices.length;
        int[] span= new int[n];
        Stack<Integer> st= new Stack<>();

        // calculating span for first day
        span[0]= 1;
        st.push(0);

        // iterating through remaining days
        for(int i=1;i<n;i++){
            // popping elements while price is smaller than current
            while (!st.isEmpty() && prices[st.peek()]<= prices[i]) {
                st.pop();
            }

            // calculating span based on stack state
            if (st.isEmpty()) {
                span[i]= i + 1;
            } 
            else{
                span[i]= i - st.peek();
            }

            // pushing current index
            st.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        // array of price of stocks
        int[] prices= {100, 80, 60, 70, 60, 75, 85};
        // to calculate span values and stoing them in array
        int[] spans= calculateSpan(prices);

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Spans: " + Arrays.toString(spans));
    }
}