package com.wzc.p22_bridge._3_change_original_example;

/**
 * @author wangzhichao
 * @since 2019/12/07
 */
public class Test {
    public static void main(String[] args) {
        HandsetSoft hs;
        hs = new HandsetSoftAddressListM();
        hs.run();
        hs = new HandsetSoftGameM();
        hs.run();
        hs = new HandsetSoftMp3M();
        hs.run();
        hs = new HandsetSoftAddressListN();
        hs.run();
        hs = new HandsetSoftGameN();
        hs.run();
        hs = new HandsetSoftMp3N();
        hs.run();
        hs = new HandsetSoftAddressListS();
        hs.run();
        hs = new HandsetSoftGameS();
        hs.run();
        hs = new HandsetSoftMp3S();
        hs.run();
    }
}

/**
 * 总结：
 * 1，从软件分，与从品牌分相比，没有多少不一样的地方。类的个数都是一样的。
 * 2，增加一个软件，有几个品牌，就要增加几个类；
 * 增加一个品牌，有几个软件，就要增加几个类。
 */
