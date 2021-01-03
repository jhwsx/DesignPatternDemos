package com.example.p8_factory._2_theory;

/**
 * @author wzc
 * @date 2018/12/26
 */
public class Test {
    public static void main(String[] args) {
        // product A
        ConcreteFactoryA concreteFactoryA = new ConcreteFactoryA();
        Product concreteProductA = concreteFactoryA.createProduct();
        System.out.println(concreteProductA.printName());
        // product B
        ConcreteFactoryB concreteFactoryB = new ConcreteFactoryB();
        Product concreteProductB = concreteFactoryB.createProduct();
        System.out.println(concreteProductB.printName());
    }
}
