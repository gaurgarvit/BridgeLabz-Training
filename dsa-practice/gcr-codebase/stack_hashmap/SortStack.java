import java.util.Stack;

public class SortStack {

    // sorting the stack recursively
    public static void sortStack(Stack<Integer> st) {
        if (!st.isEmpty()) {
            // removing the top element
            int temp= st.pop();

            // calling sort recursively for remaining stack
            sortStack(st);

            // inserting the element back in sorted order
            sortedInsert(st, temp);
        }
    }

    // inserting element at correct position
    public static void sortedInsert(Stack<Integer> st, int element) {
        // checking if stack is empty or element is greater than top
        if(st.isEmpty() || element> st.peek()){
            st.push(element);
        } 
        else{
            // removing top to find correct spot
            int temp= st.pop();
            sortedInsert(st, element);

            // putting back the top element
            st.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();

        // operations
        st.push(30);
        st.push(-5);
        st.push(18);
        st.push(14);
        st.push(-3);

        System.out.println("Original Stack: "+ st);
        sortStack(st);
        System.out.println("Sorted Stack: "+ st);
    }
}