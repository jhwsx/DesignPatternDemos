package com.wzc.p14_observer.delegate;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class Secretary extends Subject {
    @Override
    public void addListener(Object o, String methodName, Object... args) {
        getEventHandler().addEvent(o, methodName, args);
    }

    @Override
    public void myNotify() {
        try {
            getEventHandler().myNotify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
