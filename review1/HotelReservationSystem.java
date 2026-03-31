import java.util.*;

public class HotelReservationSystem {

    interface PricingStrategy {
        double calculate(double basePrice);
    }

    static class NormalSeasonPricing implements PricingStrategy {
        public double calculate(double basePrice) {
            return basePrice;
        }
    }

    static class RoomNotAvailableException extends Exception {
        RoomNotAvailableException(String msg) {
            super(msg);
        }
    }

    static abstract class Room {
        int roomNumber;
        double basePrice;
        boolean isAvailable = true;

        abstract double calculatePrice(PricingStrategy strategy);
    }

    static class StandardRoom extends Room {
        StandardRoom(int roomNumber) {
            this.roomNumber = roomNumber;
            this.basePrice = 2000;
        }

        double calculatePrice(PricingStrategy strategy) {
            return strategy.calculate(basePrice);
        }
    }

    static class DeluxeRoom extends Room {
        DeluxeRoom(int roomNumber) {
            this.roomNumber = roomNumber;
            this.basePrice = 4000;
        }

        double calculatePrice(PricingStrategy strategy) {
            return strategy.calculate(basePrice);
        }
    }

    static class Guest {
        String name;
        String contact;

        Guest(String name, String contact) {
            this.name = name;
            this.contact = contact;
        }
    }

    static class Reservation {
        String reservationId;
        Guest guest;
        Room room;
        int nights;
        boolean checkedIn;

        Reservation(String reservationId, Guest guest, Room room, int nights) {
            this.reservationId = reservationId;
            this.guest = guest;
            this.room = room;
            this.nights = nights;
        }
    }

    static void showMenu() {
        System.out.println("\n--- Hotel Reservation Menu ---");
        System.out.println("1. Create Reservation");
        System.out.println("2. View Reservation");
        System.out.println("3. Check In");
        System.out.println("4. Check Out");
        System.out.println("5. Delete Reservation");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Room> availableRooms = new HashSet<>();
        Map<String, Reservation> reservations = new HashMap<>();
        PricingStrategy pricing = new NormalSeasonPricing();

        // pre-added rooms for testing
        availableRooms.add(new StandardRoom(101));
        availableRooms.add(new DeluxeRoom(201));

        while (true) {

            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    try {
                        if (availableRooms.isEmpty())
                            throw new RoomNotAvailableException("No rooms available");

                        System.out.print("Enter reservation id: ");
                        String rid = sc.nextLine().trim();

                        System.out.print("Guest name: ");
                        String name = sc.nextLine();

                        System.out.print("Contact: ");
                        String contact = sc.nextLine();

                        System.out.print("Nights: ");
                        int nights = sc.nextInt();
                        sc.nextLine();

                        Room room = availableRooms.iterator().next();
                        availableRooms.remove(room);
                        room.isAvailable = false;

                        reservations.put(rid,
                                new Reservation(rid, new Guest(name, contact), room, nights));

                        System.out.println("Reservation created successfully");
                    } catch (RoomNotAvailableException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter reservation id: ");
                    String vid = sc.nextLine().trim();

                    Reservation view = reservations.get(vid);
                    if (view != null) {
                        System.out.println("Guest   : " + view.guest.name);
                        System.out.println("Room No : " + view.room.roomNumber);
                        System.out.println("Nights  : " + view.nights);
                        System.out.println("Status  : " +
                                (view.checkedIn ? "Checked In" : "Not Checked In"));
                    } else {
                        System.out.println("Reservation not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter reservation id: ");
                    String cid = sc.nextLine().trim();

                    Reservation checkIn = reservations.get(cid);
                    if (checkIn != null) {
                        checkIn.checkedIn = true;
                        System.out.println("Checked in successfully");
                    } else {
                        System.out.println("Reservation not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter reservation id: ");
                    String coid = sc.nextLine().trim();

                    Reservation checkout = reservations.get(coid);
                    if (checkout != null) {
                        double bill =
                                checkout.room.calculatePrice(pricing) * checkout.nights;

                        checkout.room.isAvailable = true;
                        availableRooms.add(checkout.room);
                        checkout.checkedIn = false;

                        System.out.println("Total Bill: Rs " + bill);
                    } else {
                        System.out.println("Reservation not found");
                    }
                    break;

                case 5:
                    System.out.print("Enter reservation id: ");
                    String did = sc.nextLine().trim();

                    Reservation del = reservations.remove(did);
                    if (del != null) {
                        del.room.isAvailable = true;
                        availableRooms.add(del.room);
                        System.out.println("Reservation deleted successfully");
                    } else {
                        System.out.println("Reservation not found");
                    }
                    break;

                case 6:
                    System.out.println("Exited successfully!!");
                    return;

                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }
}
