package com.example.p2_strategy.strategy_theory;

/**
 * @author wzc
 * @date 2018/10/4
 */
public class Test {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
