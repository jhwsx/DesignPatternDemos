package com.example.p2_strategy.traffic;

/**
 * @author wangzhichao
 * @since 7/9/20
 */
public class BikeStrategy implements Strategy {
    private double speed = 10;

    @Override
    public String name() {
        return "骑自行车";
    }

    @Override
    public double costTime(double distance) {
        return distance / speed;
    }

    @Override
    public double costMoney() {
        return 0;
    }
}
