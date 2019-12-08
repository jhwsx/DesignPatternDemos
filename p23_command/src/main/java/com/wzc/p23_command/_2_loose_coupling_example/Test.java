package com.wzc.p23_command._2_loose_coupling_example;

/**
 * @author wangzhichao
 * @since 2019/12/08
 */
public class Test {
    public static void main(String[] args) {
        // 开业前的准备: 厨师，菜单，服务员
        Barbecuer chef = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(chef);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(chef);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(chef);
        Waiter xiaoer = new Waiter();

        // 开门营业，顾客上门
        xiaoer.setOrder(bakeMuttonCommand1);
        xiaoer.myNotify();
        xiaoer.setOrder(bakeMuttonCommand2);
        xiaoer.myNotify();
        xiaoer.setOrder(bakeChickenWingCommand);
        xiaoer.myNotify();
    }
}
