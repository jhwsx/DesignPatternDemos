package com.wzc.p28_visitor._3_visitor_example;

/**
 * 失败状态类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Failure extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + "失败时，闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + "失败时，眼泪汪汪，谁也劝不了。");
    }
}
