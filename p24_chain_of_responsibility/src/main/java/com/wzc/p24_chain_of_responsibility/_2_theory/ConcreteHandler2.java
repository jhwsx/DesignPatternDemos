package com.wzc.p24_chain_of_responsibility._2_theory;

/**
 * 具体处理者2
 *
 * 处理它所负责的请求，可访问它的后继者，如果可以处理该请求，就处理之，否则就将请求转发给它的后继者。
 *
 * @author wangzhichao
 * @since 2019/12/09
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("具体处理者 2 负责处理请求");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
