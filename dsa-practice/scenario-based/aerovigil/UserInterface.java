import java.util.Scanner;

// defining custom exception for invalid flight details
class InvalidFlightException extends Exception {

    // initializing exception message
    public InvalidFlightException(String message) {
        super(message);
    }
}

// defining utility class for flight validations and calculations
class FlightUtil {

    // validating flight number format
    public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {

        // checking pattern FL-XXXX where XXXX is between 1000 and 9999
        if (!flightNumber.matches("FL-[1-9][0-9]{3}")) {
            throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
        }
        return true;
    }

    // validating flight name against allowed airlines
    public boolean validateFlightName(String flightName) throws InvalidFlightException {

        // checking if flight name is valid
        if (!(flightName.equalsIgnoreCase("SpiceJet")
                || flightName.equalsIgnoreCase("Vistara")
                || flightName.equalsIgnoreCase("IndiGo")
                || flightName.equalsIgnoreCase("Air Arabia"))) {

            throw new InvalidFlightException("The flight name " + flightName + " is invalid");
        }
        return true;
    }

    // validating passenger count based on flight capacity
    public boolean validatePassengerCount(int passengerCount, String flightName)
            throws InvalidFlightException {
                
        int maxCapacity = 0;

        // assigning capacity based on flight name
        switch (flightName) {
            case "SpiceJet":
                maxCapacity = 396;
                break;
            case "Vistara":
                maxCapacity = 615;
                break;
            case "IndiGo":
                maxCapacity = 230;
                break;
            case "Air Arabia":
                maxCapacity = 130;
                break;
        }

        // checking passenger count validity
        if (passengerCount <= 0 || passengerCount > maxCapacity) {
            throw new InvalidFlightException(
                    "The passenger count " + passengerCount + " is invalid for " + flightName);
        }
        return true;
    }

    // calculating fuel required to fill the tank
    public double calculateFuelToFillTank(String flightName, double currentFuelLevel)
            throws InvalidFlightException {

        double tankCapacity = 0;

        // assigning tank capacity based on flight name
        switch (flightName) {
            case "SpiceJet":
                tankCapacity = 200000;
                break;
            case "Vistara":
                tankCapacity = 300000;
                break;
            case "IndiGo":
                tankCapacity = 250000;
                break;
            case "Air Arabia":
                tankCapacity = 150000;
                break;
        }

        // validating current fuel level
        if (currentFuelLevel < 0 || currentFuelLevel > tankCapacity) {
            throw new InvalidFlightException("Invalid fuel level for " + flightName);
        }

        // returning fuel needed to fill the tank
        return tankCapacity - currentFuelLevel;
    }
}

// handling user interaction and program execution
public class UserInterface {

    public static void main(String[] args) {

        // creating scanner for input
        Scanner sc = new Scanner(System.in);

        // creating utility object
        FlightUtil util = new FlightUtil();

        try {
            System.out.println("Enter flight details");
            String input = sc.nextLine();

            // splitting input by colon
            String[] data = input.split(":");

            // extracting input values
            String flightNumber = data[0];
            String flightName = data[1];
            int passengerCount = Integer.parseInt(data[2]);
            double currentFuelLevel = Double.parseDouble(data[3]);

            // validating flight number
            util.validateFlightNumber(flightNumber);

            // validating flight name
            util.validateFlightName(flightName);

            // validating passenger count
            util.validatePassengerCount(passengerCount, flightName);

            // calculating required fuel
            double fuelRequired = util.calculateFuelToFillTank(flightName, currentFuelLevel);

            System.out.println("Fuel required to fill the tank: " + fuelRequired + " liters");

        } 
        catch (InvalidFlightException e) {
            System.out.println(e.getMessage());

        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
