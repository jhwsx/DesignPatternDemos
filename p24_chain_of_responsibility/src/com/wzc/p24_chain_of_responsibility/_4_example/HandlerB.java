package com.wzc.p24_chain_of_responsibility._4_example;

/**
 * 把字符 b 替换为 * 的处理者
 *
 * @author wangzhichao
 * @since 2020/11/27
 */
public class HandlerB extends Handler {
    @Override
    String handleRequest(String msg) {
        if (msg.contains("b")) {
            msg = msg.replace('b', '*');
        } else if (successor != null) {
            msg = successor.handleRequest(msg);
        }
        return msg;
    }
}
