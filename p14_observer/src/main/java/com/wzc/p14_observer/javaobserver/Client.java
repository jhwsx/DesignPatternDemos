package com.wzc.p14_observer.javaobserver;

import java.util.Observer;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class Client {
    public static void main(String[] args) {
        // 通知者
        Secretary observable = new Secretary();

        // 观察者
        Observer observer1 = new StockObserver("John");
        Observer observer2 = new NBAObserver("Tom");

        // 注册
        observable.addObserver(observer1);
        observable.addObserver(observer2);

        // 通知
        observable.myNotify("The boss is coming");
    }
}
