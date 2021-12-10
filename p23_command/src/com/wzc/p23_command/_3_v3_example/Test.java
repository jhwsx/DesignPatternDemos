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
        Waiter waiter = new Waiter();

        // 开门营业，顾客上门
        waiter.setOrder("desk1", bakeMuttonCommand1);
        waiter.setOrder("desk1", bakeMuttonCommand2);
        waiter.setOrder("desk1", bakeChickenWingCommand);

        // 烤羊肉串太多了，取消一串
        waiter.cancelOrder("desk1", bakeMuttonCommand2);

        waiter.myNotify();

        // 吃完了，结账
        waiter.bookOut("desk1");
    }
}
