package com.example.p11_lod._3_byfriendexample;


/**
 * @author wangzhichao
 * @date 2019/10/26
 */
public class Me {
    public void talkto(Friend friend) {
        System.out.println("我和" + friend.getName() + "说话");
    }

    public void talktoStrangerByFriend(Friend friend) {
        System.out.println("我通过");
        friend.talktoStranger();
    }
}

/**
 * 总结：
 */
