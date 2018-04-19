package com.wzc.p14_observer.observer;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class StockObserver extends Observer {

    StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(mSubject.getAction() + ", " + mName + ", 关闭股票行情, 继续工作!");
    }
}
