import java.util.Scanner;

class BankAccount {
    // declaring private variables to store account details
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // initializing account details using a constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder= accountHolder;
        this.accountNumber= accountNumber;
        this.balance= balance;
    }

    // depositing money into the account
    public void deposit(double amount) {
        balance+= amount;
        System.out.println("Deposited: Rs " + amount);
    }

    // withdrawing money from the account
    public void withdraw(double amount) {
        if(amount<= balance){
            balance-= amount;
            System.out.println("Withdrawn: Rs "+ amount);
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }

    // displaying the current account balance
    public void displayBalance() {
        System.out.println("Current Balance: Rs " + balance);
    }
}

public class BankDetails {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking account holder name as input
        System.out.print("Enter account holder name: ");
        String name= s.nextLine();

        // taking account number as input
        System.out.print("Enter account number: ");
        String accNo= s.nextLine();

        // taking initial balance as input
        System.out.print("Enter initial balance: ");
        double bal= s.nextDouble();

        // creating a BankAccount object using user input
        BankAccount account= new BankAccount(name, accNo, bal);

        account.deposit(1000);
        account.withdraw(500);
        account.displayBalance();
    }
}
