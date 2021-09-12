public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        //Create a constructor method that sets the head to null of your SinglyLinkedList objects
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    //Create a remove() method that will remove a node from the end of your list
    public void remove(){
        
    }
}
