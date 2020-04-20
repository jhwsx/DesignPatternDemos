package com.wzc.p23_command._5_composite_command_pattern;

/**
 * 叶节点
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public class LeafCommand1 extends AbstractCommand {
    private Receiver receiver;

    public LeafCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
