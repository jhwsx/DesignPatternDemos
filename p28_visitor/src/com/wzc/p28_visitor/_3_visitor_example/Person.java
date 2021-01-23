package com.wzc.p28_visitor._3_visitor_example;

/**
 * 人的抽象类
 *
 * 对应于 Element，抽象元素类
 * @author wangzhichao
 * @since 2019/12/15
 */
public abstract class Person {
    /**
     * 接受方法
     *
     * @param visitor 用来获取状态对象
     */
    public abstract void accept(Action visitor);

    public abstract String getType();
}
