public class Calculator {
    public static void main(String[] args) {
        public double setOperandO(double operand1){
            return operand1;
        }

        public char setOperation(char operateor){
            return operateor;
        }
        
        public double setOperandT(double operand2) {
            return operand2;
        }

        public double getResults(){
            if(operateor == "+"){
                double output = operand1 + operand2;
                return;
            } else {
                double output = operand1 - operand2;
                return;
            }
        }
        setOperandO(10.5);
        setOperandT(5.2);
        setOperation("+");
        getResults();
    }

}
