package com.wzc.p17_adapter._1_object_adapter._2_adapter_example;

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
//        Player ym = new Center("Yaoming");
//        ym.attack();
//        ym.defense();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
// 适配前
/*
Forwards James attack
Guards Jordan attack
Center Yaoming attack
Center Yaoming defense
*/
// 适配后
/*
Forwards James attack
Guards Jordan attack
中锋 姚明 进攻
中锋 姚明 防守
*/
/**
 * 总结:
 * 1, 使用了对象适配器的例子
 */