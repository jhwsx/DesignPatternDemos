package com.wzc.p25_mediator._3_simple_theory;

/**
 * 同事对象不持有中介者，而是在需要的时f矣直接获取中介者对象并调用。
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public abstract class Colleague {
    public abstract void send(String message);

    public abstract void receive(String message);
}
