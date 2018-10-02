package com.example.p1_simple_factory._3_extend_polymorphic_example;

/**
 * @author wzc
 * @date 2018/10/1
 */
public class OperationFactory {
    public static Operation createOperate(String operator) {
        Operation operation = null;
        switch (operator) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSubstract();
                break;
            case "*":
                operation = new OperationMultiply();
                break;
            case "/":
                operation = new OperationDivide();
                break;
            default:
                throw new IllegalArgumentException("非法的操作符");
        }
        return operation;
    }
}
