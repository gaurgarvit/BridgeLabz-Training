import java.util.*;

class Book {
    private String title;      // mandatory
    private String isbn;       // mandatory
    private List<String> authors;
    private String edition;
    private String genre;

    // privatizing the constructor to force use of builder
    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.isbn = builder.isbn;
        this.authors = builder.authors;
        this.edition = builder.edition;
        this.genre = builder.genre;
    }

    public String getTitle() { return title; }

    @Override
    public String toString() {
        return "Book: " + title + " [" + genre + "]";
    }

    public static class BookBuilder {
        private String title;
        private String isbn;
        private List<String> authors = new ArrayList<>();
        private String edition;
        private String genre;

        public BookBuilder(String title, String isbn) {
            this.title = title;
            this.isbn = isbn;
        }

        // adding authors one by one
        public BookBuilder addAuthor(String author) {
            this.authors.add(author);
            return this;
        }

        // setting the book edition
        public BookBuilder setEdition(String edition) {
            this.edition = edition;
            return this;
        }

        // specifying the book genre
        public BookBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        // returning the final book object
        public Book build() {
            return new Book(this);
        }
    }
}