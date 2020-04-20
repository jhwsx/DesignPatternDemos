package com.wzc.p15_abstract_factory._4_theory;

/**
 * 创建 1 系列产品的工厂类
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
