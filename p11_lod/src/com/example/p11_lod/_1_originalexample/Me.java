package com.example.p11_lod._1_originalexample;

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
public class Me {
    public void talkto(Friend friend) {
        System.out.println("我和"+friend.getName()+"说话");
    }

    public void talkto(Stranger stranger) {
        System.out.println("我和"+stranger.getName()+"说话");
    }
}
