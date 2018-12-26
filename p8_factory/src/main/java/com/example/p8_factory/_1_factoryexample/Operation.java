package com.example.p8_factory._1_factoryexample;

/**
 * @author wzc
 * @date 2018/12/25
 */
public abstract class Operation {
    private double mNumberA;
    private double mNumberB;

    public double getNumberA() {
        return mNumberA;
    }

    public void setNumberA(double numberA) {
        mNumberA = numberA;
    }

    public double getNumberB() {
        return mNumberB;
    }

    public void setNumberB(double numberB) {
        mNumberB = numberB;
    }

    public abstract double getResult();
}
