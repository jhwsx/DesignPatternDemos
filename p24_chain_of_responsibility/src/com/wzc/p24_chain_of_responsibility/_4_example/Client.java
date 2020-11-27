package com.wzc.p24_chain_of_responsibility._4_example;

/**
 * @author wangzhichao
 * @since 2020/11/27
 */
public class Client {
    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        System.out.println(handlerA.handleRequest("apple"));
        System.out.println(handlerA.handleRequest("bicycle"));
        System.out.println(handlerA.handleRequest("color"));
    }
}
