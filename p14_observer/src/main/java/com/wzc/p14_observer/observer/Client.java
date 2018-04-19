package com.wzc.p14_observer.observer;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class Client {
    public static void main(String[] args) {
        // 秘书
//        Subject subject = new Secretary();
        // 老板
        Subject subject = new Boss();
        // 同事
        Observer stocker1 = new StockObserver("stocker1", subject);
        Observer stocker2 = new StockObserver("stocker2", subject);
        Observer nbaObserver1 = new NBAObserver("nba1", subject);
        // 添加同事
        subject.attach(stocker1);
        subject.attach(stocker2);
        subject.attach(nbaObserver1);
        // 移除同事
        subject.detach(stocker1);

//        subject.setAction("老板回来了");
        subject.setAction("我胡汉三回来了");
        subject.myNotify();
    }
}
