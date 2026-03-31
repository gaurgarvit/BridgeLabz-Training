import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReversingList {

    // method to reverse a list without using generics
    public static void reverseList(List list) {

        int start= 0; 
        int end= list.size() - 1;

        // swapping elements until both indices meet
        while(start< end){

            // storing the element at start index
            Object temp= list.get(start);

            // placing end element at start position
            list.set(start, list.get(end));

            // placing stored start element at end position
            list.set(end, temp);

            // moving towards the center
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        // creating and initializing an ArrayList
        ArrayList arrayList= new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: "+ arrayList);

        // reversing the ArrayList
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: "+ arrayList);

        // creating and initializing a LinkedList
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("\nOriginal LinkedList: "+ linkedList);

        // reversing the LinkedList
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: "+ linkedList);
    }
}
