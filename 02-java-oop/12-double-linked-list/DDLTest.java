public class DDLTest {
    public static void main(String[] args) {
        DDL emptyList = new DDL();
        emptyList.printValuesForward();
        emptyList.printValuesBackward();
        emptyList.pop();
        emptyList.contains(10);
        emptyList.size();
        System.out.println("---------------------------------\n");

        DDL onlyhead = new DDL();
        onlyhead.push(10);
        onlyhead.printValuesForward();
        onlyhead.printValuesBackward();
        onlyhead.contains(10);
        onlyhead.contains(20);
        onlyhead.size();
        onlyhead.pop();
        onlyhead.contains(10);
        onlyhead.contains(20);
        onlyhead.size();
        System.out.println("---------------------------------\n");

        DDL regularList = new DDL();
        regularList.push(10);
        regularList.push(20);
        regularList.push(30);
        regularList.push(40);
        regularList.printValuesForward();
        regularList.printValuesBackward();
        regularList.contains(10);
        regularList.contains(100);
        regularList.size();

        regularList.pop();
        regularList.printValuesBackward();
        regularList.contains(10);
        regularList.contains(40);
        regularList.size();
        System.out.println("---------------------------------\n");

        DDL InsertDDL = new DDL();
        InsertDDL.push(10);
        InsertDDL.push(20);
        InsertDDL.push(30);
        InsertDDL.push(40);
        InsertDDL.printValuesForward();
        InsertDDL.insertAt(Node(35), 2);
    }

}
