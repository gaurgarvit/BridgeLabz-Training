import java.util.ArrayList;

// defining the medical record interface
interface MedicalRecord {
    // adding a new record string
    void addRecord(String record);
    
    // viewing existing records
    void viewRecords();
}

// defining the abstract Patient class
abstract class Patient {
    // encapsulating patient details
    private String patientId;
    private String name;
    private int age;
    
    // protecting sensitive diagnosis data
    private ArrayList<String> diagnosisHistory= new ArrayList<>();

    Patient(String patientId, String name, int age) {
        this.patientId= patientId;
        this.name= name;
        this.age= age;
    }

    // adding to protected diagnosis list
    protected void addDiagnosis(String diagnosis) {
        diagnosisHistory.add(diagnosis);
    }

    // accessing diagnosis history
    protected void showDiagnosis() {
        System.out.println("Medical History: "+ diagnosisHistory);
    }

    // calculating the bill abstractly
    abstract double calculateBill();

    // getting basic details
    void getPatientDetails() {
        System.out.println("ID: "+ patientId + " | Name: "+ name+ " | Age: "+ age);
    }
}

// extending for InPatients
class InPatient extends Patient implements MedicalRecord {
    double dailyRoomCharge;
    int daysAdmitted;

    InPatient(String id, String name, int age, double dailyRoomCharge, int days) {
        super(id, name, age);
        this.dailyRoomCharge= dailyRoomCharge;
        this.daysAdmitted= days;
    }

    @Override
    double calculateBill() {
        return dailyRoomCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        // calling protected method from parent
        addDiagnosis(record);
    }

    @Override
    public void viewRecords() {
        showDiagnosis();
    }
}

// extending for OutPatients
class OutPatient extends Patient implements MedicalRecord {
    double consultationFee;

    OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee= consultationFee;
    }

    @Override
    double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addDiagnosis(record);
    }

    @Override
    public void viewRecords() {
        showDiagnosis();
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        // creating an InPatient
        InPatient p1= new InPatient("P001", "John Doe", 45, 200.0, 5);
        // adding medical records
        p1.addRecord("Admitted for surgery.");
        p1.addRecord("Recovering well.");

        // creating an OutPatient
        OutPatient p2= new OutPatient("P002", "Jane Smith", 30, 150.0);
        p2.addRecord("Flu consultation.");

        // displaying details for p1
        p1.getPatientDetails();
        p1.viewRecords();
        System.out.println("Total Bill: $"+ p1.calculateBill());
        System.out.println("-------------------");

        // displaying details for p2
        p2.getPatientDetails();
        p2.viewRecords();
        System.out.println("Total Bill: $" + p2.calculateBill());
    }
}