package com.wzc.p14_observer._1_originalexample;

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

        // 记下两个同事
        secrectary.attach(staff1);
        secrectary.attach(staff2);

        secrectary.setAction("老板回来了");

        secrectary.notifai();
    }
}

/**
 * 总结：
 * 1，这个版本的缺点是什么？
 * Secretary 类和 StockObserver 类相互耦合。这样如果需要增加新的观察者，比如NBAObserver，就不得不修改 Secretary 类。
 */
