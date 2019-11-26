package com.wzc.p15_abstract_factory._4_theory;

/**
 * @author wangzhichao
 * @date 2019/11/26
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        printProduct(factory);
        // 切换工厂
        factory = new ConcreteFactory2();
        printProduct(factory);
    }

    private static void printProduct(AbstractFactory factory) {
        AbstractProductA productA = factory.createProductA();
        System.out.println(productA.getName());
        AbstractProductB productB = factory.createProductB();
        System.out.println(productB.getName());
    }
}
