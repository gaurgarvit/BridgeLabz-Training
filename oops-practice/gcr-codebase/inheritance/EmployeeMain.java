// defining the base class Employee
class Employee {
    String name;
    int id;
    double salary;

    // initializing base employee details
    Employee(String name, int id, double salary) {
        this.name= name;
        this.id= id;
        this.salary= salary;
    }

    // displaying common employee details
    void displayDetails() {
        System.out.println("ID: "+ id+", Name: "+ name+", Salary: $"+ salary);
    }
}

// extending Employee for Managers
class Manager extends Employee {
    int teamSize;

    // initializing manager specific attributes
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // overriding to show team size
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager, Team Size: " + teamSize);
    }
}

// extending Employee for Developers
class Developer extends Employee {
    String programmingLanguage;

    // initializing developer specific attributes
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage= programmingLanguage;
    }

    // overriding to show programming language
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Language: " + programmingLanguage);
    }
}

// extending Employee for Interns
class Intern extends Employee {
    String university;

    // initializing intern specific attributes
    Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university= university;
    }

    // overriding to show university
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern, University: "+ university);
    }
}

// running the employee system
public class EmployeeMain {
    public static void main(String[] args) {
        // creating different employee types
        Manager m= new Manager("Alice", 101, 80000, 5);
        Developer d= new Developer("Bob", 102, 60000, "Java");
        Intern i= new Intern("Charlie", 103, 20000, "MIT");

        m.displayDetails();
        System.out.println("---");
        d.displayDetails();
        System.out.println("---");
        i.displayDetails();
    }
}