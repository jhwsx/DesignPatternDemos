package com.wzc.p14_observer._5_delegate;

/**
 * https://www.jianshu.com/p/c067410d95ca
 * @author wzc
 * @date 2018/4/19
 */
public class Test {
    public static void main(String[] args) {
        // 通知者
        Subject subject = new Secretary();

        // 观察者
        StockObserver stockObserver = new StockObserver("zhangsan");
        NBAObserver nbaObserver = new NBAObserver("lisi");

        // 注册
        subject.addListener(stockObserver, "closeStockMarket", "老板来了" );
        subject.addListener(nbaObserver, "closeNBALive", "老板来了" );

        // 通知
        subject.myNotify();
    }
}
