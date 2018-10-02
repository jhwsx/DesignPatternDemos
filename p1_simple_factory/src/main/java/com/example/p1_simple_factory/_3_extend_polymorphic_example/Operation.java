package com.example.p1_simple_factory._3_extend_polymorphic_example;

/**
 * @author wzc
 * @date 2018/10/1
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
