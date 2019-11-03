package com.wzc.p14_observer._3_v3example;

/**
 * @author wangzhichao
 * @date 2019/11/03
 */
public class StockObserver extends Observer {
    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getSubjectState() + ", " + name + " 关闭股票行情，继续工作！");
    }
}
