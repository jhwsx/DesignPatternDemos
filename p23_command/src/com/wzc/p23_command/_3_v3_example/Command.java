package com.wzc.p23_command._3_v3_example;

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

    /**
     * 通过构造来接收接收者对象
     * 也可以在构造中接收一些用于执行命令的参数
     *
     * @param receiver 接收者对象
     */
    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     * 一般是空参
     *
     * 委托接收者来完成具体的工作
     */
    public abstract void executeCommand();

    /**
     * 取消命令
     * 一般是空参
     *
     * 委托接收者来完成具体的工作
     */
    public abstract void cancelCommand();

    /**
     * 获取价格
     * 这可不是命令模式必有的方法哦。
     *
     * @return 人民币
     */
    public abstract double getPrice();
}
