package com.wzc.p14_observer._3_v3example;

/**
 * @author wangzhichao
 * @date 2019/11/03
 */
public class Test {
    public static void main(String[] args) {
        // 前台秘书
        Subject secretary = new Secretary();

        // 两位上班看股票的同事
        StockObserver staff1 = new StockObserver("魏关姹", secretary);
        StockObserver staff2 = new StockObserver("易管查", secretary);
        NBAObserver staff3 = new NBAObserver("艾乔丹", secretary);

        secretary.attach(staff1);
        secretary.attach(staff2);
        secretary.attach(staff3);

        // 艾乔丹和前台秘书发生了矛盾
        secretary.detach(staff3); // 前台秘书不再搭理他了。
        // 所以，就等着老板来抓吧。
        Subject boss = new Boss();
        staff3.setSubject(boss);
        boss.attach(staff3);

        // 老板回来了
        secretary.setSubjectState("老板回来了");
        boss.setSubjectState("我胡汉三回来了");

        secretary.notifai();
        boss.notifai();
    }
}
