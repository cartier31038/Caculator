package com.cjlab.calculator;

/**
 * Created by Nitirat on 5/11/16.
 */
public class Calculator implements CalculatorInterface {

    @Override
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    @Override
    public double sub(double firstOperand, double secondOperand) {
        //จะมีประเด็นเรื่อง data ไม่ครอบคลุม เช่นเขียน code ผิดเป็น firstOperand - firstOperand แต่ดันไม่ทดสอบข้อมูลแบบ 2-1 = 1 (ไม่ผ่าน) 1-1=0 (ดันผ่าน)
        return firstOperand - secondOperand;
    }

    @Override
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    @Override
    public double divide(double firstOperand, double secondOperand) {

        if (secondOperand == 0) {
            throw new DivideByZeroException();
        }

        return firstOperand / secondOperand;
    }

}
