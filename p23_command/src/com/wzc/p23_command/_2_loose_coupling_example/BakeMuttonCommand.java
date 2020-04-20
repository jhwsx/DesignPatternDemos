package com.wzc.p23_command._2_loose_coupling_example;

/**
 * 烤羊肉串命令
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
