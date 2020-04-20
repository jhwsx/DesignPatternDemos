package com.wzc.p14_observer._3_v3example;

import java.util.ArrayList;
import java.util.List;

/**
 * 前台秘书类，具体通知类
 *
 * @author wangzhichao
 * @date 2019/11/03
 */
public class Secretary implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String action;
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifai() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getSubjectState() {
        return action;
    }

    @Override
    public void setSubjectState(String state) {
        action = state;
    }
}
