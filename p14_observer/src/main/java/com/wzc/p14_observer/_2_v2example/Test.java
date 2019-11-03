package com.wzc.p14_observer._2_v2example;

/**
 * @author wangzhichao
 * @date 2019/11/03
 */
public class Test {
    public static void main(String[] args) {
        // 前台秘书
        Secrectary secrectary = new Secrectary();

        // 两位上班看股票的同事
        StockObserver staff1 = new StockObserver("魏关姹", secrectary);
        StockObserver staff2 = new StockObserver("易管查", secrectary);
        NBAObserver staff3 = new NBAObserver("艾乔丹", secrectary);

        // 记下两个同事
        secrectary.attach(staff1);
        secrectary.attach(staff2);
        secrectary.attach(staff3);

        secrectary.setAction("老板回来了");

        secrectary.notifai();

    }
}

/*
 * 总结：
 * 1，这个版本的改动：
 * 根据依赖倒转原则：抽象不应该依赖于细节，细节应该依赖抽象。把观察者类抽象出一个 Observer 抽象类。
 * 让秘书类依赖于这个抽象类，而具体的观察者都是这个抽象类的实现。这样，就实现了 Secretary 类不再依赖
 * 于具体的观察者了。
 * 2, 这个版本的缺点：
 * 观察者和秘书类还存在耦合。
 */
