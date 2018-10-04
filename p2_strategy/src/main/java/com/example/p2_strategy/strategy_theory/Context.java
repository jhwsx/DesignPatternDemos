package com.example.p2_strategy.strategy_theory;

/**
 * Context, 用一个 ConcreteStrategy 来配置, 维护一个对 Strategy 对象的引用
 *
 * @author wzc
 * @date 2018/10/4
 */
public class Context {
    Strategy mStrategy;

    /**
     * 初始化时, 传入具体的策略对象
     * @param strategy
     */
    public Context(Strategy strategy) {
        mStrategy = strategy;
    }

    /**
     * 根据具体的策略对象, 调用其算法的方法
     */
    public void contextInterface() {
        mStrategy.algorithmInterface();
    }
}
