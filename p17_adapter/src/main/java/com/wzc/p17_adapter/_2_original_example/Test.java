package com.wzc.p17_adapter._2_original_example;

/**
 * 此类相当于教练对球员做的技术安排
 *
 * @author wangzhichao
 * @date 2019/11/29
 */
public class Test {
    public static void main(String[] args) {
        Player b = new Forwards("James");
        b.attack();
        Player m = new Guards("Jordan");
        m.attack();
        Player ym = new Center("Yaoming");
        ym.attack();
        ym.defense();
    }
}

/*
Forwards James attack
Guards Jordan attack
Center Yaoming attack
Center Yaoming defense
*/

/**
 * 总结:
 * 1, 这个例子的问题在于姚明听不懂教练下达的英语安排.
 * 2, 姚明是外籍中锋, 需要有翻译者来适配.
 */