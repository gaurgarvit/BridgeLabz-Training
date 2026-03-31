import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;
    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name; this.specialty = specialty; this.availableOnWeekend = availableOnWeekend;
    }
    public String toString() { return name + " - " + specialty; }
}

public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Jones", "Neurology", false),
            new Doctor("Dr. Adams", "Cardiology", true)
        );

        doctors.stream()
            .filter(d -> d.availableOnWeekend) // filtering weekend availability
            .sorted(Comparator.comparing(d -> d.specialty)) // sorting by specialty
            .forEach(System.out::println); // displaying results
    }
}