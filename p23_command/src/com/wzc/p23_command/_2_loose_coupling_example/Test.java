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
        Waiter waiter = new Waiter();

        // 开门营业，顾客上门
        waiter.setOrder(bakeMuttonCommand1);
        waiter.myNotify();
        waiter.setOrder(bakeMuttonCommand2);
        waiter.myNotify();
        waiter.setOrder(bakeChickenWingCommand);
        waiter.myNotify();
    }
}

/**
 * 总结：
 * 1，用户点一个菜，服务员通知厨房去做一个，这不科学；
 * 2，对点菜请求的否决没有包含在内；
 * 3，没有日志记录，不方便后期统计；
 * 4，不能处理用户临时的取消点菜请求。
 */
