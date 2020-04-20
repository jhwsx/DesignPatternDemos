package com.wzc.p23_command._4_theory;

/**
 * @author wangzhichao
 * @since 2019/12/08
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);
        invoker.call();
    }
}
