package Calculator;

public class Calculator {
    public Calculator() {
    }

    public void calculatorTest(double num1, double num2, String operation) {
        if ("+".equals(operation)) {
            System.out.println("your answer is " + (num1 + num2));
        }

        if ("-".equals(operation)) {
            System.out.println("your answer is " + (num1 - num2));
        }

        if ("*".equals(operation)) {
            System.out.println("your answer is " + num1 * num2);
        }

        if ("/".equals(operation)) {
            System.out.println("your answer is " + num1 / num2);
        }

    }
}
