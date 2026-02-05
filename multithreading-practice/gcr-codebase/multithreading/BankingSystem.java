class BankAccount {
    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    // withdrawing money (intentionally not synchronized to show race condition potential)
    public void withdraw(int amount) {
        if(balance>= amount) {

            // simulating processing time
            try{
                Thread.sleep(100); 
            } 
            catch(InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println("Transaction successful: " + Thread.currentThread().getName() + 
                               ", Amount: "+ amount + ", Balance: " + balance);
        } 
        else{
            System.out.println("Transaction failed: " + Thread.currentThread().getName() + 
                               " (Insufficient funds)");
        }
    }
}

class Transaction implements Runnable {
    private BankAccount account;
    private int amount;

    public Transaction(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        // displaying thread state
        System.out.println("[" + Thread.currentThread().getName() + "] Attempting to withdraw " + amount);
        account.withdraw(amount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        Thread t1 = new Thread(new Transaction(account, 3000), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, 4000), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, 2000), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, 5000), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, 1500), "Customer-5");

        System.out.println("Starting transactions with Initial Balance: " + account.getBalance());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}