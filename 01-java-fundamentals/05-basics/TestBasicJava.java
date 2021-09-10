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
        System.out.println("-------------------------"+ "\n");
        float [] testarrAverage = {2, 10,3};
        tester.arrAverage(testarrAverage);
        System.out.println("-------------------------"+ "\n");
        float[] testergreaterThanY = {1, 3, 5, 7};
        float Y = 3;
        System.out.println(tester.greaterThanY(testergreaterThanY, Y));
        System.out.println("-------------------------"+ "\n");
        int[] testerSquareArray = {1, 5, 10, -2};
        tester.squareArray(testerSquareArray);
        System.out.println("-------------------------"+ "\n");
        int[] testereliNegativeNum = {1, 5, 10, -2};
        tester.eliNegativeNum(testereliNegativeNum);
        System.out.println("-------------------------"+ "\n");
        //System.out.println(numbers());
        System.out.println("-------------------------"+ "\n");
        int[] testermaxMinAve = {1, 5, 10, -2};
        System.out.println(tester.maxMinAve(testermaxMinAve));
        System.out.println("-------------------------"+ "\n");
        int[] testershifting = {1, 5, 10, 7, -2};
        tester.shifting(testershifting);

    }
}
