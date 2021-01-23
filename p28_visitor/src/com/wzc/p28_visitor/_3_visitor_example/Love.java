package com.wzc.p28_visitor._3_visitor_example;

/**
 * 恋爱状态类
 * <p>
 * 具体的访问者
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Love extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + "恋爱时，凡事不懂也要装懂。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + "恋爱时，凡事懂也装作不懂。");
    }
}
