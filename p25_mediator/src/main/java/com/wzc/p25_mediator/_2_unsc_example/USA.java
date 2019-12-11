package com.wzc.p25_mediator._2_unsc_example;

/**
 * 美国
 * <p>
 * 充当具体同事类
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    public void declare(String message) {
        mediator.relay(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("美国获得对方信息：" + message);
    }
}
