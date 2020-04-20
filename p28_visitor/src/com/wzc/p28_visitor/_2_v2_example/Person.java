package com.wzc.p28_visitor._2_v2_example;

/**
 * Person 类
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public abstract class Person {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public abstract void action();

    public abstract String getType();
}
