package com.wzc.p14_observer._5_delegate;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责管理事件队列的类
 * @author wzc
 * @date 2018/4/19
 */
public class EventHandler {
    private List<Event> mEventList;

    public EventHandler() {
        mEventList = new ArrayList<>();
    }

    public void addEvent(Object o, String methodName, Object... args) {
        mEventList.add(new Event(o, methodName, args));
    }

    public void myNotify() throws Exception {
        for (Event event : mEventList) {
            event.invoke();
        }
    }
}
