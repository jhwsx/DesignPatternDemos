package com.example.p8_factory._1_factoryexample;

/**
 * @author wzc
 * @date 2018/12/25
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
