package com.example.p2_strategy.strategy_simplefactory_example;

/**
 * @author wzc
 * @date 2018/10/4
 */
public class CashContext {
    /**
     * 声明一个 CashSuper 对象
     */
    CashSuper mCashSuper;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                mCashSuper = new CashNormal();
                break;
            case "满300返100":
                mCashSuper = new CashReturn(300, 100);
                break;
            case "满200返50":
                mCashSuper = new CashReturn(200, 50);
                break;
            case "打八折":
                mCashSuper = new CashRebate(0.8);
                break;
            case "打七折":
                mCashSuper = new CashRebate(0.7);
                break;
            case "打五折":
                mCashSuper = new CashRebate(0.5);
                break;
            default:
                throw new IllegalArgumentException("非法的类型");
        }
    }

    public double getResult(double money) {

        return mCashSuper.acceptCash(money);
    }
}
