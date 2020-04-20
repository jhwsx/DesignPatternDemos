package com.wzc.p22_bridge._1_original_example;

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
        hb = new HandsetBrandNGame();
        hb.run();
        hb = new HandsetBrandNAddressList();
        hb.run();
    }
}

/**
 * 总结：
 * 1，目前的写法在增加手机功能或者品牌时，都需要大幅改动。
 */
