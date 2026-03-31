public class Utility {

    // validating transport id format
    public boolean validateTransportId(String transportId) {
        return transportId.matches("RTS[0-9]{3}[A-Z]");
    }

    // parsing input string and creating object
    public GoodsTransport parseDetails(String input) {

        // splitting input string
        String[] data = input.split(":");

        // extracting common values
        String transportId = data[0];
        String transportDate = data[1];
        int transportRating = Integer.parseInt(data[2]);
        String transportType = data[3];

        // validating transport id
        if (!validateTransportId(transportId)) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return null;
        }

        // creating brick transport object
        if (transportType.equalsIgnoreCase("BrickTransport")) {
            return new BrickTransport(
                    transportId,
                    transportDate,
                    transportRating,
                    Float.parseFloat(data[4]),
                    Integer.parseInt(data[5]),
                    Float.parseFloat(data[6])
            );
        }

        // creating timber transport object
        if (transportType.equalsIgnoreCase("TimberTransport")) {
            return new TimberTransport(
                    transportId,
                    transportDate,
                    transportRating,
                    Float.parseFloat(data[4]),
                    Float.parseFloat(data[5]),
                    data[6],
                    Float.parseFloat(data[7])
            );
        }

        return null;
    }

    // identifying object type
    public String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport) {
            return "TimberTransport";
        } else if (goodsTransport instanceof BrickTransport) {
            return "BrickTransport";
        }
        return "";
    }
}
