import java.util.ArrayList;

public class TestBasicJava {
    public static void main(String[] args) {
        BasicJava tester = new BasicJava();
        tester.oneToTwoFiveFive();
        System.out.println("-------------------------"+ "\n");
        System.out.println(tester.oddNumTo255());
        System.out.println("-------------------------"+ "\n");
        System.out.println(tester.SigmaOf255());
        System.out.println("-------------------------"+ "\n");
        int[] printOUtTestArray = {1, 3, 5, 7, 9, 13};
        tester.printOutElement(printOUtTestArray);
        System.out.println("-------------------------"+ "\n");
        int [] testArray = {-3, -5, -7};
        System.out.println(tester.findMax(testArray));
        System.out.println("-------------------------"+ "\n");
        tester.oddNumArr();
    }
}
