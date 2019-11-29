package com.wzc.p17_adapter._1_object_adapter._1_theory;

/**
 * Adapter 中持有一个被适配类对象的引用，因此叫做对象适配器
 *
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
