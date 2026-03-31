class Chef extends Thread {
    private String dishName;
    private int preparationTimeInSeconds;

    public Chef(String name, String dishName, int preparationTimeInSeconds) {
        super(name); // setting thread name
        this.dishName= dishName;
        this.preparationTimeInSeconds = preparationTimeInSeconds;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dishName);
        
        try {
            long sleepInterval= (preparationTimeInSeconds* 1000)/ 4;
            
            for(int i=1;i<=4;i++){
                // simulating cooking time
                Thread.sleep(sleepInterval);
                System.out.println(getName()+ " preparing "+ dishName+ ": "+ (i * 25)+ "% complete");
            }
            
        } 
        catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
        
        System.out.println(getName()+ " finished "+ dishName);
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef c1 = new Chef("Chef-1", "Pizza", 3);
        Chef c2 = new Chef("Chef-2", "Pasta", 2);
        Chef c3 = new Chef("Chef-3", "Salad", 1);
        Chef c4 = new Chef("Chef-4", "Burger", 2); // 2.5 cast to int or approximated

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Kitchen closed - All orders completed");
    }
}