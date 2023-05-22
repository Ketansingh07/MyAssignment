package Assignment.Assignment.Lambda;

@FunctionalInterface
interface ArithmeticOperation {
    double performOperation(int num1, int num2);
}

public class LQ1 {
    public double addition(int num1, int num2) {
        ArithmeticOperation operation = (a, b) -> a + b;
        return operation.performOperation(num1, num2);
    }

    public double subtraction(int num1, int num2) {
        ArithmeticOperation operation = (a, b) -> a - b;
        return operation.performOperation(num1, num2);
    }

    public double multiplication(int num1, int num2) {
        ArithmeticOperation operation = (a, b) -> a * b;
        return operation.performOperation(num1, num2);
    }

    public double division(int num1, int num2) {
        ArithmeticOperation operation = (a, b) -> {
            if (b != 0) {
                return (double) a / b;
            } else {
                throw new ArithmeticException("Cannot divide by zero!");
            }
        };
        return operation.performOperation(num1, num2);
    }

    public static void main(String[] args) {
        LQ1 calculator = new LQ1();

        int num1 = 13;
        int num2 = 5;

        System.out.println(calculator.addition(num1, num2));
        System.out.println(calculator.subtraction(num1, num2));
        System.out.println(calculator.multiplication(num1, num2));
        System.out.println(calculator.division(num1, num2));
    }
}
