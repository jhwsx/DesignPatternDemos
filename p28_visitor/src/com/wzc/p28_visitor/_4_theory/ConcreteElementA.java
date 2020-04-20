package com.wzc.p28_visitor._4_theory;

/**
 * 具体元素类A
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
