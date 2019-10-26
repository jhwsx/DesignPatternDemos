package com.example.p11_lod._4_iocexample;

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
public class Me {
    public void talkto(Friend friend) {
        System.out.println("我和" + friend.getName() + "说话");
    }

    public void talkto(IStranger stranger) {
        System.out.println("我和" + stranger.getName() + "说话");
    }
}
