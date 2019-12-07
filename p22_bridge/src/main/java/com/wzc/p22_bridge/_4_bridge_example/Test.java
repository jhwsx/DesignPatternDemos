package com.wzc.p22_bridge._4_bridge_example;

/**
 * @author wangzhichao
 * @since 2019/12/07
 */
public class Test {
    public static void main(String[] args) {
        HandsetBrand hb;
        hb = new HandsetBrandM();
        hb.setHandsetSoft(new HandsetSoftAddressList());
        hb.run();
        hb.setHandsetSoft(new HandsetSoftGame());
        hb.run();
        hb.setHandsetSoft(new HandsetSoftMp3());
        hb.run();

        hb = new HandsetBrandN();
        hb.setHandsetSoft(new HandsetSoftAddressList());
        hb.run();
        hb.setHandsetSoft(new HandsetSoftGame());
        hb.run();
        hb.setHandsetSoft(new HandsetSoftMp3());
        hb.run();

        hb = new HandsetBrandS();
        hb.setHandsetSoft(new HandsetSoftAddressList());
        hb.run();
        hb.setHandsetSoft(new HandsetSoftGame());
        hb.run();
        hb.setHandsetSoft(new HandsetSoftMp3());
        hb.run();
    }
}

/**
 * 总结：
 * 1，使用了桥接模式
 * 2，增加一个功能，只需要增加一个类；
 * 3，增加一个品牌，只需要增加一个类。
 */

