package com.wzc.p25_mediator._2_unsc_example;

/**
 * 伊拉克
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    public void declare(String message) {
        mediator.relay(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("伊拉克获得对方信息：" + message);
    }
}
