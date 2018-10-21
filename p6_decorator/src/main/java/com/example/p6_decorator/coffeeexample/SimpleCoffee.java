package com.example.p6_decorator.coffeeexample;

/**
 * @author wzc
 * @date 2018/10/21
 */
public class SimpleCoffee extends Coffee {
    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public String getName() {
        return "coffee";
    }
}
