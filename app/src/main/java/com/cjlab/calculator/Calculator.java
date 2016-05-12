package com.cjlab.calculator;

/**
 * Created by Nitirat on 5/11/16.
 */
public class Calculator {

    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double sub(double firstOperand, double secondOperand) {
        //จะมีประเด็นเรื่อง data ไม่ครอบคลุม เช่นเขียน code ผิดเป็น firstOperand - firstOperand แต่ดันไม่ทดสอบข้อมูลแบบ 2-1 = 1 (ไม่ผ่าน) 1-1=0 (ดันผ่าน)
        return firstOperand - secondOperand;
    }

    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double divide(double firstOperand, double secondOperand) {

        if (secondOperand == 0) {
            throw new DivideByZeroException();
        }

        return firstOperand / secondOperand;

//        double result = 0.0;
//        try {
//            result = firstOperand / secondOperand;
//        } catch (RuntimeException e) {
//            throw new DivideByZeroException();
//        }
//
//        return result;

    }

}
