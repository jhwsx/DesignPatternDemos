package com.wzc.p14_observer._1_originalexample;

import java.util.ArrayList;
import java.util.List;

/**
 * 前台秘书类
 *
 * @author wangzhichao
 * @date 2019/11/03
 */
public class Secrectary {
    private List<StockObserver> observers = new ArrayList<>();
    private String action;
    public void attach(StockObserver observer) {
        observers.add(observer);
    }

    public void notifai() {
        for (StockObserver observer : observers) {
            observer.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
