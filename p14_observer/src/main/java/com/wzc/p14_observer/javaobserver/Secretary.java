package com.wzc.p14_observer.javaobserver;

import java.util.Observable;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class Secretary extends Observable {

    public void myNotify(String action) {
        setChanged();
        notifyObservers(action);
    }
}
