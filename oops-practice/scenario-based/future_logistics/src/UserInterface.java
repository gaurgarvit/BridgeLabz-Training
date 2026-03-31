import java.util.Scanner;

// providing main class to run application
public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // reading input from user
        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        Utility utility = new Utility();

        // parsing input and getting transport object
        GoodsTransport transport = utility.parseDetails(input);

        if (transport == null) {
            return;
        }

        // identifying transport type
        String type = utility.findObjectType(transport);

        System.out.println("Transporter id : " + transport.getTransportId());
        System.out.println("Date of transport : " + transport.getTransportDate());
        System.out.println("Rating of the transport : " + transport.getTransportRating());

        // handling brick transport output
        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) transport;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
            System.out.println("Vehicle for transport : " + bt.vehicleSelection());
            System.out.println("Total charge : " + bt.calculateTotalCharge());
        }

        // handling timber transport output
        if (type.equals("TimberTransport")) {
            TimberTransport tt = (TimberTransport) transport;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
            System.out.println("Vehicle for transport : " + tt.vehicleSelection());
            System.out.println("Total charge : " + tt.calculateTotalCharge());
        }
    }
}
