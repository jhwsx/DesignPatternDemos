package com.wzc.p23_command._3_v3_example;

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
        xiaoer.setOrder("desk1", bakeMuttonCommand1);
        xiaoer.setOrder("desk1", bakeMuttonCommand2);
        xiaoer.setOrder("desk1", bakeMuttonCommand2);
        xiaoer.setOrder("desk1", bakeMuttonCommand2);
        xiaoer.setOrder("desk1", bakeChickenWingCommand);
        xiaoer.myNotify();

        // 烤羊肉串太多了，取消两串
        xiaoer.cancelOrder("desk1", bakeMuttonCommand2);
        xiaoer.cancelOrder("desk1", bakeMuttonCommand2);

        // 吃完了，结账
        xiaoer.bookOut("desk1");
    }
}
