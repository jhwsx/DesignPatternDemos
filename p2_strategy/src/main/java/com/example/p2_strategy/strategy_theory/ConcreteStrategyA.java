package com.example.p2_strategy.strategy_theory;

/**
 * 具体算法A
 *
 * @author wzc
 * @date 2018/10/4
 */
public class ConcreteStrategyA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
}
