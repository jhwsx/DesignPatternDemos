package com.wzc.p28_visitor._3_visitor_example;

/**
 * 结婚状态类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Marriage extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + "结婚时，感慨道：恋爱游戏终结时，‘有妻徒刑’遥无期。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + "结婚时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安。");
    }
}
