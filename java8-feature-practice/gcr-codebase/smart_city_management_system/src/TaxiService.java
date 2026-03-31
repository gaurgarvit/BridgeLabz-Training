public class TaxiService implements TransportService{
    private String route;
    private double fare;
    private String time;

    public TaxiService(String route, double fare, String time){
        this.route= route;
        this.fare= fare;
        this.time= time;
    }

    @Override
    public String getServiceName() {
        return "Taxi";
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
