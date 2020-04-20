package com.wzc.p14_observer._3_v3example;

/**
 * 抽象观察者
 *
 * @author wangzhichao
 * @date 2019/11/03
 */
public abstract class Observer {
    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
