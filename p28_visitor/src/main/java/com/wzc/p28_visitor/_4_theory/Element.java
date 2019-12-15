package com.wzc.p28_visitor._4_theory;

/**
 * 抽象元素类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public abstract class Element {
    /**
     * 接受方法
     *
     * @param visitor 用来获取状态对象
     */
    public abstract void accept(Visitor visitor);
}
