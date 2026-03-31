import java.util.Random;

class FileDownloaderThread extends Thread {
    private String fileName;

    public FileDownloaderThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        downloadFile(this.getName(), fileName);
    }

    // simulating the download process
    private void downloadFile(String threadName, String file) {
        Random rand= new Random();

        // increment by 10% for simulation
        for(int i=0;i<=100;i+=10){ 
            System.out.println("["+ threadName+ "] Downloading "+ file+ ": "+ i+ "%");


            try {
                // sleeping for random time to simulate network delay
                Thread.sleep(rand.nextInt(500)+ 200);
            }
            catch(InterruptedException e){
                System.out.println(threadName+ " interrupted");
            }
        }
        System.out.println("[" + threadName + "] Finished " + file);
    }
}


class FileDownloaderRunnable implements Runnable {
    private String fileName;

    public FileDownloaderRunnable(String fileName) {
        this.fileName= fileName;
    }

    @Override
    public void run() {
        downloadFile(Thread.currentThread().getName(), fileName);
    }

    private void downloadFile(String threadName, String file) {
        Random random = new Random();
        
        // increment by 25% for simulation
        for(int i=0;i<=100;i+=25){ 
            System.out.println("[" + threadName + "] Downloading " + file + ": " + i + "%");
            
            try {
                // adding random delay
                Thread.sleep(random.nextInt(500) + 200);
            } 
            catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }

        System.out.println("["+ threadName+ "] Finished "+ file);
    }
}

public class DownloadManager {
    public static void main(String[] args) {
        System.out.println("Starting Download Manager...");

        // mixing approaches to demonstrate both requirements
        Thread t1= new FileDownloaderThread("Document.pdf");
        Thread t2= new Thread(new FileDownloaderRunnable("Image.jpg"));
        Thread t3= new Thread(new FileDownloaderRunnable("Video.mp4"));

        // task 4: setting thread names
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All downloads complete!");
    }
}