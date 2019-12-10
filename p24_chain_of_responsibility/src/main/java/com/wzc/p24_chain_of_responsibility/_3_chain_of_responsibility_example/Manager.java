package com.wzc.p24_chain_of_responsibility._3_chain_of_responsibility_example;

/**
 * 抽象管理者类
 * <p>
 * 处理请求的接口
 *
 * @author wangzhichao
 * @since 2019/12/10
 */
public abstract class Manager {
    protected Manager successor;

    /**
     * 设置继任者
     *
     * @param successor
     */
    public void setSuccessor(Manager successor) {
        this.successor = successor;
    }

    /**
     * 处理请求的抽象方法
     *
     * @param request
     */
    public abstract void handleRequest(Request request);
}
