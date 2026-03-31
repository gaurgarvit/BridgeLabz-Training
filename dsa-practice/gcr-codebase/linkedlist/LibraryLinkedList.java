// details of a book
class Node {
    String title, author, genre, bookId;
    boolean isAvailable;
    Node next, prev;

    public Node(String title, String author, String genre, String bookId, boolean isAvailable) {
        this.title= title;
        this.author= author;
        this.genre= genre;
        this.bookId= bookId;
        this.isAvailable= isAvailable;
    }
}

public class LibraryLinkedList {
    Node head;
    Node tail;

    // adding book at the end
    public void addBook(String title, String author, String genre, String bookId, boolean status) {
        Node newNode= new Node(title, author, genre, bookId, status);

        // checking if empty
        if(head== null){
            head = tail = newNode;
        } 
        else{
            tail.next= newNode;
            newNode.prev= tail;
            tail= newNode;
        }
    }

    // searching for book by title
    public void searchByTitle(String title) {
        Node temp= head;

        // traversing list
        while(temp!= null){
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: "+ temp.title);
                return;
            }

            temp= temp.next;
        }
        System.out.println("Book not found");
    }

    // counting total books
    public void countBooks() {
        int count= 0;
        Node temp= head;

        // iterating to count
        while(temp!= null) {
            count++;
            temp= temp.next;
        }

        System.out.println("Total books: "+ count);
    }

    // displaying books reverse
    public void displayReverse() {
        Node temp= tail;
        System.out.println("Books (Z-A): ");

        // using prev pointer to go back
        while(temp!= null){
            System.out.println(temp.title);
            temp= temp.prev;
        }
    }

    public static void main(String[] args) {
        LibraryLinkedList list = new LibraryLinkedList();

        // populating library
        list.addBook("Great Gatsby", "Fitzgerald", "Classic", "B001", true);
        list.addBook("1984", "Orwell", "Dystopian", "B002", false);
        list.displayReverse();
    }
}