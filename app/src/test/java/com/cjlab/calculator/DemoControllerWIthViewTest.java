package com.cjlab.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Nitirat on 5/12/16.
 */
public class DemoControllerWIthViewTest {

    ////Spy Arrange
    private boolean isSuccess = false;

    @Test
    public void result_of_add_two_number_should_show_on_view() {

        //// Spy Arrange
//        CalculatorListener calculatorListener = new SpyCalculatorListener();
        //// Mock Arrange
        MockCalculatorListener calculatorListener = new MockCalculatorListener();
        CalculatorInterface calculator = new DummyCalculator();
        MainController mainController = new MainController();
        mainController.setListener(calculatorListener);
        mainController.setCalculator(calculator);
        mainController.add(2,1);

        //// Spy Assert
//        assertTrue(isSuccess);
        //// Mock Assert
        assertTrue(calculatorListener.verify());
    }

    class DummyCalculator implements CalculatorInterface
    {

        @Override
        public double add(double firstOperand, double secondOperand) {
            return 0;
        }

        @Override
        public double sub(double firstOperand, double secondOperand) {
            return 0;
        }

        @Override
        public double mul(double firstOperand, double secondOperand) {
            return 0;
        }

        @Override
        public double divide(double firstOperand, double secondOperand) {
            return 0;
        }
    }

    class SpyCalculatorListener implements CalculatorListener
    {
        @Override
        public void onSuccess(String result) {
            isSuccess = true;
        }
    }

    class MockCalculatorListener implements CalculatorListener
    {
        private boolean isCalled = false;
        @Override
        public void onSuccess(String result) {
            isCalled = true;
        }

        public boolean verify() {
            return isCalled;
        }

    }
}
