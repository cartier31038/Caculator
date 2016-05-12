package com.cjlab.calculator;

/**
 * Created by Nitirat on 5/11/16.
 */
public class MainController {

    private Calculator calculator = new Calculator();
    private CalculatorListener listener;

    public MainController(CalculatorListener listener) {
        this.listener = listener;
    }

    public void add(double operand1, double operand2)
    {
        double result = calculator.add(operand1, operand2);
        onSuccess(result);
    }

    public void sub(double operand1, double operand2)
    {
        double result = calculator.sub(operand1, operand2);
        onSuccess(result);
    }

    public void mul(double operand1, double operand2)
    {
        double result = calculator.mul(operand1, operand2);
        onSuccess(result);
    }

    public void divide(double operand1, double operand2)
    {
        double result = calculator.divide(operand1, operand2);
        onSuccess(result);
    }

    private void onSuccess(double result)
    {
        listener.onSuccess(String.valueOf(result));
    }
}
