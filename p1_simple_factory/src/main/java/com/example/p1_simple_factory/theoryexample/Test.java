package com.example.p1_simple_factory.theoryexample;

/**
 * @author wzc
 * @date 2018/10/1
 */
public class Test {
    public static void main(String[] args) {
        Product product = Factory.createProduct("A");
        product.printName();
    }
}
