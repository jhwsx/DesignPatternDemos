package com.example.p8_factory._1_factoryexample;

/**
 * @author wzc
 * @date 2018/12/26
 */
public class OperationPower extends Operation {
    @Override
    public double getResult() {
        return Math.pow(getNumberA(), getNumberB());
    }
}
