package com.wzc.p23_command._3_v3_example;

/**
 * 烤鸡翅命令
 *
 * @author wangzhichao
 * @since 2019/12/08
 */
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }

    @Override
    public void cancelCommand() {
        receiver.unbakeChickenWing();
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
