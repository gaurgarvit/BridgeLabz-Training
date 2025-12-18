public class pensDistribute {
    public static void main(String[] args) {
        // total pens and total students
        int totalPens= 14;
        int totalStudents= 3;

        // formula to find pens per student
        int pensPerStudent= totalPens/totalStudents;

        // formula to find the remaining pens out of total pens
        int remainingPens= totalPens % totalStudents;

        System.out.println("Pens Per Student: " + pensPerStudent + 
                            "\n Remaining Students: " + remainingPens);
    }
}