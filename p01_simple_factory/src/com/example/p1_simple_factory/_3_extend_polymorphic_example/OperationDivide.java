package com.example.p1_simple_factory._3_extend_polymorphic_example;

/**
 * @author wzc
 * @date 2018/10/1
 */
public class OperationDivide extends Operation {
    @Override
    public double getResult() {
        if (getNumberB() == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }
        return getNumberA() / getNumberB();
    }
}
