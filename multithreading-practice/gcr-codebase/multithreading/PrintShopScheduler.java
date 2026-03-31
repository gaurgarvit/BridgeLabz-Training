class PrintJob implements Runnable {
    private String jobName;
    private int pages;

    public PrintJob(String jobName, int pages) {
        this.jobName = jobName;
        this.pages = pages;
    }

    @Override
    public void run() {
        System.out.println("Starting "+ jobName+ " with Priority "+ Thread.currentThread().getPriority());
        
        for(int i=1;i<=pages;i++){
            // printing page details
            System.out.println("Printing "+ jobName+ " - Page "+ i + " of " + pages);

            try {
                // simulating printing time (100ms per page)
                Thread.sleep(100);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Completed "+ jobName);
    }
}

public class PrintShopScheduler {
    public static void main(String[] args) {
        System.out.println("Starting print jobs...");
        long startTime= System.currentTimeMillis();

        // creating 5 print jobs
        // creating threads
        Thread t1 = new Thread(new PrintJob("Job1", 10));
        Thread t2 = new Thread(new PrintJob("Job2", 5));
        Thread t3 = new Thread(new PrintJob("Job3", 15));
        Thread t4 = new Thread(new PrintJob("Job4", 8));
        Thread t5 = new Thread(new PrintJob("Job5", 12));

        // setting thread priorities based on job priority
        t1.setPriority(5); // Normal
        t2.setPriority(8); // High
        t3.setPriority(3); // Low
        t4.setPriority(6);
        t5.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        // displaying total time taken
        System.out.println("All jobs completed in "+(endTime - startTime)+ "ms");
    }
}