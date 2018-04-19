package com.wzc.p14_observer.observer;

/**
 * 抽象通知者
 * @author wzc
 * @date 2018/4/19
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void myNotify();

    String getAction();

    void setAction(String action);
}
