public class Book {
    // sharing the library name across all books
    static String libraryName= "City Central Library";
    
    // ensuring the ISBN is unique and immutable
    final String isbn;
    
    // storing the book title snd book author
    String title;
    String author;

    // initializing title, author, and isbn using the constructor
    Book(String title, String author, String isbn) {
        this.title= title;
        this.author= author;
        this.isbn= isbn;
    }

    // printing the library name using a static method
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // displaying book details
    void showBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Book.displayLibraryName();

        // creating a new book object
        Book myBook= new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");

        // verifying if the object is an instance of Book
        if (myBook instanceof Book) {
            myBook.showBookInfo();
        }
    }
}