package com.wzc.p25_mediator._1_theory;

/**
 * 具体同事类1
 * <p>
 * 每个具体同事都只知道自己的行为，而不了解其他同事类的情况，但它们都认识中介者对象。
 * 是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("同事 1 得到消息：" + message);
    }
}
