package com.cjlab.calculator;

import org.junit.Test;

/**
 * Created by Nitirat on 5/12/16.
 */
public class DemoTestDouble {

    @Test(expected = AddException.class)
    public void handle_excecption() {

        CalculatorListener dummyListener = new DummyCalculatorListener();
        CalculatorInterface stubCalculatorWithException = new StubCalculatorWithException();

        MainController mainController = new MainController();
        mainController.setListener(dummyListener);
        mainController.setCalculator(stubCalculatorWithException);
        mainController.add(2, 2);

    }

    class DummyCalculatorListener implements CalculatorListener
    {
        @Override
        public void onSuccess(String result) {

        }
    }

    class StubCalculatorWithException implements CalculatorInterface
    {
        @Override
        public double add(double firstOperand, double secondOperand) {
            throw new AddException();
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
}
