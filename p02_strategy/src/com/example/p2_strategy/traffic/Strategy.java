package com.example.p2_strategy.traffic;

/**
 * @author wangzhichao
 * @since 7/9/20
 */
public interface Strategy {

    String name();

    double costTime(double distance);

    double costMoney();

}
