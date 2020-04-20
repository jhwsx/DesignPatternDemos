package com.example.p6_decorator.coffeeexample;

/**
 * @author wzc
 * @date 2018/10/21
 */
public abstract class Decorator extends Coffee {
    protected Coffee mCoffee;

    /**
     * 通过组合的方式,把参数传递进来
     * Decorator 知道 Coffee, 但是 Coffee 不知道 Decorator
     * @param coffee
     */
    public Decorator(Coffee coffee) {
        mCoffee = coffee;
    }
}
