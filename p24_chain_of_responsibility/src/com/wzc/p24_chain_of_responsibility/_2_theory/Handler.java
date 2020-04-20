package com.wzc.p24_chain_of_responsibility._2_theory;

/**
 * 处理请示的接口
 *
 * @author wangzhichao
 * @since 2019/12/09
 */
public abstract class Handler {
    protected Handler successor;

    /**
     * 设置继任者
     *
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求的抽象方法
     *
     * @param request
     */
    public abstract void handleRequest(int request);
}
