package com.wzc.p14_observer.delegate;

/**
 * @author wzc
 * @date 2018/4/19
 */
public class StockObserver {
    private String mName;

    public StockObserver(String name) {
        mName = name;
    }

    public void closeStockMarket(String action) {
        System.out.println(action + ", " + mName + ", 关闭股票行情, 继续工作!");
    }
}
