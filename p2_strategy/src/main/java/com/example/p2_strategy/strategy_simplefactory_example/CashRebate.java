package com.example.p2_strategy.strategy_simplefactory_example;

/**
 * 打折
 *
 * @author wzc
 * @date 2018/10/4
 */
public class CashRebate extends CashSuper {

    private double mMoneyRebate = 1;

    public CashRebate(double moneyRebate) {
        mMoneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * mMoneyRebate;
    }
}
