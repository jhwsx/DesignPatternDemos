package com.wzc.p23_command._5_composite_command_pattern;

/**
 * 实现者/接收者
 *
 * 执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public class Receiver {
    public void action() {
        System.out.println("执行请求!");
    }
}
