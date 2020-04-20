package com.wzc.p17_adapter._2_class_adapter;


/**
 * @author wangzhichao
 * @date 2019/11/29
 */
public class Test {
    public static void main(String[] args) {
        Player b = new Forwards("James");
        b.attack();
        Player m = new Guards("Jordan");
        m.attack();
//        Player ym = new Center("Yaoming");
//        ym.attack();
//        ym.defense();

        IPlayer ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}

/**
 * 总结:
 * 1, 这是类适配器的例子.
 * 2, 在这个例子中: 我抽取了 IPlayer 接口, 原因是什么?
 * 在类适配器模式中, Adapter 需要继承被适配类, 并实现目标接口. 但是, 我们的目标接口是 Player 抽象类, Java 是
 * 不支持多继承的.
 */