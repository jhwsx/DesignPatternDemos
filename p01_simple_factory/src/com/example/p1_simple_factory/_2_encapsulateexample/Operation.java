package com.example.p1_simple_factory._2_encapsulateexample;

/**
 * @author wzc
 * @date 2018/10/1
 */
public class Operation {
    public static double getResult(double numberA, double numberB, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }
        return result;
    }
}
