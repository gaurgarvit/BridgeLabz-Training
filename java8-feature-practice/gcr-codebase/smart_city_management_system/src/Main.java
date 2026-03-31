import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<TransportService> services = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();

        // === Transport Services (as per your routes) ===
        services.add(new BusService("New Delhi-Mumbai", 500, "08:00"));
        services.add(new MetroService("Mumbai-Banglore", 1000, "10:00"));
        services.add(new TaxiService("Agra-Noida", 200, "13:00"));
        services.add(new AmbulanceService());

        // === Passenger Data ===
        passengers.add(new Passenger("New Delhi-Mumbai", 500, true));
        passengers.add(new Passenger("Mumbai-Banglore", 1000, false));
        passengers.add(new Passenger("Agra-Noida", 200, true));

        int choice;

        do {
            System.out.println("\n====== Smart City Transport & Service Management System ======");
            System.out.println("1. View All Transport Services");
            System.out.println("2. Filter & Sort Services (Fare <= 600)");
            System.out.println("3. Calculate Fare Using Distance");
            System.out.println("4. View Revenue Report");
            System.out.println("5. View Emergency Services");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Live Transport Dashboard ---");
                    services.forEach(TransportService::printServiceDetails);
                    break;

                case 2:
                    System.out.println("\n--- Filtered & Sorted Services ---");
                    services.stream()
                            .filter(s -> s.getFare() <= 600)
                            .sorted(Comparator.comparing(TransportService::getDepartureTime))
                            .forEach(TransportService::printServiceDetails);
                    break;

                case 3:
                    System.out.print("Enter distance (km): ");
                    double distance = sc.nextDouble();

                    FareCalculator calculator = d -> d * 10;
                    System.out.println("Calculated Fare: " + calculator.calculateFare(distance));
                    break;

                case 4:
                    System.out.println("\n--- Revenue Report ---");

                    Map<String, List<Passenger>> groupedByRoute =
                            passengers.stream().collect(Collectors.groupingBy(Passenger::getRoute));

                    groupedByRoute.forEach((route, list) ->
                            System.out.println(route + " -> Passengers: " + list.size())
                    );

                    DoubleSummaryStatistics stats =
                            passengers.stream().collect(Collectors.summarizingDouble(Passenger::getFare));

                    System.out.println("Total Revenue: " + stats.getSum());
                    System.out.println("Average Fare: " + stats.getAverage());
                    break;

                case 5:
                    System.out.println("\n--- Emergency Services ---");
                    services.stream()
                            .filter(s -> s instanceof EmergencyService)
                            .forEach(s ->
                                    System.out.println(s.getServiceName() + " has traffic priority"));
                    break;

                case 0:
                    System.out.println("Exiting system... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);
    }

}
