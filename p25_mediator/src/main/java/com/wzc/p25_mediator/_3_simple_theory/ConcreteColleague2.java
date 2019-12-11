package com.wzc.p25_mediator._3_simple_theory;

/**
 * @author wangzhichao
 * @since 2019/12/11
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void send(String message) {
        SimpleMediator.getInstance().relay(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("同事 2 得到消息：" + message);
    }
}
