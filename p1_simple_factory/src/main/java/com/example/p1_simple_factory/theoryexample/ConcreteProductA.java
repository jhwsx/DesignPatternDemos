package com.example.p1_simple_factory.theoryexample;

/**
 * @author wzc
 * @date 2018/10/1
 */
public class ConcreteProductA extends Product {
    private static final String TAG = ConcreteProductA.class.getSimpleName();
    @Override
    protected void printName() {
        System.out.println(TAG);
    }
}
