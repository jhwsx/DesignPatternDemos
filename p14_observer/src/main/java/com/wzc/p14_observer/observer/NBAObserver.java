package com.wzc.p14_observer.observer;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(mSubject.getAction() + ", " + mName + ", 关闭NBA直播, 继续工作!");
    }
}
