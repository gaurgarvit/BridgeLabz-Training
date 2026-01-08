import java.io.*;
import java.util.ArrayList;
import java.util.List;

// employee class must implement serializable
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id= id;
        this.name= name;
        this.department= department;
        this.salary= salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: $" + salary;
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        String filename= "employees.ser";
        List<Employee> employees= new ArrayList<>();

        // adding sample data
        employees.add(new Employee(101, "Alice Smith", "IT", 75000));
        employees.add(new Employee(102, "Bob Jones", "HR", 60000));
        employees.add(new Employee(103, "Charlie Day", "Finance", 82000));

        // serialization: saving object to file
        try (ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized to " + filename);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        // deserialization: retrieving object from file
        System.out.println("\nReading data back from file...");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            // casting the object back to arraylist
            List<Employee> retrievedList = (List<Employee>) ois.readObject();
            
            for (Employee emp : retrievedList) {
                System.out.println(emp);
            }
        }

        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}