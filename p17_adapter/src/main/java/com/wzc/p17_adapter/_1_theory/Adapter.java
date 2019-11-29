package com.wzc.p17_adapter._1_theory;

/**
 * @author wangzhichao
 * @date 2019/11/29
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
//        super.request();
        adaptee.specificRequest();
    }
}
