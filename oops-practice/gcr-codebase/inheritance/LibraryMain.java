// defining the superclass Book
class Book {
    String title;
    int publicationYear;

    // initializing book attributes
    Book(String title, int publicationYear) {
        this.title= title;
        this.publicationYear= publicationYear;
    }
}

// extending Book to create Author
class Author extends Book {
    String authorName;
    String bio;

    // initializing author and book details together
    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName= authorName;
        this.bio= bio;
    }

    // displaying the combined info
    void displayInfo() {
        System.out.println("Book: "+ title + " (" + publicationYear + ")");
        System.out.println("Author: "+ authorName);
        System.out.println("Bio: "+ bio);
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        // creating an author object
        Author a= new Author("The Hobbit", 1937, "J.R.R. Tolkien", "English writer and philologist.");

        a.displayInfo();
    }
}