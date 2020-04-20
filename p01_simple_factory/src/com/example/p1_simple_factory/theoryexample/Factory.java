package com.example.p1_simple_factory.theoryexample;

/**
 * @author wzc
 * @date 2018/10/1
 */
public class Factory {
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("非法的类型");
        }
    }
}
