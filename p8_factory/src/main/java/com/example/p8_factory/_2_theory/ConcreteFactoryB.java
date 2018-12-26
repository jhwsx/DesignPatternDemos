package com.example.p8_factory._2_theory;

/**
 * @author wzc
 * @date 2018/12/26
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
