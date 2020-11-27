package com.wzc.p24_chain_of_responsibility._4_example;

/**
 * 把字符 c 替换为 * 的处理者
 *
 * @author wangzhichao
 * @since 2020/11/27
 */
public class HandlerC extends Handler {
    @Override
    String handleRequest(String msg) {
        if (msg.contains("c")) {
            msg = msg.replace('c', '*');
        } else if (successor != null) {
            msg = successor.handleRequest(msg);
        }
        return msg;
    }
}
