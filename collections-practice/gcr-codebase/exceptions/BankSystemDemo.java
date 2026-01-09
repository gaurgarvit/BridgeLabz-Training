// defining the custom exception for balance issues
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 1000; // initial balance

    // withdrawing money and checking for validity
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount< 0){
            // throwing unchecked exception for invalid arguments
            throw new IllegalArgumentException("Invalid amount!");
        }
        if(amount> balance){
            // throwing custom checked exception for insufficient funds
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance-= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankSystemDemo {
    public static void main(String[] args) {
        BankAccount account= new BankAccount();

        // testing a valid withdrawal
        try{
            account.withdraw(500);
        } 
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

        // testing withdrawal exceeding balance
        try{
            account.withdraw(6000);
        } 
        catch(InsufficientBalanceException e){
            System.out.println("Error: "+ e.getMessage());
        }

        // testing negative amount withdrawal
        try{
            account.withdraw(-100);
        } 
        catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }
        catch(InsufficientBalanceException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}