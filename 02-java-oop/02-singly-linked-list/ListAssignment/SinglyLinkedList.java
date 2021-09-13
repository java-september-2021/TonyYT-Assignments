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
            System.out.println("the head is: " + value);
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
            System.out.println("A value is added to the tail: " + value);
        }
    }    
    //Create a remove() method that will remove a node from the end of your list
    public void remove(){
        //edge case: no list
        if (this.head == null){
            System.out.println("the list is empty");
        } else {
            Node runner = this.head;
            while (runner.next.next !=null){
                runner = runner.next;
            }
            int endOfList = runner.next.value;
            runner.next = null;
            System.out.println("the end of the list: " + endOfList +" has been removed.");
        }
    }

    // Create printValues() method that will print all the values of each node in the list in order
    public void printValues(){
        //edge case: no list:
        if(this.head == null){
            System.out.println("the list is empty");
        } else {
            Node runner = this.head;
            int counter = 0;
            while (runner != null){
                if(counter ==0){
                    System.out.println("the head of the list is: " + head.value);
                    runner = runner.next;
                    counter += 1;
                } else {
                    System.out.println("the following value of the list is: " + runner.value);
                    runner = runner.next;
                    counter +=1;
                }
            } 

        }
    }

    //● Implement a find(int) method that will return the first node with the value in the parameter
    public void find(int findValue){
        //edge case: not list
        if (this.head == null){
            System.out.println("the list is empty, finding value is not exist");
            return;
        } else {
            //the value is existed in the list
            Node runner = this.head;
            int counter = 0;
            while (runner !=null){
                if(runner.value == findValue){
                    System.out.println("the value is in the node: # " + (counter+1));
                    counter +=1;
                    runner = runner.next;
                    return;
                } else {
                    counter +=1;
                    runner = runner.next;
                }
            }

            //the value is  not existed in the list
            System.out.println("the value is not in the node!!!");
            return;
        }
    }

    //Implement a removeAt(int) method that will remove the node after n nodes, where n is the parameter. For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.
    public void removeAt(int removeAtNodeNum){
        //edge case: the list is empty
        if(this.head == null){
            System.out.println("this list is empty");
            return;
        } else {
            Node runner = this.head;
            int counter = 1;
            while (counter != removeAtNodeNum){
                runner = runner.next;
                counter +=1;
            }
            int currentVal = runner.value;
            runner.next = runner.next.next;
            System.out.println("The node #" + removeAtNodeNum +"with the value " + currentVal+ " has been removed");
            return;
        }
    }

}
