// details of a movie
class Node {
    String title;
    String director;
    int year;
    double rating;
    Node next, prev;

    public Node(String title, String director, int year, double rating) {
        this.title= title;
        this.director= director;
        this.year= year;
        this.rating= rating;
        this.next= this.prev = null;
    }
}

public class MovieLinkedList {
    Node head= null;
    Node tail= null;

    // adding movie at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Node newNode= new Node(title, director, year, rating);

        // handling empty list
        if(head== null){
            head = tail = newNode;
        } 
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // adding movie at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        Node newNode= new Node(title, director, year, rating);

        // handling empty list
        if(tail== null){
            head = tail = newNode;
        }
        else{
            tail.next= newNode;
            newNode.prev= tail;
            tail= newNode;
        }
    }

    // removing movie by title
    public void removeByTitle(String title) {
        Node temp= head;

        // searching for the movie
        while(temp!= null){
            if (temp.title.equalsIgnoreCase(title)) {
                // adjusting head pointer
                if(temp== head){
                    head= temp.next;
                }

                // adjusting tail pointer
                if(temp== tail){
                    tail= temp.prev;
                } 

                // adjusting next node's prev pointer
                if (temp.next!= null){
                    temp.next.prev= temp.prev;
                } 

                // adjusting prev node's next pointer
                if (temp.prev!= null){
                    temp.prev.next= temp.next;
                }
                
                // confirming removal
                System.out.println("Movie removed: "+ title);
                return;
            }

            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // displaying forward
    public void displayForward() {
        Node temp= head;
        System.out.println("Movies (Forward):");

        // traversing from head to tail
        while (temp!= null) {
            System.out.println(temp.title+ " (" + temp.year + ") - "+ temp.rating);
            temp= temp.next;
        }
    }

    // displaying backward
    public void displayBackward() {
        Node temp= tail;
        System.out.println("Movies (Backward):");

        // traversing from tail to head
        while (temp!= null) {
            System.out.println(temp.title+ " (" + temp.year+ ") - "+ temp.rating);
            temp= temp.prev;
        }
    }

    // updating rating based on title
    public void updateRating(String title, double newRating) {
        Node temp= head;

        // finding the movie
        while(temp!= null){
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating= newRating;

                // logging the update
                System.out.println("Rating updated for " + title);
                return;
            }

            temp= temp.next;
        }
        System.out.println("Movie not found");
    }

    public static void main(String[] args) {
        MovieLinkedList list= new MovieLinkedList();

        // adding sample movies
        list.addAtEnd("Inception", "Nolan", 2010, 8.8);
        list.addAtBeginning("The Matrix", "Wachowskis", 1999, 8.7);
        list.displayForward();
    }
}