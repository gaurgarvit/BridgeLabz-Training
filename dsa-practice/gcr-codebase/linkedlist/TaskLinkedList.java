// details of a task
class Node {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Node next;

    public Node(int id, String name, int prio, String date) {
        this.taskId= id;
        this.taskName= name;
        this.priority= prio;
        this.dueDate= date;
    }
}

public class TaskLinkedList {
    Node head= null;
    Node tail= null; 
    Node current= null;

    // adding a task at the end
    public void addTask(int id, String name, int prio, String date) {
        Node newNode= new Node(id, name, prio, date);

        // checking if list is empty
        if (head== null) {
            head= newNode;
            tail= newNode;
            newNode.next= head;
            current= head;
        } 
        else{
            tail.next= newNode;
            tail= newNode;
            tail.next= head; // maintaining circularity
        }
    }

    // removing a task by ID
    public void removeTask(int id) {
        // checking if list is empty
        if(head== null){
            return;
        } 

        Node temp= head;
        Node prev= tail;

        // traversing to find the node
        do{
            if(temp.taskId == id){
                // handling single node case
                if(head== tail){
                    head= null;
                    tail= null;
                    current= null;
                } 
                else{
                    // updating head if needed
                    if(temp== head){
                        head= head.next;
                    }

                    // updating tail if needed
                    if (temp== tail){
                        tail= prev;
                    } 
                    
                    prev.next= temp.next;

                    // resetting current pointer if needed
                    if(current== temp){
                        current= prev.next;
                    } 
                }

                // confirming removal
                System.out.println("Task removed: "+ id);
                return;
            }

            prev= temp;
            temp= temp.next;
        } 
        while(temp!= head);
        
        System.out.println("Task not found");
    }

    // viewing current task and moving to next
    public void viewAndMove() {
        // checking for empty list
        if (current == null) {
            System.out.println("No tasks scheduled");
            return;
        }
        // displaying current task
        System.out.println("Current Task: "+ current.taskName);

        // moving pointer forward
        current = current.next;
    }

    // displaying all tasks
    public void displayAll() {
        // checking empty condition
        if(head== null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp= head;
        System.out.println("All Tasks: ");

        // traversing circular list
        do{
            System.out.println("ID: "+ temp.taskId+ " | "+ temp.taskName);
            temp= temp.next;
        } 
        while (temp!= head);
    }

    public static void main(String[] args) {
        TaskLinkedList list= new TaskLinkedList();

        // scheduling tasks
        list.addTask(1, "Fix Bug", 1, "2023-10-20");
        list.addTask(2, "Unit Tests", 2, "2023-10-21");
        list.viewAndMove(); 
        list.viewAndMove(); 
    }
}