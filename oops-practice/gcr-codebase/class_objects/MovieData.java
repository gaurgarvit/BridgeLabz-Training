import java.util.*;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    // booking a ticket by assigning values to variables
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // displaying the booked ticket details
    public void displayTicket() {
        System.out.println("Ticket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

// creating a MovieData class containing the main method
public class MovieData {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking movie name as input
        System.out.print("Enter movie name: ");
        String movie= s.nextLine();

        // taking seat number as input
        System.out.print("Enter seat number: ");
        int seat= s.nextInt();

        // taking ticket price as input
        System.out.print("Enter ticket price: ");
        double price= s.nextDouble();

        // creating a MovieTicket object
        MovieTicket ticket= new MovieTicket();

        // booking the ticket using user input
        ticket.bookTicket(movie, seat, price);

        ticket.displayTicket();
    }
}
