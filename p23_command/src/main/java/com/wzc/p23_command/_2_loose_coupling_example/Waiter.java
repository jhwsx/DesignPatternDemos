package com.wzc.p23_command._2_loose_coupling_example;

/**
 * 服务员
 * <p>
 * 负责记录订单，然后通知“烤肉串者”执行即可
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public class Waiter {
    private Command command;

    public void setOrder(Command command) {
        this.command = command;
    }

    public void myNotify() {
        command.executeCommand();
    }
}
