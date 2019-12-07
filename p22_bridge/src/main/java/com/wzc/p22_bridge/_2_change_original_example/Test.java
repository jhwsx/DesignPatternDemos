package com.wzc.p22_bridge._2_change_original_example;



/**
 * @author wangzhichao
 * @since 2019/12/07
 */
public class Test {
    public static void main(String[] args) {
        HandsetBrand hb;
        hb = new HandsetBrandMGame();
        hb.run();
        hb = new HandsetBrandMAddressList();
        hb.run();
        hb = new HandsetBrandMMp3();
        hb.run();

        hb = new HandsetBrandNGame();
        hb.run();
        hb = new HandsetBrandNAddressList();
        hb.run();
        hb = new HandsetBrandNMp3();
        hb.run();

        hb = new HandsetBrandSGame();
        hb.run();
        hb = new HandsetBrandSAddressList();
        hb.run();
        hb = new HandsetBrandSMp3();
        hb.run();
    }
}

/**
 * 总结：
 * 1，目前的写法在增加手机功能或者品牌时，都需要大幅改动。
 * 2，从品牌分的写法；
 * 3，增加一个功能要改动有几个品牌，就要增加几个类；增加一个品牌，有几个功能就要增加几个类。
 */
