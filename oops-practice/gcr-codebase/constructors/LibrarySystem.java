class Book {
    public String isbn;
    protected String title;
    private String author;

    // initializing book attributes
    public Book(String isbn, String title, String author) {
        this.isbn= isbn;
        this.title= title;
        this.author= author;
    }

    // getting the private author name
    public String getAuthor() {
        return author;
    }

    // setting the private author name
    public void setAuthor(String author) {
        this.author= author;
    }
}

class EBook extends Book {
    // initializing ebook details
    public EBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    // accessing available members from subclass
    public void showBookDetails() {
        System.out.println("--- EBook Details ---");
        
        // accessing public isbn directly
        System.out.println("ISBN: " + isbn);

        // accessing protected title directly
        System.out.println("Title: " + title);

        // accessing private author via public getter
        System.out.println("Author: " + getAuthor());
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // creating an ebook instance
        EBook myEbook= new EBook("978-3-16-148410-0", "Effective Java", "Joshua Bloch");

        // modifying author using public setter
        myEbook.setAuthor("J. Bloch");

        myEbook.showBookDetails();
    }
}