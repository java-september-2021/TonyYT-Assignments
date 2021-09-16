
public class Calculator {
    private double num1;
    private double num2;
    private double result;
    private char operator;

    // constructor
    public Calculator() {
    }

    public Calculator(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    // getter
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public char getOper() {
        return operator;
    }

    // setter
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOper(char operator) {
        this.operator = operator;
    }

    public void performOper() {
        if (this.operator == '+') {
            result = num1 + num2;
        } else if (this.operator == '-') {
            result = num1 - num2;
        }
    }

    public void performOper(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
        if (this.operator == '+') {
            result = num1 + num2;
        } else if (this.operator == '-') {
            result = num1 - num2;
        }
    }

    public void getResult() {
        System.out.println("the result of " + num1 + " " + operator + " " + num2 + " = " + result);
    }
}
