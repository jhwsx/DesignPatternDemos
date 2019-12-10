package com.wzc.p24_chain_of_responsibility._3_chain_of_responsibility_example;

/**
 * 经理
 *
 * @author wangzhichao
 * @since 2019/12/10
 */
public class CommonManager extends Manager {
    @Override
    public void handleRequest(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(request.getRequestContent() + " 数量 " + request.getNumber() + ", 被批准");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
