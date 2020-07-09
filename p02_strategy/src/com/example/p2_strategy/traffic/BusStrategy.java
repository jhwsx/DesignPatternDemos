package com.example.p2_strategy.traffic;

/**
 * @author wangzhichao
 * @since 7/9/20
 */
public class BusStrategy implements Strategy {
    private double speed = 40;

    @Override
    public String name() {
        return "搭公交车";
    }

    @Override
    public double costTime(double distance) {
        return distance / speed;
    }

    @Override
    public double costMoney() {
        return 5;
    }
}
