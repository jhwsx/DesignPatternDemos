package com.example.p2_strategy.traffic;

/**
 * @author wangzhichao
 * @since 7/9/20
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String getResult(double distance) {
        return strategy.name() + "花费时间(小时):" + strategy.costTime(distance) + ", 花费金钱(元):"+strategy.costMoney();
    }
}
