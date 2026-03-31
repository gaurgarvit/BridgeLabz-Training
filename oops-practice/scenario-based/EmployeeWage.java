public class EmployeeWage {
    // defining constants for the wage calculation
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20; 
    public static final int NUM_OF_WORKING_DAYS = 20; 
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        // creating an object of EmployeeWageWage class
        EmployeeWage wage= new EmployeeWage();
        
        // method to calculate the wage
        wage.calculatingWage();
    }

    // method for computing the wage
    public void calculatingWage() {
        // initializing employee hours and working days
        int empHrs= 0;
        int totalEmpHrs= 0;
        int totalWorkingDays= 0;

        // displaying welcome message
        System.out.println("----Welcome to Employee Wage Computation Program-----");

        // calculating wages until total hours or total days condition is reached
        while(totalEmpHrs< MAX_HRS_IN_MONTH && totalWorkingDays< NUM_OF_WORKING_DAYS){
            totalWorkingDays++;
            
            // checking if employee is present using random number
            int empCheck= (int) Math.floor(Math.random() * 10) % 3;

            // using switch case to handle employee type
            switch(empCheck){
                case IS_PART_TIME:
                    // assuming part time hour is 8
                    empHrs = 8; 
                    break;
                case IS_FULL_TIME:
                    // assuming full day hour is 8
                    empHrs = 8; 
                    break;
                default:
                    // employee is absent
                    empHrs = 0; 
            }

            // accumulating the employee hours
            totalEmpHrs+= empHrs;
            System.out.println("Day: "+ totalWorkingDays+ " Emp Hr: "+ empHrs);
        }

        // calculating total wage for the month
        int totalEmpWage= totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: "+ totalEmpWage);
    }
}