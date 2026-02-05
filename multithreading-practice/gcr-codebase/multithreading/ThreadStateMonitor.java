import java.text.SimpleDateFormat;
import java.util.Date;

class TaskRunner implements Runnable {
    @Override
    public void run() {
        try {
            for(int i=0;i<1000000;i++){
                Math.sin(i);
            }
            
            // sleeping for 2 seconds (TIMED_WAITING)
            Thread.sleep(2000);
            
        } 
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        // completing execution (TERMINATED)
    }
}

class StateMonitor extends Thread {
    private Thread target1;
    private Thread target2;

    public StateMonitor(Thread t1, Thread t2) {
        this.target1 = t1;
        this.target2 = t2;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        
        // checking states until both are terminated
        while (target1.getState()!= Thread.State.TERMINATED || target2.getState()!= Thread.State.TERMINATED) {
            
            // displaying thread name, state, and timestamp
            System.out.println("[Monitor] "+ target1.getName() + " is in "+ 
                               target1.getState()+ " state at "+ sdf.format(new Date()));
            System.out.println("[Monitor] " + target2.getName() + " is in " + 
                               target2.getState()+ " state at "+ sdf.format(new Date()));
            
            try {
                // checking every 500ms
                Thread.sleep(500);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // printing final state
        System.out.println("[Monitor] " + target1.getName()+ " is in " +target1.getState() + " state at "+ sdf.format(new Date()));
        System.out.println("Summary: Monitoring ended.");
    }
}

public class ThreadStateMonitor {
    public static void main(String[] args) throws InterruptedException {
        Thread task1= new Thread(new TaskRunner(), "Task-1");
        Thread task2= new Thread(new TaskRunner(), "Task-2");

        // printing initial state (NEW)
        System.out.println("Initial State Task-1: "+ task1.getState());

        StateMonitor monitor= new StateMonitor(task1, task2);
        monitor.start();

        // starting tasks
        task1.start();
        task2.start();
        
        monitor.join();
    }
}