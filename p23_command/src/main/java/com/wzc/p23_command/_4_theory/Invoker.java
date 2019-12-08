package com.wzc.p23_command._4_theory;

/**
 * 调用者/请求者类
 * <p>
 * 是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
