import java.util.ArrayList;
import java.util.List;

// defining the customer class representing a bank client
class Customer {
    private String name;
    private double balance;
    private int accountNumber;

    // initializing customer details
    public Customer(String name, int accountNumber, double initialBalance) {
        this.name= name;
        this.accountNumber= accountNumber;
        this.balance= initialBalance;
    }

    // returning the customer name
    public String getName() {
        return name;
    }

    // viewing the current account balance
    public void viewBalance() {
        System.out.println("Customer: "+ name+ " | Account: "+ accountNumber+ " | Balance: $"+ balance);
    }
}

// defining the bank class which associates with customers
class Bank {
    private String bankName;
    private List<Customer> customers;

    // initializing the bank with a name and empty customer list
    public Bank(String bankName) {
        this.bankName= bankName;
        this.customers= new ArrayList<>();
    }

    // opening an account by creating a customer and adding to the list
    public void openAccount(String customerName, int accountNumber, double initialDeposit) {
        Customer newCustomer= new Customer(customerName, accountNumber, initialDeposit);
        customers.add(newCustomer);
        System.out.println("Success: Account opened for "+ customerName+" in "+ bankName);
    }

    // displaying all customers associated with the bank
    public void showAllCustomers() {
        System.out.println("\n--- Customer List for " + bankName + " ---");
        for(Customer c: customers){
            c.viewBalance();
        }
    }
}


public class BankSystem {
    public static void main(String[] args) {
        // creating the bank object
        Bank myBank= new Bank("Global Tech Bank");

        // opening accounts for different customers
        myBank.openAccount("Alice Smith", 101, 5000.0);
        myBank.openAccount("Bob Jones", 102, 3500.0);

        myBank.showAllCustomers();
    }
}