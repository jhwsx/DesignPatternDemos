package com.example.p2_strategy.simplefactory_example;

/**
 * @author wzc
 * @date 2018/10/4
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        switch (type) {
            case "正常收费":
                return new CashNormal();
            case "打八折":
                return new CashRebate(0.8);
            case "打七折":
                return new CashRebate(0.7);
            case "打五折":
                return new CashRebate(0.5);
            case "满300返100":
                return new CashReturn(300,100);
            case "满200返50":
                return new CashReturn(200,50);
            default:
                throw new IllegalArgumentException("类型不存在");
        }
    }
}
