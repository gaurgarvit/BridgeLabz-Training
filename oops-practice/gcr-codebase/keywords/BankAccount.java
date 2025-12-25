public class BankAccount {
    // sharing the bank name across all accounts
    static String bankName = "Tech Bank";
    static int totalAccounts = 0;
    
    // ensuring the account number cannot be changed once assigned
    final int accountNumber;
    // storing the account holder's name
    String accountHolderName;

    // initializing the account details using the constructor
    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber= accountNumber;
        this.accountHolderName= accountHolderName;
        totalAccounts++;
    }

    // displaying the total number of accounts via a static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: "+ totalAccounts);
    }

    // displaying individual account details
    void displayDetails() {
        System.out.println("Bank: "+ bankName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Holder Name: "+ accountHolderName);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // creating bank account objects
        BankAccount acct1 = new BankAccount(101, "Alice");
        BankAccount acct2 = new BankAccount(102, "Bob");

        // checking if acc1 is an instance of BankAccount before displaying
        if (acct1 instanceof BankAccount) {
            acct1.displayDetails();
        }

        // checking if acc2 is an instance of BankAccount before displaying
        if (acct2 instanceof BankAccount) {
            acct2.displayDetails();
        }

        BankAccount.getTotalAccounts();
    }
}