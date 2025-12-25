class Book {
    String title;
    String author;
    double price;
    boolean availability;

    // initializing book details via constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // defaulting to available
    }

    // borrowing the book if available
    public void borrowBook() {

        // checking availability status
        if(availability){
            availability = false;
            System.out.println("You have successfully borrowed '"+ title+"'.");
        } 
        else{
            System.out.println("Sorry, '"+ title +"' is currently unavailable");
        }
    }

    public static void main(String[] args) {
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);

        myBook.borrowBook();
        myBook.borrowBook();
    }
}