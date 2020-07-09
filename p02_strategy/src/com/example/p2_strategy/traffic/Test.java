package com.example.p2_strategy.traffic;

/**
 * @author wangzhichao
 * @since 7/9/20
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new BikeStrategy());
        System.out.println(context.getResult(100));

        context.setStrategy(new BusStrategy());
        System.out.println(context.getResult(100));

        context.setStrategy(new TaxiStrategy());
        System.out.println(context.getResult(100));
    }
}
