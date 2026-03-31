import java.util.ArrayList;
import java.util.List;

// defining the patient class
class Patient {
    private String name;
    private String ailment;

    // initializing patient details
    public Patient(String name, String ailment) {
        this.name= name;
        this.ailment= ailment;
    }

    // returning the patient's name
    public String getName() {
        return name;
    }

    // returning the ailment description
    public String getAilment() {
        return ailment;
    }
}

// defining the doctor class
class Doctor {
    private String name;
    private String specialization;

    // initializing doctor details
    public Doctor(String name, String specialization) {
        this.name= name;
        this.specialization= specialization;
    }

    // consulting a patient (demonstrating communication)
    public void consult(Patient patient) {
        System.out.println("Dr. "+ this.name+" ("+ specialization+ ") is consulting patient "+ patient.getName()+" for "+ patient.getAilment()+ ".");
    }
}

// defining the hospital class containing doctors and patients
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // initializing the hospital resources
    public Hospital(String name) {
        this.hospitalName= name;
        this.doctors= new ArrayList<>();
        this.patients= new ArrayList<>();
    }

    // adding a doctor to the hospital
    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    // adding a patient to the hospital
    public void addPatient(Patient p) {
        patients.add(p);
    }
}


public class HospitalSystem {
    public static void main(String[] args) {
        // creating hospital, doctor, and patient objects
        Hospital cityHospital = new Hospital("City Care");
        Doctor doc1= new Doctor("Strange", "Neurology");
        Patient pat1= new Patient("Tony", "Chest Pain");
        Patient pat2= new Patient("Steve", "Fatigue");

        // adding entities to the hospital
        cityHospital.addDoctor(doc1);
        cityHospital.addPatient(pat1);
        cityHospital.addPatient(pat2);

        doc1.consult(pat1);
        doc1.consult(pat2);
    }
}