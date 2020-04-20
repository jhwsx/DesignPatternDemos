package com.wzc.p15_abstract_factory._4_theory;

/**
 * 创建 2 系列产品的工厂类
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
