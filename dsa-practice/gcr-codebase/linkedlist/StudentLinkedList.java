// details of a student
class Node {
    int rollNumber;
    String name;
    int age;
    char grade;
    Node next;

    public Node(int rollNumber, String name, int age, char grade) {
        this.rollNumber= rollNumber;
        this.name= name;
        this.age= age;
        this.grade= grade;
        this.next= null;
    }
}

public class StudentLinkedList {
    Node head= null;

    // adding a student at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, char grade) {
        Node newNode= new Node(rollNumber, name, age, grade);
        newNode.next= head;
        head = newNode;

        // confirming insertion
        System.out.println("Student added at beginning.");
    }

    // adding a student at the end
    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        Node newNode= new Node(rollNumber, name, age, grade);
        // checking if list is empty
        if (head== null) {
            head= newNode;
            return;
        }
        Node temp = head;

        // traversing to the last node
        while(temp.next!= null){
            temp= temp.next;
        }
        temp.next = newNode;

        // confirming insertion
        System.out.println("Student added at end");
    }

    // adding a student at a specific position
    public void addAtPosition(int pos, int rollNumber, String name, int age, char grade) {
        Node newNode= new Node(rollNumber, name, age, grade);
        // handling insertion at head
        if(pos== 1){
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Node temp = head;

        // traversing to the node before the position
        for(int i=1;i< pos-1 && temp!= null;i++) {
            temp= temp.next;
        }

        // checking if position is valid
        if (temp== null) {
            System.out.println("Position out of bounds");
        } 

        else{
            newNode.next = temp.next;
            temp.next = newNode;

            // confirming insertion
            System.out.println("Student added at position " + pos);
        }
    }

    // deleting a student by roll number
    public void deleteByRollNumber(int rollNumber) {
        // checking if list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        // handling deletion of head node
        if (head.rollNumber== rollNumber) {
            head= head.next;
            System.out.println("Student deleted.");
            return;
        }
        Node temp= head;

        // searching for the node to delete
        while(temp.next!= null && temp.next.rollNumber!= rollNumber) {
            temp= temp.next;
        }

        // checking if student was found
        if (temp.next== null) {
            System.out.println("Student not found");
        } 
        else{
            temp.next = temp.next.next;
            // confirming deletion
            System.out.println("Student deleted");
        }
    }

    // searching for a student by roll number
    public void searchByRollNumber(int rollNumber) {
        Node temp = head;
        // traversing the list
        while(temp!= null){
            if(temp.rollNumber== rollNumber){
                System.out.println("Found: "+ temp.name +", Grade: "+ temp.grade);
                return;
            }
            temp = temp.next;
        }

        // indicating not found
        System.out.println("Student not found.");
    }

    // displaying all records
    public void displayAll() {
        // checking if list is empty
        if (head== null) {
            System.out.println("No records to display.");
            return;
        }

        Node temp= head;
        System.out.println("Student Records: ");
        
        // iterating through nodes
        while(temp!= null){
            System.out.println("Roll: "+ temp.rollNumber+ ", Name: "+ temp.name+ ", Age: "+ temp.age+ ", Grade: "+ temp.grade);
            temp= temp.next;
        }
    }

    // updating grade by roll number
    public void updateGrade(int rollNumber, char newGrade) {
        Node temp= head;
        // searching for the student
        while (temp!= null){
            if (temp.rollNumber== rollNumber) {
                temp.grade= newGrade;

                // confirming update
                System.out.println("Grade updated");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // testing
        list.addAtEnd(101, "Alice", 20, 'A');
        list.addAtBeginning(102, "Bob", 21, 'B');
        list.displayAll();
    }
}