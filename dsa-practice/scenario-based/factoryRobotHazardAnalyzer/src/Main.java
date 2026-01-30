import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // reading arm precision input
            System.out.println("Enter Arm Precision (0.0 - 1.0):");
            double armPrecision = sc.nextDouble();

            // reading worker density input
            System.out.println("Enter Worker Density (1 - 20):");
            int workerDensity = sc.nextInt();
            sc.nextLine();

            // reading machinery state input
            System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
            String machineryState = sc.nextLine();

            RobotHazardAuditor auditor = new RobotHazardAuditor();

            // invoking hazard risk calculation
            double risk = auditor.CalculateHazardRisk(armPrecision, workerDensity, machineryState);

            // printing final hazard risk score
            System.out.println("Robot Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {
            // displaying exception message
            System.out.println(e.getMessage());
        }
    }
}
