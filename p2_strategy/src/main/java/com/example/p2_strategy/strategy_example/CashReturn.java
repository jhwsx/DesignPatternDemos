package com.example.p2_strategy.strategy_example;

/**
 * 满返类
 * @author wzc
 * @date 2018/10/4
 */
public class CashReturn extends CashSuper {
    private double mMoneyCondition;
    private double mMoneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        mMoneyCondition = moneyCondition;
        mMoneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= mMoneyCondition) {
            return money - Math.floor(money / mMoneyCondition) * mMoneyReturn;
        }
        return money;
    }
}
