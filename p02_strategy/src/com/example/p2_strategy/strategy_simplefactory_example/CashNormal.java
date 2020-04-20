package com.example.p2_strategy.strategy_simplefactory_example;

/**
 * 正常方式
 * @author wzc
 * @date 2018/10/4
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
