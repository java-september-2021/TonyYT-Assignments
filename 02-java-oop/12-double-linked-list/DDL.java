import java.util.ArrayList;
public class DDL {

    public Node head;
    public Node tail;

    // constructor
    public DDL() {
        this.head = null;
        this.tail = null;
    }

    // method to add a new node value in the list
    public void push(int val) {
        // edge case: if the list is empty
        Node newNode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            // find the last node
            Node lastNode = this.tail;
            lastNode.next = newNode;
            newNode.previous = lastNode;
            this.tail = newNode;
        }
    }

    public void printValuesForward() {
        // edge the list is empty
        Node current = this.head;
        if (current == null) {
            System.out.println("the list is empty!");
        }
        // the list only has one value which is the head
        else if (current.next == null) {
            System.out.println("this list only has one value, which is " + current.val);
        }
        // the list only >1 value
        else {
            System.out.println("the values of the DDL backforwards are: ");
            while (current.next != null) {
                System.out.println(current.val);
                current = current.next;
            }
        }
    }

    // void printValuesBackward(): This method prints the values of the nodes from
    // the tail to the head.
    public void printValuesBackward() {
        Node current = this.tail;
        // edge case: the list is empty
        if (current == null) {
            System.out.println("the list is empty!!");
        }
        // edge case: the list only have one value
        else if (current.previous == null) {
            System.out.println(current.val);
        } else {
            while (current != null) {
                System.out.println(current.val);
                current = current.previous;
            }
        }
    }

    // Node pop(): This method removes the last node of our DLL and returns it.
    public Node pop() {
        // edge case: the list is empty
        Node newnode = new Node(0);
        if (this.head == null) {
            System.out.println("the list is empty!");
        }
        // edge case: this list only has one value
        else if (this.head.next == null) {
            System.out.println("this list only has one value, which is: " + this.head.val);
            newnode = this.head;
            this.head = null;
            this.tail = null;
        } else {
            // Node lastNode = this.tail.previous;
            // lastNode.next = null;
            // newnode = this.tail;
            newnode = this.tail;
            this.tail = this.tail.previous;
            this.tail.next = null;
        }
        return newnode;
    }

    // boolean contains(Integer value): This method returns a boolean whether the
    // value in the argument is in the list or not. Return true if the value exists,
    // else, return false.
    public boolean contains(int value) {
        // edge case: ths list is empty
        if (this.head == null) {
            System.out.println("NO, the list does not contains number " + value + ", because the list is empty!");
            return false;
        } else {
            Node current = this.head;
            while (current != null) {
                if (current.val == value) {
                    System.out.println("YES, the list contains number " + value);
                    return true;
                }
                current = current.next;
            }
            System.out.println("NO, the list does not contains number " + value);
            return false;
        }
    }

    // int size(): Returns the number of nodes in the list.
    public int size() {
        // edge case: the list is empty
        Node current = this.head;
        int count = 0;
        if (current == null) {
            System.out.println("the list is empty! Therefore the number of node in the list is: " + count);
            return count;
        } else {
            while (current.next != null) {
                count += 1;
                current = current.next;
            }
            System.out.println("this number of node in the list is: " + (count + 1));
            return (count + 1);
        }
    }

    // void insertAt(Node newNode, int index): Inserts a node at a specific index.
    // For example, let's say that we have 3 nodes in our list. If we call
    // insertAt(newNode, 1), the newNode should be inserted right after the head.
    // (head is index 0)
    public void insertAt(Node newNode, int index) {
        int count = 0;
        Node runner = this.head;
        // edge case: the list is empty
        if (runner == null) {
            System.out.println("the list is empty!");
        } else {
            while (runner != null) {
                if (count == index) {
                    newNode.previous = runner;
                    newNode.next = runner.next;
                    runner.next.previous = newNode;
                    runner.next = newNode;
                }
                runner = runner.next;
                count += 1;
            }
        }
    }

    // void removeAt(int index): This method removes a node at an index. For
    // example, let's say that we have 3 nodes in our list. If we call removeAt(1)
    // the middle node is removed. (head is index 0)
    public void removeAt(int index){
        Node newNode = new Node(index);
        Node runner = this.head;
        int count = 0;
        //edge case: the list is empty
        if(this.head == null){
            System.out.println("The list is empty, nothing to be removed!!");
        } else {
            while(runner != null){
                if(count == index){
                    newNode.previous = runner;
                    newNode.next = runner.next;
                    runner.next.previous = newNode;
                    runner.next = newNode;
                }
                count +=1;
                runner = runner.next;
            }
        }
    }
    // boolean isPalindrome(): This method returns a boolean whether the node is a
    // palindrome or not. Return true if it is a palindrome, else, return false.
    public boolean isPalindrome(){
        //edge case: if the list is empty
        Node runner = this.head;
        //int count = 0;

        if(this.head == null){
            System.out.println("the list is empty, there is no palindrome list here!!!");
            return false;
        } else {
            //generate a arraylist
            ArrayList<Integer> nodeList = new ArrayList<Integer>();
            //find out how many node in the list
            while(runner != null){
                nodeList.add(runner.val);
                runner = runner.next;
            }
            int headRunner = 0;
            int tailRunner = nodeList.size()-1;
            if(nodeList.size() %2 ==1){
                while(nodeList.get(headRunner) == nodeList.get(tailRunner) && headRunner< (nodeList.size()-1)/2){
                    headRunner +=1;
                    tailRunner -=1;
                }
                if(headRunner == tailRunner -2){
                    return true;
                } else {
                    return false;
                }
            } else if (nodeList.size() %2 ==0){
                while(nodeList.get(headRunner) == nodeList.get(tailRunner) && headRunner< (nodeList.size()/2)){
                    headRunner +=1;
                    tailRunner -=1;
                }
                if(headRunner == tailRunner -1){
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

}
