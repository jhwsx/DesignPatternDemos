package com.wzc.p22_bridge._4_bridge_example;

/**
 * HandsetBrand 与 HandsetSoft 之间是聚合关系，手机品牌包含手机软件，但手机软件不是手机品牌的一部分。
 *
 * @author wangzhichao
 * @since 2019/12/07
 */
public abstract class HandsetBrand {
    protected HandsetSoft handsetSoft;

    public void setHandsetSoft(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    public abstract void run();
}
