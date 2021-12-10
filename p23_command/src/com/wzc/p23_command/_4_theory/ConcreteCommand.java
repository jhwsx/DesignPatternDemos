package com.wzc.p23_command._4_theory;

/**
 * 具体命令角色类
 * <p>
 * 是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public class ConcreteCommand extends Command {
    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
