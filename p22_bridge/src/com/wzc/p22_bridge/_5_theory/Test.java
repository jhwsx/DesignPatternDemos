package com.wzc.p22_bridge._5_theory;

/**
 * @author wangzhichao
 * @since 2019/12/07
 */
public class Test {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
