
public class EmployeeDetails {
    String name;
    int id;
    double salary;
 
    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name  : "+ name);
        System.out.println("ID    : "+ id);
        System.out.println("Salary: Rs " + salary);
    }

    public static void main(String[] args) {

        // creating an Employee object
        EmployeeDetails emp = new EmployeeDetails("Garvit Gaur", 101, 50000.0);
        emp.displayDetails();
    }
}
