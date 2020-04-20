package com.wzc.p14_observer._2_v2example;

/**
 * 具体观察者，看股票的同事
 * @author wangzhichao
 * @date 2019/11/03
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Secrectary secrectary) {
        super(name, secrectary);
    }

    public void update() {
        System.out.println(secrectary.getAction() + ", " + name + " 关闭股票行情，继续工作！");
    }
}
