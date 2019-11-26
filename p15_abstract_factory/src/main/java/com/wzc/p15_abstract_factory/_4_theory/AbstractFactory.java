package com.wzc.p15_abstract_factory._4_theory;

/**
 * 抽象工厂接口
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public interface AbstractFactory {
    AbstractProductA createProductA();

    AbstractProductB createProductB();

}
