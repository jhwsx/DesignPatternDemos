package com.example.p2_strategy.traffic;

/**
 * @author wangzhichao
 * @since 7/9/20
 */
public class TaxiStrategy implements Strategy {
    private double speed = 50;

    @Override
    public String name() {
        return "打出租车";
    }

    @Override
    public double costTime(double distance) {
        return distance / speed;
    }

    @Override
    public double costMoney() {
        return 50;
    }
}
