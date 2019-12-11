package com.wzc.p25_mediator._1_theory;

/**
 * 抽象同事类
 * <p>
 * 它聚合了 {@link Mediator}
 * 定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
