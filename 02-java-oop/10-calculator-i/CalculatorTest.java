public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setNum1(10.5);
        c.setNum2(5.2);
        c.setOper('+');
        c.performOper();
        c.getResult();

        Calculator c2 = new Calculator(10.5, 5.2, '-');
        c2.performOper();
        c2.getResult();

        Calculator c3 = new Calculator();
        c3.performOper(10.5, 5.2, '-');
        c3.getResult();
    }
}
