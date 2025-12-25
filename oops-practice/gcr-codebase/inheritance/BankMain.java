// defining the base BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    // initializing common bank attributes
    BankAccount(String accountNumber, double balance) {
        this.accountNumber= accountNumber;
        this.balance= balance;
    }

    // displaying generic account type
    void displayAccountType() {
        System.out.println("Type: General Bank Account");
    }
}

// creating SavingsAccount subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNum, double balance, double interestRate) {
        super(accNum, balance);
        this.interestRate= interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Type: Savings Account (Interest: "+ interestRate+ "%)");
    }
}

// creating CheckingAccount subclass
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accNum, double balance, double limit) {
        super(accNum, balance);
        this.withdrawalLimit = limit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Type: Checking Account (Limit: $" + withdrawalLimit + ")");
    }
}

// creating FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {
    int lockInPeriodMonths;

    FixedDepositAccount(String accNum, double balance, int months) {
        super(accNum, balance);
        this.lockInPeriodMonths= months;
    }

    @Override
    void displayAccountType() {
        System.out.println("Type: Fixed Deposit (Lock-in: "+ lockInPeriodMonths+ " months)");
    }
}

public class BankMain {
    public static void main(String[] args) {
        // creating different account objects
        SavingsAccount sa= new SavingsAccount("SA-101", 5000, 3.5);
        CheckingAccount ca= new CheckingAccount("CA-202", 2000, 1000);
        FixedDepositAccount fd= new FixedDepositAccount("FD-303", 10000, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fd.displayAccountType();
    }
}