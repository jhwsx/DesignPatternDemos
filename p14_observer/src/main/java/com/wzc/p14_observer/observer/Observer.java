package com.wzc.p14_observer.observer;

/**
 * 抽象观察者
 * @author wzc
 * @date 2018/4/19
 */
public abstract class Observer {
     String mName;
    Subject mSubject;

    public Observer(String name, Subject subject) {
        mName = name;
        mSubject = subject;
    }

    public abstract void update();
}
