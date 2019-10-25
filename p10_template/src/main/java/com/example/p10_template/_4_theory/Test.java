package com.example.p10_template._4_theory;

/**
 * @author wangzhichao
 * @date 2019/10/25
 */
public class Test {
    public static void main(String[] args) {
        AbstractClass concreteClassA = new ConcreteClassA();
        concreteClassA.templateMethod();
        AbstractClass concreteClassB = new ConcreteClassB();
        concreteClassB.templateMethod();
    }
}
