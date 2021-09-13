public class ListTester {
    //● Create a ListTester class like the above.
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.printValues();
        sll.remove();
        sll.remove();
        sll.printValues();
        sll.find(3);
        sll.find(5);
        sll.find(20);
        sll.removeAt(1);
        sll.removeAt(3);
    }
}
