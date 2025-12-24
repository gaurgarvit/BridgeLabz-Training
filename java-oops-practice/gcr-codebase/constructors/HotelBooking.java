class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // initializing with default constructor
    public HotelBooking() {
        this.guestName= "Unknown";
        this.roomType= "Standard";
        this.nights= 1;
    }

    // initializing with parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName= guestName;
        this.roomType= roomType;
        this.nights= nights;
    }

    // creating a copy using copy constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.guestName= otherBooking.guestName;
        this.roomType= otherBooking.roomType;
        this.nights= otherBooking.nights;
    }

    // displaying booking details
    public void displayBooking() {
        System.out.println("Guest: "+guestName +", Room: "+ roomType +", Nights: "+ nights);
    }

    public static void main(String[] args) {
        // creating object using default constructor
        HotelBooking booking1 = new HotelBooking();
        
        // creating object using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Alice Smith", "Deluxe", 3);
        
        // creating object using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);

        booking1.displayBooking();
        booking2.displayBooking();
        booking3.displayBooking();
    }
}