package com.wzc.p14_observer.delegate;

/**
 * 抽象通知类
 * @author wzc
 * @date 2018/4/19
 */
public abstract class Subject {
    private EventHandler mEventHandler = new EventHandler();

    public abstract void addListener(Object o, String methodName, Object... args);

    public abstract void myNotify();

    public EventHandler getEventHandler() {
        return mEventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        mEventHandler = eventHandler;
    }
}
