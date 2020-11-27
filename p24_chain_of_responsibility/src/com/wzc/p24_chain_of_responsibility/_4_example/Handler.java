package com.wzc.p24_chain_of_responsibility._4_example;

/**
 * 抽象处理类
 *
 * @author wangzhichao
 * @since 2020/11/27
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract String handleRequest(String msg);
}
