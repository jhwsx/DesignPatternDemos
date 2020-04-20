package com.wzc.p28_visitor._4_theory;

/**
 * 具体元素类B
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
