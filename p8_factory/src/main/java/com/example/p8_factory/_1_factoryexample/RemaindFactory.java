package com.example.p8_factory._1_factoryexample;

/**
 * @author wangzhichao
 * @date 2019/10/22
 */
public class RemaindFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationRemaind();
    }
}
