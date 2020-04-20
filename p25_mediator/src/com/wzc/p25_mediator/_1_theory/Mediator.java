package com.wzc.p25_mediator._1_theory;

/**
 * 抽象中介者类
 * <p>
 * 它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 *
 * @author wangzhichao
 * @since 2019/12/11
 */
public abstract class Mediator {
    /**
     * 注册具体同事的接口
     *
     * @param colleague
     */
    protected abstract void register(Colleague colleague);

    /**
     * 定义了一个抽象的发送消息方法，得到同事对象和发送消息
     *
     * @param message   发送消息
     * @param colleague 同事对象
     */
    public abstract void send(String message, Colleague colleague);
}
