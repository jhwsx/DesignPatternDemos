package com.wzc.p14_observer.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class StockObserver implements Observer {
    private String mName;

    public StockObserver(String name) {
        mName = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            String action = (String) arg;
            System.out.println(action + ", " + mName + ", 关闭股票行情, 继续工作!");
        }
    }
}
