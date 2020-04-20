package com.wzc.p22_bridge._4_bridge_example;

/**
 * 手机品牌 M
 *
 * @author wangzhichao
 * @since 2019/12/07
 */
public class HandsetBrandM extends HandsetBrand {
    @Override
    public void run() {
        System.out.print("手机品牌 M ");
        handsetSoft.run();
    }
}
