package com.example.p8_factory._1_factoryexample;



/**
 * @author wzc
 * @date 2018/12/26
 */
public class PowerFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationPower();
    }
}
