package com.wzc.p14_observer._4_theoryexample;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知类
 * @author wangzhichao
 * @date 2019/11/03
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifai() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public abstract String getSubjectState();

    public abstract void setSubjectState(String subjectState);
}
