public class Employee {
    // sharing the company name among all employees
    static String companyName= "Innovate Solutions";
    static int totalEmployees= 0;
    
    // preventing modification of the employee ID after assignment
    final int id;
    // storing the employee's name
    String name;
    
    // storing the employee's designation
    String designation;

    // initializing name, id, and designation in the constructor
    Employee(String name, int id, String designation) {
        this.name= name;
        this.id= id;
        this.designation= designation;

        totalEmployees++;
    }

    // showing the total number of employees via a static method
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // printing individual employee details
    void printDetails() {
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Designation: "+ designation);
        System.out.println("Company: "+ companyName);
        System.out.println("---------------------------");
    }

    // executing the main application logic
    public static void main(String[] args) {
        // creating employee objects
        Employee emp1= new Employee("John Doe", 501, "Developer");
        Employee emp2= new Employee("Jane Smith", 502, "Manager");

        // checking if emp1 is an instance of the Employee class
        if(emp1 instanceof Employee){
            // printing details for employee 1
            emp1.printDetails();
        }

        // checking if emp2 is an instance of the Employee class
        if(emp2 instanceof Employee){
            emp2.printDetails();
        }

        Employee.displayTotalEmployees();
    }
}