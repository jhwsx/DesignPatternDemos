package com.example.p2_strategy.strategy_example;

/**
 * @author wzc
 * @date 2018/10/4
 */
public class CashContext {
    /**
     * 声明一个 CashSuper 对象
     */
    CashSuper mCashSuper;

    /**
     * 通过构造, 传入具体的收费策略
     *
     * @param cashSuper
     */
    public CashContext(CashSuper cashSuper) {
        mCashSuper = cashSuper;
    }

    public double getResult(double money) {

        return mCashSuper.acceptCash(money);
    }
}
