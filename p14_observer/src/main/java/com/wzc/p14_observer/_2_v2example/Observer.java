package com.wzc.p14_observer._2_v2example;

/**
 * 抽象观察者
 *
 * @author wangzhichao
 * @date 2019/11/03
 */
public abstract class Observer {
    protected String name;
    protected Secrectary secrectary;

    public Observer(String name, Secrectary secrectary) {
        this.name = name;
        this.secrectary = secrectary;
    }

    public abstract void update();
}
