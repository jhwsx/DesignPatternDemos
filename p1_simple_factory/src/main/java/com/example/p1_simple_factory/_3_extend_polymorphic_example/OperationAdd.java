package com.example.p1_simple_factory._3_extend_polymorphic_example;

/**
 * @author wzc
 * @date 2018/10/1
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
