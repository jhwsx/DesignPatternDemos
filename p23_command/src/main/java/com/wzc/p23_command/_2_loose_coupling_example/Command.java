package com.wzc.p23_command._2_loose_coupling_example;

/**
 * 抽象命令类
 * <p>
 * 只需要确定“烤肉串者”是谁
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    public abstract void executeCommand();
}
