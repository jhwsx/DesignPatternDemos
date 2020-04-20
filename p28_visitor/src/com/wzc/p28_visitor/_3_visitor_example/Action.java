package com.wzc.p28_visitor._3_visitor_example;

/**
 * 状态的抽象类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public abstract class Action {
    /**
     * 得到男人的反应或结论
     *
     * @param concreteElementA
     */
    public abstract void getManConclusion(Man concreteElementA);

    /**
     * 得到女人的反应或结论
     *
     * @param concreteElementB
     */
    public abstract void getWomanConclusion(Woman concreteElementB);
}
