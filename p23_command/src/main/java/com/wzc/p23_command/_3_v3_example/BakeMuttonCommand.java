package com.wzc.p23_command._3_v3_example;

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

    @Override
    public void cancelCommand() {
        receiver.unbakeMutton();
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
