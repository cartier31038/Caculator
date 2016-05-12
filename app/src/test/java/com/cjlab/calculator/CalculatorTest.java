package com.cjlab.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * Created by Nitirat on 5/11/16.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        //Arrange
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        //Arrange
        calculator = null;
    }

    @Test
    public void หนึ่งบวกหนึ่งเท่ากับสอง() {
        //Act
        double actualResult = calculator.add(1, 1);
        //Assert
        assertEquals(2.0, actualResult);//(expectedResult, actualResult)
    }

    /*    @Test
        public void หนึ่งลบหนึ่งเท่ากับศูนย์() {
            //Act
            double actualResult = calculator.sub(1, 1);
            //Assert
            assertEquals(0.0, actualResult);//(expectedResult, actualResult)
        }

        @Test
        public void สองลบหนึ่งเท่ากับหนึ่ง() {
            //Act
            double actualResult = calculator.sub(2, 1);
            //Assert
            assertEquals(1.0, actualResult);//(expectedResult, actualResult)
        }
    */

    @Test
    public void ลบ() {

        assertEquals(0.0, calculator.sub(1, 1));
        assertEquals(1.0, calculator.sub(2, 1));
        assertEquals(-1.0, calculator.sub(2, 3));
    }

    @Test
    public void สองคูณหนึ่งเท่ากับสอง() {
        //Act
        double actualResult = calculator.mul(2, 1);
        //Assert
        assertEquals(2.0, actualResult);
    }

    @Test
    public void สองหารสองเท่ากับหนึ่ง() {
        //Act
        double actualResult = calculator.divide(2, 2);
        //Assert
        assertEquals(1.0, actualResult);
    }

    @Test(expected = DivideByZeroException.class)
    public void สองหารศูนย์จะเกิดข้อผิดพลาด_DivideByZeroException() {
        //Act
        double actualResult = calculator.divide(2, 0);
    }

    //แบบไม่แนะนำ
    @Test
    public void สองหารศูนย์จะเกิดข้อผิดพลาด_DivideByZeroException_TryCatch() {
        //Act
        try {
            calculator.divide(2, 0);
            fail("No DivideByZeroException exception throw");
        } catch (DivideByZeroException e) {
        }
    }
}
