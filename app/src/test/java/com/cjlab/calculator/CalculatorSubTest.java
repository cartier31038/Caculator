package com.cjlab.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nitirat on 5/11/16.
 */
@RunWith(Parameterized.class)
public class CalculatorSubTest {

    private double operand1;
    private double operand2;
    private double expectedResult;

    @Test
    public void sub() {
        Calculator calculator = new Calculator();
        String message = "Msg: " + this.operand1 + " - " + this.operand2;
        assertEquals(message, this.expectedResult, calculator.sub(this.operand1, this.operand2));
    }

    public CalculatorSubTest(double operand1, double operand2, double expectedResult) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1, 2, -1.0},
            {2, 1, 1.0},
            {8, 2, 6.0},
            {-1, 6, -7.0},
        });
    }
}
