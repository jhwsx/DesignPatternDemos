package com.example.p8_factory._1_factoryexample;

/**
 * @author wzc
 * @date 2018/12/25
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
