package com.wzc.p14_observer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class Boss implements Subject{
    private List<Observer> mObservers = new ArrayList<>();
    private String mAction;
    @Override
    public void attach(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        mObservers.remove(observer);
    }

    @Override
    public void myNotify() {
        for (Observer observer : mObservers) {
            observer.update();
        }
    }

    @Override
    public String getAction() {
        return mAction;
    }

    @Override
    public void setAction(String action) {
        mAction = action;
    }
}
