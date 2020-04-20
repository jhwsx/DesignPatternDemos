package com.wzc.p28_visitor._4_theory;

/**
 * 抽象访问者
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public abstract class Visitor {
    /**
     * 访问具体元素A
     *
     * @param concreteElementA 具体元素A
     */
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    /**
     * 访问具体元素B
     *
     * @param concreteElementB 具体元素B
     */
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
