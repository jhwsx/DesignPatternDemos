package com.wzc.p28_visitor._3_visitor_example;

/**
 * 成功状态类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Success extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + "成功时，背后多半有一个伟大的女人。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + "成功时，背后大多有一个不成功的男人。");

    }
}
