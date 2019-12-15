package com.wzc.p28_visitor._4_theory;

/**
 * 具体访问者A
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class ConcreteVisitorA extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " 被 " + this.getClass().getSimpleName() + " 访问。");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + " 被 " + this.getClass().getSimpleName() + " 访问。");
    }
}
