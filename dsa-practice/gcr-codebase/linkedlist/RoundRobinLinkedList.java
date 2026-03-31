// details for round robin
class Node {
    int pid;
    int burstTime;
    int remainingTime;
    Node next;

    public Node(int pid, int burstTime) {
        this.pid= pid;
        this.burstTime= burstTime;
        this.remainingTime= burstTime;
    }
}

public class RoundRobinLinkedList {
    Node head= null;
    Node tail= null;

    // adding process to queue
    public void addProcess(int pid, int burstTime) {
        Node newNode= new Node(pid, burstTime);

        // handling empty list
        if (head== null) {
            head = tail = newNode;
            tail.next= head;
        } 
        else{
            tail.next= newNode;
            tail= newNode;
            tail.next= head; // closing loop
        }
    }

    // deleting process after completion
    private void deleteProcess(int pid) {
        if (head== null){
            return;
        } 

        Node curr= head;
        Node prev= tail;
        
        // searching for process
        do {
            if (curr.pid== pid) {
                // checking if single node
                if (curr== head && curr== tail) {
                    head= null;
                    tail= null;
                } 
                else{
                    if (curr== head){
                        head= head.next;
                    } 
                    if (curr== tail){
                        tail= prev;
                    } 

                    prev.next= curr.next;
                }

                return;
            }

            prev= curr;
            curr= curr.next;
        } 
        while (curr != head);
    }

    // simulating round robin
    public void simulate(int timeQuantum) {
        // checking if processes exist

        if(head== null){
            System.out.println("No processes to schedule");
            return;
        }
        
        System.out.println("Starting Simulation (Quantum: "+ timeQuantum+ ")");
        Node curr= head;
        
        // looping while list is not empty
        while (head!= null){
            System.out.println("Executing P"+ curr.pid+ " (Remaining: "+ curr.remainingTime+ ")");
            
            // processing logic
            if (curr.remainingTime> timeQuantum) {
                curr.remainingTime-= timeQuantum;

                // moving to next process
                curr= curr.next;
            } 
            else{
                // finishing process
                System.out.println("Process P"+ curr.pid+ " Finished.");
                int finishedPid= curr.pid;

                // saving next node before deletion
                Node nextNode= curr.next;
                deleteProcess(finishedPid);

                // updating pointer
                curr= nextNode;
            }
            
            // breaking if list becomes empty
            if(head== null){
                break;
            } 
        }

        System.out.println("All processes completed");
    }

    public static void main(String[] args) {
        RoundRobinLinkedList list= new RoundRobinLinkedList();
        // loading processes

        list.addProcess(1, 10);
        list.addProcess(2, 5);
        list.addProcess(3, 8);

        // running simulation
        list.simulate(4);
    }
}