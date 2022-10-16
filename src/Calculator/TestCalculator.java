package Calculator;

import org.junit.Test;

public class TestCalculator extends Calculator {
    @Test
    public void testCalc(){
        this.calculatorTest(9,5,"+");
        this.calculatorTest(15.0D, 7.0D, "-");
        this.calculatorTest(23.0D, 16.0D, "/");
        this.calculatorTest(7.0D, 9.0D, "*");
    }
}
