package com.wzc.p23_command._2_loose_coupling_example;

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
}
