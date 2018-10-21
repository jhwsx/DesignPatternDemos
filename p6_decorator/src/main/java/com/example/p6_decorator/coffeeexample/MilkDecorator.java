package com.example.p6_decorator.coffeeexample;

/**
 * @author wzc
 * @date 2018/10/21
 */
public class MilkDecorator extends Decorator {
    /**
     * 通过组合的方式,把参数传递进来
     * Decorator 知道 Coffee, 但是 Coffee 不知道 Decorator
     *
     * @param coffee
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 10;
    }

    @Override
    public String getName() {
        return mCoffee.getName() + " add Milk";
    }
}
