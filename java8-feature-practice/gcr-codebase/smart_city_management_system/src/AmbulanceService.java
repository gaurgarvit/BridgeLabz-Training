public class AmbulanceService implements TransportService, EmergencyService{
    @Override
    public String getServiceName() {
        return "Ambulance";
    }

    @Override
    public String getRoute() {
        return "Emergency Route";
    }

    @Override
    public double getFare() {
        return 0;
    }

    @Override
    public String getDepartureTime() {
        return "Immediate";
    }
}
