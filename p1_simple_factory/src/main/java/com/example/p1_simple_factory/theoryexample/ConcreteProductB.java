package com.example.p1_simple_factory.theoryexample;

/**
 * @author wzc
 * @date 2018/10/1
 */
public class ConcreteProductB extends Product {
    private static final String TAG =ConcreteProductB .class.getSimpleName();
    @Override
    protected void printName() {
        System.out.println(TAG);
    }
}
