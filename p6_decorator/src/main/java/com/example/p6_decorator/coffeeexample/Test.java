package com.example.p6_decorator.coffeeexample;

/**
 * @author wzc
 * @date 2018/10/21
 */
public class Test {

    private static Coffee sCoffee;

    public static void main(String[] args) {
        sCoffee = new SimpleCoffee();
        sCoffee = new MokaDecorator(sCoffee);
        sCoffee = new MilkDecorator(sCoffee);
        sCoffee = new SugarDecorator(sCoffee);
        sCoffee = new MilkFoamDecorator(sCoffee);
        System.out.println(sCoffee.getName()+"==>"+sCoffee.getPrice());
    }
}
