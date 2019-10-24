package com.example.p8_factory._1_factoryexample;


/**
 * @author wangzhichao
 * @date 2019/10/22
 */
public class OperationRemaind extends Operation {
    @Override
    public double getResult() {
        return getNumberA() % getNumberB();
    }
}
