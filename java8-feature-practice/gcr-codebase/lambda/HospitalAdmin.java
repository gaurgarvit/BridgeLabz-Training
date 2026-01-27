import java.util.Arrays;
import java.util.List;

public class HospitalAdmin {
    public static void main(String[] args) {
        
        // creating a list of patient IDs
        List<String> patientIds = Arrays.asList(
            "PAT-10024", 
            "P-100", 
            "P-101", 
            "P-102", 
            "P-103"
        );

        System.out.println("--- Hospital Admin Verification ---");
        System.out.println("Printing Patient ID List:");

        // printing using method reference to System.out
        patientIds.forEach(System.out::println);
        
        // separating visual output
        System.out.println("-----------------------------------");
        
        // demonstrating static method reference
        System.out.println("Verifying IDs format:");
        // checking using method reference to static method
        patientIds.forEach(HospitalAdmin::verifyFormat);
    }

    // defining a static helper method for verification
    public static void verifyFormat(String id) {
        if(id.startsWith("P-")) {
            System.out.println(id + " [OK]");
        } else {
            System.out.println(id + " [INVALID]");
        }
    }
}