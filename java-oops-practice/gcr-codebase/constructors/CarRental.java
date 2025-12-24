class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // initializing rental details using constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName= customerName;
        this.carModel= carModel;
        this.rentalDays= rentalDays;
        this.dailyRate= dailyRate;
    }

    // calculating total rental cost
    public double calculateTotalCost() {
        // multiplying days by rate
        return rentalDays* dailyRate;
    }

    // displaying final rental information
    public void showRentalInfo() {
        // calculating the cost variable
        double total= calculateTotalCost();
        System.out.println("Customer: "+ customerName);
        System.out.println("Car Model: "+ carModel);
        System.out.println("Total Cost: $"+ total);
    }

    public static void main(String[] args) {
        CarRental rental= new CarRental("John Doe", "Toyota Camry", 5, 45.0);

        // showing the rental details
        rental.showRentalInfo();
    }
}