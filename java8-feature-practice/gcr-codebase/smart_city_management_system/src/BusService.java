class BusService implements TransportService {

    private String route;
    private double fare;
    private String time;

    BusService(String route, double fare, String time) {
        this.route = route;
        this.fare = fare;
        this.time = time;
    }

    @Override
    public String getServiceName() {
        return "Bus";
    }

    @Override
    public String getRoute() {
        return route;
    }

    @Override
    public double getFare() {
        return fare;
    }

    @Override
    public String getDepartureTime() {
        return time;
    }
}
